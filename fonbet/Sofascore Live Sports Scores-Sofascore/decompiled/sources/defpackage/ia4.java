package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import com.inmobi.media.C3321bj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ia4 extends Binder implements em9 {
    public final Handler a;
    public final /* synthetic */ C3321bj b;

    public ia4(C3321bj c3321bj) {
        this.b = c3321bj;
        attachInterface(this, em9.s7);
        this.a = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = em9.s7;
        final int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        Object[] objArr = 0;
        final C3321bj c3321bj = this.b;
        Handler handler = this.a;
        if (i == 2) {
            final boolean z = parcel.readInt() != 0;
            final Bundle bundle = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
            handler.post(new Runnable() { // from class: ha4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            c3321bj.onSessionEnded(z, bundle);
                            break;
                        default:
                            c3321bj.onVerticalScrollEvent(z, bundle);
                            break;
                    }
                }
            });
            return true;
        }
        int i4 = 3;
        if (i == 3) {
            handler.post(new uu1(c3321bj, parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), i4));
            return true;
        }
        if (i != 4) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        final boolean z2 = parcel.readInt() != 0;
        final Bundle bundle2 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
        final Object[] objArr2 = objArr == true ? 1 : 0;
        handler.post(new Runnable() { // from class: ha4
            @Override // java.lang.Runnable
            public final void run() {
                switch (objArr2) {
                    case 0:
                        c3321bj.onSessionEnded(z2, bundle2);
                        break;
                    default:
                        c3321bj.onVerticalScrollEvent(z2, bundle2);
                        break;
                }
            }
        });
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
