package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.tasks.Task;
import defpackage.b1;
import defpackage.bf3;
import defpackage.bvo;
import defpackage.d1;
import defpackage.f0o;
import defpackage.f35;
import defpackage.fjn;
import defpackage.gl5;
import defpackage.gmo;
import defpackage.haf;
import defpackage.ihe;
import defpackage.jle;
import defpackage.oea;
import defpackage.pxo;
import defpackage.w2p;
import defpackage.xto;
import defpackage.yjo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzmn implements zzmj {
    public final zzkk a;

    public zzmn(zzkk zzkkVar) {
        this.a = zzkkVar;
    }

    public static b1 c(Task task) {
        bvo bvoVar = new bvo();
        bvoVar.h = task;
        fjn fjnVar = new fjn(bvoVar, 26);
        f35 f35Var = f35.a;
        task.addOnCompleteListener(f35Var, fjnVar);
        int i = d1.l;
        b1 b1Var = new b1(bvoVar, ApiException.class, pxo.a);
        bvoVar.addListener(b1Var, oea.u(f35Var, b1Var));
        return b1Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final b1 a(w2p w2pVar) {
        String h;
        zzkk zzkkVar = this.a;
        ListenerHolder a = ListenerHolders.a(zzkkVar.g, w2pVar, "zzku");
        String a2 = ProcessUtils.a();
        if (a2 == null) {
            h = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = a2.length() + 1;
            int identityHashCode = System.identityHashCode(zzku.class);
            h = bf3.h(identityHashCode, a2, "|", new StringBuilder(length + String.valueOf(identityHashCode).length()));
        }
        yjo yjoVar = new yjo(zzkkVar, h, a);
        haf hafVar = haf.r;
        RegistrationMethods.Builder builder = new RegistrationMethods.Builder();
        builder.c = gl5.b;
        builder.f = true;
        builder.d = a;
        builder.a = yjoVar;
        builder.b = hafVar;
        builder.e = new Feature[]{zzjn.b};
        builder.f = false;
        return c(zzkkVar.e(builder.a()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final b1 b(zzme zzmeVar) {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = new gmo(zzmeVar, 5);
        a.c = new Feature[]{zzjn.a};
        a.b = false;
        com.google.android.gms.common.api.internal.e a2 = a.a();
        zzkk zzkkVar = this.a;
        return c(zzkkVar.h(0, a2).continueWithTask(f35.a, new f0o(28, zzkkVar, zzmeVar)));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final b1 zza(String str) {
        str.getClass();
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = new ihe(str, 2);
        return c(this.a.h(0, a.a()).continueWith(f35.a, new jle(25)));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final b1 zzb(String str) {
        str.getClass();
        return c(this.a.i(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final b1 zzd() {
        TaskApiCall.Builder a = TaskApiCall.a();
        zzkk zzkkVar = this.a;
        a.a = new xto(zzkkVar, 0);
        a.c = new Feature[]{zzjn.c};
        a.b = false;
        return c(zzkkVar.h(0, a.a()));
    }
}
