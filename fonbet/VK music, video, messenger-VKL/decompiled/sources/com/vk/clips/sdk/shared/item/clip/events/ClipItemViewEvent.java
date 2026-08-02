package com.vk.clips.sdk.shared.item.clip.events;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.ixp0;
import xsna.izs;
import xsna.j4b0;
import xsna.qzb0;
import xsna.s3q0;
import xsna.shy;
import xsna.up;
import xsna.zrp;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public interface ClipItemViewEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemViewEvent.kt */
    public static final class FeedEnterTransitionAnimation implements ClipItemViewEvent {
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
    /* compiled from: ClipItemViewEvent.kt */
    public static final class OnItemViewFocusChanged implements ClipItemViewEvent {
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
    /* compiled from: ClipItemViewEvent.kt */
    public static final class OnSnapFocusChanged implements ClipItemViewEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnSnapFocusChanged[] $VALUES;
        public static final OnSnapFocusChanged FOCUSED;
        public static final OnSnapFocusChanged UNFOCUSED;

        static {
            OnSnapFocusChanged onSnapFocusChanged = new OnSnapFocusChanged("FOCUSED", 0);
            FOCUSED = onSnapFocusChanged;
            OnSnapFocusChanged onSnapFocusChanged2 = new OnSnapFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = onSnapFocusChanged2;
            OnSnapFocusChanged[] onSnapFocusChangedArr = {onSnapFocusChanged, onSnapFocusChanged2};
            $VALUES = onSnapFocusChangedArr;
            $ENTRIES = new asp(onSnapFocusChangedArr);
        }

        public OnSnapFocusChanged() {
            throw null;
        }

        public static OnSnapFocusChanged valueOf(String str) {
            return (OnSnapFocusChanged) Enum.valueOf(OnSnapFocusChanged.class, str);
        }

        public static OnSnapFocusChanged[] values() {
            return (OnSnapFocusChanged[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemViewEvent.kt */
    public static final class OnVideoFocusChanged implements ClipItemViewEvent {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemViewEvent.kt */
    public static final class OwnerClicked implements ClipItemViewEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OwnerClicked[] $VALUES;
        public static final OwnerClicked AVATAR;
        public static final OwnerClicked CONTAINER;

        static {
            OwnerClicked ownerClicked = new OwnerClicked("CONTAINER", 0);
            CONTAINER = ownerClicked;
            OwnerClicked ownerClicked2 = new OwnerClicked("AVATAR", 1);
            AVATAR = ownerClicked2;
            OwnerClicked[] ownerClickedArr = {ownerClicked, ownerClicked2};
            $VALUES = ownerClickedArr;
            $ENTRIES = new asp(ownerClickedArr);
        }

        public OwnerClicked() {
            throw null;
        }

        public static OwnerClicked valueOf(String str) {
            return (OwnerClicked) Enum.valueOf(OwnerClicked.class, str);
        }

        public static OwnerClicked[] values() {
            return (OwnerClicked[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class a implements ClipItemViewEvent {
        public final SdkClipVideoFile b;
        public final FeedItem.f c;
        public final j4b0 d;
        public final int e;
        public final qzb0 f;

        public a(SdkClipVideoFile sdkClipVideoFile, FeedItem.f fVar, j4b0 j4b0Var, int i, qzb0 qzb0Var) {
            this.b = sdkClipVideoFile;
            this.c = fVar;
            this.d = j4b0Var;
            this.e = i;
            this.f = qzb0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shy.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31);
        }

        public final String toString() {
            return "Bind(clipCopy=" + this.b + ", model=" + this.c + ", playerState=" + this.d + ", adapterPosition=" + this.e + ", positionPointsState=" + this.f + ')';
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class b implements ClipItemViewEvent {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -432044194;
        }

        public final String toString() {
            return "CoauthorInvitationReplyClick";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class c implements ClipItemViewEvent {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("LikedExternal(reverse="), this.b, ')');
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class d implements ClipItemViewEvent {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1021088962;
        }

        public final String toString() {
            return "MuteClicked";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class e implements ClipItemViewEvent {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1650871966;
        }

        public final String toString() {
            return "OnAttachedToWindow";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class f implements ClipItemViewEvent {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1679519857;
        }

        public final String toString() {
            return "OnCommented";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class g implements ClipItemViewEvent {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1068280805;
        }

        public final String toString() {
            return "OnDetachedFromWindow";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class h implements ClipItemViewEvent {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("OnSeekStateChanged(seeking="), this.b, ')');
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class i implements ClipItemViewEvent {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -590002764;
        }

        public final String toString() {
            return "OnShared";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class j implements ClipItemViewEvent {
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
            return "OnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class k implements ClipItemViewEvent {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 2145179344;
        }

        public final String toString() {
            return "PinnedChangeSpinnerShown";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class l implements ClipItemViewEvent {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 738532867;
        }

        public final String toString() {
            return "Recycle";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class m implements ClipItemViewEvent {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1315623239;
        }

        public final String toString() {
            return "RestrictionButtonClicked";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class n implements ClipItemViewEvent {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -71509493;
        }

        public final String toString() {
            return "RestrictionDialogConfirmClicked";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class o implements ClipItemViewEvent {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 965752540;
        }

        public final String toString() {
            return "SubtitlesClicked";
        }
    }

    /* compiled from: ClipItemViewEvent.kt */
    public static final class p implements ClipItemViewEvent {
        public final izs<SdkClipVideoFile, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public p(izs<? super SdkClipVideoFile, s3q0> izsVar) {
            this.b = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            izs<SdkClipVideoFile, s3q0> izsVar = this.b;
            if (izsVar == null) {
                return 0;
            }
            return izsVar.hashCode();
        }

        public final String toString() {
            return up.c(new StringBuilder("UnsubscribeBottomSheetConfirmClicked(onSuccess="), this.b, ')');
        }
    }
}
