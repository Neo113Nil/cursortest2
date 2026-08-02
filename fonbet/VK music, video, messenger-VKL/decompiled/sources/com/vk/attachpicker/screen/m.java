package com.vk.attachpicker.screen;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.b;
import com.vk.attachpicker.videotrim.VideoTimelineView;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.media.player.video.view.SystemVideoView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.text.Regex;
import org.chromium.base.TimeUtils;
import xsna.a3r0;
import xsna.asu0;
import xsna.b780;
import xsna.crp0;
import xsna.cvk;
import xsna.cxd0;
import xsna.drp0;
import xsna.em6;
import xsna.erp0;
import xsna.i0q0;
import xsna.iah0;
import xsna.itg0;
import xsna.j34;
import xsna.j720;
import xsna.lik;
import xsna.oeq0;
import xsna.pro0;
import xsna.qq2;
import xsna.qv20;
import xsna.rwi;
import xsna.s4p;
import xsna.y730;
import xsna.yy80;

/* compiled from: TrimScreen.java */
/* loaded from: classes15.dex */
public final class m extends em6 implements s4p {
    public TextView A;
    public TextView B;
    public int C;
    public float D;
    public boolean G;

    @Nullable
    public final k i;

    @Nullable
    public final j34 j;
    public final Uri k;
    public final String l;
    public final long m;
    public final long n;
    public final long o;
    public Toast p;
    public FrameLayout q;
    public SystemVideoView r;
    public VKImageView s;
    public View t;
    public View u;
    public VideoTimelineView v;
    public View w;
    public View x;
    public View y;
    public View z;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final yy80 h = new yy80();
    public int E = -1;
    public boolean F = true;
    public final b H = new b();
    public final c I = new c();

    /* compiled from: TrimScreen.java */
    public class a implements MediaPlayer.OnPreparedListener {

        /* compiled from: TrimScreen.java */
        /* renamed from: com.vk.attachpicker.screen.m$a$a, reason: collision with other inner class name */
        public class RunnableC0391a implements Runnable {
            public RunnableC0391a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.this.r.g(0);
            }
        }

