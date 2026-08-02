package com.vk.clips.sdk.shared.item.clip;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.asp;
import xsna.br;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.ixp0;
import xsna.izs;
import xsna.j4b0;
import xsna.k7f;
import xsna.kih0;
import xsna.kj50;
import xsna.mih0;
import xsna.mre;
import xsna.ms9;
import xsna.qzb0;
import xsna.s3q0;
import xsna.shy;
import xsna.thl0;
import xsna.up;
import xsna.urd0;
import xsna.vu5;
import xsna.y0r;
import xsna.yq;
import xsna.zrp;

/* compiled from: ClipItemAction.kt */
/* loaded from: classes17.dex */
public interface ClipItemAction extends kj50 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemAction.kt */
    public static final class HandleOnItemViewFocusChanged implements ClipItemAction {
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
    /* compiled from: ClipItemAction.kt */
    public static final class HandleOnSnapFocusChanged implements ClipItemAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleOnSnapFocusChanged[] $VALUES;
        public static final HandleOnSnapFocusChanged FOCUSED;
        public static final HandleOnSnapFocusChanged UNFOCUSED;

        static {
            HandleOnSnapFocusChanged handleOnSnapFocusChanged = new HandleOnSnapFocusChanged("FOCUSED", 0);
            FOCUSED = handleOnSnapFocusChanged;
            HandleOnSnapFocusChanged handleOnSnapFocusChanged2 = new HandleOnSnapFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = handleOnSnapFocusChanged2;
            HandleOnSnapFocusChanged[] handleOnSnapFocusChangedArr = {handleOnSnapFocusChanged, handleOnSnapFocusChanged2};
            $VALUES = handleOnSnapFocusChangedArr;
            $ENTRIES = new asp(handleOnSnapFocusChangedArr);
        }

        public HandleOnSnapFocusChanged() {
            throw null;
        }

        public static HandleOnSnapFocusChanged valueOf(String str) {
            return (HandleOnSnapFocusChanged) Enum.valueOf(HandleOnSnapFocusChanged.class, str);
        }

        public static HandleOnSnapFocusChanged[] values() {
            return (HandleOnSnapFocusChanged[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemAction.kt */
    public static final class HandleOnVideoFocusChanged implements ClipItemAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleOnVideoFocusChanged[] $VALUES;
        public static final HandleOnVideoFocusChanged FOCUSED;
        public static final HandleOnVideoFocusChanged UNFOCUSED;

        static {
            HandleOnVideoFocusChanged handleOnVideoFocusChanged = new HandleOnVideoFocusChanged("FOCUSED", 0);
            FOCUSED = handleOnVideoFocusChanged;
            HandleOnVideoFocusChanged handleOnVideoFocusChanged2 = new HandleOnVideoFocusChanged("UNFOCUSED", 1);
            UNFOCUSED = handleOnVideoFocusChanged2;
            HandleOnVideoFocusChanged[] handleOnVideoFocusChangedArr = {handleOnVideoFocusChanged, handleOnVideoFocusChanged2};
            $VALUES = handleOnVideoFocusChangedArr;
            $ENTRIES = new asp(handleOnVideoFocusChangedArr);
        }

        public HandleOnVideoFocusChanged() {
            throw null;
        }

        public static HandleOnVideoFocusChanged valueOf(String str) {
            return (HandleOnVideoFocusChanged) Enum.valueOf(HandleOnVideoFocusChanged.class, str);
        }

        public static HandleOnVideoFocusChanged[] values() {
            return (HandleOnVideoFocusChanged[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemAction.kt */
    public static final class HandleOwnerClicked implements ClipItemAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HandleOwnerClicked[] $VALUES;
        public static final HandleOwnerClicked AVATAR;
        public static final HandleOwnerClicked CONTAINER;

        static {
            HandleOwnerClicked handleOwnerClicked = new HandleOwnerClicked("CONTAINER", 0);
            CONTAINER = handleOwnerClicked;
            HandleOwnerClicked handleOwnerClicked2 = new HandleOwnerClicked("AVATAR", 1);
            AVATAR = handleOwnerClicked2;
            HandleOwnerClicked[] handleOwnerClickedArr = {handleOwnerClicked, handleOwnerClicked2};
            $VALUES = handleOwnerClickedArr;
            $ENTRIES = new asp(handleOwnerClickedArr);
        }

        public HandleOwnerClicked() {
            throw null;
        }

        public static HandleOwnerClicked valueOf(String str) {
            return (HandleOwnerClicked) Enum.valueOf(HandleOwnerClicked.class, str);
        }

        public static HandleOwnerClicked[] values() {
            return (HandleOwnerClicked[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface Nps extends ClipItemAction {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipItemAction.kt */
        public static final class Close implements Nps {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Close[] $VALUES;
            public static final Close Delayed;
            public static final Close Immediately;

            static {
                Close close = new Close("Delayed", 0);
                Delayed = close;
                Close close2 = new Close("Immediately", 1);
                Immediately = close2;
                Close[] closeArr = {close, close2};
                $VALUES = closeArr;
                $ENTRIES = new asp(closeArr);
            }

            public Close() {
                throw null;
            }

            public static Close valueOf(String str) {
                return (Close) Enum.valueOf(Close.class, str);
            }

            public static Close[] values() {
                return (Close[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class a implements Nps {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1150265816;
            }

            public final String toString() {
                return "CancelCloseTimer";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements Nps {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("HandleAnswerClick(answerId="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements Nps {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -116804528;
            }

            public final String toString() {
                return "HandleSkipClick";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class d implements Nps {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -145626378;
            }

            public final String toString() {
                return "SubscribeToUpdates";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class e implements Nps {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 649771039;
            }

            public final String toString() {
                return "TrackView";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface Tooltip extends ClipItemAction {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipItemAction.kt */
        public static final class Hide implements Tooltip {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Hide[] $VALUES;
            public static final Hide ANIMATED;
            public static final Hide DELAYED_WITH_ANIMATION;
            public static final Hide IMMEDIATE;

            static {
                Hide hide = new Hide("IMMEDIATE", 0);
                IMMEDIATE = hide;
                Hide hide2 = new Hide("ANIMATED", 1);
                ANIMATED = hide2;
                Hide hide3 = new Hide("DELAYED_WITH_ANIMATION", 2);
                DELAYED_WITH_ANIMATION = hide3;
                Hide[] hideArr = {hide, hide2, hide3};
                $VALUES = hideArr;
                $ENTRIES = new asp(hideArr);
            }

            public Hide() {
                throw null;
            }

            public static Hide valueOf(String str) {
                return (Hide) Enum.valueOf(Hide.class, str);
            }

            public static Hide[] values() {
                return (Hide[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class a implements Tooltip {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 780452231;
            }

            public final String toString() {
                return "HighlightSubscribeButton";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements Tooltip {
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements Tooltip {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1233697015;
            }

            public final String toString() {
                return "SpawnStickerOnLike";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface a extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$a$a, reason: collision with other inner class name */
        public static final class C0651a implements a {
            public static final C0651a b = new C0651a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0651a);
            }

            public final int hashCode() {
                return 2038083731;
            }

            public final String toString() {
                return "HandleLinkCommunityWithSubscribeClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1925962675;
            }

            public final String toString() {
                return "HandlePrimaryButtonClick";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements a {
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
                return q0.a(new StringBuilder("HandlePrimaryButtonVisibility(isVisible="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class d implements a {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1132179135;
            }

            public final String toString() {
                return "HandleSecondaryButtonClick";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class e implements a {
            public final boolean b;

            public e(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.b == ((e) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("HandleSecondaryButtonVisibility(isVisible="), this.b, ')');
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class a0 implements ClipItemAction {
        public static final a0 b = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -568191973;
        }

        public final String toString() {
            return "HidePinnedChangeSpinner";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface b extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements b {
            public final int b;
            public final Integer c;
            public final UserId d;

            public a(int i, Integer num, UserId userId) {
                this.b = i;
                this.c = num;
                this.d = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                Integer num = this.c;
                return Long.hashCode(this.d.b) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CommentClicked(id=");
                sb.append(this.b);
                sb.append(", parentCommentId=");
                sb.append(this.c);
                sb.append(", userId=");
                return gp.b(sb, this.d, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$b$b, reason: collision with other inner class name */
        public static final class C0652b implements b {
            public static final C0652b b = new C0652b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0652b);
            }

            public final int hashCode() {
                return -1064686770;
            }

            public final String toString() {
                return "CommentShowed";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1262610173;
            }

            public final String toString() {
                return "LikeClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class d implements b {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1966577579;
            }

            public final String toString() {
                return "LikesShowed";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class b0 implements ClipItemAction {
        public static final b0 b = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return -209393488;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class c implements ClipItemAction {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -298908721;
        }

        public final String toString() {
            return "AddToFavorites";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface c0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements c0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1191659941;
            }

            public final String toString() {
                return "ActionButtonActivated";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements c0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2020878362;
            }

            public final String toString() {
                return "GetNewsFeedMarketItemsState";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements c0 {
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
                return q0.a(new StringBuilder("ProductsWasShown(productsIsVisible="), this.b, ')');
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface d extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements d {
            public final SdkMask b;

            public a(SdkMask sdkMask) {
                this.b = sdkMask;
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
                return "HandleCameraMaskGridClicked(mask=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements d {
            public final SdkCompilation b;

            public b(SdkCompilation sdkCompilation) {
                this.b = sdkCompilation;
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
                return "HandleCompilationClicked(compilation=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements d {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1366302091;
            }

            public final String toString() {
                return "HandleDuetClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$d$d, reason: collision with other inner class name */
        public static final class C0653d implements d {
            public static final C0653d b = new C0653d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0653d);
            }

            public final int hashCode() {
                return -366573697;
            }

            public final String toString() {
                return "HandleGeoPlaceClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class e implements d {
            public final mih0.e b;
            public final List<mih0> c;

            /* JADX WARN: Multi-variable type inference failed */
            public e(mih0.e eVar, List<? extends mih0> list) {
                this.b = eVar;
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b.i) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HandleGroupClicked(header=");
                sb.append(this.b);
                sb.append(", modalItems=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class f implements d {
            public final CharSequence b;

            public f(CharSequence charSequence) {
                this.b = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                CharSequence charSequence = this.b;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            public final String toString() {
                return thl0.a(new StringBuilder("HandleHighlightHashTagClicked(hashTag="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class g implements d {
            public final SdkMask b;

            public g(SdkMask sdkMask) {
                this.b = sdkMask;
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
                return "HandleMaskClicked(mask=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class h implements d {
            public final SdkMask b;

            public h(SdkMask sdkMask) {
                this.b = sdkMask;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "HandleMaskModalClicked(mask=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class i implements d {
            public final List<mih0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public i(List<? extends mih0> list) {
                this.b = list;
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
                return ms9.a(')', new StringBuilder("HandleMoreClicked(badges="), this.b);
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class j implements d {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -294367084;
            }

            public final String toString() {
                return "HandleMusicClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class k implements d {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -676904518;
            }

            public final String toString() {
                return "HandleMusicTemplateClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class l implements d {
            public static final l b = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -1986435113;
            }

            public final String toString() {
                return "HandleNewsMonothemeBadgeRendered";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class m implements d {
            public final String b;
            public final String c;

            public m(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HandleNewsMonothemeClicked(monothemeObjectId=");
                sb.append(this.b);
                sb.append(", header=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class n implements d {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -1378622392;
            }

            public final String toString() {
                return "HandleNewsMonothemeHasBeenAnimated";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class o implements d {
            public final List<ClipsPlaylist> b;

            public o(List<ClipsPlaylist> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("HandlePlaylistManyClicked(playlists="), this.b);
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class p implements d {
            public final ClipsPlaylist b;

            public p(ClipsPlaylist clipsPlaylist) {
                this.b = clipsPlaylist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "HandlePlaylistSingleClicked(playlist=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class q implements d {
            public final boolean b;

            public q(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && this.b == ((q) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("HandlePrimaryBadgesVisibility(isVisible="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class r implements d {
            public static final r b = new r();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof r);
            }

            public final int hashCode() {
                return 1417811907;
            }

            public final String toString() {
                return "HandlePrivacyInfoClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class s implements d {
            public static final s b = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return -797283695;
            }

            public final String toString() {
                return "HandleProductsClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class t implements d {
            public static final t b = new t();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof t);
            }

            public final int hashCode() {
                return -347294837;
            }

            public final String toString() {
                return "HandleProductsRendered";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class u implements d {
            public final boolean b;

            public u(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && this.b == ((u) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("HandleSecondaryBadgesVisibility(isVisible="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class v implements d {
            public static final v b = new v();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof v);
            }

            public final int hashCode() {
                return -1294704665;
            }

            public final String toString() {
                return "HandleShopsMoreClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class w implements d {
            public static final w b = new w();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof w);
            }

            public final int hashCode() {
                return 1334023529;
            }

            public final String toString() {
                return "HandleShopsMoreHasBeenAnimated";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class x implements d {
            public static final x b = new x();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof x);
            }

            public final int hashCode() {
                return 1412524277;
            }

            public final String toString() {
                return "HandleShopsMoreRendered";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class d0 implements ClipItemAction {
        public static final d0 b = new d0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d0);
        }

        public final int hashCode() {
            return -308518954;
        }

        public final String toString() {
            return "OpenFavoriteFolderPicker";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface e extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements e {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 77041426;
            }

            public final String toString() {
                return "CloseClick";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements e {
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;

            public b(String str, String str2, String str3, String str4, String str5) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DataLoaded(image=");
                sb.append(this.b);
                sb.append(", label=");
                sb.append(this.c);
                sb.append(", age=");
                sb.append(this.d);
                sb.append(", title=");
                sb.append(this.e);
                sb.append(", buttonText=");
                return ho8.a(sb, this.f, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements e {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1387244376;
            }

            public final String toString() {
                return "LoadingStart";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class d implements e {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1715828080;
            }

            public final String toString() {
                return "SaveBannerCompanionState";
            }
        }

        /* compiled from: ClipItemAction.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$e$e, reason: collision with other inner class name */
        public static final class C0654e implements e {
            public static final C0654e b = new C0654e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0654e);
            }

            public final int hashCode() {
                return -1570592185;
            }

            public final String toString() {
                return "SubscribeToUpdates";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class f implements e {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -493014249;
            }

            public final String toString() {
                return "TimerEnded";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class e0 implements ClipItemAction {
        public final UserId b;
        public final boolean c;

        public e0(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            return epx.f(this.b, e0Var.b) && this.c == e0Var.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenGridScreen(author=");
            sb.append(this.b);
            sb.append(", isOwnerGrid=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface f extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements f {
            public final SdkClipVideoFile b;
            public final FeedItem.f c;
            public final int d;
            public final j4b0 e;
            public final ixp0 f;
            public final qzb0 g;

            public a(SdkClipVideoFile sdkClipVideoFile, FeedItem.f fVar, int i, j4b0 j4b0Var, ixp0 ixp0Var, qzb0 qzb0Var) {
                this.b = sdkClipVideoFile;
                this.c = fVar;
                this.d = i;
                this.e = j4b0Var;
                this.f = ixp0Var;
                this.g = qzb0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Bind(clipCopy=" + this.b + ", model=" + this.c + ", adapterPosition=" + this.d + ", playerState=" + this.e + ", uiVisibilityConfig=" + this.f + ", positionPointsState=" + this.g + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements f {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -423825645;
            }

            public final String toString() {
                return "Unbind";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class f0 implements ClipItemAction {
    }

    /* compiled from: ClipItemAction.kt */
    public interface g extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1015052724;
            }

            public final String toString() {
                return "HandleCollapseClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements g {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 888247103;
            }

            public final String toString() {
                return "HandleExpandClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements g {
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

        /* compiled from: ClipItemAction.kt */
        public static final class d implements g {
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

        /* compiled from: ClipItemAction.kt */
        public static final class e implements g {
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

    /* compiled from: ClipItemAction.kt */
    public interface g0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements g0 {
            public final izs<SdkClipVideoFile, s3q0> b;

            public a() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                izs<SdkClipVideoFile, s3q0> izsVar = this.b;
                if (izsVar == null) {
                    return 0;
                }
                return izsVar.hashCode();
            }

            public final String toString() {
                return up.c(new StringBuilder("HandleSubscribeClicked(onSuccess="), this.b, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super SdkClipVideoFile, s3q0> izsVar) {
                this.b = izsVar;
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements g0 {
            public final izs<SdkClipVideoFile, s3q0> b;

            public b() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                izs<SdkClipVideoFile, s3q0> izsVar = this.b;
                if (izsVar == null) {
                    return 0;
                }
                return izsVar.hashCode();
            }

            public final String toString() {
                return up.c(new StringBuilder("HandleUnsubscribeClicked(onSuccess="), this.b, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public b(izs<? super SdkClipVideoFile, s3q0> izsVar) {
                this.b = izsVar;
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface h extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements h {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 961813424;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements h {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1441779094;
            }

            public final String toString() {
                return "LoadInfo";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements h {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2079582464;
            }

            public final String toString() {
                return "Open";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface h0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements h0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 435357627;
            }

            public final String toString() {
                return "HandleLikeClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements h0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 444071293;
            }

            public final String toString() {
                return "HandleShareClicked";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public interface c extends h0 {

            /* compiled from: ClipItemAction.kt */
            public static final class a implements c {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -2143048176;
                }

                public final String toString() {
                    return "HandleAutoSubtitlesClicked";
                }
            }

            /* compiled from: ClipItemAction.kt */
            public interface b extends c {

                /* compiled from: ClipItemAction.kt */
                public static final class a implements b {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 1549846264;
                    }

                    public final String toString() {
                        return "Edit";
                    }
                }

                /* compiled from: ClipItemAction.kt */
                /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$h0$c$b$b, reason: collision with other inner class name */
                public static final class C0655b implements b {
                    public static final C0655b b = new C0655b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0655b);
                    }

                    public final int hashCode() {
                        return 317828464;
                    }

                    public final String toString() {
                        return "EditPrivacy";
                    }
                }

                /* compiled from: ClipItemAction.kt */
                /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$h0$c$b$c, reason: collision with other inner class name */
                public static final class C0656c implements b {
                    public static final C0656c b = new C0656c();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0656c);
                    }

                    public final int hashCode() {
                        return -578171406;
                    }

                    public final String toString() {
                        return "Remove";
                    }
                }

                /* compiled from: ClipItemAction.kt */
                public static final class d implements b {
                    public static final d b = new d();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof d);
                    }

                    public final int hashCode() {
                        return 684790295;
                    }

                    public final String toString() {
                        return "RemoveCommunity";
                    }
                }
            }

            /* compiled from: ClipItemAction.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.clip.ClipItemAction$h0$c$c, reason: collision with other inner class name */
            public static final class C0657c implements c {
                public static final C0657c b = new C0657c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0657c);
                }

                public final int hashCode() {
                    return -1982906880;
                }

                public final String toString() {
                    return "HandleNotInterestedClicked";
                }
            }

            /* compiled from: ClipItemAction.kt */
            public static final class d implements c {
                public static final d b = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return -315031867;
                }

                public final String toString() {
                    return "HandleTrafficSavingClicked";
                }
            }

            /* compiled from: ClipItemAction.kt */
            public static final class e implements c {
                public static final e b = new e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return 211742135;
                }

                public final String toString() {
                    return "Open";
                }
            }

            /* compiled from: ClipItemAction.kt */
            public static final class f implements c {
                public static final f b = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return -59230593;
                }

                public final String toString() {
                    return "PinClicked";
                }
            }

            /* compiled from: ClipItemAction.kt */
            public static final class g implements c {
                public static final g b = new g();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public final int hashCode() {
                    return -1111235944;
                }

                public final String toString() {
                    return "UnpinClicked";
                }
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface i extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements i {
            public static final a b = new a();
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements i {
            public final MotionEvent b;

            public b(MotionEvent motionEvent) {
                this.b = motionEvent;
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
                return "HandleDoubleTap(motionEvent=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements i {
            public final MotionEvent b;
            public final Rect c;

            public c(MotionEvent motionEvent, Rect rect) {
                this.b = motionEvent;
                this.c = rect;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HandleLongPress(motionEvent=");
                sb.append(this.b);
                sb.append(", gestureViewRect=");
                return yq.c(sb, this.c, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class d implements i {
            public final MotionEvent b;

            public d(MotionEvent motionEvent) {
                this.b = motionEvent;
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
                return "HandleSingleTap(motionEvent=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class e implements i {
            public static final e b = new e();
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface i0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements i0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1749530905;
            }

            public final String toString() {
                return "PreloadAndPrefetchSimilarShops";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements i0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2032330435;
            }

            public final String toString() {
                return "StartPrefetchingSimilarShops";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements i0 {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1319198759;
            }

            public final String toString() {
                return "StopPrefetchingSimilarShops";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class j implements ClipItemAction {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 882101802;
        }

        public final String toString() {
            return "HandleCoauthorInvitationReplyClick";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class j0 implements ClipItemAction {
        public static final j0 b = new j0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j0);
        }

        public final int hashCode() {
            return 2015260014;
        }

        public final String toString() {
            return "SubscribeToExternalUpdates";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class k implements ClipItemAction {
        public final UserId b;
        public final mre c;

        public k(UserId userId, mre mreVar) {
            this.b = userId;
            this.c = mreVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b.equals(kVar.b) && this.c.equals(kVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "HandleCoauthorSubscribeClick(author=" + this.b + ", onSuccess=" + this.c + ')';
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface k0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements k0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -239292836;
            }

            public final String toString() {
                return "HandleOpenProfileClick";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements k0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -922828365;
            }

            public final String toString() {
                return "HandleSubscriptionSuccess";
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class l implements ClipItemAction {
        public final UserId b;
        public final k7f c;

        public l(UserId userId, k7f k7fVar) {
            this.b = userId;
            this.c = k7fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.b.equals(lVar.b) && this.c.equals(lVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "HandleCoauthorUnsubscribeClick(author=" + this.b + ", onSuccess=" + this.c + ')';
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface l0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements l0 {
            public final kih0 b;
            public final y0r c;

            public a(kih0 kih0Var, y0r y0rVar) {
                this.b = kih0Var;
                this.c = y0rVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                y0r y0rVar = this.c;
                return hashCode + (y0rVar == null ? 0 : y0rVar.hashCode());
            }

            public final String toString() {
                return "HandleClick(autoPlay=" + this.b + ", cacheInfo=" + this.c + ')';
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class m implements ClipItemAction {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1384092452;
        }

        public final String toString() {
            return "HandleCommentClicked";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public interface m0 extends ClipItemAction {

        /* compiled from: ClipItemAction.kt */
        public static final class a implements m0 {
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
                return br.c(new StringBuilder("HandleOnEndOfBuffer(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class b implements m0 {
            public final j4b0 b;
            public final int c;
            public final OneVideoPlaybackException.ErrorCode d;

            public b(j4b0 j4b0Var, int i, OneVideoPlaybackException.ErrorCode errorCode) {
                this.b = j4b0Var;
                this.c = i;
                this.d = errorCode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                return "HandleOnError(playerState=" + this.b + ", errorTitleRes=" + this.c + ", errorCode=" + this.d + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class c implements m0 {
            public final j4b0 b;

            public c(j4b0 j4b0Var) {
                this.b = j4b0Var;
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
                return br.c(new StringBuilder("HandleOnFirstFrameRendered(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class d implements m0 {
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
                return br.c(new StringBuilder("HandleOnLoading(playerState="), this.b, ')');
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class e implements m0 {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 515559124;
            }

            public final String toString() {
                return "HandleOnLostNetwork";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class f implements m0 {
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

        /* compiled from: ClipItemAction.kt */
        public static final class g implements m0 {
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

        /* compiled from: ClipItemAction.kt */
        public static final class h implements m0 {
            public final qzb0 b;

            public h(qzb0 qzb0Var) {
                this.b = qzb0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "HandleOnPositionUpdate(positionPointsState=" + this.b + ')';
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class i implements m0 {
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

        /* compiled from: ClipItemAction.kt */
        public static final class j implements m0 {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1577296143;
            }

            public final String toString() {
                return "HandleOnRepeat";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class k implements m0 {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                ((k) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "HandleOnResume(playerState=null)";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class l implements m0 {
            public static final l b = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return 289017859;
            }

            public final String toString() {
                return "HandleOnSourceChanged";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class m implements m0 {
            public final List<SubtitleRenderItem> b;

            /* JADX WARN: Multi-variable type inference failed */
            public m(List<? extends SubtitleRenderItem> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("HandleOnSubtitleRenderItemsReceived(renderItems="), this.b);
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class n implements m0 {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return 1212253220;
            }

            public final String toString() {
                return "HandleOnVolumeChanged";
            }
        }

        /* compiled from: ClipItemAction.kt */
        public static final class o implements m0 {
            public final long b;
            public final long c;

            public o(long j, long j2) {
                this.b = j;
                this.c = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return this.b == oVar.b && this.c == oVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HandleWatchCoverage(startMs=");
                sb.append(this.b);
                sb.append(", endMs=");
                return vu5.a(')', this.c, sb);
            }
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class n implements ClipItemAction {
    }

    /* compiled from: ClipItemAction.kt */
    public static final class o implements ClipItemAction {
        public final boolean b;

        public o(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("HandleExternalLike(reverse="), this.b, ')');
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class p implements ClipItemAction {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 631440114;
        }

        public final String toString() {
            return "HandleMuteClicked";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class q implements ClipItemAction {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -26990781;
        }

        public final String toString() {
            return "HandleOnCommented";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class r implements ClipItemAction {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -770627865;
        }

        public final String toString() {
            return "HandleOnDetachedFromWindow";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class s implements ClipItemAction {
        public final boolean b;

        public s(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.b == ((s) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("HandleOnSeekStateChanged(seeking="), this.b, ')');
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class t implements ClipItemAction {
        public static final t b = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -587208064;
        }

        public final String toString() {
            return "HandleOnShared";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class u implements ClipItemAction {
        public final ixp0 b;

        public u(ixp0 ixp0Var) {
            this.b = ixp0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.b, ((u) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "HandleOnUIVisibilityConfigChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class v implements ClipItemAction {
        public final boolean b;
        public final boolean c;

        public v(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.b == vVar.b && this.c == vVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandlePinnedChanged(isPinAction=");
            sb.append(this.b);
            sb.append(", isSuccess=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class w implements ClipItemAction {
        public static final w b = new w();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 928299909;
        }

        public final String toString() {
            return "HandleRestrictionButtonClicked";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class x implements ClipItemAction {
        public static final x b = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 1024954303;
        }

        public final String toString() {
            return "HandleRestrictionDialogConfirmClicked";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class y implements ClipItemAction {
        public static final y b = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1834962856;
        }

        public final String toString() {
            return "HandleSubtitlesClicked";
        }
    }

    /* compiled from: ClipItemAction.kt */
    public static final class z implements ClipItemAction {
        public final izs<SdkClipVideoFile, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public z(izs<? super SdkClipVideoFile, s3q0> izsVar) {
            this.b = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && epx.f(this.b, ((z) obj).b);
        }

        public final int hashCode() {
            izs<SdkClipVideoFile, s3q0> izsVar = this.b;
            if (izsVar == null) {
                return 0;
            }
            return izsVar.hashCode();
        }

        public final String toString() {
            return up.c(new StringBuilder("HandleUnsubscribeBottomSheetConfirmClicked(onUnsubscribe="), this.b, ')');
        }
    }
}
