package g6;

import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends com.google.android.gms.internal.measurement.x implements k0 {
    @Override // g6.k0
    public final int c() {
        Parcel f6 = f(O(), 2);
        int readInt = f6.readInt();
        f6.recycle();
        return readInt;
    }

    @Override // g6.k0
    public final t6.a d() {
        Parcel f6 = f(O(), 1);
        t6.a V = t6.b.V(f6.readStrongBinder());
        f6.recycle();
        return V;
    }
}
