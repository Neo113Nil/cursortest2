package com.bytedance.sdk.openadsdk.of;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gm {
    private final int gm;
    private final byte[][] pcc;
    private final int sf;

    public gm(int i, int i2) {
        this.pcc = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.sf = i;
        this.gm = i2;
    }

    public byte[][] gm() {
        return this.pcc;
    }

    public void pcc(byte b) {
        for (byte[] bArr : this.pcc) {
            Arrays.fill(bArr, b);
        }
    }

    public int sf() {
        return this.sf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.sf * 2 * this.gm) + 2);
        for (int i = 0; i < this.gm; i++) {
            byte[] bArr = this.pcc[i];
            for (int i2 = 0; i2 < this.sf; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public byte pcc(int i, int i2) {
        return this.pcc[i2][i];
    }

    public void pcc(int i, int i2, int i3) {
        this.pcc[i2][i] = (byte) i3;
    }

    public void pcc(int i, int i2, boolean z) {
        this.pcc[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public int pcc() {
        return this.gm;
    }
}
