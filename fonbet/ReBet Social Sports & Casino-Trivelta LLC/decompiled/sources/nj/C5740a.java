package nj;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.math.ec.g;

/* renamed from: nj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5740a implements AlgorithmParameterSpec {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.math.ec.d f58579a;

    /* renamed from: b, reason: collision with root package name */
    public g f58580b;

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f58581c;

    /* renamed from: d, reason: collision with root package name */
    public BigInteger f58582d;
    private byte[] seed;

    public C5740a(org.spongycastle.math.ec.d dVar, g gVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f58579a = dVar;
        this.f58580b = gVar.v();
        this.f58581c = bigInteger;
        this.f58582d = bigInteger2;
        this.seed = bArr;
    }

    public org.spongycastle.math.ec.d a() {
        return this.f58579a;
    }

    public g b() {
        return this.f58580b;
    }

    public BigInteger c() {
        return this.f58582d;
    }

    public BigInteger d() {
        return this.f58581c;
    }

    public byte[] e() {
        return this.seed;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5740a)) {
            return false;
        }
        C5740a c5740a = (C5740a) obj;
        return a().l(c5740a.a()) && b().d(c5740a.b());
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }
}
