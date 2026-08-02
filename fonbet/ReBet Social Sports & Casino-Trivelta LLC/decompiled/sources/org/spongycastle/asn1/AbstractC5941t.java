package org.spongycastle.asn1;

import Aj.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: org.spongycastle.asn1.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5941t extends AbstractC5940s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public Vector f62271a;

    public AbstractC5941t() {
        this.f62271a = new Vector();
    }

    public static AbstractC5941t k(Object obj) {
        if (obj == null || (obj instanceof AbstractC5941t)) {
            return (AbstractC5941t) obj;
        }
        if (obj instanceof InterfaceC5942u) {
            return k(((InterfaceC5942u) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return k(AbstractC5940s.g((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e10.getMessage());
            }
        }
        if (obj instanceof InterfaceC5927e) {
            AbstractC5940s aSN1Primitive = ((InterfaceC5927e) obj).toASN1Primitive();
            if (aSN1Primitive instanceof AbstractC5941t) {
                return (AbstractC5941t) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public static AbstractC5941t l(AbstractC5947z abstractC5947z, boolean z10) {
        if (z10) {
            if (abstractC5947z.o()) {
                return k(abstractC5947z.m().toASN1Primitive());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (abstractC5947z.o()) {
            return abstractC5947z instanceof K ? new G(abstractC5947z.m()) : new p0(abstractC5947z.m());
        }
        if (abstractC5947z.m() instanceof AbstractC5941t) {
            return (AbstractC5941t) abstractC5947z.m();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC5947z.getClass().getName());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (!(abstractC5940s instanceof AbstractC5941t)) {
            return false;
        }
        AbstractC5941t abstractC5941t = (AbstractC5941t) abstractC5940s;
        if (size() != abstractC5941t.size()) {
            return false;
        }
        Enumeration o10 = o();
        Enumeration o11 = abstractC5941t.o();
        while (o10.hasMoreElements()) {
            InterfaceC5927e m10 = m(o10);
            InterfaceC5927e m11 = m(o11);
            AbstractC5940s aSN1Primitive = m10.toASN1Primitive();
            AbstractC5940s aSN1Primitive2 = m11.toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return true;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        Enumeration o10 = o();
        int size = size();
        while (o10.hasMoreElements()) {
            size = (size * 17) ^ m(o10).hashCode();
        }
        return size;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s i() {
        d0 d0Var = new d0();
        d0Var.f62271a = this.f62271a;
        return d0Var;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0011a(p());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s j() {
        p0 p0Var = new p0();
        p0Var.f62271a = this.f62271a;
        return p0Var;
    }

    public final InterfaceC5927e m(Enumeration enumeration) {
        return (InterfaceC5927e) enumeration.nextElement();
    }

    public InterfaceC5927e n(int i10) {
        return (InterfaceC5927e) this.f62271a.elementAt(i10);
    }

    public Enumeration o() {
        return this.f62271a.elements();
    }

    public InterfaceC5927e[] p() {
        InterfaceC5927e[] interfaceC5927eArr = new InterfaceC5927e[size()];
        for (int i10 = 0; i10 != size(); i10++) {
            interfaceC5927eArr[i10] = n(i10);
        }
        return interfaceC5927eArr;
    }

    public int size() {
        return this.f62271a.size();
    }

    public String toString() {
        return this.f62271a.toString();
    }

    public AbstractC5941t(InterfaceC5927e interfaceC5927e) {
        Vector vector = new Vector();
        this.f62271a = vector;
        vector.addElement(interfaceC5927e);
    }

    public AbstractC5941t(C5928f c5928f) {
        this.f62271a = new Vector();
        for (int i10 = 0; i10 != c5928f.c(); i10++) {
            this.f62271a.addElement(c5928f.b(i10));
        }
    }

    public AbstractC5941t(InterfaceC5927e[] interfaceC5927eArr) {
        this.f62271a = new Vector();
        for (int i10 = 0; i10 != interfaceC5927eArr.length; i10++) {
            this.f62271a.addElement(interfaceC5927eArr[i10]);
        }
    }
}
