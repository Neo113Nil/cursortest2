package Ti;

import java.math.BigInteger;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.crypto.params.h;
import org.spongycastle.crypto.params.i;

/* loaded from: classes5.dex */
public class a implements org.spongycastle.crypto.d {

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f11990c = BigInteger.valueOf(1);

    /* renamed from: a, reason: collision with root package name */
    public h f11991a;

    /* renamed from: b, reason: collision with root package name */
    public C5980g f11992b;

    @Override // org.spongycastle.crypto.d
    public void a(j jVar) {
        AbstractC5975b abstractC5975b = jVar instanceof A ? (AbstractC5975b) ((A) jVar).a() : (AbstractC5975b) jVar;
        if (!(abstractC5975b instanceof h)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        h hVar = (h) abstractC5975b;
        this.f11991a = hVar;
        this.f11992b = hVar.b();
    }

    @Override // org.spongycastle.crypto.d
    public BigInteger b(j jVar) {
        i iVar = (i) jVar;
        if (!iVar.b().equals(this.f11992b)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger modPow = iVar.c().modPow(this.f11991a.c(), this.f11992b.e());
        if (modPow.compareTo(f11990c) != 0) {
            return modPow;
        }
        throw new IllegalStateException("Shared key can't be 1");
    }

    @Override // org.spongycastle.crypto.d
    public int getFieldSize() {
        return (this.f11991a.b().e().bitLength() + 7) / 8;
    }
}
