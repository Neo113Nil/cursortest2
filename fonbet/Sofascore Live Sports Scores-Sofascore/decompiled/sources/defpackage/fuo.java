package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fuo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzlj b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ fuo(zzlj zzljVar, Bundle bundle, int i) {
        this.a = i;
        this.c = bundle;
        this.b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.c;
        zzlj zzljVar = this.b;
        switch (i) {
            case 0:
                zzljVar.Q();
                zzljVar.R();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                Preconditions.f(string);
                Preconditions.f(string2);
                Preconditions.i(bundle.get(U3.i.X));
                zzic zzicVar = (zzic) zzljVar.b;
                if (!zzicVar.c()) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.o.a("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar = new zzpl(bundle.getLong("triggered_timestamp"), bundle.get(U3.i.X), string, string2);
                    try {
                        zzpp zzppVar = zzicVar.i;
                        zzic.k(zzppVar);
                        bundle.getString(MBridgeConstans.APP_ID);
                        zzbh x0 = zzppVar.x0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        zzic.k(zzppVar);
                        bundle.getString(MBridgeConstans.APP_ID);
                        zzbh x02 = zzppVar.x0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString(MBridgeConstans.APP_ID);
                        zzicVar.o().j0(new zzah(bundle.getString(MBridgeConstans.APP_ID), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), x02, bundle.getLong("trigger_timeout"), x0, bundle.getLong("time_to_live"), zzppVar.x0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                muo muoVar = zzljVar.w;
                zzic zzicVar2 = (zzic) zzljVar.b;
                if (!bundle.isEmpty()) {
                    lmo lmoVar = zzicVar2.e;
                    zzpp zzppVar2 = zzicVar2.i;
                    zzal zzalVar = zzicVar2.d;
                    zzgu zzguVar2 = zzicVar2.f;
                    zzic.k(lmoVar);
                    Bundle bundle2 = new Bundle(lmoVar.z.a());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            zzic.k(zzppVar2);
                            if (zzpp.c1(obj)) {
                                zzpp.i0(muoVar, null, 27, null, null, 0);
                            }
                            zzic.m(zzguVar2);
                            zzguVar2.l.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (zzpp.u0(str)) {
                            zzic.m(zzguVar2);
                            zzguVar2.l.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            zzic.k(zzppVar2);
                            zzalVar.getClass();
                            if (zzppVar2.U("param", str, 500, obj)) {
                                zzppVar2.h0(bundle2, str, obj);
                            }
                        }
                    }
                    zzic.k(zzppVar2);
                    zzpp zzppVar3 = ((zzic) zzalVar.b).i;
                    zzic.k(zzppVar3);
                    int i2 = zzppVar3.A0(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        Iterator it = new TreeSet(bundle2.keySet()).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        zzic.k(zzppVar2);
                        zzpp.i0(muoVar, null, 26, null, null, 0);
                        zzic.m(zzguVar2);
                        zzguVar2.l.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                lmo lmoVar2 = zzicVar2.e;
                zzic.k(lmoVar2);
                lmoVar2.z.b(bundle);
                zzicVar2.o().V(bundle);
                break;
        }
    }
}
