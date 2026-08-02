package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
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

/* compiled from: UIBlockText.kt */
/* loaded from: classes16.dex */
public final class UIBlockText extends UIBlock {
    public static final Serializer.c<UIBlockText> CREATOR = new a();
    public final String A;
    public final int B;
    public final String C;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockText> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockText a(Serializer serializer) {
            return new UIBlockText(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockText[i];
        }
    }

    public UIBlockText(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, String str5, String str6, int i) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = str4;
        this.z = str6;
        this.A = str5;
        this.B = i;
        this.C = str3;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.A);
        serializer.j0(this.z);
        serializer.S(this.B);
        serializer.j0(this.C);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockText) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockText uIBlockText = (UIBlockText) obj;
        return epx.f(this.y, uIBlockText.y) && epx.f(this.A, uIBlockText.A) && epx.f(this.z, uIBlockText.z) && this.B == uIBlockText.B && epx.f(this.C, uIBlockText.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.A, this.z, Integer.valueOf(this.B), this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<#");
        sb.append(this.y);
        sb.append(' ');
        sb.append(this.A);
        sb.append(" - ");
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
        return new UIBlockText(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.C, this.y, this.A, this.z, this.B);
    }

    public UIBlockText(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        String H = serializer.H();
        this.A = H == null ? "" : H;
        String H2 = serializer.H();
        this.z = H2 != null ? H2 : "";
        this.B = serializer.u();
        this.C = serializer.H();
    }
}
