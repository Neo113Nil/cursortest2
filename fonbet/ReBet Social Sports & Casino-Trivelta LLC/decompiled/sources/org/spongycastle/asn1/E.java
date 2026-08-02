package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes5.dex */
public class E extends AbstractC5937o {
    private AbstractC5937o[] octs;

    public class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        public int f62225a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f62225a < E.this.octs.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            AbstractC5937o[] abstractC5937oArr = E.this.octs;
            int i10 = this.f62225a;
            this.f62225a = i10 + 1;
            return abstractC5937oArr[i10];
        }
    }

    public E(byte[] bArr) {
        super(bArr);
    }

    public static E o(AbstractC5941t abstractC5941t) {
        AbstractC5937o[] abstractC5937oArr = new AbstractC5937o[abstractC5941t.size()];
        Enumeration o10 = abstractC5941t.o();
        int i10 = 0;
        while (o10.hasMoreElements()) {
            abstractC5937oArr[i10] = (AbstractC5937o) o10.nextElement();
            i10++;
        }
        return new E(abstractC5937oArr);
    }

    public static byte[] r(AbstractC5937o[] abstractC5937oArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != abstractC5937oArr.length; i10++) {
            try {
                byteArrayOutputStream.write(((Z) abstractC5937oArr[i10]).m());
            } catch (IOException e10) {
                throw new IllegalArgumentException("exception converting octets " + e10.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(abstractC5937oArr[i10].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.c(36);
        c5939q.c(128);
        Enumeration q10 = q();
        while (q10.hasMoreElements()) {
            c5939q.j((InterfaceC5927e) q10.nextElement());
        }
        c5939q.c(0);
        c5939q.c(0);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        Enumeration q10 = q();
        int i10 = 0;
        while (q10.hasMoreElements()) {
            i10 += ((InterfaceC5927e) q10.nextElement()).toASN1Primitive().f();
        }
        return i10 + 4;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return true;
    }

    @Override // org.spongycastle.asn1.AbstractC5937o
    public byte[] m() {
        return this.string;
    }

    public final Vector p() {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.string;
            if (i10 >= bArr.length) {
                return vector;
            }
            int i11 = i10 + 1000;
            int length = (i11 > bArr.length ? bArr.length : i11) - i10;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i10, bArr2, 0, length);
            vector.addElement(new Z(bArr2));
            i10 = i11;
        }
    }

    public Enumeration q() {
        return this.octs == null ? p().elements() : new a();
    }

    public E(AbstractC5937o[] abstractC5937oArr) {
        super(r(abstractC5937oArr));
        this.octs = abstractC5937oArr;
    }
}
