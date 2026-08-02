package s7;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f22825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f22826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f22827d;

    public /* synthetic */ j1(k1 k1Var, zzr zzrVar, Bundle bundle, int i5) {
        this.f22824a = i5;
        this.f22825b = zzrVar;
        this.f22826c = bundle;
        this.f22827d = k1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f22824a) {
            case 0:
                k1 k1Var = this.f22827d;
                k1Var.f22848a.B();
                return k1Var.f22848a.d0(this.f22826c, this.f22825b);
            default:
                k1 k1Var2 = this.f22827d;
                k1Var2.f22848a.B();
                return k1Var2.f22848a.d0(this.f22826c, this.f22825b);
        }
    }
}
