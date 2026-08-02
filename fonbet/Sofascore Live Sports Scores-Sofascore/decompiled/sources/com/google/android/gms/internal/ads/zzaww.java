package com.google.android.gms.internal.ads;

import defpackage.ilg;
import defpackage.x5n;
import defpackage.xio;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaww implements Comparator {
    public final boolean a;

    public zzaww(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4 A[RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int length;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int y = x5n.y((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 496612959;
        zzaxa zzaxaVar = (zzaxa) obj;
        zzaxa zzaxaVar2 = (zzaxa) obj2;
        int i11 = zzaxaVar.g;
        if (i11 != zzaxaVar2.g) {
            ilg.c();
            return 0;
        }
        int i12 = i10 ^ y;
        try {
            if (i11 == 0) {
                throw null;
            }
            int i13 = i11 + i12;
            boolean z = this.a;
            switch (i13) {
                case 1:
                    if (z) {
                        return zzaxaVar.l() != zzaxaVar2.l() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzaxaVar.m(), zzaxaVar2.m());
                case 3:
                    zzawe n = zzaxaVar.n();
                    zzawe n2 = zzaxaVar2.n();
                    int i14 = 0;
                    while (true) {
                        length = n.a.length;
                        if (i < length && i14 < n2.a.length) {
                            int compare = Integer.compare(zzawe.f(n.b(i)), zzawe.f(n2.b(i14)));
                            if (compare != 0) {
                                return compare;
                            }
                            i++;
                            i14++;
                        }
                    }
                    return Integer.compare(length, n2.a.length);
                case 4:
                    return new xio(this).compare(zzaxaVar.o(), zzaxaVar2.o());
                case 5:
                    if (z) {
                        if (zzaxaVar.p() != zzaxaVar2.p()) {
                        }
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzaxaVar.q(), zzaxaVar2.q());
            }
        } catch (zzawx e) {
            throw new AssertionError(zzawc.a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
