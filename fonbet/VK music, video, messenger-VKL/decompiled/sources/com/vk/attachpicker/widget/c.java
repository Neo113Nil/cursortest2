package com.vk.attachpicker.widget;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.vk.attachpicker.screen.r;
import com.vk.media.player.video.view.SystemVideoView;
import com.vkontakte.android.R;
import xsna.bd70;
import xsna.p870;
import xsna.tc90;

/* compiled from: PagerVideoPlayer.java */
/* loaded from: classes15.dex */
public final class c extends FrameLayout implements bd70 {
    public final Handler b;
    public final String c;
    public final int d;
    public final ImageView e;
    public final FrameLayout f;
    public SystemVideoView g;

    @Nullable
    public final r.a h;
    public final a i;
    public final b j;
    public final C0397c k;
    public final d l;

    /* compiled from: PagerVideoPlayer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            if (cVar.g == null) {
                return;
            }
            p870.f().e(3, new e(r1.getCurrentPosition() / cVar.g.getDuration(), cVar.g.getCurrentPosition(), cVar.g.getDuration(), cVar.d));
            if (cVar.g.b()) {
                cVar.b.postDelayed(cVar.i, 16L);
            }
        }
    }

    /* compiled from: PagerVideoPlayer.java */
    public class b implements bd70 {
        public b() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            c cVar = c.this;
            SystemVideoView systemVideoView = cVar.g;
            if (systemVideoView != null) {
                systemVideoView.d();
                cVar.b.removeCallbacks(cVar.i);
            }
        }
    }

    /* compiled from: PagerVideoPlayer.java */
    /* renamed from: com.vk.attachpicker.widget.c$c, reason: collision with other inner class name */
    public class C0397c implements bd70 {
        public C0397c() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            c cVar = c.this;
            SystemVideoView systemVideoView = cVar.g;
            if (systemVideoView != null) {
                systemVideoView.i();
                cVar.b();
            }
        }
    }

    /* compiled from: PagerVideoPlayer.java */
    public class d implements bd70<Float> {
        public d() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Float f) {
            Float f2 = f;
            SystemVideoView systemVideoView = c.this.g;
            if (systemVideoView != null) {
                systemVideoView.g((int) (f2.floatValue() * r1.g.getDuration()));
            }
        }
    }

    /* compiled from: PagerVideoPlayer.java */
    public static class e {
        public final int a;
        public final int b;
        public final float c;
        public final int d;

        public e(float f, int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = f;
            this.d = i3;
        }
    }

    public c(Context context, Uri uri, int i, @Nullable r.a aVar) {
        super(context);
        this.b = new Handler(Looper.getMainLooper());
        this.i = new a();
        this.j = new b();
        this.k = new C0397c();
        this.l = new d();
        this.c = uri.getPath();
        this.d = i;
        this.h = aVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.vk_icon_play_button_56);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.e, layoutParams);
        View view = new View(getContext());
        addView(view);
        view.setOnClickListener(new tc90(this));
    }

    public final void a() {
        p870.f().e(5, Integer.valueOf(this.d));
        SystemVideoView systemVideoView = this.g;
        if (systemVideoView != null) {
            systemVideoView.d();
            this.g.e();
            this.g = null;
            this.f.removeAllViews();
        }
        this.e.setVisibility(0);
    }

    public final void b() {
        p870.f().e(4, Integer.valueOf(this.d));
        this.b.post(this.i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p870.f().b(2, this);
        p870 f = p870.f();
        b bVar = this.j;
        int i = this.d;
        f.a(6, i, bVar);
        p870.f().a(7, i, this.k);
        p870.f().a(8, i, this.l);
        this.e.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r.a aVar = this.h;
        if (aVar != null) {
            r.this.d.l(false);
        }
        a();
        p870.f().g(this);
        p870.f().g(this.j);
        p870.f().g(this.k);
        p870.f().g(this.l);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        a();
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        a();
    }
}
