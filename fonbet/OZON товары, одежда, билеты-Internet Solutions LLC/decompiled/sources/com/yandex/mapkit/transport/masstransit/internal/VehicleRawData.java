package com.yandex.mapkit.transport.masstransit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class VehicleRawData implements BaseMetadata, Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f60750id;
    private boolean id__is_initialized;
    private Line line;
    private boolean line__is_initialized;
    private NativeObject nativeObject;
    private String threadId;
    private boolean threadId__is_initialized;

    public VehicleRawData() {
        this.id__is_initialized = false;
        this.threadId__is_initialized = false;
        this.line__is_initialized = false;
    }

    private native String getId__Native();

    private native Line getLine__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::internal::VehicleRawData";
    }

    private native String getThreadId__Native();

    private native NativeObject init(String str, String str2, Line line);

    @NonNull
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f60750id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60750id;
    }

    @NonNull
    public synchronized Line getLine() {
        try {
            if (!this.line__is_initialized) {
                this.line = getLine__Native();
                this.line__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.line;
    }

    @NonNull
    public synchronized String getThreadId() {
        try {
            if (!this.threadId__is_initialized) {
                this.threadId = getThreadId__Native();
                this.threadId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.threadId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getThreadId(), false);
            archive.add((Archive) getLine(), false, (Class<Archive>) Line.class);
            return;
        }
        this.f60750id = archive.add(this.f60750id, false);
        this.id__is_initialized = true;
        this.threadId = archive.add(this.threadId, false);
        this.threadId__is_initialized = true;
        Line line = (Line) archive.add((Archive) this.line, false, (Class<Archive>) Line.class);
        this.line = line;
        this.line__is_initialized = true;
        this.nativeObject = init(this.f60750id, this.threadId, line);
    }

    public VehicleRawData(@NonNull String str, @NonNull String str2, @NonNull Line line) {
        this.id__is_initialized = false;
        this.threadId__is_initialized = false;
        this.line__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"threadId\" cannot be null");
        }
        if (line != null) {
            this.nativeObject = init(str, str2, line);
            this.f60750id = str;
            this.id__is_initialized = true;
            this.threadId = str2;
            this.threadId__is_initialized = true;
            this.line = line;
            this.line__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"line\" cannot be null");
    }

    private VehicleRawData(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.threadId__is_initialized = false;
        this.line__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
