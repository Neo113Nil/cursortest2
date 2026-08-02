package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes9.dex */
public class RouteSettings implements Serializable {
    private List<String> acceptTypes;
    private boolean acceptTypes__is_initialized;
    private List<String> avoidTypes;
    private boolean avoidTypes__is_initialized;
    private NativeObject nativeObject;

    public RouteSettings() {
        this.avoidTypes__is_initialized = false;
        this.acceptTypes__is_initialized = false;
    }

    private native List<String> getAcceptTypes__Native();

    private native List<String> getAvoidTypes__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RouteSettings";
    }

    private native NativeObject init(List<String> list, List<String> list2);

    @NonNull
    public synchronized List<String> getAcceptTypes() {
        try {
            if (!this.acceptTypes__is_initialized) {
                this.acceptTypes = getAcceptTypes__Native();
                this.acceptTypes__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.acceptTypes;
    }

    @NonNull
    public synchronized List<String> getAvoidTypes() {
        try {
            if (!this.avoidTypes__is_initialized) {
                this.avoidTypes = getAvoidTypes__Native();
                this.avoidTypes__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.avoidTypes;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getAvoidTypes(), false, (ArchivingHandler) new StringHandler());
            archive.add((List) getAcceptTypes(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        this.avoidTypes = archive.add((List) this.avoidTypes, false, (ArchivingHandler) new StringHandler());
        this.avoidTypes__is_initialized = true;
        List<String> add = archive.add((List) this.acceptTypes, false, (ArchivingHandler) new StringHandler());
        this.acceptTypes = add;
        this.acceptTypes__is_initialized = true;
        this.nativeObject = init(this.avoidTypes, add);
    }

    public RouteSettings(@NonNull List<String> list, @NonNull List<String> list2) {
        this.avoidTypes__is_initialized = false;
        this.acceptTypes__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"avoidTypes\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(list, list2);
            this.avoidTypes = list;
            this.avoidTypes__is_initialized = true;
            this.acceptTypes = list2;
            this.acceptTypes__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"acceptTypes\" cannot be null");
    }

    private RouteSettings(NativeObject nativeObject) {
        this.avoidTypes__is_initialized = false;
        this.acceptTypes__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
