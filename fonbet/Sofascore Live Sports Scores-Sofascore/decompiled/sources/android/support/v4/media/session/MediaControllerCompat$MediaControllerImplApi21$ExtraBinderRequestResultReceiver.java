package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.mok;
import defpackage.nm9;
import defpackage.om9;
import defpackage.z8e;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [om9] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        nm9 nm9Var;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = d.b;
            mok mokVar = null;
            if (binder == null) {
                nm9Var = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof om9)) {
                    nm9 nm9Var2 = new nm9();
                    nm9Var2.a = binder;
                    nm9Var = nm9Var2;
                } else {
                    nm9Var = (om9) queryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.a) {
                mediaSessionCompat$Token.c = nm9Var;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(z8e.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    mokVar = ((ParcelImpl) parcelable).a;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.a) {
                mediaSessionCompat$Token2.d = mokVar;
            }
            aVar.a();
        }
    }
}
