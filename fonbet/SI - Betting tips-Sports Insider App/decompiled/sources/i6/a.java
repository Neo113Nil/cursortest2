package i6;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import g6.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends f {
    @Override // g6.e, d6.c
    public final int a() {
        return 253600000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 3);
    }

    @Override // g6.e
    public final Feature[] h() {
        return h7.b.f10388c;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // g6.e
    public final boolean p() {
        return true;
    }
}
