package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.layout.LayoutSize;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.zcl;

/* compiled from: UIBlockSeparator.kt */
/* loaded from: classes16.dex */
public final class UIBlockSeparator extends UIBlock {
    public static final Serializer.c<UIBlockSeparator> CREATOR = new a();
    public final LayoutSize y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSeparator> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSeparator a(Serializer serializer) {
            return new UIBlockSeparator(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSeparator[i];
        }
    }

    public /* synthetic */ UIBlockSeparator(com.vk.catalog2.common.dto.api.ui.a aVar, LayoutSize layoutSize, int i, zcl zclVar) {
        this(aVar, (i & 2) != 0 ? null : layoutSize);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        LayoutSize layoutSize = this.y;
        serializer.j0(layoutSize != null ? layoutSize.getId() : null);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockSeparator) && UIBlock.a.b(this, (UIBlock) obj)) {
            return this.y == ((UIBlockSeparator) obj).y;
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "----------------SEPARATOR_BLOCK (" + this.d + ")----------------";
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockSeparator(Ab(), this.y);
    }

    public UIBlockSeparator(com.vk.catalog2.common.dto.api.ui.a aVar, LayoutSize layoutSize) {
        super(aVar);
        this.y = layoutSize;
    }

    public UIBlockSeparator(Serializer serializer) {
        super(serializer);
        LayoutSize.a aVar = LayoutSize.Companion;
        String H = serializer.H();
        aVar.getClass();
        this.y = LayoutSize.a.a(H);
    }
}
