package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u6e extends RecyclerView.OnScrollListener {
    public final p6e a;
    public final int b;
    public final boolean c;
    public final ct8 d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;

    public u6e(p6e p6eVar, boolean z, ct8 ct8Var) {
        p6eVar.getClass();
        this.a = p6eVar;
        this.b = 30;
        this.c = z;
        this.d = ct8Var;
        this.g = 1;
        this.h = 1;
    }

    public static void b(u6e u6eVar) {
        u6eVar.e = false;
        u6eVar.f = false;
        u6eVar.g = 1;
        u6eVar.h = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        n layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()) : null;
        n layoutManager2 = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
        Integer valueOf2 = linearLayoutManager2 != null ? Integer.valueOf(linearLayoutManager2.findFirstVisibleItemPosition()) : null;
        boolean z = this.c;
        ct8 ct8Var = this.d;
        final int i3 = 0;
        int i4 = this.b;
        if (valueOf != null && valueOf.intValue() >= 0) {
            if ((i4 / 2) + valueOf.intValue() > ((g7) this.a).getItemCount() && this.f) {
                this.f = false;
                recyclerView.post(new Runnable(this) { // from class: r6e
                    public final /* synthetic */ u6e b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        u6e u6eVar = this.b;
                        switch (i5) {
                            case 0:
                                u6eVar.a.m();
                                break;
                            default:
                                u6eVar.a.n();
                                break;
                        }
                    }
                });
                ct8Var.invoke(Integer.valueOf(this.h), z ? t6e.b : t6e.a, new s6e(this, 0));
            }
        }
        if (valueOf2 == null || valueOf2.intValue() >= i4 / 2 || !this.e) {
            return;
        }
        this.e = false;
        final int i5 = 1;
        recyclerView.post(new Runnable(this) { // from class: r6e
            public final /* synthetic */ u6e b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i52 = i5;
                u6e u6eVar = this.b;
                switch (i52) {
                    case 0:
                        u6eVar.a.m();
                        break;
                    default:
                        u6eVar.a.n();
                        break;
                }
            }
        });
        ct8Var.invoke(Integer.valueOf(this.g), z ? t6e.a : t6e.b, new s6e(this, 1));
    }
}
