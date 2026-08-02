package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabj extends zzabh {
    public static final Map d;
    public final zzyz c;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i = 0; i < 10; i++) {
                zzabjVarArr[i] = new zzabj(i, zzyzVar, zzza.e);
            }
            enumMap.put((EnumMap) zzyzVar, (zzyz) zzabjVarArr);
        }
        d = Collections.unmodifiableMap(enumMap);
    }

    public zzabj(int i, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i);
        zzabr.a(zzyzVar, "format char");
        this.c = zzyzVar;
        if (zzzaVar.a()) {
            return;
        }
        int i2 = zzyzVar.a;
        i2 = zzzaVar.c() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.d(sb);
        sb.append((char) i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void a(zzyy zzyyVar, Object obj) {
        zzyyVar.a(obj, this.c, this.b);
    }
}
