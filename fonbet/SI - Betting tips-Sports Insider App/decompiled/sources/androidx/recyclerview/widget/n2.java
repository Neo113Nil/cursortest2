package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2486a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f2487b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2488c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f2489d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2491f;

    public n2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i5) {
        this.f2491f = staggeredGridLayoutManager;
        this.f2490e = i5;
    }

    public final void a() {
        View view = (View) this.f2486a.get(r0.size() - 1);
        j2 j2Var = (j2) view.getLayoutParams();
        this.f2488c = this.f2491f.f2285c.b(view);
        j2Var.getClass();
    }

    public final void b() {
        this.f2486a.clear();
        this.f2487b = Integer.MIN_VALUE;
        this.f2488c = Integer.MIN_VALUE;
        this.f2489d = 0;
    }

    public final int c() {
        return this.f2491f.f2290h ? e(r1.size() - 1, -1) : e(0, this.f2486a.size());
    }

    public final int d() {
        return this.f2491f.f2290h ? e(0, this.f2486a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i5, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2491f;
        int k6 = staggeredGridLayoutManager.f2285c.k();
        int g10 = staggeredGridLayoutManager.f2285c.g();
        int i11 = i10 > i5 ? 1 : -1;
        while (i5 != i10) {
            View view = (View) this.f2486a.get(i5);
            int e7 = staggeredGridLayoutManager.f2285c.e(view);
            int b10 = staggeredGridLayoutManager.f2285c.b(view);
            boolean z5 = e7 <= g10;
            boolean z7 = b10 >= k6;
            if (z5 && z7 && (e7 < k6 || b10 > g10)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i5 += i11;
        }
        return -1;
    }

    public final int f(int i5) {
        int i10 = this.f2488c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f2486a.size() == 0) {
            return i5;
        }
        a();
        return this.f2488c;
    }

    public final View g(int i5, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f2491f;
        ArrayList arrayList = this.f2486a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2290h && staggeredGridLayoutManager.getPosition(view2) >= i5) || ((!staggeredGridLayoutManager.f2290h && staggeredGridLayoutManager.getPosition(view2) <= i5) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f2290h && staggeredGridLayoutManager.getPosition(view3) <= i5) || ((!staggeredGridLayoutManager.f2290h && staggeredGridLayoutManager.getPosition(view3) >= i5) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public final int h(int i5) {
        int i10 = this.f2487b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        ArrayList arrayList = this.f2486a;
        if (arrayList.size() == 0) {
            return i5;
        }
        View view = (View) arrayList.get(0);
        j2 j2Var = (j2) view.getLayoutParams();
        this.f2487b = this.f2491f.f2285c.e(view);
        j2Var.getClass();
        return this.f2487b;
    }
}
