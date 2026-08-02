package androidx.recyclerview.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import xsna.g5g;
import xsna.r8a0;
import xsna.s3q0;

/* compiled from: ViewPoolProvider.kt */
/* loaded from: classes12.dex */
public interface s0 {

    /* compiled from: ViewPoolProvider.kt */
    public static final class a {
        public static s3q0 a(s0 s0Var, Activity activity) {
            k0 o = s0Var.o();
            if (o == null) {
                o = null;
            }
            if (o == null) {
                return null;
            }
            Activity a = k0.a(activity);
            if (a != null) {
                int size = o.mScrap.size();
                for (int i = 0; i < size; i++) {
                    g5g.D(o.mScrap.valueAt(i).a, true, new r8a0(o, a));
                }
            }
            return s3q0.a;
        }
    }

    void j();

    void k();

    s3q0 l(Activity activity);

    void m();

    RecyclerView.e0 n(int i);

    k0 o();

    LayoutInflater p();

    void q(int i);

    void r();
}
