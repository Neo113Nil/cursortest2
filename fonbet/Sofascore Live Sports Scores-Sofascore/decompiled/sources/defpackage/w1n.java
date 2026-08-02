package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaba;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w1n extends e2n {
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1n(x1n x1nVar, zaba zabaVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabaVar);
        this.b = connectionProgressReportCallbacks;
    }

    @Override // defpackage.e2n
    public final void a() {
        this.b.a(new ConnectionResult(16, null, null));
    }
}
