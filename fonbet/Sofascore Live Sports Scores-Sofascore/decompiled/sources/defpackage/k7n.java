package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class k7n {
    protected transient int zza = 0;

    public final e8n a() {
        try {
            y9n y9nVar = (y9n) this;
            int e = y9nVar.e();
            e8n e8nVar = g8n.b;
            byte[] bArr = new byte[e];
            boolean z = r8n.b;
            n8n n8nVar = new n8n(bArr, e);
            y9nVar.d(n8nVar);
            if (n8nVar.u() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (n8nVar.u() >= 0) {
                return new e8n(bArr);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a ByteString threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public final byte[] b() {
        try {
            y9n y9nVar = (y9n) this;
            int e = y9nVar.e();
            byte[] bArr = new byte[e];
            boolean z = r8n.b;
            n8n n8nVar = new n8n(bArr, e);
            y9nVar.d(n8nVar);
            if (n8nVar.u() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (n8nVar.u() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            vp2.e(wt3.m("Serializing ", name, new StringBuilder(name.length() + 72), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    public int c(pcn pcnVar) {
        throw null;
    }
}
