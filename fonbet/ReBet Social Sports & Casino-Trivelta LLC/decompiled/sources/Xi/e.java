package Xi;

import java.math.BigInteger;
import org.spongycastle.crypto.C5949b;
import org.spongycastle.crypto.InterfaceC5950c;
import org.spongycastle.crypto.params.C5978e;
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.crypto.t;

/* loaded from: classes5.dex */
public class e implements InterfaceC5950c {

    /* renamed from: g, reason: collision with root package name */
    public C5978e f13875g;

    public void a(t tVar) {
        this.f13875g = (C5978e) tVar;
    }

    @Override // org.spongycastle.crypto.InterfaceC5950c
    public C5949b generateKeyPair() {
        d dVar = d.f13872a;
        C5980g c10 = this.f13875g.c();
        BigInteger a10 = dVar.a(c10, this.f13875g.a());
        return new C5949b(new org.spongycastle.crypto.params.i(dVar.b(c10, a10), c10), new org.spongycastle.crypto.params.h(a10, c10));
    }
}