        /* compiled from: TrimScreen.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                m.this.s.setVisibility(8);
            }
        }

        public a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            int duration = mediaPlayer.getDuration();
            m mVar = m.this;
            mVar.C = duration;
            mVar.v.setDuration(duration);
            long j = mVar.o;
            if (j != 0) {
                int i = mVar.C;
                if (i > j) {
                    mVar.v.setProgressRight(j / i);
                }
            }
            mVar.g.post(mVar.H);
            mVar.A.setVisibility(0);
            mVar.B.setVisibility(0);
            m.p(mVar);
            pro0.c(new RunnableC0391a());
            i0q0.d(300L, new b());
        }
    }

    /* compiled from: TrimScreen.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            if (mVar.r == null) {
                return;
            }
            float currentPosition = r1.getCurrentPosition() / mVar.r.getDuration();
            if (mVar.D < currentPosition && mVar.r.b()) {
                mVar.v.setProgress(currentPosition);
                mVar.D = currentPosition;
                mVar.t.setVisibility(4);
            }
            if (mVar.r.getCurrentPosition() >= ((int) (mVar.v.getRightProgress() * mVar.C)) - 80) {
                mVar.D = mVar.v.getLeftProgress();
                mVar.r.g((int) (mVar.v.getLeftProgress() * mVar.C));
                VideoTimelineView videoTimelineView = mVar.v;
                videoTimelineView.setProgress(videoTimelineView.getLeftProgress());
                mVar.r.d();
                mVar.t.setVisibility(0);
            }
            mVar.g.postDelayed(mVar.H, 16L);
        }
    }

    /* compiled from: TrimScreen.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            k kVar = mVar.i;
            if (kVar != null) {
                kVar.a((long) ((mVar.v.getRightProgress() * mVar.C) - (mVar.v.getLeftProgress() * mVar.C)));
            }
        }
    }

    /* compiled from: TrimScreen.java */
    public class d implements MediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            m mVar = m.this;
            mVar.r.g(((int) mVar.v.getLeftProgress()) * mVar.C);
            VideoTimelineView videoTimelineView = mVar.v;
            videoTimelineView.setProgress(videoTimelineView.getLeftProgress());
            mVar.r.d();
            mVar.t.setVisibility(0);
            m.n(mVar, (int) (mVar.v.getLeftProgress() * mVar.C));
        }
    }

    /* compiled from: TrimScreen.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            m mVar = m.this;
            if (mVar.r.b()) {
                mVar.r.d();
                mVar.t.setVisibility(0);
                return;
            }
            int i = mVar.E;
            if (i >= 0) {
                mVar.r.g(i);
                mVar.E = -1;
            }
            mVar.r.i();
            mVar.t.setVisibility(4);
            mVar.g.post(mVar.H);
        }
    }

    /* compiled from: TrimScreen.java */
    public class f implements VideoTimelineView.b {
        public f() {
        }
    }

    /* compiled from: TrimScreen.java */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            m.this.c();
        }
    }

    /* compiled from: TrimScreen.java */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                m.m(m.this);
            } catch (IllegalArgumentException unused) {
                cvk.u(R.string.image_corrupted_1, false);
            } catch (Exception unused2) {
                cvk.u(R.string.error, false);
            }
        }
    }

    /* compiled from: TrimScreen.java */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            Activity d = mVar.d();
            mVar.h.a(d);
            mVar.F = false;
            mVar.x.setEnabled(false);
            float imageAspectRatio = mVar.s.getImageAspectRatio();
            RectF a = lik.a(imageAspectRatio, mVar.q.getMeasuredWidth(), mVar.q.getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            RectF a2 = lik.a(imageAspectRatio, mVar.q.getMeasuredWidth(), iah0.a(108) + mVar.q.getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float width = a2.width() / a.width();
            float f = a2.top - a.top;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(qq2.b);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mVar.w, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mVar.q, (Property<FrameLayout, Float>) View.TRANSLATION_X, (-((mVar.q.getMeasuredWidth() * width) - mVar.q.getMeasuredWidth())) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            FrameLayout frameLayout = mVar.q;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            FrameLayout frameLayout2 = mVar.q;
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, width, 1.0f);
            FrameLayout frameLayout3 = mVar.q;
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, width, 1.0f);
            float f2 = 1.0f / width;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(mVar.t, (Property<View, Float>) property2, f2, 1.0f), ObjectAnimator.ofFloat(mVar.t, (Property<View, Float>) property3, f2, 1.0f), ObjectAnimator.ofFloat(mVar.y, (Property<View, Float>) property, r6.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(mVar.z, (Property<View, Float>) property, mVar.y.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            animatorSet.addListener(new erp0(mVar, d));
            animatorSet.setDuration(175L);
            animatorSet.start();
            mVar.G = false;
        }
    }

    /* compiled from: TrimScreen.java */
    public interface k {
        void a(long j);

        void b();
    }

    public m(Uri uri, long j2, long j3, long j4, @Nullable k kVar, @Nullable j34 j34Var) {
        this.m = j2;
        this.n = j3;
        this.o = j4;
        this.k = uri;
        if (oeq0.e(uri)) {
            this.l = uri.toString();
        } else {
            this.l = uri.getPath();
        }
        this.i = kVar;
        this.j = j34Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(final m mVar) {
        long j2;
        MediaMetadataRetriever mediaMetadataRetriever;
        Handler handler = mVar.g;
        String str = mVar.l;
        Uri uri = mVar.k;
        mVar.l(false);
        Activity d2 = mVar.d();
        if (d2 == null) {
            return;
        }
        final int leftProgress = (int) (mVar.v.getLeftProgress() * mVar.C);
        final int rightProgress = (int) (mVar.v.getRightProgress() * mVar.C);
        int i2 = rightProgress - leftProgress;
        long j3 = mVar.m;
        if (j3 > 0 && i2 > j3) {
            handler.post(new drp0(mVar, R.string.picker_trim_video_length, true, j3));
            return;
        }
        long j4 = mVar.n;
        if (j4 > 0 && i2 < j4) {
            if (j4 > 1000) {
                handler.post(new drp0(mVar, R.string.picker_trim_min_video_length, true, j4));
                return;
            } else {
                handler.post(new drp0(mVar, R.string.picker_trim_video_min_length_multi_seconds, false, j4));
                return;
            }
        }
        if (mVar.v.getLeftProgress() <= 0.01f && mVar.v.getRightProgress() >= 0.99f) {
            mVar.s(uri);
            return;
        }
        if (leftProgress < 0 || rightProgress > mVar.C) {
            mVar.s(uri);
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            j2 = extractMetadata != null ? Long.parseLong(extractMetadata) : 0L;
            mediaMetadataRetriever.release();
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            e.toString();
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
            }
            j2 = 0;
            final File file = new File(str);
            if (i2 < 1000) {
            }
            com.vk.core.view.components.spinner.c e4 = qv20.e(d2, Integer.valueOf(R.string.picker_video_processing_progress));
            itg0.a(d2, new io.reactivex.rxjava3.internal.operators.single.m(new io.reactivex.rxjava3.internal.operators.single.n(io.reactivex.rxjava3.subjects.c.b(asu0.a, new v(new Callable() { // from class: xsna.brp0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    PrivateFiles.a b2;
                    com.vk.attachpicker.screen.m mVar2 = com.vk.attachpicker.screen.m.this;
                    File file2 = file;
                    int i3 = leftProgress;
                    int i4 = rightProgress;
                    Regex regex = com.vk.core.files.a.a;
                    PrivateFiles privateFiles = e8r.a;
                    PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
                    privateFiles.getClass();
                    b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                    File file3 = new File(b2.a, "TEMP_TRIM_" + System.currentTimeMillis() + ".".concat("mp4"));
                    try {
                        ant0.b(mVar2.d(), file2, file3, i3, i4);
                        return file3;
                    } catch (Exception e5) {
                        vhk0.b(file3);
                        throw e5;
                    }
                }
            })).m(io.reactivex.rxjava3.android.schedulers.a.b()), new j720(e4, 12)), new cxd0(e4, 9)).subscribe(new y730(mVar, 17), new crp0(0)));
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
            }
            throw th;
        }
        final File file2 = new File(str);
        if (i2 < 1000) {
            int i3 = 1000 - i2;
            if (j2 - rightProgress > i3) {
                rightProgress += i3;
            } else if (leftProgress > i3) {
                leftProgress -= i3;
            }
        }
        com.vk.core.view.components.spinner.c e42 = qv20.e(d2, Integer.valueOf(R.string.picker_video_processing_progress));
        itg0.a(d2, new io.reactivex.rxjava3.internal.operators.single.m(new io.reactivex.rxjava3.internal.operators.single.n(io.reactivex.rxjava3.subjects.c.b(asu0.a, new v(new Callable() { // from class: xsna.brp0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                PrivateFiles.a b2;
                com.vk.attachpicker.screen.m mVar2 = com.vk.attachpicker.screen.m.this;
                File file22 = file2;
                int i32 = leftProgress;
                int i4 = rightProgress;
                Regex regex = com.vk.core.files.a.a;
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.TEMP_UPLOADS;
                privateFiles.getClass();
                b2 = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                File file3 = new File(b2.a, "TEMP_TRIM_" + System.currentTimeMillis() + ".".concat("mp4"));
                try {
                    ant0.b(mVar2.d(), file22, file3, i32, i4);
                    return file3;
                } catch (Exception e5) {
                    vhk0.b(file3);
                    throw e5;
                }
            }
        })).m(io.reactivex.rxjava3.android.schedulers.a.b()), new j720(e42, 12)), new cxd0(e42, 9)).subscribe(new y730(mVar, 17), new crp0(0)));
    }

    public static void n(m mVar, int i2) {
        mVar.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mVar.E = i2;
    }

    public static void p(m mVar) {
        mVar.A.setText(r((int) (mVar.v.getLeftProgress() * mVar.C)));
        mVar.B.setText(r((int) (mVar.v.getRightProgress() * mVar.C)));
    }

    public static String r(int i2) {
        long abs = Math.abs(i2 / 1000);
        return String.format("%01d:%02d", Long.valueOf((abs % TimeUtils.SECONDS_PER_HOUR) / 60), Long.valueOf(abs % 60));
    }

    @Override // xsna.em6
    public final View b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.picker_video_trim_screen, (ViewGroup) null);
        this.s = (VKImageView) inflate.findViewById(R.id.iv_preview);
        this.v = (VideoTimelineView) inflate.findViewById(R.id.vtv_timeline);
        this.A = (TextView) inflate.findViewById(R.id.tv_left_offset);
        this.B = (TextView) inflate.findViewById(R.id.tv_right_offset);
        this.A.setVisibility(4);
        this.B.setVisibility(4);
        this.y = inflate.findViewById(R.id.fl_trim_panel);
        this.z = inflate.findViewById(R.id.view_shadow);
        this.q = (FrameLayout) inflate.findViewById(R.id.fl_container);
        SystemVideoView systemVideoView = (SystemVideoView) inflate.findViewById(R.id.vv_video);
        this.r = systemVideoView;
        String str = this.l;
        systemVideoView.setVideoPath(str);
        this.r.setOnPreparedListener(new a());
        this.r.setOnCompletionListener(new d());
        this.r.setLoop(false);
        this.t = inflate.findViewById(R.id.iv_play);
        View findViewById = inflate.findViewById(R.id.click_handler);
        this.u = findViewById;
        findViewById.setOnClickListener(new e());
        this.v.setEnabledSelectedZones(true);
        this.v.setVideoPath(str);
        this.v.setDelegate(new f());
        this.w = inflate.findViewById(R.id.fl_close_btn_container);
        View findViewById2 = inflate.findViewById(R.id.iv_close);
        this.x = findViewById2;
        findViewById2.setOnClickListener(new g());
        inflate.findViewById(R.id.tv_attach).setOnClickListener(new h());
        this.s.L0(this.k, ImageScreenSize.VERY_BIG);
        this.s.setOnLoadCallback(new i());
        l(true);
        return inflate;
    }

    @Override // xsna.em6
    public final void c() {
        k kVar = this.i;
        if (kVar == null || !this.s.c0()) {
            super.c();
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        this.h.a(d());
        this.F = false;
        this.x.setEnabled(false);
        this.s.setVisibility(0);
        float imageAspectRatio = this.s.getImageAspectRatio();
        RectF a2 = lik.a(imageAspectRatio, this.q.getMeasuredWidth(), this.q.getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        RectF a3 = lik.a(imageAspectRatio, this.q.getMeasuredWidth(), iah0.a(108) + this.q.getMeasuredHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float width = a3.width() / a2.width();
        float f2 = a3.top - a2.top;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(qq2.c);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.w, (Property<View, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.q, (Property<FrameLayout, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-((this.q.getMeasuredWidth() * width) - this.q.getMeasuredWidth())) / 2.0f);
        FrameLayout frameLayout = this.q;
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        FrameLayout frameLayout2 = this.q;
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 1.0f, width);
        FrameLayout frameLayout3 = this.q;
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 1.0f, width);
        float f3 = 1.0f / width;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(this.t, (Property<View, Float>) property2, 1.0f, f3), ObjectAnimator.ofFloat(this.t, (Property<View, Float>) property3, 1.0f, f3), ObjectAnimator.ofFloat(this.y, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r12.getHeight()), ObjectAnimator.ofFloat(this.z, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.y.getHeight()));
        animatorSet.addListener(new n(this));
        animatorSet.setDuration(175L);
        animatorSet.start();
        this.G = false;
    }

    @Override // xsna.em6
    public final boolean g() {
        if (this.F) {
            c();
        }
        return true;
    }

    @Override // xsna.em6
    public final void h() {
        this.c = true;
        l(false);
        this.r.d();
        this.r.e();
        this.v.c();
    }

    @Override // xsna.em6
    public final void i() {
        this.d = false;
    }

    @Override // xsna.em6
    public final void j() {
        this.d = true;
        if (!this.G) {
            try {
                SystemVideoView systemVideoView = this.r;
                systemVideoView.g(systemVideoView.getCurrentPosition());
            } catch (Throwable unused) {
            }
        } else {
            VideoTimelineView videoTimelineView = this.v;
            videoTimelineView.getViewTreeObserver().addOnPreDrawListener(new a3r0(videoTimelineView, new j()));
            SystemVideoView systemVideoView2 = this.r;
            systemVideoView2.g(systemVideoView2.getCurrentPosition());
        }
    }

    @Override // xsna.em6
    public final void k(int i2) {
        this.w.setPadding(0, i2, 0, 0);
    }

    public final void s(Uri uri) {
        Activity d2 = d();
        if (d2 == null) {
            return;
        }
        Intent a2 = b.a.a(uri, true, false);
        a2.setData(uri);
        Intent intent = d2.getIntent();
        if (intent != null) {
            UserId userId = (UserId) intent.getParcelableExtra("owner_id");
            int intExtra = intent.getIntExtra("post_id", 0);
            a2.putExtra("owner_id", userId);
            a2.putExtra("post_id", intExtra);
        }
        j34 j34Var = this.j;
        if (j34Var != null) {
            j34Var.V2(a2);
            return;
        }
        j34 c2 = rwi.d().p().c(d2);
        if (c2 != null) {
            c2.V2(a2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    /* compiled from: TrimScreen.java */
    public class i implements b780 {
        public i() {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, @NonNull String str) {
            m.this.G = true;
        }

        @Override // xsna.b780
        public final void g(@NonNull String str) {
        }

        @Override // xsna.b780
        public final void onCancel(@NonNull String str) {
        }

        @Override // xsna.b780
        public final void b(@NonNull String str, @Nullable Throwable th) {
        }
    }
}
