package org.spongycastle.asn1;

import java.io.IOException;

/* renamed from: org.spongycastle.asn1.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5947z extends AbstractC5940s implements InterfaceC5927e, t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f62287a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62288b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62289c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC5927e f62290d;

    public AbstractC5947z(boolean z10, int i10, InterfaceC5927e interfaceC5927e) {
        this.f62289c = true;
        this.f62290d = null;
        if (interfaceC5927e instanceof InterfaceC5926d) {
            this.f62289c = true;
        } else {
            this.f62289c = z10;
        }
        this.f62287a = i10;
        if (this.f62289c) {
            this.f62290d = interfaceC5927e;
        } else {
            interfaceC5927e.toASN1Primitive();
            this.f62290d = interfaceC5927e;
        }
    }

    public static AbstractC5947z k(Object obj) {
        if (obj == null || (obj instanceof AbstractC5947z)) {
            return (AbstractC5947z) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return k(AbstractC5940s.g((byte[]) obj));
        } catch (IOException e10) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e10.getMessage());
        }
    }

    public static AbstractC5947z l(AbstractC5947z abstractC5947z, boolean z10) {
        if (z10) {
            return (AbstractC5947z) abstractC5947z.m();
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (!(abstractC5940s instanceof AbstractC5947z)) {
            return false;
        }
        AbstractC5947z abstractC5947z = (AbstractC5947z) abstractC5940s;
        if (this.f62287a != abstractC5947z.f62287a || this.f62288b != abstractC5947z.f62288b || this.f62289c != abstractC5947z.f62289c) {
            return false;
        }
        InterfaceC5927e interfaceC5927e = this.f62290d;
        return interfaceC5927e == null ? abstractC5947z.f62290d == null : interfaceC5927e.toASN1Primitive().equals(abstractC5947z.f62290d.toASN1Primitive());
    }

    @Override // org.spongycastle.asn1.t0
    public AbstractC5940s getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        int i10 = this.f62287a;
        InterfaceC5927e interfaceC5927e = this.f62290d;
        return interfaceC5927e != null ? i10 ^ interfaceC5927e.hashCode() : i10;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s i() {
        return new i0(this.f62289c, this.f62287a, this.f62290d);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s j() {
        return new r0(this.f62289c, this.f62287a, this.f62290d);
    }

    public AbstractC5940s m() {
        InterfaceC5927e interfaceC5927e = this.f62290d;
        if (interfaceC5927e != null) {
            return interfaceC5927e.toASN1Primitive();
        }
        return null;
    }

    public int n() {
        return this.f62287a;
    }

    public boolean o() {
        return this.f62289c;
    }

    public String toString() {
        return "[" + this.f62287a + "]" + this.f62290d;
    }
}
