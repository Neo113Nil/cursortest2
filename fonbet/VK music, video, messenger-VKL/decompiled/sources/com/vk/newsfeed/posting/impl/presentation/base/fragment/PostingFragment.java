package com.vk.newsfeed.posting.impl.presentation.base.fragment;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.upload.vk.ui.api.ClipUploadScreenRuntimeConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.util.NoLocation;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.newsfeed.posting.impl.domain.model.GeoPermissionStatus;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SaveCreateTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SaveStartTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Posting$SendStats;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingNavigationState;
import com.vk.newsfeed.posting.impl.domain.model.PostingScreenContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.PostingTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.WaitingActionTrigger;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadUpdate;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.base.view.MediaPickerBottomSheetState;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import com.vk.newsfeed.posting.impl.presentation.base.view.ViewConstraint;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.RestorePostingState;
import com.vk.newsfeed.posting.impl.presentation.model.RestorePostingStateMeta;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.o;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a040;
import xsna.a80;
import xsna.a960;
import xsna.aeg0;
import xsna.amt;
import xsna.anj;
import xsna.ao50;
import xsna.apc0;
import xsna.b010;
import xsna.b1z;
import xsna.b25;
import xsna.b990;
import xsna.bd70;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.c950;
import xsna.ca10;
import xsna.cic0;
import xsna.cpc0;
import xsna.cso;
import xsna.d34;
import xsna.dac0;
import xsna.dhr0;
import xsna.dj60;
import xsna.dpc0;
import xsna.dzt;
import xsna.e43;
import xsna.e8;
import xsna.eed0;
import xsna.efc0;
import xsna.enc0;
import xsna.enj;
import xsna.epx;
import xsna.evl0;
import xsna.ezw;
import xsna.f4z;
import xsna.f5z;
import xsna.f9t;
import xsna.feo;
import xsna.ffc0;
import xsna.fi50;
import xsna.fmc0;
import xsna.fpf0;
import xsna.fv90;
import xsna.gd40;
import xsna.gdu;
import xsna.gfc0;
import xsna.gib0;
import xsna.gm50;
import xsna.gq;
import xsna.gxh;
import xsna.gz30;
import xsna.h0h;
import xsna.h3k0;
import xsna.h7v;
import xsna.h90;
import xsna.hj60;
import xsna.hvz;
import xsna.ibc0;
import xsna.ikv0;
import xsna.it10;
import xsna.itg0;
import xsna.izs;
import xsna.j0r;
import xsna.j3j0;
import xsna.j990;
import xsna.jaa0;
import xsna.jeq0;
import xsna.jgz;
import xsna.jw30;
import xsna.jy90;
import xsna.jz70;
import xsna.k170;
import xsna.k4z;
import xsna.k7m;
import xsna.k7z;
import xsna.k8c0;
import xsna.kdg0;
import xsna.km50;
import xsna.ko00;
import xsna.kr50;
import xsna.l0l0;
import xsna.lav;
import xsna.lh;
import xsna.lmc;
import xsna.m7m;
import xsna.mfc0;
import xsna.mk50;
import xsna.msy;
import xsna.mui0;
import xsna.n0u0;
import xsna.nbq0;
import xsna.nfc0;
import xsna.nhl;
import xsna.nht;
import xsna.odc0;
import xsna.oxz;
import xsna.p870;
import xsna.pdc0;
import xsna.pq5;
import xsna.q970;
import xsna.qbm0;
import xsna.qkc0;
import xsna.qs9;
import xsna.qvn;
import xsna.r8c0;
import xsna.rbc0;
import xsna.rbe0;
import xsna.re40;
import xsna.rf20;
import xsna.rhc0;
import xsna.rj01;
import xsna.rj60;
import xsna.s3q0;
import xsna.s520;
import xsna.s8g0;
import xsna.sbn;
import xsna.squ;
import xsna.su80;
import xsna.sux;
import xsna.tb0;
import xsna.tcc0;
import xsna.tk40;
import xsna.tkx;
import xsna.too0;
import xsna.tvo;
import xsna.u110;
import xsna.ud20;
import xsna.up2;
import xsna.up70;
import xsna.upc0;
import xsna.uq50;
import xsna.uv20;
import xsna.v100;
import xsna.v7c0;
import xsna.vk50;
import xsna.vou;
import xsna.vpc0;
import xsna.vq10;
import xsna.vrg0;
import xsna.w8i;
import xsna.w9c0;
import xsna.w9r;
import xsna.wb7;
import xsna.wj50;
import xsna.wm80;
import xsna.wmc0;
import xsna.wmi0;
import xsna.wpc0;
import xsna.wzb0;
import xsna.x020;
import xsna.xba0;
import xsna.xd40;
import xsna.xn50;
import xsna.xqi;
import xsna.xsw;
import xsna.y1q0;
import xsna.yp1;
import xsna.yu60;
import xsna.z23;
import xsna.z260;
import xsna.zlc0;

/* compiled from: PostingFragment.kt */
/* loaded from: classes4.dex */
public final class PostingFragment extends MviImplFragment<efc0, upc0, PostingAction> implements w8i, tvo.a, nht, w9r, h90.a, too0, tb0 {
    public static final /* synthetic */ int L0 = 0;
    public final b25 A0;
    public final Object B0;
    public final mfc0 C0;
    public final bpn0 D0;
    public final bpn0 E0;
    public final nbq0 F0;
    public final bpn0 G0;
    public final com.vk.newsfeed.posting.impl.domain.model.upload.a H0;
    public izs<? super fmc0.u, s3q0> I0;
    public final bpn0 J0;
    public final bpn0 K0;
    public final io.reactivex.rxjava3.disposables.b Q;
    public PostingContentView R;
    public final Handler S;
    public com.vk.core.view.components.spinner.c T;
    public final f4z U;
    public final y1q0 V;
    public final cpc0 W;
    public final h3k0 X;
    public final x020 Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public PostingContentView d0;
    public final rhc0 e0;
    public final gdu f0;
    public final rbe0 g0;
    public final k4z h0;
    public final Object i0;
    public final a j0;
    public final sbn k0;
    public final apc0 l0;
    public final Object m0;
    public PostingState n0;
    public Bundle o0;
    public final vq10 p0;
    public final Object q0;
    public final Object r0;
    public final bpn0 s0;
    public final Object t0;
    public final bpn0 u0;
    public final Object v0;
    public final Object w0;
    public final Object x0;
    public final w9c0 y0;
    public final gxh z0;

    /* compiled from: PostingFragment.kt */
    public static final class a extends BroadcastReceiver {
        public final h a;

