package Xi;

import org.spongycastle.crypto.InterfaceC5950c;
import org.spongycastle.crypto.p;
import org.spongycastle.crypto.s;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5950c f13878a;

    /* renamed from: b, reason: collision with root package name */
    public s f13879b;

    public g(InterfaceC5950c interfaceC5950c, s sVar) {
        this.f13878a = interfaceC5950c;
        this.f13879b = sVar;
    }

    public p a() {
        return new p(this.f13878a.generateKeyPair(), this.f13879b);
    }
}
