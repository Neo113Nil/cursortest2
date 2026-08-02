package com.google.android.gms.internal.ads;

import defpackage.f0o;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzgug {
    public final String a;
    public final f0o b;
    public f0o c;

    public zzgug(String str) {
        f0o f0oVar = new f0o(20);
        this.b = f0oVar;
        this.c = f0oVar;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        f0o f0oVar = (f0o) this.b.c;
        String str = "";
        while (f0oVar != null) {
            Object obj = f0oVar.b;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            f0oVar = (f0o) f0oVar.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