        public a(h hVar) {
            this.a = hVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            AdditionalSettingsConfiguration additionalSettingsConfiguration;
            String action = intent != null ? intent.getAction() : null;
            if (action == null || action.hashCode() != -1351229117 || !action.equals("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS") || (additionalSettingsConfiguration = (AdditionalSettingsConfiguration) intent.getParcelableExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS_CONFIG")) == null) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS_COMMENT_CHANGE", false);
            Serializable serializableExtra = intent.getSerializableExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_SCREEN_UNIQUE_ID");
            this.a.invoke(new PostingAction.Editing.AdditionalSettingsChanged(additionalSettingsConfiguration, booleanExtra, serializableExtra instanceof UUID ? (UUID) serializableExtra : null));
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingContentView.PostingStep.values().length];
            try {
                iArr[PostingContentView.PostingStep.One.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingContentView.PostingStep.Other.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements izs<PostingAction, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PostingAction postingAction) {
            ((efc0) this.receiver).C(postingAction);
            return s3q0.a;
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<PostingAction, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PostingAction postingAction) {
            PostingFragment postingFragment = (PostingFragment) this.receiver;
            postingFragment.getClass();
            xn50.a.c(postingFragment, postingAction);
            return s3q0.a;
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<fmc0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(fmc0 fmc0Var) {
            ((wj50) this.receiver).b(fmc0Var);
            return s3q0.a;
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<PostingAction, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PostingAction postingAction) {
            PostingFragment postingFragment = (PostingFragment) this.receiver;
            postingFragment.getClass();
            xn50.a.c(postingFragment, postingAction);
            return s3q0.a;
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<PostingAction, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PostingAction postingAction) {
            PostingFragment postingFragment = (PostingFragment) this.receiver;
            postingFragment.getClass();
            xn50.a.c(postingFragment, postingAction);
            return s3q0.a;
        }
    }

    /* compiled from: PostingFragment.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<ikv0, s3q0> {
        public static final i b = new i(1, ikv0.class, "hide", "hide()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(ikv0 ikv0Var) {
            ikv0Var.a();
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v30, types: [xsna.mfc0] */
    public PostingFragment() {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.Q = bVar;
        this.S = new Handler(Looper.getMainLooper());
        f4z f4zVar = new f4z();
        this.U = f4zVar;
        y1q0 y1q0Var = new y1q0(0);
        y1q0Var.b();
        this.V = y1q0Var;
        cpc0 cpc0Var = new cpc0();
        this.W = cpc0Var;
        h3k0 h3k0Var = new h3k0();
        this.X = h3k0Var;
        this.Y = new x020(this, cpc0Var, new hj60(this, 11), h3k0Var);
        dac0 dac0Var = new dac0(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, dac0Var);
        this.Z = a2;
        int i2 = 4;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new jaa0(this, i2));
        this.a0 = a3;
        this.b0 = msy.a(lazyThreadSafetyMode, new b990(this, i2));
        Lazy a4 = msy.a(lazyThreadSafetyMode, new dj60(this, 13));
        this.c0 = a4;
        this.e0 = new rhc0(this, this, new b010(this, 27), new kr50(this, 14), new gd40(this, 13), new re40(this, 14));
        this.f0 = new gdu(this, f4zVar, this);
        this.g0 = new rbe0(this, new g(1, this, PostingFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), new rf20(this, 15), (NewsfeedRouter) a2.getValue(), (feo) a3.getValue(), (StoryViewerRouter) a4.getValue());
        this.h0 = new k4z(this);
        this.i0 = msy.a(lazyThreadSafetyMode, new wzb0(this, 2));
        this.j0 = new a(new h(1, this, PostingFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.k0 = new sbn(new f9t(new lmc()), bVar);
        this.l0 = new apc0(bVar, new yu60(this, 11), new uv20(this, 25));
        this.m0 = msy.a(lazyThreadSafetyMode, new xsw(this, 24));
        this.p0 = new vq10(0);
        Lazy a5 = msy.a(lazyThreadSafetyMode, new jw30(this, 17));
        this.q0 = a5;
        this.r0 = msy.a(lazyThreadSafetyMode, new k7z(this, 27));
        this.s0 = new bpn0(new v100(this, 22));
        this.t0 = msy.a(lazyThreadSafetyMode, new z260(this, 16));
        this.u0 = new bpn0(new a040(this, 22));
        this.v0 = msy.a(lazyThreadSafetyMode, new jz70(this, 8));
        this.w0 = msy.a(lazyThreadSafetyMode, new uq50(this, 20));
        this.x0 = msy.a(lazyThreadSafetyMode, new odc0(this, 1));
        w9c0 K6 = ((ClipsUploadVkComponent) ((k7m) m7m.f(this)).a(fpf0.a(ClipsUploadVkComponent.class))).K6();
        this.y0 = K6;
        this.z0 = ((DataRepositoryComponent) ((k7m) m7m.f(this)).a(fpf0.a(DataRepositoryComponent.class))).D();
        this.A0 = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s();
        this.B0 = msy.a(lazyThreadSafetyMode, new ko00(this, 23));
        this.C0 = new bd70() { // from class: xsna.mfc0
            @Override // xsna.bd70
            public final void x0(int i3, int i4, Object obj) {
                Photo photo = (Photo) obj;
                int i5 = PostingFragment.L0;
                if (i3 == 113) {
                    PostingFragment postingFragment = PostingFragment.this;
                    postingFragment.getClass();
                    xn50.a.c(postingFragment, new PostingAction.Editing.UpdatePhoto(photo));
                }
            }
        };
        this.D0 = new bpn0(new b1z(this, 14));
        this.E0 = new bpn0(new u110(this, 12));
        this.F0 = new nbq0((mui0) a5.getValue(), new k170(this, 11));
        this.G0 = new bpn0(new su80(this, 9));
        this.H0 = new com.vk.newsfeed.posting.impl.domain.model.upload.a(K6);
        this.J0 = new bpn0(new wm80(this, 8));
        this.K0 = new bpn0(new c950(this, 18));
        getLifecycle().addObserver(new c());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        ezw ezwVar;
        String str;
        Context requireContext = requireContext();
        vpc0 vpc0Var = new vpc0(requireContext, (evl0) this.b0.getValue());
        rbc0 rbc0Var = (rbc0) this.m0.getValue();
        PostingState postingState = this.n0;
        RestorePostingStateMeta restorePostingStateMeta = this.k0.c;
        PostEditableData a2 = rbc0Var.a();
        if (postingState instanceof PostingState.Editing) {
            str = ((PostingState.Editing) postingState).i.c;
        } else if (restorePostingStateMeta != null) {
            str = restorePostingStateMeta.f;
        } else {
            if (a2 == null) {
                ezwVar = null;
                ezw ezwVar2 = ezwVar;
                Bundle bundle = this.o0;
                e eVar = new e(1, this, PostingFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                f fVar = new f(1, this.U, wj50.class, "notify", "notify(Ljava/lang/Object;)V", 0);
                kdg0 kdg0Var = (kdg0) this.x0.getValue();
                PostingContentView postingContentView = new PostingContentView(requireContext, bundle, ezwVar2, this, eVar, fVar, new xd40(this, 9), kdg0Var, this.V, new hvz(this, 27), this.W);
                this.R = postingContentView;
                this.d0 = postingContentView;
                return new mk50.c(postingContentView.i);
            }
            str = a2.c;
        }
        PostEditingReason postEditingReason = (PostEditingReason) rbc0Var.c.getValue();
        ezwVar = new ezw(new dpc0(vpc0Var.e(postEditingReason, false, true), true, ActionsAvailabilityState.Availability.Available.b, ToolbarNavButtonType.Close, null, false, (String) rbc0Var.j.getValue()), str, (PostingMediaEntryPoint) rbc0Var.o.getValue());
        ezw ezwVar22 = ezwVar;
        Bundle bundle2 = this.o0;
        e eVar2 = new e(1, this, PostingFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        f fVar2 = new f(1, this.U, wj50.class, "notify", "notify(Ljava/lang/Object;)V", 0);
        kdg0 kdg0Var2 = (kdg0) this.x0.getValue();
        PostingContentView postingContentView2 = new PostingContentView(requireContext, bundle2, ezwVar22, this, eVar2, fVar2, new xd40(this, 9), kdg0Var2, this.V, new hvz(this, 27), this.W);
        this.R = postingContentView2;
        this.d0 = postingContentView2;
        return new mk50.c(postingContentView2.i);
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        upc0 upc0Var = (upc0) ao50Var;
        PostingContentView postingContentView = this.R;
        if (postingContentView != null) {
            PostingFragment postingFragment = postingContentView.h;
            com.vk.channels.impl.channel_screen.send_msg.e eVar = new com.vk.channels.impl.channel_screen.send_msg.e(postingContentView, 12);
            xqi xqiVar = new xqi(wpc0.b.a, postingFragment, EmptyList.b);
            o oVar = new o(29, xqiVar.c, eVar);
            Object obj = xqiVar.d;
            if (obj != null) {
                oVar.invoke(obj);
            }
            xqiVar.c = oVar;
            fi50 fi50Var = upc0Var.a;
            fi50 fi50Var2 = upc0Var.b;
            fi50 fi50Var3 = upc0Var.c;
            List<n0u0> l = e43.l(fi50Var, fi50Var2, fi50Var3);
            List l2 = e43.l(fi50Var, fi50Var2);
            List l3 = e43.l(fi50Var2, fi50Var3);
            for (n0u0 n0u0Var : l) {
                gm50.a.b(postingContentView, n0u0Var, new pdc0(l2, n0u0Var, postingContentView, l3, xqiVar));
            }
            enc0 enc0Var = postingContentView.m;
            l0l0 l0l0Var = postingContentView.l;
            enc0Var.getClass();
            lh lhVar = new lh(25, new yp1(enc0Var, 9), l0l0Var);
            Object obj2 = l0l0Var.d;
            if (obj2 != null) {
                lhVar.invoke(obj2);
            }
            l0l0Var.c = lhVar;
            new cic0(postingContentView.b, postingContentView.c, xqiVar, (tcc0) postingContentView.n.getValue(), postingContentView.k, postingContentView.e).f(upc0Var, postingContentView.d);
        }
    }

    @Override // xsna.nht
    public final void K0(int i2, String[] strArr) {
        s8g0 s8g0Var = this.f0.d;
        if (s8g0Var != null) {
            s8g0Var.K0(i2, strArr);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        PostingContentView postingContentView = this.R;
        if (postingContentView != null) {
            enc0 enc0Var = postingContentView.m;
            enc0Var.f(false);
            VkInputSelect vkInputSelect = enc0Var.n;
            vkInputSelect.setLinkTextColor(-16777216);
            vkInputSelect.setLinkTextColor(dhr0.t.c(R.attr.vk_ui_text_accent));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((efc0) vk50Var).h.a(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 0), this);
    }

    @Override // xsna.w9r
    public final void Wg(FileDto fileDto) {
        this.e0.l.Wg(fileDto);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(PostingAction.Navigation.BackPressed.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        ((Posting2Component) ((k7m) m7m.f(this)).mo408a(fpf0.a(Posting2Component.class))).R4(((PostingScreenContext) ((rbc0) this.m0.getValue()).m.getValue()).c.toString());
        super.finish();
    }

    public final void fo(fmc0.i iVar) {
        if (iVar instanceof fmc0.i.b) {
            this.Y.i = ((fmc0.i.b) iVar).a;
            return;
        }
        PostingContentView postingContentView = this.d0;
        if (postingContentView != null) {
            postingContentView.o6(iVar);
        }
    }

    public final void go() {
        com.vk.core.view.components.spinner.c cVar = this.T;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.T = null;
    }

    public final void ho(fmc0.l lVar) {
        File u = up2.u(jeq0.g(lVar.d));
        ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact = u != null ? new ClipsUploadUiVkNavigator.ClipUploadDataCompact(lVar.b, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.POSTING, u, lVar.c, null, new ClipUploadScreenRuntimeConfig(true, true, true)) : null;
        if (clipUploadDataCompact != null) {
            efc0 feature = getFeature();
            feature.j.d.b(requireContext(), 427, clipUploadDataCompact);
            feature.n.e(fmc0.e.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void io() {
        Hint p;
        String str;
        String id = HintId.POSTING_PHOTO_WITH_GOODS_IN_CAROUSEL.getId();
        ?? r1 = this.w0;
        if (!((h7v) r1.getValue()).a(id) || (p = ((h7v) r1.getValue()).p(id)) == null || (str = p.c) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(requireContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_market_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(str, null), (ikv0.d.b) null, new ikv0.d.a(requireContext().getString(R.string.photo_with_goods_in_carousel_snackbar_button), VkButton.Appearance.Accent, i.b, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), 2);
        aVar.n();
    }

    public final void jo() {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.l0("closeOutherPosting", this, new e8(this, 28));
    }

    @Override // xsna.w9r
    public final void ne(Long l, Long l2) {
        this.e0.l.ne(l, l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v31, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v39, types: [android.os.Parcelable] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Bundle extras;
        Parcelable parcelable;
        Bundle extras2;
        Object parcelable2;
        Uri uri;
        Parcelable parcelable3;
        Object parcelableExtra;
        Parcelable parcelable4;
        Object parcelableExtra2;
        Bundle extras3;
        Parcelable parcelable5;
        Object parcelable6;
        Bundle extras4;
        Parcelable parcelable7;
        Object parcelable8;
        Parcelable parcelable9;
        Object parcelableExtra3;
        super.onActivityResult(i2, i3, intent);
        rhc0 rhc0Var = this.e0;
        eed0 eed0Var = rhc0Var.u;
        PostingFragment postingFragment = rhc0Var.c;
        if (i2 != 11) {
            if (i2 != 12) {
                if (i2 != 527) {
                    switch (i2) {
                        case 426:
                            if (intent != null && (extras4 = intent.getExtras()) != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable8 = extras4.getParcelable("selected_action", ActionButton.class);
                                    parcelable7 = (Parcelable) parcelable8;
                                } else {
                                    ?? parcelable10 = extras4.getParcelable("selected_action");
                                    parcelable7 = (ActionButton) (parcelable10 instanceof ActionButton ? parcelable10 : null);
                                }
                                ActionButton actionButton = (ActionButton) parcelable7;
                                if (actionButton != null) {
                                    xn50.a.c(postingFragment, new PostingAction.Editing.SetActionButton(actionButton));
                                    break;
                                }
                            }
                            break;
                        case 427:
                            xn50.a.c(postingFragment, new PostingAction.Navigation.ReturnFromClipsPublication(i3 == -1));
                            break;
                        case 428:
                            PostingFragment postingFragment2 = eed0Var.b;
                            if (eed0Var.e) {
                                ArrayList<Integer> integerArrayListExtra = intent != null ? intent.getIntegerArrayListExtra("chosen_friends_ids") : null;
                                boolean z = integerArrayListExtra != null;
                                int size = integerArrayListExtra != null ? integerArrayListExtra.size() : 0;
                                int i4 = eed0Var.f;
                                if ((i4 != 0 || size != 0) && (i4 == 0 || !z || size != 0)) {
                                    PostPrivacyData postPrivacyData = eed0Var.g;
                                    if (postPrivacyData != null) {
                                        xn50.a.c(postingFragment2, new PostingAction.Editing.PrivacySettingsChanged(postPrivacyData));
                                        break;
                                    }
                                } else {
                                    PostPrivacyData postPrivacyData2 = eed0Var.g;
                                    if (postPrivacyData2 != null) {
                                        xn50.a.c(postingFragment2, new PostingAction.Editing.PrivacySettingsChanged(PostPrivacyData.a(postPrivacyData2, eed0Var.d, null, null, null, false, 251)));
                                    }
                                    xn50.a.c(postingFragment2, new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PrivacySettingsBottomSheet.b));
                                    break;
                                }
                            }
                            break;
                        case CommonGatewayClient.CODE_TOO_MANY_REQUESTS /* 429 */:
                            eed0Var.getClass();
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelableExtra3 = intent.getParcelableExtra("selected_donut_level", DonutLevel.class);
                                    parcelable9 = (Parcelable) parcelableExtra3;
                                } else {
                                    ?? parcelableExtra4 = intent.getParcelableExtra("selected_donut_level");
                                    parcelable9 = (DonutLevel) (parcelableExtra4 instanceof DonutLevel ? parcelableExtra4 : null);
                                }
                                DonutLevel donutLevel = (DonutLevel) parcelable9;
                                if (donutLevel != null) {
                                    PrivacyPostType.SingleDonutLevel singleDonutLevel = new PrivacyPostType.SingleDonutLevel(donutLevel);
                                    PostingFragment postingFragment3 = eed0Var.b;
                                    PostingAction.Editing.PrivacySelectedPrivacyTypeChanged privacySelectedPrivacyTypeChanged = new PostingAction.Editing.PrivacySelectedPrivacyTypeChanged(singleDonutLevel);
                                    WaitingActionTrigger waitingActionTrigger = WaitingActionTrigger.FINISH_LOADING;
                                    xn50.a.d(postingFragment3, new PostingAction.AddWaitingAction(privacySelectedPrivacyTypeChanged, waitingActionTrigger), new PostingAction.AddWaitingAction(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PrivacySettingsBottomSheet.b), waitingActionTrigger));
                                    break;
                                }
                            }
                            break;
                    }
                } else if (intent != null && (extras3 = intent.getExtras()) != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable6 = extras3.getParcelable("ImageCropResultKey", ImageCropResult.class);
                        parcelable5 = (Parcelable) parcelable6;
                    } else {
                        ?? parcelable11 = extras3.getParcelable("ImageCropResultKey");
                        parcelable5 = (ImageCropResult) (parcelable11 instanceof ImageCropResult ? parcelable11 : null);
                    }
                    ImageCropResult imageCropResult = (ImageCropResult) parcelable5;
                    if (imageCropResult != null) {
                        if (imageCropResult.f) {
                            xn50.a.c(postingFragment, new PostingAction.MediaPicker.ReplaceAttachFromUri(imageCropResult.e, imageCropResult.b.getUri(), false));
                        }
                        xn50.a.c(postingFragment, new PostingAction.Editing.CropEditorResult(imageCropResult));
                    }
                }
            } else {
                if (intent != null && intent.hasExtra("edited_content_uri")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra2 = intent.getParcelableExtra("edited_content_uri", Uri.class);
                        parcelable4 = (Parcelable) parcelableExtra2;
                    } else {
                        Parcelable parcelableExtra5 = intent.getParcelableExtra("edited_content_uri");
                        if (!(parcelableExtra5 instanceof Uri)) {
                            parcelableExtra5 = null;
                        }
                        parcelable4 = (Uri) parcelableExtra5;
                    }
                    uri = (Uri) parcelable4;
                } else if (intent == null || !intent.hasExtra("original_content_uri")) {
                    uri = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("original_content_uri", Uri.class);
                        parcelable3 = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra6 = intent.getParcelableExtra("original_content_uri");
                        if (!(parcelableExtra6 instanceof Uri)) {
                            parcelableExtra6 = null;
                        }
                        parcelable3 = (Uri) parcelableExtra6;
                    }
                    uri = (Uri) parcelable3;
                }
                if (i3 == -1) {
                    xn50.a.c(postingFragment, new PostingAction.MediaPicker.CameraClosed(uri));
                } else {
                    xn50.a.c(postingFragment, new PostingAction.MediaPicker.CameraClosed(null));
                }
            }
        } else if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras.getParcelable("ADDITIONAL_SETTINGS_CONFIGURATION_KEY", AdditionalSettingsConfiguration.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable12 = extras.getParcelable("ADDITIONAL_SETTINGS_CONFIGURATION_KEY");
                parcelable = (AdditionalSettingsConfiguration) (parcelable12 instanceof AdditionalSettingsConfiguration ? parcelable12 : null);
            }
            AdditionalSettingsConfiguration additionalSettingsConfiguration = (AdditionalSettingsConfiguration) parcelable;
            if (additionalSettingsConfiguration != null && (extras2 = intent.getExtras()) != null) {
                xn50.a.c(postingFragment, new PostingAction.Editing.AdditionalSettingsChanged(additionalSettingsConfiguration, extras2.getBoolean("IS_COMMENT_CHANGE_AVAILABLE"), null, 4, null));
            }
        }
        s8g0 s8g0Var = this.f0.d;
        if (s8g0Var != null) {
            s8g0Var.onActivityResult(i2, i3, intent);
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        PostingState postingState;
        RestorePostingStateMeta restorePostingStateMeta;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        this.o0 = bundle;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = bundle.getParcelable("saved_mvi_state", PostingState.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = bundle.getParcelable("saved_mvi_state");
                if (!(parcelable5 instanceof PostingState)) {
                    parcelable5 = null;
                }
                parcelable3 = (PostingState) parcelable5;
            }
            postingState = (PostingState) parcelable3;
        } else {
            postingState = null;
        }
        this.n0 = postingState;
        sbn sbnVar = this.k0;
        if (bundle == null) {
            f9t f9tVar = sbnVar.a;
            q e2 = wmi0.a.e("PostingStateCacheKeys");
            lav lavVar = new lav(new sux(f9tVar, 16), 21);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            sbnVar.b.b(itg0.m(e2.E(lavVar, lVar, kVar, kVar)));
        } else {
            sbnVar.getClass();
            if (bundle.getBoolean("is_disk_state", false)) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("disk_state_meta_info", RestorePostingStateMeta.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable6 = bundle.getParcelable("disk_state_meta_info");
                    if (!(parcelable6 instanceof RestorePostingStateMeta)) {
                        parcelable6 = null;
                    }
                    parcelable = (RestorePostingStateMeta) parcelable6;
                }
                restorePostingStateMeta = (RestorePostingStateMeta) parcelable;
            } else {
                restorePostingStateMeta = null;
            }
            sbnVar.c = restorePostingStateMeta;
        }
        super.onCreate(bundle);
        this.o = false;
        ((ibc0) this.s0.getValue()).h().a();
        com.vk.core.utils.newtork.b.a.getClass();
        io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
        dVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new tk40(new gib0(this, 2), 12));
        io.reactivex.rxjava3.disposables.b bVar = this.Q;
        bVar.b(subscribe);
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        bVar.b(this.p0.c.subscribe(new a960(new fv90(this, 12), 10)));
        Bundle arguments = getArguments();
        if (arguments != null) {
            Long valueOf = arguments.containsKey("startScreenTime") ? Long.valueOf(arguments.getLong("startScreenTime")) : null;
            Long valueOf2 = arguments.containsKey("startScreenElapsedTime") ? Long.valueOf(arguments.getLong("startScreenElapsedTime")) : null;
            arguments.remove("startScreenTime");
            arguments.remove("startScreenElapsedTime");
            xn50.a.c(this, new PostingAction$TechStats$Posting$SaveStartTime(valueOf, valueOf2));
            xn50.a.c(this, new PostingAction$TechStats$Posting$SaveCreateTime(SystemClock.elapsedRealtime()));
        }
        IntentFilter a2 = z23.a("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.j0, a2, null, 4);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.j0);
        PostingContentView postingContentView = this.R;
        if (postingContentView != null) {
            enc0 enc0Var = postingContentView.m;
            enc0Var.Q.removeCallbacksAndMessages(null);
            ValueAnimator valueAnimator = enc0Var.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            enc0Var.P = null;
        }
        nbq0 nbq0Var = this.F0;
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = nbq0Var.c;
        Iterator<Integer> it = concurrentSkipListSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{gq.d(next, "Upload. Cancel taskId: ")});
            }
            com.vk.upload.impl.a.b(next.intValue(), null);
            nbq0Var.b.invoke(new UploadUpdate.Cancel(next.intValue()));
        }
        concurrentSkipListSet.clear();
        int i2 = 0;
        getFeature().C(new PostingAction$TechStats$Posting$SendStats(SystemClock.elapsedRealtime()));
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        this.S.removeCallbacksAndMessages(null);
        ((gfc0) this.t0.getValue()).b().subscribe(new ca10(new gz30(8), 11), new j990(new j0r(19), 3), new nfc0(i2));
        boolean isStateSaved = isStateSaved();
        Bundle arguments = getArguments();
        sbn sbnVar = this.k0;
        sbnVar.getClass();
        if (!isStateSaved) {
            String string = arguments != null ? arguments.getString("disk_state_key") : null;
            if (string != null && string.length() != 0) {
                f9t f9tVar = sbnVar.a;
                wmi0 wmi0Var = wmi0.a;
                wmi0Var.c(string);
                q e2 = wmi0Var.e("PostingStateCacheKeys");
                amt amtVar = new amt(new cso(f9tVar, string), 22);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                sbnVar.b.b(itg0.m(e2.E(amtVar, lVar, kVar, kVar)));
            }
        }
        this.Q.dispose();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((p870) this.v0.getValue()).g(this.C0);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        s8g0 s8g0Var = this.f0.d;
        if (s8g0Var != null) {
            s8g0Var.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        PostingState.Editing editing;
        MusicAttachDto musicAttachDto;
        MusicAttachDto musicSnippetDto;
        String str;
        PostEditableData postEditableData;
        PostEditableData postEditableData2;
        int i2;
        int i3;
        super.onSaveInstanceState(bundle);
        PostingContentView postingContentView = this.R;
        if (postingContentView != null) {
            enc0 enc0Var = postingContentView.m;
            bundle.putParcelable("KEY_MEDIA_PICKER_OWNER_ID", enc0Var.Z);
            it10 it10Var = enc0Var.l0;
            FragmentContainerView fragmentContainerView = it10Var.b;
            float alpha = it10Var.c.getAlpha();
            float alpha2 = it10Var.d.getAlpha();
            float alpha3 = it10Var.e.getAlpha();
            float floatValue = ((Number) it10Var.f.invoke()).floatValue();
            ViewPager2 viewPager2 = it10Var.a;
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            ViewGroup.LayoutParams layoutParams2 = fragmentContainerView.getLayoutParams();
            ConstraintLayout.b bVar2 = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
            ViewGroup.LayoutParams layoutParams3 = viewPager2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i4 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            ViewGroup.LayoutParams layoutParams4 = viewPager2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            int i5 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
            int i6 = i4;
            ViewConstraint viewConstraint = new ViewConstraint(bVar != null ? bVar.i : 0, bVar != null ? bVar.j : 0, bVar != null ? bVar.k : 0, bVar != null ? bVar.l : 0);
            ViewGroup.LayoutParams layoutParams5 = fragmentContainerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams3 != null) {
                i3 = marginLayoutParams3.topMargin;
                i2 = i6;
            } else {
                i2 = i6;
                i3 = 0;
            }
            ViewGroup.LayoutParams layoutParams6 = fragmentContainerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            bundle.putParcelable("savedStateBottomSheet", new MediaPickerBottomSheetState(i2, i5, viewConstraint, i3, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0, new ViewConstraint(bVar2 != null ? bVar2.i : 0, bVar2 != null ? bVar2.j : 0, bVar2 != null ? bVar2.k : 0, bVar2 != null ? bVar2.l : 0), alpha, alpha2, alpha3, Float.valueOf(floatValue)));
            if (enc0Var.b.getChildFragmentManager().H(q970.class.getName()) != null) {
                bundle.putBoolean("KEY_HAS_DATA_LOSS_DIALOG", true);
            }
        }
        PostingState postingState = (PostingState) getFeature().g.c;
        if (postingState instanceof PostingState.Editing) {
            PostingState.Editing editing2 = (PostingState.Editing) postingState;
            PostEditableData postEditableData3 = editing2.i;
            List<PostingAttachment> list = postEditableData3.p;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (Parcelable parcelable : list) {
                if (parcelable instanceof PhotoDto) {
                    PhotoDto photoDto = (PhotoDto) parcelable;
                    if (photoDto.f.d()) {
                        parcelable = PhotoDto.a(photoDto, null, efc0.i0(photoDto.f), 47);
                        arrayList.add(parcelable);
                    }
                }
                if (parcelable instanceof VideoDto) {
                    VideoDto videoDto = (VideoDto) parcelable;
                    if (videoDto.f.d()) {
                        parcelable = VideoDto.a(videoDto, efc0.i0(videoDto.f));
                    }
                }
                arrayList.add(parcelable);
            }
            FileDto fileDto = postEditableData3.m;
            FileDto a2 = fileDto != null ? FileDto.a(fileDto, null, efc0.i0(fileDto.I4()), 63) : null;
            MusicAttachDto musicAttachDto2 = postEditableData3.l;
            if (musicAttachDto2 != null) {
                if (musicAttachDto2 instanceof MusicAttachDto.MusicPlaylistDto) {
                    MusicDto musicDto = ((MusicAttachDto.MusicPlaylistDto) musicAttachDto2).b;
                    musicSnippetDto = new MusicAttachDto.MusicPlaylistDto(MusicDto.a(musicDto, false, null, efc0.i0(musicDto.n), 12287));
                } else if (musicAttachDto2 instanceof MusicAttachDto.MusicTracksDto) {
                    List<MusicDto> list2 = ((MusicAttachDto.MusicTracksDto) musicAttachDto2).b;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    for (MusicDto musicDto2 : list2) {
                        arrayList2.add(MusicDto.a(musicDto2, false, null, efc0.i0(musicDto2.n), 12287));
                    }
                    musicSnippetDto = new MusicAttachDto.MusicTracksDto(arrayList2);
                } else {
                    if (!(musicAttachDto2 instanceof MusicAttachDto.MusicSnippetDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MusicDto musicDto3 = ((MusicAttachDto.MusicSnippetDto) musicAttachDto2).b;
                    editing = null;
                    musicSnippetDto = new MusicAttachDto.MusicSnippetDto(MusicDto.a(musicDto3, false, null, efc0.i0(musicDto3.n), 12287));
                    musicAttachDto = musicSnippetDto;
                }
                editing = null;
                musicAttachDto = musicSnippetDto;
            } else {
                editing = null;
                musicAttachDto = null;
            }
            postingState = PostingState.Editing.a(editing2, null, null, null, null, null, PostEditableData.a(editing2.i, null, null, null, null, null, null, null, null, null, musicAttachDto, a2, null, null, arrayList, null, null, null, null, null, null, null, false, null, 268415999), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
        } else {
            editing = null;
        }
        if (postingState == null || !postingState.x().t) {
            bundle.putParcelable("saved_mvi_state", postingState);
            return;
        }
        sbn sbnVar = this.k0;
        Bundle arguments = getArguments();
        sbnVar.getClass();
        String str2 = "disk_state_meta_info_" + postingState.V4().c;
        bundle.putBoolean("is_disk_state", true);
        PostingState.Editing editing3 = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : editing;
        Integer valueOf = (editing3 == null || (postEditableData2 = editing3.i) == null) ? editing : Integer.valueOf(postEditableData2.b);
        if (editing3 == null || (postEditableData = editing3.i) == null || (str = postEditableData.c) == null) {
            str = "";
        }
        bundle.putParcelable("disk_state_meta_info", new RestorePostingStateMeta(postingState.getContext(), postingState.V4(), str2, (valueOf != 0 && valueOf.intValue() == 0) ? editing : valueOf, str, postingState.z6()));
        if (arguments != null) {
            arguments.putString("disk_state_key", str2);
        }
        f9t f9tVar = sbnVar.a;
        RestorePostingState restorePostingState = new RestorePostingState(postingState);
        wmi0 wmi0Var = wmi0.a;
        wmi0Var.a(str2, restorePostingState);
        q e2 = wmi0Var.e("PostingStateCacheKeys");
        s520 s520Var = new s520(new pq5(f9tVar, str2), 11);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        sbnVar.b.b(itg0.m(e2.E(s520Var, lVar, kVar, kVar)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((p870) this.v0.getValue()).b(113, this.C0);
    }

    @Override // xsna.tvo.a
    public final void pc(int i2, List<String> list) {
        s8g0 s8g0Var = this.f0.d;
        if (s8g0Var != null) {
            s8g0Var.pc(i2, list);
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i2, List<String> list) {
        s8g0 s8g0Var = this.f0.d;
        if (s8g0Var != null) {
            s8g0Var.wi(i2, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015e  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        tkx tkxVar;
        PostingState postingState;
        Bundle bundle2;
        mui0 mui0Var;
        h0h h0hVar;
        PostingAction.Init editRemoteDraft;
        PostingAction.Init init;
        PostingAction.Init restoreStateFromDisk;
        PostingScreenContext V4;
        Iterator<E> it;
        rbc0 rbc0Var;
        Object obj;
        PostingMetricEntryPoint postingMetricEntryPoint;
        Bundle bundle3;
        mui0 mui0Var2 = (mui0) this.q0.getValue();
        tkx tkxVar2 = (tkx) this.r0.getValue();
        h0h h0hVar2 = (h0h) this.G0.getValue();
        ibc0 ibc0Var = (ibc0) this.s0.getValue();
        r8c0 r8c0Var = new r8c0(this.F0, this.H0, (gfc0) this.t0.getValue());
        zlc0 zlc0Var = (zlc0) this.D0.getValue();
        h7v h7vVar = (h7v) this.w0.getValue();
        ClipsUploadUiVkNavigator clipsUploadUiVkNavigator = (ClipsUploadUiVkNavigator) this.B0.getValue();
        w9c0 w9c0Var = this.y0;
        gxh gxhVar = this.z0;
        b25 b25Var = this.A0;
        k8c0 k8c0Var = new k8c0(w9c0Var, gxhVar, b25Var, clipsUploadUiVkNavigator);
        evl0 evl0Var = (evl0) this.b0.getValue();
        rbc0 rbc0Var2 = (rbc0) this.m0.getValue();
        PostingState postingState2 = this.n0;
        Context requireContext = requireContext();
        Bundle bundle4 = rbc0Var2.a;
        ?? r12 = rbc0Var2.h;
        ?? r13 = rbc0Var2.c;
        ?? r6 = rbc0Var2.l;
        ?? r62 = rbc0Var2.k;
        sbn sbnVar = this.k0;
        RestorePostingStateMeta restorePostingStateMeta = sbnVar.c;
        if (postingState2 != null) {
            tkxVar = tkxVar2;
            restoreStateFromDisk = new PostingAction.Init.RestoreState(postingState2);
        } else {
            tkxVar = tkxVar2;
            if (restorePostingStateMeta == null) {
                PostEditingReason postEditingReason = (PostEditingReason) r13.getValue();
                postingState = postingState2;
                if (postEditingReason instanceof PostEditingReason.NewPost) {
                    PostEditableData a2 = rbc0Var2.a();
                    if (a2 == null) {
                        a2 = PostEditableData.D;
                    }
                    bundle2 = bundle4;
                    init = new PostingAction.Init.NewPost(ffc0.a(rbc0Var2), a2);
                    mui0Var = mui0Var2;
                    h0hVar = h0hVar2;
                    if ((restorePostingStateMeta != null ? restorePostingStateMeta.c : null) != null) {
                        V4 = restorePostingStateMeta.c;
                    } else {
                        V4 = (postingState != null ? postingState.V4() : null) != null ? postingState.V4() : (PostingScreenContext) rbc0Var2.m.getValue();
                    }
                    PostingScreenContext postingScreenContext = V4;
                    WallOwner a3 = ffc0.a(rbc0Var2);
                    UserId userId = a3.b;
                    Publisher publisher = (Publisher) r62.getValue();
                    Signer signer = (Signer) r6.getValue();
                    wb7 wb7Var = new wb7(new j3j0());
                    vou vouVar = new vou(new up70(requireContext));
                    boolean equals = userId.equals(b25Var.c());
                    boolean booleanValue = ((Boolean) rbc0Var2.r.getValue()).booleanValue();
                    String str = (String) r12.getValue();
                    PostingMetricEntryPoint.Companion.getClass();
                    it = PostingMetricEntryPoint.i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            rbc0Var = rbc0Var2;
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        rbc0Var = rbc0Var2;
                        if (epx.f(((PostingMetricEntryPoint) obj).name(), str)) {
                            break;
                        }
                        rbc0Var2 = rbc0Var;
                    }
                    postingMetricEntryPoint = (PostingMetricEntryPoint) obj;
                    if (postingMetricEntryPoint == null) {
                        postingMetricEntryPoint = PostingMetricEntryPoint.Other;
                    }
                    PostingMetricEntryPoint postingMetricEntryPoint2 = postingMetricEntryPoint;
                    wmc0 wmc0Var = new wmc0();
                    f4z f4zVar = this.U;
                    wmc0Var.b(new d34(f4zVar));
                    wmc0Var.b(new dzt());
                    wmc0Var.b(new a80());
                    PostEditableData a4 = rbc0Var.a();
                    ibc0Var.e(postingMetricEntryPoint2, userId, a4 != null ? Integer.valueOf(a4.b) : null);
                    qbm0 qbm0Var = new qbm0(requireContext, new v7c0(), this.J0);
                    rbc0 rbc0Var3 = rbc0Var;
                    bundle3 = bundle2;
                    PostingAction.Init init2 = init;
                    qvn qvnVar = new qvn(vouVar, wb7Var, new rj01(new xba0()), new qs9(zlc0Var), tkxVar, new jy90(requireContext), mui0Var, h0hVar, ibc0Var, r8c0Var.c, new jgz(new squ()));
                    boolean booleanValue2 = ((Boolean) rbc0Var3.e.getValue()).booleanValue();
                    boolean booleanValue3 = ((Boolean) rbc0Var3.g.getValue()).booleanValue();
                    Boolean bool = (Boolean) rbc0Var3.f.getValue();
                    EditingPost editingPost = (EditingPost) rbc0Var3.q.getValue();
                    String str2 = (String) rbc0Var3.j.getValue();
                    cpc0 cpc0Var = this.W;
                    PostingContext postingContext = new PostingContext(a3, equals, equals, publisher, signer, null, postingMetricEntryPoint2, booleanValue2, booleanValue3, bool, booleanValue, editingPost, (str2 == null && epx.f((String) r12.getValue(), PostingCreationEntryPoint.FeedPlus.toString()) && ((Boolean) cpc0Var.N.getValue()).booleanValue()) ? str2 : null, null, k8c0Var.c.c(), 8192, null);
                    MediaPickerState mediaPickerState = MediaPickerState.k;
                    PostingSettings postingSettings = ((j3j0) wb7Var.b).c;
                    up70 up70Var = (up70) vouVar.b;
                    EmptyList emptyList = EmptyList.b;
                    AtomicReference<Location> atomicReference = oxz.a;
                    Context context = (Context) up70Var.b;
                    LocationCommon.a.getClass();
                    GeoPermissionStatus geoPermissionStatus = !LocationCommon.b(context) ? GeoPermissionStatus.DeviceRestricted : !LocationCommon.a(context) ? GeoPermissionStatus.ApplicationRestricted : GeoPermissionStatus.Granted;
                    NoLocation noLocation = NoLocation.b;
                    NearbyPlaces nearbyPlaces = new NearbyPlaces(emptyList, 0, 0, PlacesLoadingState.Idle, geoPermissionStatus, noLocation, noLocation);
                    PostingNavigationState postingNavigationState = new PostingNavigationState(Collections.singletonList(new PostingStep(PostingStepScreen.PostTextInput.b, true, true, null, 8, null)));
                    PostEditingReason postEditingReason2 = (PostEditingReason) r13.getValue();
                    LoadingState loadingState = LoadingState.LOADING;
                    com.vk.core.utils.newtork.b.a.getClass();
                    PostingState.Loading loading = new PostingState.Loading(postingScreenContext, postingContext, mediaPickerState, postingSettings, nearbyPlaces, postingNavigationState, postEditingReason2, loadingState, false, com.vk.core.utils.newtork.b.d(), null, emptyList, emptyList, PostingTechMetrics.k, null, 17408, null);
                    vpc0 vpc0Var = new vpc0(requireContext, evl0Var);
                    new rj60(f4zVar, 10);
                    efc0 efc0Var = new efc0(qvnVar, new qkc0(loading, vpc0Var, new vrg0(), wmc0Var, f4zVar, r8c0Var.b, ibc0Var, evl0Var, cpc0Var), init2, f4zVar, this.p0, cpc0Var, (Integer) rbc0Var3.p.getValue(), r8c0Var, h7vVar, k8c0Var, sbnVar, this.X, qbm0Var, this.K0, evl0Var);
                    if (bundle3.containsKey("post_data_for_editing")) {
                        bundle3.remove("post_data_for_editing");
                    }
                    if (bundle3.containsKey("editing_post")) {
                        bundle3.remove("editing_post");
                    }
                    return efc0Var;
                }
                bundle2 = bundle4;
                if (postEditingReason instanceof PostEditingReason.EditExistingPost) {
                    PostEditableData a5 = rbc0Var2.a();
                    if (a5 == null) {
                        a5 = PostEditableData.D;
                    }
                    mui0Var = mui0Var2;
                    h0hVar = h0hVar2;
                    editRemoteDraft = new PostingAction.Init.EditPost(ffc0.a(rbc0Var2), (Publisher) r62.getValue(), (Signer) r6.getValue(), a5);
                } else {
                    mui0Var = mui0Var2;
                    h0hVar = h0hVar2;
                    if (postEditingReason instanceof PostEditingReason.EditLocalDraft) {
                        PostEditableData a6 = rbc0Var2.a();
                        if (a6 == null) {
                            a6 = PostEditableData.D;
                        }
                        AdditionalSettingsConfiguration additionalSettingsConfiguration = a6.q;
                        Boolean valueOf = additionalSettingsConfiguration != null ? Boolean.valueOf(additionalSettingsConfiguration.f) : null;
                        editRemoteDraft = new PostingAction.Init.LoadLocalDraft(ffc0.a(rbc0Var2), ((Number) rbc0Var2.d.getValue()).longValue(), valueOf != null ? valueOf.booleanValue() : false);
                    } else {
                        if (!(postEditingReason instanceof PostEditingReason.EditRemoteDraft)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PostEditableData a7 = rbc0Var2.a();
                        if (a7 == null) {
                            a7 = PostEditableData.D;
                        }
                        editRemoteDraft = new PostingAction.Init.EditRemoteDraft(ffc0.a(rbc0Var2), (Publisher) r62.getValue(), (Signer) r6.getValue(), a7);
                    }
                }
                init = editRemoteDraft;
                if ((restorePostingStateMeta != null ? restorePostingStateMeta.c : null) != null) {
                }
                PostingScreenContext postingScreenContext2 = V4;
                WallOwner a32 = ffc0.a(rbc0Var2);
                UserId userId2 = a32.b;
                Publisher publisher2 = (Publisher) r62.getValue();
                Signer signer2 = (Signer) r6.getValue();
                wb7 wb7Var2 = new wb7(new j3j0());
                vou vouVar2 = new vou(new up70(requireContext));
                boolean equals2 = userId2.equals(b25Var.c());
                boolean booleanValue4 = ((Boolean) rbc0Var2.r.getValue()).booleanValue();
                String str3 = (String) r12.getValue();
                PostingMetricEntryPoint.Companion.getClass();
                it = PostingMetricEntryPoint.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                    rbc0Var2 = rbc0Var;
                }
                postingMetricEntryPoint = (PostingMetricEntryPoint) obj;
                if (postingMetricEntryPoint == null) {
                }
                PostingMetricEntryPoint postingMetricEntryPoint22 = postingMetricEntryPoint;
                wmc0 wmc0Var2 = new wmc0();
                f4z f4zVar2 = this.U;
                wmc0Var2.b(new d34(f4zVar2));
                wmc0Var2.b(new dzt());
                wmc0Var2.b(new a80());
                PostEditableData a42 = rbc0Var.a();
                ibc0Var.e(postingMetricEntryPoint22, userId2, a42 != null ? Integer.valueOf(a42.b) : null);
                qbm0 qbm0Var2 = new qbm0(requireContext, new v7c0(), this.J0);
                rbc0 rbc0Var32 = rbc0Var;
                bundle3 = bundle2;
                PostingAction.Init init22 = init;
                qvn qvnVar2 = new qvn(vouVar2, wb7Var2, new rj01(new xba0()), new qs9(zlc0Var), tkxVar, new jy90(requireContext), mui0Var, h0hVar, ibc0Var, r8c0Var.c, new jgz(new squ()));
                boolean booleanValue22 = ((Boolean) rbc0Var32.e.getValue()).booleanValue();
                boolean booleanValue32 = ((Boolean) rbc0Var32.g.getValue()).booleanValue();
                Boolean bool2 = (Boolean) rbc0Var32.f.getValue();
                EditingPost editingPost2 = (EditingPost) rbc0Var32.q.getValue();
                String str22 = (String) rbc0Var32.j.getValue();
                cpc0 cpc0Var2 = this.W;
                PostingContext postingContext2 = new PostingContext(a32, equals2, equals2, publisher2, signer2, null, postingMetricEntryPoint22, booleanValue22, booleanValue32, bool2, booleanValue4, editingPost2, (str22 == null && epx.f((String) r12.getValue(), PostingCreationEntryPoint.FeedPlus.toString()) && ((Boolean) cpc0Var2.N.getValue()).booleanValue()) ? str22 : null, null, k8c0Var.c.c(), 8192, null);
                MediaPickerState mediaPickerState2 = MediaPickerState.k;
                PostingSettings postingSettings2 = ((j3j0) wb7Var2.b).c;
                up70 up70Var2 = (up70) vouVar2.b;
                EmptyList emptyList2 = EmptyList.b;
                AtomicReference<Location> atomicReference2 = oxz.a;
                Context context2 = (Context) up70Var2.b;
                LocationCommon.a.getClass();
                GeoPermissionStatus geoPermissionStatus2 = !LocationCommon.b(context2) ? GeoPermissionStatus.DeviceRestricted : !LocationCommon.a(context2) ? GeoPermissionStatus.ApplicationRestricted : GeoPermissionStatus.Granted;
                NoLocation noLocation2 = NoLocation.b;
                NearbyPlaces nearbyPlaces2 = new NearbyPlaces(emptyList2, 0, 0, PlacesLoadingState.Idle, geoPermissionStatus2, noLocation2, noLocation2);
                PostingNavigationState postingNavigationState2 = new PostingNavigationState(Collections.singletonList(new PostingStep(PostingStepScreen.PostTextInput.b, true, true, null, 8, null)));
                PostEditingReason postEditingReason22 = (PostEditingReason) r13.getValue();
                LoadingState loadingState2 = LoadingState.LOADING;
                com.vk.core.utils.newtork.b.a.getClass();
                PostingState.Loading loading2 = new PostingState.Loading(postingScreenContext2, postingContext2, mediaPickerState2, postingSettings2, nearbyPlaces2, postingNavigationState2, postEditingReason22, loadingState2, false, com.vk.core.utils.newtork.b.d(), null, emptyList2, emptyList2, PostingTechMetrics.k, null, 17408, null);
                vpc0 vpc0Var2 = new vpc0(requireContext, evl0Var);
                new rj60(f4zVar2, 10);
                efc0 efc0Var2 = new efc0(qvnVar2, new qkc0(loading2, vpc0Var2, new vrg0(), wmc0Var2, f4zVar2, r8c0Var.b, ibc0Var, evl0Var, cpc0Var2), init22, f4zVar2, this.p0, cpc0Var2, (Integer) rbc0Var32.p.getValue(), r8c0Var, h7vVar, k8c0Var, sbnVar, this.X, qbm0Var2, this.K0, evl0Var);
                if (bundle3.containsKey("post_data_for_editing")) {
                }
                if (bundle3.containsKey("editing_post")) {
                }
                return efc0Var2;
            }
            restoreStateFromDisk = new PostingAction.Init.RestoreStateFromDisk(restorePostingStateMeta);
        }
        postingState = postingState2;
        init = restoreStateFromDisk;
        bundle2 = bundle4;
        mui0Var = mui0Var2;
        h0hVar = h0hVar2;
        if ((restorePostingStateMeta != null ? restorePostingStateMeta.c : null) != null) {
        }
        PostingScreenContext postingScreenContext22 = V4;
        WallOwner a322 = ffc0.a(rbc0Var2);
        UserId userId22 = a322.b;
        Publisher publisher22 = (Publisher) r62.getValue();
        Signer signer22 = (Signer) r6.getValue();
        wb7 wb7Var22 = new wb7(new j3j0());
        vou vouVar22 = new vou(new up70(requireContext));
        boolean equals22 = userId22.equals(b25Var.c());
        boolean booleanValue42 = ((Boolean) rbc0Var2.r.getValue()).booleanValue();
        String str32 = (String) r12.getValue();
        PostingMetricEntryPoint.Companion.getClass();
        it = PostingMetricEntryPoint.i().iterator();
        while (true) {
            if (!it.hasNext()) {
            }
            rbc0Var2 = rbc0Var;
        }
        postingMetricEntryPoint = (PostingMetricEntryPoint) obj;
        if (postingMetricEntryPoint == null) {
        }
        PostingMetricEntryPoint postingMetricEntryPoint222 = postingMetricEntryPoint;
        wmc0 wmc0Var22 = new wmc0();
        f4z f4zVar22 = this.U;
        wmc0Var22.b(new d34(f4zVar22));
        wmc0Var22.b(new dzt());
        wmc0Var22.b(new a80());
        PostEditableData a422 = rbc0Var.a();
        ibc0Var.e(postingMetricEntryPoint222, userId22, a422 != null ? Integer.valueOf(a422.b) : null);
        qbm0 qbm0Var22 = new qbm0(requireContext, new v7c0(), this.J0);
        rbc0 rbc0Var322 = rbc0Var;
        bundle3 = bundle2;
        PostingAction.Init init222 = init;
        qvn qvnVar22 = new qvn(vouVar22, wb7Var22, new rj01(new xba0()), new qs9(zlc0Var), tkxVar, new jy90(requireContext), mui0Var, h0hVar, ibc0Var, r8c0Var.c, new jgz(new squ()));
        boolean booleanValue222 = ((Boolean) rbc0Var322.e.getValue()).booleanValue();
        boolean booleanValue322 = ((Boolean) rbc0Var322.g.getValue()).booleanValue();
        Boolean bool22 = (Boolean) rbc0Var322.f.getValue();
        EditingPost editingPost22 = (EditingPost) rbc0Var322.q.getValue();
        String str222 = (String) rbc0Var322.j.getValue();
        cpc0 cpc0Var22 = this.W;
        PostingContext postingContext22 = new PostingContext(a322, equals22, equals22, publisher22, signer22, null, postingMetricEntryPoint222, booleanValue222, booleanValue322, bool22, booleanValue42, editingPost22, (str222 == null && epx.f((String) r12.getValue(), PostingCreationEntryPoint.FeedPlus.toString()) && ((Boolean) cpc0Var22.N.getValue()).booleanValue()) ? str222 : null, null, k8c0Var.c.c(), 8192, null);
        MediaPickerState mediaPickerState22 = MediaPickerState.k;
        PostingSettings postingSettings22 = ((j3j0) wb7Var22.b).c;
        up70 up70Var22 = (up70) vouVar22.b;
        EmptyList emptyList22 = EmptyList.b;
        AtomicReference<Location> atomicReference22 = oxz.a;
        Context context22 = (Context) up70Var22.b;
        LocationCommon.a.getClass();
        GeoPermissionStatus geoPermissionStatus22 = !LocationCommon.b(context22) ? GeoPermissionStatus.DeviceRestricted : !LocationCommon.a(context22) ? GeoPermissionStatus.ApplicationRestricted : GeoPermissionStatus.Granted;
        NoLocation noLocation22 = NoLocation.b;
        NearbyPlaces nearbyPlaces22 = new NearbyPlaces(emptyList22, 0, 0, PlacesLoadingState.Idle, geoPermissionStatus22, noLocation22, noLocation22);
        PostingNavigationState postingNavigationState22 = new PostingNavigationState(Collections.singletonList(new PostingStep(PostingStepScreen.PostTextInput.b, true, true, null, 8, null)));
        PostEditingReason postEditingReason222 = (PostEditingReason) r13.getValue();
        LoadingState loadingState22 = LoadingState.LOADING;
        com.vk.core.utils.newtork.b.a.getClass();
        PostingState.Loading loading22 = new PostingState.Loading(postingScreenContext22, postingContext22, mediaPickerState22, postingSettings22, nearbyPlaces22, postingNavigationState22, postEditingReason222, loadingState22, false, com.vk.core.utils.newtork.b.d(), null, emptyList22, emptyList22, PostingTechMetrics.k, null, 17408, null);
        vpc0 vpc0Var22 = new vpc0(requireContext, evl0Var);
        new rj60(f4zVar22, 10);
        efc0 efc0Var22 = new efc0(qvnVar22, new qkc0(loading22, vpc0Var22, new vrg0(), wmc0Var22, f4zVar22, r8c0Var.b, ibc0Var, evl0Var, cpc0Var22), init222, f4zVar22, this.p0, cpc0Var22, (Integer) rbc0Var322.p.getValue(), r8c0Var, h7vVar, k8c0Var, sbnVar, this.X, qbm0Var22, this.K0, evl0Var);
        if (bundle3.containsKey("post_data_for_editing")) {
        }
        if (bundle3.containsKey("editing_post")) {
        }
        return efc0Var22;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        PostingContentView postingContentView = this.R;
        PostingContentView.PostingStep postingStep = null;
        if (postingContentView != null) {
            if (bwt0.K(postingContentView.j)) {
                postingStep = PostingContentView.PostingStep.One;
            } else if (bwt0.K(postingContentView.k)) {
                postingStep = PostingContentView.PostingStep.Other;
            }
        }
        int i2 = postingStep == null ? -1 : b.$EnumSwitchMapping$0[postingStep.ordinal()];
        if (i2 == -1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_1;
        } else if (i2 == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_2;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    /* compiled from: PostingFragment.kt */
    public static final class c implements nhl {
        public c() {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
            int i = PostingFragment.L0;
            PostingFragment postingFragment = PostingFragment.this;
            ikv0 ikv0Var = ((ud20) postingFragment.E0.getValue()).b;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            xn50.a.c(postingFragment, PostingAction.LocalDraft.SaveDraft.b);
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
            PostingFragment.this.U.b(fmc0.f.a.a);
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }
}
