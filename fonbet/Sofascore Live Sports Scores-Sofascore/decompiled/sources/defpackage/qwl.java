package defpackage;

import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qwl implements q7a {
    public static d2g a(epf epfVar, int i) {
        try {
            return epfVar.b(epfVar.e);
        } catch (Exception e) {
            if (i >= 3 || !((e instanceof ConnectException) || (e instanceof UnknownHostException) || (e instanceof SocketTimeoutException) || (e instanceof SocketException) || (e instanceof sgi))) {
                throw e;
            }
            Thread.sleep((long) (Math.pow(2.0d, Math.max(0, i - 1)) * 2000.0d));
            return a(epfVar, i + 1);
        }
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        return a((epf) p7aVar, 1);
    }
}
