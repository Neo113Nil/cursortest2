package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzaif;
import defpackage.dno;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzw extends BroadcastReceiver {
    public final zzic a;

    public zzw(zzic zzicVar) {
        this.a = zzicVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzic zzicVar = this.a;
        if (intent == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.j.a("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                zzgu zzguVar3 = zzicVar.f;
                zzic.m(zzguVar3);
                zzguVar3.o.a("[sgtm] App Receiver notified batches are available");
                zzhz zzhzVar = zzicVar.g;
                zzic.m(zzhzVar);
                zzhzVar.Z(new dno(this, 19));
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            zzaif.a();
            if (zzicVar.d.b0(null, zzfy.P0)) {
                zzgu zzguVar4 = zzicVar.f;
                zzic.m(zzguVar4);
                zzguVar4.o.a("App receiver notified triggers are available");
                zzhz zzhzVar2 = zzicVar.g;
                zzic.m(zzhzVar2);
                zzhzVar2.Z(new dno(zzicVar, 22));
                return;
            }
            return;
        }
        zzgu zzguVar5 = zzicVar.f;
        zzic.m(zzguVar5);
        zzguVar5.j.a("App receiver called with unknown action");
    }
}
