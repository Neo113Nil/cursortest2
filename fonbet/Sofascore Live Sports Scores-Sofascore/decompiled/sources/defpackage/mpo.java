package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziem;
import com.google.android.gms.internal.ads.zzier;
import com.google.android.gms.internal.ads.zzifz;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mpo extends lpo {
    public final byte[] c;

    public mpo(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // defpackage.lpo
    public final boolean E(zziei zzieiVar, int i, int i2) {
        int o = zzieiVar.o();
        byte[] bArr = this.c;
        if (i2 > o) {
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            hbo.f(length + 18 + String.valueOf(length2).length(), i2, length2);
            return false;
        }
        int i3 = i + i2;
        if (i3 <= zzieiVar.o()) {
            if (zzieiVar instanceof mpo) {
                return zziei.m(bArr, 0, i, ((mpo) zzieiVar).c, i2);
            }
            if (!(zzieiVar instanceof kpo)) {
                return zzieiVar.q(i, i3).equals(q(0, i2));
            }
            kpo kpoVar = (kpo) zzieiVar;
            return zziei.m(bArr, 0, kpoVar.d + i, kpoVar.c, i2);
        }
        int o2 = zzieiVar.o();
        int length3 = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(o2).length());
        me4.r(sb, "Ran off end of other: ", i, ", ", i2);
        a70.p(me4.g(o2, ", ", sb));
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final byte n(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int o() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei p(int i, int i2) {
        byte[] bArr = this.c;
        int e = zziei.e(i, i2, bArr.length);
        return e == 0 ? zziei.b : new kpo(bArr, i, e);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei q(int i, int i2) {
        byte[] bArr = this.c;
        int e = zziei.e(i, i2, bArr.length);
        return e == 0 ? zziei.b : new kpo(bArr, i, e);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void r(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer s() {
        return ByteBuffer.wrap(this.c).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void t(zzier zzierVar) {
        byte[] bArr = this.c;
        zzierVar.a(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean u(zziei zzieiVar) {
        boolean z = zzieiVar instanceof mpo;
        byte[] bArr = this.c;
        return z ? Arrays.equals(bArr, ((mpo) zzieiVar).c) : zzieiVar instanceof kpo ? E(zzieiVar, 0, bArr.length) : zzieiVar.u(this);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int w(int i, int i2, int i3) {
        return zzifz.b(i, i2, i3, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem x() {
        byte[] bArr = this.c;
        return zziem.f(0, bArr.length, bArr);
    }
}
