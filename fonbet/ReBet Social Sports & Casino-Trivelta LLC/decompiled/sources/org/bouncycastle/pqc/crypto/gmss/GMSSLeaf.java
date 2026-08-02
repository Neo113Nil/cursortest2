package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes5.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* renamed from: i, reason: collision with root package name */
    private int f62035i;

    /* renamed from: j, reason: collision with root package name */
    private int f62036j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w, reason: collision with root package name */
    private int f62037w;

    public GMSSLeaf(Digest digest, int i10, int i11) {
        this.f62037w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d10 = i10;
        this.keysize = ((int) Math.ceil((r7 << 3) / d10)) + ((int) Math.ceil(getLog((r7 << i10) + 1) / d10));
        this.two_power_w = 1 << i10;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i11);
        int i12 = this.mdsize;
        this.seed = new byte[i12];
        this.leaf = new byte[i12];
        this.privateKeyOTS = new byte[i12];
        this.concHashs = new byte[i12 * this.keysize];
    }

    private int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i10 = 0; i10 < this.steps + 10000; i10++) {
            int i11 = this.f62035i;
            if (i11 == this.keysize && this.f62036j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i11 == 0 || this.f62036j == this.two_power_w - 1) {
                this.f62035i = i11 + 1;
                this.f62036j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i12 = this.f62036j + 1;
                this.f62036j = i12;
                if (i12 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i13 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f62035i - 1) * i13, i13);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.f62035i + " " + this.f62036j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.privateKeyOTS, this.seed, this.concHashs, this.leaf};
    }

    public int[] getStatInt() {
        return new int[]{this.f62035i, this.f62036j, this.steps, this.f62037w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.f62035i = 0;
        this.f62036j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        StringBuilder sb2;
        String str = "";
        for (int i10 = 0; i10 < 4; i10++) {
            str = str + getStatInt()[i10] + " ";
        }
        String str2 = str + " " + this.mdsize + " " + this.keysize + " " + this.two_power_w + " ";
        byte[][] statByte = getStatByte();
        for (int i11 = 0; i11 < 4; i11++) {
            if (statByte[i11] != null) {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(new String(Hex.encode(statByte[i11])));
                sb2.append(" ");
            } else {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("null ");
            }
            str2 = sb2.toString();
        }
        return str2;
    }

    public GMSSLeaf(Digest digest, int i10, int i11, byte[] bArr) {
        this.f62037w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d10 = i10;
        this.keysize = ((int) Math.ceil((r7 << 3) / d10)) + ((int) Math.ceil(getLog((r7 << i10) + 1) / d10));
        this.two_power_w = 1 << i10;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i11);
        int i12 = this.mdsize;
        this.seed = new byte[i12];
        this.leaf = new byte[i12];
        this.privateKeyOTS = new byte[i12];
        this.concHashs = new byte[i12 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f62035i = iArr[0];
        this.f62036j = iArr[1];
        this.steps = iArr[2];
        this.f62037w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.keysize = ((int) Math.ceil((r9 << 3) / this.f62037w)) + ((int) Math.ceil(getLog((r9 << this.f62037w) + 1) / this.f62037w));
        this.two_power_w = 1 << this.f62037w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f62035i = gMSSLeaf.f62035i;
        this.f62036j = gMSSLeaf.f62036j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f62037w = gMSSLeaf.f62037w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
