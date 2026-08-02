package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class SubtitleMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<SubtitleItem> serpSubtitleItems;
    private boolean serpSubtitleItems__is_initialized;
    private List<SubtitleItem> subtitleItems;
    private boolean subtitleItems__is_initialized;

    public SubtitleMetadata() {
        this.subtitleItems__is_initialized = false;
        this.serpSubtitleItems__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SubtitleMetadata";
    }

    private native List<SubtitleItem> getSerpSubtitleItems__Native();

    private native List<SubtitleItem> getSubtitleItems__Native();

    private native NativeObject init(List<SubtitleItem> list, List<SubtitleItem> list2);

    @NonNull
    public synchronized List<SubtitleItem> getSerpSubtitleItems() {
        try {
            if (!this.serpSubtitleItems__is_initialized) {
                this.serpSubtitleItems = getSerpSubtitleItems__Native();
                this.serpSubtitleItems__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.serpSubtitleItems;
    }

    @NonNull
    public synchronized List<SubtitleItem> getSubtitleItems() {
        try {
            if (!this.subtitleItems__is_initialized) {
                this.subtitleItems = getSubtitleItems__Native();
                this.subtitleItems__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.subtitleItems;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getSubtitleItems(), false, (ArchivingHandler) new ClassHandler(SubtitleItem.class));
            C2616s.f(SubtitleItem.class, archive, getSerpSubtitleItems(), false);
            return;
        }
        this.subtitleItems = G.d(SubtitleItem.class, archive, this.subtitleItems, false);
        this.subtitleItems__is_initialized = true;
        List<SubtitleItem> d11 = G.d(SubtitleItem.class, archive, this.serpSubtitleItems, false);
        this.serpSubtitleItems = d11;
        this.serpSubtitleItems__is_initialized = true;
        this.nativeObject = init(this.subtitleItems, d11);
    }

    public SubtitleMetadata(@NonNull List<SubtitleItem> list, @NonNull List<SubtitleItem> list2) {
        this.subtitleItems__is_initialized = false;
        this.serpSubtitleItems__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"subtitleItems\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(list, list2);
            this.subtitleItems = list;
            this.subtitleItems__is_initialized = true;
            this.serpSubtitleItems = list2;
            this.serpSubtitleItems__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"serpSubtitleItems\" cannot be null");
    }

    private SubtitleMetadata(NativeObject nativeObject) {
        this.subtitleItems__is_initialized = false;
        this.serpSubtitleItems__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
