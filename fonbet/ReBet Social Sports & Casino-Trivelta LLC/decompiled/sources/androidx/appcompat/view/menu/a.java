package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public Context f16635a;

    /* renamed from: b, reason: collision with root package name */
    public Context f16636b;

    /* renamed from: c, reason: collision with root package name */
    public e f16637c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f16638d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f16639e;

    /* renamed from: f, reason: collision with root package name */
    public i.a f16640f;

    /* renamed from: g, reason: collision with root package name */
    public int f16641g;

    /* renamed from: h, reason: collision with root package name */
    public int f16642h;

    /* renamed from: i, reason: collision with root package name */
    public j f16643i;

    /* renamed from: j, reason: collision with root package name */
    public int f16644j;

    public a(Context context, int i10, int i11) {
        this.f16635a = context;
        this.f16638d = LayoutInflater.from(context);
        this.f16641g = i10;
        this.f16642h = i11;
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(e eVar, boolean z10) {
        i.a aVar = this.f16640f;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean b(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(i.a aVar) {
        this.f16640f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        i.a aVar = this.f16640f;
        l lVar2 = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            lVar2 = this.f16637c;
        }
        return aVar.b(lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void g(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f16643i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f16637c;
        int i10 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList G10 = this.f16637c.G();
            int size = G10.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) G10.get(i12);
                if (s(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View p10 = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        p10.setPressed(false);
                        p10.jumpDrawablesToCurrentState();
                    }
                    if (p10 != childAt) {
                        k(p10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.f16644j;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, e eVar) {
        this.f16636b = context;
        this.f16639e = LayoutInflater.from(context);
        this.f16637c = eVar;
    }

    public void k(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f16643i).addView(view, i10);
    }

    public abstract void l(g gVar, j.a aVar);

    public j.a m(ViewGroup viewGroup) {
        return (j.a) this.f16638d.inflate(this.f16642h, viewGroup, false);
    }

    public boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public i.a o() {
        return this.f16640f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(g gVar, View view, ViewGroup viewGroup) {
        j.a m10 = view instanceof j.a ? (j.a) view : m(viewGroup);
        l(gVar, m10);
        return (View) m10;
    }

    public j q(ViewGroup viewGroup) {
        if (this.f16643i == null) {
            j jVar = (j) this.f16638d.inflate(this.f16641g, viewGroup, false);
            this.f16643i = jVar;
            jVar.a(this.f16637c);
            g(true);
        }
        return this.f16643i;
    }

    public void r(int i10) {
        this.f16644j = i10;
    }

    public abstract boolean s(int i10, g gVar);
}
