package s7;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r2 extends com.google.android.gms.internal.measurement.y implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f22985a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2 f22986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(y2 y2Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f22985a = atomicReference;
        this.f22986f = y2Var;
    }

    @Override // s7.e0
    public final void E(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f22985a;
        synchronized (atomicReference) {
            n0 n0Var = ((f1) this.f22986f.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22910n.b(Integer.valueOf(zzoqVar.f5812a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.z.a(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        E(zzoqVar);
        return true;
    }
}
