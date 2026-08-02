package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class ij<T> {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ig f2521;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2522;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ib f2519 = new ib();

    /* renamed from: ｋ, reason: contains not printable characters */
    private Set<Object> f2520 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Set<T> f2518 = new HashSet();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Set<Cif> f2517 = new HashSet();

    public ij(ig igVar) {
        this.f2521 = igVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ig m8054() {
        return this.f2521;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ib m8057() {
        return this.f2519;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Set<Object> m8056() {
        return this.f2520;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m8058() {
        return this.f2522;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ij m8059() {
        this.f2522 = true;
        return this;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m8060(T t) {
        this.f2518.add(t);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Set<T> m8053() {
        return this.f2518;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m8055(Cif cif) {
        this.f2517.add(cif);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Set<Cif> m8052() {
        return this.f2517;
    }
}
