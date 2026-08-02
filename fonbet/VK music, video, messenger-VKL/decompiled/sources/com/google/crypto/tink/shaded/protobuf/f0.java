package com.google.crypto.tink.shaded.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 f = new f0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public f0() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int n;
        int q;
        int j;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    j = CodedOutputStream.j(i5);
                } else if (i6 == 2) {
                    j = CodedOutputStream.g(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    n = CodedOutputStream.n(i5) * 2;
                    q = ((f0) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.g());
                    }
                    ((Integer) this.c[i3]).getClass();
                    j = CodedOutputStream.i(i5);
                }
                i2 = j + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                n = CodedOutputStream.n(i5);
                q = CodedOutputStream.q(longValue);
            }
            i2 = q + n + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void b(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final void c(Writer writer) throws IOException {
        if (this.a == 0) {
            return;
        }
        i iVar = (i) writer;
        iVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                iVar.j(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                iVar.f(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                iVar.b(i3, (ByteString) obj);
            } else if (i4 == 3) {
                iVar.getClass();
                CodedOutputStream codedOutputStream = iVar.a;
                codedOutputStream.E(i3, 3);
                ((f0) obj).c(writer);
                codedOutputStream.E(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.g());
                }
                iVar.e(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i = this.a;
        if (i == f0Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = f0Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = f0Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public f0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
