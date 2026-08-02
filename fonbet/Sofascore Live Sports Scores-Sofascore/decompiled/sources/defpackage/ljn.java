package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbez;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ljn implements ServiceConnection {
    public final mxn a;
    public final /* synthetic */ mjn b;

    public /* synthetic */ ljn(mjn mjnVar, mxn mxnVar) {
        Objects.requireNonNull(mjnVar);
        this.b = mjnVar;
        this.a = mxnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzbez zzbexVar;
        int i = zzbey.a;
        if (iBinder == null) {
            zzbexVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzbexVar = queryLocalInterface instanceof zzbez ? (zzbez) queryLocalInterface : new zzbex(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }
        mjn mjnVar = this.b;
        mjnVar.d = zzbexVar;
        mjnVar.a = 2;
        this.a.d(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        mjn mjnVar = this.b;
        mjnVar.d = null;
        mjnVar.a = 0;
    }
}
