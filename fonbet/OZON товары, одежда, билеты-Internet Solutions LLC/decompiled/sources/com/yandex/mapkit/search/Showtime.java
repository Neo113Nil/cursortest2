package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.Money;
import com.yandex.mapkit.Time;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Showtime implements Serializable {
    private NativeObject nativeObject;
    private Money price;
    private boolean price__is_initialized;
    private Time startTime;
    private boolean startTime__is_initialized;
    private String ticketId;
    private boolean ticketId__is_initialized;

    public Showtime() {
        this.startTime__is_initialized = false;
        this.price__is_initialized = false;
        this.ticketId__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Showtime";
    }

    private native Money getPrice__Native();

    private native Time getStartTime__Native();

    private native String getTicketId__Native();

    private native NativeObject init(Time time, Money money, String str);

    public synchronized Money getPrice() {
        try {
            if (!this.price__is_initialized) {
                this.price = getPrice__Native();
                this.price__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.price;
    }

    @NonNull
    public synchronized Time getStartTime() {
        try {
            if (!this.startTime__is_initialized) {
                this.startTime = getStartTime__Native();
                this.startTime__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.startTime;
    }

    public synchronized String getTicketId() {
        try {
            if (!this.ticketId__is_initialized) {
                this.ticketId = getTicketId__Native();
                this.ticketId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.ticketId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getStartTime(), false, (Class<Archive>) Time.class);
            archive.add((Archive) getPrice(), true, (Class<Archive>) Money.class);
            archive.add(getTicketId(), true);
            return;
        }
        this.startTime = (Time) archive.add((Archive) this.startTime, false, (Class<Archive>) Time.class);
        this.startTime__is_initialized = true;
        this.price = (Money) archive.add((Archive) this.price, true, (Class<Archive>) Money.class);
        this.price__is_initialized = true;
        String add = archive.add(this.ticketId, true);
        this.ticketId = add;
        this.ticketId__is_initialized = true;
        this.nativeObject = init(this.startTime, this.price, add);
    }

    public Showtime(@NonNull Time time, Money money, String str) {
        this.startTime__is_initialized = false;
        this.price__is_initialized = false;
        this.ticketId__is_initialized = false;
        if (time != null) {
            this.nativeObject = init(time, money, str);
            this.startTime = time;
            this.startTime__is_initialized = true;
            this.price = money;
            this.price__is_initialized = true;
            this.ticketId = str;
            this.ticketId__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"startTime\" cannot be null");
    }

    private Showtime(NativeObject nativeObject) {
        this.startTime__is_initialized = false;
        this.price__is_initialized = false;
        this.ticketId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
