package s7;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f23058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23059c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2 f23060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f23061e;

    public /* synthetic */ s2(y2 y2Var, zzr zzrVar, boolean z5, AbstractSafeParcelable abstractSafeParcelable, int i5) {
        this.f23057a = i5;
        this.f23058b = zzrVar;
        this.f23059c = z5;
        this.f23061e = abstractSafeParcelable;
        this.f23060d = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23057a) {
            case 0:
                y2 y2Var = this.f23060d;
                a0 a0Var = y2Var.f23257d;
                if (a0Var != null) {
                    y2Var.B(a0Var, this.f23059c ? null : (zzpl) this.f23061e, this.f23058b);
                    y2Var.w();
                    break;
                } else {
                    n0 n0Var = ((f1) y2Var.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.a("Discarding data. Failed to set user property");
                    break;
                }
            case 1:
                y2 y2Var2 = this.f23060d;
                a0 a0Var2 = y2Var2.f23257d;
                if (a0Var2 != null) {
                    y2Var2.B(a0Var2, this.f23059c ? null : (zzbg) this.f23061e, this.f23058b);
                    y2Var2.w();
                    break;
                } else {
                    n0 n0Var2 = ((f1) y2Var2.f3328a).f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.a("Discarding data. Failed to send event to service");
                    break;
                }
            default:
                y2 y2Var3 = this.f23060d;
                a0 a0Var3 = y2Var3.f23257d;
                if (a0Var3 != null) {
                    y2Var3.B(a0Var3, this.f23059c ? null : (zzah) this.f23061e, this.f23058b);
                    y2Var3.w();
                    break;
                } else {
                    n0 n0Var3 = ((f1) y2Var3.f3328a).f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.a("Discarding data. Failed to send conditional user property to service");
                    break;
                }
        }
    }

    public s2(y2 y2Var, zzr zzrVar, boolean z5, zzah zzahVar) {
        this.f23057a = 2;
        this.f23058b = zzrVar;
        this.f23059c = z5;
        this.f23061e = zzahVar;
        Objects.requireNonNull(y2Var);
        this.f23060d = y2Var;
    }
}
