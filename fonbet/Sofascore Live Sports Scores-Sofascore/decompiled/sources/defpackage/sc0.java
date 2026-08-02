package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sc0 extends t6a {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WeakReference f;
    public final /* synthetic */ xc0 g;

    public sc0(xc0 xc0Var, int i, int i2, WeakReference weakReference) {
        this.g = xc0Var;
        this.d = i;
        this.e = i2;
        this.f = weakReference;
    }

    @Override // defpackage.t6a
    public final void C(Typeface typeface) {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.d) != -1) {
            typeface = wc0.a(typeface, i, (this.e & 2) != 0);
        }
        xc0 xc0Var = this.g;
        if (xc0Var.m) {
            xc0Var.l = typeface;
            TextView textView = (TextView) this.f.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i3 = xc0Var.j;
                if (isAttachedToWindow) {
                    textView.post(new tc0(textView, typeface, i3, i2));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }

    @Override // defpackage.t6a
    public final void B(int i) {
    }
}
