package s7;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q2 extends com.google.android.gms.internal.measurement.y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f22967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(y2 y2Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f22967a = atomicReference;
    }

    @Override // s7.c0
    public final void H(List list) {
        AtomicReference atomicReference = this.f22967a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        H(createTypedArrayList);
        return true;
    }
}
