package com.google.android.gms.internal.measurement;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabg extends zzabh {
    public final zzabf c;

    public zzabg(zzza zzzaVar, int i, zzabf zzabfVar) {
        super(zzzaVar, i);
        this.c = zzabfVar;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.d(sb);
        sb.append(true != zzzaVar.c() ? 't' : 'T');
        sb.append(zzabfVar.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void a(zzyy zzyyVar, Object obj) {
        char c = this.c.a;
        StringBuilder sb = zzyyVar.e;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            zzyy.b(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        zzza zzzaVar = this.b;
        zzzaVar.d(sb3);
        sb3.append(true != zzzaVar.c() ? 't' : 'T');
        sb3.append(c);
        sb.append(String.format(zzzh.a, sb3.toString(), obj));
    }
}
