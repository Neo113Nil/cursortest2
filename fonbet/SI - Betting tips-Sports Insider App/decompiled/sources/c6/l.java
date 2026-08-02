package c6;

import android.os.Parcel;
import android.os.RemoteException;
import g6.k0;
import g6.v;
import io.sentry.android.core.w0;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l extends com.google.android.gms.internal.play_billing.e implements k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f3676g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f3677f;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 5);
        v.b(bArr.length == 25);
        this.f3677f = Arrays.hashCode(bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean S(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            t6.a d10 = d();
            parcel2.writeNoException();
            j7.g.b(parcel2, d10);
            return true;
        }
        if (i5 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f3677f);
        return true;
    }

    public abstract byte[] V();

    @Override // g6.k0
    public final int c() {
        return this.f3677f;
    }

    @Override // g6.k0
    public final t6.a d() {
        return new t6.b(V());
    }

    public final boolean equals(Object obj) {
        t6.a d10;
        if (obj instanceof k0) {
            try {
                k0 k0Var = (k0) obj;
                if (k0Var.c() == this.f3677f && (d10 = k0Var.d()) != null) {
                    return Arrays.equals(V(), (byte[]) t6.b.W(d10));
                }
            } catch (RemoteException e7) {
                w0.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3677f;
    }
}
