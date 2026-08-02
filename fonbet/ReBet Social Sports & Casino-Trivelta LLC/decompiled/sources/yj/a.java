package yj;

import Qi.u;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import org.spongycastle.crypto.j;
import org.spongycastle.pqc.crypto.newhope.e;
import uj.InterfaceC6592a;

/* loaded from: classes5.dex */
public class a implements Key, PublicKey {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final e f68433a;

    public a(e eVar) {
        this.f68433a = eVar;
    }

    public j a() {
        return this.f68433a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        return Aj.a.a(this.f68433a.b(), ((a) obj).f68433a.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new u(new Qi.a(InterfaceC6592a.f66765v), this.f68433a.b()).a();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return Aj.a.q(this.f68433a.b());
    }
}
