package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ncd extends Dialog implements nf, pyf, View.OnLayoutChangeListener {
    public final ky1 a;
    public FrameLayout b;
    public ImageView c;
    public ProgressBar d;
    public long e;
    public long f;
    public long g;
    public final kac h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(Context context, ky1 ky1Var) {
        super(context, R.style.NimbusContainer);
        context.getClass();
        this.a = ky1Var;
        this.h = new kac(this, 2);
    }

    public final void a() {
        setCancelable(true);
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    @Override // defpackage.nf
    public final void onAdEvent(zf zfVar) {
        zfVar.getClass();
        zf zfVar2 = zf.j;
        ky1 ky1Var = this.a;
        if (zfVar != zfVar2) {
            ky1Var.b(zfVar);
        }
        int ordinal = zfVar.ordinal();
        if (ordinal == 0) {
            ProgressBar progressBar = this.d;
            if (progressBar == null) {
                return;
            }
            progressBar.setVisibility(8);
            return;
        }
        int i = 1;
        rq3 rq3Var = null;
        if (ordinal != 1) {
            if (ordinal != 8) {
                if (ordinal != 10) {
                    return;
                }
                ky1Var.a();
                return;
            } else {
                if (this.g <= 0) {
                    a();
                    return;
                }
                ad2 ad2Var = oc3.a;
                hs4 hs4Var = z45.a;
                xw3.L(ad2Var, rob.a, null, new mcd(this, rq3Var, i), 2);
                return;
            }
        }
        ProgressBar progressBar2 = this.d;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        if (this.f > 0 && "static".equals(ky1Var.f.type())) {
            xw3.L(oc3.a, null, null, new mcd(this, rq3Var, 0), 3);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            kac kacVar = this.h;
            imageView.removeCallbacks(kacVar);
            if (this.g == 0) {
                long j = this.e;
                if (j > 0) {
                    imageView.postDelayed(kacVar, j);
                }
            }
            if (imageView.getY() - imageView.getHeight() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || imageView.getX() - imageView.getWidth() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                imageView.postDelayed(new yp8(this, 22), 5000L);
            }
        }
    }

    @Override // defpackage.pyf
    public final void onAdRendered(of ofVar) {
        View f = ofVar.f();
        lcd lcdVar = f instanceof lcd ? (lcd) f : null;
        if (lcdVar != null) {
            lcdVar.setClickProtectionDisabled$render_release(true);
        }
        ky1 ky1Var = this.a;
        ofVar.k(ky1Var.h);
        ImageView imageView = (ImageView) findViewById(R.id.nimbus_mute);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            ofVar.e.add(imageView2);
        }
        ky1Var.i = ofVar;
        ofVar.d.add(this);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        this.f = 0L;
        ImageView imageView = this.c;
        rq3 rq3Var = null;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 48;
        }
        String str = gcd.a;
        Window window = getWindow();
        if (window != null) {
            window.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            bea.L(window, false);
            bal j = bsk.j(window.getDecorView());
            if (j != null) {
                j.b(true);
                j.c();
                j.a(519);
            }
        }
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.nimbus_ad_dialog, (ViewGroup) null));
        ImageView imageView2 = (ImageView) findViewById(R.id.nimbus_close);
        imageView2.setOnClickListener(new cd5(this, 24));
        imageView2.setContentDescription(imageView2.getContext().getString(R.string.nimbus_dismiss));
        if (this.e > 0 || this.g > 0) {
            imageView2.setVisibility(8);
        }
        ad2 ad2Var = oc3.a;
        yy2 yy2Var = new yy2(3);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(yy2Var);
        this.c = imageView2;
        this.d = (ProgressBar) findViewById(R.id.nimbus_loading_indicator);
        hcd hcdVar = this.a.f;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ad_frame);
        frameLayout.addOnLayoutChangeListener(this);
        fhh fhhVar = qyf.a;
        rik.t(hcdVar, frameLayout, this);
        this.b = frameLayout;
        ad2 ad2Var2 = oc3.a;
        hs4 hs4Var = z45.a;
        xw3.L(ad2Var2, rob.a, null, new mcd(this, rq3Var, 2), 2);
    }

    @Override // defpackage.pcd
    public final void onError(qcd qcdVar) {
        a();
        ky1 ky1Var = this.a;
        ky1Var.c(qcdVar);
        ky1Var.a();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View childAt;
        view.getClass();
        FrameLayout frameLayout = this.b;
        if (frameLayout == null || (childAt = frameLayout.getChildAt(0)) == null) {
            return;
        }
        try {
            p2g p2gVar = w2g.b;
            float min = Math.min(view.getWidth() / childAt.getWidth(), view.getHeight() / childAt.getHeight());
            Float valueOf = Float.valueOf(min);
            if (Float.isInfinite(min) || Float.isNaN(min)) {
                valueOf = null;
            }
            if (valueOf != null) {
                float floatValue = valueOf.floatValue();
                childAt.setScaleX(floatValue);
                childAt.setScaleY(floatValue);
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            p2g p2gVar2 = w2g.b;
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        ImageView imageView = this.c;
        if (imageView != null) {
            if (this.e <= 0 || imageView.getVisibility() == 0) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.postDelayed(this.h, this.e);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        this.a.a();
        super.onStop();
    }
}
