package com.plaid.internal;

/* loaded from: classes3.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39192a;

    /* renamed from: b, reason: collision with root package name */
    public final Exception f39193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39194c;

    public D0(String str, Exception exc, String str2) {
        this.f39192a = str;
        this.f39193b = exc;
        this.f39194c = str2;
    }

    public final String a() {
        return this.f39192a;
    }

    public final String toString() {
        return "DeviceDescriptor{ip='" + this.f39192a + "', mno='null', phoneNumber='null', preCheckError=" + this.f39193b + ", desc='" + this.f39194c + "'}";
    }
}
