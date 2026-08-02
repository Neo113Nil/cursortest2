package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ToponymObjectMetadata implements BaseMetadata, Serializable {
    private Address address;
    private boolean address__is_initialized;
    private Point balloonPoint;
    private boolean balloonPoint__is_initialized;
    private String formerName;
    private boolean formerName__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f60744id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;
    private Precision precision;
    private boolean precision__is_initialized;

    public ToponymObjectMetadata() {
        this.address__is_initialized = false;
        this.precision__is_initialized = false;
        this.formerName__is_initialized = false;
        this.balloonPoint__is_initialized = false;
        this.id__is_initialized = false;
    }

    private native Address getAddress__Native();

    private native Point getBalloonPoint__Native();

    private native String getFormerName__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::ToponymObjectMetadata";
    }

    private native Precision getPrecision__Native();

    private native NativeObject init(Address address, Precision precision, String str, Point point, String str2);

    @NonNull
    public synchronized Address getAddress() {
        try {
            if (!this.address__is_initialized) {
                this.address = getAddress__Native();
                this.address__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.address;
    }

    @NonNull
    public synchronized Point getBalloonPoint() {
        try {
            if (!this.balloonPoint__is_initialized) {
                this.balloonPoint = getBalloonPoint__Native();
                this.balloonPoint__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.balloonPoint;
    }

    public synchronized String getFormerName() {
        try {
            if (!this.formerName__is_initialized) {
                this.formerName = getFormerName__Native();
                this.formerName__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.formerName;
    }

    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f60744id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60744id;
    }

    public synchronized Precision getPrecision() {
        try {
            if (!this.precision__is_initialized) {
                this.precision = getPrecision__Native();
                this.precision__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.precision;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAddress(), false, (Class<Archive>) Address.class);
            archive.add((Archive) getPrecision(), true, (Class<Archive>) Precision.class);
            archive.add(getFormerName(), true);
            archive.add((Archive) getBalloonPoint(), false, (Class<Archive>) Point.class);
            archive.add(getId(), true);
            return;
        }
        this.address = (Address) archive.add((Archive) this.address, false, (Class<Archive>) Address.class);
        this.address__is_initialized = true;
        this.precision = (Precision) archive.add((Archive) this.precision, true, (Class<Archive>) Precision.class);
        this.precision__is_initialized = true;
        this.formerName = archive.add(this.formerName, true);
        this.formerName__is_initialized = true;
        this.balloonPoint = (Point) archive.add((Archive) this.balloonPoint, false, (Class<Archive>) Point.class);
        this.balloonPoint__is_initialized = true;
        String add = archive.add(this.f60744id, true);
        this.f60744id = add;
        this.id__is_initialized = true;
        this.nativeObject = init(this.address, this.precision, this.formerName, this.balloonPoint, add);
    }

    public ToponymObjectMetadata(@NonNull Address address, Precision precision, String str, @NonNull Point point, String str2) {
        this.address__is_initialized = false;
        this.precision__is_initialized = false;
        this.formerName__is_initialized = false;
        this.balloonPoint__is_initialized = false;
        this.id__is_initialized = false;
        if (address == null) {
            throw new IllegalArgumentException("Required field \"address\" cannot be null");
        }
        if (point != null) {
            this.nativeObject = init(address, precision, str, point, str2);
            this.address = address;
            this.address__is_initialized = true;
            this.precision = precision;
            this.precision__is_initialized = true;
            this.formerName = str;
            this.formerName__is_initialized = true;
            this.balloonPoint = point;
            this.balloonPoint__is_initialized = true;
            this.f60744id = str2;
            this.id__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"balloonPoint\" cannot be null");
    }

    private ToponymObjectMetadata(NativeObject nativeObject) {
        this.address__is_initialized = false;
        this.precision__is_initialized = false;
        this.formerName__is_initialized = false;
        this.balloonPoint__is_initialized = false;
        this.id__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
