package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i03 implements View.OnClickListener {
    public et5 a;
    public WeakReference b;
    public WeakReference c;
    public View.OnClickListener d;
    public boolean e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                view.getClass();
                View.OnClickListener onClickListener = this.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.c.get();
                View view3 = (View) this.b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                k03.p(this.a, view2, view3);
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }
}
