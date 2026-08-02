package com.vk.catalog2.common.dto.api.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
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

/* compiled from: UIBlockHint.kt */
/* loaded from: classes16.dex */
public final class UIBlockHint extends UIBlock {
    public static final Serializer.c<UIBlockHint> CREATOR = new a();
    public final String A;
    public final CatalogHintType B;
    public final boolean C;
    public final List<UIBlockAction> D;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockHint> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockHint a(Serializer serializer) {
            return new UIBlockHint(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockHint[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockHint(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, String str3, String str4, String str5, CatalogHintType catalogHintType, boolean z, List<? extends UIBlockAction> list2, String str6) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, null, null, null, null, null, null, null, str6, 16128, null);
        this.y = str3;
        this.z = str4;
        this.A = str5;
        this.B = catalogHintType;
        this.C = z;
        this.D = list2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B.h());
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.f0(this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public final UIBlockHint zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlockAction> it2 = this.D.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().zb());
        }
        return new UIBlockHint(this.b, this.d, this.e, this.f, a2, a3, hashSet, this.y, this.z, this.A, this.B, this.C, arrayList, this.q);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockHint) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockHint uIBlockHint = (UIBlockHint) obj;
        return epx.f(this.y, uIBlockHint.y) && epx.f(this.z, uIBlockHint.z) && epx.f(this.A, uIBlockHint.A) && this.C == uIBlockHint.C && epx.f(this.D, uIBlockHint.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B, Boolean.valueOf(this.C), this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: ");
        return ho8.a(sb, this.y, '>');
    }

    public UIBlockHint(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.y = H == null ? "" : H;
        String H2 = serializer.H();
        this.z = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.A = H3 == null ? "" : H3;
        CatalogHintType.a aVar = CatalogHintType.Companion;
        String H4 = serializer.H();
        String str = H4 != null ? H4 : "";
        aVar.getClass();
        this.B = CatalogHintType.a.a(str);
        this.C = serializer.m();
        this.D = serializer.B(UIBlockAction.class.getClassLoader());
    }
}
