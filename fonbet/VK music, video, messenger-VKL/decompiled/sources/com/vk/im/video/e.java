package com.vk.im.video;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.views.StencilLayout;
import com.vk.im.ui.views.msg.MsgTranscriptButton;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.transform.TransformController;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.abi0;
import xsna.an10;
import xsna.as30;
import xsna.asp;
import xsna.bwt0;
import xsna.c98;
import xsna.coo;
import xsna.cxs0;
import xsna.d3m;
import xsna.dhr0;
import xsna.dnt0;
import xsna.e3m;
import xsna.ek30;
import xsna.en9;
import xsna.epx;
import xsna.fh5;
import xsna.fnj;
import xsna.fxc0;
import xsna.g34;
import xsna.gmp;
import xsna.h4w;
import xsna.hnt0;
import xsna.hr30;
import xsna.i35;
import xsna.iah0;
import xsna.je0;
import xsna.jr30;
import xsna.kq01;
import xsna.m4w;
import xsna.n2n0;
import xsna.n4w;
import xsna.o4w;
import xsna.o8h;
import xsna.pbw;
import xsna.r3e0;
import xsna.s2n0;
import xsna.swe0;
import xsna.t3h;
import xsna.vu5;
import xsna.wp10;
import xsna.wz4;
import xsna.x2e;
import xsna.x2s0;
import xsna.xfz;
import xsna.ye0;
import xsna.yg5;
import xsna.zrp;
import xsna.zwv;

/* compiled from: ImInlineVideoMsgPlayerVC.kt */
/* loaded from: classes2.dex */
public final class e implements h4w, abi0.a {
    public DurationView A;
    public ImageView B;
    public View C;
    public MsgTranscriptButton D;
    public g34 E;
    public int F;
    public Boolean I;
    public Boolean J;
    public ValueAnimator K;
    public abi0 M;
    public final s2n0 N;
    public final a O;
    public final zwv b;
    public final boolean c;
    public final pbw d;
    public int e;
    public AttachVideoMsg f;
    public Msg g;
    public as30.a h;
    public o4w i;
    public fh5 j;
    public coo k;
    public StringBuilder l;
    public Context m;
    public ConstraintLayout n;
    public FrescoImageView o;
    public StencilLayout p;
    public VideoTextureView q;
    public View r;
    public r3e0 s;
    public TimeAndStatusView t;
    public VideoErrorView u;
    public View v;
    public ProgressView w;
    public ProgressView x;
    public View y;
    public View z;
    public final C1186e G = new C1186e();
    public c H = c.NOT_ACTIVE;
    public int L = -1;

    /* compiled from: ImInlineVideoMsgPlayerVC.kt */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateTransition(fromSize=");
            sb.append(this.a);
            sb.append(", toSize=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImInlineVideoMsgPlayerVC.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c ACTIVE;
        public static final c NOT_ACTIVE;

        static {
            c cVar = new c(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = cVar;
            c cVar2 = new c("NOT_ACTIVE", 1);
            NOT_ACTIVE = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: ImInlineVideoMsgPlayerVC.kt */
    /* renamed from: com.vk.im.video.e$e, reason: collision with other inner class name */
    public static final class C1186e extends ViewOutlineProvider {
        public C1186e() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), e.this.F);
        }
    }

    public e(zwv zwvVar, boolean z, pbw pbwVar) {
        n2n0 t;
        this.b = zwvVar;
        this.c = z;
        this.d = pbwVar;
        s2n0 o = (pbwVar == null || (t = pbwVar.t()) == null) ? null : t.o();
        this.N = o;
        this.O = new a(pbwVar != null ? pbwVar.l() : null, o);
    }

    public static boolean n(e eVar) {
        o4w o4wVar = eVar.i;
        Object obj = o4wVar != null ? o4wVar.f : null;
        com.vk.im.engine.models.messages.a aVar = obj instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) obj : null;
        if (aVar != null) {
            return aVar.j7();
        }
        return false;
    }

