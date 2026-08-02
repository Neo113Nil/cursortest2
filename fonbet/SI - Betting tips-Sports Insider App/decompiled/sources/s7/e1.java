package s7;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.n0 f22694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f22695c;

    public /* synthetic */ e1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, int i5) {
        this.f22693a = i5;
        this.f22694b = n0Var;
        this.f22695c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22693a) {
            case 0:
                y2 p10 = this.f22695c.f5780a.p();
                com.google.android.gms.internal.measurement.n0 n0Var = this.f22694b;
                p10.j();
                p10.k();
                p10.x(new b6.i((Object) p10, (AbstractSafeParcelable) p10.z(false), (Object) n0Var, 14));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f22695c;
                v3 v3Var = appMeasurementDynamiteService.f5780a.f22748i;
                f1.k(v3Var);
                f1 f1Var = appMeasurementDynamiteService.f5780a;
                v3Var.X(this.f22694b, f1Var.f22762y != null && f1Var.f22762y.booleanValue());
                break;
        }
    }
}
