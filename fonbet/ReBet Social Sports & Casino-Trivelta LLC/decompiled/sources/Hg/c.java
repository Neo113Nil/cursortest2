package Hg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class c extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4920c = "c";

    /* renamed from: a, reason: collision with root package name */
    public b f4921a;

    /* renamed from: b, reason: collision with root package name */
    public int f4922b;

    public c(Context context) {
        super(context);
        this.f4921a = new f();
        a(null, 0);
    }

    @NonNull
    private a getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new k() : new l(getContext());
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.BlurView, i10, 0);
        this.f4922b = obtainStyledAttributes.getColor(h.f4935a, 0);
        obtainStyledAttributes.recycle();
    }

    public e b(boolean z10) {
        return this.f4921a.c(z10);
    }

    public e c(boolean z10) {
        return this.f4921a.b(z10);
    }

    public e d(float f10) {
        return this.f4921a.g(f10);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f4921a.f(canvas)) {
            super.draw(canvas);
        }
    }

    public e e(int i10) {
        this.f4922b = i10;
        return this.f4921a.a(i10);
    }

    public e f(ViewGroup viewGroup) {
        return g(viewGroup, getBlurAlgorithm());
    }

    public e g(ViewGroup viewGroup, a aVar) {
        this.f4921a.destroy();
        g gVar = new g(this, viewGroup, this.f4922b, aVar);
        this.f4921a = gVar;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f4921a.c(true);
        } else {
            Log.e(f4920c, "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4921a.c(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f4921a.e();
    }
}
