package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class up2 {
    public static final /* synthetic */ int a = 0;

    static {
        long j;
        long j2;
        long j3;
        ww9.t(ij9.f, new b42(14), new js1((byte) 0, 29));
        IntRange intRange = new IntRange(0, 255, 1);
        ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
        v6a it = intRange.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (48 > nextInt || nextInt >= 58) {
                j = nextInt;
                if (j >= 97 && j <= 102) {
                    j3 = 87;
                } else if (j < 65 || j > 70) {
                    j2 = -1;
                    arrayList.add(Long.valueOf(j2));
                } else {
                    j3 = 55;
                }
            } else {
                j = nextInt;
                j3 = 48;
            }
            j2 = j - j3;
            arrayList.add(Long.valueOf(j2));
        }
        CollectionsKt.T0(arrayList);
        IntRange intRange2 = new IntRange(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(k13.r(intRange2, 10));
        v6a it2 = intRange2.iterator();
        while (it2.c) {
            int nextInt2 = it2.nextInt();
            arrayList2.add(Byte.valueOf((byte) (nextInt2 < 10 ? nextInt2 + 48 : (char) (((char) (nextInt2 + 97)) - '\n'))));
        }
        CollectionsKt.O0(arrayList2);
    }

    public static final int a(int i, int i2, CharSequence charSequence) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            int charAt = charSequence.charAt(i);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            i3 = (i3 * 31) + charAt;
            i++;
        }
        return i3;
    }

    public static final void b(mo2 mo2Var, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) mo2Var) + ", wrong digit: " + mo2Var.charAt(i) + " at position " + i);
    }
}
