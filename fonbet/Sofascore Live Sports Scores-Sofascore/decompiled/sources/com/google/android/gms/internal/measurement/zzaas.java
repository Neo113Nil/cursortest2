package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.sofascore.model.mvvm.model.Season;
import defpackage.mgp;
import defpackage.ogp;
import defpackage.pfp;
import defpackage.s4n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaas extends zzaag {
    public static final Set f;
    public static final pfp g;
    public static final zzaaq h;
    public final String b;
    public final Level c;
    public final Set d;
    public final zzzq e;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxx.a, zzyw.c, zzyx.a)));
        f = unmodifiableSet;
        pfp pfpVar = new pfp(zzzt.a(unmodifiableSet));
        g = pfpVar;
        h = new zzaaq(Level.ALL, unmodifiableSet, pfpVar);
    }

    public /* synthetic */ zzaas(String str, Level level, Set set, zzzq zzzqVar) {
        super(str);
        this.b = zzaal.a(str);
        this.c = level;
        this.d = set;
        this.e = zzzqVar;
    }

    public static void e(zzxz zzxzVar, Level level, Set set, zzzq zzzqVar) {
        zzaaa mgpVar;
        Level level2 = zzxzVar.a;
        Boolean bool = (Boolean) zzxzVar.j().d(zzyx.a);
        if (bool == null || !bool.booleanValue()) {
            zzzj c = s4n.a.c().c();
            zzzj j = zzxzVar.j();
            int a = j.a();
            if (a == 0) {
                mgpVar = zzaaa.a;
            } else {
                mgpVar = a <= 28 ? new mgp(c, j) : new ogp(c, j);
            }
            boolean z = level2.intValue() < level.intValue();
            if (!z) {
                int i = zzaae.a;
                if (zzxzVar.f == null && mgpVar.b() <= set.size() && set.containsAll(mgpVar.c())) {
                    zzzh.a(zzxzVar.i());
                    zzaal.b(level2);
                }
            }
            StringBuilder sb = new StringBuilder();
            if (zzze.a(2, zzxzVar.g(), sb)) {
                sb.append(" ");
            }
            if (!z || zzxzVar.f == null) {
                zzaaf zzaafVar = zzxzVar.f;
                if (zzaafVar != null) {
                    zzyy zzyyVar = new zzyy(zzaafVar, zzxzVar.h(), sb);
                    zzaaf zzaafVar2 = zzyyVar.a;
                    zzaafVar2.a.a(zzyyVar);
                    int i2 = zzyyVar.b;
                    if (((i2 + 1) & i2) != 0 || (zzyyVar.c > 31 && i2 != -1)) {
                        throw new zzabo(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i2))));
                    }
                    zzabn zzabnVar = zzaafVar2.a;
                    String str = zzaafVar2.b;
                    int i3 = zzyyVar.f;
                    int length = str.length();
                    StringBuilder sb2 = zzyyVar.e;
                    zzabnVar.b(i3, length, str, sb2);
                    if (zzxzVar.h().length > zzyyVar.c + 1) {
                        sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    }
                } else {
                    sb.append(zzzh.a(zzxzVar.i()));
                }
                int i4 = zzaae.a;
                zzzc zzzcVar = new zzzc(sb);
                mgpVar.a(zzzqVar, zzzcVar);
                if (zzzcVar.b) {
                    sb.append(" ]");
                }
            } else {
                sb.append("(REDACTED) ");
                sb.append(zzxzVar.f.b);
            }
            zzaal.b(level2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        int b = zzaal.b(level);
        return Log.isLoggable(this.b, b) || Log.isLoggable(Season.YEAR_ALL_TIME, b);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        e(zzxzVar, this.c, this.d, this.e);
    }
}
