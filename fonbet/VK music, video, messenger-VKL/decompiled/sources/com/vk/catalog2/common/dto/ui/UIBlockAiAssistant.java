package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.video.CatalogAiAssistantItem;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;

/* compiled from: UIBlockAiAssistant.kt */
/* loaded from: classes16.dex */
public final class UIBlockAiAssistant extends UIBlock {
    public static final Serializer.c<UIBlockAiAssistant> CREATOR = new a();
    public final CatalogAiAssistantItem y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockAiAssistant> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockAiAssistant a(Serializer serializer) {
            return new UIBlockAiAssistant(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockAiAssistant[i];
        }
    }

    public UIBlockAiAssistant(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogAiAssistantItem catalogAiAssistantItem) {
        super(aVar);
        this.y = catalogAiAssistantItem;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        CatalogAiAssistantItem catalogAiAssistantItem = this.y;
        return String.valueOf(catalogAiAssistantItem != null ? Integer.valueOf(catalogAiAssistantItem.b) : null);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockAiAssistant) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockAiAssistant) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return String.valueOf(this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        CatalogAiAssistantItem catalogAiAssistantItem = this.y;
        return new UIBlockAiAssistant(Ab, catalogAiAssistantItem != null ? new CatalogAiAssistantItem(catalogAiAssistantItem.b, catalogAiAssistantItem.c, catalogAiAssistantItem.d, catalogAiAssistantItem.e) : null);
    }

    public UIBlockAiAssistant(Serializer serializer) {
        super(serializer);
        this.y = (CatalogAiAssistantItem) serializer.G(CatalogAiAssistantItem.class.getClassLoader());
    }
}
