package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n extends m {

    /* renamed from: c, reason: collision with root package name */
    public BigInteger f62669c;

    public n(BigInteger bigInteger, k kVar) {
        super(true, kVar);
        this.f62669c = bigInteger;
    }

    public BigInteger c() {
        return this.f62669c;
    }
}
