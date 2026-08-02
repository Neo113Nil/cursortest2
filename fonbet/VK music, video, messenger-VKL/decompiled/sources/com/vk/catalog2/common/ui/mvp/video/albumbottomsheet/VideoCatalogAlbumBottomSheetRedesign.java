package com.vk.catalog2.common.ui.mvp.video.albumbottomsheet;

import android.app.Activity;
import android.util.Size;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.onboarding.Onboarding;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asp;
import xsna.b25;
import xsna.b6l;
import xsna.be80;
import xsna.bpn0;
import xsna.cvk;
import xsna.epx;
import xsna.g5z;
import xsna.hqu0;
import xsna.iah0;
import xsna.ikv0;
import xsna.jai;
import xsna.jwr0;
import xsna.mut0;
import xsna.myc0;
import xsna.n2f;
import xsna.o25;
import xsna.pkv0;
import xsna.q7a0;
import xsna.qoy;
import xsna.rrv0;
import xsna.s3q0;
import xsna.spj;
import xsna.vs20;
import xsna.w8s0;
import xsna.wjs0;
import xsna.wzs;
import xsna.yvj;
import xsna.zrp;

/* compiled from: VideoCatalogAlbumBottomSheetRedesign.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogAlbumBottomSheetRedesign {
    public final a a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCatalogAlbumBottomSheetRedesign.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CopyLink;
        public static final Action GoToOwner;
        public static final Action PlayAll;
        public static final Action Share;
        public static final Action Subscribe;
        public static final Action Unsubscribe;

        static {
            Action action = new Action("Subscribe", 0);
            Subscribe = action;
            Action action2 = new Action("Unsubscribe", 1);
            Unsubscribe = action2;
            Action action3 = new Action("PlayAll", 2);
            PlayAll = action3;
            Action action4 = new Action("CopyLink", 3);
            CopyLink = action4;
            Action action5 = new Action("Share", 4);
            Share = action5;
            Action action6 = new Action("GoToOwner", 5);
            GoToOwner = action6;
            Action[] actionArr = {action, action2, action3, action4, action5, action6};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoCatalogAlbumBottomSheetRedesign.kt */
    public static final class a {
        public final VideoAlbum a;
        public final boolean b;
        public final String c;
        public final String d;
        public final w8s0 e;
        public final be80 f;
        public final com.vk.video.ui.share.api.b g;

        public a(VideoAlbum videoAlbum, boolean z, String str, String str2, w8s0 w8s0Var, be80 be80Var, com.vk.video.ui.share.api.b bVar) {
            this.a = videoAlbum;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = w8s0Var;
            this.f = be80Var;
            this.g = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e.equals(aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, true), 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (this.e.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            be80 be80Var = this.f;
            int hashCode3 = (hashCode2 + (be80Var == null ? 0 : be80Var.hashCode())) * 31;
            com.vk.video.ui.share.api.b bVar = this.g;
            return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "VideoAlbumBottomSheetParams(videoAlbum=" + this.a + ", isCatalogContext=true, isChildMode=" + this.b + ", ref=" + this.c + ", avatarUrl=" + this.d + ", actionTracker=" + this.e + ", onboardingManager=" + this.f + ", videoShareLinkModifier=" + this.g + ')';
        }
    }

    /* compiled from: VideoCatalogAlbumBottomSheetRedesign.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAlbumActionItem.values().length];
            try {
                iArr[VideoAlbumActionItem.EDIT_PLAYLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAlbumActionItem.REMOVE_PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAlbumActionItem.COPY_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoAlbumActionItem.COPY_PLAYLIST_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoAlbumActionItem.SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoAlbumActionItem.SHARE_PLAYLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoAlbumActionItem.UNSUBSCRIBE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoAlbumActionItem.SUBSCRIBE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoAlbumActionItem.GO_TO_AUTHOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoAlbumActionItem.PLAYLIST_ADD_VIDEO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoCatalogAlbumBottomSheetRedesign.kt */
    @b6l(c = "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign$toggleSubscription$1", f = "VideoCatalogAlbumBottomSheetRedesign.kt", l = {301}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Action $action;
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ int $errorRes;
        final /* synthetic */ boolean $shouldSubscribe;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, FragmentActivity fragmentActivity, Action action, int i, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$shouldSubscribe = z;
            this.$activity = fragmentActivity;
            this.$action = action;
            this.$errorRes = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return VideoCatalogAlbumBottomSheetRedesign.this.new c(this.$shouldSubscribe, this.$activity, this.$action, this.$errorRes, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign = VideoCatalogAlbumBottomSheetRedesign.this;
                    boolean z = this.$shouldSubscribe;
                    this.label = 1;
                    videoCatalogAlbumBottomSheetRedesign.getClass();
                    Object k = myc0.k(hqu0.b(), new com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.a(videoCatalogAlbumBottomSheetRedesign, z, null), this);
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign2 = VideoCatalogAlbumBottomSheetRedesign.this;
                boolean z2 = this.$shouldSubscribe;
                a aVar = videoCatalogAlbumBottomSheetRedesign2.a;
                VideoAlbum videoAlbum = aVar.a;
                videoAlbum.l = z2;
                if (z2) {
                    wjs0.a(new jwr0(videoAlbum, "albums_subscribe"));
                    if (aVar.f != null) {
                        Onboarding onboarding = Onboarding.TwoStep;
                    }
                } else {
                    wjs0.a(new jwr0(videoAlbum, "albums_unsubscribe"));
                }
                VideoCatalogAlbumBottomSheetRedesign.b(VideoCatalogAlbumBottomSheetRedesign.this, this.$activity, this.$action);
            } catch (Throwable th) {
                cvk.u(this.$errorRes, false);
                L.g("video_catalog_album_bottom_sheet", th);
            }
            return s3q0.a;
        }
    }

    public VideoCatalogAlbumBottomSheetRedesign(a aVar) {
        this.a = aVar;
    }

    public static final void b(VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign, FragmentActivity fragmentActivity, Action action) {
        videoCatalogAlbumBottomSheetRedesign.getClass();
        boolean z = action == Action.Subscribe;
        int i = z ? R.drawable.vk_icon_add_square_outline_28 : R.drawable.vk_icon_minus_square_outline_28;
        int i2 = z ? R.string.topshelf_snackbar_playlist_subscribed : R.string.topshelf_snackbar_playlist_unsubscribed;
        ikv0.a aVar = new ikv0.a(fragmentActivity);
        float f = 28;
        aVar.t = new ikv0.c.C3058c(i, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
        aVar.u = new ikv0.d(fragmentActivity.getString(i2), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, fragmentActivity.getString(R.string.cancel), new q7a0(9, videoCatalogAlbumBottomSheetRedesign, fragmentActivity));
        aVar.o = Integer.valueOf(iah0.a(8));
        pkv0.f(aVar);
    }

    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-966115401);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-966115401, i2, -1, "com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign.VkThemeRedesign (VideoCatalogAlbumBottomSheetRedesign.kt:117)");
            }
            M.K(-967818118);
            jaiVar2 = jaiVar;
            rrv0.d(null, null, null, null, jaiVar2, M, (i2 << 12) & 57344, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new n2f(this, jaiVar2, i, 5);
        }
    }

    public final void c(Activity activity) {
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ((FragmentActivity) activity).getWindow().getDecorView();
        ComposeView composeView = new ComposeView(fragmentActivity, null, 6);
        composeView.setViewCompositionStrategy(mut0.a.a);
        composeView.setContent(new jai(1941573723, new vs20(this, fragmentActivity, viewGroup, composeView), true));
        viewGroup.addView(composeView);
    }

    public final void d(FragmentActivity fragmentActivity, boolean z) {
        Action action = z ? Action.Subscribe : Action.Unsubscribe;
        int i = z ? R.string.video_playlist_subscribe_fail : R.string.video_playlist_unsubscribe_fail;
        this.a.e.b(action);
        if (z) {
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            ((b25) bpn0Var.getValue()).getClass();
        }
        myc0.h(g5z.a(fragmentActivity), null, null, new c(z, fragmentActivity, action, i, null), 3);
    }
}
