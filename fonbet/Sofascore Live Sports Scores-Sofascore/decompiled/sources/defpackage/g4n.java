package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class g4n extends zzc {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ BaseGmsClient f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4n(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient);
        this.f = baseGmsClient;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final void a(Object obj) {
        BaseGmsClient baseGmsClient = this.f;
        int i = this.d;
        if (i != 0) {
            baseGmsClient.s(1, null);
            Bundle bundle = this.e;
            c(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null, null));
        } else {
            if (b()) {
                return;
            }
            baseGmsClient.s(1, null);
            c(new ConnectionResult(8, null, null));
        }
    }

    public abstract boolean b();

    public abstract void c(ConnectionResult connectionResult);
}
