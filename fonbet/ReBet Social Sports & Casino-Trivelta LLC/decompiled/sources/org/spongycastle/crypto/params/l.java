package org.spongycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class l extends org.spongycastle.crypto.t {

    /* renamed from: c, reason: collision with root package name */
    public k f62667c;

    public l(k kVar, SecureRandom secureRandom) {
        super(secureRandom, kVar.d().bitLength());
        this.f62667c = kVar;
    }

    public k c() {
        return this.f62667c;
    }
}
