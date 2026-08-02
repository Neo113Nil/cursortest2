package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.q7o;
import defpackage.qpn;
import defpackage.utn;
import defpackage.v0o;
import defpackage.yih;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzers implements zzemq {
    public final zzems a;
    public final zzemw b;
    public final zzfqi c;
    public final zzhdi d;

    public zzers(zzfqi zzfqiVar, zzhdi zzhdiVar, zzems zzemsVar, zzemw zzemwVar) {
        this.c = zzfqiVar;
        this.d = zzhdiVar;
        this.b = zzemwVar;
        this.a = zzemsVar;
    }

    public static final String c(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        zzemt zzemtVar;
        Iterator it = zzfldVar.t.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzemtVar = null;
                break;
            }
            try {
                zzemtVar = this.a.a((String) it.next(), zzfldVar.v);
                break;
            } catch (zzfmd unused) {
            }
        }
        zzemt zzemtVar2 = zzemtVar;
        if (zzemtVar2 == null) {
            return zzhcy.b(new zzepj(3, "Unable to instantiate mediation adapter class."));
        }
        zzcgo zzcgoVar = new zzcgo();
        zzemtVar2.c.Z1(new yih(this, zzemtVar2, zzcgoVar));
        int i = 1;
        if (zzfldVar.M) {
            Bundle bundle = zzfloVar.a.a.d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfqi zzfqiVar = this.c;
        Objects.requireNonNull(zzfqiVar);
        q7o q7oVar = new q7o(new utn(5, this, zzfloVar, zzfldVar, zzemtVar2, false), 9);
        zzfpz zzfpzVar = new zzfpz(zzfqiVar, zzfqc.ADAPTER_LOAD_AD_SYN, null, zzfqa.d, Collections.EMPTY_LIST, this.d.submit(q7oVar));
        zzfpz a = zzfpzVar.f.a(zzfpzVar.d(), zzfqc.ADAPTER_LOAD_AD_ACK);
        v0o v0oVar = new v0o(i, zzcgoVar);
        hsn hsnVar = zzcgj.h;
        zzfpz zzfpzVar2 = new zzfpz(a.f, a.a, a.b, a.c, a.d, zzhcy.h(a.e, v0oVar, hsnVar));
        return zzfpzVar2.f.a(zzfpzVar2.d(), zzfqc.ADAPTER_WRAP_ADAPTER).a(new qpn(5, this, zzfloVar, zzfldVar, zzemtVar2, false)).d();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        return !zzfldVar.t.isEmpty();
    }
}
