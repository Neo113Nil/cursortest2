package w9;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* renamed from: w9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC6731f extends zzb implements InterfaceC6732g {
    public static InterfaceC6732g c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof InterfaceC6732g ? (InterfaceC6732g) queryLocalInterface : new C6730e(iBinder);
    }
}
