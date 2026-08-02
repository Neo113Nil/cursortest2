package org.spongycastle.asn1;

import Aj.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: org.spongycastle.asn1.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5943v extends AbstractC5940s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public Vector f62276a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62277b;

    public AbstractC5943v() {
        this.f62276a = new Vector();
        this.f62277b = false;
    }

    public static AbstractC5943v l(Object obj) {
        if (obj == null || (obj instanceof AbstractC5943v)) {
            return (AbstractC5943v) obj;
        }
        if (obj instanceof InterfaceC5944w) {
            return l(((InterfaceC5944w) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return l(AbstractC5940s.g((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e10.getMessage());
            }
        }
        if (obj instanceof InterfaceC5927e) {
            AbstractC5940s aSN1Primitive = ((InterfaceC5927e) obj).toASN1Primitive();
            if (aSN1Primitive instanceof AbstractC5943v) {
                return (AbstractC5943v) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public static AbstractC5943v m(AbstractC5947z abstractC5947z, boolean z10) {
        if (z10) {
            if (abstractC5947z.o()) {
                return (AbstractC5943v) abstractC5947z.m();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (abstractC5947z.o()) {
            return abstractC5947z instanceof K ? new I(abstractC5947z.m()) : new q0(abstractC5947z.m());
        }
        if (abstractC5947z.m() instanceof AbstractC5943v) {
            return (AbstractC5943v) abstractC5947z.m();
        }
        if (abstractC5947z.m() instanceof AbstractC5941t) {
            AbstractC5941t abstractC5941t = (AbstractC5941t) abstractC5947z.m();
            return abstractC5947z instanceof K ? new I(abstractC5941t.p()) : new q0(abstractC5941t.p());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC5947z.getClass().getName());
    }

    private InterfaceC5927e n(Enumeration enumeration) {
        InterfaceC5927e interfaceC5927e = (InterfaceC5927e) enumeration.nextElement();
        return interfaceC5927e == null ? X.f62244a : interfaceC5927e;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        if (!(abstractC5940s instanceof AbstractC5943v)) {
            return false;
        }
        AbstractC5943v abstractC5943v = (AbstractC5943v) abstractC5940s;
        if (size() != abstractC5943v.size()) {
            return false;
        }
        Enumeration p10 = p();
        Enumeration p11 = abstractC5943v.p();
        while (p10.hasMoreElements()) {
            InterfaceC5927e n10 = n(p10);
            InterfaceC5927e n11 = n(p11);
            AbstractC5940s aSN1Primitive = n10.toASN1Primitive();
            AbstractC5940s aSN1Primitive2 = n11.toASN1Primitive();
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
        Enumeration p10 = p();
        int size = size();
        while (p10.hasMoreElements()) {
            size = (size * 17) ^ n(p10).hashCode();
        }
        return size;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s i() {
        if (this.f62277b) {
            f0 f0Var = new f0();
            f0Var.f62276a = this.f62276a;
            return f0Var;
        }
        Vector vector = new Vector();
        for (int i10 = 0; i10 != this.f62276a.size(); i10++) {
            vector.addElement(this.f62276a.elementAt(i10));
        }
        f0 f0Var2 = new f0();
        f0Var2.f62276a = vector;
        f0Var2.r();
        return f0Var2;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0011a(s());
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public AbstractC5940s j() {
        q0 q0Var = new q0();
        q0Var.f62276a = this.f62276a;
        return q0Var;
    }

    public final byte[] k(InterfaceC5927e interfaceC5927e) {
        try {
            return interfaceC5927e.toASN1Primitive().b(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public InterfaceC5927e o(int i10) {
        return (InterfaceC5927e) this.f62276a.elementAt(i10);
    }

    public Enumeration p() {
        return this.f62276a.elements();
    }

    public final boolean q(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 != min; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return (b10 & UByte.MAX_VALUE) < (b11 & UByte.MAX_VALUE);
            }
        }
        return min == bArr.length;
    }

    public void r() {
        if (this.f62277b) {
            return;
        }
        this.f62277b = true;
        if (this.f62276a.size() > 1) {
            int size = this.f62276a.size() - 1;
            boolean z10 = true;
            while (z10) {
                int i10 = 0;
                byte[] k10 = k((InterfaceC5927e) this.f62276a.elementAt(0));
                z10 = false;
                int i11 = 0;
                while (i11 != size) {
                    int i12 = i11 + 1;
                    byte[] k11 = k((InterfaceC5927e) this.f62276a.elementAt(i12));
                    if (q(k10, k11)) {
                        k10 = k11;
                    } else {
                        Object elementAt = this.f62276a.elementAt(i11);
                        Vector vector = this.f62276a;
                        vector.setElementAt(vector.elementAt(i12), i11);
                        this.f62276a.setElementAt(elementAt, i12);
                        z10 = true;
                        i10 = i11;
                    }
                    i11 = i12;
                }
                size = i10;
            }
        }
    }

    public InterfaceC5927e[] s() {
        InterfaceC5927e[] interfaceC5927eArr = new InterfaceC5927e[size()];
        for (int i10 = 0; i10 != size(); i10++) {
            interfaceC5927eArr[i10] = o(i10);
        }
        return interfaceC5927eArr;
    }

    public int size() {
        return this.f62276a.size();
    }

    public String toString() {
        return this.f62276a.toString();
    }

    public AbstractC5943v(InterfaceC5927e interfaceC5927e) {
        Vector vector = new Vector();
        this.f62276a = vector;
        this.f62277b = false;
        vector.addElement(interfaceC5927e);
    }

    public AbstractC5943v(C5928f c5928f, boolean z10) {
        this.f62276a = new Vector();
        this.f62277b = false;
        for (int i10 = 0; i10 != c5928f.c(); i10++) {
            this.f62276a.addElement(c5928f.b(i10));
        }
        if (z10) {
            r();
        }
    }

    public AbstractC5943v(InterfaceC5927e[] interfaceC5927eArr, boolean z10) {
        this.f62276a = new Vector();
        this.f62277b = false;
        for (int i10 = 0; i10 != interfaceC5927eArr.length; i10++) {
            this.f62276a.addElement(interfaceC5927eArr[i10]);
        }
        if (z10) {
            r();
        }
    }
}
