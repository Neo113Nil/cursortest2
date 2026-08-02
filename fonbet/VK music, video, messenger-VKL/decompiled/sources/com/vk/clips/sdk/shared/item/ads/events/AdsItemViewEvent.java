package com.vk.clips.sdk.shared.item.ads.events;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import xsna.asp;
import xsna.epx;
import xsna.hz0;
import xsna.ixp0;
import xsna.j4b0;
import xsna.qu0;
import xsna.zrp;

/* compiled from: AdsItemViewEvent.kt */
/* loaded from: classes17.dex */
public interface AdsItemViewEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemViewEvent.kt */
    public static final class FeedEnterTransitionAnimation implements AdsItemViewEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeedEnterTransitionAnimation[] $VALUES;
        public static final FeedEnterTransitionAnimation FINISH;
        public static final FeedEnterTransitionAnimation START;

        static {
            FeedEnterTransitionAnimation feedEnterTransitionAnimation = new FeedEnterTransitionAnimation("START", 0);
            START = feedEnterTransitionAnimation;
            FeedEnterTransitionAnimation feedEnterTransitionAnimation2 = new FeedEnterTransitionAnimation("FINISH", 1);
            FINISH = feedEnterTransitionAnimation2;
            FeedEnterTransitionAnimation[] feedEnterTransitionAnimationArr = {feedEnterTransitionAnimation, feedEnterTransitionAnimation2};
            $VALUES = feedEnterTransitionAnimationArr;
            $ENTRIES = new asp(feedEnterTransitionAnimationArr);
        }

        public FeedEnterTransitionAnimation() {
            throw null;
        }

        public static FeedEnterTransitionAnimation valueOf(String str) {
            return (FeedEnterTransitionAnimation) Enum.valueOf(FeedEnterTransitionAnimation.class, str);
        }

        public static FeedEnterTransitionAnimation[] values() {
            return (FeedEnterTransitionAnimation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemViewEvent.kt */
    public static final class OnItemViewFocusChanged implements AdsItemViewEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnItemViewFocusChanged[] $VALUES;
        public static final OnItemViewFocusChanged FOCUSED;
        public static final OnItemViewFocusChanged UNFOCUSED;

        static {
            OnItemViewFocusChanged onItemViewFocusChanged = new OnItemViewFocusChanged("FOCUSED", 0);
            FOCUSED = onItemViewFocusChanged;
            OnItemViewFocusChanged onItemViewFocusChanged2 = new OnItemViewFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = onItemViewFocusChanged2;
            OnItemViewFocusChanged[] onItemViewFocusChangedArr = {onItemViewFocusChanged, onItemViewFocusChanged2};
            $VALUES = onItemViewFocusChangedArr;
            $ENTRIES = new asp(onItemViewFocusChangedArr);
        }

        public OnItemViewFocusChanged() {
            throw null;
        }

        public static OnItemViewFocusChanged valueOf(String str) {
            return (OnItemViewFocusChanged) Enum.valueOf(OnItemViewFocusChanged.class, str);
        }

        public static OnItemViewFocusChanged[] values() {
            return (OnItemViewFocusChanged[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemViewEvent.kt */
    public static final class OnVideoFocusChanged implements AdsItemViewEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnVideoFocusChanged[] $VALUES;
        public static final OnVideoFocusChanged FOCUSED;
        public static final OnVideoFocusChanged UNFOCUSED;

        static {
            OnVideoFocusChanged onVideoFocusChanged = new OnVideoFocusChanged("FOCUSED", 0);
            FOCUSED = onVideoFocusChanged;
            OnVideoFocusChanged onVideoFocusChanged2 = new OnVideoFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = onVideoFocusChanged2;
            OnVideoFocusChanged[] onVideoFocusChangedArr = {onVideoFocusChanged, onVideoFocusChanged2};
            $VALUES = onVideoFocusChangedArr;
            $ENTRIES = new asp(onVideoFocusChangedArr);
        }

        public OnVideoFocusChanged() {
            throw null;
        }

        public static OnVideoFocusChanged valueOf(String str) {
            return (OnVideoFocusChanged) Enum.valueOf(OnVideoFocusChanged.class, str);
        }

        public static OnVideoFocusChanged[] values() {
            return (OnVideoFocusChanged[]) $VALUES.clone();
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class a implements AdsItemViewEvent {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1732749379;
        }

        public final String toString() {
            return "ActionButtonClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class b implements AdsItemViewEvent {
        public final SdkClipVideoFile b;
        public final qu0 c;
        public final j4b0 d;
        public final hz0 e;

        public b(SdkClipVideoFile sdkClipVideoFile, qu0 qu0Var, j4b0 j4b0Var, hz0 hz0Var) {
            this.b = sdkClipVideoFile;
            this.c = qu0Var;
            this.d = j4b0Var;
            this.e = hz0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Bind(clipCopy=" + this.b + ", model=" + this.c + ", playerState=" + this.d + ", positionPointsState=" + this.e + ')';
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class c implements AdsItemViewEvent {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -837087622;
        }

        public final String toString() {
            return "DisableCinemaMode";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class d implements AdsItemViewEvent {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1801034811;
        }

        public final String toString() {
            return "ErrorRetryClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class e implements AdsItemViewEvent {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1273040560;
        }

        public final String toString() {
            return "LinkCommunityWithSubscribeClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class f implements AdsItemViewEvent {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1295716236;
        }

        public final String toString() {
            return "MuteClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class g implements AdsItemViewEvent {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -2016815472;
        }

        public final String toString() {
            return "OnAttachedToWindow";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class h implements AdsItemViewEvent {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 452241293;
        }

        public final String toString() {
            return "OnDetachedFromWindow";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class i implements AdsItemViewEvent {
        public final ixp0 b;

        public i(ixp0 ixp0Var) {
            this.b = ixp0Var;
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
            return "OnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class j implements AdsItemViewEvent {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 620412945;
        }

        public final String toString() {
            return "OwnerViewClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class k implements AdsItemViewEvent {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1766267217;
        }

        public final String toString() {
            return "Recycle";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class l implements AdsItemViewEvent {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1310695038;
        }

        public final String toString() {
            return "ReplayClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class m implements AdsItemViewEvent {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1805351211;
        }

        public final String toString() {
            return "RestrictionButtonClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class n implements AdsItemViewEvent {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1748323161;
        }

        public final String toString() {
            return "RestrictionDialogConfirmClicked";
        }
    }

    /* compiled from: AdsItemViewEvent.kt */
    public static final class o implements AdsItemViewEvent {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -526795636;
        }

        public final String toString() {
            return "UnsubscribeBottomSheetConfirmClicked";
        }
    }
}
