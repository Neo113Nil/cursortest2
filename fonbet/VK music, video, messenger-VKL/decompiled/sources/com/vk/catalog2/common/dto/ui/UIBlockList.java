package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.style.CatalogTabStyle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.gxj0;
import xsna.ho8;
import xsna.i7o0;
import xsna.j5g;
import xsna.rwp0;

/* compiled from: UIBlockList.kt */
/* loaded from: classes16.dex */
public final class UIBlockList extends UIBlock implements rwp0 {
    public static final Serializer.c<UIBlockList> CREATOR = new b();
    public String A;
    public final UIBlockActionShowFilters B;
    public final UIBlockActionEnterEditMode C;
    public final UIBlockActionGoToOwner D;
    public final UIBlockActionClearSection E;
    public final UIBlockActionOpenSection F;
    public final UIBlockActionOpenUrl G;
    public final UIBlockBadge H;
    public final UIBlockActionSearchMode I;
    public final boolean J;
    public final CatalogTabStyle K;
    public final boolean L;
    public final String M;
    public final boolean N;
    public final Integer O;
    public final UIBlockDownloadAll P;
    public ArrayList<UIBlock> y;
    public final String z;

    /* compiled from: UIBlockList.kt */
    public static final class a {
        public static UIBlockList a() {
            CatalogViewType catalogViewType = CatalogViewType.UNKNOWN;
            CatalogDataType catalogDataType = CatalogDataType.UNKNOWN;
            UserId userId = UserId.d;
            EmptyList emptyList = EmptyList.b;
            return new UIBlockList("", catalogViewType, catalogDataType, "", userId, emptyList, EmptySet.b, null, null, "", emptyList, null, null, null, null, null, null, null, null, null, false, null, false, null, null, true, "", CatalogLaunchOrigin.UNKNOWN, null, null, 4194304, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockList a(Serializer serializer) {
            return new UIBlockList(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockList[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public UIBlockList(com.vk.catalog2.common.dto.ui.UIBlockList r32, java.util.List<? extends com.vk.catalog2.common.dto.api.ui.UIBlock> r33) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.catalog2.common.dto.ui.UIBlockList.<init>(com.vk.catalog2.common.dto.ui.UIBlockList, java.util.List):void");
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.i0(this.B);
        serializer.i0(this.C);
        serializer.i0(this.D);
        serializer.i0(this.I);
        serializer.i0(this.H);
        serializer.i0(this.E);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.i0(this.F);
        serializer.i0(this.K);
        serializer.i0(this.G);
        serializer.j0(this.M);
        serializer.L(this.N ? (byte) 1 : (byte) 0);
        Integer num = this.O;
        if (num != null) {
            serializer.S(num.intValue());
        }
        serializer.i0(this.P);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public final UIBlockList zb() {
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
        ArrayList<UIBlock> arrayList = this.y;
        ArrayList arrayList2 = new ArrayList();
        Iterator<UIBlock> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().zb());
        }
        String str = this.A;
        UIBlockActionShowFilters uIBlockActionShowFilters = this.B;
        UIBlockActionShowFilters zb2 = uIBlockActionShowFilters != null ? uIBlockActionShowFilters.zb() : null;
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode = this.C;
        UIBlockActionEnterEditMode zb3 = uIBlockActionEnterEditMode != null ? uIBlockActionEnterEditMode.zb() : null;
        UIBlockActionGoToOwner uIBlockActionGoToOwner = this.D;
        UIBlockActionGoToOwner zb4 = uIBlockActionGoToOwner != null ? uIBlockActionGoToOwner.zb() : null;
        UIBlockActionSearchMode uIBlockActionSearchMode = this.I;
        UIBlockActionSearchMode zb5 = uIBlockActionSearchMode != null ? uIBlockActionSearchMode.zb() : null;
        UIBlockActionClearSection uIBlockActionClearSection = this.E;
        UIBlockActionClearSection zb6 = uIBlockActionClearSection != null ? uIBlockActionClearSection.zb() : null;
        UIBlockActionOpenSection uIBlockActionOpenSection = this.F;
        UIBlockActionOpenSection Rb = uIBlockActionOpenSection != null ? uIBlockActionOpenSection.Rb(uIBlockActionOpenSection.e) : null;
        UIBlockActionOpenUrl uIBlockActionOpenUrl = this.G;
        UIBlockActionOpenUrl zb7 = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.zb() : null;
        UIBlockBadge uIBlockBadge = this.H;
        UIBlockBadge zb8 = uIBlockBadge != null ? uIBlockBadge.zb() : null;
        CatalogTabStyle catalogTabStyle = this.K;
        CatalogTabStyle zb9 = catalogTabStyle != null ? catalogTabStyle.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        UIBlockDownloadAll uIBlockDownloadAll = this.P;
        return new UIBlockList(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.m, this.z, arrayList2, str, zb2, zb3, zb4, zb5, zb6, Rb, zb7, zb8, this.J, zb9, this.L, this.M, copy, this.N, this.c, this.p, this.O, uIBlockDownloadAll != null ? uIBlockDownloadAll.zb() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.vk.catalog2.common.dto.style.CatalogTabStyle] */
    public final UIBlockList Qb(String str, CatalogTabStyle.Icon icon) {
        CatalogTabStyle.Icon icon2;
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
        ArrayList<UIBlock> arrayList = this.y;
        ArrayList arrayList2 = new ArrayList();
        Iterator<UIBlock> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().zb());
        }
        String str2 = this.A;
        UIBlockActionShowFilters uIBlockActionShowFilters = this.B;
        UIBlockActionShowFilters zb2 = uIBlockActionShowFilters != null ? uIBlockActionShowFilters.zb() : null;
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode = this.C;
        UIBlockActionEnterEditMode zb3 = uIBlockActionEnterEditMode != null ? uIBlockActionEnterEditMode.zb() : null;
        UIBlockActionGoToOwner uIBlockActionGoToOwner = this.D;
        UIBlockActionGoToOwner zb4 = uIBlockActionGoToOwner != null ? uIBlockActionGoToOwner.zb() : null;
        UIBlockActionSearchMode uIBlockActionSearchMode = this.I;
        UIBlockActionSearchMode zb5 = uIBlockActionSearchMode != null ? uIBlockActionSearchMode.zb() : null;
        UIBlockActionClearSection uIBlockActionClearSection = this.E;
        UIBlockActionClearSection zb6 = uIBlockActionClearSection != null ? uIBlockActionClearSection.zb() : null;
        UIBlockActionOpenSection uIBlockActionOpenSection = this.F;
        UIBlockActionOpenSection Rb = uIBlockActionOpenSection != null ? uIBlockActionOpenSection.Rb(uIBlockActionOpenSection.e) : null;
        UIBlockActionOpenUrl uIBlockActionOpenUrl = this.G;
        UIBlockActionOpenUrl zb7 = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.zb() : null;
        UIBlockBadge uIBlockBadge = this.H;
        UIBlockBadge zb8 = uIBlockBadge != null ? uIBlockBadge.zb() : null;
        if (icon == null) {
            CatalogTabStyle catalogTabStyle = this.K;
            icon2 = catalogTabStyle != null ? catalogTabStyle.zb() : null;
        } else {
            icon2 = icon;
        }
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockList(str, this.d, this.e, this.f, a2, a3, hashSet, zb, this.m, this.z, arrayList2, str2, zb2, zb3, zb4, zb5, zb6, Rb, zb7, zb8, this.J, icon2, this.L, this.M, catalogViewStyle != null ? catalogViewStyle.copy() : null, this.N, this.c, this.p, this.O, this.P);
    }

    public final UIBlockBadge Rb() {
        return this.H;
    }

    public final ArrayList<UIBlock> Sb() {
        return this.y;
    }

    public final String Tb() {
        return this.M;
    }

    public final void Ub(ArrayList<UIBlock> arrayList) {
        this.y = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockList) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockList uIBlockList = (UIBlockList) obj;
        return epx.f(this.y, uIBlockList.y) && epx.f(this.z, uIBlockList.z) && epx.f(this.B, uIBlockList.B) && epx.f(this.C, uIBlockList.C) && epx.f(this.I, uIBlockList.I) && epx.f(this.D, uIBlockList.D) && epx.f(this.E, uIBlockList.E) && epx.f(this.H, uIBlockList.H) && this.J == uIBlockList.J && this.L == uIBlockList.L && epx.f(this.F, uIBlockList.F) && epx.f(this.G, uIBlockList.G) && epx.f(this.K, uIBlockList.K) && this.N == uIBlockList.N;
    }

    @Override // xsna.rwp0
    public final String getTitle() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.B, this.C, this.I, this.D, this.H, this.E, Boolean.valueOf(this.J), this.F, this.G, this.K, Boolean.valueOf(this.L), this.F, Boolean.valueOf(this.N));
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append('(');
        sb.append(this.z);
        sb.append(") of ");
        sb.append(this.y.size());
        sb.append(" [");
        return ho8.a(sb, j5g.g0(this.y, null, null, null, 0, new gxj0(5), 31), ']');
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UIBlockList(java.lang.String r34, com.vk.catalog2.common.dto.api.CatalogViewType r35, com.vk.catalog2.common.dto.api.CatalogDataType r36, java.lang.String r37, com.vk.dto.common.id.UserId r38, java.util.List r39, java.util.Set r40, com.vk.catalog2.common.dto.api.ui.UIBlockHint r41, java.lang.String r42, java.lang.String r43, java.util.List r44, java.lang.String r45, com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters r46, com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode r47, com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner r48, com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode r49, com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection r50, com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection r51, com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl r52, com.vk.catalog2.common.dto.ui.UIBlockBadge r53, boolean r54, com.vk.catalog2.common.dto.style.CatalogTabStyle r55, boolean r56, java.lang.String r57, com.vk.catalog2.common.dto.api.style.CatalogViewStyle r58, boolean r59, java.lang.String r60, com.vk.catalog2.common.dto.api.CatalogLaunchOrigin r61, java.lang.Integer r62, com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll r63, int r64, xsna.zcl r65) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.catalog2.common.dto.ui.UIBlockList.<init>(java.lang.String, com.vk.catalog2.common.dto.api.CatalogViewType, com.vk.catalog2.common.dto.api.CatalogDataType, java.lang.String, com.vk.dto.common.id.UserId, java.util.List, java.util.Set, com.vk.catalog2.common.dto.api.ui.UIBlockHint, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters, com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode, com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner, com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode, com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection, com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection, com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl, com.vk.catalog2.common.dto.ui.UIBlockBadge, boolean, com.vk.catalog2.common.dto.style.CatalogTabStyle, boolean, java.lang.String, com.vk.catalog2.common.dto.api.style.CatalogViewStyle, boolean, java.lang.String, com.vk.catalog2.common.dto.api.CatalogLaunchOrigin, java.lang.Integer, com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll, int, xsna.zcl):void");
    }

