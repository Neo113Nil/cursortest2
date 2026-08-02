package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockMusicSpecial.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicSpecial extends UIBlock {
    public static final Serializer.c<UIBlockMusicSpecial> CREATOR = new a();
    public final String A;
    public final UIBlockActionOpenSection B;
    public final UIBlockActionPlayAudiosFromBlock C;
    public final List<Thumb> y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicSpecial> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicSpecial a(Serializer serializer) {
            return new UIBlockMusicSpecial(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicSpecial[i];
        }
    }

    public UIBlockMusicSpecial(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, List<Thumb> list2, String str3, String str4, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock, UIBlockActionOpenSection uIBlockActionOpenSection) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = list2;
        this.z = str3;
        this.A = str4;
        this.C = uIBlockActionPlayAudiosFromBlock;
        this.B = uIBlockActionOpenSection;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        String str;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.C;
        return (uIBlockActionPlayAudiosFromBlock == null || (str = uIBlockActionPlayAudiosFromBlock.z) == null) ? this.b : str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.i0(this.C);
        serializer.i0(this.B);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicSpecial) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicSpecial uIBlockMusicSpecial = (UIBlockMusicSpecial) obj;
        return epx.f(this.y, uIBlockMusicSpecial.y) && epx.f(this.z, uIBlockMusicSpecial.z) && epx.f(this.A, uIBlockMusicSpecial.A) && epx.f(this.C, uIBlockMusicSpecial.C) && epx.f(this.B, uIBlockMusicSpecial.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.A, this.C, this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.z, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        ArrayList a4 = i7o0.a(this.y);
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.C;
        UIBlockActionPlayAudiosFromBlock zb2 = uIBlockActionPlayAudiosFromBlock != null ? uIBlockActionPlayAudiosFromBlock.zb() : null;
        UIBlockActionOpenSection uIBlockActionOpenSection = this.B;
        return new UIBlockMusicSpecial(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, a4, this.z, this.A, zb2, uIBlockActionOpenSection != null ? uIBlockActionOpenSection.Rb(uIBlockActionOpenSection.e) : null);
    }

    public UIBlockMusicSpecial(Serializer serializer) {
        super(serializer);
        ArrayList l = serializer.l(Thumb.class.getClassLoader());
        this.y = l == null ? new ArrayList() : l;
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 != null ? H2 : "";
        this.C = (UIBlockActionPlayAudiosFromBlock) serializer.G(UIBlockActionPlayAudiosFromBlock.class.getClassLoader());
        this.B = (UIBlockActionOpenSection) serializer.G(UIBlockActionOpenSection.class.getClassLoader());
    }
}
