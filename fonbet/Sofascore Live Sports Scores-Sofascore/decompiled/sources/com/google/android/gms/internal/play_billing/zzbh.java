package com.google.android.gms.internal.play_billing;

import defpackage.axn;
import defpackage.c0l;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzbh {
    public final String a;
    public final c0l b;
    public c0l c;

    public zzbh(String str) {
        c0l c0lVar = new c0l(17, false);
        this.b = c0lVar;
        this.c = c0lVar;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        c0l c0lVar = (c0l) this.b.c;
        String str = "";
        while (c0lVar != null) {
            axn axnVar = (axn) c0lVar.b;
            sb.append(str);
            if (axnVar == null || !axn.class.isArray()) {
                sb.append(axnVar);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{axnVar}), 1, r1.length() - 1);
            }
            c0lVar = (c0l) c0lVar.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
