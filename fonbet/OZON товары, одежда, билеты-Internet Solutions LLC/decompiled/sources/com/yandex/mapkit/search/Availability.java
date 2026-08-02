package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Availability implements Serializable {
    private int days;
    private boolean days__is_initialized;
    private NativeObject nativeObject;
    private List<TimeRange> timeRanges;
    private boolean timeRanges__is_initialized;

    public Availability() {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
    }

    private native int getDays__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Availability";
    }

    private native List<TimeRange> getTimeRanges__Native();

    private native NativeObject init(int i11, List<TimeRange> list);

    public synchronized int getDays() {
        try {
            if (!this.days__is_initialized) {
                this.days = getDays__Native();
                this.days__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.days;
    }

    @NonNull
    public synchronized List<TimeRange> getTimeRanges() {
        try {
            if (!this.timeRanges__is_initialized) {
                this.timeRanges = getTimeRanges__Native();
                this.timeRanges__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.timeRanges;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(Integer.valueOf(getDays()), false);
            C2616s.f(TimeRange.class, archive, getTimeRanges(), false);
            return;
        }
        this.days = archive.add(Integer.valueOf(this.days), false).intValue();
        this.days__is_initialized = true;
        List<TimeRange> d11 = G.d(TimeRange.class, archive, this.timeRanges, false);
        this.timeRanges = d11;
        this.timeRanges__is_initialized = true;
        this.nativeObject = init(this.days, d11);
    }

    public Availability(int i11, @NonNull List<TimeRange> list) {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(i11, list);
            this.days = i11;
            this.days__is_initialized = true;
            this.timeRanges = list;
            this.timeRanges__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"timeRanges\" cannot be null");
    }

    private Availability(NativeObject nativeObject) {
        this.days__is_initialized = false;
        this.timeRanges__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
