package com.vk.clips.sdk.shared.item.ads;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import one.video.player.error.OneVideoPlaybackException;
import xsna.asp;
import xsna.br;
import xsna.epx;
import xsna.ho8;
import xsna.hz0;
import xsna.iq;
import xsna.ixp0;
import xsna.j4b0;
import xsna.kih0;
import xsna.kj50;
import xsna.nlh0;
import xsna.oq;
import xsna.shy;
import xsna.wp50;
import xsna.zrp;

/* compiled from: AdsItemAction.kt */
/* loaded from: classes17.dex */
public interface AdsItemAction extends kj50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemAction.kt */
    public static final class HandleOnItemViewFocusChanged implements AdsItemAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleOnItemViewFocusChanged[] $VALUES;
        public static final HandleOnItemViewFocusChanged FOCUSED;
        public static final HandleOnItemViewFocusChanged UNFOCUSED;

        static {
            HandleOnItemViewFocusChanged handleOnItemViewFocusChanged = new HandleOnItemViewFocusChanged("FOCUSED", 0);
            FOCUSED = handleOnItemViewFocusChanged;
            HandleOnItemViewFocusChanged handleOnItemViewFocusChanged2 = new HandleOnItemViewFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = handleOnItemViewFocusChanged2;
            HandleOnItemViewFocusChanged[] handleOnItemViewFocusChangedArr = {handleOnItemViewFocusChanged, handleOnItemViewFocusChanged2};
            $VALUES = handleOnItemViewFocusChangedArr;
            $ENTRIES = new asp(handleOnItemViewFocusChangedArr);
        }

        public HandleOnItemViewFocusChanged() {
            throw null;
        }

        public static HandleOnItemViewFocusChanged valueOf(String str) {
            return (HandleOnItemViewFocusChanged) Enum.valueOf(HandleOnItemViewFocusChanged.class, str);
        }

        public static HandleOnItemViewFocusChanged[] values() {
            return (HandleOnItemViewFocusChanged[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemAction.kt */
    public static final class HandleVideoFocusChanged implements AdsItemAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleVideoFocusChanged[] $VALUES;
        public static final HandleVideoFocusChanged FOCUSED;
        public static final HandleVideoFocusChanged UNFOCUSED;

        static {
            HandleVideoFocusChanged handleVideoFocusChanged = new HandleVideoFocusChanged("FOCUSED", 0);
            FOCUSED = handleVideoFocusChanged;
            HandleVideoFocusChanged handleVideoFocusChanged2 = new HandleVideoFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = handleVideoFocusChanged2;
            HandleVideoFocusChanged[] handleVideoFocusChangedArr = {handleVideoFocusChanged, handleVideoFocusChanged2};
            $VALUES = handleVideoFocusChangedArr;
            $ENTRIES = new asp(handleVideoFocusChangedArr);
        }

        public HandleVideoFocusChanged() {
            throw null;
        }

        public static HandleVideoFocusChanged valueOf(String str) {
            return (HandleVideoFocusChanged) Enum.valueOf(HandleVideoFocusChanged.class, str);
        }

        public static HandleVideoFocusChanged[] values() {
            return (HandleVideoFocusChanged[]) $VALUES.clone();
        }
    }

    /* compiled from: AdsItemAction.kt */
    public interface a extends AdsItemAction {

        /* compiled from: AdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemAction$a$a, reason: collision with other inner class name */
        public static final class C0643a implements a {
            public final SdkClipVideoFile b;
            public final nlh0 c;
            public final kih0 d;
            public final j4b0 e;
            public final ixp0 f;
            public final hz0 g;
            public final wp50 h;

            public C0643a(SdkClipVideoFile sdkClipVideoFile, nlh0 nlh0Var, kih0 kih0Var, j4b0 j4b0Var, ixp0 ixp0Var, hz0 hz0Var, wp50 wp50Var) {
                this.b = sdkClipVideoFile;
                this.c = nlh0Var;
                this.d = kih0Var;
                this.e = j4b0Var;
                this.f = ixp0Var;
                this.g = hz0Var;
                this.h = wp50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0643a)) {
                    return false;
                }
                C0643a c0643a = (C0643a) obj;
                return epx.f(this.b, c0643a.b) && epx.f(this.c, c0643a.c) && epx.f(this.d, c0643a.d) && epx.f(this.e, c0643a.e) && epx.f(this.f, c0643a.f) && epx.f(this.g, c0643a.g) && epx.f(this.h, c0643a.h);
            }

            public final int hashCode() {
                int hashCode = (this.g.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
                wp50 wp50Var = this.h;
                return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Bind(clipCopy=");
                sb.append(this.b);
                sb.append(", videoFileController=");
                sb.append(this.c);
                sb.append(", autoPlay=");
                sb.append(this.d);
                sb.append(", playerState=");
                sb.append(this.e);
                sb.append(", uiVisibilityConfig=");
                sb.append(this.f);
                sb.append(", positionPointsState=");
                sb.append(this.g);
                sb.append(", myTargetFacade=");
                return iq.c(sb, this.h, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -977863729;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: AdsItemAction.kt */
    public interface b extends AdsItemAction {

        /* compiled from: AdsItemAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 791373840;
            }

            public final String toString() {
                return "HandleCollapseClicked";
            }
        }

        /* compiled from: AdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemAction$b$b, reason: collision with other inner class name */
        public static final class C0644b implements b {
            public static final C0644b b = new C0644b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0644b);
            }

            public final int hashCode() {
                return 452138499;
            }

            public final String toString() {
                return "HandleExpandClicked";
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class c implements b {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HandleHashtagClicked(hashtag="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class d implements b {
            public final String b;

            public d(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HandleLinkClicked(url="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class e implements b {
            public final String b;

            public e(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HandleMentionClicked(mention="), this.b, ')');
            }
        }
    }

    /* compiled from: AdsItemAction.kt */
    public interface c extends AdsItemAction {

        /* compiled from: AdsItemAction.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 141233717;
            }

            public final String toString() {
                return "HandleDoubleTap";
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1061600074;
            }

            public final String toString() {
                return "HandleLongPress";
            }
        }

        /* compiled from: AdsItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.ads.AdsItemAction$c$c, reason: collision with other inner class name */
        public static final class C0645c implements c {
            public static final C0645c b = new C0645c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0645c);
            }

            public final int hashCode() {
                return -547152290;
            }

            public final String toString() {
                return "HandleSingleTap";
            }
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class d implements AdsItemAction {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1121276267;
        }

        public final String toString() {
            return "HandleAdvertisementViewClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class e implements AdsItemAction {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1287578660;
        }

        public final String toString() {
            return "HandleDisableCinemaMode";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class f implements AdsItemAction {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 323631471;
        }

        public final String toString() {
            return "HandleErrorRetryClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class g implements AdsItemAction {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1933980410;
        }

        public final String toString() {
            return "HandleLinkCommunityWithSubscribeClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class h implements AdsItemAction {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 842198198;
        }

        public final String toString() {
            return "HandleMuteClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class i implements AdsItemAction {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("HandleMyTargetExternalNavigation(adAttribution="), this.b, ')');
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class j implements AdsItemAction {
        public final ixp0 b;

        public j(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HandleOnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class k implements AdsItemAction {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 688950567;
        }

        public final String toString() {
            return "HandleOwnerViewClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class l implements AdsItemAction {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -728442584;
        }

        public final String toString() {
            return "HandleReplayClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class m implements AdsItemAction {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 360042561;
        }

        public final String toString() {
            return "HandleRestrictionButtonClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class n implements AdsItemAction {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1219817347;
        }

        public final String toString() {
            return "HandleRestrictionDialogConfirmClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class o implements AdsItemAction {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1712577886;
        }

        public final String toString() {
            return "HandleUnsubscribeBottomSheetConfirmClicked";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public static final class p implements AdsItemAction {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -908757132;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: AdsItemAction.kt */
    public interface q extends AdsItemAction {

        /* compiled from: AdsItemAction.kt */
        public static final class a implements q {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -958787929;
            }

            public final String toString() {
                return "HandleSubscribeClicked";
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class b implements q {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -879384384;
            }

            public final String toString() {
                return "HandleUnsubscribeClicked";
            }
        }
    }

    /* compiled from: AdsItemAction.kt */
    public interface r extends AdsItemAction {
    }

    /* compiled from: AdsItemAction.kt */
    public interface s extends AdsItemAction {

        /* compiled from: AdsItemAction.kt */
        public static final class a implements s {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 520431392;
            }

            public final String toString() {
                return "HandleOpenProfileClick";
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class b implements s {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1838965359;
            }

            public final String toString() {
                return "HandleSubscriptionSuccess";
            }
        }
    }

    /* compiled from: AdsItemAction.kt */
    public interface t extends AdsItemAction {

        /* compiled from: AdsItemAction.kt */
        public static final class a implements t {
            public final j4b0 b;

            public a(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnComplete(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class b implements t {
            public final j4b0 b;

            public b(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnEndOfBuffer(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class c implements t {
            public final j4b0 b;
            public final int c;
            public final OneVideoPlaybackException.ErrorCode d;
            public final Throwable e;

            public c(j4b0 j4b0Var, int i, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
                this.b = j4b0Var;
                this.c = i;
                this.d = errorCode;
                this.e = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b.equals(cVar.b) && this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                int hashCode = (this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31)) * 31;
                Throwable th = this.e;
                return hashCode + (th == null ? 0 : th.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HandleOnError(playerState=");
                sb.append(this.b);
                sb.append(", errorTitleRes=");
                sb.append(this.c);
                sb.append(", errorCode=");
                sb.append(this.d);
                sb.append(", error=");
                return oq.c(sb, this.e, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class d implements t {
            public final j4b0 b;

            public d(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnFirstFrameRendered(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class e implements t {
            public final j4b0 b;

            public e(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnLoading(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class f implements t {
            public final j4b0 b;

            public f(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnPause(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class g implements t {
            public final j4b0 b;

            public g(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnPlay(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class h implements t {
            public final hz0 b;

            public h(hz0 hz0Var) {
                this.b = hz0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "HandleOnPositionUpdate(positionPointsState=" + this.b + ')';
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class i implements t {
            public final j4b0 b;

            public i(j4b0 j4b0Var) {
                this.b = j4b0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return br.c(new StringBuilder("HandleOnReady(playerState="), this.b, ')');
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class j implements t {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                ((j) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "HandleOnResume(playerState=null)";
            }
        }

        /* compiled from: AdsItemAction.kt */
        public static final class k implements t {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1376901856;
            }

            public final String toString() {
                return "HandleOnVolumeChanged";
            }
        }
    }
}
