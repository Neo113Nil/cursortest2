package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tpo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ zzjd c;

    public /* synthetic */ tpo(zzjd zzjdVar, zzr zzrVar, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.b;
        zzjd zzjdVar = this.c;
        switch (i) {
            case 0:
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                zzpgVar.d().Q();
                zzpgVar.m0();
                Preconditions.i(zzrVar);
                String str = zzrVar.a;
                Preconditions.f(str);
                int i2 = 0;
                if (zzpgVar.f0().b0(null, zzfy.y0)) {
                    ((DefaultClock) zzpgVar.f()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int Z = zzpgVar.f0().Z(null, zzfy.h0);
                    zzpgVar.f0();
                    long longValue = currentTimeMillis - ((Long) zzfy.e.a(null)).longValue();
                    while (i2 < Z && zzpgVar.I(longValue, null)) {
                        i2++;
                    }
                } else {
                    zzpgVar.f0();
                    long intValue = ((Integer) zzfy.l.a(null)).intValue();
                    while (i2 < intValue && zzpgVar.I(0L, str)) {
                        i2++;
                    }
                }
                if (zzpgVar.f0().b0(null, zzfy.z0)) {
                    zzpgVar.d().Q();
                    zzpgVar.H();
                }
                zzou zzouVar = zzpgVar.j;
                zzin a = zzin.a(zzrVar.E);
                zzouVar.Q();
                if (a == zzin.CLIENT_UPLOAD_ELIGIBLE && !zzou.T(str)) {
                    zzht zzhtVar = zzouVar.c.a;
                    zzpg.U(zzhtVar);
                    zzgl c0 = zzhtVar.c0(str);
                    if (c0 != null && c0.M() && !c0.N().z().isEmpty()) {
                        zzpgVar.b().o.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        ((DefaultClock) zzpgVar.f()).getClass();
                        zzpgVar.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            default:
                zzpg zzpgVar2 = zzjdVar.a;
                zzpgVar2.W();
                if (zzpgVar2.y != null) {
                    ArrayList arrayList = new ArrayList();
                    zzpgVar2.z = arrayList;
                    arrayList.addAll(zzpgVar2.y);
                }
                hkn hknVar = zzpgVar2.c;
                zzpg.U(hknVar);
                zzic zzicVar = (zzic) hknVar.b;
                String str2 = zzrVar.a;
                Preconditions.i(str2);
                Preconditions.f(str2);
                hknVar.Q();
                hknVar.R();
                try {
                    SQLiteDatabase H0 = hknVar.H0();
                    String[] strArr = {str2};
                    int delete = H0.delete("apps", "app_id=?", strArr) + H0.delete("events", "app_id=?", strArr) + H0.delete("events_snapshot", "app_id=?", strArr) + H0.delete("user_attributes", "app_id=?", strArr) + H0.delete("conditional_properties", "app_id=?", strArr) + H0.delete("raw_events", "app_id=?", strArr) + H0.delete("raw_events_metadata", "app_id=?", strArr) + H0.delete("queue", "app_id=?", strArr) + H0.delete("audience_filter_values", "app_id=?", strArr) + H0.delete("main_event_params", "app_id=?", strArr) + H0.delete("default_event_params", "app_id=?", strArr) + H0.delete("trigger_uris", "app_id=?", strArr) + H0.delete("upload_queue", "app_id=?", strArr);
                    if (zzicVar.d.b0(null, zzfy.c1)) {
                        delete += H0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + H0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        zzgu zzguVar = zzicVar.f;
                        zzic.m(zzguVar);
                        zzguVar.o.c(str2, Integer.valueOf(delete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.g.c(zzgu.U(str2), e, "Error resetting analytics data. appId, error");
                }
                if (zzrVar.h) {
                    zzpgVar2.Z(zzrVar);
                    break;
                }
                break;
        }
    }
}
