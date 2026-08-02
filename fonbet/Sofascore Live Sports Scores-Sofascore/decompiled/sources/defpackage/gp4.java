package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gp4 {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final z41 b = new z41(new ym4(28));
    public static final z41 c = new z41(new cp4(0));

    public static void a(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new d9());
                break;
            case 1:
                arrayList.add(new h9());
                break;
            case 2:
                arrayList.add(new hl());
                break;
            case 3:
                arrayList.add(new au());
                break;
            case 4:
                kl6 r = b.r(0);
                if (r == null) {
                    arrayList.add(new z68());
                    break;
                } else {
                    arrayList.add(r);
                    break;
                }
            case 5:
                arrayList.add(new id8());
                break;
            case 6:
                arrayList.add(new c0c());
                break;
            case 7:
                arrayList.add(new vwc());
                break;
            case 8:
                arrayList.add(new dr8());
                arrayList.add(new fxc(0));
                break;
            case 9:
                arrayList.add(new snd());
                break;
            case 10:
                arrayList.add(new qgf());
                break;
            case 11:
                arrayList.add(new y1k());
                break;
            case 12:
                xzk xzkVar = new xzk();
                xzkVar.c = 0;
                xzkVar.d = -1L;
                xzkVar.f = -1;
                xzkVar.g = -1L;
                arrayList.add(xzkVar);
                break;
            case 14:
                arrayList.add(new vea());
                break;
            case 15:
                kl6 r2 = c.r(new Object[0]);
                if (r2 != null) {
                    arrayList.add(r2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new cw0());
                break;
        }
    }
}
