package androidx.recyclerview.widget;

import android.app.Service;
import android.content.Intent;
import java.util.List;
import s7.b3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2379a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2383e;

    public /* synthetic */ f(r7.a aVar, int i5, s7.n0 n0Var, Intent intent) {
        this.f2381c = aVar;
        this.f2380b = i5;
        this.f2382d = n0Var;
        this.f2383e = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2379a) {
            case 0:
                ((h) this.f2383e).f2404c.execute(new l(3, this, d.c(new e(this), true)));
                break;
            default:
                r7.a aVar = (r7.a) this.f2381c;
                s7.n0 n0Var = (s7.n0) this.f2382d;
                Intent intent = (Intent) this.f2383e;
                Service service = (Service) aVar.f22318b;
                b3 b3Var = (b3) service;
                int i5 = this.f2380b;
                if (b3Var.a(i5)) {
                    n0Var.f22910n.b(Integer.valueOf(i5), "Local AppMeasurementService processed last upload request. StartId");
                    s7.n0 n0Var2 = s7.f1.s(service, null, null).f22745f;
                    s7.f1.m(n0Var2);
                    n0Var2.f22910n.a("Completed wakeful intent.");
                    b3Var.b(intent);
                    break;
                }
                break;
        }
    }

    public f(h hVar, List list, List list2, int i5) {
        this.f2383e = hVar;
        this.f2381c = list;
        this.f2382d = list2;
        this.f2380b = i5;
    }
}
