package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbc {
    public static final void a(StringBuilder sb, Iterator it, zzbd zzbdVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(zzbd.a(entry.getKey()));
            sb.append(" : ");
            sb.append(zzbd.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(zzbd.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(zzbd.a(entry2.getValue()));
            }
        }
    }
}
