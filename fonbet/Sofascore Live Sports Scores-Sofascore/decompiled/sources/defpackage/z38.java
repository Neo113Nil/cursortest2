package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z38 extends ka4 {
    public ImageView b;
    public final /* synthetic */ y0 c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener e;
    public final /* synthetic */ b48 f;

    public z38(b48 b48Var, y0 y0Var, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f = b48Var;
        this.c = y0Var;
        this.d = activity;
        this.e = onGlobalLayoutListener;
    }

    @Override // defpackage.ka4
    public final void a(Drawable drawable) {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        d();
    }

    @Override // defpackage.ka4
    public final void b(Drawable drawable) {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        new Exception("Image loading failed!");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.e;
        if (onGlobalLayoutListener != null) {
            this.c.h().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
        b48 b48Var = this.f;
        d4a d4aVar = b48Var.d;
        CountDownTimer countDownTimer = (CountDownTimer) d4aVar.b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            d4aVar.b = null;
        }
        d4a d4aVar2 = b48Var.e;
        CountDownTimer countDownTimer2 = (CountDownTimer) d4aVar2.b;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
            d4aVar2.b = null;
        }
        b48Var.j = null;
        b48Var.k = null;
    }

    @Override // defpackage.ka4
    public final void c(Object obj) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        d();
    }

    public final void d() {
        y0 y0Var = this.c;
        if (!y0Var.e().i.booleanValue()) {
            y0Var.i().setOnTouchListener(new y38(this, 0));
        }
        b48 b48Var = this.f;
        d4a d4aVar = b48Var.d;
        de0 de0Var = new de0(this, 21);
        d4aVar.getClass();
        d4aVar.b = new uyf(5000L, de0Var).start();
        if (y0Var.e().k.booleanValue()) {
            d4a d4aVar2 = b48Var.e;
            sz8 sz8Var = new sz8(this, 25);
            d4aVar2.getClass();
            d4aVar2.b = new uyf(20000L, sz8Var).start();
        }
        this.d.runOnUiThread(new b8(this, 15));
    }
}
