package com.plaid.internal;

/* renamed from: com.plaid.internal.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3642h1 implements InterfaceC3633g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f40642a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40643b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40644c;

    public C3642h1(long j10, String str, String str2) {
        this.f40642a = str;
        this.f40643b = j10;
        this.f40644c = str2;
    }

    @Override // com.plaid.internal.InterfaceC3633g1
    public final String a(InterfaceC3731r1 interfaceC3731r1, C3712p c3712p) {
        c3712p.f40927d = "test";
        c3712p.f40928e = this.f40644c;
        long j10 = this.f40643b;
        if (j10 > 0) {
            try {
                Thread.sleep(j10);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f40642a;
    }
}
