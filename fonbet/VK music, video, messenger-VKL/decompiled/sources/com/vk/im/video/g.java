package com.vk.im.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.ProgressView;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Price;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.design.view.message_snippet.MessageProductSnippet;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsInitDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import com.vk.im.chat.clips.decoration.api.models.ImClipsDecorationKey;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import one.video.transform.TransformController;
import xsna.a2f;
import xsna.a390;
import xsna.as30;
import xsna.atm;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c530;
import xsna.c5g;
import xsna.cfl;
import xsna.coo;
import xsna.cxu0;
import xsna.d2;
import xsna.d27;
import xsna.dgm;
import xsna.dnt0;
import xsna.dzv;
import xsna.e2s;
import xsna.e3m;
import xsna.e43;
import xsna.e530;
import xsna.ek30;
import xsna.ekh;
import xsna.enj;
import xsna.epx;
import xsna.f14;
import xsna.f8e;
import xsna.fgm;
import xsna.fh5;
import xsna.foi;
import xsna.fxc0;
import xsna.g34;
import xsna.g6b;
import xsna.g7s0;
import xsna.gpt0;
import xsna.gtx0;
import xsna.gzs;
import xsna.h4w;
import xsna.hdu0;
import xsna.hr30;
import xsna.hzm0;
import xsna.i1t0;
import xsna.i21;
import xsna.iah0;
import xsna.ig;
import xsna.io2;
import xsna.isk;
import xsna.iw00;
import xsna.j5g;
import xsna.jjc;
import xsna.jr30;
import xsna.jsk;
import xsna.kq01;
import xsna.kr5;
import xsna.l1t0;
import xsna.lk;
import xsna.m33;
import xsna.maj;
import xsna.msy;
import xsna.mt00;
import xsna.ne3;
import xsna.ng3;
import xsna.nm0;
import xsna.op5;
import xsna.oq;
import xsna.p4w;
import xsna.pbw;
import xsna.q4w;
import xsna.qbm;
import xsna.qp4;
import xsna.qtd0;
import xsna.r3e0;
import xsna.r4w;
import xsna.r820;
import xsna.s0w0;
import xsna.s3q0;
import xsna.s4w;
import xsna.sbg;
import xsna.sim;
import xsna.t4w;
import xsna.tbh;
import xsna.tlo0;
import xsna.u3u;
import xsna.va20;
import xsna.w530;
import xsna.wfk0;
import xsna.wp10;
import xsna.xa20;
import xsna.xfz;
import xsna.xsd;
import xsna.y1f;
import xsna.ya;
import xsna.yg1;
import xsna.yg5;
import xsna.z00;
import xsna.z1f;
import xsna.z1q;
import xsna.zof;
import xsna.zwv;

/* compiled from: ImInlineVideoPlayerVC.kt */
/* loaded from: classes2.dex */
public final class g implements h4w, hzm0.a {
    public ViewGroup A;
    public VideoTextureView B;
    public VKEnhancedImageView C;
    public View D;
    public TextView E;
    public r3e0 F;
    public TimeAndStatusView G;
    public VideoErrorView H;
    public View I;
    public View J;
    public View K;
    public View L;
    public View M;
    public DurationView N;
    public ActionLinkView O;
    public SpectatorsCounterView P;
    public VideoOverlayView Q;
    public VKImageView R;
    public ImageView S;
    public TextView T;
    public ClipUserView U;
    public View V;
    public VkButton W;
    public FrameLayout X;
    public MessageProductSnippet Y;
    public ek30 Z;
    public io.reactivex.rxjava3.disposables.c a0;
    public final zwv b;
    public g34 b0;
    public final zof c;
    public hzm0 c0;
    public final boolean d;
    public int d0;
    public final a2f e;
    public int e0;
    public final iw00 f;
    public final Object f0;
    public final pbw g;
    public final Object g0;
    public final qbm h;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public int l;
    public final r4w l0;
    public int m;
    public int n;
    public qtd0 o;
    public AttachWithVideo q;
    public Msg r;
    public as30.a s;
    public t4w t;
    public io2 u;
    public fh5 w;
    public y1f x;
    public Context y;
    public ConstraintLayout z;
    public final bpn0 i = new bpn0(new d2(18));
    public final l1t0 j = fxc0.B().Q();
    public final DisplayNameFormatter k = new DisplayNameFormatter(null, 3, null);
    public gzs<? extends qtd0> p = s4w.b;
    public Object v = EmptyList.b;

    /* compiled from: ImInlineVideoPlayerVC.kt */
    public static final class a implements ClipUserView.b {
        public final Owner a;
        public final String b;

        public a(Owner owner, String str) {
            this.a = owner;
            this.b = str;
        }

        @Override // com.vk.clips.design.view.component.user.ClipUserView.b
        public final hdu0 d() {
            return null;
        }

        @Override // com.vk.clips.design.view.component.user.ClipUserView.b
        public final String e(int i) {
            String str = this.b;
            if (str != null) {
                return str;
            }
            Owner owner = this.a;
            if (owner == null) {
                return null;
            }
            kr5.a aVar = new kr5.a(new op5(owner));
            s3q0 s3q0Var = s3q0.a;
            return aVar.a().b(i);
        }
    }

    static {
        iah0.a(4);
    }

    public g(zwv zwvVar, zof zofVar, boolean z, a2f a2fVar, iw00 iw00Var, pbw pbwVar, qbm qbmVar) {
        this.b = zwvVar;
        this.c = zofVar;
        this.d = z;
        this.e = a2fVar;
        this.f = iw00Var;
        this.g = pbwVar;
        this.h = qbmVar;
        lk lkVar = new lk(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, lkVar);
        this.g0 = msy.a(lazyThreadSafetyMode, new nm0(19));
        this.h0 = msy.a(lazyThreadSafetyMode, new ig(12));
        this.i0 = msy.a(lazyThreadSafetyMode, new i21(13));
        this.j0 = new Object();
        this.k0 = msy.a(lazyThreadSafetyMode, new sim(this, 12));
        this.l0 = new r4w(this);
    }

