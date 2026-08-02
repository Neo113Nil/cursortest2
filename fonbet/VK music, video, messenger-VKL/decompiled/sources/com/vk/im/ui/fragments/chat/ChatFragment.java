package com.vk.im.ui.fragments.chat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.chat.restriction.api.ChatWriteRestrictionFeatureComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.exceptions.chat.ChatInvitationException;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.education.EduMaxTransitionBannerLocalState$EntryPoint;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import com.vk.im.messageviews.api.MessageViewsFeatureComponent;
import com.vk.im.popup.a;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.im.ui.fragments.SnackbarParams;
import com.vk.im.ui.fragments.chat.c;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.media.VideoCacheIdImpl;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.toggle.features.ImFeatures;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import defpackage.k0;
import defpackage.r;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.f0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a1w;
import xsna.a8;
import xsna.aez;
import xsna.afm;
import xsna.alm;
import xsna.aqx0;
import xsna.as;
import xsna.asb;
import xsna.asu0;
import xsna.au90;
import xsna.b0u0;
import xsna.b25;
import xsna.b26;
import xsna.b7u0;
import xsna.bb;
import xsna.bcw;
import xsna.bn3;
import xsna.bo8;
import xsna.bof;
import xsna.bpn0;
import xsna.bu00;
import xsna.bwt0;
import xsna.c4g0;
import xsna.cew;
import xsna.crb;
import xsna.d6p;
import xsna.da;
import xsna.dhr0;
import xsna.dj30;
import xsna.drm0;
import xsna.dy0;
import xsna.e24;
import xsna.e38;
import xsna.e3m;
import xsna.e9m;
import xsna.e9w;
import xsna.ea;
import xsna.eam;
import xsna.ebj;
import xsna.eiy;
import xsna.el3;
import xsna.em0;
import xsna.eop0;
import xsna.epx;
import xsna.esb;
import xsna.ets0;
import xsna.ev9;
import xsna.f1;
import xsna.f1w;
import xsna.f5;
import xsna.f9w;
import xsna.fm0;
import xsna.fnj;
import xsna.fnv0;
import xsna.fpf0;
import xsna.fv9;
import xsna.g2v;
import xsna.g5;
import xsna.gf0;
import xsna.gvs;
import xsna.gz80;
import xsna.gzp0;
import xsna.h2l0;
import xsna.h5s;
import xsna.h7;
import xsna.h9;
import xsna.ham;
import xsna.hd;
import xsna.hfr;
import xsna.hg;
import xsna.hg1;
import xsna.ho8;
import xsna.hyp;
import xsna.i0q0;
import xsna.i13;
import xsna.i2n0;
import xsna.i6p;
import xsna.i7o0;
import xsna.iah0;
import xsna.ic;
import xsna.ies;
import xsna.ify;
import xsna.ikv0;
import xsna.il30;
import xsna.imv;
import xsna.ir0;
import xsna.ir4;
import xsna.itb;
import xsna.iu1;
import xsna.iut0;
import xsna.iwv;
import xsna.izi0;
import xsna.izs;
import xsna.j1;
import xsna.j22;
import xsna.j70;
import xsna.jbs;
import xsna.jd;
import xsna.jmd;
import xsna.js4;
import xsna.jtb;
import xsna.jw5;
import xsna.jwg0;
import xsna.jz;
import xsna.k15;
import xsna.k28;
import xsna.k53;
import xsna.kcl0;
import xsna.kd;
import xsna.kkm;
import xsna.klm;
import xsna.ktb;
import xsna.kwg0;
import xsna.kz30;
import xsna.l1;
import xsna.l7m;
import xsna.ld;
import xsna.le6;
import xsna.ly30;
import xsna.lyd;
import xsna.lzv;
import xsna.m1;
import xsna.m20;
import xsna.m63;
import xsna.m7m;
import xsna.mbm;
import xsna.mdz;
import xsna.mh80;
import xsna.mhy;
import xsna.msy;
import xsna.mxv;
import xsna.myc0;
import xsna.mzp0;
import xsna.n0v0;
import xsna.n34;
import xsna.nf3;
import xsna.ng1;
import xsna.ng7;
import xsna.no;
import xsna.ns1;
import xsna.nsx;
import xsna.nz;
import xsna.o25;
import xsna.o420;
import xsna.oew;
import xsna.oqb;
import xsna.oxv;
import xsna.oz;
import xsna.oz50;
import xsna.pbw;
import xsna.pd;
import xsna.pf;
import xsna.pf1;
import xsna.pjm;
import xsna.pnp0;
import xsna.pqb;
import xsna.pz30;
import xsna.q380;
import xsna.qb;
import xsna.qbm;
import xsna.qc;
import xsna.qcy;
import xsna.qew;
import xsna.ql30;
import xsna.qqb;
import xsna.qtd0;
import xsna.r41;
import xsna.r6;
import xsna.r7;
import xsna.rl3;
import xsna.rli0;
import xsna.rsr;
import xsna.rtb;
import xsna.ry30;
import xsna.rzp0;
import xsna.s1;
import xsna.s380;
import xsna.s3q0;
import xsna.s3w;
import xsna.s5;
import xsna.sc2;
import xsna.sf;
import xsna.sh6;
import xsna.sqb;
import xsna.sqm;
import xsna.sv1;
import xsna.szf0;
import xsna.t5;
import xsna.t6;
import xsna.t6g0;
import xsna.thp0;
import xsna.too0;
import xsna.tw4;
import xsna.u8m;
import xsna.ubq;
import xsna.uki0;
import xsna.umb;
import xsna.uqm;
import xsna.v1o;
import xsna.v7s0;
import xsna.v8m;
import xsna.vds;
import xsna.vm30;
import xsna.vqb;
import xsna.w080;
import xsna.w530;
import xsna.w8i;
import xsna.wew;
import xsna.wm1;
import xsna.wtb;
import xsna.wym;
import xsna.wym.a;
import xsna.x080;
import xsna.xa4;
import xsna.xdw;
import xsna.xey;
import xsna.xq;
import xsna.xqb;
import xsna.xwb0;
import xsna.y6;
import xsna.yc;
import xsna.yds;
import xsna.yh;
import xsna.yqb;
import xsna.yw90;
import xsna.z6p;
import xsna.z8m;
import xsna.zcl;
import xsna.zdw;
import xsna.zey;
import xsna.zk70;
import xsna.zrd0;

