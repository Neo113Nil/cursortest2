package defpackage;

import android.view.View;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.u;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c8b {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((u) this.k.get(i2)).itemView;
            hrf hrfVar = (hrf) view3.getLayoutParams();
            if (view3 != view && !hrfVar.a.isRemoved() && (layoutPosition = (hrfVar.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((hrf) view2.getLayoutParams()).a.getLayoutPosition();
        }
    }

    public final View b(o oVar) {
        List list = this.k;
        if (list == null) {
            View d = oVar.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((u) this.k.get(i)).itemView;
            hrf hrfVar = (hrf) view.getLayoutParams();
            if (!hrfVar.a.isRemoved() && this.d == hrfVar.a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
