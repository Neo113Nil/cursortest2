package org.spongycastle.asn1;

import java.io.IOException;

/* renamed from: org.spongycastle.asn1.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5930h extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f62256a;

    public C5930h(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f62256a;
    }

    public C5930h(String str, Throwable th2) {
        super(str);
        this.f62256a = th2;
    }
}
