package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class SuggestResponse implements Serializable {
    private List<SuggestItem> items;
    private boolean items__is_initialized;
    private NativeObject nativeObject;

    public SuggestResponse() {
        this.items__is_initialized = false;
    }

    private native List<SuggestItem> getItems__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SuggestResponse";
    }

    private native NativeObject init(List<SuggestItem> list);

    @NonNull
    public synchronized List<SuggestItem> getItems() {
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
            C2616s.f(SuggestItem.class, archive, getItems(), false);
            return;
        }
        List<SuggestItem> d11 = G.d(SuggestItem.class, archive, this.items, false);
        this.items = d11;
        this.items__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public SuggestResponse(@NonNull List<SuggestItem> list) {
        this.items__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.items = list;
            this.items__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"items\" cannot be null");
    }

    private SuggestResponse(NativeObject nativeObject) {
        this.items__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
