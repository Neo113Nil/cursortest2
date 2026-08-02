package com.yandex.mapkit.transport.masstransit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.navigation.JamSegment;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Taxi implements Serializable {
    private List<JamSegment> jamSegments;
    private boolean jamSegments__is_initialized;
    private NativeObject nativeObject;

    public Taxi() {
        this.jamSegments__is_initialized = false;
    }

    private native List<JamSegment> getJamSegments__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Taxi";
    }

    private native NativeObject init(List<JamSegment> list);

    @NonNull
    public synchronized List<JamSegment> getJamSegments() {
        try {
            if (!this.jamSegments__is_initialized) {
                this.jamSegments = getJamSegments__Native();
                this.jamSegments__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.jamSegments;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(JamSegment.class, archive, getJamSegments(), false);
            return;
        }
        List<JamSegment> d11 = G.d(JamSegment.class, archive, this.jamSegments, false);
        this.jamSegments = d11;
        this.jamSegments__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public Taxi(@NonNull List<JamSegment> list) {
        this.jamSegments__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.jamSegments = list;
            this.jamSegments__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"jamSegments\" cannot be null");
    }

    private Taxi(NativeObject nativeObject) {
        this.jamSegments__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
