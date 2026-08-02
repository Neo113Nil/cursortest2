package i6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import com.google.android.gms.common.Feature;
import e6.p;
import g6.f;
import g6.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends f {
    public final i B;

    public e(Context context, Looper looper, a0 a0Var, i iVar, p pVar, p pVar2) {
        super(context, looper, 270, a0Var, pVar, pVar2, 0);
        this.B = iVar;
    }

    @Override // g6.e, d6.c
    public final int a() {
        return 203400000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 3);
    }

    @Override // g6.e
    public final Feature[] h() {
        return h7.b.f10388c;
    }

    @Override // g6.e
    public final Bundle j() {
        i iVar = this.B;
        iVar.getClass();
        Bundle bundle = new Bundle();
        String str = iVar.f9850a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // g6.e
    public final boolean p() {
        return true;
    }
}
