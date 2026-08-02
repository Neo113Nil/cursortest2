package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xk3 implements ev4 {
    @Override // defpackage.ev4
    public final boolean a(SSLSocket sSLSocket) {
        return zk3.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.ev4
    public final poh d(SSLSocket sSLSocket) {
        return new zk3();
    }
}
