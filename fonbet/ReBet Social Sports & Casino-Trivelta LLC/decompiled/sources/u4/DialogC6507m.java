package u4;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import androidx.media3.ui.AbstractC2239h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t4.C6441a;

/* renamed from: u4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC6507m extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public final C6505k f66118a;

    /* renamed from: b, reason: collision with root package name */
    public final W f66119b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.F f66120c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.e f66121d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f66122e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f66123f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f66124g;

    /* renamed from: h, reason: collision with root package name */
    public final a f66125h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f66126i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f66127j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f66128k;

    /* renamed from: u4.m$a */
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public static final C0919a f66129b = new C0919a(null);

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f66130a;

        /* renamed from: u4.m$a$a, reason: collision with other inner class name */
        public static final class C0919a {
            public /* synthetic */ C0919a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0919a() {
            }
        }

        public a(DialogC6507m fullScreenPlayerView) {
            Intrinsics.checkNotNullParameter(fullScreenPlayerView, "fullScreenPlayerView");
            this.f66130a = new WeakReference(fullScreenPlayerView);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DialogC6507m dialogC6507m = (DialogC6507m) this.f66130a.get();
                if (dialogC6507m != null) {
                    Window window = dialogC6507m.getWindow();
                    if (window != null) {
                        if (dialogC6507m.f66118a.g()) {
                            window.addFlags(128);
                        } else {
                            window.clearFlags(128);
                        }
                    }
                    dialogC6507m.f66124g.postDelayed(this, 200L);
                }
            } catch (Exception e10) {
                C6441a.b("ExoPlayer Exception", "Failed to flag FLAG_KEEP_SCREEN_ON on fullscreen.");
                C6441a.b("ExoPlayer Exception", e10.toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6507m(Context context, C6505k exoPlayerView, W reactExoplayerView, AbstractC2239h abstractC2239h, androidx.activity.F onBackPressedCallback, r4.e controlsConfig) {
        super(context, R.style.Theme.Black.NoTitleBar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exoPlayerView, "exoPlayerView");
        Intrinsics.checkNotNullParameter(reactExoplayerView, "reactExoplayerView");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Intrinsics.checkNotNullParameter(controlsConfig, "controlsConfig");
        this.f66118a = exoPlayerView;
        this.f66119b = reactExoplayerView;
        this.f66120c = onBackPressedCallback;
        this.f66121d = controlsConfig;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f66123f = frameLayout;
        this.f66124g = new Handler(Looper.getMainLooper());
        this.f66125h = new a(this);
        setContentView(frameLayout, c());
        Window window = getWindow();
        if (window != null) {
            this.f66126i = Integer.valueOf(new h1(window, window.getDecorView()).a());
            F0 G10 = AbstractC2082d0.G(window.getDecorView());
            boolean z10 = false;
            this.f66127j = Boolean.valueOf(G10 != null && G10.q(F0.p.e()));
            F0 G11 = AbstractC2082d0.G(window.getDecorView());
            if (G11 != null && G11.q(F0.p.f())) {
                z10 = true;
            }
            this.f66128k = Boolean.valueOf(z10);
        }
    }

    public static /* synthetic */ void g(DialogC6507m dialogC6507m, h1 h1Var, int i10, Boolean bool, Boolean bool2, Integer num, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            num = null;
        }
        dialogC6507m.f(h1Var, i10, bool, bool2, num);
    }

    public final FrameLayout.LayoutParams c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        return layoutParams;
    }

    public final void d() {
        int childCount = this.f66123f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (this.f66123f.getChildAt(i10) != this.f66118a) {
                this.f66123f.getChildAt(i10).setVisibility(8);
            }
        }
    }

    public final void e() {
        Window window = getWindow();
        if (window != null) {
            i(window, this.f66127j, this.f66128k, this.f66126i);
        }
    }

    public final void f(h1 h1Var, int i10, Boolean bool, Boolean bool2, Integer num) {
        if (bool != null) {
            if (Intrinsics.areEqual(bool, bool2)) {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    h1Var.g(i10);
                    return;
                }
                h1Var.b(i10);
                if (num != null) {
                    h1Var.f(num.intValue());
                }
            }
        }
    }

    public final void h() {
        Window window = getWindow();
        if (window != null) {
            i(window, Boolean.valueOf(this.f66121d.b()), Boolean.valueOf(this.f66121d.c()), 2);
        }
    }

    public final void i(Window window, Boolean bool, Boolean bool2, Integer num) {
        h1 h1Var = new h1(window, window.getDecorView());
        f(h1Var, F0.p.e(), bool, this.f66127j, num);
        g(this, h1Var, F0.p.f(), bool2, this.f66128k, null, 16, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f66119b.getPreventsDisplaySleepDuringVideoPlayback()) {
            this.f66124g.post(this.f66125h);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        ViewGroup viewGroup = (ViewGroup) this.f66118a.getParent();
        this.f66122e = viewGroup;
        if (viewGroup != null) {
            viewGroup.removeView(this.f66118a);
        }
        this.f66123f.addView(this.f66118a, c());
        h();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        this.f66124g.removeCallbacks(this.f66125h);
        this.f66123f.removeView(this.f66118a);
        ViewGroup viewGroup = this.f66122e;
        if (viewGroup != null) {
            viewGroup.addView(this.f66118a, c());
        }
        ViewGroup viewGroup2 = this.f66122e;
        if (viewGroup2 != null) {
            viewGroup2.requestLayout();
        }
        this.f66122e = null;
        this.f66120c.handleOnBackPressed();
        e();
    }
}