    @Override // xsna.xfz.a
    public final void b() {
        g34 g34Var = this.E;
        if (g34Var != null) {
            g34Var.a(this.e, null);
        }
        this.E = null;
        fh5 fh5Var = this.j;
        if (fh5Var == null) {
            fh5Var = null;
        }
        fh5Var.S();
        fh5 fh5Var2 = this.j;
        if (fh5Var2 == null) {
            fh5Var2 = null;
        }
        yg5 yg5Var = fh5Var2.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        yg5Var.T(this.O);
        r3e0 r3e0Var = this.s;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        StencilLayout stencilLayout = this.p;
        if (stencilLayout == null) {
            stencilLayout = null;
        }
        d3m.b(stencilLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        abi0 abi0Var = this.M;
        if (abi0Var != null) {
            abi0Var.c(this);
        }
        this.M = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xfz.a
    public final void bind(wp10 wp10Var) {
        abi0 abi0Var;
        o4w o4wVar = (o4w) wp10Var;
        AttachVideoMsg attachVideoMsg = o4wVar.s;
        abi0 abi0Var2 = o4wVar.x;
        Msg msg = o4wVar.f;
        this.i = o4wVar;
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        this.F = Math.max(o4wVar.m0(context), o4wVar.g(context));
        g34 g34Var = o4wVar.t;
        this.E = g34Var;
        if (g34Var != null) {
            g34Var.a(attachVideoMsg.i, this);
        }
        int i = this.L;
        Context context2 = this.m;
        if (context2 == null) {
            context2 = null;
        }
        int i2 = context2.getResources().getConfiguration().orientation;
        this.L = i2;
        boolean z = (i == -1 || i == i2) ? false : true;
        AttachVideoMsg attachVideoMsg2 = this.f;
        attachVideoMsg.getClass();
        AttachVideoMsg attachVideoMsg3 = new AttachVideoMsg(attachVideoMsg);
        this.f = attachVideoMsg3;
        this.g = msg;
        this.e = attachVideoMsg3.i;
        if (abi0Var2 != null) {
            abi0Var2.a(this);
            abi0Var = abi0Var2;
        } else {
            abi0Var = null;
        }
        this.M = abi0Var;
        Boolean bool = this.J;
        com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        Boolean valueOf = Boolean.valueOf(aVar != null ? aVar.j7() : false);
        this.J = valueOf;
        if (!epx.f(bool, valueOf) || z) {
            ConstraintLayout constraintLayout = this.n;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            bwt0.m0(-2, -2, constraintLayout);
            StencilLayout stencilLayout = this.p;
            if (stencilLayout == null) {
                stencilLayout = null;
            }
            stencilLayout.setScaleX(1.0f);
            StencilLayout stencilLayout2 = this.p;
            if (stencilLayout2 == null) {
                stencilLayout2 = null;
            }
            stencilLayout2.setScaleY(1.0f);
            if (n(this)) {
                StencilLayout stencilLayout3 = this.p;
                if (stencilLayout3 == null) {
                    stencilLayout3 = null;
                }
                bwt0.m0(-2, -2, stencilLayout3);
            } else {
                Context context3 = this.m;
                if (context3 == null) {
                    context3 = null;
                }
                int a2 = e3m.a(R.dimen.vkim_video_msg_size, context3);
                StencilLayout stencilLayout4 = this.p;
                if (stencilLayout4 == null) {
                    stencilLayout4 = null;
                }
                bwt0.m0(a2, a2, stencilLayout4);
            }
        }
        boolean V0 = o4wVar.V0();
        View view = this.r;
        if (view == null) {
            view = null;
        }
        view.setVisibility(V0 ? 0 : 8);
        if (!epx.f(attachVideoMsg2, this.f)) {
            AttachVideoMsg attachVideoMsg4 = this.f;
            this.b.getClass();
            yg5 a3 = zwv.a(attachVideoMsg4);
            if (a3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            a3.f0(this.O);
            fh5 fh5Var = this.j;
            if (fh5Var == null) {
                fh5Var = null;
            }
            VideoFile A = a3.A();
            RepeatMode repeatMode = RepeatMode.BY_VIDEO_PARAMS;
            Msg msg2 = this.g;
            if (msg2 == null) {
                msg2 = null;
            }
            fh5Var.k(A, a3, new com.vk.libvideo.autoplay.a(false, repeatMode, null, false, msg2.z, false, null, null, null, null, null, null, false, null, 523517));
            fh5 fh5Var2 = this.j;
            if (fh5Var2 == null) {
                fh5Var2 = null;
            }
            AttachVideoMsg attachVideoMsg5 = this.f;
            fh5Var2.q0((attachVideoMsg5 != null ? attachVideoMsg5.j : null) == AttachSyncState.DONE);
            StringBuilder sb = this.l;
            if (sb == null) {
                sb = null;
            }
            sb.setLength(0);
            coo cooVar = this.k;
            if (cooVar == null) {
                cooVar = null;
            }
            AttachVideoMsg attachVideoMsg6 = this.f;
            int duration = attachVideoMsg6 != null ? attachVideoMsg6.b.getDuration() : 0;
            StringBuilder sb2 = this.l;
            if (sb2 == null) {
                sb2 = null;
            }
            cooVar.getClass();
            coo.b(duration, sb2);
            DurationView durationView = this.A;
            if (durationView == null) {
                durationView = null;
            }
            StringBuilder sb3 = this.l;
            if (sb3 == null) {
                sb3 = null;
            }
            durationView.setText(sb3);
            AttachVideoMsg attachVideoMsg7 = this.f;
            if (attachVideoMsg7 != null) {
                FrescoImageView frescoImageView = this.o;
                if (frescoImageView == null) {
                    frescoImageView = null;
                }
                frescoImageView.setLocalImage(attachVideoMsg7.g);
                if (attachVideoMsg7.e.Jb()) {
                    FrescoImageView frescoImageView2 = this.o;
                    if (frescoImageView2 == null) {
                        frescoImageView2 = null;
                    }
                    frescoImageView2.setRemoteImage(attachVideoMsg7.e);
                } else {
                    FrescoImageView frescoImageView3 = this.o;
                    if (frescoImageView3 == null) {
                        frescoImageView3 = null;
                    }
                    frescoImageView3.setRemoteImage(attachVideoMsg7.d);
                }
            }
            r3e0 r3e0Var = this.s;
            if (r3e0Var == null) {
                r3e0Var = null;
            }
            r3e0Var.a(this.f);
        }
        StringBuilder sb4 = hr30.b;
        jr30 jr30Var = o4wVar.h;
        TimeAndStatusView timeAndStatusView = this.t;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setGradientBubble(jr30Var.g);
        hr30.a.b(timeAndStatusView, jr30Var, true);
        p(abi0Var2 != null ? abi0Var2.b() : false, z);
        String str = o4wVar.o;
        if (str != null) {
            StencilLayout.a aVar2 = new StencilLayout.a(o4wVar.n, o4wVar.k, dhr0.M() ? o4wVar.l : o4wVar.m, o4wVar.U0(), StencilLayout.BorderWidth.Chat);
            StencilLayout stencilLayout5 = this.p;
            if (stencilLayout5 == null) {
                stencilLayout5 = null;
            }
            stencilLayout5.setStencil(str);
            StencilLayout stencilLayout6 = this.p;
            if (stencilLayout6 == null) {
                stencilLayout6 = null;
            }
            stencilLayout6.b(aVar2);
        } else {
            StencilLayout stencilLayout7 = this.p;
            if (stencilLayout7 == null) {
                stencilLayout7 = null;
            }
            stencilLayout7.b = null;
            stencilLayout7.requestLayout();
            ConstraintLayout constraintLayout2 = this.n;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            constraintLayout2.setClipToOutline(true);
            ConstraintLayout constraintLayout3 = this.n;
            if (constraintLayout3 == null) {
                constraintLayout3 = null;
            }
            constraintLayout3.setOutlineProvider(this.G);
        }
        AttachVideoMsg attachVideoMsg8 = this.f;
        if (attachVideoMsg8 == null || attachVideoMsg8.m != -1) {
            MsgTranscriptButton msgTranscriptButton = this.D;
            if (msgTranscriptButton == null) {
                msgTranscriptButton = null;
            }
            msgTranscriptButton.setVisibility(0);
            MsgTranscriptButton msgTranscriptButton2 = this.D;
            if (msgTranscriptButton2 == null) {
                msgTranscriptButton2 = null;
            }
            AttachVideoMsg attachVideoMsg9 = this.f;
            msgTranscriptButton2.setProgressLoading(attachVideoMsg9 != null && attachVideoMsg9.m == 1);
            AttachVideoMsg attachVideoMsg10 = this.f;
            if (attachVideoMsg10 == null || !attachVideoMsg10.o) {
                MsgTranscriptButton msgTranscriptButton3 = this.D;
                if (msgTranscriptButton3 == null) {
                    msgTranscriptButton3 = null;
                }
                msgTranscriptButton3.U();
            } else {
                MsgTranscriptButton msgTranscriptButton4 = this.D;
                if (msgTranscriptButton4 == null) {
                    msgTranscriptButton4 = null;
                }
                msgTranscriptButton4.setImageDrawable(msgTranscriptButton4.c);
                msgTranscriptButton4.setContentDescription(msgTranscriptButton4.getContext().getText(R.string.vkim_accessibility_transcript_hide));
            }
        } else {
            MsgTranscriptButton msgTranscriptButton5 = this.D;
            if (msgTranscriptButton5 == null) {
                msgTranscriptButton5 = null;
            }
            msgTranscriptButton5.setVisibility(8);
        }
        if ((this.c && epx.f(this.J, Boolean.TRUE)) || !o4wVar.v) {
            MsgTranscriptButton msgTranscriptButton6 = this.D;
            if (msgTranscriptButton6 == null) {
                msgTranscriptButton6 = null;
            }
            msgTranscriptButton6.setVisibility(8);
        }
        boolean z2 = msg instanceof MsgFromChannel;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = o4wVar.y;
        boolean z3 = (gVar != null ? gVar.l() : null) == AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER;
        if (z2 || z3) {
            MsgTranscriptButton msgTranscriptButton7 = this.D;
            (msgTranscriptButton7 != null ? msgTranscriptButton7 : null).setVisibility(8);
        }
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.s;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    public final void d(b bVar) {
        int i = bVar.b;
        int i2 = bVar.a;
        StencilLayout stencilLayout = this.p;
        if (stencilLayout == null) {
            stencilLayout = null;
        }
        float width = stencilLayout.getWidth();
        StencilLayout stencilLayout2 = this.p;
        if (stencilLayout2 == null) {
            stencilLayout2 = null;
        }
        int g = swe0.g((int) (stencilLayout2.getScaleX() * width), Math.min(i2, i), Math.max(i2, i));
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        StencilLayout stencilLayout3 = this.p;
        if (stencilLayout3 == null) {
            stencilLayout3 = null;
        }
        stencilLayout3.animate().cancel();
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        bwt0.m0(g, g, constraintLayout);
        if (g == i) {
            return;
        }
        long c2 = an10.c((1 - ((g - i2) / (i - i2))) * 250);
        VideoTextureView videoTextureView = this.q;
        if (videoTextureView == null) {
            videoTextureView = null;
        }
        videoTextureView.setClickable(false);
        ValueAnimator ofInt = ValueAnimator.ofInt(g, i);
        ofInt.addUpdateListener(new o8h(this, 2));
        ofInt.addListener(new d());
        ofInt.setDuration(c2);
        ofInt.start();
        this.K = ofInt;
        StencilLayout stencilLayout4 = this.p;
        if (stencilLayout4 == null) {
            stencilLayout4 = null;
        }
        float k = i35.k((i / g) * stencilLayout4.getScaleX(), 6);
        StencilLayout stencilLayout5 = this.p;
        (stencilLayout5 != null ? stencilLayout5 : null).animate().scaleX(k).scaleY(k).setDuration(c2).start();
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.s;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.s;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
        fh5 fh5Var = this.j;
        (fh5Var != null ? fh5Var : null).q0(true);
    }

    @Override // xsna.xfz.a
    public final dnt0 getPresenter() {
        fh5 fh5Var = this.j;
        if (fh5Var == null) {
            return null;
        }
        return fh5Var;
    }

    @Override // xsna.abi0.a
    public final void h(boolean z) {
        p(z, false);
    }

    @Override // xsna.xfz.a
    public final View i(MsgBubbleView msgBubbleView, as30.a aVar) {
        this.h = aVar;
        this.m = msgBubbleView.getContext();
        int i = 0;
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(R.layout.vkim_msg_part_video_msg, msgBubbleView, false);
        this.n = constraintLayout;
        this.o = (FrescoImageView) constraintLayout.findViewById(R.id.preview);
        ConstraintLayout constraintLayout2 = this.n;
        String str = null;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.p = (StencilLayout) constraintLayout2.findViewById(R.id.video_display_container);
        ConstraintLayout constraintLayout3 = this.n;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        VideoTextureView videoTextureView = (VideoTextureView) constraintLayout3.findViewById(R.id.video_display);
        this.q = videoTextureView;
        TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        ConstraintLayout constraintLayout4 = this.n;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        this.r = constraintLayout4.findViewById(R.id.selection_mask);
        ConstraintLayout constraintLayout5 = this.n;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        this.B = (ImageView) constraintLayout5.findViewById(R.id.audio_visualizer);
        ConstraintLayout constraintLayout6 = this.n;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        this.y = constraintLayout6.findViewById(R.id.sound_control);
        ConstraintLayout constraintLayout7 = this.n;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        this.z = constraintLayout7.findViewById(R.id.duration_holder);
        ConstraintLayout constraintLayout8 = this.n;
        if (constraintLayout8 == null) {
            constraintLayout8 = null;
        }
        this.A = (DurationView) constraintLayout8.findViewById(R.id.duration);
        ConstraintLayout constraintLayout9 = this.n;
        if (constraintLayout9 == null) {
            constraintLayout9 = null;
        }
        this.t = (TimeAndStatusView) constraintLayout9.findViewById(R.id.timeAndStatus);
        ConstraintLayout constraintLayout10 = this.n;
        if (constraintLayout10 == null) {
            constraintLayout10 = null;
        }
        VideoErrorView videoErrorView = (VideoErrorView) constraintLayout10.findViewById(R.id.error_view);
        videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        this.u = videoErrorView;
        ConstraintLayout constraintLayout11 = this.n;
        if (constraintLayout11 == null) {
            constraintLayout11 = null;
        }
        this.v = constraintLayout11.findViewById(R.id.play);
        ConstraintLayout constraintLayout12 = this.n;
        if (constraintLayout12 == null) {
            constraintLayout12 = null;
        }
        this.C = constraintLayout12.findViewById(R.id.was_not_played);
        ConstraintLayout constraintLayout13 = this.n;
        if (constraintLayout13 == null) {
            constraintLayout13 = null;
        }
        this.D = (MsgTranscriptButton) constraintLayout13.findViewById(R.id.btn_transcription);
        ConstraintLayout constraintLayout14 = this.n;
        if (constraintLayout14 == null) {
            constraintLayout14 = null;
        }
        this.w = (ProgressView) constraintLayout14.findViewById(R.id.upload);
        ProgressView progressView = this.w;
        if (progressView == null) {
            progressView = null;
        }
        this.s = new r3e0(progressView, null, new gmp(aVar, 4));
        ConstraintLayout constraintLayout15 = this.n;
        if (constraintLayout15 == null) {
            constraintLayout15 = null;
        }
        ProgressView progressView2 = (ProgressView) constraintLayout15.findViewById(R.id.buffering);
        this.x = progressView2;
        progressView2.setCancelIconVisible(false);
        DurationView durationView = this.A;
        if (durationView == null) {
            durationView = null;
        }
        boolean z = true;
        durationView.setSimpleView(true);
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        this.k = new coo(context);
        this.l = new StringBuilder();
        Context context2 = this.m;
        if (context2 == null) {
            context2 = null;
        }
        new ek30(context2, 0);
        Context context3 = this.m;
        if (context3 == null) {
            context3 = null;
        }
        wz4 wz4Var = new wz4(context3);
        wz4Var.b.setColor(-1);
        wz4Var.l.set(new Rect(0, 0, iah0.a(6), iah0.a(8)));
        ImageView imageView = this.B;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(wz4Var);
        ImageView imageView2 = this.B;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setSelected(true);
        kq01 kq01Var = new kq01();
        VideoTextureView videoTextureView2 = this.q;
        VideoTextureView videoTextureView3 = videoTextureView2 == null ? null : videoTextureView2;
        ConstraintLayout constraintLayout16 = this.n;
        ConstraintLayout constraintLayout17 = constraintLayout16 == null ? null : constraintLayout16;
        FrescoImageView frescoImageView = this.o;
        FrescoImageView frescoImageView2 = frescoImageView == null ? null : frescoImageView;
        DurationView durationView2 = this.A;
        DurationView durationView3 = durationView2 == null ? null : durationView2;
        VideoErrorView videoErrorView2 = this.u;
        VideoErrorView videoErrorView3 = videoErrorView2 == null ? null : videoErrorView2;
        View view = this.v;
        View view2 = view == null ? null : view;
        ProgressView progressView3 = this.x;
        fh5 fh5Var = new fh5(kq01Var, videoTextureView3, constraintLayout17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frescoImageView2, view2, progressView3 == null ? null : progressView3, null, null, null, null, null, null, durationView3, null, null, null, videoErrorView3, null, null, false, null, null, null, null, null, null, null, null, null, -281575672, 31);
        fh5Var.w("im");
        this.j = fh5Var;
        fh5Var.y0 = new t3h(this, 27);
        VideoTextureView videoTextureView4 = this.q;
        if (videoTextureView4 == null) {
            videoTextureView4 = null;
        }
        bwt0.h0(new com.vk.im.video.d(this, i), videoTextureView4);
        VideoTextureView videoTextureView5 = this.q;
        if (videoTextureView5 == null) {
            videoTextureView5 = null;
        }
        bwt0.k0(videoTextureView5, new x2e(this, 22));
        View view3 = this.y;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.h0(new m4w(this, i), view3);
        View view4 = this.y;
        if (view4 == null) {
            view4 = null;
        }
        view4.setClickable(false);
        VideoErrorView videoErrorView4 = this.u;
        if (videoErrorView4 == null) {
            videoErrorView4 = null;
        }
        videoErrorView4.a(new VideoErrorView.a(str, new c98(this, 4), z, 57));
        ConstraintLayout constraintLayout18 = this.n;
        if (constraintLayout18 == null) {
            constraintLayout18 = null;
        }
        constraintLayout18.setOnLongClickListener(new n4w(this, 0));
        MsgTranscriptButton msgTranscriptButton = this.D;
        if (msgTranscriptButton == null) {
            msgTranscriptButton = null;
        }
        msgTranscriptButton.setOnClickListener(new en9(this, 7));
        ConstraintLayout constraintLayout19 = this.n;
        if (constraintLayout19 == null) {
            return null;
        }
        return constraintLayout19;
    }

    @Override // xsna.h4w
    public final boolean isActive() {
        return this.H == c.ACTIVE;
    }

    public final void j() {
        VideoFile videoFile;
        this.H = c.ACTIVE;
        View view = this.y;
        if (view == null) {
            view = null;
        }
        view.setClickable(true);
        View view2 = this.y;
        if (view2 == null) {
            view2 = null;
        }
        AttachVideoMsg attachVideoMsg = this.f;
        view2.setVisibility((attachVideoMsg == null || (videoFile = attachVideoMsg.b) == null) ? false : videoFile.k0() ? 0 : 8);
        fh5 fh5Var = this.j;
        fh5 fh5Var2 = fh5Var == null ? null : fh5Var;
        if (fh5Var == null) {
            fh5Var = null;
        }
        com.vk.libvideo.autoplay.a a2 = com.vk.libvideo.autoplay.a.a(fh5Var.r, RepeatMode.OFF, null, null, null, null, null, 524285);
        fh5Var2.r = a2;
        yg5 yg5Var = fh5Var2.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        yg5Var.a0(a2);
        yg5 yg5Var2 = fh5Var2.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        yg5Var2.l0();
        fh5 fh5Var3 = this.j;
        if (fh5Var3 == null) {
            fh5Var3 = null;
        }
        fh5Var3.n0();
        fh5 fh5Var4 = this.j;
        if (fh5Var4 == null) {
            fh5Var4 = null;
        }
        fh5Var4.B0();
        ImageView imageView = this.B;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(0);
        View view3 = this.C;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(8);
        b bVar = new b(l(), m());
        StencilLayout stencilLayout = this.p;
        (stencilLayout != null ? stencilLayout : null).setKeepScreenOn(true);
        d(bVar);
    }

    public final void k(boolean z) {
        pbw pbwVar;
        if (this.H == c.ACTIVE && (pbwVar = this.d) != null) {
            cxs0 l = pbwVar.l();
            Msg msg = this.g;
            if (msg == null) {
                msg = null;
            }
            l.c(msg, this.f);
        }
        this.H = c.NOT_ACTIVE;
        View view = this.y;
        if (view == null) {
            view = null;
        }
        view.setClickable(false);
        fh5 fh5Var = this.j;
        fh5 fh5Var2 = fh5Var == null ? null : fh5Var;
        if (fh5Var == null) {
            fh5Var = null;
        }
        com.vk.libvideo.autoplay.a a2 = com.vk.libvideo.autoplay.a.a(fh5Var.r, RepeatMode.BY_VIDEO_PARAMS, null, null, null, null, null, 524285);
        fh5Var2.r = a2;
        yg5 yg5Var = fh5Var2.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        yg5Var.a0(a2);
        yg5 yg5Var2 = fh5Var2.j;
        if (yg5Var2 == null) {
            yg5Var2 = null;
        }
        yg5Var2.l0();
        if (z) {
            View view2 = this.y;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(0);
            r3e0 r3e0Var = this.s;
            if (r3e0Var == null) {
                r3e0Var = null;
            }
            r3e0Var.b = null;
            fh5 fh5Var3 = this.j;
            if (fh5Var3 == null) {
                fh5Var3 = null;
            }
            fh5Var3.n0();
        } else {
            o(false);
            fh5 fh5Var4 = this.j;
            if (fh5Var4 == null) {
                fh5Var4 = null;
            }
            yg5 yg5Var3 = fh5Var4.j;
            if (yg5Var3 == null) {
                yg5Var3 = null;
            }
            yg5Var3.K0(true);
            View view3 = this.y;
            if (view3 == null) {
                view3 = null;
            }
            view3.setVisibility(8);
        }
        fh5 fh5Var5 = this.j;
        if (fh5Var5 == null) {
            fh5Var5 = null;
        }
        fh5Var5.A0();
        ImageView imageView = this.B;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(8);
        b bVar = new b(m(), l());
        StencilLayout stencilLayout = this.p;
        (stencilLayout != null ? stencilLayout : null).setKeepScreenOn(false);
        d(bVar);
    }

    public final int l() {
        if (n(this)) {
            return -2;
        }
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        return e3m.a(R.dimen.vkim_video_msg_size, context);
    }

    public final int m() {
        int min;
        o4w o4wVar = this.i;
        Msg msg = this.g;
        if (msg == null) {
            msg = null;
        }
        int a2 = (msg.i && o4wVar.b) ? iah0.a(40) : 0;
        if (n(this)) {
            return l();
        }
        o4w o4wVar2 = this.i;
        if (o4wVar2 != null ? o4wVar2.c : false) {
            return l();
        }
        Context context = this.m;
        if (context == null) {
            context = null;
        }
        HashSet hashSet = iah0.a;
        if (!fnj.b(context)) {
            Context context2 = this.m;
            if (context2 == null) {
                context2 = null;
            }
            if (iah0.r(context2)) {
                return l();
            }
        }
        Context context3 = this.m;
        if (context3 == null) {
            context3 = null;
        }
        if (!fnj.b(context3)) {
            Context context4 = this.m;
            if (context4 == null) {
                context4 = null;
            }
            if (!iah0.r(context4)) {
                min = this.i.z - iah0.a(32);
                return min - a2;
            }
        }
        int a3 = this.i.z - iah0.a(32);
        Context context5 = this.m;
        min = Math.min(a3, e3m.a(R.dimen.vkim_video_msg_size_tablet, context5 != null ? context5 : null));
        return min - a2;
    }

    public final void o(boolean z) {
        fh5 fh5Var = this.j;
        if (fh5Var == null) {
            fh5Var = null;
        }
        fh5Var.A0();
        if (z) {
            fh5 fh5Var2 = this.j;
            if (fh5Var2 == null) {
                fh5Var2 = null;
            }
            yg5 yg5Var = fh5Var2.j;
            (yg5Var != null ? yg5Var : null).c();
            return;
        }
        fh5 fh5Var3 = this.j;
        if (fh5Var3 == null) {
            fh5Var3 = null;
        }
        yg5 yg5Var2 = fh5Var3.j;
        (yg5Var2 != null ? yg5Var2 : null).pause();
    }

    public final void p(boolean z, boolean z2) {
        Boolean bool = this.I;
        this.I = Boolean.valueOf(z);
        fh5 fh5Var = this.j;
        if (fh5Var == null) {
            fh5Var = null;
        }
        yg5 yg5Var = fh5Var.j;
        if ((yg5Var != null ? yg5Var : null).J0() && z2) {
            j();
        } else if (!epx.f(bool, this.I) || z2) {
            k(false);
        }
    }

    @Override // xsna.h4w
    public final Collection<Integer> v(String str) {
        return EmptyList.b;
    }

    /* compiled from: ImInlineVideoMsgPlayerVC.kt */
    public final class a implements hnt0 {
        public final cxs0 b;
        public final s2n0 c;
        public boolean d;
        public boolean e;
        public boolean f;

        public a(cxs0 cxs0Var, s2n0 s2n0Var) {
            this.b = cxs0Var;
            this.c = s2n0Var;
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            h3(yg5Var, i, i2);
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            e eVar = e.this;
            if (eVar.H == c.ACTIVE) {
                double d = j / j2;
                cxs0 cxs0Var = this.b;
                if (d >= 0.75d && !this.f) {
                    if (!this.d) {
                        this.d = true;
                        if (cxs0Var != null) {
                            Msg msg = eVar.g;
                            if (msg == null) {
                                msg = null;
                            }
                            cxs0Var.a(msg, eVar.f);
                        }
                    }
                    if (!this.e) {
                        this.e = true;
                        if (cxs0Var != null) {
                            Msg msg2 = eVar.g;
                            if (msg2 == null) {
                                msg2 = null;
                            }
                            cxs0Var.b(msg2, eVar.f);
                        }
                    }
                    this.f = true;
                    if (cxs0Var != null) {
                        Msg msg3 = eVar.g;
                        cxs0Var.i(msg3 != null ? msg3 : null, eVar.f);
                    }
                } else if (d >= 0.5d && !this.e) {
                    if (!this.d) {
                        this.d = true;
                        if (cxs0Var != null) {
                            Msg msg4 = eVar.g;
                            if (msg4 == null) {
                                msg4 = null;
                            }
                            cxs0Var.a(msg4, eVar.f);
                        }
                    }
                    this.e = true;
                    if (cxs0Var != null) {
                        Msg msg5 = eVar.g;
                        cxs0Var.b(msg5 != null ? msg5 : null, eVar.f);
                    }
                } else if (d >= 0.25d && !this.d) {
                    this.d = true;
                    if (cxs0Var != null) {
                        Msg msg6 = eVar.g;
                        cxs0Var.a(msg6 != null ? msg6 : null, eVar.f);
                    }
                }
                s2n0 s2n0Var = this.c;
                if (s2n0Var != null) {
                    s2n0Var.a();
                }
            }
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            s2n0 s2n0Var = this.c;
            if (s2n0Var != null) {
                s2n0Var.onError(null);
            }
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
            if (x2s0Var instanceof x2s0.b) {
                e eVar = e.this;
                if (eVar.H == c.ACTIVE) {
                    fh5 fh5Var = eVar.j;
                    if (fh5Var == null) {
                        fh5Var = null;
                    }
                    yg5 yg5Var = fh5Var.j;
                    eVar.k((yg5Var != null ? yg5Var : null).p0());
                }
            }
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            e eVar = e.this;
            if (eVar.H == c.ACTIVE) {
                boolean z = this.d;
                cxs0 cxs0Var = this.b;
                if (!z) {
                    this.d = true;
                    if (cxs0Var != null) {
                        Msg msg = eVar.g;
                        if (msg == null) {
                            msg = null;
                        }
                        cxs0Var.a(msg, eVar.f);
                    }
                }
                if (!this.e) {
                    this.e = true;
                    if (cxs0Var != null) {
                        Msg msg2 = eVar.g;
                        if (msg2 == null) {
                            msg2 = null;
                        }
                        cxs0Var.b(msg2, eVar.f);
                    }
                }
                if (!this.f) {
                    this.f = true;
                    if (cxs0Var != null) {
                        Msg msg3 = eVar.g;
                        if (msg3 == null) {
                            msg3 = null;
                        }
                        cxs0Var.i(msg3, eVar.f);
                    }
                }
                if (cxs0Var != null) {
                    Msg msg4 = eVar.g;
                    if (msg4 == null) {
                        msg4 = null;
                    }
                    cxs0Var.g(msg4, eVar.f);
                }
                this.d = false;
                this.e = false;
                this.f = false;
                fh5 fh5Var = eVar.j;
                if (fh5Var == null) {
                    fh5Var = null;
                }
                yg5 yg5Var = fh5Var.j;
                eVar.k((yg5Var != null ? yg5Var : null).p0());
            }
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class d implements Animator.AnimatorListener {
        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            VideoTextureView videoTextureView = e.this.q;
            if (videoTextureView == null) {
                videoTextureView = null;
            }
            videoTextureView.setClickable(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // xsna.xfz.a
    public final void a(xfz.a.C4001a c4001a) {
    }

    @Override // xsna.xfz.a
    public final void g(ArrayList arrayList) {
    }
}
