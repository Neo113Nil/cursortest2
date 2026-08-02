package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ob4 {
    public final byte[] a;
    public final int b;

    public ob4(byte[] bArr, int i) {
        this.a = (byte[]) bArr.clone();
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ob4)) {
            return false;
        }
        ob4 ob4Var = (ob4) obj;
        if (ob4Var.b != this.b) {
            return false;
        }
        return Arrays.equals(this.a, ob4Var.a);
    }

    public final int hashCode() {
        int i;
        byte[] bArr = this.a;
        if (bArr == null) {
            i = 0;
        } else {
            int length = bArr.length;
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ bArr[length];
            }
            i = i2;
        }
        return this.b ^ i;
    }
}
