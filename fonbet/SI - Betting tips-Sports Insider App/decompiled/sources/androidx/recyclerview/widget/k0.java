package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2454a;

    /* renamed from: b, reason: collision with root package name */
    public int f2455b;

    /* renamed from: c, reason: collision with root package name */
    public int f2456c;

    /* renamed from: d, reason: collision with root package name */
    public int f2457d;

    /* renamed from: e, reason: collision with root package name */
    public int f2458e;

    /* renamed from: f, reason: collision with root package name */
    public int f2459f;

    /* renamed from: g, reason: collision with root package name */
    public int f2460g;

    /* renamed from: h, reason: collision with root package name */
    public int f2461h;

    /* renamed from: i, reason: collision with root package name */
    public int f2462i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f2463k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2464l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f2463k.size();
        View view2 = null;
        int i5 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((d2) this.f2463k.get(i10)).itemView;
            l1 l1Var = (l1) view3.getLayoutParams();
            if (view3 != view && !l1Var.f2468a.isRemoved() && (layoutPosition = (l1Var.f2468a.getLayoutPosition() - this.f2457d) * this.f2458e) >= 0 && layoutPosition < i5) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i5 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f2457d = -1;
        } else {
            this.f2457d = ((l1) view2.getLayoutParams()).f2468a.getLayoutPosition();
        }
    }

    public final View b(s1 s1Var) {
        List list = this.f2463k;
        if (list == null) {
            View d10 = s1Var.d(this.f2457d);
            this.f2457d += this.f2458e;
            return d10;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = ((d2) this.f2463k.get(i5)).itemView;
            l1 l1Var = (l1) view.getLayoutParams();
            if (!l1Var.f2468a.isRemoved() && this.f2457d == l1Var.f2468a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
