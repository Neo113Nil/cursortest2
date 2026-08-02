package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpp;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wfo implements Runnable {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public wfo(zzgu zzguVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzgu zzguVar = (zzgu) this.g;
                lmo lmoVar = ((zzic) zzguVar.b).e;
                zzic.k(lmoVar);
                if (!lmoVar.c) {
                    zzguVar.W();
                    return;
                }
                if (zzguVar.d == 0) {
                    zzal zzalVar = ((zzic) zzguVar.b).d;
                    if (zzalVar.f == null) {
                        synchronized (zzalVar) {
                            try {
                                if (zzalVar.f == null) {
                                    zzic zzicVar = (zzic) zzalVar.b;
                                    ApplicationInfo applicationInfo = zzicVar.a.getApplicationInfo();
                                    String a = ProcessUtils.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        zzalVar.f = Boolean.valueOf(str != null && str.equals(a));
                                    }
                                    if (zzalVar.f == null) {
                                        zzalVar.f = Boolean.TRUE;
                                        zzgu zzguVar2 = zzicVar.f;
                                        zzic.m(zzguVar2);
                                        zzguVar2.g.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (zzalVar.f.booleanValue()) {
                        zzguVar.d = 'C';
                    } else {
                        zzguVar.d = 'c';
                    }
                }
                long j = zzguVar.e;
                if (j < 0) {
                    ((zzic) zzguVar.b).d.W();
                    j = 161000;
                    zzguVar.e = 161000L;
                }
                int i = this.b;
                char c = zzguVar.d;
                String str2 = this.c;
                Object obj = this.d;
                Object obj2 = this.e;
                Object obj3 = this.f;
                char charAt = "01VDIWEA?".charAt(i);
                String X = zzgu.X(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(wt3.B(String.valueOf(charAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + X.length());
                sb.append("2");
                sb.append(charAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(X);
                String sb2 = sb.toString();
                if (sb2.length() > 1024) {
                    sb2 = str2.substring(0, 1024);
                }
                zzhf zzhfVar = lmoVar.f;
                if (zzhfVar != null) {
                    lmo lmoVar2 = zzhfVar.b;
                    lmoVar2.Q();
                    if (zzhfVar.b.U().getLong("health_monitor:start", 0L) == 0) {
                        zzhfVar.a();
                    }
                    long j2 = lmoVar2.U().getLong("health_monitor:count", 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor edit = lmoVar2.U().edit();
                        edit.putString("health_monitor:value", sb2);
                        edit.putLong("health_monitor:count", 1L);
                        edit.apply();
                        return;
                    }
                    zzpp zzppVar = ((zzic) lmoVar2.b).i;
                    zzic.k(zzppVar);
                    long nextLong = zzppVar.P0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor edit2 = lmoVar2.U().edit();
                    if (nextLong < j4) {
                        edit2.putString("health_monitor:value", sb2);
                    }
                    edit2.putLong("health_monitor:count", j3);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((who) this.d).d(this.c, this.b, (Throwable) this.e, (byte[]) this.f, (Map) this.g);
                return;
        }
    }

    public /* synthetic */ wfo(String str, who whoVar, int i, IOException iOException, byte[] bArr, Map map) {
        this.d = whoVar;
        this.b = i;
        this.e = iOException;
        this.f = bArr;
        this.c = str;
        this.g = map;
    }
}
