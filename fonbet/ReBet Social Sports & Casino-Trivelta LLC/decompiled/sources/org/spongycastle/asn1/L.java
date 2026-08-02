package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class L implements InterfaceC5927e, t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f62230a;

    /* renamed from: b, reason: collision with root package name */
    public int f62231b;

    /* renamed from: c, reason: collision with root package name */
    public C5945x f62232c;

    public L(boolean z10, int i10, C5945x c5945x) {
        this.f62230a = z10;
        this.f62231b = i10;
        this.f62232c = c5945x;
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return this.f62232c.c(this.f62230a, this.f62231b);
    }

    @Override // org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e10) {
            throw new r(e10.getMessage());
        }
    }
}
