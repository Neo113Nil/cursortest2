package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bto implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzlj b;

    public /* synthetic */ bto(zzlj zzljVar, int i) {
        this.a = i;
        this.b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzlj zzljVar = this.b;
        switch (i) {
            case 0:
                zzljVar.n0();
                break;
            case 1:
                zzx zzxVar = zzljVar.r;
                zzic zzicVar = zzxVar.a;
                zzhz zzhzVar = zzicVar.g;
                zzlj zzljVar2 = zzicVar.m;
                lmo lmoVar = zzicVar.e;
                zzic.m(zzhzVar);
                zzhzVar.Q();
                if (zzxVar.c()) {
                    if (zzxVar.b()) {
                        zzic.k(lmoVar);
                        lmoVar.x.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        zzic.l(zzljVar2);
                        zzljVar2.X("auto", bundle, "_cmpx");
                    } else {
                        zzic.k(lmoVar);
                        zzhg zzhgVar = lmoVar.x;
                        String a = zzhgVar.a();
                        if (TextUtils.isEmpty(a)) {
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.h.a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long a2 = lmoVar.y.a() / 3600000;
                            Uri parse = Uri.parse(a);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (a2 - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            zzic.l(zzljVar2);
                            zzljVar2.X(str2, (Bundle) pair.second, "_cmp");
                        }
                        zzhgVar.b(null);
                    }
                    zzic.k(lmoVar);
                    lmoVar.y.b(0L);
                    break;
                }
                break;
            case 2:
                zzljVar.Q();
                zzic zzicVar2 = (zzic) zzljVar.b;
                lmo lmoVar2 = zzicVar2.e;
                zzgu zzguVar2 = zzicVar2.f;
                zzic.k(lmoVar2);
                zzhc zzhcVar = lmoVar2.u;
                if (zzhcVar.a()) {
                    zzic.m(zzguVar2);
                    zzguVar2.n.a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    zzhe zzheVar = lmoVar2.v;
                    long a3 = zzheVar.a();
                    zzheVar.b(1 + a3);
                    if (a3 >= 5) {
                        zzic.m(zzguVar2);
                        zzguVar2.j.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        zzhcVar.b(true);
                        break;
                    } else {
                        dto dtoVar = zzljVar.t;
                        if (dtoVar == null) {
                            dtoVar = new dto(zzljVar, zzicVar2, 3, false);
                            zzljVar.t = dtoVar;
                        }
                        dtoVar.b(0L);
                        break;
                    }
                }
            default:
                zzljVar.n0();
                break;
        }
    }
}
