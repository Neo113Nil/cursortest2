package com.google.android.gms.internal.measurement;

import com.ironsource.C4427z5;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzc implements zzyk {
    public static final HashSet c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder a;
    public boolean b = false;

    public zzzc(StringBuilder sb) {
        this.a = sb;
    }

    public static int b(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzyk
    public final void a(Object obj, String str) {
        boolean z = this.b;
        StringBuilder sb = this.a;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append("[CONTEXT ");
            this.b = true;
        }
        sb.append(str);
        sb.append(C4427z5.U);
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (c.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int b = b(i, obj2);
            if (b == -1) {
                sb.append((CharSequence) obj2, i, obj2.length());
                sb.append('\"');
                return;
            }
            sb.append((CharSequence) obj2, i, b);
            i = b + 1;
            char charAt = obj2.charAt(b);
            if (charAt == '\t') {
                charAt = 't';
            } else if (charAt == '\n') {
                charAt = 'n';
            } else if (charAt == '\r') {
                charAt = 'r';
            } else if (charAt != '\"' && charAt != '\\') {
                sb.append((char) 65533);
            }
            sb.append("\\");
            sb.append(charAt);
        }
    }
}
