package defpackage;

import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h2n implements BaseGmsClient.SignOutCallbacks {
    public final /* synthetic */ zabk a;

    public h2n(zabk zabkVar) {
        this.a = zabkVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void a() {
        this.a.m.n.post(new g2n(this));
    }
}
