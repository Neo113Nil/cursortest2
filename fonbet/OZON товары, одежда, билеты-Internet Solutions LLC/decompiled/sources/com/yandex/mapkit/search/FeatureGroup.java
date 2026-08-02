package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes9.dex */
public class FeatureGroup implements Serializable {
    private List<String> ids;
    private boolean ids__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;

    public FeatureGroup() {
        this.name__is_initialized = false;
        this.ids__is_initialized = false;
    }

    private native List<String> getIds__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::FeatureGroup";
    }

    private native NativeObject init(String str, List<String> list);

    @NonNull
    public synchronized List<String> getIds() {
        try {
            if (!this.ids__is_initialized) {
                this.ids = getIds__Native();
                this.ids__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.ids;
    }

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), true);
            archive.add((List) getIds(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        List<String> add = archive.add((List) this.ids, false, (ArchivingHandler) new StringHandler());
        this.ids = add;
        this.ids__is_initialized = true;
        this.nativeObject = init(this.name, add);
    }

    public FeatureGroup(String str, @NonNull List<String> list) {
        this.name__is_initialized = false;
        this.ids__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(str, list);
            this.name = str;
            this.name__is_initialized = true;
            this.ids = list;
            this.ids__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"ids\" cannot be null");
    }

    private FeatureGroup(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.ids__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
