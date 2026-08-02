package Qa;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class v extends p implements w {
    public static w c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new u(iBinder);
    }
}
