package com.vk.im.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import kotlin.collections.EmptyList;
import one.video.transform.TransformController;
import xsna.as30;
import xsna.bc;
import xsna.bwt0;
import xsna.dnt0;
import xsna.ek30;
import xsna.fh5;
import xsna.frg;
import xsna.fxc0;
import xsna.g34;
import xsna.g4w;
import xsna.h4w;
import xsna.hr30;
import xsna.jjc;
import xsna.jr30;
import xsna.kq01;
import xsna.lar;
import xsna.mre;
import xsna.qcy;
import xsna.r3e0;
import xsna.tn10;
import xsna.uzb;
import xsna.wp10;
import xsna.xfz;
import xsna.yg5;
import xsna.zwv;

/* compiled from: ImInlineGifPlayerVC.kt */
/* loaded from: classes2.dex */
public final class a implements h4w {
    public final zwv b;
    public Context c;
    public ViewGroup d;
    public FrescoImageView e;
    public View f;
    public VideoTextureView g;
    public VideoErrorView h;
    public ProgressView i;
    public DurationView j;
    public View k;
    public TimeAndStatusView l;
    public r3e0 m;
    public ek30 n;
    public AttachDoc o;
    public Msg p;
    public as30.a q;
    public g4w r;
    public fh5 s;
    public int t;
    public int u;
    public int v;
    public g34 w;
    public final StringBuilder x = new StringBuilder();
    public final C1184a y = new C1184a();

