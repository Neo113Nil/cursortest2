package com.vk.catalog2.common.dto.api.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import xsna.bpn0;
import xsna.epx;
import xsna.i7o0;
import xsna.icn0;
import xsna.j5g;
import xsna.qjo0;
import xsna.zcl;

/* compiled from: UIBlock.kt */
/* loaded from: classes16.dex */
public abstract class UIBlock extends Serializer.StreamParcelableAdapter {
    public static final AtomicLong x = new AtomicLong();
    public final String b;
    public final String c;
    public final CatalogViewType d;
    public final CatalogDataType e;
    public final String f;
    public final UserId g;
    public final List<String> h;
    public final HashMap i;
    public final UIBlockHint j;
    public final long k;
    public final CatalogViewStyle l;
    public final String m;
    public final CatalogOnboardingInfo n;
    public CatalogDataType o;
    public final CatalogLaunchOrigin p;
    public final String q;
    public final bpn0 r;
    public final bpn0 s;
    public int t;
    public int u;
    public boolean v;
    public final int w;

    /* compiled from: UIBlock.kt */
    public static final class a {
        public static int a(UIBlock uIBlock) {
            return Objects.hash(uIBlock.b, uIBlock.c, uIBlock.e, uIBlock.d, uIBlock.f, uIBlock.g, uIBlock.h, uIBlock.Db(), uIBlock.j, uIBlock.l, uIBlock.m, uIBlock.n, uIBlock.p);
        }

        public static boolean b(UIBlock uIBlock, UIBlock uIBlock2) {
            return epx.f(uIBlock.b, uIBlock2.b) && epx.f(uIBlock.c, uIBlock2.c) && uIBlock.d == uIBlock2.d && uIBlock.e == uIBlock2.e && epx.f(uIBlock.f, uIBlock2.f) && epx.f(uIBlock.g, uIBlock2.g) && epx.f(uIBlock.h, uIBlock2.h) && epx.f(uIBlock.Db(), uIBlock2.Db()) && epx.f(uIBlock.j, uIBlock2.j) && epx.f(uIBlock.l, uIBlock2.l) && epx.f(uIBlock.m, uIBlock2.m) && epx.f(uIBlock.n, uIBlock2.n) && uIBlock.p == uIBlock2.p;
        }
    }

    public UIBlock() {
        throw null;
    }

    public UIBlock(String str, String str2, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str3, UserId userId, List list, HashMap hashMap, UIBlockHint uIBlockHint, long j, CatalogViewStyle catalogViewStyle, String str4, CatalogOnboardingInfo catalogOnboardingInfo, CatalogLaunchOrigin catalogLaunchOrigin, String str5, int i) {
        String str6 = (i & 32768) != 0 ? null : str5;
        this.b = str;
        this.c = str2;
        this.d = catalogViewType;
        this.e = catalogDataType;
        this.f = str3;
        this.g = userId;
        this.h = list;
        this.i = hashMap;
        this.j = uIBlockHint;
        this.k = j;
        this.l = catalogViewStyle;
        this.m = str4;
        this.n = catalogOnboardingInfo;
        this.o = null;
        this.p = catalogLaunchOrigin;
        this.q = str6;
        this.r = new bpn0(new icn0(this, 3));
        this.s = new bpn0(new qjo0(this, 2));
        this.t = -1;
        this.u = -1;
        this.w = 1;
    }

