package defpackage;

import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class knb {
    public int[] a;
    public int b;
    public float[] c;

    public knb(int[] iArr) {
        this.a = iArr;
        if (iArr.length == 0) {
            a70.m("Empty array can't be reduced.");
            throw null;
        }
        int i = iArr[0];
        v6a it = new IntRange(1, iArr.length - 1, 1).iterator();
        while (it.c) {
            i *= iArr[it.nextInt()];
        }
        this.b = i;
        this.c = new float[i];
    }
}
