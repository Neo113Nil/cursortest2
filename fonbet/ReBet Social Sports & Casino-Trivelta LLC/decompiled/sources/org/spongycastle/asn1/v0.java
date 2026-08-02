package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class v0 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public C5932j f62278a;

    /* renamed from: b, reason: collision with root package name */
    public Object f62279b = a();

    public v0(byte[] bArr) {
        this.f62278a = new C5932j(bArr, true);
    }

    public final Object a() {
        try {
            return this.f62278a.D0();
        } catch (IOException e10) {
            throw new r("malformed DER construction: " + e10, e10);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f62279b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f62279b;
        this.f62279b = a();
        return obj;
    }
}