/* compiled from: ChatFragment.kt */
/* loaded from: classes.dex */
public final class ChatFragment extends ImFragment implements ies, au90, too0, szf0, ktb.a, w8i, yds, ify.a, eam, vds {
    public static final d w1;
    public static final /* synthetic */ qcy<Object>[] x1;
    public static volatile long y1;
    public static final f9w z1;
    public final Object A0;
    public final kcl0 B0;
    public final e38 C0;
    public io.reactivex.rxjava3.disposables.b D0;
    public final io.reactivex.rxjava3.disposables.b E0;
    public io.reactivex.rxjava3.disposables.c F0;
    public Msg G0;
    public com.vk.im.ui.components.msg_list.a H0;
    public rtb I0;
    public imv J0;
    public DialogHeaderController K0;
    public b26 L0;
    public o420 M0;
    public z6p N0;
    public i6p O0;
    public final zdw P;
    public d6p P0;
    public final pbw Q;
    public ng7 Q0;
    public final OpenMessagesHistoryReporter R;
    public wew R0;
    public final mdz<OpenMessagesHistoryReporter.Span> S;
    public z8m S0;
    public final Object T;
    public DisableableRelativeLayout T0;
    public final Object U;
    public ViewGroup U0;
    public DialogExt V;
    public h2l0 V0;
    public MsgListOpenMode W;
    public FrameLayout W0;
    public FolderType X;
    public View X0;
    public umb Y;
    public View Y0;
    public final nf3 Z;
    public pjm Z0;
    public String a0;
    public k28 a1;
    public String b0;
    public ktb b1;
    public String c0;
    public alm c1;
    public int d0;
    public ets0 d1;
    public boolean e0;
    public PopupStickerView e1;
    public final long f0;
    public final bpn0 f1;
    public boolean g0;
    public final bpn0 g1;
    public ImSearchItemLoggingInfo h0;
    public final bpn0 h1;
    public boolean i0;
    public final Object i1;
    public Integer j0;
    public final Object j1;
    public com.vk.im.popup.b k0;
    public final bpn0 k1;
    public ikv0 l0;
    public final Object l1;
    public final Object m0;
    public final Object m1;
    public final bpn0 n0;
    public final Object n1;
    public final bpn0 o0;
    public final Object o1;
    public final bpn0 p0;
    public final Object p1;
    public final bpn0 q0;
    public final Object q1;
    public final mxv r0;
    public final bpn0 r1;
    public final dhr0 s0;
    public boolean s1;
    public final ImageViewer t0;
    public xey t1;
    public final jbs u0;
    public final Object u1;
    public ImageViewer.c<?> v0;
    public final Object v1;
    public ImageViewer.c<AttachForMediaViewer> w0;
    public final ry30 x0;
    public final bcw y0;
    public final Object z0;

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class a {
        public a() {
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class b {
        public b() {
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class c {
        public c() {
        }

        public final void a() {
            ChatFragment chatFragment = ChatFragment.this;
            chatFragment.Hn();
            chatFragment.finish();
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d {
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class e extends e9m {
        public final Handler j;

        public e(DisableableRelativeLayout disableableRelativeLayout, kkm kkmVar) {
            super(disableableRelativeLayout, kkmVar);
            this.j = new Handler();
        }

        @Override // xsna.e9m, xsna.z8m
        public final boolean a(boolean z) {
            this.j.removeCallbacksAndMessages(null);
            if (isVisible()) {
                ChatFragment chatFragment = ChatFragment.this;
                if (chatFragment.isResumed() && !chatFragment.isHidden()) {
                    com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    aVar.V0();
                }
            }
            if (!this.i || !isVisible()) {
                return false;
            }
            if (v8m.a != null) {
                com.vk.metrics.eventtracking.b.a.n("IM.DIALOG_ACTION.CANCELED");
                v8m.a = null;
            }
            wym wymVar = this.g;
            if (wymVar == null) {
                wymVar = null;
            }
            View view = wymVar.a;
            if (wymVar.b()) {
                if (z) {
                    wymVar.a();
                    view.setVisibility(0);
                    view.setAlpha(0.4f);
                    wymVar.c = view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).setInterpolator(wym.e).setListener(wymVar.new a(8));
                } else {
                    wymVar.a();
                    view.setVisibility(8);
                    view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            aez aezVar = this.h;
            (aezVar != null ? aezVar : null).a(z);
            return true;
        }

        @Override // xsna.z8m
        public final void b(List<? extends u8m> list, izs<? super u8m, s3q0> izsVar) {
            Handler handler = this.j;
            handler.removeCallbacksAndMessages(null);
            ChatFragment chatFragment = ChatFragment.this;
            mhy.b(chatFragment.getActivity());
            com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.W0();
            int i = ify.a;
            long j = ify.e(ify.c) ? 160L : 0L;
            imv imvVar = chatFragment.J0;
            if ((imvVar != null ? imvVar : null).a0()) {
                j = 220;
            }
            handler.postDelayed(new yqb(this, list, izsVar), j);
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class f {
        public f() {
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class g {

        /* compiled from: ChatFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogHeaderController.Screen.values().length];
                try {
                    iArr[DialogHeaderController.Screen.ACTIONS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogHeaderController.Screen.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DialogHeaderController.Screen.EDIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public g() {
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class i {
        public i() {
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class j {
        public j() {
        }

        public final void a(boolean z) {
            DialogHeaderController dialogHeaderController = ChatFragment.this.K0;
            if (dialogHeaderController == null) {
                dialogHeaderController = null;
            }
            afm afmVar = dialogHeaderController.f;
            afmVar.D.m = z;
            afmVar.e1();
        }

        public final void b(ArrayList arrayList) {
            boolean isEmpty = arrayList.isEmpty();
            ChatFragment chatFragment = ChatFragment.this;
            if (!isEmpty) {
                imv imvVar = chatFragment.J0;
                if (imvVar == null) {
                    imvVar = null;
                }
                imvVar.h(MsgSendHidePopupsReason.OTHER);
            }
            DialogHeaderController dialogHeaderController = chatFragment.K0;
            (dialogHeaderController != null ? dialogHeaderController : null).m(arrayList);
        }

        public final void c(AttachSticker attachSticker) {
            PopupStickerAnimation popupStickerAnimation = attachSticker.g.k;
            if (popupStickerAnimation != null) {
                d dVar = ChatFragment.w1;
                ChatFragment.this.Fo(popupStickerAnimation, attachSticker);
            }
        }

        public final void d(MsgFromUser msgFromUser) {
            ChatFragment.fo(ChatFragment.this, msgFromUser);
        }

        public final void e(ImSearchAnalytics.ClickAction clickAction) {
            ImSearchItemLoggingInfo imSearchItemLoggingInfo = ChatFragment.this.h0;
            if (imSearchItemLoggingInfo != null) {
                ImSearchAnalytics.d(clickAction, imSearchItemLoggingInfo);
            }
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class k implements wtb {
        public k() {
        }

        @Override // xsna.oz30
        public final FragmentImpl a() {
            return ChatFragment.this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            if (r0.equals("contact_list_vk_create_contact") == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        
            r0 = "unknown";
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0083, code lost:
        
            if (r0.equals("start_conv_create_contact") == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x008c, code lost:
        
            if (r0.equals("contact_list_me_create_contact") == false) goto L52;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // xsna.oz30
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(int i, String str, MsgTextFormat msgTextFormat, String str2, List list, Integer num, MsgSendSource msgSendSource, Set set, ly30 ly30Var) {
            String str3;
            AttachSticker attachSticker;
            ly30 ly30Var2 = ly30Var;
            ChatFragment chatFragment = ChatFragment.this;
            if (i != 0) {
                DialogHeaderController dialogHeaderController = chatFragment.K0;
                if (dialogHeaderController == null) {
                    dialogHeaderController = null;
                }
                dialogHeaderController.r();
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.O0.k(null);
                aVar.T.d();
            }
            if (ly30Var2 == null) {
                ly30Var2 = ly30.f;
            }
            ChatFragment.eo(chatFragment, i, str, msgTextFormat, str2, list, set, num, msgSendSource, ly30Var2);
            ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
            if (imSearchItemLoggingInfo != null) {
                ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.SEND_MESSAGE_OUT, imSearchItemLoggingInfo);
            }
            DialogExt dialogExt = chatFragment.V;
            if (dialogExt == null) {
                dialogExt = null;
            }
            Dialog Cb = dialogExt.Cb();
            BotKeyboard V2 = Cb != null ? Cb.V2() : null;
            if (V2 != null && V2.c) {
                imv imvVar = chatFragment.J0;
                if (imvVar == null) {
                    imvVar = null;
                }
                imvVar.z();
            }
            imv imvVar2 = chatFragment.J0;
            if (imvVar2 == null) {
                imvVar2 = null;
            }
            imvVar2.getClass();
            String str4 = chatFragment.a0;
            switch (str4.hashCode()) {
                case -1914982357:
                    if (str4.equals("share_external")) {
                        str3 = "share_external_additional";
                        break;
                    }
                    str3 = null;
                    break;
                case -914197891:
                    if (str4.equals("share_external_direct")) {
                        str3 = "share_external_direct_additional";
                        break;
                    }
                    str3 = null;
                    break;
                case -301845758:
                    break;
                case -128848661:
                    break;
                case 224801861:
                    break;
                default:
                    str3 = null;
                    break;
            }
            if (str3 != null) {
                chatFragment.a0 = str3;
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.h1(chatFragment.j0, str3);
            }
            ChatAnalyticsParams chatAnalyticsParams = (ChatAnalyticsParams) chatFragment.requireArguments().getParcelable("analytics_params");
            if (chatAnalyticsParams != null && chatAnalyticsParams.f) {
                Long l = chatAnalyticsParams.b;
                Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
                UserId userId = chatAnalyticsParams.c;
                Long valueOf2 = userId != null ? Long.valueOf(userId.b) : null;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = chatAnalyticsParams.d;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = chatAnalyticsParams.e;
                String str5 = chatAnalyticsParams.g;
                UserId userId2 = chatAnalyticsParams.h;
                gzp0.a.c(MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, null, null, new MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem(valueOf, valueOf2, str5, userId2 != null ? Long.valueOf(userId2.b) : null, chatAnalyticsParams.j), 56));
            }
            com.vk.im.ui.components.msg_list.a aVar3 = chatFragment.H0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            Dialog f = aVar3.O0.f();
            if (f == null || !f.Cc()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        attachSticker = it.next();
                        Attach attach = (Attach) attachSticker;
                        if (!(attach instanceof AttachSticker) || !((AttachSticker) attach).g.z9()) {
                        }
                    } else {
                        attachSticker = 0;
                    }
                }
                AttachSticker attachSticker2 = attachSticker instanceof AttachSticker ? attachSticker : null;
                if (attachSticker2 == null) {
                    return;
                }
                t6g0 t6g0Var = t6g0.b;
                aVar3.g0.b(t6g0.d().I0().b().m(asu0.a.d()).subscribe(new eiy(new com.vk.movika.sdk.base.logic.interactor.i(20, aVar3, attachSticker2), 3), new ubq(new gvs(9), 13)));
            }
        }

        @Override // xsna.vey
        public final void e(float f) {
            d dVar = ChatFragment.w1;
            ChatFragment chatFragment = ChatFragment.this;
            if (chatFragment.mo().l()) {
                xey xeyVar = chatFragment.t1;
                if (xeyVar == null) {
                    xeyVar = null;
                }
                if (xeyVar.h && gz80.a(30)) {
                    hfr hfrVar = xeyVar.f;
                    hfrVar.getClass();
                    hfr.a aVar = new hfr.a(hfrVar);
                    while (aVar.hasNext()) {
                        View view = (View) aVar.next();
                        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        eop0 eop0Var = new eop0(view, f);
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        aqx0.a(view, eop0Var);
                    }
                }
            }
        }

        public final void f() {
            d dVar = ChatFragment.w1;
            ChatFragment chatFragment = ChatFragment.this;
            if (chatFragment.mo().l()) {
                xey xeyVar = chatFragment.t1;
                if (xeyVar == null) {
                    xeyVar = null;
                }
                if (xeyVar.h && gz80.a(30)) {
                    hfr hfrVar = xeyVar.f;
                    hfrVar.getClass();
                    hfr.a aVar = new hfr.a(hfrVar);
                    while (aVar.hasNext()) {
                        View view = (View) aVar.next();
                        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                        aqx0.a(view, null);
                    }
                }
            }
        }

        public final void g(boolean z) {
            com.vk.im.ui.components.msg_list.a aVar = ChatFragment.this.H0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.g2(!z);
        }

        public final void h(boolean z) {
            ChatFragment chatFragment = ChatFragment.this;
            ets0 ets0Var = chatFragment.d1;
            if (ets0Var != null) {
                DisableableRelativeLayout disableableRelativeLayout = chatFragment.T0;
                if (disableableRelativeLayout == null) {
                    disableableRelativeLayout = null;
                }
                ets0Var.b(disableableRelativeLayout, R.id.bottom_panel_container, chatFragment.ho(), z);
            }
        }

        public final void i(Msg msg) {
            ChatFragment.fo(ChatFragment.this, (MsgFromUser) msg);
        }

        public final void j(float f) {
            d dVar = ChatFragment.w1;
            ChatFragment chatFragment = ChatFragment.this;
            if (chatFragment.mo().l()) {
                xey xeyVar = chatFragment.t1;
                if (xeyVar == null) {
                    xeyVar = null;
                }
                xeyVar.getClass();
                if (gz80.a(30)) {
                    View view = xeyVar.e;
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    zey zeyVar = new zey(view, f);
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    aqx0.a(view, zeyVar);
                }
            }
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class l {
        public l() {
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class m implements ets0.a {
        public m() {
        }

        @Override // xsna.ets0.a
        public final void a() {
            imv imvVar = ChatFragment.this.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.A();
        }

        @Override // xsna.ets0.a
        public final void b(File file, int i, boolean z) {
            String path = file.getPath();
            VideoFileOld videoFileOld = new VideoFileOld();
            videoFileOld.z = true;
            videoFileOld.l0 = true;
            AttachVideoMsg attachVideoMsg = new AttachVideoMsg(videoFileOld, i, new ImageList(null, 1, null), null, 0L, new ImageList(new Image(path)), path, 0, AttachSyncState.UPLOAD_REQUIRED, null, null, 0, false, false, false, null, 65176, null);
            ChatFragment chatFragment = ChatFragment.this;
            ImSearchItemLoggingInfo imSearchItemLoggingInfo = chatFragment.h0;
            if (imSearchItemLoggingInfo != null) {
                ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.SEND_MESSAGE_OUT, imSearchItemLoggingInfo);
            }
            MsgTextFormat msgTextFormat = MsgTextFormat.d;
            List singletonList = Collections.singletonList(attachVideoMsg);
            imv imvVar = chatFragment.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            ChatFragment.eo(chatFragment, 0, "", msgTextFormat, "", singletonList, EmptySet.b, imvVar.v(), MsgSendSource.e.a, new ly30(null, null, Boolean.valueOf(z), 7));
            imv imvVar2 = chatFragment.J0;
            if (imvVar2 == null) {
                imvVar2 = null;
            }
            imvVar2.y();
        }

        @Override // xsna.ets0.a
        public final void c(long j) {
            imv imvVar = ChatFragment.this.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.C(j);
        }

        @Override // xsna.ets0.a
        public final void onClose() {
            imv imvVar = ChatFragment.this.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.m();
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public static final class n implements izs {
        public final /* synthetic */ boolean b;

        public n(boolean z) {
            this.b = z;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(this.b);
        }
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public static final class o implements xwb0 {
        public final /* synthetic */ Attach b;

        public o(Attach attach) {
            this.b = attach;
        }

        @Override // xsna.xwb0
        public final void E() {
            d dVar = ChatFragment.w1;
            ChatFragment.this.lo().a(new x080(this.b));
        }

        @Override // xsna.xwb0
        public final void k() {
            d dVar = ChatFragment.w1;
            ChatFragment.this.lo().a(new w080(this.b));
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ChatFragment.class, "argsDialogId", "getArgsDialogId()J", 0);
        fpf0.a.getClass();
        x1 = new qcy[]{mutablePropertyReference1Impl};
        w1 = new d();
        z1 = e9w.a(ChatFragment.class);
    }

    public ChatFragment() {
        zdw zdwVar = i7o0.b;
        zdwVar = zdwVar == null ? null : zdwVar;
        this.P = zdwVar;
        pbw K = ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K();
        this.Q = K;
        int i2 = 16;
        OpenMessagesHistoryReporter i3 = K.n().i(c4g0.s(), new f5(this, i2));
        this.R = i3;
        mdz<OpenMessagesHistoryReporter.Span> a2 = mdz.a.a(OpenMessagesHistoryReporter.Span.ROOT);
        i3.c(a2);
        this.S = a2;
        int i4 = 21;
        s5 s5Var = new s5(this, i4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, s5Var);
        int i5 = 14;
        this.U = msy.a(lazyThreadSafetyMode, new hd(this, i5));
        this.X = FolderType.DEFAULT;
        this.Z = new nf3();
        this.a0 = "unknown";
        this.f0 = SystemClock.uptimeMillis();
        this.m0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.f(this, i2));
        int i6 = 17;
        this.n0 = new bpn0(new l1(this, i6));
        this.o0 = new bpn0(new com.vk.movika.sdk.base.ui.g(this, i4));
        int i7 = 15;
        this.p0 = new bpn0(new m1(this, i7));
        int i8 = 20;
        this.q0 = new bpn0(new jd(this, i8));
        this.r0 = g2v.c();
        this.s0 = zdwVar.f;
        this.t0 = myc0.d();
        this.u0 = xa4.M(this);
        this.x0 = K.d();
        this.y0 = K.c();
        this.z0 = msy.a(lazyThreadSafetyMode, new kd(this, i6));
        this.A0 = msy.a(lazyThreadSafetyMode, new ld(this, i8));
        t6g0 t6g0Var = t6g0.b;
        this.B0 = t6g0.d();
        this.C0 = K.s();
        this.D0 = new io.reactivex.rxjava3.disposables.b();
        this.E0 = new io.reactivex.rxjava3.disposables.b();
        this.f1 = new bpn0(new g5(this, 11));
        this.g1 = new bpn0(new i13(7));
        this.h1 = new bpn0(new j70(this, i5));
        this.i1 = msy.a(lazyThreadSafetyMode, new r(this, i8));
        int i9 = 18;
        this.j1 = msy.a(lazyThreadSafetyMode, new yh(this, i9));
        this.k1 = new bpn0(new ic(this, i6));
        this.l1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 19));
        this.m1 = msy.a(lazyThreadSafetyMode, new h9(this, i7));
        this.n1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 6));
        this.o1 = msy.a(lazyThreadSafetyMode, new qc(this, 10));
        this.p1 = msy.a(lazyThreadSafetyMode, new t5(this, i9));
        this.q1 = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, i2));
        this.r1 = new bpn0(new f1(this, 13));
        this.s1 = true;
        this.u1 = msy.a(lazyThreadSafetyMode, new ng1(this, i5));
        this.v1 = msy.a(lazyThreadSafetyMode, new yc(this, i7));
    }

    public static DialogExt Bo(Bundle bundle) {
        if (n34.i(bundle)) {
            return n34.p(bundle);
        }
        Peer peer = (Peer) bundle.getParcelable("dialog_id");
        return new DialogExt(peer != null ? peer.b : 0L, (ProfilesInfo) null, 2, (zcl) null);
    }

    public static void Ho(boolean z) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("im_pinned_messages");
        b2.a(Boolean.valueOf(z), "is_in_history");
        bVar.k(b2.e());
    }

    public static final void eo(ChatFragment chatFragment, int i2, String str, MsgTextFormat msgTextFormat, String str2, List list, Set set, Integer num, MsgSendSource msgSendSource, ly30 ly30Var) {
        le6 dVar;
        String str3;
        MsgTextFormat msgTextFormat2;
        List list2;
        Set set2;
        Integer num2;
        Peer peer;
        int i3;
        String str4;
        if (drm0.N(str) && list.isEmpty() && set.isEmpty()) {
            return;
        }
        if (i2 <= 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b2 = Peer.a.b(chatFragment.ho());
            String str5 = chatFragment.b0;
            String str6 = str5 == null ? "" : str5;
            String str7 = chatFragment.c0;
            String str8 = str7 == null ? "" : str7;
            String str9 = chatFragment.a0;
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            dVar = new pz30(b2, str, msgTextFormat, msgSendSource, str2, str6, str8, str9, list, set, num, null, ly30Var, 2048);
            list2 = list;
        } else {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Peer b3 = Peer.a.b(chatFragment.ho());
            String str10 = chatFragment.b0;
            String str11 = str10 == null ? "" : str10;
            String str12 = chatFragment.c0;
            if (str12 == null) {
                str3 = "";
                str4 = str;
                msgTextFormat2 = msgTextFormat;
                list2 = list;
                set2 = set;
                num2 = num;
                peer = b3;
                i3 = i2;
            } else {
                str3 = str12;
                msgTextFormat2 = msgTextFormat;
                list2 = list;
                set2 = set;
                num2 = num;
                peer = b3;
                i3 = i2;
                str4 = str;
            }
            dVar = new com.vk.im.engine.commands.messages.d(peer, i3, str4, msgTextFormat2, str11, str3, list2, set2, num2);
        }
        int i4 = 5;
        chatFragment.N.b(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(chatFragment.io().b("User send", dVar).m(io.reactivex.rxjava3.android.schedulers.a.b()), new sh6(new pf(11), i4)), new qqb(0)).subscribe(new sf(new crb(chatFragment, dVar, list2), 14), new pf1(new fm0(chatFragment, 16), i4)));
        chatFragment.x0.b(chatFragment.ho());
    }

    public static final void fo(ChatFragment chatFragment, MsgFromUser msgFromUser) {
        DialogHeaderController dialogHeaderController = chatFragment.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.o();
        com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.N1(msgFromUser);
        imv imvVar = chatFragment.J0;
        (imvVar != null ? imvVar : null).B(msgFromUser);
    }

    public static void go(long j2, Intent intent, Bundle bundle) {
        if (j2 == 0) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Dialog peer id is invalid = 0, intent=" + intent + ", args=" + bundle));
        }
    }

    public final void Ao(MsgIdType msgIdType, int i2) {
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"ChatScrollIssue: openReplyInHistory " + i2 + ' ' + msgIdType});
        }
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.w1(msgIdType, i2);
        com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
        (aVar2 != null ? aVar2 : null).a2(msgIdType, i2, "openReplyInHistory");
        com.vk.metrics.eventtracking.b.a.n("messages_reply_view");
    }

