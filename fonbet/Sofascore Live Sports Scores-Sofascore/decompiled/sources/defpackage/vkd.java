package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vkd {
    public final wj9 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public vkd(wj9 wj9Var, int[] iArr, String[] strArr) {
        wj9Var.getClass();
        iArr.getClass();
        strArr.getClass();
        this.a = wj9Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? w9h.b(strArr[0]) : rm5.a;
        } else {
            a70.r("Check failed.");
            throw null;
        }
    }
}
