package com.vk.catalog2.common.dto.api.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.i7o0;
import xsna.urd0;

/* compiled from: UIBlock.kt */
/* loaded from: classes16.dex */
public final class a {
    public final String a;
    public final String b;
    public final CatalogViewType c;
    public final CatalogDataType d;
    public final String e;
    public final UserId f;
    public final List<String> g;
    public final Set<UIBlockDragDropAction> h;
    public final UIBlockHint i;
    public final CatalogViewStyle j;
    public final String k;
    public final CatalogOnboardingInfo l;
    public final CatalogLaunchOrigin m;

    /* compiled from: UIBlock.kt */
    /* renamed from: com.vk.catalog2.common.dto.api.ui.a$a, reason: collision with other inner class name */
    public static final class C0482a {
        public static a a(UIBlock uIBlock) {
            String str = uIBlock.b;
            String str2 = uIBlock.c;
            CatalogViewType catalogViewType = uIBlock.d;
            CatalogDataType catalogDataType = uIBlock.e;
            String str3 = uIBlock.f;
            UserId a = UserId.a(uIBlock.g);
            ArrayList a2 = i7o0.a(uIBlock.h);
            AtomicLong atomicLong = UIBlock.x;
            Set<UIBlockDragDropAction> Db = uIBlock.Db();
            HashSet hashSet = new HashSet();
            Iterator<UIBlockDragDropAction> it = Db.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zb());
            }
            UIBlockHint uIBlockHint = uIBlock.j;
            UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
            CatalogViewStyle catalogViewStyle = uIBlock.l;
            CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
            String str4 = uIBlock.m;
            CatalogOnboardingInfo catalogOnboardingInfo = uIBlock.n;
            return new a(str, str2, catalogViewType, catalogDataType, str3, a, a2, hashSet, zb, copy, str4, catalogOnboardingInfo != null ? CatalogOnboardingInfo.zb(catalogOnboardingInfo) : null, uIBlock.p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, String str2, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str3, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogViewStyle catalogViewStyle, String str4, CatalogOnboardingInfo catalogOnboardingInfo, CatalogLaunchOrigin catalogLaunchOrigin) {
        this.a = str;
        this.b = str2;
        this.c = catalogViewType;
        this.d = catalogDataType;
        this.e = str3;
        this.f = userId;
        this.g = list;
        this.h = set;
        this.i = uIBlockHint;
        this.j = catalogViewStyle;
        this.k = str4;
        this.l = catalogOnboardingInfo;
        this.m = catalogLaunchOrigin;
    }

    public static a a(a aVar, String str, String str2, CatalogViewType catalogViewType, CatalogDataType catalogDataType, UserId userId, CatalogViewStyle catalogViewStyle, int i) {
        return new a((i & 1) != 0 ? aVar.a : str, (i & 2) != 0 ? aVar.b : str2, (i & 4) != 0 ? aVar.c : catalogViewType, (i & 8) != 0 ? aVar.d : catalogDataType, aVar.e, (i & 32) != 0 ? aVar.f : userId, aVar.g, aVar.h, aVar.i, (i & 512) != 0 ? aVar.j : catalogViewStyle, aVar.k, aVar.l, aVar.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && this.m == aVar.m;
    }

    public final int hashCode() {
        int b = fw3.b(fw3.a(bh10.a(urd0.a((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f.b), 31, this.g), 31, this.h);
        UIBlockHint uIBlockHint = this.i;
        int hashCode = (b + (uIBlockHint == null ? 0 : uIBlockHint.hashCode())) * 31;
        CatalogViewStyle catalogViewStyle = this.j;
        int hashCode2 = (hashCode + (catalogViewStyle == null ? 0 : catalogViewStyle.hashCode())) * 31;
        String str = this.k;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CatalogOnboardingInfo catalogOnboardingInfo = this.l;
        return this.m.hashCode() + ((hashCode3 + (catalogOnboardingInfo != null ? catalogOnboardingInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UIBlockParams(blockId=" + this.a + ", sectionId=" + this.b + ", viewType=" + this.c + ", dataType=" + this.d + ", ref=" + this.e + ", ownerId=" + this.f + ", reactOnEvents=" + this.g + ", dragNDropActions=" + this.h + ", hint=" + this.i + ", viewStyle=" + this.j + ", anchor=" + this.k + ", audioOnboarding=" + this.l + ", launchOrigin=" + this.m + ')';
    }

    public /* synthetic */ a(String str, String str2, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str3, UserId userId, List list, Set set, UIBlockHint uIBlockHint, CatalogViewStyle catalogViewStyle, CatalogOnboardingInfo catalogOnboardingInfo, CatalogLaunchOrigin catalogLaunchOrigin, int i) {
        this(str, str2, catalogViewType, catalogDataType, str3, userId, (List<String>) list, (Set<? extends UIBlockDragDropAction>) set, (i & 256) != 0 ? null : uIBlockHint, (i & 512) != 0 ? null : catalogViewStyle, (String) null, (i & 2048) != 0 ? null : catalogOnboardingInfo, (i & 4096) != 0 ? CatalogLaunchOrigin.UNKNOWN : catalogLaunchOrigin);
    }
}
