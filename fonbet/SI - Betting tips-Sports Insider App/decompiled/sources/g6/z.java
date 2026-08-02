package g6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public e f9878f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9879g;

    public z(e eVar, int i5) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 5);
        this.f9878f = eVar;
        this.f9879g = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean S(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) j7.g.a(parcel, Bundle.CREATOR);
            j7.g.c(parcel);
            v.i(this.f9878f, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.f9878f;
            int i10 = this.f9879g;
            eVar.getClass();
            b0 b0Var = new b0(eVar, readInt, readStrongBinder, bundle);
            y yVar = eVar.f9809f;
            yVar.sendMessage(yVar.obtainMessage(1, i10, -1, b0Var));
            this.f9878f = null;
        } else if (i5 == 2) {
            parcel.readInt();
            j7.g.c(parcel);
            w0.o("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i5 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) j7.g.a(parcel, zzj.CREATOR);
            j7.g.c(parcel);
            e eVar2 = this.f9878f;
            v.i(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            v.h(zzjVar);
            eVar2.f9824w = zzjVar;
            if (eVar2.t()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f4556d;
                h b10 = h.b();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f4497a;
                synchronized (b10) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = h.f9845c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) b10.f9846a;
                        if (rootTelemetryConfiguration2 != null) {
                            if (rootTelemetryConfiguration2.f4527a < rootTelemetryConfiguration.f4527a) {
                            }
                        }
                    }
                    b10.f9846a = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzjVar.f4553a;
            v.i(this.f9878f, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.f9878f;
            int i11 = this.f9879g;
            eVar3.getClass();
            b0 b0Var2 = new b0(eVar3, readInt2, readStrongBinder2, bundle2);
            y yVar2 = eVar3.f9809f;
            yVar2.sendMessage(yVar2.obtainMessage(1, i11, -1, b0Var2));
            this.f9878f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