    public final com.vk.catalog2.common.dto.api.ui.a Ab() {
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
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        CatalogOnboardingInfo catalogOnboardingInfo = this.n;
        return new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, this.d, this.e, this.f, a2, a3, hashSet, zb, copy, this.m, catalogOnboardingInfo != null ? CatalogOnboardingInfo.zb(catalogOnboardingInfo) : null, this.p);
    }

    public boolean Bb(Object obj) {
        if (!(obj instanceof UIBlock)) {
            return false;
        }
        UIBlock uIBlock = (UIBlock) obj;
        return epx.f(this.b, uIBlock.b) && this.d == uIBlock.d && this.e == uIBlock.e;
    }

    public final CatalogDataType Cb() {
        return this.e;
    }

    public final Set<UIBlockDragDropAction> Db() {
        return j5g.S0(this.i.values());
    }

    public final UIBlockHint Eb() {
        return this.j;
    }

    public abstract String Fb();

    public String Gb() {
        return Fb();
    }

    public int Hb() {
        return this.w;
    }

    public final List<String> Ib() {
        return this.h;
    }

    public final String Jb() {
        return this.f;
    }

    public final String Kb() {
        CatalogLaunchOrigin catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
        String str = this.f;
        CatalogLaunchOrigin catalogLaunchOrigin2 = this.p;
        if (catalogLaunchOrigin2 == catalogLaunchOrigin) {
            return str;
        }
        if (str.length() == 0) {
            return catalogLaunchOrigin2.h();
        }
        return str + '&' + catalogLaunchOrigin2.h();
    }

    public final CatalogViewStyle Lb() {
        return this.l;
    }

    public final CatalogViewType Mb() {
        return this.d;
    }

    public final boolean Nb() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d.getId());
        serializer.j0(this.e.getId());
        serializer.j0(this.f);
        serializer.e0(this.g);
        serializer.l0(this.h);
        serializer.Y(this.k);
        serializer.W(new ArrayList(Db()));
        serializer.e0(this.j);
        serializer.e0(this.l);
        serializer.m0(this.m);
        serializer.e0(this.n);
        serializer.j0(this.p.h());
    }

    public final boolean Ob() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    public abstract int hashCode();

    public final UserId q() {
        return this.g;
    }

    public abstract String toString();

    public final String v0() {
        return this.c;
    }

    public final String w() {
        return this.b;
    }

    public abstract UIBlock zb();

    public /* synthetic */ UIBlock(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, Long l, CatalogViewStyle catalogViewStyle, String str3, String str4, CatalogOnboardingInfo catalogOnboardingInfo, CatalogLaunchOrigin catalogLaunchOrigin, String str5, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : catalogViewStyle, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : catalogOnboardingInfo, (i & 8192) != 0 ? CatalogLaunchOrigin.UNKNOWN : catalogLaunchOrigin, (i & 16384) != 0 ? null : str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIBlock(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, Long l, CatalogViewStyle catalogViewStyle, String str3, String str4, CatalogOnboardingInfo catalogOnboardingInfo, CatalogLaunchOrigin catalogLaunchOrigin, String str5) {
        this(str, str3, catalogViewType, catalogDataType, str2, userId, list, r9, uIBlockHint, l != null ? l.longValue() : x.getAndIncrement(), catalogViewStyle, str4, catalogOnboardingInfo, catalogLaunchOrigin, str5, 8192);
        Set<? extends UIBlockDragDropAction> set2 = set;
        HashMap hashMap = new HashMap(set2.size());
        for (UIBlockDragDropAction uIBlockDragDropAction : set2) {
            hashMap.put(uIBlockDragDropAction.getClass(), uIBlockDragDropAction);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIBlock(Serializer serializer) {
        this(r1, r2, r4, r7, r5, r6, r7, r8, r9, r10, r13, r13, r15, r14.equals(r0.h()) ? r0 : CatalogLaunchOrigin.UNKNOWN, null, 40960);
        Object obj;
        String H = serializer.H();
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        CatalogViewType.a aVar = CatalogViewType.Companion;
        String H3 = serializer.H();
        aVar.getClass();
        CatalogViewType a2 = CatalogViewType.a.a(H3);
        CatalogDataType.a aVar2 = CatalogDataType.Companion;
        String H4 = serializer.H();
        aVar2.getClass();
        Iterator<E> it = CatalogDataType.h().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (epx.f(((CatalogDataType) obj).getId(), H4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CatalogDataType catalogDataType = (CatalogDataType) obj;
        String H5 = serializer.H();
        H5 = H5 == null ? "" : H5;
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        ArrayList a3 = com.vk.core.serialize.a.a(serializer);
        long w = serializer.w();
        ArrayList k = serializer.k(UIBlockDragDropAction.class);
        k = k == null ? new ArrayList() : k;
        HashMap hashMap = new HashMap(k.size());
        for (Object obj2 : k) {
            hashMap.put(((UIBlockDragDropAction) obj2).getClass(), obj2);
        }
        UIBlockHint uIBlockHint = (UIBlockHint) serializer.A(UIBlockHint.class.getClassLoader());
        CatalogViewStyle catalogViewStyle = (CatalogViewStyle) serializer.A(CatalogViewStyle.class.getClassLoader());
        String I = serializer.I();
        CatalogOnboardingInfo catalogOnboardingInfo = (CatalogOnboardingInfo) serializer.A(CatalogOnboardingInfo.class.getClassLoader());
        String H6 = serializer.H();
        String str = H6 != null ? H6 : "";
        CatalogLaunchOrigin.Companion.getClass();
        CatalogLaunchOrigin catalogLaunchOrigin = CatalogLaunchOrigin.KIDS_SECTION;
    }

    public UIBlock(com.vk.catalog2.common.dto.api.ui.a aVar) {
        this(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null, aVar.j, aVar.b, aVar.k, aVar.l, aVar.m, null, 16640, null);
    }
}
