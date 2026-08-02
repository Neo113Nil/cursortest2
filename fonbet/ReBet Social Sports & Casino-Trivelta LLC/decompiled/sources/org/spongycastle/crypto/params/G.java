package org.spongycastle.crypto.params;

import java.util.Hashtable;

/* loaded from: classes5.dex */
public class G implements org.spongycastle.crypto.j {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f62644a;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Hashtable f62645a = new Hashtable();

        public G a() {
            return new G(this.f62645a);
        }

        public b b(int i10, byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException("Parameter value must not be null.");
            }
            if (i10 != 0 && (i10 <= 4 || i10 >= 63 || i10 == 48)) {
                throw new IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
            }
            if (i10 == 4) {
                throw new IllegalArgumentException("Parameter type 4 is reserved for internal use.");
            }
            this.f62645a.put(Aj.c.b(i10), bArr);
            return this;
        }

        public b c(byte[] bArr) {
            return b(0, bArr);
        }
    }

    public byte[] a() {
        return (byte[]) this.f62644a.get(Aj.c.b(0));
    }

    public Hashtable b() {
        return this.f62644a;
    }

    public G(Hashtable hashtable) {
        this.f62644a = hashtable;
    }
}
