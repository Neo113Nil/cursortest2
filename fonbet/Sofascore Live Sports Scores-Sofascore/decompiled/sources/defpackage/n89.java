package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n89 {
    public final /* synthetic */ int a = 0;
    public final String[] b;

    public n89(k89 k89Var) {
        ArrayList arrayList = k89Var.a;
        this.b = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String[] strArr = this.b;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    String str = null;
                    sb.append((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
                    sb.append(": ");
                    int i3 = i2 + 1;
                    if (i3 >= 0 && i3 < strArr.length) {
                        str = strArr[i3];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public n89(String[] strArr) {
        this.b = strArr;
    }
}
