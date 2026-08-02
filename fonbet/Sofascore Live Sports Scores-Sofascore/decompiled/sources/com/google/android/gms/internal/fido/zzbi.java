package com.google.android.gms.internal.fido;

import com.ironsource.C4427z5;
import defpackage.x6k;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbi {
    public final String a;
    public final x6k b;
    public x6k c;

    public zzbi(String str) {
        x6k x6kVar = new x6k(24, false);
        this.b = x6kVar;
        this.c = x6kVar;
        this.a = str;
    }

    public final void a(Object obj, String str) {
        x6k x6kVar = new x6k(24, false);
        this.c.d = x6kVar;
        this.c = x6kVar;
        x6kVar.b = obj;
        x6kVar.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        x6k x6kVar = (x6k) this.b.d;
        String str = "";
        while (x6kVar != null) {
            Object obj = x6kVar.b;
            sb.append(str);
            String str2 = (String) x6kVar.c;
            if (str2 != null) {
                sb.append(str2);
                sb.append(C4427z5.U);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            x6kVar = (x6k) x6kVar.d;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
