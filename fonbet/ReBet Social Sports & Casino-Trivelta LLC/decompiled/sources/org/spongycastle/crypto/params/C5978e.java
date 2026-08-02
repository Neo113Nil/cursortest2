package org.spongycastle.crypto.params;

import java.security.SecureRandom;

/* renamed from: org.spongycastle.crypto.params.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5978e extends org.spongycastle.crypto.t {

    /* renamed from: c, reason: collision with root package name */
    public C5980g f62649c;

    public C5978e(SecureRandom secureRandom, C5980g c5980g) {
        super(secureRandom, d(c5980g));
        this.f62649c = c5980g;
    }

    public static int d(C5980g c5980g) {
        return c5980g.c() != 0 ? c5980g.c() : c5980g.e().bitLength();
    }

    public C5980g c() {
        return this.f62649c;
    }
}
