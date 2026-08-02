package org.spongycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public SecureRandom f62680a;

    /* renamed from: b, reason: collision with root package name */
    public int f62681b;

    public t(SecureRandom secureRandom, int i10) {
        this.f62680a = secureRandom;
        this.f62681b = i10;
    }

    public SecureRandom a() {
        return this.f62680a;
    }

    public int b() {
        return this.f62681b;
    }
}
