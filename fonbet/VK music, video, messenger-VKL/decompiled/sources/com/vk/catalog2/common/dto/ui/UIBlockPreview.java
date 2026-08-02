package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
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

/* compiled from: UIBlockPreview.kt */
/* loaded from: classes16.dex */
public final class UIBlockPreview extends UIBlock {
    public static final Serializer.c<UIBlockPreview> CREATOR = new a();
    public final String A;
    public final List<UIBlockAction> B;
    public final List<String> y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockPreview a(Serializer serializer) {
            return new UIBlockPreview(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockPreview[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockPreview(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, List<String> list2, List<? extends UIBlockAction> list3) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = list2;
        this.z = str3;
        this.A = str4;
        this.B = list3;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.l0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.W(this.B);
    }

    public final List<UIBlockAction> Pb() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockPreview) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockPreview uIBlockPreview = (UIBlockPreview) obj;
        return epx.f(this.y, uIBlockPreview.y) && epx.f(this.z, uIBlockPreview.z) && epx.f(this.A, uIBlockPreview.A) && epx.f(this.B, uIBlockPreview.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B);
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
        List<String> list = this.y;
        ArrayList a4 = list != null ? i7o0.a(list) : null;
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlockAction> it2 = this.B.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().zb());
        }
        return new UIBlockPreview(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.z, this.A, a4, arrayList);
    }

    public UIBlockPreview(Serializer serializer) {
        super(serializer);
        this.y = com.vk.core.serialize.a.a(serializer);
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = serializer.k(UIBlockAction.class);
    }
}
