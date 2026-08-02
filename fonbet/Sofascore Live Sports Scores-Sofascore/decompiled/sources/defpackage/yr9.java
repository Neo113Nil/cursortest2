package defpackage;

import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yr9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ fsf d;

    public /* synthetic */ yr9(ImageView imageView, ImageView imageView2, fsf fsfVar, int i) {
        this.a = i;
        this.b = imageView;
        this.c = imageView2;
        this.d = fsfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        g6b lifecycle;
        g6b lifecycle2;
        int i = this.a;
        fsf fsfVar = this.d;
        ImageView imageView = this.c;
        ImageView imageView2 = this.b;
        view.getClass();
        switch (i) {
            case 0:
                imageView2.removeOnAttachStateChangeListener(this);
                imageView.getClass();
                u6b w = qha.w(imageView);
                if (w != null && (lifecycle = w.getLifecycle()) != null) {
                    lifecycle.a(new zr9(lifecycle, fsfVar, 0));
                    break;
                }
                break;
            default:
                imageView2.removeOnAttachStateChangeListener(this);
                u6b w2 = qha.w(imageView);
                if (w2 != null && (lifecycle2 = w2.getLifecycle()) != null) {
                    lifecycle2.a(new zr9(lifecycle2, fsfVar, 1));
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        view.getClass();
    }
}
