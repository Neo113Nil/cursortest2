package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a58 implements xff {
    public final /* synthetic */ int a;

    public /* synthetic */ a58(ujg ujgVar, int i) {
        this.a = i;
    }

    @Override // defpackage.yff
    public final Object get() {
        switch (this.a) {
            case 0:
                oi3 e = oi3.e();
                w3a.q(e);
                return e;
            case 1:
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                w3a.q(remoteConfigManager);
                return remoteConfigManager;
            default:
                SessionManager sessionManager = SessionManager.getInstance();
                w3a.q(sessionManager);
                return sessionManager;
        }
    }
}
