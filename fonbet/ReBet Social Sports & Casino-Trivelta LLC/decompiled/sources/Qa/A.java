package Qa;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class A extends p implements B {
    public static B c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof B ? (B) queryLocalInterface : new z(iBinder);
    }
}
