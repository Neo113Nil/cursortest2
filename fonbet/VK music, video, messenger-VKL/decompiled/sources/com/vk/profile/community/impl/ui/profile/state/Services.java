package com.vk.profile.community.impl.ui.profile.state;

import com.vk.dto.common.GoodAlbum;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.List;
import xsna.asp;
import xsna.e11;
import xsna.epx;
import xsna.osi0;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class Services extends CommunityProfileContentItem {
    public final osi0 j;
    public final List<GoodAlbum> k;
    public final CommunityProfileContentItem.ContentType l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ViewType q;
    public final String r;
    public final e11 s;
    public final String t;
    public final CommunityProfileContentItem.b u;
    public final CommunityProfileContentItem.c v;
    public final CommunityProfileContentItem.State w;
    public final CommunityProfileContentItem.State x;
    public final CommunityProfileContentItem.d y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityProfileContentItem.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final a Companion;
        public static final ViewType VIEW_TYPE_CARDS;
        public static final ViewType VIEW_TYPE_ROWS;

        /* compiled from: CommunityProfileContentItem.kt */
        public static final class a {
        }

        static {
            ViewType viewType = new ViewType("VIEW_TYPE_CARDS", 0);
            VIEW_TYPE_CARDS = viewType;
            ViewType viewType2 = new ViewType("VIEW_TYPE_ROWS", 1);
            VIEW_TYPE_ROWS = viewType2;
            ViewType[] viewTypeArr = {viewType, viewType2};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
            Companion = new a();
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Services(osi0 osi0Var, List<? extends GoodAlbum> list, CommunityProfileContentItem.ContentType contentType, boolean z, boolean z2, boolean z3, boolean z4, ViewType viewType, String str, e11 e11Var, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.d dVar) {
        super(new ContentTab.Service(0), osi0Var != null ? osi0Var.a.size() : 0, bVar, cVar, state, null, state2, 13, null, 1536);
        this.j = osi0Var;
        this.k = list;
        this.l = contentType;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = viewType;
        this.r = str;
        this.s = e11Var;
        this.t = str2;
        this.u = bVar;
        this.v = cVar;
        this.w = state;
        this.x = state2;
        this.y = dVar;
    }

    public static Services i(Services services, osi0 osi0Var, List list, CommunityProfileContentItem.ContentType contentType, boolean z, boolean z2, ViewType viewType, String str, e11 e11Var, String str2, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        osi0 osi0Var2 = (i & 1) != 0 ? services.j : osi0Var;
        List list2 = (i & 2) != 0 ? services.k : list;
        CommunityProfileContentItem.ContentType contentType2 = (i & 4) != 0 ? services.l : contentType;
        boolean z3 = services.m;
        boolean z4 = services.n;
        boolean z5 = (i & 32) != 0 ? services.o : z;
        boolean z6 = (i & 64) != 0 ? services.p : z2;
        ViewType viewType2 = (i & 128) != 0 ? services.q : viewType;
        String str3 = (i & 256) != 0 ? services.r : str;
        e11 e11Var2 = (i & 512) != 0 ? services.s : e11Var;
        String str4 = (i & 1024) != 0 ? services.t : str2;
        CommunityProfileContentItem.b bVar = services.u;
        CommunityProfileContentItem.c cVar = services.v;
        CommunityProfileContentItem.State state3 = (i & 8192) != 0 ? services.w : state;
        CommunityProfileContentItem.State state4 = (i & 16384) != 0 ? services.x : state2;
        CommunityProfileContentItem.d dVar = services.y;
        services.getClass();
        return new Services(osi0Var2, list2, contentType2, z3, z4, z5, z6, viewType2, str3, e11Var2, str4, bVar, cVar, state3, state4, dVar);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.u;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.v;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.y;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Services)) {
            return false;
        }
        Services services = (Services) obj;
        return epx.f(this.j, services.j) && epx.f(this.k, services.k) && this.l == services.l && this.m == services.m && this.n == services.n && this.o == services.o && this.p == services.p && this.q == services.q && epx.f(this.r, services.r) && epx.f(this.s, services.s) && epx.f(this.t, services.t) && epx.f(this.u, services.u) && epx.f(this.v, services.v) && this.w == services.w && this.x == services.x && epx.f(this.y, services.y);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.w;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final int h() {
        int h = super.h() * 31;
        osi0 osi0Var = this.j;
        return h + (osi0Var != null ? osi0Var.hashCode() : 0);
    }

    public final int hashCode() {
        osi0 osi0Var = this.j;
        int hashCode = (osi0Var == null ? 0 : osi0Var.hashCode()) * 31;
        List<GoodAlbum> list = this.k;
        int hashCode2 = (this.q.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.l.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31;
        String str = this.r;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        e11 e11Var = this.s;
        int hashCode4 = (hashCode3 + (e11Var == null ? 0 : e11Var.hashCode())) * 31;
        String str2 = this.t;
        int a = j.a(this.x, j.a(this.w, shy.a(this.v.a, (this.u.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31), 31);
        CommunityProfileContentItem.d dVar = this.y;
        return a + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Services(services=" + this.j + ", servicesAlbums=" + this.k + ", contentType=" + this.l + ", canAdd=" + this.m + ", showMore=" + this.n + ", hasMore=" + this.o + ", hasMoreMixedAlbums=" + this.p + ", viewTypeServices=" + this.q + ", editUrl=" + this.r + ", adsMarketServicesPromote=" + this.s + ", nextFrom=" + this.t + ", empty=" + this.u + ", error=" + this.v + ", state=" + this.w + ", loadMoreState=" + this.x + ", fabState=" + this.y + ')';
    }
}