    public final void Co(long j2, String str, boolean z) {
        if (z) {
            return;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        sqm sqmVar = new sqm(Peer.a.b(j2), Source.CACHE, true, (Object) null, 24);
        this.N.b(new io.reactivex.rxjava3.internal.operators.single.r(io().b("DialogsListReporter", new uqm(sqmVar)), new nz(new xqb(j2, this, sqm.a(sqmVar, Source.ACTUAL)), 8)).subscribe(new oz(new oqb(this, j2, SystemClock.uptimeMillis(), str), 7), kwg0.b()));
    }

    @Override // xsna.eam
    public final void Dd(boolean z) {
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar != null) {
            aVar.b2(z);
        }
    }

    public final void Do(DialogExt dialogExt) {
        DialogTheme hc;
        d6p d6pVar;
        this.V = dialogExt;
        Dialog Cb = dialogExt.Cb();
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.u(dialogExt);
        if (mo().D()) {
            b26 b26Var = this.L0;
            if (b26Var == null) {
                b26Var = null;
            }
            b26Var.r(dialogExt);
        }
        if (o25.b(o25.a()) && (d6pVar = this.P0) != null) {
            d6pVar.b(dialogExt);
        }
        DialogHeaderController dialogHeaderController = this.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.l(true ^ (Cb != null && Cb.tc()));
        rtb rtbVar = this.I0;
        if (rtbVar == null) {
            rtbVar = null;
        }
        DisableableRelativeLayout disableableRelativeLayout = this.T0;
        if (disableableRelativeLayout == null) {
            disableableRelativeLayout = null;
        }
        DialogExt dialogExt2 = this.V;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        rtbVar.X0(disableableRelativeLayout, dialogExt2);
        if (Cb != null && (hc = Cb.hc()) != null) {
            com.vk.im.engine.models.dialogs.c cVar = hc.b;
            alm almVar = this.c1;
            if (almVar == null) {
                almVar = null;
            }
            almVar.d(cVar);
        }
        Peer e2 = com.vk.dto.common.b.e(dialogExt.getId());
        if (e2 != null && e2.Ab(Peer.Type.CONTACT)) {
            jo().D(this, new ebj(this, Collections.singleton(e2)));
        }
        po();
        if ((Cb != null ? Cb.Ob() : null) == null) {
            umb umbVar = this.Y;
            (umbVar != null ? umbVar : null).getClass();
        }
        g2v.c().getClass();
        requireContext();
        if (this.s1) {
            this.s1 = false;
            if (Cb != null) {
                this.Q.o().a(Cb);
            }
        }
        if (((Boolean) this.g1.getValue()).booleanValue()) {
            Mo(this.d0, dialogExt);
        }
    }

