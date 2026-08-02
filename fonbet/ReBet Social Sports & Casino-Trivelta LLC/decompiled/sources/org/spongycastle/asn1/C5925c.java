package org.spongycastle.asn1;

import java.io.IOException;
import kotlin.UByte;

/* renamed from: org.spongycastle.asn1.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5925c extends AbstractC5940s {
    private final byte[] value;
    private static final byte[] TRUE_VALUE = {-1};
    private static final byte[] FALSE_VALUE = {0};

    /* renamed from: a, reason: collision with root package name */
    public static final C5925c f62249a = new C5925c(false);

    /* renamed from: b, reason: collision with root package name */
    public static final C5925c f62250b = new C5925c(true);

    public C5925c(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        if (b10 == 0) {
            this.value = FALSE_VALUE;
        } else if ((b10 & UByte.MAX_VALUE) == 255) {
            this.value = TRUE_VALUE;
        } else {
            this.value = Aj.a.d(bArr);
        }
    }

    public static C5925c k(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        return b10 == 0 ? f62249a : (b10 & UByte.MAX_VALUE) == 255 ? f62250b : new C5925c(bArr);
    }

    public static C5925c l(Object obj) {
        if (obj == null || (obj instanceof C5925c)) {
            return (C5925c) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C5925c) AbstractC5940s.g((byte[]) obj);
        } catch (IOException e10) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e10.getMessage());
        }
    }

    public static C5925c m(AbstractC5947z abstractC5947z, boolean z10) {
        AbstractC5940s m10 = abstractC5947z.m();
        return (z10 || (m10 instanceof C5925c)) ? l(m10) : k(((AbstractC5937o) m10).m());
    }

    public static C5925c n(boolean z10) {
        return z10 ? f62250b : f62249a;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean c(AbstractC5940s abstractC5940s) {
        return (abstractC5940s instanceof C5925c) && this.value[0] == ((C5925c) abstractC5940s).value[0];
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        c5939q.g(1, this.value);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return 3;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s, org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        return this.value[0];
    }

    public boolean o() {
        return this.value[0] != 0;
    }

    public String toString() {
        return this.value[0] != 0 ? "TRUE" : "FALSE";
    }

    public C5925c(boolean z10) {
        this.value = z10 ? TRUE_VALUE : FALSE_VALUE;
    }
}
