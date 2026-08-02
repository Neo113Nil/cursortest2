package com.google.android.gms.internal.wearable;

import com.ironsource.C4427z5;
import defpackage.hcc;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzag {
    public final String a;
    public final hcc b;
    public hcc c;

    public zzag(String str) {
        hcc hccVar = new hcc(24, false);
        this.b = hccVar;
        this.c = hccVar;
        this.a = str;
    }

    public final void a(Object obj, String str) {
        hcc hccVar = new hcc(24, false);
        this.c.d = hccVar;
        this.c = hccVar;
        hccVar.c = obj;
        hccVar.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        hcc hccVar = (hcc) this.b.d;
        String str = "";
        while (hccVar != null) {
            Object obj = hccVar.c;
            sb.append(str);
            String str2 = (String) hccVar.b;
            if (str2 != null) {
                sb.append(str2);
                sb.append(C4427z5.U);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            hccVar = (hcc) hccVar.d;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
