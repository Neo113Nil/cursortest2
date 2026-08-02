package ru.sberdevices.salutevision.core.data;

import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/sberdevices/salutevision/core/data/BrandProb;", "", "id", "", "prob", "", "(Ljava/lang/String;F)V", "getId", "()Ljava/lang/String;", "getProb", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BrandProb {

    @NotNull
    private final String id;
    private final float prob;

    public BrandProb(@NotNull String id2, float f7) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.prob = f7;
    }

    public static /* synthetic */ BrandProb copy$default(BrandProb brandProb, String str, float f7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brandProb.id;
        }
        if ((i11 & 2) != 0) {
            f7 = brandProb.prob;
        }
        return brandProb.copy(str, f7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getProb() {
        return this.prob;
    }

    @NotNull
    public final BrandProb copy(@NotNull String id2, float prob) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new BrandProb(id2, prob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandProb)) {
            return false;
        }
        BrandProb brandProb = (BrandProb) other;
        return Intrinsics.d(this.id, brandProb.id) && Float.compare(this.prob, brandProb.prob) == 0;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final float getProb() {
        return this.prob;
    }

    public int hashCode() {
        return Float.hashCode(this.prob) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BrandProb(id=");
        sb2.append(this.id);
        sb2.append(", prob=");
        return G.a(sb2, this.prob, ')');
    }
}
