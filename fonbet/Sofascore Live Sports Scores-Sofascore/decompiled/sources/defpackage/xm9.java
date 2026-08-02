package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xm9 extends Binder implements ym9 {
    public static ym9 J(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof ym9)) {
            return (ym9) queryLocalInterface;
        }
        wm9 wm9Var = new wm9();
        wm9Var.a = iBinder;
        return wm9Var;
    }
}
