package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cj9 extends yr4 {
    @Override // defpackage.yr4
    public final Object e(Object obj) {
        int[] iArr = (int[]) obj;
        Arrays.fill(iArr, 0, iArr.length, -1);
        return iArr;
    }

    @Override // defpackage.yr4
    public final Object h() {
        int[] iArr = new int[768];
        for (int i = 0; i < 768; i++) {
            iArr[i] = -1;
        }
        return iArr;
    }
}