    public final void Eo() {
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar != null) {
            this.r0.getClass();
            aVar.i2(fnv0.a.i() && this.d0 != 2);
        }
    }

    @Override // xsna.ktb.a
    public final void F9(itb itbVar, jtb jtbVar) {
        com.vk.im.popup.b bVar = this.k0;
        if (bVar == null) {
            bVar = null;
        }
        com.vk.im.popup.a.d(bVar, new nsx(requireContext()), itbVar, jtbVar, null, 8);
    }

    public final void Fo(PopupStickerAnimation popupStickerAnimation, Attach attach) {
        PopupStickerView popupStickerView = new PopupStickerView(requireContext(), null, 0, 14, 0);
        popupStickerView.setLoadingCallback(new o(attach));
        popupStickerView.c(popupStickerAnimation, false, new dy0(6, popupStickerAnimation, this), new bb(this, 14));
        FrameLayout frameLayout = this.W0;
        if (frameLayout == null) {
            frameLayout = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        b26 b26Var = this.L0;
        layoutParams.topMargin = (b26Var != null ? b26Var : null).d();
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(popupStickerView, layoutParams);
        this.e1 = popupStickerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Go(int i2, AttachWithId attachWithId, com.vk.im.engine.models.messages.a aVar) {
        StickerItem i3;
        boolean z = attachWithId instanceof AttachSticker;
        AttachSticker attachSticker = z ? (AttachSticker) attachWithId : null;
        String Ab = (attachSticker == null || (i3 = attachSticker.i()) == null) ? null : i3.Ab();
        boolean f2 = epx.f(ko().a(), aVar.getFrom());
        StickerStockItem I = this.B0.I(i2);
        fnv0 fnv0Var = fnv0.a;
        mxv mxvVar = this.r0;
        if (I != null) {
            mxvVar.getClass();
            boolean z2 = true;
            Object[] objArr = fnv0Var.g(i2) && I.Cb();
            if (I.Jb() && !f2) {
                z2 = false;
            }
            if (objArr != false && z2) {
                imv imvVar = this.J0;
                (imvVar != null ? imvVar : null).x(i2);
                return;
            }
        }
        if (z && Ab != null && (aVar.getFrom() instanceof Peer.User)) {
            mxvVar.getClass();
            fnv0Var.b(kn(), i2, aVar.getFrom().d, Ab);
        } else {
            mxvVar.getClass();
            FragmentActivity kn = kn();
            DialogExt dialogExt = this.V;
            fnv0Var.a(kn, i2, Long.valueOf((dialogExt != null ? dialogExt : null).getId()));
        }
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        return bo8.a(bundle, Collections.singleton("dialog_id"), getArguments()) && bundle.getBoolean("can_reorder", true);
    }

    public final void Io(Dialog dialog, Msg msg, AttachDoc attachDoc) {
        this.N.b(hg1.n(io().b(this, new e24(attachDoc.xb())).m(io.reactivex.rxjava3.android.schedulers.a.b()), kn(), false, null, 62).subscribe(new jz(new vqb(this, dialog, msg, attachDoc, 0), 10), new ir0(new qb(9), 3)));
    }

    public final void Jo(Source source) {
        if (ko().d()) {
            com.vk.im.ui.components.msg_list.a aVar = this.H0;
            if (aVar == null) {
                aVar = null;
            }
            String q1 = aVar.q1();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            io.reactivex.rxjava3.internal.operators.single.o oVar = new io.reactivex.rxjava3.internal.operators.single.o(io().b(this, new uqm(new sqm(Peer.a.b(ho()), source, true, (Object) q1, 16))), new j22(new pd(this, 19), 11));
            asu0 asu0Var = asu0.a;
            b0 m2 = oVar.q(asu0Var.c()).m(asu0Var.d());
            gf0 gf0Var = new gf0(new ns1(this, 18), 8);
            int i2 = kwg0.a;
            k15.c(this.D0, m2.subscribe(gf0Var, new jwg0(q1)));
        }
    }

    public final void Ko() {
        z8m z8mVar = this.S0;
        if (z8mVar == null) {
            z8mVar = null;
        }
        z8mVar.a(false);
        FragmentActivity kn = kn();
        FragmentActivity kn2 = kn();
        HashSet hashSet = iah0.a;
        fnj.c(kn2);
        iah0.s(kn);
        this.r0.getClass();
        DialogHeaderController dialogHeaderController = this.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.j(false);
        DialogHeaderController dialogHeaderController2 = this.K0;
        if (dialogHeaderController2 == null) {
            dialogHeaderController2 = null;
        }
        dialogHeaderController2.k(null);
    }

    @Override // xsna.ktb.a
    public final void Le(Throwable th) {
        z1.a(th);
        zk70.e(th);
    }

    public final void Lo() {
        if (com.vk.dto.common.b.d(ho())) {
            imv imvVar = this.J0;
            (imvVar != null ? imvVar : null).l(ho());
        } else if (com.vk.dto.common.b.a(ho())) {
            imv imvVar2 = this.J0;
            (imvVar2 != null ? imvVar2 : null).w(izi0.d(Long.valueOf(ho())));
        }
        Jo(Source.CACHE);
        Jo(Source.ACTUAL);
    }

    public final void Mo(int i2, DialogExt dialogExt) {
        WritePermission oc;
        Dialog Cb = dialogExt.Cb();
        boolean z = false;
        boolean z2 = i2 != 1;
        boolean z3 = (Cb != null && Cb.t1()) || (Cb != null && Cb.E8());
        if (((Boolean) this.g1.getValue()).booleanValue() && z3) {
            WritePermission.State a2 = (Cb == null || (oc = Cb.oc()) == null) ? null : oc.a();
            boolean z4 = a2 == WritePermission.State.DISABLED_NEED_EDU_ROLE || a2 == WritePermission.State.DISABLED_NEED_MESSAGE_REQUEST || a2 == WritePermission.State.DISABLED_PENDING_MESSAGE_REQUEST;
            if (Cb != null && Cb.Gb() && !z4 && z2) {
                z = true;
            }
        } else {
            z = z2;
        }
        View view = this.X0;
        bwt0.p0(view != null ? view : null, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        ((ham) this.q1.getValue()).c();
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.p();
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        vm30 Y0 = (aVar != null ? aVar : null).Y0();
        if (Y0 != null) {
            Y0.a();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final int Pn() {
        return 17;
    }

    @Override // xsna.vds
    public final int Q0() {
        if (!qo()) {
            return -1;
        }
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        return !fnj.d(kn) ? 1 : -1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.h(MsgSendHidePopupsReason.OTHER);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Sn() {
        Peer no = no();
        no.getClass();
        mzp0 mzp0Var = (mzp0) rzp0.c(no.Ab(Peer.Type.GROUP) ? UiMeasuringScreen.IM_GROUP_CHAT : UiMeasuringScreen.IM_CHAT, null, false, 62).j();
        mzp0Var.init();
        this.R.d(mzp0Var);
        this.J = mzp0Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Tn() {
        Peer no = no();
        no.getClass();
        yw90 yw90Var = (yw90) zrd0.a(no.Ab(Peer.Type.GROUP) ? PerformanceScoreProduct.IM_GROUP_CHAT : PerformanceScoreProduct.IM_CHAT).j();
        yw90Var.init();
        this.R.d(yw90Var);
        this.L = yw90Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        ng7 ng7Var;
        if (!qo()) {
            return true;
        }
        wew wewVar = this.R0;
        if ((wewVar != null ? wewVar.a(rect2.top, kn()) : false) && (ng7Var = this.Q0) != null) {
            ng7Var.b();
        }
        rect2.top = 0;
        rect2.bottom = 0;
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ets0 ets0Var;
        z8m z8mVar = this.S0;
        if (z8mVar == null) {
            z8mVar = null;
        }
        if (!z8mVar.a(true)) {
            DialogHeaderController dialogHeaderController = this.K0;
            if (dialogHeaderController == null) {
                dialogHeaderController = null;
            }
            if (!dialogHeaderController.g()) {
                imv imvVar = this.J0;
                if (!(imvVar != null ? imvVar : null).a0() && (((ets0Var = this.d1) == null || !ets0Var.a0()) && !uo())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // xsna.ktb.a
    public final void b5(esb esbVar) {
        ChatInvitationException a2 = esbVar.a();
        if (a2 != null) {
            String d2 = a2.d();
            if (d2 == null || drm0.N(d2)) {
                zk70.e(a2);
                return;
            }
            asb.a aVar = new asb.a(requireContext());
            aVar.T0(a2.g());
            aVar.S0(a2.d());
            aVar.H0(kn().getSupportFragmentManager(), "CurrentBottomSheet");
        }
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
        rsr rsrVar = oz50.k;
        Bundle b2 = oz50.b.b(intent);
        if (b2 == null) {
            return;
        }
        long ho = ho();
        String str = this.a0;
        boolean containsKey = b2.containsKey("dialog_ext_state_key");
        this.a0 = b2.getString("entry_point", "unknown");
        Peer peer = (Peer) b2.getParcelable("dialog_id");
        long j2 = peer != null ? peer.b : 0L;
        go(j2, intent, b2);
        qcy<Object> qcyVar = x1[0];
        this.Z.c = Long.valueOf(j2);
        this.j0 = bo8.d(b2, "first_unread_msg_cmid");
        this.W = b2.containsKey("msgListOpenModeEncoded") ? MsgListOpenMode.a.a(b2.getLong("msgListOpenModeEncoded", 0L)) : MsgListOpenAtUnreadMode.b;
        this.b0 = b2.getString("ref", "");
        this.c0 = b2.getString("ref_source", "");
        this.V = Bo(b2);
        Co(ho(), this.a0, containsKey);
        this.Q.a().b(ho(), this.a0);
        g2v.c().getClass();
        requireContext();
        MsgListOpenMode msgListOpenMode = this.W;
        if (msgListOpenMode == null) {
            msgListOpenMode = null;
        }
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.h1(this.j0, this.a0);
        com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.X1(ho(), msgListOpenMode);
        if (msgListOpenMode instanceof MsgListOpenAtMsgMode) {
            com.vk.im.ui.components.msg_list.a aVar3 = this.H0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) msgListOpenMode;
            aVar3.w1(msgListOpenAtMsgMode.Ab(), msgListOpenAtMsgMode.zb());
        }
        DialogHeaderController dialogHeaderController = this.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.i(ho());
        b26 b26Var = this.L0;
        if (b26Var == null) {
            b26Var = null;
        }
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        b26Var.k(dialogExt);
        rtb rtbVar = this.I0;
        if (rtbVar == null) {
            rtbVar = null;
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        DialogExt dialogExt2 = this.V;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        rtbVar.X0(viewGroup, dialogExt2);
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.n(b2, ho());
        imv imvVar2 = this.J0;
        if (imvVar2 == null) {
            imvVar2 = null;
        }
        DialogExt dialogExt3 = this.V;
        if (dialogExt3 == null) {
            dialogExt3 = null;
        }
        imvVar2.u(dialogExt3);
        imv imvVar3 = this.J0;
        (imvVar3 != null ? imvVar3 : null).a0();
        to();
        Lo();
        lo().a(new q380(ho, str));
        lo().a(new s380(ho(), this.a0));
        this.s1 = true;
    }

    public final long ho() {
        return ((Number) this.Z.getValue(this, x1[0])).longValue();
    }

    public final lzv io() {
        return (lzv) this.p0.getValue();
    }

    @Override // xsna.ktb.a
    public final void jd(bb bbVar) {
        com.vk.im.popup.b bVar = this.k0;
        if (bVar == null) {
            bVar = null;
        }
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        bVar.b(new em0(com.vk.toggle.b.A.a(imFeatures)), bbVar);
    }

    public final a1w jo() {
        return (a1w) this.n0.getValue();
    }

    public final f1w ko() {
        return (f1w) this.o0.getValue();
    }

    public final s3w lo() {
        return (s3w) this.q0.getValue();
    }

    @Override // xsna.ktb.a
    public final void m4() {
        com.vk.im.popup.b bVar = this.k0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.dismiss();
    }

    public final com.vk.im.engine.models.c mo() {
        l7m d2 = m7m.d(this);
        return ((ImExperimentsScopedComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), no(), d2).a(fpf0.a(ImExperimentsScopedComponent.class))).getExperiments();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Peer no() {
        return (Peer) this.m0.getValue();
    }

    @Override // xsna.au90
    public final Bundle ok(long j2, long j3) {
        User user;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b2 = Peer.a.b(j2);
        Peer b3 = Peer.a.b(j3);
        b2.getClass();
        if (!b2.Ab(Peer.Type.CONTACT)) {
            throw new IllegalStateException("old peer must be a CONTACT");
        }
        b3.getClass();
        if (!b3.Ab(Peer.Type.USER)) {
            throw new IllegalStateException("new peer must be a USER");
        }
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        qtd0 Cb = dialogExt.Eb().Cb(Long.valueOf(j2));
        if (Cb != null) {
            long j4 = b3.b;
            long j5 = b2.b;
            String str = null;
            UserSex userSex = null;
            ImageList imageList = null;
            boolean z = false;
            boolean z2 = false;
            UserDeactivationStatus userDeactivationStatus = null;
            boolean z3 = false;
            boolean z4 = false;
            user = new User(j4, Long.valueOf(j5), Cb.name(), Boolean.valueOf(Cb.k5()), str, userSex, imageList, z, z2, userDeactivationStatus, z3, z4, new VisibleStatus(0L, true, 0, null, 13, null), null, null, null, null, null, null, null, null, false, false, false, 0, Cb.c5(), false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, false, -33558544, 4095, null);
        } else {
            user = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("entry_point", this.a0);
        bundle.putString("ref", this.b0);
        bundle.putString("ref_source", this.c0);
        bundle.putParcelable("dialog_id", Peer.a.b(j3));
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        bundle.putString("text", imvVar.getText());
        bundle.putBoolean("withoutAnimation", true);
        if (user != null) {
            DialogExt dialogExt2 = this.V;
            DialogExt zb = DialogExt.zb(dialogExt2 != null ? dialogExt2 : null);
            Dialog Cb2 = zb.Cb();
            if (Cb2 != null) {
                Cb2.setId(b3.b);
            }
            Dialog Cb3 = zb.Cb();
            if (Cb3 != null) {
                Cb3.ld(MsgRequestStatus.ACCEPTED);
            }
            zb.Eb().Jb(user);
            n34.w(bundle, zb, null);
        }
        return bundle;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1) {
            ktb ktbVar = this.b1;
            (ktbVar != null ? ktbVar : null).b(intent);
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        DialogHeaderController dialogHeaderController = this.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.h(configuration);
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        (aVar != null ? aVar : null).K0(configuration);
        Ko();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        OpenMessagesHistoryReporter openMessagesHistoryReporter = this.R;
        bu00.m(openMessagesHistoryReporter, bundle);
        ?? r10 = this.T;
        openMessagesHistoryReporter.c((mdz) r10.getValue());
        Bundle requireArguments = requireArguments();
        String string3 = requireArguments.getString("entry_point", "unknown");
        openMessagesHistoryReporter.g(string3);
        this.a0 = string3;
        String string4 = requireArguments.getString("performance_track_id");
        if (string4 != null) {
            openMessagesHistoryReporter.m(string4);
        }
        ((pnp0) this.i1.getValue()).a(jo(), getParentFragmentManager());
        super.onCreate(bundle);
        this.y0.c();
        String string5 = requireArguments.getString("ref", "");
        String string6 = requireArguments.getString("ref_source", "");
        boolean containsKey = requireArguments.containsKey("dialog_ext_state_key");
        Peer peer = (Peer) requireArguments.getParcelable("dialog_id");
        long j2 = peer != null ? peer.b : 0L;
        go(j2, null, requireArguments);
        qcy<Object> qcyVar = x1[0];
        this.Z.c = Long.valueOf(j2);
        this.j0 = bo8.d(requireArguments, "first_unread_msg_cmid");
        this.W = requireArguments.containsKey("msgListOpenModeEncoded") ? MsgListOpenMode.a.a(requireArguments.getLong("msgListOpenModeEncoded", 0L)) : MsgListOpenAtUnreadMode.b;
        if (bundle != null && (string2 = bundle.getString("ref", string5)) != null) {
            string5 = string2;
        }
        this.b0 = string5;
        ChatAnalyticsParams chatAnalyticsParams = (ChatAnalyticsParams) requireArguments.getParcelable("analytics_params");
        this.h0 = chatAnalyticsParams != null ? chatAnalyticsParams.d() : null;
        if (bundle != null && (string = bundle.getString("ref_source", string6)) != null) {
            string6 = string;
        }
        this.c0 = string6;
        this.d0 = requireArguments.getInt("from_preview", 0);
        this.e0 = requireArguments.getBoolean("disable_initial_shimmer", false);
        int i2 = this.d0;
        this.z = i2 == 0;
        this.y = i2 == 0;
        FolderType folderType = (FolderType) requireArguments.getParcelable("from_folder_with_type");
        if (folderType != null) {
            this.X = folderType;
        }
        this.V = Bo(requireArguments);
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder("ChatScrollIssue: ChatCreate ");
            sb.append(bundle == null);
            L.u(l2, logType, new Object[]{sb.toString()});
        }
        a1w jo = jo();
        zdw zdwVar = this.P;
        cew cewVar = zdwVar.u;
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        alm a2 = c.a.a(this.s0, jo, cewVar, dialogExt);
        a2.c(getLifecycle());
        this.c1 = a2;
        boolean z = this.d0 != 1;
        boolean z2 = z && !ko().c().f().contains(Long.valueOf(ho()));
        int ceil = (int) Math.ceil((iah0.u() * 1.5f) / e3m.a(R.dimen.msg_bubble_min_height, requireContext()));
        if (ceil == 0) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("MsgListComponentConfig with msgInitLimit = 0!"));
        }
        long ho = ho();
        a1w jo2 = jo();
        com.vk.im.engine.models.c mo = mo();
        f1w ko = ko();
        lzv io2 = io();
        ?? r1 = this.z0;
        js4 js4Var = (js4) r1.getValue();
        DialogExt dialogExt2 = this.V;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        Dialog Cb = dialogExt2.Cb();
        boolean z3 = requireArguments().getBoolean("highlight");
        String str = this.a0;
        kkm oo = oo();
        w530 w530Var = (w530) this.u1.getValue();
        pbw pbwVar = this.Q;
        i2n0 p = pbwVar.t().p();
        boolean z4 = this.e0;
        int i3 = this.d0;
        Integer num = this.j0;
        int i4 = 13;
        bof bofVar = new bof(new hg(this, i4), new com.vk.movika.sdk.base.logic.processor.actions.f(this, i4));
        no noVar = new no(this, 16);
        jmd jmdVar = (jmd) this.l1.getValue();
        v1o v1oVar = (v1o) this.p1.getValue();
        l7m d2 = m7m.d(this);
        com.vk.im.ui.components.msg_list.a k2 = sv1.k(new il30(ho, this.u0, jo2, mo, ko, io2, this.r0, this.P, js4Var, this.A0, Cb, ceil, z3, z, z2, z, str, oo, w530Var, this.R, this.S, p, z4, i3, num, bofVar, noVar, jmdVar, v1oVar, new ql30(((ChatWriteRestrictionFeatureComponent) xq.f((ImFeatureScopeProviderComponent) d2.a(fpf0.a(ImFeatureScopeProviderComponent.class)), no(), d2).a(fpf0.a(ChatWriteRestrictionFeatureComponent.class))).G8(), ((MessageViewsFeatureComponent) m7m.d(this).mo408a(fpf0.a(MessageViewsFeatureComponent.class))).y4())));
        k2.c2(new j());
        k2.f2(requireArguments().getBoolean("is_pop_up", false));
        this.H0 = k2;
        Eo();
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        long ho2 = ho();
        MsgListOpenMode msgListOpenMode = this.W;
        if (msgListOpenMode == null) {
            msgListOpenMode = null;
        }
        aVar.X1(ho2, msgListOpenMode);
        int i5 = 13;
        ktb ktbVar = new ktb(requireContext(), jo(), this.r0, o25.a(), new y6(this, 12), xa4.M(this), 1, this);
        this.N.b(ktbVar.e());
        this.b1 = ktbVar;
        Context requireContext = requireContext();
        getChildFragmentManager();
        DialogExt dialogExt3 = this.V;
        this.Y = new umb(requireContext, dialogExt3 == null ? null : dialogExt3, mo(), this.r0.j(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a());
        g2v.c().getClass();
        ets0 i6 = n0v0.a.i(oo());
        ((oew) i6).d(new m());
        this.d1 = i6;
        ((js4) r1.getValue()).c();
        Context requireContext2 = requireContext();
        pqb pqbVar = new pqb(this);
        a1w jo3 = jo();
        FragmentActivity activity = getActivity();
        this.Z0 = new pjm(requireContext2, this, pqbVar, jo3, activity != null ? activity.getWindow() : null, new com.vk.movika.sdk.base.logic.interactor.h(this, 16), new wm1(this, i5));
        lo().a(new s380(ho(), this.a0));
        Co(ho(), this.a0, containsKey);
        pbwVar.a().b(ho(), this.a0);
        mh80 mh80Var = zdwVar.e.d;
        long ho3 = ho();
        mh80Var.getClass();
        if (ho3 == -22822305) {
            el3 el3Var = Event.b;
            Event.a b2 = h5s.b("vkm_onboarding_vk_chat_open");
            b2.j(thp0.c);
            b2.h();
            com.vk.metrics.eventtracking.b.a.k(b2.e());
        }
        k53.a(requireArguments.getString("app_entry_point"));
        this.s1 = true;
        io.reactivex.rxjava3.disposables.b bVar = this.E0;
        bVar.e();
        com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        String q1 = aVar2.q1();
        x b3 = io().b(this, new klm(Source.CACHE, false));
        asu0 asu0Var = asu0.a;
        b0 m2 = b3.q(asu0Var.c()).m(asu0Var.d());
        da daVar = new da(new r6(this, 17), 9);
        int i7 = kwg0.a;
        k15.c(bVar, m2.subscribe(daVar, new jwg0(q1)));
        alm almVar = this.c1;
        k15.c(bVar, (almVar == null ? null : almVar).b().a0(asu0Var.c()).subscribe(new ea(new t6(this, 18), 14)));
        so("onCreate");
        openMessagesHistoryReporter.f((mdz) r10.getValue(), null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ng7 ng7Var;
        this.R.c((mdz) this.U.getValue());
        this.g0 = true;
        boolean z = this.d0 != 1;
        DisableableRelativeLayout disableableRelativeLayout = (DisableableRelativeLayout) layoutInflater.inflate(qo() ? R.layout.vkim_chat_fragment : R.layout.vkim_chat_fragment_old, viewGroup, false);
        this.T0 = disableableRelativeLayout;
        if (disableableRelativeLayout == null) {
            disableableRelativeLayout = null;
        }
        disableableRelativeLayout.setTouchEnabled(z);
        so("inflate");
        ham hamVar = (ham) this.q1.getValue();
        DisableableRelativeLayout disableableRelativeLayout2 = this.T0;
        if (disableableRelativeLayout2 == null) {
            disableableRelativeLayout2 = null;
        }
        hamVar.d(disableableRelativeLayout2);
        DisableableRelativeLayout disableableRelativeLayout3 = this.T0;
        if (disableableRelativeLayout3 == null) {
            disableableRelativeLayout3 = null;
        }
        DisableableRelativeLayout disableableRelativeLayout4 = this.T0;
        if (disableableRelativeLayout4 == null) {
            disableableRelativeLayout4 = null;
        }
        FrameLayout frameLayout = (FrameLayout) disableableRelativeLayout4.findViewById(R.id.messages_list_container);
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        frameLayout.addView(aVar.C0(requireContext(), frameLayout, bundle));
        this.W0 = frameLayout;
        so("onCreateMsgList");
        a1w jo = jo();
        c cVar = new c();
        mxv mxvVar = this.r0;
        rtb rtbVar = new rtb(jo, mxvVar, cVar);
        this.I0 = rtbVar;
        DisableableRelativeLayout disableableRelativeLayout5 = this.T0;
        if (disableableRelativeLayout5 == null) {
            disableableRelativeLayout5 = null;
        }
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        rtbVar.X0(disableableRelativeLayout5, dialogExt);
        so("onCreateMsgList");
        DisableableRelativeLayout disableableRelativeLayout6 = this.T0;
        DisableableRelativeLayout disableableRelativeLayout7 = disableableRelativeLayout6 == null ? null : disableableRelativeLayout6;
        FragmentActivity kn = kn();
        Window window = kn().getWindow();
        uki0 D = rl3.D(new Integer[]{Integer.valueOf(R.id.divider), Integer.valueOf(R.id.banner_container_bottom), Integer.valueOf(R.id.bottom_panel_container), Integer.valueOf(R.id.messages_list_container)});
        DisableableRelativeLayout disableableRelativeLayout8 = this.T0;
        if (disableableRelativeLayout8 == null) {
            disableableRelativeLayout8 = null;
        }
        hfr t = rli0.t(D, new tw4(disableableRelativeLayout8));
        DisableableRelativeLayout disableableRelativeLayout9 = this.T0;
        if (disableableRelativeLayout9 == null) {
            disableableRelativeLayout9 = null;
        }
        this.t1 = new xey(window, disableableRelativeLayout7, kn, disableableRelativeLayout9.findViewById(R.id.keyboard_background), t);
        mxvVar.getClass();
        a1w jo2 = jo();
        kkm oo = oo();
        long ho = ho();
        j1 j1Var = new j1(this, 18);
        s1 s1Var = new s1(this, 16);
        int i2 = this.d0;
        mxv mxvVar2 = this.r0;
        zdw zdwVar = this.P;
        jbs jbsVar = this.u0;
        kz30 h2 = n0v0.a.h(new xdw.a(jo2, mxvVar2, zdwVar, jbsVar, oo, ho, j1Var, s1Var, this, i2));
        this.J0 = h2;
        k kVar = new k();
        DisableableRelativeLayout disableableRelativeLayout10 = this.T0;
        if (disableableRelativeLayout10 == null) {
            disableableRelativeLayout10 = null;
        }
        h2.P(kVar, disableableRelativeLayout10, getArguments());
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.j(z);
        imv imvVar2 = this.J0;
        if (imvVar2 == null) {
            imvVar2 = null;
        }
        imvVar2.getClass();
        com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        imv imvVar3 = this.J0;
        if (imvVar3 == null) {
            imvVar3 = null;
        }
        imvVar3.getClass();
        aVar2.h2(null);
        so("createMsgSend");
        this.k0 = a.C1129a.a(kn());
        g2v.c().getClass();
        ho();
        a1w jo3 = jo();
        b25 a2 = o25.a();
        long ho2 = ho();
        DisableableRelativeLayout disableableRelativeLayout11 = this.T0;
        this.M0 = new o420(jo3, a2, ho2, disableableRelativeLayout11 == null ? null : disableableRelativeLayout11, new i());
        so("createMentions");
        if (((Boolean) this.r1.getValue()).booleanValue()) {
            Peer e2 = com.vk.dto.common.b.e(ho());
            e2.getClass();
            if (e2.Ab(Peer.Type.USER)) {
                DisableableRelativeLayout disableableRelativeLayout12 = this.T0;
                if (disableableRelativeLayout12 == null) {
                    disableableRelativeLayout12 = null;
                }
                this.N0 = new z6p((ViewStub) disableableRelativeLayout12.findViewById(R.id.edu_schedule_viewstub), ho(), new f());
            }
        }
        if (com.vk.dto.common.b.e(ho()).zb()) {
            if (o25.b(o25.a())) {
                DisableableRelativeLayout disableableRelativeLayout13 = this.T0;
                if (disableableRelativeLayout13 == null) {
                    disableableRelativeLayout13 = null;
                }
                i6p i6pVar = new i6p((ViewStub) disableableRelativeLayout13.findViewById(R.id.max_transition_viewstub), EduMaxTransitionBannerLocalState$EntryPoint.GROUP_CHAT, m7m.d(this), new as(this, 10));
                this.O0 = i6pVar;
                i6pVar.a();
                s3q0 s3q0Var = s3q0.a;
            }
            if (o25.b(o25.a())) {
                DisableableRelativeLayout disableableRelativeLayout14 = this.T0;
                if (disableableRelativeLayout14 == null) {
                    disableableRelativeLayout14 = null;
                }
                this.P0 = new d6p((ViewStub) disableableRelativeLayout14.findViewById(R.id.max_members_banner_stub), jo(), new h7(this, 9));
            }
        }
        DialogExt dialogExt2 = this.V;
        if (dialogExt2 == null) {
            dialogExt2 = null;
        }
        mbm.c.a(dialogExt2.Db());
        DialogExt dialogExt3 = this.V;
        if (dialogExt3 == null) {
            dialogExt3 = null;
        }
        DialogHeaderController dialogHeaderController = new DialogHeaderController(dialogExt3, new g(), requireArguments().getBoolean("is_pop_up", false), this.d0, new DialogHeaderController.a(jo(), this.r0, jbsVar, oo(), (com.vk.im.chat.onlines.api.a) this.n1.getValue(), this.Q.t().v(), ((MaxUtilityComponent) m7m.d(this).mo408a(fpf0.a(MaxUtilityComponent.class))).j7()));
        FragmentActivity kn2 = kn();
        HashSet hashSet = iah0.a;
        dialogHeaderController.n((fnj.d(kn2) || !z || this.d0 == 2) ? false : true);
        so("onCreateHeader");
        DisableableRelativeLayout disableableRelativeLayout15 = this.T0;
        if (disableableRelativeLayout15 == null) {
            disableableRelativeLayout15 = null;
        }
        dialogHeaderController.a(disableableRelativeLayout15);
        so("onCreateHeaderView");
        if (mo().l()) {
            xey xeyVar = this.t1;
            if (xeyVar == null) {
                xeyVar = null;
            }
            xeyVar.D(dialogHeaderController);
        }
        this.K0 = dialogHeaderController;
        DisableableRelativeLayout disableableRelativeLayout16 = this.T0;
        if (disableableRelativeLayout16 == null) {
            disableableRelativeLayout16 = null;
        }
        ViewStub viewStub = (ViewStub) disableableRelativeLayout16.findViewById(R.id.banner_container_stub);
        b26 b26Var = new b26(kn(), jo(), this.r0, this.Q, lyd.g(), oo(), this.d0, new com.vk.im.engine.internal.storage.delegates.messages.b(this, 23));
        b26Var.l(new b());
        DialogExt dialogExt4 = this.V;
        if (dialogExt4 == null) {
            dialogExt4 = null;
        }
        b26Var.k(dialogExt4);
        DisableableRelativeLayout disableableRelativeLayout17 = this.T0;
        if (disableableRelativeLayout17 == null) {
            disableableRelativeLayout17 = null;
        }
        b26Var.a(layoutInflater, disableableRelativeLayout17, viewStub);
        this.L0 = b26Var;
        so("onCreateBanner");
        g2v.c().getClass();
        requireContext();
        DisableableRelativeLayout disableableRelativeLayout18 = this.T0;
        if (disableableRelativeLayout18 == null) {
            disableableRelativeLayout18 = null;
        }
        e eVar = new e(disableableRelativeLayout18, oo());
        eVar.a(false);
        this.S0 = eVar;
        so("onCreateDialogActions");
        Ko();
        so("onCreateView");
        DisableableRelativeLayout disableableRelativeLayout19 = this.T0;
        if (disableableRelativeLayout19 == null) {
            disableableRelativeLayout19 = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) disableableRelativeLayout19.findViewById(R.id.sticker_bar_container);
        this.U0 = viewGroup2;
        this.V0 = new h2l0(viewGroup2, this.r0, jo(), mo(), new l(), this.B0);
        DisableableRelativeLayout disableableRelativeLayout20 = this.T0;
        if (disableableRelativeLayout20 == null) {
            disableableRelativeLayout20 = null;
        }
        this.X0 = disableableRelativeLayout20.findViewById(R.id.write_area);
        DisableableRelativeLayout disableableRelativeLayout21 = this.T0;
        if (disableableRelativeLayout21 == null) {
            disableableRelativeLayout21 = null;
        }
        this.Y0 = disableableRelativeLayout21.findViewById(R.id.banner_container);
        DisableableRelativeLayout disableableRelativeLayout22 = this.T0;
        if (disableableRelativeLayout22 == null) {
            disableableRelativeLayout22 = null;
        }
        this.a1 = new k28(disableableRelativeLayout22, requireContext(), mxvVar.k());
        if (qo()) {
            DisableableRelativeLayout disableableRelativeLayout23 = this.T0;
            if (disableableRelativeLayout23 == null) {
                disableableRelativeLayout23 = null;
            }
            View findViewById = disableableRelativeLayout23.findViewById(R.id.dialog_header_container);
            DisableableRelativeLayout disableableRelativeLayout24 = this.T0;
            if (disableableRelativeLayout24 == null) {
                disableableRelativeLayout24 = null;
            }
            View findViewById2 = disableableRelativeLayout24.findViewById(R.id.bottom_panel_container);
            a aVar3 = new a();
            DisableableRelativeLayout disableableRelativeLayout25 = this.T0;
            if (disableableRelativeLayout25 == null) {
                disableableRelativeLayout25 = null;
            }
            VkBlurView vkBlurView = (VkBlurView) disableableRelativeLayout25.findViewById(R.id.header_blur_background);
            DisableableRelativeLayout disableableRelativeLayout26 = this.T0;
            if (disableableRelativeLayout26 == null) {
                disableableRelativeLayout26 = null;
            }
            VkBlurView vkBlurView2 = (VkBlurView) disableableRelativeLayout26.findViewById(R.id.footer_blur_background);
            DisableableRelativeLayout disableableRelativeLayout27 = this.T0;
            if (disableableRelativeLayout27 == null) {
                disableableRelativeLayout27 = null;
            }
            ng7Var = new ng7(findViewById, findViewById2, aVar3, vkBlurView, vkBlurView2, (VkBlurContentView) disableableRelativeLayout27.findViewById(R.id.blur_content_view));
        } else {
            ng7Var = null;
        }
        this.Q0 = ng7Var;
        if (qo()) {
            DisableableRelativeLayout disableableRelativeLayout28 = this.T0;
            if (disableableRelativeLayout28 == null) {
                disableableRelativeLayout28 = null;
            }
            VkBlurContentView vkBlurContentView = (VkBlurContentView) disableableRelativeLayout28.findViewById(R.id.blur_content_view);
            if (vkBlurContentView != null) {
                b26 b26Var2 = this.L0;
                if (b26Var2 == null) {
                    b26Var2 = null;
                }
                b26Var2.m(vkBlurContentView);
            }
        }
        DisableableRelativeLayout disableableRelativeLayout29 = this.T0;
        if (disableableRelativeLayout29 == null) {
            return null;
        }
        return disableableRelativeLayout29;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((js4) this.z0.getValue()).release();
        if (this.g0) {
            imv imvVar = this.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.a0();
            imv imvVar2 = this.J0;
            if (imvVar2 == null) {
                imvVar2 = null;
            }
            imvVar2.L();
            this.v0 = null;
            this.w0 = null;
            com.vk.im.ui.components.msg_list.a aVar = this.H0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.H0();
            com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.G0();
            DialogHeaderController dialogHeaderController = this.K0;
            if (dialogHeaderController == null) {
                dialogHeaderController = null;
            }
            dialogHeaderController.f();
            DialogHeaderController dialogHeaderController2 = this.K0;
            if (dialogHeaderController2 == null) {
                dialogHeaderController2 = null;
            }
            dialogHeaderController2.b();
            b26 b26Var = this.L0;
            if (b26Var == null) {
                b26Var = null;
            }
            b26Var.c();
            b26 b26Var2 = this.L0;
            if (b26Var2 == null) {
                b26Var2 = null;
            }
            b26Var2.b();
            o420 o420Var = this.M0;
            if (o420Var != null) {
                o420Var.b();
            }
            o420 o420Var2 = this.M0;
            if (o420Var2 != null) {
                o420Var2.a();
            }
            z6p z6pVar = this.N0;
            if (z6pVar != null) {
                z6pVar.G0();
            }
            i6p i6pVar = this.O0;
            if (i6pVar != null) {
                i6pVar.b();
            }
            d6p d6pVar = this.P0;
            if (d6pVar != null) {
                d6pVar.a();
            }
            z8m z8mVar = this.S0;
            if (z8mVar == null) {
                z8mVar = null;
            }
            z8mVar.destroy();
            this.D0.dispose();
            io.reactivex.rxjava3.disposables.c cVar = this.F0;
            if (cVar != null) {
                cVar.dispose();
            }
            this.E0.dispose();
            qew qewVar = jo().r().j;
            oxv oxvVar = m63.d;
            if (oxvVar == null) {
                oxvVar = null;
            }
            v7s0 v7s0Var = (v7s0) oxvVar.invoke();
            VideoCacheIdImpl videoCacheIdImpl = VideoCacheIdImpl.MESSAGES;
            if (v7s0Var.f(videoCacheIdImpl)) {
                oxv oxvVar2 = m63.d;
                ((v7s0) (oxvVar2 != null ? oxvVar2 : null).invoke()).j(videoCacheIdImpl);
            }
            ((qbm) this.o1.getValue()).b(ho());
            lo().a(new q380(ho(), this.a0));
            this.i0 = false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.R0 = null;
        ng7 ng7Var = this.Q0;
        if (ng7Var != null) {
            ng7Var.a();
        }
        this.Q0 = null;
        ikv0 ikv0Var = this.l0;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        com.vk.im.popup.b bVar = this.k0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.dismiss();
        ((ham) this.q1.getValue()).e();
        ImageViewer.c<?> cVar = this.v0;
        if (cVar != null) {
            cVar.a(false);
        }
        h2l0 h2l0Var = this.V0;
        if (h2l0Var == null) {
            h2l0Var = null;
        }
        h2l0Var.H0();
        umb umbVar = this.Y;
        (umbVar != null ? umbVar : null).getClass();
        int i2 = ify.a;
        ify.g(this);
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        vo();
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        imv imvVar = this.J0;
        if (imvVar != null) {
            imvVar.b(bundle);
        }
        String str = this.b0;
        if (str == null) {
            str = "";
        }
        bundle.putString("ref", str);
        String str2 = this.c0;
        bundle.putString("ref_source", str2 != null ? str2 : "");
        bundle.putInt("from_preview", this.d0);
        bu00.o(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (mo().l()) {
            xey xeyVar = this.t1;
            if (xeyVar == null) {
                xeyVar = null;
            }
            xeyVar.H();
        }
        imv imvVar = this.J0;
        (imvVar != null ? imvVar : null).onStart();
        xo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.onStop();
        if (mo().l()) {
            xey xeyVar = this.t1;
            (xeyVar != null ? xeyVar : null).I();
        }
        xo();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        Parcelable parcelable;
        Object parcelable2;
        super.onViewCreated(view, bundle);
        getChildFragmentManager().l0("antispam_modal_request_key", getViewLifecycleOwner(), new r41(this, 12));
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.getClass();
        this.y0.b();
        boolean z = this.d0 != 1;
        View view2 = this.Y0;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.p0(view2, z);
        int i2 = this.d0;
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        Mo(i2, dialogExt);
        ViewGroup viewGroup = this.U0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        bwt0.p0(viewGroup, z);
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b2(((ham) this.q1.getValue()).b());
        if (bundle == null && (arguments = getArguments()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("snackbar_on_start", SnackbarParams.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("snackbar_on_start");
                if (!(parcelable3 instanceof SnackbarParams)) {
                    parcelable3 = null;
                }
                parcelable = (SnackbarParams) parcelable3;
            }
            SnackbarParams snackbarParams = (SnackbarParams) parcelable;
            if (snackbarParams != null) {
                ikv0.a aVar2 = new ikv0.a(kn());
                aVar2.i(new ikv0.d(requireContext().getString(snackbarParams.g()), (String) null, (ikv0.d.a) null, 6));
                Long d2 = snackbarParams.d();
                if (d2 != null) {
                    aVar2.k(d2.longValue());
                }
                if (snackbarParams.e() != null) {
                    aVar2.h(new ikv0.c.C3058c(snackbarParams.e().intValue(), snackbarParams.f(), (Size) null, 12));
                }
                this.l0 = aVar2.n();
            }
        }
        int i3 = ify.a;
        ify.a(this);
        alm almVar = this.c1;
        if (almVar == null) {
            almVar = null;
        }
        almVar.e();
        so("onViewCreated");
        this.R.f((mdz) this.U.getValue(), null);
        com.vk.im.ui.components.msg_list.a aVar3 = this.H0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        MsgListOpenMode msgListOpenMode = this.W;
        if (msgListOpenMode == null) {
            msgListOpenMode = null;
        }
        aVar3.Q1(msgListOpenMode);
        ((qbm) this.o1.getValue()).a(ho());
        if (qo()) {
            DisableableRelativeLayout disableableRelativeLayout = this.T0;
            if (disableableRelativeLayout == null) {
                disableableRelativeLayout = null;
            }
            View findViewById = disableableRelativeLayout.findViewById(R.id.dialog_header_container);
            DisableableRelativeLayout disableableRelativeLayout2 = this.T0;
            if (disableableRelativeLayout2 == null) {
                disableableRelativeLayout2 = null;
            }
            View findViewById2 = disableableRelativeLayout2.findViewById(R.id.bottom_panel_container);
            DisableableRelativeLayout disableableRelativeLayout3 = this.T0;
            this.R0 = new wew(findViewById, findViewById2, (disableableRelativeLayout3 != null ? disableableRelativeLayout3 : null).findViewById(R.id.footer_blur_background));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            imv imvVar = this.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.g(bundle);
            String string = bundle.getString("ref", "");
            if (string == null) {
                string = this.b0;
            }
            this.b0 = string;
            String string2 = bundle.getString("ref_source", "");
            if (string2 == null) {
                string2 = this.c0;
            }
            this.c0 = string2;
            this.d0 = bundle.getInt("from_preview", 0);
            this.e0 = bundle.getBoolean("disable_initial_shimmer", false);
        }
    }

    public final kkm oo() {
        alm almVar = this.c1;
        if (almVar == null) {
            almVar = null;
        }
        return almVar.a();
    }

    public final void po() {
        h2l0 h2l0Var;
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        Dialog Cb = dialogExt.Cb();
        if (Cb == null || (h2l0Var = this.V0) == null) {
            return;
        }
        h2l0Var.X0(Cb);
    }

    public final boolean qo() {
        return ((Boolean) this.f1.getValue()).booleanValue();
    }

    public final boolean ro() {
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        ChatSettings Bb = dialogExt.Bb();
        boolean z = false;
        if (Bb != null && !Bb.Bb()) {
            z = true;
        }
        return !z;
    }

    public final void so(String str) {
        StringBuilder b2 = ho8.b(str, ": ");
        b2.append(SystemClock.uptimeMillis() - this.f0);
        L.G("ChatFragment", b2.toString());
    }

    public final void to() {
        this.D0.dispose();
        this.D0 = new io.reactivex.rxjava3.disposables.b();
        k15.c(this.D0, jo().l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hyp(ho(), this)));
        this.P.u.getClass();
        k15.c(this.D0, cew.f.a0(asu0.a.d()).subscribe(new iu1(new a8(this, 19), 5)));
    }

    public final boolean uo() {
        mxv mxvVar = this.r0;
        if (!mxvVar.b().V(kn(), this.a0)) {
            return false;
        }
        Peer no = no();
        no.getClass();
        if (no.Ab(Peer.Type.GROUP)) {
            mxvVar.b().G(kn(), no());
        } else {
            mxvVar.b().i(kn());
        }
        finish();
        return true;
    }

    @Override // xsna.au90
    public final boolean v8(long j2) {
        Peer peer;
        Bundle arguments = getArguments();
        return (arguments == null || (peer = (Peer) arguments.getParcelable("dialog_id")) == null || peer.b != j2) ? false : true;
    }

    public final void vo() {
        wew wewVar;
        if (y1 == ho()) {
            y1 = 0L;
        }
        if (mo().l()) {
            xey xeyVar = this.t1;
            if (xeyVar == null) {
                xeyVar = null;
            }
            xeyVar.E();
        }
        this.D0.dispose();
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.onPause();
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.W0();
        o420 o420Var = this.M0;
        if (o420Var != null) {
            o420Var.d();
        }
        DialogHeaderController dialogHeaderController = this.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.s();
        b26 b26Var = this.L0;
        if (b26Var == null) {
            b26Var = null;
        }
        b26Var.q();
        pjm pjmVar = this.Z0;
        (pjmVar != null ? pjmVar : null).g();
        ets0 ets0Var = this.d1;
        if (ets0Var != null) {
            ets0Var.onPause();
        }
        if (qo() && (wewVar = this.R0) != null) {
            wewVar.b(kn());
        }
        this.R.b();
    }

    public final void wo() {
        wew wewVar;
        y1 = ho();
        pjm pjmVar = this.Z0;
        if (pjmVar == null) {
            pjmVar = null;
        }
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        pjmVar.f(aVar);
        Eo();
        com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.P.u.getClass();
        aVar2.d2(cew.d());
        z8m z8mVar = this.S0;
        if (z8mVar == null) {
            z8mVar = null;
        }
        if (!z8mVar.isVisible()) {
            com.vk.im.ui.components.msg_list.a aVar3 = this.H0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.V0();
        }
        imv imvVar = this.J0;
        if (imvVar == null) {
            imvVar = null;
        }
        imvVar.onResume();
        o420 o420Var = this.M0;
        if (o420Var != null) {
            o420Var.c();
        }
        DialogHeaderController dialogHeaderController = this.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        dialogHeaderController.q();
        b26 b26Var = this.L0;
        if (b26Var == null) {
            b26Var = null;
        }
        b26Var.p();
        if (mo().l()) {
            xey xeyVar = this.t1;
            if (xeyVar == null) {
                xeyVar = null;
            }
            xeyVar.F();
        }
        asu0.a.getClass();
        asu0.s().execute(new sc2(this, 3));
        to();
        Lo();
        b26 b26Var2 = this.L0;
        (b26Var2 != null ? b26Var2 : null).f();
        if (qo() && (wewVar = this.R0) != null) {
            wewVar.c(kn());
        }
        so("OnResume");
        this.R.n(OpenMessagesHistoryReporter.MeasuringPoint.RESUMED);
    }

    @Override // xsna.ify.a
    public final void x0(int i2) {
        com.vk.im.ui.components.msg_list.a aVar = this.H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.H1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1 != false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xo() {
        Lazy lazy;
        ir4 ir4Var;
        ?? r0 = this.A0;
        if (r0.isInitialized()) {
            boolean m2 = ((ir4) r0.getValue()).m();
            lazy = r0;
        }
        lazy = null;
        if (lazy != null && (ir4Var = (ir4) lazy.getValue()) != null) {
            ir4Var.E(jw5.e);
        }
        b26 b26Var = this.L0;
        if (b26Var == null) {
            b26Var = null;
        }
        b26Var.j();
        b26 b26Var2 = this.L0;
        (b26Var2 != null ? b26Var2 : null).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(UiTrackingScreen uiTrackingScreen) {
        long j2;
        SchemeStat$EventItem.Type type;
        Dialog Cb;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("dialog_id", Peer.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("dialog_id");
                if (!(parcelable3 instanceof Peer)) {
                    parcelable3 = null;
                }
                parcelable = (Peer) parcelable3;
            }
            Peer peer = (Peer) parcelable;
            if (peer != null) {
                j2 = peer.b;
                if (j2 != 0) {
                    return;
                }
                if (com.vk.dto.common.b.d(j2)) {
                    type = SchemeStat$EventItem.Type.USER;
                } else if (com.vk.dto.common.b.c(j2)) {
                    type = SchemeStat$EventItem.Type.GROUP;
                } else if (com.vk.dto.common.b.b(j2)) {
                    type = SchemeStat$EventItem.Type.CONTACT;
                } else {
                    DialogExt dialogExt = this.V;
                    if (dialogExt != null && (Cb = dialogExt.Cb()) != null && Cb.tc()) {
                        type = SchemeStat$EventItem.Type.CHANNEL;
                    } else {
                        if (!com.vk.dto.common.b.a(j2)) {
                            L.G(k0.a(j2, "Unknown chat type: can't track "));
                            return;
                        }
                        type = SchemeStat$EventItem.Type.GROUP_CHAT;
                    }
                }
                SchemeStat$EventItem.Type type2 = type;
                Long valueOf = Long.valueOf(j2);
                Bundle arguments2 = getArguments();
                uiTrackingScreen.f = new SchemeStat$EventItem(type2, valueOf, null, arguments2 != null ? arguments2.getString("key_url") : null, null, null, 52, null);
                if (this.X == FolderType.BUSINESS) {
                    uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_BUSINESS_CHATS;
                    return;
                }
                Peer no = no();
                no.getClass();
                if (no.Ab(Peer.Type.GROUP)) {
                    uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_GROUP_CHAT;
                    return;
                }
                return;
            }
        }
        j2 = 0;
        if (j2 != 0) {
        }
    }

    public final void yo(Attach attach, com.vk.im.engine.models.messages.a aVar) {
        com.vk.im.ui.components.msg_list.a aVar2 = this.H0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        View m1 = aVar2.m1(attach.xb());
        com.vk.im.ui.components.msg_list.a aVar3 = this.H0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        qtd0 s1 = aVar3.s1(attach.q().b);
        b7u0 k2 = this.r0.k();
        FragmentActivity kn = kn();
        DialogExt dialogExt = this.V;
        iwv.l(k2, kn, attach, aVar, s1, Long.valueOf((dialogExt != null ? dialogExt : null).getId()), m1, false, 64);
    }

    public final void zo(MsgIdType msgIdType, int i2, Source source, boolean z) {
        lzv io2 = io();
        Set singleton = Collections.singleton(Integer.valueOf(i2));
        DialogExt dialogExt = this.V;
        if (dialogExt == null) {
            dialogExt = null;
        }
        x b2 = io2.b(this, new dj30(msgIdType, singleton, dialogExt.Db(), source, true, null, 32));
        asu0 asu0Var = asu0.a;
        f0 q = b2.q(asu0Var.c());
        x xVar = q;
        if (z) {
            com.vk.im.popup.b bVar = this.k0;
            xVar = com.vk.im.popup.e.b(q, bVar != null ? bVar : null);
        }
        k15.c(this.D0, xVar.m(asu0Var.d()).subscribe(new m20(new sqb(i2, 0, source, this, msgIdType), 11), new bn3(new r7(this, 20), 7)));
    }

    /* compiled from: ChatFragment.kt */
    /* loaded from: classes2.dex */
    public final class h implements ImageViewer.a {
        public final Msg a;
        public int b;

        public h(Msg msg) {
            this.a = msg;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
            ChatFragment chatFragment = ChatFragment.this;
            com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.W0();
            imv imvVar = chatFragment.J0;
            (imvVar != null ? imvVar : null).onPause();
            chatFragment.G0 = this.a;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            this.b = i;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            ChatFragment chatFragment = ChatFragment.this;
            chatFragment.G0 = null;
            chatFragment.v0 = null;
            if (chatFragment.isResumed()) {
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.V0();
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                int i = this.b;
                fv9 fv9Var = aVar2.S;
                fv9Var.getClass();
                bpn0 bpn0Var = i0q0.a;
                HashMap<Msg, Integer> hashMap = fv9Var.a;
                Integer valueOf = Integer.valueOf(i);
                Msg msg = this.a;
                hashMap.put(msg, valueOf);
                Iterator it = fv9Var.b.iterator();
                while (it.hasNext()) {
                    ((ev9.a) it.next()).a2(msg, i);
                }
                imv imvVar = chatFragment.J0;
                (imvVar != null ? imvVar : null).onResume();
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
            imv imvVar = ChatFragment.this.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.h(MsgSendHidePopupsReason.OTHER);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
