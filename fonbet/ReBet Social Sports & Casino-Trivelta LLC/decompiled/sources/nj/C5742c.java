package nj;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: nj.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5742c implements AlgorithmParameterSpec {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f58583a;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f58584b;

    public C5742c(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f58583a = bigInteger;
        this.f58584b = bigInteger2;
    }

    public BigInteger a() {
        return this.f58584b;
    }

    public BigInteger b() {
        return this.f58583a;
    }
}
