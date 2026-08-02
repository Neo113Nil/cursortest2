package com.vk.profile.community.impl.ui.profile.state;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.photo.Photo;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao50;
import xsna.asp;
import xsna.at;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.fw3;
import xsna.h0u0;
import xsna.ms9;
import xsna.qoy;
import xsna.r4h;
import xsna.r8h;
import xsna.shy;
import xsna.stc0;
import xsna.xrh;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: CommunityProfileViewState.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileViewState implements ao50 {
    public final fi50 a;

    public CommunityProfileViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }

    /* compiled from: CommunityProfileViewState.kt */
    public static final class Data implements fm50<CommunityProfileState> {
        public final yzt0<LoadingState> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<a> d;
        public final yzt0<e> e;
        public final yzt0<b> f;
        public final yzt0<Boolean> g;
        public final yzt0<Boolean> h;
        public final yzt0<Boolean> i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityProfileViewState.kt */
        public static final class LoadingState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ LoadingState[] $VALUES;
            public static final LoadingState ACTION_LOADING;
            public static final LoadingState LIVE_COVER;
            public static final LoadingState NONE;
            public static final LoadingState STATIC_COVER;

            static {
                LoadingState loadingState = new LoadingState("NONE", 0);
                NONE = loadingState;
                LoadingState loadingState2 = new LoadingState("STATIC_COVER", 1);
                STATIC_COVER = loadingState2;
                LoadingState loadingState3 = new LoadingState("LIVE_COVER", 2);
                LIVE_COVER = loadingState3;
                LoadingState loadingState4 = new LoadingState("ACTION_LOADING", 3);
                ACTION_LOADING = loadingState4;
                LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
                $VALUES = loadingStateArr;
                $ENTRIES = new asp(loadingStateArr);
            }

            public LoadingState() {
                throw null;
            }

            public static LoadingState valueOf(String str) {
                return (LoadingState) Enum.valueOf(LoadingState.class, str);
            }

            public static LoadingState[] values() {
                return (LoadingState[]) $VALUES.clone();
            }
        }

        /* compiled from: CommunityProfileViewState.kt */
        public static final class a {
            public final ExtendedCommunityProfile a;
            public final c b;
            public final stc0 c;
            public final xrh d;
            public final List<r4h> e;

            public a(ExtendedCommunityProfile extendedCommunityProfile, c cVar, stc0 stc0Var, xrh xrhVar, List<r4h> list) {
                this.a = extendedCommunityProfile;
                this.b = cVar;
                this.c = stc0Var;
                this.d = xrhVar;
                this.e = list;
            }
        }

        /* compiled from: CommunityProfileViewState.kt */
        public static final class b {
            public final CommunityProfileContent a;
            public final xrh.d b;
            public final ExtendedCommunityProfile c;

            public b(CommunityProfileContent communityProfileContent, xrh.d dVar, ExtendedCommunityProfile extendedCommunityProfile) {
                this.a = communityProfileContent;
                this.b = dVar;
                this.c = extendedCommunityProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                xrh.d dVar = this.b;
                int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                ExtendedCommunityProfile extendedCommunityProfile = this.c;
                return hashCode2 + (extendedCommunityProfile != null ? extendedCommunityProfile.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CommunityProfileContentWrapper(content=");
                sb.append(this.a);
                sb.append(", onboarding=");
                sb.append(this.b);
                sb.append(", community=");
                return at.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityProfileViewState.kt */
        public static abstract class c {

            /* compiled from: CommunityProfileViewState.kt */
            public static final class a extends c {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1749426824;
                }

                public final String toString() {
                    return "HiddenCover";
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class b extends c {
                public final r8h a;

                public b(r8h r8hVar) {
                    this.a = r8hVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "LiveCover(cover=" + this.a + ')';
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState$Data$c$c, reason: collision with other inner class name */
            public static abstract class AbstractC1625c extends c {

                /* compiled from: CommunityProfileViewState.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState$Data$c$c$a */
                public static final class a extends AbstractC1625c {
                    public static final a a = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 920132289;
                    }

                    public final String toString() {
                        return "DeactivatedCover";
                    }
                }

                /* compiled from: CommunityProfileViewState.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState$Data$c$c$b */
                public static final class b extends AbstractC1625c {
                    public final String a;

                    public b(String str) {
                        this.a = str;
                    }
                }

                /* compiled from: CommunityProfileViewState.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState$Data$c$c$c, reason: collision with other inner class name */
                public static final class C1626c extends AbstractC1625c {
                    public final Photo a;
                    public final String b;
                    public final boolean c;

                    public C1626c(Photo photo, String str, boolean z) {
                        this.a = photo;
                        this.b = str;
                        this.c = z;
                    }
                }

                /* compiled from: CommunityProfileViewState.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState$Data$c$c$d */
                public static final class d extends AbstractC1625c {
                    public static final d a = new d();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof d);
                    }

                    public final int hashCode() {
                        return -1254415170;
                    }

                    public final String toString() {
                        return "NotUploadedCover";
                    }
                }
            }
        }

        /* compiled from: CommunityProfileViewState.kt */
        public static abstract class d {

            /* compiled from: CommunityProfileViewState.kt */
            public static final class a extends d {
                public static final a a = new a();
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class b extends d {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -843707001;
                }

                public final String toString() {
                    return "JoinTextButton";
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class c extends d {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -465062829;
                }

                public final String toString() {
                    return "JustJoined";
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState$Data$d$d, reason: collision with other inner class name */
            public static final class C1627d extends d {
                public final boolean a;

                public C1627d(boolean z) {
                    this.a = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1627d) && this.a == ((C1627d) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("Loading(directionClockwise="), this.a, ')');
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class f extends d {
                public static final f a = new f();
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class g extends d {
                public final boolean a;

                public g(boolean z) {
                    this.a = z;
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class h extends d {
                public static final h a = new h();
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class e extends d {
                public final xrh.d.g a;

                public e(xrh.d.g gVar) {
                    this.a = gVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    xrh.d.g gVar = this.a;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public final String toString() {
                    return "Manage(onboarding=" + this.a + ')';
                }

                public e() {
                    this(null);
                }
            }
        }

        public Data(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
        }

        /* compiled from: CommunityProfileViewState.kt */
        public static abstract class e {

            /* compiled from: CommunityProfileViewState.kt */
            public static final class a extends e {
                public final List<d> a;

                /* JADX WARN: Multi-variable type inference failed */
                public a(List<? extends d> list) {
                    this.a = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("Legacy(items="), this.a);
                }
            }

            /* compiled from: CommunityProfileViewState.kt */
            public static final class b extends e {
                public static final b i = new b(null, EmptyList.b, false, 0, 0, PsExtractor.VIDEO_STREAM_MASK);
                public final ExtendedCommunityProfile a;
                public final List<d> b;
                public final boolean c;
                public final int d;
                public final int e;
                public final boolean f;
                public final boolean g;
                public final boolean h;

                /* JADX WARN: Multi-variable type inference failed */
                public b(ExtendedCommunityProfile extendedCommunityProfile, List<? extends d> list, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
                    this.a = extendedCommunityProfile;
                    this.b = list;
                    this.c = z;
                    this.d = i2;
                    this.e = i3;
                    this.f = z2;
                    this.g = z3;
                    this.h = z4;
                }

                public static b a(b bVar, boolean z, boolean z2, boolean z3, int i2) {
                    ExtendedCommunityProfile extendedCommunityProfile = bVar.a;
                    List<d> list = bVar.b;
                    boolean z4 = bVar.c;
                    int i3 = bVar.d;
                    int i4 = bVar.e;
                    if ((i2 & 32) != 0) {
                        z = bVar.f;
                    }
                    bVar.getClass();
                    return new b(extendedCommunityProfile, list, z4, i3, i4, z, z2, z3);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
                }

                public final int hashCode() {
                    ExtendedCommunityProfile extendedCommunityProfile = this.a;
                    return Boolean.hashCode(this.h) + qoy.b(qoy.b(shy.a(this.e, shy.a(this.d, qoy.b(fw3.a((extendedCommunityProfile == null ? 0 : extendedCommunityProfile.hashCode()) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Lego(community=");
                    sb.append(this.a);
                    sb.append(", items=");
                    sb.append(this.b);
                    sb.append(", isLiveCover=");
                    sb.append(this.c);
                    sb.append(", mediaPageCount=");
                    sb.append(this.d);
                    sb.append(", failedStoriesCount=");
                    sb.append(this.e);
                    sb.append(", hasLoadedContent=");
                    sb.append(this.f);
                    sb.append(", isLoadingSkeletonVisible=");
                    sb.append(this.g);
                    sb.append(", isErrorPlaceholderVisible=");
                    return q0.a(sb, this.h, ')');
                }

                public /* synthetic */ b(ExtendedCommunityProfile extendedCommunityProfile, List list, boolean z, int i2, int i3, int i4) {
                    this(extendedCommunityProfile, list, z, i2, (i4 & 16) != 0 ? 0 : i3, false, false, false);
                }
            }
        }
    }
}
