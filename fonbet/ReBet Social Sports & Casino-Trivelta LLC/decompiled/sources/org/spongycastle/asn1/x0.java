package org.spongycastle.asn1;

import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class x0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f62283a;

    /* renamed from: b, reason: collision with root package name */
    public int f62284b;

    public x0(InputStream inputStream, int i10) {
        this.f62283a = inputStream;
        this.f62284b = i10;
    }

    public int d() {
        return this.f62284b;
    }

    public void k(boolean z10) {
        InputStream inputStream = this.f62283a;
        if (inputStream instanceof u0) {
            ((u0) inputStream).B(z10);
        }
    }
}