    @Override // xsna.xfz.a
    public final void b() {
        t4w t4wVar = this.t;
        if (t4wVar == null) {
            t4wVar = null;
        }
        w530 w530Var = t4wVar.D;
        if (w530Var != null) {
            w530Var.e(this.j0);
        }
        g34 g34Var = this.b0;
        if (g34Var != null) {
            g34Var.a(this.n, null);
        }
        this.b0 = null;
        hzm0 hzm0Var = this.c0;
        if (hzm0Var != null) {
            hzm0Var.b(this);
        }
        this.c0 = null;
        fh5 fh5Var = this.w;
        if (fh5Var == null) {
            fh5Var = null;
        }
        fh5Var.S();
        r3e0 r3e0Var = this.F;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        io.reactivex.rxjava3.disposables.c cVar = this.a0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.a0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0290  */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r2v41, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.vk.core.view.fresco.VKEnhancedImageView] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v35, types: [xsna.t4w] */
    /* JADX WARN: Type inference failed for: r4v37, types: [xsna.t4w] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42, types: [com.vk.core.view.fresco.VKEnhancedImageView] */
    /* JADX WARN: Type inference failed for: r4v44, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r5v37, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v40, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44, types: [com.vk.im.engine.models.attaches.AttachWithVideo] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xfz.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(wp10 wp10Var) {
        com.vk.libvideo.autoplay.a aVar;
        ViewOutlineProvider s0w0Var;
        z1f z1fVar;
        AttachWithVideo attachWithVideo;
        AttachWithVideo attachWithVideo2;
        AttachWithVideo attachWithVideo3;
        boolean z;
        AttachWithVideo attachWithVideo4;
        AttachWithVideo attachWithVideo5;
        Context context;
        boolean k;
        View view;
        r3e0 r3e0Var;
        AttachWithVideo attachWithVideo6;
        TimeAndStatusView timeAndStatusView;
        AttachWithVideo attachWithVideo7;
        AttachWithVideo attachWithVideo8;
        AttachVideo attachVideo;
        TextView textView;
        boolean z2;
        VKImageView vKImageView;
        TextView textView2;
        View view2;
        ImageView imageView;
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        VKEnhancedImageView vKEnhancedImageView;
        Context context2;
        VKEnhancedImageView vKEnhancedImageView2;
        ConstraintLayout constraintLayout2;
        Msg msg;
        View view3;
        Context context3;
        EmptyList emptyList;
        Good good;
        VideoFile A;
        t4w t4wVar = (t4w) wp10Var;
        Msg msg2 = t4wVar.j;
        gzs<qtd0> gzsVar = t4wVar.p;
        AttachWithVideo attachWithVideo9 = t4wVar.x;
        this.t = t4wVar;
        g34 g34Var = t4wVar.q;
        this.b0 = g34Var;
        if (g34Var != null) {
            g34Var.a(attachWithVideo9.xb(), this);
        }
        hzm0 hzm0Var = t4wVar.r;
        this.c0 = hzm0Var;
        if (hzm0Var != null) {
            hzm0Var.c(this);
        }
        Context context4 = this.y;
        if (context4 == null) {
            context4 = null;
        }
        this.d0 = Math.max(t4wVar.m0(context4), t4wVar.g(context4));
        Context context5 = this.y;
        if (context5 == null) {
            context5 = null;
        }
        this.e0 = t4wVar.Y(context5);
        this.q = attachWithVideo9;
        this.o = t4wVar.o;
        this.p = gzsVar;
        this.r = msg2;
        this.n = (attachWithVideo9 == null ? null : attachWithVideo9).xb();
        this.u = t4wVar.A;
        Context context6 = this.y;
        if (context6 == null) {
            context6 = null;
        }
        f14 e = t4wVar.e(context6);
        int i = e.a;
        if (t4wVar.f) {
            VKEnhancedImageView vKEnhancedImageView3 = this.C;
            if (vKEnhancedImageView3 == null) {
                vKEnhancedImageView3 = null;
            }
            vKEnhancedImageView3.setMaximumWidth(Integer.MAX_VALUE);
        } else {
            VKEnhancedImageView vKEnhancedImageView4 = this.C;
            VKEnhancedImageView vKEnhancedImageView5 = vKEnhancedImageView4 == null ? null : vKEnhancedImageView4;
            if (vKEnhancedImageView4 == null) {
                vKEnhancedImageView4 = null;
            }
            vKEnhancedImageView5.setMaximumWidth(e3m.a(R.dimen.msg_bubble_max_width, vKEnhancedImageView4.getContext()));
        }
        boolean z3 = t4wVar.h;
        Peer peer = t4wVar.B;
        AttachWithVideo attachWithVideo10 = this.q;
        if (attachWithVideo10 == null) {
            attachWithVideo10 = null;
        }
        VideoFile A2 = attachWithVideo10.A();
        boolean z4 = A2 instanceof ClipVideoFile;
        fh5 fh5Var = this.w;
        if (fh5Var == null) {
            fh5Var = null;
        }
        AttachWithVideo attachWithVideo11 = this.q;
        if (attachWithVideo11 == null) {
            attachWithVideo11 = null;
        }
        this.b.getClass();
        yg5 a2 = zwv.a(attachWithVideo11);
        if (z4) {
            aVar = new com.vk.libvideo.autoplay.a(false, RepeatMode.OFF, null, false, false, false, null, null, null, null, null, null, false, null, 523709);
        } else {
            RepeatMode repeatMode = RepeatMode.BY_VIDEO_PARAMS;
            Msg msg3 = this.r;
            if (msg3 == null) {
                msg3 = null;
            }
            aVar = new com.vk.libvideo.autoplay.a(false, repeatMode, null, false, msg3.z, false, null, null, null, null, null, null, false, null, 523517);
        }
        fh5Var.k(A2, a2, aVar);
        fh5 fh5Var2 = this.w;
        if (fh5Var2 == null) {
            fh5Var2 = null;
        }
        yg5 yg5Var = fh5Var2.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        yg5Var.D();
        VideoOverlayView videoOverlayView = this.Q;
        if (videoOverlayView == null) {
            videoOverlayView = null;
        }
        videoOverlayView.setCornerRadius(this.d0);
        ConstraintLayout constraintLayout3 = this.z;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        constraintLayout3.setClipToOutline(true);
        ConstraintLayout constraintLayout4 = this.z;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        if (z3) {
            s0w0Var = new s0w0(Math.max(i, r8), e.b > 0, i > 0);
        } else {
            s0w0Var = this.l0;
        }
        constraintLayout4.setOutlineProvider(s0w0Var);
        TextView textView3 = this.E;
        if (textView3 == null) {
            textView3 = null;
        }
        bwt0.p0(textView3, false);
        View view4 = this.L;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.p0(view4, !gpt0.w(A2));
        y1f y1fVar = this.x;
        if (y1fVar == null) {
            y1fVar = null;
        }
        Msg msg4 = this.r;
        if (msg4 == null) {
            msg4 = null;
        }
        if (msg4 instanceof MsgFromChannel) {
            z1fVar = null;
        } else {
            int l = l();
            Msg msg5 = this.r;
            int i2 = (msg5 == null ? null : msg5).d;
            if (msg5 == null) {
                msg5 = null;
            }
            ImChatPaginationKey imChatPaginationKey = new ImChatPaginationKey(i2, msg5.c, l);
            ImClipsDecorationKey imClipsDecorationKey = new ImClipsDecorationKey(peer);
            Msg msg6 = this.r;
            int i3 = (msg6 == null ? null : msg6).d;
            Msg msg7 = msg6 == null ? null : msg6;
            MsgFromUser msgFromUser = msg7 instanceof MsgFromUser ? (MsgFromUser) msg7 : null;
            Integer num = msgFromUser != null ? msgFromUser.R : null;
            if (msg6 == null) {
                msg6 = null;
            }
            z1fVar = new z1f(imClipsDecorationKey, new ImChatClipsInitDecorPayload(i3, l, num, msg6.c, false, 16, null), imChatPaginationKey, imChatPaginationKey, "clips_messenger_similar", new sbg(this, 25));
        }
        y1fVar.b(z1fVar);
        ConstraintLayout constraintLayout5 = this.z;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        ViewStub viewStub = (ViewStub) constraintLayout5.findViewById(R.id.marked_as_played);
        t4w t4wVar2 = this.t;
        if ((t4wVar2 == null ? null : t4wVar2).z) {
            if ((t4wVar2 == null ? null : t4wVar2).C) {
                if (t4wVar2 == null) {
                    t4wVar2 = null;
                }
                if (t4wVar2.s) {
                    AttachWithVideo attachWithVideo12 = this.q;
                    if (attachWithVideo12 == null) {
                        attachWithVideo12 = null;
                    }
                    if (attachWithVideo12.A() instanceof ClipVideoFile) {
                        if (viewStub != null && !bwt0.J(viewStub)) {
                            viewStub.inflate();
                            ConstraintLayout constraintLayout6 = this.z;
                            if (constraintLayout6 == null) {
                                constraintLayout6 = null;
                            }
                            View findViewById = constraintLayout6.findViewById(R.id.vkim_open_clips_recom_button);
                            if (findViewById != null) {
                                bwt0.i0(findViewById, new ng3(23, this, peer));
                            }
                            ConstraintLayout constraintLayout7 = this.z;
                            if (constraintLayout7 == null) {
                                constraintLayout7 = null;
                            }
                            View findViewById2 = constraintLayout7.findViewById(R.id.vkim_play_again_button);
                            if (findViewById2 != null) {
                                bwt0.i0(findViewById2, new u3u(this, 4));
                            }
                        }
                        ConstraintLayout constraintLayout8 = this.z;
                        if (constraintLayout8 == null) {
                            constraintLayout8 = null;
                        }
                        View findViewById3 = constraintLayout8.findViewById(R.id.vkim_marked_as_played_root);
                        if (findViewById3 != null) {
                            bwt0.p0(findViewById3, true);
                        }
                        fh5 fh5Var3 = this.w;
                        if (fh5Var3 == null) {
                            fh5Var3 = null;
                        }
                        fh5Var3.q0(false);
                        bpn0 bpn0Var = VideoOverlayView.I;
                        VKEnhancedImageView vKEnhancedImageView6 = this.C;
                        VKEnhancedImageView vKEnhancedImageView7 = vKEnhancedImageView6 != null ? null : vKEnhancedImageView6;
                        VideoOverlayView videoOverlayView2 = this.Q;
                        VideoOverlayView videoOverlayView3 = videoOverlayView2 != null ? null : videoOverlayView2;
                        DurationView durationView = this.N;
                        DurationView durationView2 = durationView != null ? null : durationView;
                        g7s0 B = fxc0.B();
                        attachWithVideo = this.q;
                        if (attachWithVideo == null) {
                            attachWithVideo = null;
                        }
                        boolean c = B.c(attachWithVideo.A());
                        attachWithVideo2 = this.q;
                        if (attachWithVideo2 == null) {
                            attachWithVideo2 = null;
                        }
                        VideoRestriction O = attachWithVideo2.A().O();
                        com.vk.libvideo.design.view.overlay.b a3 = O == null ? ((a390) this.h0.getValue()).a(O) : null;
                        attachWithVideo3 = this.q;
                        if (attachWithVideo3 == null) {
                            attachWithVideo3 = null;
                        }
                        if (!attachWithVideo3.A().d8()) {
                            AttachWithVideo attachWithVideo13 = this.q;
                            if (attachWithVideo13 == null) {
                                attachWithVideo13 = null;
                            }
                            if (!attachWithVideo13.A().z0()) {
                                z = false;
                                VideoPipStateHolder.a.getClass();
                                yg5 c2 = VideoPipStateHolder.c();
                                String a1 = (c2 != null || (A = c2.A()) == null) ? null : A.a1();
                                attachWithVideo4 = this.q;
                                if (attachWithVideo4 == null) {
                                    attachWithVideo4 = null;
                                }
                                VideoOverlayView.b.a(new VideoOverlayView.a(vKEnhancedImageView7, videoOverlayView3, new f(this, t4wVar, e, 0), new ekh(this, 11), durationView2, false, false, c, new fgm(this, 15), new maj(this, 24), a3, z, epx.f(a1, attachWithVideo4.A().a1()), new foi(this, 13), (i1t0) this.i0.getValue(), null, 65760));
                                attachWithVideo5 = this.q;
                                if (attachWithVideo5 == null) {
                                    attachWithVideo5 = null;
                                }
                                VideoFile A3 = attachWithVideo5.A();
                                context = this.y;
                                if (context == null) {
                                    context = null;
                                }
                                boolean C2 = A3.C2();
                                int i4 = R.dimen.msg_content_max_height;
                                int a4 = e3m.a(C2 ? R.dimen.msg_clip_max_height : R.dimen.msg_content_max_height, context);
                                k = k(msg2);
                                l1t0 l1t0Var = this.j;
                                if (k) {
                                    VideoOverlayView videoOverlayView4 = this.Q;
                                    if (videoOverlayView4 == null) {
                                        videoOverlayView4 = null;
                                    }
                                    Context context7 = this.y;
                                    if (context7 == null) {
                                        context7 = null;
                                    }
                                    int a5 = e3m.a(R.dimen.vkim_unified_clip_msg_width, context7);
                                    Context context8 = this.y;
                                    if (context8 == null) {
                                        context8 = null;
                                    }
                                    l1t0Var.b(a5, e3m.a(R.dimen.vkim_unified_clip_msg_height, context8), videoOverlayView4);
                                    VideoOverlayView videoOverlayView5 = this.Q;
                                    if (videoOverlayView5 == null) {
                                        videoOverlayView5 = null;
                                    }
                                    l1t0Var.f(10, 16, videoOverlayView5);
                                } else if (t4wVar.p0()) {
                                    VideoOverlayView videoOverlayView6 = this.Q;
                                    if (videoOverlayView6 == null) {
                                        videoOverlayView6 = null;
                                    }
                                    l1t0Var.b(this.e0, a4, videoOverlayView6);
                                    VideoOverlayView videoOverlayView7 = this.Q;
                                    if (videoOverlayView7 == null) {
                                        videoOverlayView7 = null;
                                    }
                                    l1t0Var.f(this.e0, a4, videoOverlayView7);
                                } else {
                                    int width = (int) (a4 * (A3.getWidth() / A3.getHeight()));
                                    VideoOverlayView videoOverlayView8 = this.Q;
                                    if (videoOverlayView8 == null) {
                                        videoOverlayView8 = null;
                                    }
                                    l1t0Var.b(width, a4, videoOverlayView8);
                                    VideoOverlayView videoOverlayView9 = this.Q;
                                    if (videoOverlayView9 == null) {
                                        videoOverlayView9 = null;
                                    }
                                    l1t0Var.f(A3.getWidth(), A3.getHeight(), videoOverlayView9);
                                }
                                boolean V0 = t4wVar.V0();
                                view = this.D;
                                if (view == null) {
                                    view = null;
                                }
                                bwt0.p0(view, V0);
                                r3e0Var = this.F;
                                if (r3e0Var == null) {
                                    r3e0Var = null;
                                }
                                attachWithVideo6 = this.q;
                                if (attachWithVideo6 == null) {
                                    attachWithVideo6 = null;
                                }
                                r3e0Var.a(attachWithVideo6);
                                StringBuilder sb = hr30.b;
                                jr30 jr30Var = t4wVar.k;
                                timeAndStatusView = this.G;
                                if (timeAndStatusView == null) {
                                    timeAndStatusView = null;
                                }
                                hr30.a.a(timeAndStatusView, jr30Var, true);
                                attachWithVideo7 = this.q;
                                if (attachWithVideo7 == null) {
                                    attachWithVideo7 = null;
                                }
                                if (attachWithVideo7.A().q0()) {
                                    TextView textView4 = this.E;
                                    if (textView4 == null) {
                                        textView4 = null;
                                    }
                                    Context context9 = this.y;
                                    if (context9 == null) {
                                        context9 = null;
                                    }
                                    textView4.setBackground(m33.a(R.drawable.vkim_bg_video_live_label, context9));
                                } else {
                                    TextView textView5 = this.E;
                                    if (textView5 == null) {
                                        textView5 = null;
                                    }
                                    Context context10 = this.y;
                                    if (context10 == null) {
                                        context10 = null;
                                    }
                                    textView5.setBackground(m33.a(R.drawable.vkim_bg_video_mosaic_duration, context10));
                                }
                                attachWithVideo8 = this.q;
                                if (attachWithVideo8 == null) {
                                    attachWithVideo8 = null;
                                }
                                attachVideo = attachWithVideo8 instanceof AttachVideo ? (AttachVideo) attachWithVideo8 : null;
                                if (attachVideo != null) {
                                    if (!TextUtils.isEmpty(attachVideo.getPlatform())) {
                                        TextView textView6 = this.E;
                                        if (textView6 == null) {
                                            textView6 = null;
                                        }
                                        textView6.setText(attachVideo.getPlatform());
                                    } else if (attachVideo.b.z0()) {
                                        TextView textView7 = this.E;
                                        if (textView7 == null) {
                                            textView7 = null;
                                        }
                                        Context context11 = this.y;
                                        if (context11 == null) {
                                            context11 = null;
                                        }
                                        textView7.setText(context11.getString(R.string.video_live_upcoming).toUpperCase(Locale.ROOT));
                                    } else if (attachVideo.b.q0()) {
                                        TextView textView8 = this.E;
                                        if (textView8 == null) {
                                            textView8 = null;
                                        }
                                        Context context12 = this.y;
                                        if (context12 == null) {
                                            context12 = null;
                                        }
                                        textView8.setText(context12.getString(R.string.video_live).toUpperCase(Locale.ROOT));
                                    }
                                }
                                textView = this.E;
                                if (textView == null) {
                                    textView = null;
                                }
                                textView.setContentDescription("");
                                j();
                                VideoFile A4 = attachWithVideo9.A();
                                gzsVar.invoke();
                                z2 = A4 instanceof ClipVideoFile;
                                boolean c3 = fxc0.B().c(A4);
                                this.v = EmptyList.b;
                                vKImageView = this.R;
                                if (vKImageView == null) {
                                    vKImageView = null;
                                }
                                bwt0.p0(vKImageView, false);
                                textView2 = this.T;
                                if (textView2 != null) {
                                    bwt0.p0(textView2, z2 && !c3);
                                }
                                view2 = this.V;
                                if (view2 != null) {
                                    bwt0.p0(view2, z2 && !c3);
                                }
                                imageView = this.S;
                                if (imageView == null) {
                                    imageView = null;
                                }
                                bwt0.p0(imageView, false);
                                frameLayout = this.X;
                                if (frameLayout != null) {
                                    bwt0.p0(frameLayout, false);
                                }
                                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                                constraintLayout = this.z;
                                if (constraintLayout == null) {
                                    constraintLayout = null;
                                }
                                bVar.i(constraintLayout);
                                vKEnhancedImageView = this.C;
                                if (vKEnhancedImageView == null) {
                                    vKEnhancedImageView = null;
                                }
                                int id = vKEnhancedImageView.getId();
                                context2 = this.y;
                                if (context2 == null) {
                                    context2 = null;
                                }
                                Resources resources = context2.getResources();
                                if (z2) {
                                    i4 = R.dimen.msg_clip_max_height;
                                }
                                bVar.u(id).e.b0 = (int) resources.getDimension(i4);
                                vKEnhancedImageView2 = this.C;
                                if (vKEnhancedImageView2 == null) {
                                    vKEnhancedImageView2 = null;
                                }
                                bVar.C(vKEnhancedImageView2.getId(), null);
                                constraintLayout2 = this.z;
                                if (constraintLayout2 == null) {
                                    constraintLayout2 = null;
                                }
                                bVar.b(constraintLayout2);
                                if (z2) {
                                    View view5 = this.L;
                                    if (view5 == null) {
                                        view5 = null;
                                    }
                                    bwt0.p0(view5, false);
                                    AttachWithVideo attachWithVideo14 = this.q;
                                    if (attachWithVideo14 == null) {
                                        attachWithVideo14 = null;
                                    }
                                    ClipVideoFile clipVideoFile = (ClipVideoFile) attachWithVideo14.A();
                                    clipVideoFile.getClass();
                                    VKImageView vKImageView2 = this.R;
                                    if (vKImageView2 == null) {
                                        vKImageView2 = null;
                                    }
                                    bwt0.p0(vKImageView2, false);
                                    ImageView imageView2 = this.S;
                                    if (imageView2 == null) {
                                        imageView2 = null;
                                    }
                                    bwt0.p0(imageView2, false);
                                    int n = n();
                                    DisplayNameFormatter displayNameFormatter = this.k;
                                    if (n > 0) {
                                        ArrayList o = e43.o(new a(clipVideoFile.v0, clipVideoFile.q0));
                                        List<CoOwnerItem> list = clipVideoFile.N1;
                                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new a(((CoOwnerItem) it.next()).d, null));
                                        }
                                        msg = null;
                                        o.addAll(arrayList);
                                        ClipUserView clipUserView = this.U;
                                        if (clipUserView != null) {
                                            clipUserView.setBefore(new ClipUserView.a.b(o, 2));
                                        }
                                        ClipUserView clipUserView2 = this.U;
                                        if (clipUserView2 != null) {
                                            tlo0.h d = oq.d(tlo0.Companion, displayNameFormatter.e(this.o, UserNameCase.NOM));
                                            Context context13 = this.y;
                                            if (context13 == null) {
                                                context13 = null;
                                            }
                                            clipUserView2.setMiddle(new ClipUserView.c(new ClipUserView.c.a.C0574a(new tlo0.h(context13.getResources().getQuantityString(R.plurals.vkim_clip_of_coauthors_shortened, n, Integer.valueOf(n))), d), 14));
                                        }
                                    } else {
                                        msg = null;
                                        ClipUserView clipUserView3 = this.U;
                                        if (clipUserView3 != null) {
                                            clipUserView3.setBefore(new ClipUserView.a.C0573a(new a(clipVideoFile.v0, clipVideoFile.q0)));
                                        }
                                        ClipUserView clipUserView4 = this.U;
                                        if (clipUserView4 != null) {
                                            clipUserView4.setMiddle(new ClipUserView.c(new ClipUserView.c.a.C0574a(oq.d(tlo0.Companion, displayNameFormatter.e(this.o, UserNameCase.NOM)), 2), 14));
                                        }
                                    }
                                    ClipUserView clipUserView5 = this.U;
                                    if (clipUserView5 != null) {
                                        bwt0.i0(clipUserView5, new p4w(n, this, 0));
                                    }
                                    Msg msg8 = this.r;
                                    if (msg8 == null) {
                                        msg8 = msg;
                                    }
                                    if (k(msg8)) {
                                        VKEnhancedImageView vKEnhancedImageView8 = this.C;
                                        ?? r4 = vKEnhancedImageView8;
                                        if (vKEnhancedImageView8 == null) {
                                            r4 = msg;
                                        }
                                        r4.setMaximumWidth(0);
                                        VKEnhancedImageView vKEnhancedImageView9 = this.C;
                                        ?? r42 = vKEnhancedImageView9;
                                        if (vKEnhancedImageView9 == null) {
                                            r42 = msg;
                                        }
                                        ViewGroup.LayoutParams layoutParams = r42.getLayoutParams();
                                        if (layoutParams == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
                                        bVar2.G = "16:10";
                                        bVar2.Q = 0;
                                        Context context14 = this.y;
                                        ?? r5 = context14;
                                        if (context14 == null) {
                                            r5 = msg;
                                        }
                                        ((ViewGroup.MarginLayoutParams) bVar2).height = e3m.a(R.dimen.vkim_unified_clip_msg_height, r5);
                                        Context context15 = this.y;
                                        ?? r52 = context15;
                                        if (context15 == null) {
                                            r52 = msg;
                                        }
                                        ((ViewGroup.MarginLayoutParams) bVar2).width = e3m.a(R.dimen.vkim_unified_clip_msg_width, r52);
                                        r42.setLayoutParams(layoutParams);
                                    } else {
                                        VKEnhancedImageView vKEnhancedImageView10 = this.C;
                                        ?? r43 = vKEnhancedImageView10;
                                        if (vKEnhancedImageView10 == null) {
                                            r43 = msg;
                                        }
                                        Context context16 = this.y;
                                        ?? r2 = context16;
                                        if (context16 == null) {
                                            r2 = msg;
                                        }
                                        r43.setMaximumWidth(e3m.a(R.dimen.msg_bubble_max_width, r2));
                                        VKEnhancedImageView vKEnhancedImageView11 = this.C;
                                        ?? r44 = vKEnhancedImageView11;
                                        if (vKEnhancedImageView11 == null) {
                                            r44 = msg;
                                        }
                                        ViewGroup.LayoutParams layoutParams2 = r44.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        }
                                        layoutParams2.height = -2;
                                        layoutParams2.width = -1;
                                        r44.setLayoutParams(layoutParams2);
                                    }
                                    if (((com.vk.im.engine.models.c) this.i.getValue()).r()) {
                                        ClickableStickers clickableStickers = clipVideoFile.C1;
                                        if (clickableStickers != null) {
                                            ArrayList K3 = clickableStickers.K3();
                                            HashSet hashSet = new HashSet();
                                            ?? arrayList2 = new ArrayList();
                                            Iterator it2 = K3.iterator();
                                            while (it2.hasNext()) {
                                                Object next = it2.next();
                                                if (hashSet.add(((Good) next).Ab())) {
                                                    arrayList2.add(next);
                                                }
                                            }
                                            emptyList = arrayList2;
                                        } else {
                                            emptyList = EmptyList.b;
                                        }
                                    } else {
                                        emptyList = EmptyList.b;
                                    }
                                    this.v = emptyList;
                                    h();
                                    s3q0 s3q0Var = s3q0.a;
                                    if (!this.v.isEmpty()) {
                                        t4w t4wVar3 = this.t;
                                        ?? r45 = t4wVar3;
                                        if (t4wVar3 == null) {
                                            r45 = msg;
                                        }
                                        w530 w530Var = r45.D;
                                        Object obj = this.j0;
                                        if (w530Var != null) {
                                            w530Var.e(obj);
                                        }
                                        t4w t4wVar4 = this.t;
                                        ?? r46 = t4wVar4;
                                        if (t4wVar4 == null) {
                                            r46 = msg;
                                        }
                                        w530 w530Var2 = r46.D;
                                        if (w530Var2 != null) {
                                            w530Var2.c(obj, new g6b(this));
                                        }
                                    }
                                    ?? r22 = this.v;
                                    if (r22.size() == 1 && (good = (Good) j5g.a0(r22)) != null) {
                                        mt00.d(Long.valueOf(good.b), Long.valueOf(good.c.b), null, CommonMarketStat$TypeRefSource.IM_CHAT_CLIP, null, null, null, null, Integer.valueOf(clipVideoFile.c), Long.valueOf(clipVideoFile.b.b), CommonMarketStat$TypeMarketContextContent.Type.CLIP, null, null, null, 29172);
                                    }
                                } else {
                                    msg = null;
                                }
                                view3 = this.I;
                                ?? r47 = view3;
                                if (view3 == null) {
                                    r47 = msg;
                                }
                                context3 = this.y;
                                ?? r1 = context3;
                                if (context3 == null) {
                                    r1 = msg;
                                }
                                AttachWithVideo attachWithVideo15 = this.q;
                                r47.setContentDescription(r1.getString((attachWithVideo15 == null ? msg : attachWithVideo15).A().C2() ? R.string.vkim_play_btn_clip_accessibility : R.string.vkim_play_btn_video_accessibility));
                            }
                        }
                        z = true;
                        VideoPipStateHolder.a.getClass();
                        yg5 c22 = VideoPipStateHolder.c();
                        if (c22 != null) {
                        }
                        attachWithVideo4 = this.q;
                        if (attachWithVideo4 == null) {
                        }
                        VideoOverlayView.b.a(new VideoOverlayView.a(vKEnhancedImageView7, videoOverlayView3, new f(this, t4wVar, e, 0), new ekh(this, 11), durationView2, false, false, c, new fgm(this, 15), new maj(this, 24), a3, z, epx.f(a1, attachWithVideo4.A().a1()), new foi(this, 13), (i1t0) this.i0.getValue(), null, 65760));
                        attachWithVideo5 = this.q;
                        if (attachWithVideo5 == null) {
                        }
                        VideoFile A32 = attachWithVideo5.A();
                        context = this.y;
                        if (context == null) {
                        }
                        boolean C22 = A32.C2();
                        int i42 = R.dimen.msg_content_max_height;
                        int a42 = e3m.a(C22 ? R.dimen.msg_clip_max_height : R.dimen.msg_content_max_height, context);
                        k = k(msg2);
                        l1t0 l1t0Var2 = this.j;
                        if (k) {
                        }
                        boolean V02 = t4wVar.V0();
                        view = this.D;
                        if (view == null) {
                        }
                        bwt0.p0(view, V02);
                        r3e0Var = this.F;
                        if (r3e0Var == null) {
                        }
                        attachWithVideo6 = this.q;
                        if (attachWithVideo6 == null) {
                        }
                        r3e0Var.a(attachWithVideo6);
                        StringBuilder sb2 = hr30.b;
                        jr30 jr30Var2 = t4wVar.k;
                        timeAndStatusView = this.G;
                        if (timeAndStatusView == null) {
                        }
                        hr30.a.a(timeAndStatusView, jr30Var2, true);
                        attachWithVideo7 = this.q;
                        if (attachWithVideo7 == null) {
                        }
                        if (attachWithVideo7.A().q0()) {
                        }
                        attachWithVideo8 = this.q;
                        if (attachWithVideo8 == null) {
                        }
                        if (attachWithVideo8 instanceof AttachVideo) {
                        }
                        if (attachVideo != null) {
                        }
                        textView = this.E;
                        if (textView == null) {
                        }
                        textView.setContentDescription("");
                        j();
                        VideoFile A42 = attachWithVideo9.A();
                        gzsVar.invoke();
                        z2 = A42 instanceof ClipVideoFile;
                        boolean c32 = fxc0.B().c(A42);
                        this.v = EmptyList.b;
                        vKImageView = this.R;
                        if (vKImageView == null) {
                        }
                        bwt0.p0(vKImageView, false);
                        textView2 = this.T;
                        if (textView2 != null) {
                        }
                        view2 = this.V;
                        if (view2 != null) {
                        }
                        imageView = this.S;
                        if (imageView == null) {
                        }
                        bwt0.p0(imageView, false);
                        frameLayout = this.X;
                        if (frameLayout != null) {
                        }
                        androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
                        constraintLayout = this.z;
                        if (constraintLayout == null) {
                        }
                        bVar3.i(constraintLayout);
                        vKEnhancedImageView = this.C;
                        if (vKEnhancedImageView == null) {
                        }
                        int id2 = vKEnhancedImageView.getId();
                        context2 = this.y;
                        if (context2 == null) {
                        }
                        Resources resources2 = context2.getResources();
                        if (z2) {
                        }
                        bVar3.u(id2).e.b0 = (int) resources2.getDimension(i42);
                        vKEnhancedImageView2 = this.C;
                        if (vKEnhancedImageView2 == null) {
                        }
                        bVar3.C(vKEnhancedImageView2.getId(), null);
                        constraintLayout2 = this.z;
                        if (constraintLayout2 == null) {
                        }
                        bVar3.b(constraintLayout2);
                        if (z2) {
                        }
                        view3 = this.I;
                        ?? r472 = view3;
                        if (view3 == null) {
                        }
                        context3 = this.y;
                        ?? r12 = context3;
                        if (context3 == null) {
                        }
                        AttachWithVideo attachWithVideo152 = this.q;
                        r472.setContentDescription(r12.getString((attachWithVideo152 == null ? msg : attachWithVideo152).A().C2() ? R.string.vkim_play_btn_clip_accessibility : R.string.vkim_play_btn_video_accessibility));
                    }
                }
            }
        }
        ConstraintLayout constraintLayout9 = this.z;
        if (constraintLayout9 == null) {
            constraintLayout9 = null;
        }
        View findViewById4 = constraintLayout9.findViewById(R.id.vkim_marked_as_played_root);
        if (findViewById4 != null) {
            bwt0.p0(findViewById4, false);
        }
        fh5 fh5Var4 = this.w;
        if (fh5Var4 == null) {
            fh5Var4 = null;
        }
        fh5Var4.q0(true);
        bpn0 bpn0Var2 = VideoOverlayView.I;
        VKEnhancedImageView vKEnhancedImageView62 = this.C;
        if (vKEnhancedImageView62 != null) {
        }
        VideoOverlayView videoOverlayView22 = this.Q;
        if (videoOverlayView22 != null) {
        }
        DurationView durationView3 = this.N;
        if (durationView3 != null) {
        }
        g7s0 B2 = fxc0.B();
        attachWithVideo = this.q;
        if (attachWithVideo == null) {
        }
        boolean c4 = B2.c(attachWithVideo.A());
        attachWithVideo2 = this.q;
        if (attachWithVideo2 == null) {
        }
        VideoRestriction O2 = attachWithVideo2.A().O();
        if (O2 == null) {
        }
        attachWithVideo3 = this.q;
        if (attachWithVideo3 == null) {
        }
        if (!attachWithVideo3.A().d8()) {
        }
        z = true;
        VideoPipStateHolder.a.getClass();
        yg5 c222 = VideoPipStateHolder.c();
        if (c222 != null) {
        }
        attachWithVideo4 = this.q;
        if (attachWithVideo4 == null) {
        }
        VideoOverlayView.b.a(new VideoOverlayView.a(vKEnhancedImageView7, videoOverlayView3, new f(this, t4wVar, e, 0), new ekh(this, 11), durationView2, false, false, c4, new fgm(this, 15), new maj(this, 24), a3, z, epx.f(a1, attachWithVideo4.A().a1()), new foi(this, 13), (i1t0) this.i0.getValue(), null, 65760));
        attachWithVideo5 = this.q;
        if (attachWithVideo5 == null) {
        }
        VideoFile A322 = attachWithVideo5.A();
        context = this.y;
        if (context == null) {
        }
        boolean C222 = A322.C2();
        int i422 = R.dimen.msg_content_max_height;
        int a422 = e3m.a(C222 ? R.dimen.msg_clip_max_height : R.dimen.msg_content_max_height, context);
        k = k(msg2);
        l1t0 l1t0Var22 = this.j;
        if (k) {
        }
        boolean V022 = t4wVar.V0();
        view = this.D;
        if (view == null) {
        }
        bwt0.p0(view, V022);
        r3e0Var = this.F;
        if (r3e0Var == null) {
        }
        attachWithVideo6 = this.q;
        if (attachWithVideo6 == null) {
        }
        r3e0Var.a(attachWithVideo6);
        StringBuilder sb22 = hr30.b;
        jr30 jr30Var22 = t4wVar.k;
        timeAndStatusView = this.G;
        if (timeAndStatusView == null) {
        }
        hr30.a.a(timeAndStatusView, jr30Var22, true);
        attachWithVideo7 = this.q;
        if (attachWithVideo7 == null) {
        }
        if (attachWithVideo7.A().q0()) {
        }
        attachWithVideo8 = this.q;
        if (attachWithVideo8 == null) {
        }
        if (attachWithVideo8 instanceof AttachVideo) {
        }
        if (attachVideo != null) {
        }
        textView = this.E;
        if (textView == null) {
        }
        textView.setContentDescription("");
        j();
        VideoFile A422 = attachWithVideo9.A();
        gzsVar.invoke();
        z2 = A422 instanceof ClipVideoFile;
        boolean c322 = fxc0.B().c(A422);
        this.v = EmptyList.b;
        vKImageView = this.R;
        if (vKImageView == null) {
        }
        bwt0.p0(vKImageView, false);
        textView2 = this.T;
        if (textView2 != null) {
        }
        view2 = this.V;
        if (view2 != null) {
        }
        imageView = this.S;
        if (imageView == null) {
        }
        bwt0.p0(imageView, false);
        frameLayout = this.X;
        if (frameLayout != null) {
        }
        androidx.constraintlayout.widget.b bVar32 = new androidx.constraintlayout.widget.b();
        constraintLayout = this.z;
        if (constraintLayout == null) {
        }
        bVar32.i(constraintLayout);
        vKEnhancedImageView = this.C;
        if (vKEnhancedImageView == null) {
        }
        int id22 = vKEnhancedImageView.getId();
        context2 = this.y;
        if (context2 == null) {
        }
        Resources resources22 = context2.getResources();
        if (z2) {
        }
        bVar32.u(id22).e.b0 = (int) resources22.getDimension(i422);
        vKEnhancedImageView2 = this.C;
        if (vKEnhancedImageView2 == null) {
        }
        bVar32.C(vKEnhancedImageView2.getId(), null);
        constraintLayout2 = this.z;
        if (constraintLayout2 == null) {
        }
        bVar32.b(constraintLayout2);
        if (z2) {
        }
        view3 = this.I;
        ?? r4722 = view3;
        if (view3 == null) {
        }
        context3 = this.y;
        ?? r122 = context3;
        if (context3 == null) {
        }
        AttachWithVideo attachWithVideo1522 = this.q;
        r4722.setContentDescription(r122.getString((attachWithVideo1522 == null ? msg : attachWithVideo1522).A().C2() ? R.string.vkim_play_btn_clip_accessibility : R.string.vkim_play_btn_video_accessibility));
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.F;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    @Override // xsna.hzm0.a
    public final void d(Peer peer) {
        qtd0 invoke = this.p.invoke();
        if (invoke != null ? invoke.getId().equals(Long.valueOf(peer.d)) : false) {
            j();
        }
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.F;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.F;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.xfz.a
    public final void g(ArrayList arrayList) {
        t4w t4wVar = this.t;
        if (t4wVar == null || !arrayList.contains(Long.valueOf(t4wVar.t.b))) {
            return;
        }
        j();
    }

    @Override // xsna.xfz.a
    public final dnt0 getPresenter() {
        fh5 fh5Var = this.w;
        if (fh5Var == null) {
            return null;
        }
        return fh5Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void h() {
        ModerationRestriction moderationRestriction;
        boolean z;
        Pair pair;
        if (this.v.isEmpty()) {
            FrameLayout frameLayout = this.X;
            if (frameLayout != null) {
                bwt0.p0(frameLayout, false);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.X;
        if (frameLayout2 != null) {
            bwt0.p0(frameLayout2, true);
        }
        Good good = (Good) j5g.a0(this.v);
        if (good == null) {
            return;
        }
        c530 b = e530.b(good, null);
        t4w t4wVar = this.t;
        if (t4wVar == null) {
            t4wVar = null;
        }
        w530 w530Var = t4wVar.D;
        if (w530Var == null || (moderationRestriction = w530Var.a(b)) == null) {
            moderationRestriction = ModerationRestriction.NONE;
        }
        MessageProductSnippet messageProductSnippet = this.Y;
        if (messageProductSnippet != null) {
            Iterable<Good> iterable = (Iterable) this.v;
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            for (Good good2 : iterable) {
                String str = good2.d;
                Price price = good2.h;
                String str2 = price.i;
                arrayList.add(new va20(str, (str2 == null || str2.length() == 0) ? price.e : price.i, good2.V, good2.n));
            }
            boolean h = moderationRestriction.h();
            xa20 xa20Var = new xa20(arrayList, h, new xsd(this, b, moderationRestriction, 1));
            VkImageSimple vkImageSimple = messageProductSnippet.u;
            VkFadeText vkFadeText = messageProductSnippet.w;
            VkFadeText vkFadeText2 = messageProductSnippet.v;
            va20 va20Var = (va20) j5g.a0(arrayList);
            if (va20Var == null) {
                return;
            }
            Image image = va20Var.d;
            if (arrayList.isEmpty()) {
                pair = new Pair("", null);
            } else {
                va20 va20Var2 = (va20) j5g.a0(arrayList);
                if (va20Var2 == null) {
                    pair = new Pair("", null);
                } else {
                    String str3 = va20Var2.a;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((va20) it.next()).c) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    boolean z2 = arrayList.size() == 1;
                    int size = arrayList.size() - 1;
                    pair = (!z2 || h) ? (z2 && h) ? new Pair(messageProductSnippet.getResources().getString(R.string.message_snippet_single_adult), null) : (z || h) ? (!z || h) ? new Pair(messageProductSnippet.getResources().getString(R.string.message_snippet_multiple_adult), null) : new Pair(str3, messageProductSnippet.getResources().getQuantityString(R.plurals.message_snippet_for_services_subtitle, size, Integer.valueOf(size))) : new Pair(str3, messageProductSnippet.getResources().getQuantityString(R.plurals.message_snippet_for_products_subtitle, size, Integer.valueOf(size))) : new Pair(str3, va20Var2.b);
                }
            }
            String str4 = (String) pair.d();
            String str5 = (String) pair.g();
            if (h) {
                vkFadeText2.setVisibility(0);
                vkFadeText2.setText(str4);
                vkFadeText.setVisibility(8);
                vkFadeText.setText((CharSequence) null);
                vkImageSimple.setVisibility(0);
                messageProductSnippet.P4(image, true);
            } else {
                vkFadeText2.setVisibility(0);
                vkFadeText2.setText(str4);
                vkFadeText.setVisibility(0);
                vkFadeText.setText(str5);
                vkImageSimple.setVisibility(8);
                messageProductSnippet.P4(image, false);
            }
            jjc.g(messageProductSnippet, new r820(xa20Var, 1));
        }
    }

    @Override // xsna.xfz.a
    public final View i(MsgBubbleView msgBubbleView, as30.a aVar) {
        f8e H;
        this.s = aVar;
        Context context = msgBubbleView.getContext();
        this.y = context;
        this.l = e3m.d(R.attr.im_msg_part_corner_radius_small, context);
        Context context2 = this.y;
        if (context2 == null) {
            context2 = null;
        }
        this.m = e3m.d(R.attr.im_msg_part_corner_radius_big, context2);
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(R.layout.vkim_msg_part_video_coauthor, msgBubbleView, false);
        this.z = constraintLayout;
        VideoTextureView videoTextureView = (VideoTextureView) constraintLayout.findViewById(R.id.video_display);
        this.B = videoTextureView;
        TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        ConstraintLayout constraintLayout2 = this.z;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.Q = (VideoOverlayView) constraintLayout2.findViewById(R.id.overlay_view);
        ConstraintLayout constraintLayout3 = this.z;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        this.D = constraintLayout3.findViewById(R.id.selection_mask);
        ConstraintLayout constraintLayout4 = this.z;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        this.R = (VKImageView) constraintLayout4.findViewById(R.id.video_single_clip_song_cover);
        ConstraintLayout constraintLayout5 = this.z;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        this.S = (ImageView) constraintLayout5.findViewById(R.id.audio_visualizer);
        ConstraintLayout constraintLayout6 = this.z;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        this.T = (TextView) constraintLayout6.findViewById(R.id.clip_title);
        ConstraintLayout constraintLayout7 = this.z;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        this.U = (ClipUserView) constraintLayout7.findViewById(R.id.clip_user_view);
        ConstraintLayout constraintLayout8 = this.z;
        if (constraintLayout8 == null) {
            constraintLayout8 = null;
        }
        View findViewById = constraintLayout8.findViewById(R.id.clip_header_container);
        this.V = findViewById;
        if (findViewById != null) {
            cxu0 cxu0Var = cxu0.a;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
            cxu0Var.getClass();
            findViewById.setBackground(new GradientDrawable(orientation, new int[]{0, 83886080, 335544320, 1375731712, 1627389952, 1711276032}));
            s3q0 s3q0Var = s3q0.a;
        }
        ConstraintLayout constraintLayout9 = this.z;
        if (constraintLayout9 == null) {
            constraintLayout9 = null;
        }
        this.X = (FrameLayout) constraintLayout9.findViewById(R.id.clip_product_snippet_container);
        ConstraintLayout constraintLayout10 = this.z;
        if (constraintLayout10 == null) {
            constraintLayout10 = null;
        }
        this.Y = (MessageProductSnippet) constraintLayout10.findViewById(R.id.clip_product_snippet);
        ConstraintLayout constraintLayout11 = this.z;
        if (constraintLayout11 == null) {
            constraintLayout11 = null;
        }
        this.W = (VkButton) constraintLayout11.findViewById(R.id.subscribe_button);
        ConstraintLayout constraintLayout12 = this.z;
        if (constraintLayout12 == null) {
            constraintLayout12 = null;
        }
        this.M = constraintLayout12.findViewById(R.id.vkim_corners_hack);
        ConstraintLayout constraintLayout13 = this.z;
        if (constraintLayout13 == null) {
            constraintLayout13 = null;
        }
        this.C = (VKEnhancedImageView) constraintLayout13.findViewById(R.id.image);
        ConstraintLayout constraintLayout14 = this.z;
        if (constraintLayout14 == null) {
            constraintLayout14 = null;
        }
        this.A = (ViewGroup) constraintLayout14.findViewById(R.id.video_inline_live_holder);
        ConstraintLayout constraintLayout15 = this.z;
        if (constraintLayout15 == null) {
            constraintLayout15 = null;
        }
        this.E = (TextView) constraintLayout15.findViewById(R.id.label);
        ConstraintLayout constraintLayout16 = this.z;
        if (constraintLayout16 == null) {
            constraintLayout16 = null;
        }
        this.K = constraintLayout16.findViewById(R.id.sound_control);
        ConstraintLayout constraintLayout17 = this.z;
        if (constraintLayout17 == null) {
            constraintLayout17 = null;
        }
        this.L = constraintLayout17.findViewById(R.id.duration_holder);
        ConstraintLayout constraintLayout18 = this.z;
        if (constraintLayout18 == null) {
            constraintLayout18 = null;
        }
        this.N = (DurationView) constraintLayout18.findViewById(R.id.duration);
        ConstraintLayout constraintLayout19 = this.z;
        if (constraintLayout19 == null) {
            constraintLayout19 = null;
        }
        this.P = (SpectatorsCounterView) constraintLayout19.findViewById(R.id.spectators);
        ConstraintLayout constraintLayout20 = this.z;
        if (constraintLayout20 == null) {
            constraintLayout20 = null;
        }
        this.G = (TimeAndStatusView) constraintLayout20.findViewById(R.id.timeAndStatus);
        ConstraintLayout constraintLayout21 = this.z;
        if (constraintLayout21 == null) {
            constraintLayout21 = null;
        }
        VideoErrorView videoErrorView = (VideoErrorView) constraintLayout21.findViewById(R.id.error_view);
        videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        this.H = videoErrorView;
        ConstraintLayout constraintLayout22 = this.z;
        if (constraintLayout22 == null) {
            constraintLayout22 = null;
        }
        this.J = constraintLayout22.findViewById(R.id.replay);
        ConstraintLayout constraintLayout23 = this.z;
        if (constraintLayout23 == null) {
            constraintLayout23 = null;
        }
        this.I = constraintLayout23.findViewById(R.id.play);
        ConstraintLayout constraintLayout24 = this.z;
        if (constraintLayout24 == null) {
            constraintLayout24 = null;
        }
        this.O = (ActionLinkView) constraintLayout24.findViewById(R.id.video_action_link_view);
        boolean s = BuildInfo.s();
        zof zofVar = this.c;
        y1f a2 = this.e.a(s, (zofVar == null || (H = zofVar.H()) == null) ? false : H.isEnabled());
        this.x = a2;
        kq01 kq01Var = new kq01();
        VideoTextureView videoTextureView2 = this.B;
        VideoTextureView videoTextureView3 = videoTextureView2 == null ? null : videoTextureView2;
        ConstraintLayout constraintLayout25 = this.z;
        ConstraintLayout constraintLayout26 = constraintLayout25 == null ? null : constraintLayout25;
        VKEnhancedImageView vKEnhancedImageView = this.C;
        VKEnhancedImageView vKEnhancedImageView2 = vKEnhancedImageView == null ? null : vKEnhancedImageView;
        View view = this.I;
        View view2 = view == null ? null : view;
        View view3 = this.J;
        View view4 = view3 == null ? null : view3;
        View view5 = this.K;
        if (view5 == null) {
            view5 = null;
        }
        wfk0.a aVar2 = new wfk0.a(view5);
        DurationView durationView = this.N;
        DurationView durationView2 = durationView == null ? null : durationView;
        VideoOverlayView videoOverlayView = this.Q;
        VideoOverlayView videoOverlayView2 = videoOverlayView == null ? null : videoOverlayView;
        VideoErrorView videoErrorView2 = this.H;
        VideoErrorView videoErrorView3 = videoErrorView2 == null ? null : videoErrorView2;
        ViewGroup viewGroup = this.A;
        ViewGroup viewGroup2 = viewGroup == null ? null : viewGroup;
        SpectatorsCounterView spectatorsCounterView = this.P;
        SpectatorsCounterView spectatorsCounterView2 = spectatorsCounterView == null ? null : spectatorsCounterView;
        ActionLinkView actionLinkView = this.O;
        fh5 fh5Var = new fh5(kq01Var, videoTextureView3, constraintLayout26, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vKEnhancedImageView2, view2, null, view4, null, null, aVar2, null, null, durationView2, null, null, videoOverlayView2, videoErrorView3, viewGroup2, spectatorsCounterView2, false, actionLinkView == null ? null : actionLinkView, null, null, null, null, a2, new dzv(new atm(this, 12), new tbh(this, 24), new dgm(this, 14), new cfl(this, 18)), null, null, -33461632, 28);
        fh5Var.w("im");
        this.w = fh5Var;
        ConstraintLayout constraintLayout27 = this.z;
        if (constraintLayout27 == null) {
            constraintLayout27 = null;
        }
        this.F = new r3e0((ProgressView) constraintLayout27.findViewById(R.id.upload), null, new z00(aVar, 6));
        Context context3 = this.y;
        if (context3 == null) {
            context3 = null;
        }
        new coo(context3);
        Context context4 = this.y;
        if (context4 == null) {
            context4 = null;
        }
        this.Z = new ek30(context4, 0);
        int i = VideoRestrictionView.d;
        Context context5 = this.y;
        if (context5 == null) {
            context5 = null;
        }
        VideoRestrictionView.a.a(this.l, context5);
        Context context6 = this.y;
        if (context6 == null) {
            context6 = null;
        }
        VideoRestrictionView.a.a(this.m, context6);
        VideoTextureView videoTextureView4 = this.B;
        if (videoTextureView4 == null) {
            videoTextureView4 = null;
        }
        char c = 1;
        bwt0.h0(new qp4(this, 1), videoTextureView4);
        VideoTextureView videoTextureView5 = this.B;
        if (videoTextureView5 == null) {
            videoTextureView5 = null;
        }
        bwt0.k0(videoTextureView5, new e2s(this, 4));
        VideoOverlayView videoOverlayView3 = this.Q;
        if (videoOverlayView3 == null) {
            videoOverlayView3 = null;
        }
        bwt0.h0(new yg1(this, 3), videoOverlayView3);
        View view6 = this.J;
        if (view6 == null) {
            view6 = null;
        }
        bwt0.h0(new ne3(this, 4), view6);
        View view7 = this.I;
        if (view7 == null) {
            view7 = null;
        }
        bwt0.h0(new isk(this, 3), view7);
        View view8 = this.K;
        if (view8 == null) {
            view8 = null;
        }
        bwt0.h0(new jsk(this, 2), view8);
        ActionLinkView actionLinkView2 = this.O;
        if (actionLinkView2 == null) {
            actionLinkView2 = null;
        }
        bwt0.h0(new d27(this, 4), actionLinkView2);
        VideoErrorView videoErrorView4 = this.H;
        (videoErrorView4 == null ? null : videoErrorView4).a(new VideoErrorView.a(null, new z1q(this, 2), c == true ? 1 : 0, 57));
        ConstraintLayout constraintLayout28 = this.z;
        if (constraintLayout28 == null) {
            constraintLayout28 = null;
        }
        constraintLayout28.setOnLongClickListener(new q4w(this, 0));
        VkButton vkButton = this.W;
        if (vkButton != null) {
            bwt0.i0(vkButton, new ya(18, this, aVar));
            s3q0 s3q0Var2 = s3q0.a;
        }
        ConstraintLayout constraintLayout29 = this.z;
        if (constraintLayout29 == null) {
            return null;
        }
        return constraintLayout29;
    }

    @Override // xsna.h4w
    public final boolean isActive() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void j() {
        boolean z;
        String string;
        Pair<Peer, Boolean> o = o();
        t4w t4wVar = this.t;
        boolean f = t4wVar != null ? epx.f(com.vk.dto.common.a.a(t4wVar.x.q()), t4wVar.B) : false;
        t4w t4wVar2 = this.t;
        if (t4wVar2 != null) {
            Peer peer = t4wVar2.B;
            peer.getClass();
            z = peer.Ab(Peer.Type.GROUP);
        } else {
            z = false;
        }
        if (f || o == null || n() > 0 || z) {
            VkButton vkButton = this.W;
            if (vkButton != null) {
                bwt0.p0(vkButton, false);
                return;
            }
            return;
        }
        VkButton vkButton2 = this.W;
        if (vkButton2 != null) {
            bwt0.p0(vkButton2, true);
        }
        boolean booleanValue = o.j().booleanValue();
        VkButton vkButton3 = this.W;
        ?? r5 = this.k0;
        if (vkButton3 != null) {
            vkButton3.setBackgroundTint(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_secondary_alpha, (Context) r5.getValue())));
        }
        VkButton vkButton4 = this.W;
        if (vkButton4 != null) {
            vkButton4.setTextTint(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_primary, (Context) r5.getValue())));
        }
        VkButton vkButton5 = this.W;
        if (vkButton5 != null) {
            vkButton5.setText(booleanValue ? R.string.vkim_button_following : R.string.vkim_button_follow);
        }
        VkButton vkButton6 = this.W;
        if (vkButton6 != null) {
            if (booleanValue) {
                Context context = this.y;
                if (context == null) {
                    context = null;
                }
                string = context.getString(R.string.vkim_button_following);
            } else {
                Context context2 = this.y;
                if (context2 == null) {
                    context2 = null;
                }
                string = context2.getString(R.string.vkim_button_follow);
            }
            vkButton6.setContentDescription(string);
        }
        t4w t4wVar3 = this.t;
        if (t4wVar3 == null) {
            t4wVar3 = null;
        }
        hzm0 hzm0Var = t4wVar3.r;
        boolean a2 = hzm0Var != null ? hzm0Var.a(o.i()) : false;
        VkButton vkButton7 = this.W;
        if (vkButton7 != null) {
            vkButton7.setEnabled(!a2);
        }
        AttachWithVideo attachWithVideo = this.q;
        (attachWithVideo != null ? attachWithVideo : null).A().k3(booleanValue);
    }

    public final boolean k(Msg msg) {
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser == null) {
            return false;
        }
        return (msgFromUser.Ea() || msgFromUser.Yb()) && !this.d;
    }

    public final int l() {
        int i;
        List<NestedMsg> q7;
        VideoFile videoFile;
        gtx0 gtx0Var = this.r;
        if (gtx0Var == null) {
            gtx0Var = null;
        }
        com.vk.im.engine.models.messages.a aVar = gtx0Var instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
        if (aVar == null || (q7 = aVar.q7()) == null) {
            i = 1;
        } else {
            Iterator<NestedMsg> it = q7.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object a0 = j5g.a0(it.next().j);
                AttachVideo attachVideo = a0 instanceof AttachVideo ? (AttachVideo) a0 : null;
                if (attachVideo != null && (videoFile = attachVideo.b) != null && videoFile.C2()) {
                    int i3 = attachVideo.g;
                    AttachWithVideo attachWithVideo = this.q;
                    if (attachWithVideo == null) {
                        attachWithVideo = null;
                    }
                    if (i3 == attachWithVideo.xb()) {
                        break;
                    }
                }
                i2++;
            }
            i = i2 + 1;
        }
        return Math.max(i, 1);
    }

    public final Activity m() {
        ConstraintLayout constraintLayout = this.z;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        return enj.b(constraintLayout);
    }

    public final int n() {
        List<CoOwnerItem> list;
        t4w t4wVar = this.t;
        int i = 0;
        if (t4wVar != null) {
            VideoFile A = t4wVar.x.A();
            ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
            if (clipVideoFile != null && (list = clipVideoFile.N1) != null) {
                List<CoOwnerItem> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((CoOwnerItem) it.next()).c == CoOwnerItem.StatusDto.APPROVED && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
            }
        }
        return i;
    }

    public final Pair<Peer, Boolean> o() {
        qtd0 invoke = this.p.invoke();
        if (invoke == null) {
            return null;
        }
        if (!invoke.t1()) {
            if (!invoke.Va()) {
                return null;
            }
            return new Pair<>(invoke.B7(), Boolean.valueOf(((Group) invoke).Cb()));
        }
        User user = (User) invoke;
        Peer B7 = invoke.B7();
        int i = user.z;
        boolean z = true;
        if (i != 3 && i != 1) {
            z = false;
        }
        return new Pair<>(B7, Boolean.valueOf(z));
    }

    @Override // xsna.h4w
    public final Collection<Integer> v(String str) {
        return EmptyList.b;
    }

    @Override // xsna.xfz.a
    public final void a(xfz.a.C4001a c4001a) {
    }
}
