package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d7b extends ltk {
    public final uzc b;

    public d7b() {
        uzc uzcVar = q6a.a;
        this.b = new uzc();
    }

    @Override // defpackage.ltk
    public final void e() {
        uzc uzcVar = this.b;
        int[] iArr = uzcVar.b;
        Object[] objArr = uzcVar.c;
        long[] jArr = uzcVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        l0d l0dVar = (l0d) objArr[i4];
                        Object[] objArr2 = l0dVar.a;
                        int i6 = l0dVar.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            c7b c7bVar = (c7b) objArr2[i7];
                            qj2 qj2Var = c7bVar.d;
                            if (qj2Var != null) {
                                qj2Var.cancel();
                            }
                            c7bVar.d = null;
                            r45 r45Var = (r45) c7bVar.a.b;
                            r45Var.b = true;
                            r45Var.a = false;
                            r45Var.b();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
