package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.bpn0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.j5g;
import xsna.orj0;
import xsna.qjg;
import xsna.zcl;
import xsna.zsw;

/* compiled from: UIBlockCatalog.kt */
/* loaded from: classes16.dex */
public final class UIBlockCatalog extends UIBlock {
    public static final Serializer.c<UIBlockCatalog> CREATOR = new a();
    public final ArrayList<UIBlock> A;
    public final String B;
    public final bpn0 C;
    public final String D;
    public final boolean E;
    public final ArrayList<UIBlockAction> F;
    public final UIBlockList y;
    public final UIBlockList z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockCatalog> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockCatalog a(Serializer serializer) {
            return new UIBlockCatalog(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockCatalog[i];
        }
    }

    public UIBlockCatalog(UIBlockList uIBlockList, UIBlockList uIBlockList2, List list, String str, String str2, UIBlockHint uIBlockHint, UserId userId, boolean z, List list2, int i, zcl zclVar) {
        this(uIBlockList, uIBlockList2, list, str, str2, (i & 32) != 0 ? null : uIBlockHint, (i & 64) != 0 ? UserId.d : userId, (i & 128) != 0 ? false : z, (i & 256) != 0 ? EmptyList.b : list2);
    }

    public static ArrayList Pb(UIBlockCatalog uIBlockCatalog) {
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        Iterator<UIBlock> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(it.next().b, uIBlockCatalog.B)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(0, (UIBlock) arrayList2.remove(i));
        return arrayList2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.W(this.A);
        serializer.j0(this.B);
        serializer.j0(this.D);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.W(this.F);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Qb, reason: merged with bridge method [inline-methods] */
    public final UIBlockCatalog zb() {
        UIBlockList zb = this.y.zb();
        UIBlockList zb2 = this.z.zb();
        ArrayList a2 = i7o0.a(this.A);
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockCatalog(zb, zb2, a2, this.B, this.D, uIBlockHint != null ? uIBlockHint.zb() : null, UserId.a(this.g), this.E, i7o0.a(this.F));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockCatalog) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) obj;
        return epx.f(this.y, uIBlockCatalog.y) && epx.f(this.z, uIBlockCatalog.z) && epx.f(this.A, uIBlockCatalog.A) && epx.f(this.D, uIBlockCatalog.D) && epx.f(this.B, uIBlockCatalog.B) && this.E == uIBlockCatalog.E && epx.f(this.F, uIBlockCatalog.F);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.D, Boolean.valueOf(this.E), this.F);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('[');
        return ho8.a(sb, j5g.g0(this.A, null, null, null, 0, new zsw(28), 31), ']');
    }

    public UIBlockCatalog(UIBlockList uIBlockList, UIBlockList uIBlockList2, List<? extends UIBlock> list, String str, String str2, UIBlockHint uIBlockHint, UserId userId, boolean z, List<? extends UIBlockAction> list2) {
        super("", CatalogViewType.SYNTHETIC_CATALOG, CatalogDataType.DATA_TYPE_NONE, "", userId, new ArrayList(), EmptySet.b, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.C = new bpn0(new orj0(this, 13));
        this.y = uIBlockList;
        this.z = uIBlockList2;
        this.A = new ArrayList<>(list);
        this.B = str;
        this.D = str2;
        this.E = z;
        this.F = new ArrayList<>(list2);
    }

    public UIBlockCatalog(Serializer serializer) {
        super(serializer);
        this.C = new bpn0(new orj0(this, 13));
        UIBlockList uIBlockList = (UIBlockList) serializer.G(UIBlockList.class.getClassLoader());
        if (uIBlockList == null) {
            Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
            uIBlockList = UIBlockList.a.a();
        }
        this.y = uIBlockList;
        UIBlockList uIBlockList2 = (UIBlockList) serializer.G(UIBlockList.class.getClassLoader());
        if (uIBlockList2 == null) {
            Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
            uIBlockList2 = UIBlockList.a.a();
        }
        this.z = uIBlockList2;
        ArrayList<UIBlock> k = serializer.k(UIBlock.class);
        this.A = k == null ? new ArrayList<>() : k;
        this.B = serializer.H();
        String H = serializer.H();
        this.D = H == null ? "" : H;
        this.E = serializer.m();
        ArrayList<UIBlockAction> k2 = serializer.k(UIBlockAction.class);
        this.F = k2 == null ? new ArrayList<>() : k2;
    }
}
