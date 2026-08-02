package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class id {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static id f2476;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final hw f2478 = new hw();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ih f2477 = new ih();

    private id() {
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized id m7937() {
        id idVar;
        synchronized (id.class) {
            if (f2476 == null) {
                f2476 = new id();
            }
            idVar = f2476;
        }
        return idVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final hw m7940() {
        return this.f2478;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ih m7939() {
        return this.f2477;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized void m7938() {
        synchronized (id.class) {
            f2476 = null;
        }
    }
}
