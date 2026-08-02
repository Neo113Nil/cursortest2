package com.vk.fullscreenvideo;

import com.vk.fullscreenvideo.a;
import com.vk.fullscreenvideo.design.view.bottom.a;
import defpackage.q0;
import xsna.asp;
import xsna.b0a0;
import xsna.epx;
import xsna.hkq0;
import xsna.m9o;
import xsna.qoy;
import xsna.xow;
import xsna.zrp;

/* compiled from: ControlsState.kt */
/* loaded from: classes16.dex */
public abstract class ControlsState {
    public final xow<a.d> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ControlsState.kt */
    public static final class CastStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CastStatus[] $VALUES;
        public static final CastStatus CONNECTED;
        public static final CastStatus DISCONNECTED;
        public static final CastStatus UNAVAILABLE;

        static {
            CastStatus castStatus = new CastStatus("CONNECTED", 0);
            CONNECTED = castStatus;
            CastStatus castStatus2 = new CastStatus("DISCONNECTED", 1);
            DISCONNECTED = castStatus2;
            CastStatus castStatus3 = new CastStatus("UNAVAILABLE", 2);
            UNAVAILABLE = castStatus3;
            CastStatus[] castStatusArr = {castStatus, castStatus2, castStatus3};
            $VALUES = castStatusArr;
            $ENTRIES = new asp(castStatusArr);
        }

        public CastStatus() {
            throw null;
        }

        public static CastStatus valueOf(String str) {
            return (CastStatus) Enum.valueOf(CastStatus.class, str);
        }