    /* compiled from: ImInlineGifPlayerVC.kt */
    /* renamed from: com.vk.im.video.a$a, reason: collision with other inner class name */
    public static final class C1184a extends ViewOutlineProvider {
        public C1184a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), a.this.t);
        }
    }

    public a(zwv zwvVar) {
        this.b = zwvVar;
    }

    @Override // xsna.xfz.a
    public final void b() {
        g34 g34Var = this.w;
        if (g34Var != null) {
            g4w g4wVar = this.r;
            if (g4wVar == null) {
                g4wVar = null;
            }
            g34Var.a(g4wVar.h.b, null);
        }
        this.w = null;
        fh5 fh5Var = this.s;
        if (fh5Var == null) {
            fh5Var = null;
        }
        fh5Var.S();
        r3e0 r3e0Var = this.m;
        (r3e0Var != null ? r3e0Var : null).e();
    }

    @Override // xsna.xfz.a
    public final void bind(wp10 wp10Var) {
        g4w g4wVar = (g4w) wp10Var;
        AttachDoc attachDoc = g4wVar.h;
        this.r = g4wVar;
        g34 g34Var = g4wVar.j;
        this.w = g34Var;
        if (g34Var != null) {
            g34Var.a(attachDoc.b, this);
        }
        Context context = this.c;
        if (context == null) {
            context = null;
        }
        this.t = Math.max(g4wVar.m0(context), g4wVar.g(context));
        Context context2 = this.c;
        if (context2 == null) {
            context2 = null;
        }
        this.u = g4wVar.m0(context2);
        Context context3 = this.c;
        if (context3 == null) {
            context3 = null;
        }
        this.v = g4wVar.g(context3);
        this.o = attachDoc;
        this.p = g4wVar.f;
        (attachDoc == null ? null : attachDoc).getClass();
        int i = this.u;
        int i2 = this.v;
        FrescoImageView frescoImageView = this.e;
        if (frescoImageView == null) {
            frescoImageView = null;
        }
        frescoImageView.setScaleType(ScaleType.CENTER_CROP_UPSCALE);
        FrescoImageView frescoImageView2 = this.e;
        if (frescoImageView2 == null) {
            frescoImageView2 = null;
        }
        frescoImageView2.setLocalImage(attachDoc.d());
        FrescoImageView frescoImageView3 = this.e;
        if (frescoImageView3 == null) {
            frescoImageView3 = null;
        }
        frescoImageView3.setRemoteImage(attachDoc.f().Ab());
        FrescoImageView frescoImageView4 = this.e;
        if (frescoImageView4 == null) {
            frescoImageView4 = null;
        }
        frescoImageView4.m(i, i, i2, i2);
        ek30 ek30Var = this.n;
        if (ek30Var == null) {
            ek30Var = null;
        }
        ek30Var.c(i, i, i2, i2);
        VideoTextureView videoTextureView = this.g;
        if (videoTextureView == null) {
            videoTextureView = null;
        }
        videoTextureView.invalidateOutline();
        StringBuilder sb = this.x;
        sb.setLength(0);
        AttachDoc attachDoc2 = this.o;
        if (attachDoc2 == null) {
            attachDoc2 = null;
        }
        sb.append(attachDoc2.j.toUpperCase(Locale.ROOT));
        sb.append(" · ");
        lar larVar = lar.a;
        AttachDoc attachDoc3 = this.o;
        if (attachDoc3 == null) {
            attachDoc3 = null;
        }
        long j = attachDoc3.h;
        larVar.getClass();
        lar.b(j, sb);
        DurationView durationView = this.j;
        if (durationView == null) {
            durationView = null;
        }
        durationView.setText(sb);
        VideoTextureView videoTextureView2 = this.g;
        if (videoTextureView2 == null) {
            videoTextureView2 = null;
        }
        if (!videoTextureView2.getClipToOutline()) {
            VideoTextureView videoTextureView3 = this.g;
            if (videoTextureView3 == null) {
                videoTextureView3 = null;
            }
            videoTextureView3.setClipToOutline(true);
            VideoTextureView videoTextureView4 = this.g;
            if (videoTextureView4 == null) {
                videoTextureView4 = null;
            }
            videoTextureView4.setOutlineProvider(this.y);
        }
        AttachDoc attachDoc4 = this.o;
        if (attachDoc4 == null) {
            attachDoc4 = null;
        }
        this.b.getClass();
        yg5 a = zwv.a(attachDoc4);
        fh5 fh5Var = this.s;
        if (fh5Var == null) {
            fh5Var = null;
        }
        VideoFile A = a.A();
        RepeatMode repeatMode = RepeatMode.BY_VIDEO_PARAMS;
        Msg msg = this.p;
        if (msg == null) {
            msg = null;
        }
        fh5Var.k(A, a, new com.vk.libvideo.autoplay.a(false, repeatMode, null, false, msg.z, false, null, null, null, null, null, null, false, null, 523517));
        DurationView durationView2 = this.j;
        if (durationView2 == null) {
            durationView2 = null;
        }
        bwt0.p0(durationView2, true);
        AttachDoc attachDoc5 = this.o;
        if (attachDoc5 == null) {
            attachDoc5 = null;
        }
        int width = attachDoc5.getWidth();
        AttachDoc attachDoc6 = this.o;
        if (attachDoc6 == null) {
            attachDoc6 = null;
        }
        if (attachDoc6.getHeight() * width > 0) {
            VideoTextureView videoTextureView5 = this.g;
            if (videoTextureView5 == null) {
                videoTextureView5 = null;
            }
            tn10 matrixProvider = videoTextureView5.getMatrixProvider();
            AttachDoc attachDoc7 = this.o;
            if (attachDoc7 == null) {
                attachDoc7 = null;
            }
            int width2 = attachDoc7.getWidth();
            AttachDoc attachDoc8 = this.o;
            if (attachDoc8 == null) {
                attachDoc8 = null;
            }
            matrixProvider.l(width2, attachDoc8.getHeight());
        }
        boolean P = g4wVar.P();
        View view = this.f;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, P);
        r3e0 r3e0Var = this.m;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.a(attachDoc);
        StringBuilder sb2 = hr30.b;
        jr30 jr30Var = g4wVar.g;
        TimeAndStatusView timeAndStatusView = this.l;
        hr30.a.a(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.m;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.m;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.m;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.xfz.a
    public final dnt0 getPresenter() {
        fh5 fh5Var = this.s;
        if (fh5Var == null) {
            return null;
        }
        return fh5Var;
    }

    @Override // xsna.xfz.a
    public final View i(MsgBubbleView msgBubbleView, as30.a aVar) {
        this.q = aVar;
        this.c = msgBubbleView.getContext();
        qcy<Object>[] qcyVarArr = bwt0.a;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(msgBubbleView.getContext()).inflate(R.layout.vkim_msg_part_doc_preview, (ViewGroup) msgBubbleView, false);
        this.d = viewGroup;
        this.f = viewGroup.findViewById(R.id.selection_mask);
        ViewGroup viewGroup2 = this.d;
        String str = null;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.e = (FrescoImageView) viewGroup2.findViewById(R.id.image);
        ViewGroup viewGroup3 = this.d;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        VideoTextureView videoTextureView = (VideoTextureView) viewGroup3.findViewById(R.id.video_display);
        this.g = videoTextureView;
        TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        ViewGroup viewGroup4 = this.d;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.j = (DurationView) viewGroup4.findViewById(R.id.duration);
        ViewGroup viewGroup5 = this.d;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.k = viewGroup5.findViewById(R.id.play);
        ViewGroup viewGroup6 = this.d;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        VideoErrorView videoErrorView = (VideoErrorView) viewGroup6.findViewById(R.id.error_view);
        videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        this.h = videoErrorView;
        ViewGroup viewGroup7 = this.d;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.i = (ProgressView) viewGroup7.findViewById(R.id.upload);
        ViewGroup viewGroup8 = this.d;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.l = (TimeAndStatusView) viewGroup8.findViewById(R.id.timeAndStatus);
        kq01 kq01Var = new kq01();
        VideoTextureView videoTextureView2 = this.g;
        VideoTextureView videoTextureView3 = videoTextureView2 == null ? null : videoTextureView2;
        ViewGroup viewGroup9 = this.d;
        ViewGroup viewGroup10 = viewGroup9 == null ? null : viewGroup9;
        FrescoImageView frescoImageView = this.e;
        FrescoImageView frescoImageView2 = frescoImageView == null ? null : frescoImageView;
        DurationView durationView = this.j;
        DurationView durationView2 = durationView == null ? null : durationView;
        View view = this.k;
        View view2 = view == null ? null : view;
        VideoErrorView videoErrorView2 = this.h;
        fh5 fh5Var = new fh5(kq01Var, videoTextureView3, viewGroup10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frescoImageView2, view2, null, null, null, null, null, null, null, durationView2, null, null, null, videoErrorView2 == null ? null : videoErrorView2, null, null, false, null, null, null, null, null, null, null, null, null, -13140064, 31);
        fh5Var.w("im");
        this.s = fh5Var;
        Context context = this.c;
        if (context == null) {
            context = null;
        }
        ek30 ek30Var = new ek30(context, 0);
        this.n = ek30Var;
        FrescoImageView frescoImageView3 = this.e;
        if (frescoImageView3 == null) {
            frescoImageView3 = null;
        }
        frescoImageView3.setPlaceholder(ek30Var);
        VideoTextureView videoTextureView4 = this.g;
        if (videoTextureView4 == null) {
            videoTextureView4 = null;
        }
        jjc.g(videoTextureView4, new mre(this, 25));
        VideoTextureView videoTextureView5 = this.g;
        if (videoTextureView5 == null) {
            videoTextureView5 = null;
        }
        bwt0.k0(videoTextureView5, new frg(this, 22));
        ViewGroup viewGroup11 = this.d;
        if (viewGroup11 == null) {
            viewGroup11 = null;
        }
        viewGroup11.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.f4w
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                as30.a aVar2 = com.vk.im.video.a.this.q;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.c();
                return true;
            }
        });
        VideoErrorView videoErrorView3 = this.h;
        if (videoErrorView3 == null) {
            videoErrorView3 = null;
        }
        videoErrorView3.a(new VideoErrorView.a(str, new uzb(this, 5), true, 57));
        ProgressView progressView = this.i;
        if (progressView == null) {
            progressView = null;
        }
        this.m = new r3e0(progressView, null, new bc(this, 6));
        ViewGroup viewGroup12 = this.d;
        if (viewGroup12 == null) {
            return null;
        }
        return viewGroup12;
    }

    @Override // xsna.h4w
    public final boolean isActive() {
        return false;
    }

    @Override // xsna.h4w
    public final Collection<Integer> v(String str) {
        return EmptyList.b;
    }

    @Override // xsna.xfz.a
    public final void a(xfz.a.C4001a c4001a) {
    }

    @Override // xsna.xfz.a
    public final void g(ArrayList arrayList) {
    }
}
