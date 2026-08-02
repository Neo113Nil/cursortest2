package ru.sberdevices.salutevision.core.data;

import android.graphics.PointF;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lru/sberdevices/salutevision/core/data/Quad;", "", "tl", "Landroid/graphics/PointF;", "tr", "br", "bl", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "getBl", "()Landroid/graphics/PointF;", "getBr", "getTl", "getTr", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Quad {

    @NotNull
    private final PointF bl;

    @NotNull
    private final PointF br;

    @NotNull
    private final PointF tl;

    @NotNull
    private final PointF tr;

    public Quad(@NotNull PointF tl2, @NotNull PointF tr, @NotNull PointF br, @NotNull PointF bl) {
        Intrinsics.checkNotNullParameter(tl2, "tl");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Intrinsics.checkNotNullParameter(br, "br");
        Intrinsics.checkNotNullParameter(bl, "bl");
        this.tl = tl2;
        this.tr = tr;
        this.br = br;
        this.bl = bl;
    }

    public static /* synthetic */ Quad copy$default(Quad quad, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointF = quad.tl;
        }
        if ((i11 & 2) != 0) {
            pointF2 = quad.tr;
        }
        if ((i11 & 4) != 0) {
            pointF3 = quad.br;
        }
        if ((i11 & 8) != 0) {
            pointF4 = quad.bl;
        }
        return quad.copy(pointF, pointF2, pointF3, pointF4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PointF getTl() {
        return this.tl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PointF getTr() {
        return this.tr;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PointF getBr() {
        return this.br;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PointF getBl() {
        return this.bl;
    }

    @NotNull
    public final Quad copy(@NotNull PointF tl2, @NotNull PointF tr, @NotNull PointF br, @NotNull PointF bl) {
        Intrinsics.checkNotNullParameter(tl2, "tl");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Intrinsics.checkNotNullParameter(br, "br");
        Intrinsics.checkNotNullParameter(bl, "bl");
        return new Quad(tl2, tr, br, bl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quad)) {
            return false;
        }
        Quad quad = (Quad) other;
        return Intrinsics.d(this.tl, quad.tl) && Intrinsics.d(this.tr, quad.tr) && Intrinsics.d(this.br, quad.br) && Intrinsics.d(this.bl, quad.bl);
    }

    @NotNull
    public final PointF getBl() {
        return this.bl;
    }

    @NotNull
    public final PointF getBr() {
        return this.br;
    }

    @NotNull
    public final PointF getTl() {
        return this.tl;
    }

    @NotNull
    public final PointF getTr() {
        return this.tr;
    }

    public int hashCode() {
        return this.bl.hashCode() + ((this.br.hashCode() + ((this.tr.hashCode() + (this.tl.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final List<PointF> toList() {
        return C7714v.b0(this.tl, this.tr, this.br, this.bl);
    }

    @NotNull
    public String toString() {
        return "Quad(tl=" + this.tl + ", tr=" + this.tr + ", br=" + this.br + ", bl=" + this.bl + ')';
    }
}
