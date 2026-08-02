package com.yandex.mapkit.transport.masstransit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class BoardingOptions implements Serializable {
    private List<BoardingArea> area;
    private boolean area__is_initialized;
    private NativeObject nativeObject;

    public BoardingOptions() {
        this.area__is_initialized = false;
    }

    private native List<BoardingArea> getArea__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::BoardingOptions";
    }

    private native NativeObject init(List<BoardingArea> list);

    @NonNull
    public synchronized List<BoardingArea> getArea() {
        try {
            if (!this.area__is_initialized) {
                this.area = getArea__Native();
                this.area__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.area;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(BoardingArea.class, archive, getArea(), false);
            return;
        }
        List<BoardingArea> d11 = G.d(BoardingArea.class, archive, this.area, false);
        this.area = d11;
        this.area__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public static class BoardingArea implements Serializable {

        /* renamed from: id, reason: collision with root package name */
        private String f60745id;
        private boolean id__is_initialized;
        private NativeObject nativeObject;

        public BoardingArea() {
            this.id__is_initialized = false;
        }

        private native String getId__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::transport::masstransit::BoardingOptions::BoardingArea";
        }

        private native NativeObject init(String str);

        public synchronized String getId() {
            try {
                if (!this.id__is_initialized) {
                    this.f60745id = getId__Native();
                    this.id__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f60745id;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), true);
                return;
            }
            String add = archive.add(this.f60745id, true);
            this.f60745id = add;
            this.id__is_initialized = true;
            this.nativeObject = init(add);
        }

        public BoardingArea(String str) {
            this.id__is_initialized = false;
            this.nativeObject = init(str);
            this.f60745id = str;
            this.id__is_initialized = true;
        }

        private BoardingArea(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public BoardingOptions(@NonNull List<BoardingArea> list) {
        this.area__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.area = list;
            this.area__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"area\" cannot be null");
    }

    private BoardingOptions(NativeObject nativeObject) {
        this.area__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
