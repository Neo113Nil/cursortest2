package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ConstructionSegment implements Serializable {
    private ConstructionMask constructionMask;
    private Subpolyline subpolyline;

    public ConstructionSegment(@NonNull Subpolyline subpolyline, @NonNull ConstructionMask constructionMask) {
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"subpolyline\" cannot be null");
        }
        if (constructionMask == null) {
            throw new IllegalArgumentException("Required field \"constructionMask\" cannot be null");
        }
        this.subpolyline = subpolyline;
        this.constructionMask = constructionMask;
    }

    @NonNull
    public ConstructionMask getConstructionMask() {
        return this.constructionMask;
    }

    @NonNull
    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
        this.constructionMask = (ConstructionMask) archive.add((Archive) this.constructionMask, false, (Class<Archive>) ConstructionMask.class);
    }

    public ConstructionSegment() {
    }
}
