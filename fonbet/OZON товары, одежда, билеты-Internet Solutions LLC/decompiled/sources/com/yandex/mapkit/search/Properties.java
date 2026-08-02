package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Properties implements Serializable {
    private List<Item> items;
    private boolean items__is_initialized;
    private NativeObject nativeObject;

    public Properties() {
        this.items__is_initialized = false;
    }

    private native List<Item> getItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Properties";
    }

    private native NativeObject init(List<Item> list);

    @NonNull
    public synchronized List<Item> getItems() {
        try {
            if (!this.items__is_initialized) {
                this.items = getItems__Native();
                this.items__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.items;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(Item.class, archive, getItems(), false);
            return;
        }
        List<Item> d11 = G.d(Item.class, archive, this.items, false);
        this.items = d11;
        this.items__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public Properties(@NonNull List<Item> list) {
        this.items__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.items = list;
            this.items__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"items\" cannot be null");
    }

    public static class Item implements Serializable {
        private String key;
        private String value;

        public Item(@NonNull String str, @NonNull String str2) {
            if (str == null) {
                throw new IllegalArgumentException("Required field \"key\" cannot be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required field \"value\" cannot be null");
            }
            this.key = str;
            this.value = str2;
        }

        @NonNull
        public String getKey() {
            return this.key;
        }

        @NonNull
        public String getValue() {
            return this.value;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.key = archive.add(this.key, false);
            this.value = archive.add(this.value, false);
        }

        public Item() {
        }
    }

    private Properties(NativeObject nativeObject) {
        this.items__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
