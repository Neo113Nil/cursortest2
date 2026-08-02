package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bie extends fie {
    public final ejg e;
    public final ejg f;
    public final ejg g;
    public final ejg h;
    public final int i;

    public bie(ejg ejgVar, ejg ejgVar2, ejg ejgVar3, ejg ejgVar4, Provider provider, int i) {
        super(provider);
        this.e = ejgVar;
        this.f = ejgVar2;
        this.g = ejgVar3;
        this.h = ejgVar4;
        this.i = i;
    }

    @Override // defpackage.fie
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.s(sSLSocket, Boolean.TRUE);
            this.f.s(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        ejg ejgVar = this.h;
        if (ejgVar.k(cls) != null) {
            ejgVar.v(sSLSocket, fie.b(list));
        }
    }

    @Override // defpackage.fie
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        ejg ejgVar = this.g;
        if (ejgVar.k(cls) == null || (bArr = (byte[]) ejgVar.v(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, mik.b);
    }

    @Override // defpackage.fie
    public final int e() {
        return this.i;
    }
}
