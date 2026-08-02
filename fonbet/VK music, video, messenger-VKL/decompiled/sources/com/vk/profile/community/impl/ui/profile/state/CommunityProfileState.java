package com.vk.profile.community.impl.ui.profile.state;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.ed0;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.kdh;
import xsna.km50;
import xsna.qoy;
import xsna.r4h;
import xsna.r8h;
import xsna.shy;
import xsna.snz;
import xsna.spg;
import xsna.stc0;
import xsna.t8q0;
import xsna.urd0;
import xsna.xrh;
import xsna.zrp;

/* compiled from: CommunityProfileState.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileState implements km50 {
    public final LifecycleState A;
    public final boolean B;
    public final ExtendedCommunityProfile b;
    public final int c;
    public final CommunityProfileContent d;
    public final ContentTab e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final xrh i;
    public final t8q0 j;
    public final boolean k;
    public final a l;
    public final stc0 m;
    public final List<r4h> n;
    public final d o;
    public final b p;
    public final int q;
    public final boolean r;
    public final ed0 s;
    public final c t;
    public final String u;
    public final List<String> v;
    public final int w;
    public final kdh x;
    public final spg y;
    public final boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityProfileState.kt */
    public static final class LifecycleState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LifecycleState[] $VALUES;
        public static final LifecycleState Created;
        public static final LifecycleState Destroy;
        public static final LifecycleState Pause;
        public static final LifecycleState Resume;

        static {
            LifecycleState lifecycleState = new LifecycleState("Created", 0);
            Created = lifecycleState;
            LifecycleState lifecycleState2 = new LifecycleState("Resume", 1);
            Resume = lifecycleState2;
            LifecycleState lifecycleState3 = new LifecycleState("Pause", 2);
            Pause = lifecycleState3;
            LifecycleState lifecycleState4 = new LifecycleState("Destroy", 3);
            Destroy = lifecycleState4;
            LifecycleState[] lifecycleStateArr = {lifecycleState, lifecycleState2, lifecycleState3, lifecycleState4};
            $VALUES = lifecycleStateArr;
            $ENTRIES = new asp(lifecycleStateArr);
        }

        public LifecycleState() {
            throw null;
        }

        public static LifecycleState valueOf(String str) {
            return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
        }

        public static LifecycleState[] values() {
            return (LifecycleState[]) $VALUES.clone();
        }
    }

    /* compiled from: CommunityProfileState.kt */
    public static final class a {
        public final r8h a;
        public final boolean b;

        public a() {
            this(0);
        }

        public static a a(a aVar, r8h r8hVar, boolean z, int i) {
            if ((i & 1) != 0) {
                r8hVar = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            aVar.getClass();
            return new a(r8hVar, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            r8h r8hVar = this.a;
            return Boolean.hashCode(this.b) + ((r8hVar == null ? 0 : r8hVar.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LiveCoverState(liveCover=");
            sb.append(this.a);
            sb.append(", canShowLiveCover=");
            return q0.a(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this(null, true);
        }

        public a(r8h r8hVar, boolean z) {
            this.a = r8hVar;
            this.b = z;
        }
    }

    /* compiled from: CommunityProfileState.kt */
    public interface b {

        /* compiled from: CommunityProfileState.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -844105498;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: CommunityProfileState.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileState$b$b, reason: collision with other inner class name */
        public static final class C1623b implements b {
            public final boolean a;

            public C1623b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1623b) && this.a == ((C1623b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Loading(isReload="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileState.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1358509210;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: CommunityProfileState.kt */
        public static final class d implements b {
            public final snz a;

            public d(snz snzVar) {
                this.a = snzVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return "Videos(videos=" + this.a + ')';
            }
        }
    }

    /* compiled from: CommunityProfileState.kt */
    public static final class c {
        public final String a;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return epx.f(this.a, cVar.a);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + urd0.a(Boolean.hashCode(false) * 31, 31, this.a);
        }

        public final String toString() {
            return i5s.a(new StringBuilder("SearchState(isEnabled=false, query="), this.a, ", isLoading=false)");
        }

        public c(int i) {
            this.a = "";
        }
    }

    /* compiled from: CommunityProfileState.kt */
    public interface d {

        /* compiled from: CommunityProfileState.kt */
        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1272712624;
            }

            public final String toString() {
                return "JustJoined";
            }
        }

        /* compiled from: CommunityProfileState.kt */
        public static final class b implements d {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Loading(isJoining="), this.a, ')');
            }
        }

        /* compiled from: CommunityProfileState.kt */
        public static final class c implements d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1147128203;
            }

            public final String toString() {
                return "Member";
            }
        }

        /* compiled from: CommunityProfileState.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileState$d$d, reason: collision with other inner class name */
        public static final class C1624d implements d {
            public static final C1624d a = new C1624d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1624d);
            }

            public final int hashCode() {
                return -407857709;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: CommunityProfileState.kt */
        public static final class e implements d {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 638793281;
            }

            public final String toString() {
                return "NotJoined";
            }
        }
    }

    public CommunityProfileState(ExtendedCommunityProfile extendedCommunityProfile, int i, CommunityProfileContent communityProfileContent, ContentTab contentTab, boolean z, boolean z2, boolean z3, xrh xrhVar, t8q0 t8q0Var, boolean z4, a aVar, stc0 stc0Var, List list, d dVar, b bVar, int i2, boolean z5, ed0 ed0Var, c cVar, String str, List list2, int i3, kdh kdhVar, spg spgVar, boolean z6, LifecycleState lifecycleState, boolean z7) {
        this.b = extendedCommunityProfile;
        this.c = i;
        this.d = communityProfileContent;
        this.e = contentTab;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = xrhVar;
        this.j = t8q0Var;
        this.k = z4;
        this.l = aVar;
        this.m = stc0Var;
        this.n = list;
        this.o = dVar;
        this.p = bVar;
        this.q = i2;
        this.r = z5;
        this.s = ed0Var;
        this.t = cVar;
        this.u = str;
        this.v = list2;
        this.w = i3;
        this.x = kdhVar;
        this.y = spgVar;
        this.z = z6;
        this.A = lifecycleState;
        this.B = z7;
    }

    public static CommunityProfileState a(CommunityProfileState communityProfileState, ExtendedCommunityProfile extendedCommunityProfile, int i, CommunityProfileContent communityProfileContent, ContentTab contentTab, boolean z, boolean z2, boolean z3, xrh xrhVar, t8q0 t8q0Var, a aVar, stc0 stc0Var, List list, d dVar, b bVar, int i2, boolean z4, ed0 ed0Var, String str, List list2, int i3, kdh kdhVar, spg spgVar, LifecycleState lifecycleState, boolean z5, int i4) {
        ExtendedCommunityProfile extendedCommunityProfile2 = (i4 & 1) != 0 ? communityProfileState.b : extendedCommunityProfile;
        int i5 = (i4 & 2) != 0 ? communityProfileState.c : i;
        CommunityProfileContent communityProfileContent2 = (i4 & 4) != 0 ? communityProfileState.d : communityProfileContent;
        ContentTab contentTab2 = (i4 & 8) != 0 ? communityProfileState.e : contentTab;
        boolean z6 = (i4 & 16) != 0 ? communityProfileState.f : z;
        communityProfileState.getClass();
        boolean z7 = (i4 & 64) != 0 ? communityProfileState.g : z2;
        boolean z8 = (i4 & 128) != 0 ? communityProfileState.h : z3;
        xrh xrhVar2 = (i4 & 256) != 0 ? communityProfileState.i : xrhVar;
        t8q0 t8q0Var2 = (i4 & 512) != 0 ? communityProfileState.j : t8q0Var;
        boolean z9 = (i4 & 1024) != 0 ? communityProfileState.k : true;
        a aVar2 = (i4 & 2048) != 0 ? communityProfileState.l : aVar;
        stc0 stc0Var2 = (i4 & 4096) != 0 ? communityProfileState.m : stc0Var;
        List list3 = (i4 & 8192) != 0 ? communityProfileState.n : list;
        d dVar2 = (i4 & 16384) != 0 ? communityProfileState.o : dVar;
        b bVar2 = (32768 & i4) != 0 ? communityProfileState.p : bVar;
        int i6 = (65536 & i4) != 0 ? communityProfileState.q : i2;
        boolean z10 = (131072 & i4) != 0 ? communityProfileState.r : z4;
        ed0 ed0Var2 = (262144 & i4) != 0 ? communityProfileState.s : ed0Var;
        c cVar = communityProfileState.t;
        String str2 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? communityProfileState.u : str;
        List list4 = (2097152 & i4) != 0 ? communityProfileState.v : list2;
        int i7 = (4194304 & i4) != 0 ? communityProfileState.w : i3;
        kdh kdhVar2 = (8388608 & i4) != 0 ? communityProfileState.x : kdhVar;
        spg spgVar2 = (16777216 & i4) != 0 ? communityProfileState.y : spgVar;
        boolean z11 = (33554432 & i4) != 0 ? communityProfileState.z : true;
        LifecycleState lifecycleState2 = (67108864 & i4) != 0 ? communityProfileState.A : lifecycleState;
        boolean z12 = (i4 & 134217728) != 0 ? communityProfileState.B : z5;
        communityProfileState.getClass();
        return new CommunityProfileState(extendedCommunityProfile2, i5, communityProfileContent2, contentTab2, z6, z7, z8, xrhVar2, t8q0Var2, z9, aVar2, stc0Var2, list3, dVar2, bVar2, i6, z10, ed0Var2, cVar, str2, list4, i7, kdhVar2, spgVar2, z11, lifecycleState2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityProfileState)) {
            return false;
        }
        CommunityProfileState communityProfileState = (CommunityProfileState) obj;
        return epx.f(this.b, communityProfileState.b) && this.c == communityProfileState.c && epx.f(this.d, communityProfileState.d) && epx.f(this.e, communityProfileState.e) && this.f == communityProfileState.f && this.g == communityProfileState.g && this.h == communityProfileState.h && epx.f(this.i, communityProfileState.i) && epx.f(this.j, communityProfileState.j) && this.k == communityProfileState.k && epx.f(this.l, communityProfileState.l) && epx.f(this.m, communityProfileState.m) && epx.f(this.n, communityProfileState.n) && epx.f(this.o, communityProfileState.o) && epx.f(this.p, communityProfileState.p) && this.q == communityProfileState.q && this.r == communityProfileState.r && epx.f(this.s, communityProfileState.s) && epx.f(this.t, communityProfileState.t) && epx.f(this.u, communityProfileState.u) && epx.f(this.v, communityProfileState.v) && this.w == communityProfileState.w && epx.f(this.x, communityProfileState.x) && epx.f(this.y, communityProfileState.y) && this.z == communityProfileState.z && this.A == communityProfileState.A && this.B == communityProfileState.B;
    }

    public final int hashCode() {
        ExtendedCommunityProfile extendedCommunityProfile = this.b;
        int a2 = shy.a(this.c, (extendedCommunityProfile == null ? 0 : extendedCommunityProfile.hashCode()) * 31, 31);
        CommunityProfileContent communityProfileContent = this.d;
        int hashCode = (a2 + (communityProfileContent == null ? 0 : communityProfileContent.hashCode())) * 31;
        ContentTab contentTab = this.e;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (contentTab == null ? 0 : contentTab.hashCode())) * 31, 31, this.f), 31, false), 31, this.g), 31, this.h);
        xrh xrhVar = this.i;
        int hashCode2 = (b2 + (xrhVar == null ? 0 : xrhVar.hashCode())) * 31;
        t8q0 t8q0Var = this.j;
        int b3 = qoy.b(shy.a(this.q, (this.p.hashCode() + ((this.o.hashCode() + fw3.a((this.m.hashCode() + ((this.l.hashCode() + qoy.b((hashCode2 + (t8q0Var == null ? 0 : Boolean.hashCode(t8q0Var.a))) * 31, 31, this.k)) * 31)) * 31, 31, this.n)) * 31)) * 31, 31), 31, this.r);
        ed0 ed0Var = this.s;
        int hashCode3 = (this.t.hashCode() + ((b3 + (ed0Var == null ? 0 : ed0Var.hashCode())) * 31)) * 31;
        String str = this.u;
        int a3 = shy.a(this.w, fw3.a((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.v), 31);
        kdh kdhVar = this.x;
        int hashCode4 = (a3 + (kdhVar == null ? 0 : kdhVar.hashCode())) * 31;
        spg spgVar = this.y;
        int b4 = qoy.b((hashCode4 + (spgVar == null ? 0 : spgVar.hashCode())) * 31, 31, this.z);
        LifecycleState lifecycleState = this.A;
        return Boolean.hashCode(this.B) + ((b4 + (lifecycleState != null ? lifecycleState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileState(community=");
        sb.append(this.b);
        sb.append(", communityGeneration=");
        sb.append(this.c);
        sb.append(", content=");
        sb.append(this.d);
        sb.append(", selectedTab=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isLiveCoverLoading=false, isError=");
        sb.append(this.g);
        sb.append(", isReloading=");
        sb.append(this.h);
        sb.append(", communityProfileOnboarding=");
        sb.append(this.i);
        sb.append(", shouldUpdateCommunityOnResume=");
        sb.append(this.j);
        sb.append(", isWallInitialized=");
        sb.append(this.k);
        sb.append(", liveCoverState=");
        sb.append(this.l);
        sb.append(", postsButtons=");
        sb.append(this.m);
        sb.append(", headerItems=");
        sb.append(this.n);
        sb.append(", toolbarSubscribeActionsState=");
        sb.append(this.o);
        sb.append(", liveVideosState=");
        sb.append(this.p);
        sb.append(", failedStoriesCount=");
        sb.append(this.q);
        sb.append(", isNewCommunity=");
        sb.append(this.r);
        sb.append(", adBloggerBannerData=");
        sb.append(this.s);
        sb.append(", searchState=");
        sb.append(this.t);
        sb.append(", avatarChangeSource=");
        sb.append(this.u);
        sb.append(", avatarAlbumPhotoUrls=");
        sb.append(this.v);
        sb.append(", authorHeaderSettledMediaPageIndex=");
        sb.append(this.w);
        sb.append(", priorityBlockData=");
        sb.append(this.x);
        sb.append(", adBannerData=");
        sb.append(this.y);
        sb.append(", isAdBannerLoaded=");
        sb.append(this.z);
        sb.append(", lifecycle=");
        sb.append(this.A);
        sb.append(", actionLoading=");
        return q0.a(sb, this.B, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommunityProfileState(CommunityProfileContent communityProfileContent) {
        this(null, 0, communityProfileContent, null, false, false, false, null, null, false, r11, r12, r13, d.C1624d.a, b.c.a, 0, false, null, new c(0), null, r13, 0, null, null, false, null, false);
        a aVar = new a(0);
        stc0 stc0Var = new stc0(0, 0, 0);
        EmptyList emptyList = EmptyList.b;
    }
}
