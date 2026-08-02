package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import java.util.UUID;
import xsna.epx;
import xsna.zcl;

/* compiled from: UIBlockShimmer.kt */
/* loaded from: classes16.dex */
public final class UIBlockShimmer extends UIBlock {
    public static final Serializer.c<UIBlockShimmer> CREATOR = new a();
    public final String y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockShimmer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockShimmer a(Serializer serializer) {
            return new UIBlockShimmer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockShimmer[i];
        }
    }

    public UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a aVar, String str) {
        super(aVar);
        this.y = str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockShimmer) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockShimmer) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "<Shimmer>";
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockShimmer(Ab(), this.y);
    }

    public /* synthetic */ UIBlockShimmer(com.vk.catalog2.common.dto.api.ui.a aVar, String str, int i, zcl zclVar) {
        this(aVar, (i & 2) != 0 ? UUID.randomUUID().toString() : str);
    }

    public UIBlockShimmer(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
    }
}
