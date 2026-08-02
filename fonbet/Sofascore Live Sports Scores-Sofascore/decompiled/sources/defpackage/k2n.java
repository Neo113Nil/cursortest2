package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zacl;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k2n implements BaseGmsClient.ConnectionProgressReportCallbacks, zacl {
    public final Api.Client a;
    public final ApiKey b;
    public IAccountAccessor c;
    public Set d;
    public boolean e;
    public final /* synthetic */ GoogleApiManager f;

    public k2n(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        Objects.requireNonNull(googleApiManager);
        this.f = googleApiManager;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = client;
        this.b = apiKey;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        this.f.n.post(new j2n(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        zabk zabkVar = (zabk) this.f.j.get(this.b);
        if (zabkVar != null) {
            zabkVar.k(connectionResult);
        }
    }
}
