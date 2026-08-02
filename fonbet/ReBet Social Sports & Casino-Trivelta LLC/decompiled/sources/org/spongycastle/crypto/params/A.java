package org.spongycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class A implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public SecureRandom f62630a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.j f62631b;

    public A(org.spongycastle.crypto.j jVar, SecureRandom secureRandom) {
        this.f62630a = secureRandom;
        this.f62631b = jVar;
    }

    public org.spongycastle.crypto.j a() {
        return this.f62631b;
    }

    public SecureRandom b() {
        return this.f62630a;
    }
}
