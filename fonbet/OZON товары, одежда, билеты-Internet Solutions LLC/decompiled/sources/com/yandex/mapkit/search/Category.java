package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes9.dex */
public class Category implements Serializable {
    private String categoryClass;
    private boolean categoryClass__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;

    public Category() {
        this.name__is_initialized = false;
        this.categoryClass__is_initialized = false;
        this.tags__is_initialized = false;
    }

    private native String getCategoryClass__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Category";
    }

    private native List<String> getTags__Native();

    private native NativeObject init(String str, String str2, List<String> list);

    public synchronized String getCategoryClass() {
        try {
            if (!this.categoryClass__is_initialized) {
                this.categoryClass = getCategoryClass__Native();
                this.categoryClass__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.categoryClass;
    }

    @NonNull
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

    @NonNull
    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.tags;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getName(), false);
            archive.add(getCategoryClass(), true);
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.categoryClass = archive.add(this.categoryClass, true);
        this.categoryClass__is_initialized = true;
        List<String> add = archive.add((List) this.tags, false, (ArchivingHandler) new StringHandler());
        this.tags = add;
        this.tags__is_initialized = true;
        this.nativeObject = init(this.name, this.categoryClass, add);
    }

    public Category(@NonNull String str, String str2, @NonNull List<String> list) {
        this.name__is_initialized = false;
        this.categoryClass__is_initialized = false;
        this.tags__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, str2, list);
            this.name = str;
            this.name__is_initialized = true;
            this.categoryClass = str2;
            this.categoryClass__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"tags\" cannot be null");
    }

    private Category(NativeObject nativeObject) {
        this.name__is_initialized = false;
        this.categoryClass__is_initialized = false;
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
