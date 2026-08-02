package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;

/* compiled from: UIBlockActionSaveAsPlaylistFromBlock.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionSaveAsPlaylistFromBlock extends UIBlockAction {
    public static final Serializer.c<UIBlockActionSaveAsPlaylistFromBlock> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionSaveAsPlaylistFromBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionSaveAsPlaylistFromBlock a(Serializer serializer) {
            return new UIBlockActionSaveAsPlaylistFromBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionSaveAsPlaylistFromBlock[i];
        }
    }

    public UIBlockActionSaveAsPlaylistFromBlock(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.B = H3 == null ? "" : H3;
        String H4 = serializer.H();
        this.C = H4 != null ? H4 : "";
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionSaveAsPlaylistFromBlock(Ab(), this.d, this.y, this.z, this.A, this.B, this.C);
    }

    public final String Rb() {
        return this.C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionSaveAsPlaylistFromBlock)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionSaveAsPlaylistFromBlock uIBlockActionSaveAsPlaylistFromBlock = (UIBlockActionSaveAsPlaylistFromBlock) obj;
        return epx.f(this.z, uIBlockActionSaveAsPlaylistFromBlock.z) && epx.f(this.A, uIBlockActionSaveAsPlaylistFromBlock.A) && epx.f(this.B, uIBlockActionSaveAsPlaylistFromBlock.B) && epx.f(this.C, uIBlockActionSaveAsPlaylistFromBlock.C);
    }

    public final String getTitle() {
        return this.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B, this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: pageId: " + this.z + " title:" + this.A + " id:" + this.B + " searchType:" + this.C;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionSaveAsPlaylistFromBlock(Ab(), this.d, this.y, this.z, this.A, this.B, this.C);
    }

    public UIBlockActionSaveAsPlaylistFromBlock(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogViewType catalogViewType, String str, String str2, String str3, String str4, String str5) {
        super(aVar.a, catalogViewType, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, str, null, aVar.j, null, 2560, null);
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
    }
}