    public UIBlockList(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, List<? extends UIBlock> list2, String str5, UIBlockActionShowFilters uIBlockActionShowFilters, UIBlockActionEnterEditMode uIBlockActionEnterEditMode, UIBlockActionGoToOwner uIBlockActionGoToOwner, UIBlockActionSearchMode uIBlockActionSearchMode, UIBlockActionClearSection uIBlockActionClearSection, UIBlockActionOpenSection uIBlockActionOpenSection, UIBlockActionOpenUrl uIBlockActionOpenUrl, UIBlockBadge uIBlockBadge, boolean z, CatalogTabStyle catalogTabStyle, boolean z2, String str6, CatalogViewStyle catalogViewStyle, boolean z3, String str7, CatalogLaunchOrigin catalogLaunchOrigin, Integer num, UIBlockDownloadAll uIBlockDownloadAll) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, str7, str3, null, catalogLaunchOrigin, null, 20736, null);
        this.z = str4;
        this.y = new ArrayList<>(list2);
        this.A = str5;
        this.B = uIBlockActionShowFilters;
        this.C = uIBlockActionEnterEditMode;
        this.I = uIBlockActionSearchMode;
        this.D = uIBlockActionGoToOwner;
        this.E = uIBlockActionClearSection;
        this.F = uIBlockActionOpenSection;
        this.G = uIBlockActionOpenUrl;
        this.H = uIBlockBadge;
        this.J = z;
        this.K = catalogTabStyle;
        this.L = z2;
        this.M = str6;
        this.N = z3;
        this.O = num;
        this.P = uIBlockDownloadAll;
    }

    public UIBlockList(Serializer serializer) {
        super(serializer);
        ArrayList<UIBlock> k = serializer.k(UIBlock.class);
        this.y = k == null ? new ArrayList<>() : k;
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = (UIBlockActionShowFilters) serializer.G(UIBlockActionShowFilters.class.getClassLoader());
        this.C = (UIBlockActionEnterEditMode) serializer.G(UIBlockActionEnterEditMode.class.getClassLoader());
        this.D = (UIBlockActionGoToOwner) serializer.G(UIBlockActionGoToOwner.class.getClassLoader());
        this.I = (UIBlockActionSearchMode) serializer.G(UIBlockActionSearchMode.class.getClassLoader());
        this.H = (UIBlockBadge) serializer.G(UIBlockBadge.class.getClassLoader());
        this.E = (UIBlockActionClearSection) serializer.G(UIBlockActionClearSection.class.getClassLoader());
        this.J = serializer.m();
        this.L = serializer.m();
        this.F = (UIBlockActionOpenSection) serializer.G(UIBlockActionOpenSection.class.getClassLoader());
        this.K = (CatalogTabStyle) serializer.G(CatalogTabStyle.class.getClassLoader());
        this.G = (UIBlockActionOpenUrl) serializer.G(UIBlockActionOpenUrl.class.getClassLoader());
        String H = serializer.H();
        this.M = H == null ? "" : H;
        this.N = serializer.m();
        this.O = Integer.valueOf(serializer.u());
        this.P = (UIBlockDownloadAll) serializer.G(UIBlockDownloadAll.class.getClassLoader());
    }
}