        public static CastStatus[] values() {
            return (CastStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ControlsState.kt */
    public static final class Like {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Like[] $VALUES;
        public static final Like LIKED;
        public static final Like NOT_LIKED;
        public static final Like UNAVAILABLE;

        static {
            Like like = new Like("LIKED", 0);
            LIKED = like;
            Like like2 = new Like("NOT_LIKED", 1);
            NOT_LIKED = like2;
            Like like3 = new Like("UNAVAILABLE", 2);
            UNAVAILABLE = like3;
            Like[] likeArr = {like, like2, like3};
            $VALUES = likeArr;
            $ENTRIES = new asp(likeArr);
        }

        public Like() {
            throw null;
        }

        public static Like valueOf(String str) {
            return (Like) Enum.valueOf(Like.class, str);
        }

        public static Like[] values() {
            return (Like[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ControlsState.kt */
    public static final class ResizeStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResizeStatus[] $VALUES;
        public static final ResizeStatus CROP;
        public static final ResizeStatus FIT;
        public static final ResizeStatus UNAVAILABLE;

        static {
            ResizeStatus resizeStatus = new ResizeStatus("FIT", 0);
            FIT = resizeStatus;
            ResizeStatus resizeStatus2 = new ResizeStatus("CROP", 1);
            CROP = resizeStatus2;
            ResizeStatus resizeStatus3 = new ResizeStatus("UNAVAILABLE", 2);
            UNAVAILABLE = resizeStatus3;
            ResizeStatus[] resizeStatusArr = {resizeStatus, resizeStatus2, resizeStatus3};
            $VALUES = resizeStatusArr;
            $ENTRIES = new asp(resizeStatusArr);
        }

        public ResizeStatus() {
            throw null;
        }

        public static ResizeStatus valueOf(String str) {
            return (ResizeStatus) Enum.valueOf(ResizeStatus.class, str);
        }

        public static ResizeStatus[] values() {
            return (ResizeStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ControlsState.kt */
    public static final class ScreenState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenState[] $VALUES;
        public static final ScreenState DISCOVERY;
        public static final ScreenState FULLSCREEN;
        public static final ScreenState TRANSITION;

        static {
            ScreenState screenState = new ScreenState("FULLSCREEN", 0);
            FULLSCREEN = screenState;
            ScreenState screenState2 = new ScreenState("DISCOVERY", 1);
            DISCOVERY = screenState2;
            ScreenState screenState3 = new ScreenState("TRANSITION", 2);
            TRANSITION = screenState3;
            ScreenState[] screenStateArr = {screenState, screenState2, screenState3};
            $VALUES = screenStateArr;
            $ENTRIES = new asp(screenStateArr);
        }

        public ScreenState() {
            throw null;
        }

        public static ScreenState valueOf(String str) {
            return (ScreenState) Enum.valueOf(ScreenState.class, str);
        }

        public static ScreenState[] values() {
            return (ScreenState[]) $VALUES.clone();
        }
    }

    /* compiled from: ControlsState.kt */
    public static final class a extends ControlsState {
        public final boolean b;
        public final boolean c;
        public final xow<a.C1075a> d;
        public final m9o e;
        public final boolean f;
        public final boolean g;
        public final xow<a.d> h;
        public final c i;
        public final boolean j;
        public final ScreenState k;

        public a(boolean z, boolean z2, xow xowVar, m9o m9oVar, boolean z3, boolean z4, xow xowVar2, c cVar, boolean z5, ScreenState screenState) {
            super(xowVar2);
            this.b = z;
            this.c = z2;
            this.d = xowVar;
            this.e = m9oVar;
            this.f = z3;
            this.g = z4;
            this.h = xowVar2;
            this.i = cVar;
            this.j = z5;
            this.k = screenState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, boolean z, b0a0 b0a0Var, m9o m9oVar, boolean z2, boolean z3, b0a0 b0a0Var2, c cVar, boolean z4, ScreenState screenState, int i) {
            boolean z5 = z;
            boolean z6 = aVar.b;
            if ((i & 2) != 0) {
                z5 = aVar.c;
            }
            xow xowVar = b0a0Var;
            if ((i & 4) != 0) {
                xowVar = aVar.d;
            }
            if ((i & 8) != 0) {
                m9oVar = aVar.e;
            }
            if ((i & 16) != 0) {
                z2 = aVar.f;
            }
            if ((i & 32) != 0) {
                z3 = aVar.g;
            }
            xow xowVar2 = b0a0Var2;
            if ((i & 64) != 0) {
                xowVar2 = aVar.h;
            }
            if ((i & 128) != 0) {
                cVar = aVar.i;
            }
            if ((i & 256) != 0) {
                z4 = aVar.j;
            }
            if ((i & 512) != 0) {
                screenState = aVar.k;
            }
            ScreenState screenState2 = screenState;
            aVar.getClass();
            aVar.getClass();
            boolean z7 = z4;
            c cVar2 = cVar;
            xow xowVar3 = xowVar2;
            boolean z8 = z3;
            boolean z9 = z2;
            m9o m9oVar2 = m9oVar;
            return new a(z6, z5, xowVar, m9oVar2, z9, z8, xowVar3, cVar2, z7, screenState2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + ((this.k.hashCode() + qoy.b((this.i.hashCode() + ((this.h.hashCode() + qoy.b(qoy.b((this.e.hashCode() + ((this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j)) * 31);
        }

        public final String toString() {
            return "Bottom(isTablet=" + this.b + ", countersEnabled=" + this.c + ", previews=" + this.d + ", downloadProgress=" + this.e + ", shouldShowDownloadControl=" + this.f + ", shouldHideShareButton=" + this.g + ", controls=" + this.h + ", videoState=" + this.i + ", isLandscape=" + this.j + ", screenState=" + this.k + ", shouldShowFeedback=false)";
        }
    }

    /* compiled from: ControlsState.kt */
    public static final class b extends ControlsState {
        public final boolean b;
        public final hkq0 c;
        public final Integer d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final a k;
        public final boolean l;
        public final xow<a.d> m;
        public final c n;
        public final boolean o;
        public final ScreenState p;
        public final boolean q;

        /* compiled from: ControlsState.kt */
        public static final class a {
            public final ScreenState a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final boolean g;
            public final boolean h;

            public a() {
                this(0);
            }

            public static a a(a aVar, ScreenState screenState, boolean z, int i) {
                if ((i & 1) != 0) {
                    screenState = aVar.a;
                }
                ScreenState screenState2 = screenState;
                boolean z2 = aVar.b;
                boolean z3 = aVar.c;
                boolean z4 = aVar.d;
                boolean z5 = aVar.e;
                boolean z6 = aVar.f;
                boolean z7 = aVar.g;
                if ((i & 128) != 0) {
                    z = aVar.h;
                }
                aVar.getClass();
                return new a(screenState2, z2, z3, z4, z5, z6, z7, z);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SubscribeButtonState(screenState=");
                sb.append(this.a);
                sb.append(", isLandscape=");
                sb.append(this.b);
                sb.append(", isHorizontalRedesignEnabled=");
                sb.append(this.c);
                sb.append(", isVerticalRedesignEnabled=");
                sb.append(this.d);
                sb.append(", isSubscribeButtonEnabled=");
                sb.append(this.e);
                sb.append(", canShowSubscribe=");
                sb.append(this.f);
                sb.append(", isSubscribed=");
                sb.append(this.g);
                sb.append(", isSmallScreen=");
                return q0.a(sb, this.h, ')');
            }

            public a(ScreenState screenState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
                this.a = screenState;
                this.b = z;
                this.c = z2;
                this.d = z3;
                this.e = z4;
                this.f = z5;
                this.g = z6;
                this.h = z7;
            }

            public /* synthetic */ a(int i) {
                this(ScreenState.DISCOVERY, false, false, false, false, false, false, false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, hkq0 hkq0Var, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar, boolean z8, xow<? extends a.d> xowVar, c cVar, boolean z9, ScreenState screenState, boolean z10) {
            super(xowVar);
            this.b = z;
            this.c = hkq0Var;
            this.d = num;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = z6;
            this.j = z7;
            this.k = aVar;
            this.l = z8;
            this.m = xowVar;
            this.n = cVar;
            this.o = z9;
            this.p = screenState;
            this.q = z10;
        }

        public static b a(b bVar, boolean z, hkq0 hkq0Var, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, a aVar, boolean z7, b0a0 b0a0Var, c cVar, boolean z8, ScreenState screenState, boolean z9, int i) {
            boolean z10 = (i & 1) != 0 ? bVar.b : z;
            hkq0 hkq0Var2 = (i & 2) != 0 ? bVar.c : hkq0Var;
            Integer num2 = (i & 4) != 0 ? bVar.d : num;
            boolean z11 = (i & 8) != 0 ? bVar.e : z2;
            boolean z12 = (i & 16) != 0 ? bVar.f : false;
            boolean z13 = (i & 32) != 0 ? bVar.g : z3;
            boolean z14 = (i & 64) != 0 ? bVar.h : z4;
            boolean z15 = (i & 128) != 0 ? bVar.i : z5;
            boolean z16 = (i & 256) != 0 ? bVar.j : z6;
            a aVar2 = (i & 512) != 0 ? bVar.k : aVar;
            boolean z17 = (i & 1024) != 0 ? bVar.l : z7;
            xow<a.d> xowVar = (i & 2048) != 0 ? bVar.m : b0a0Var;
            c cVar2 = (i & 4096) != 0 ? bVar.n : cVar;
            boolean z18 = (i & 8192) != 0 ? bVar.o : z8;
            boolean z19 = z10;
            ScreenState screenState2 = (i & 16384) != 0 ? bVar.p : screenState;
            boolean z20 = (i & 32768) != 0 ? bVar.q : z9;
            bVar.getClass();
            return new b(z19, hkq0Var2, num2, z11, z12, z13, z14, z15, z16, aVar2, z17, xowVar, cVar2, z18, screenState2, z20);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && epx.f(this.k, bVar.k) && this.l == bVar.l && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n) && this.o == bVar.o && this.p == bVar.p && this.q == bVar.q;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31;
            Integer num = this.d;
            return Boolean.hashCode(this.q) + ((this.p.hashCode() + qoy.b((this.n.hashCode() + ((this.m.hashCode() + qoy.b((this.k.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l)) * 31)) * 31, 31, this.o)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Top(isTablet=");
            sb.append(this.b);
            sb.append(", userInfo=");
            sb.append(this.c);
            sb.append(", message=");
            sb.append(this.d);
            sb.append(", isMessageVisible=");
            sb.append(this.e);
            sb.append(", isNavigationToAuthorDisabled=");
            sb.append(this.f);
            sb.append(", isSmallScreen=");
            sb.append(this.g);
            sb.append(", isAutoplayEnabled=");
            sb.append(this.h);
            sb.append(", isAutoplayInactive=");
            sb.append(this.i);
            sb.append(", shouldShowAutoplay=");
            sb.append(this.j);
            sb.append(", subscribeButton=");
            sb.append(this.k);
            sb.append(", isDiscoveryRedesignEnabled=");
            sb.append(this.l);
            sb.append(", controls=");
            sb.append(this.m);
            sb.append(", videoState=");
            sb.append(this.n);
            sb.append(", isLandscape=");
            sb.append(this.o);
            sb.append(", screenState=");
            sb.append(this.p);
            sb.append(", shouldShowFeedback=");
            return q0.a(sb, this.q, ')');
        }
    }

    /* compiled from: ControlsState.kt */
    public static final class c {
        public final CastStatus a;
        public final ResizeStatus b;
        public final Like c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public c() {
            this(0);
        }

        public static c a(c cVar, CastStatus castStatus, ResizeStatus resizeStatus, Like like, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
            if ((i & 1) != 0) {
                castStatus = cVar.a;
            }
            CastStatus castStatus2 = castStatus;
            if ((i & 2) != 0) {
                resizeStatus = cVar.b;
            }
            ResizeStatus resizeStatus2 = resizeStatus;
            if ((i & 4) != 0) {
                like = cVar.c;
            }
            Like like2 = like;
            if ((i & 8) != 0) {
                z = cVar.d;
            }
            boolean z7 = z;
            if ((i & 16) != 0) {
                z2 = cVar.e;
            }
            boolean z8 = z2;
            boolean z9 = (i & 32) != 0 ? cVar.f : z3;
            boolean z10 = (i & 64) != 0 ? cVar.g : z4;
            boolean z11 = (i & 128) != 0 ? cVar.h : z5;
            boolean z12 = (i & 256) != 0 ? cVar.i : z6;
            cVar.getClass();
            return new c(castStatus2, resizeStatus2, like2, z7, z8, z9, z10, z11, z12);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoState(castStatus=");
            sb.append(this.a);
            sb.append(", resizeStatus=");
            sb.append(this.b);
            sb.append(", like=");
            sb.append(this.c);
            sb.append(", canDownload=");
            sb.append(this.d);
            sb.append(", canRepost=");
            sb.append(this.e);
            sb.append(", inPlaylist=");
            sb.append(this.f);
            sb.append(", commentsDisabled=");
            sb.append(this.g);
            sb.append(", isFave=");
            sb.append(this.h);
            sb.append(", canAddToWatchLater=");
            return q0.a(sb, this.i, ')');
        }

        public c(CastStatus castStatus, ResizeStatus resizeStatus, Like like, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.a = castStatus;
            this.b = resizeStatus;
            this.c = like;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = z6;
        }

        public /* synthetic */ c(int i) {
            this(CastStatus.UNAVAILABLE, ResizeStatus.UNAVAILABLE, Like.UNAVAILABLE, false, false, false, false, false, false);
        }
    }

    public ControlsState(xow xowVar) {
        this.a = xowVar;
    }
}
