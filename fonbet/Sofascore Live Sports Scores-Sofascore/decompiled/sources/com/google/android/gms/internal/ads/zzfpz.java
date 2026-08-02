package com.google.android.gms.internal.ads;

import defpackage.cpn;
import defpackage.ddb;
import defpackage.f0o;
import defpackage.fjn;
import defpackage.hsn;
import defpackage.nkn;
import defpackage.vlo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfpz {
    public final Object a;
    public final String b;
    public final ddb c;
    public final List d;
    public final ddb e;
    public final /* synthetic */ zzfqa f;

    public zzfpz(zzfqa zzfqaVar, Object obj, String str, ddb ddbVar, List list, ddb ddbVar2) {
        Objects.requireNonNull(zzfqaVar);
        this.f = zzfqaVar;
        this.a = obj;
        this.b = str;
        this.c = ddbVar;
        this.d = list;
        this.e = ddbVar2;
    }

    public final zzfpz a(zzfpi zzfpiVar) {
        return b(new cpn(zzfpiVar, 13));
    }

    public final zzfpz b(zzhcg zzhcgVar) {
        zzfqa zzfqaVar = this.f;
        zzhdi zzhdiVar = zzfqaVar.a;
        return new zzfpz(zzfqaVar, this.a, this.b, this.c, this.d, zzhcy.h(this.e, zzhcgVar, zzhdiVar));
    }

    public final zzfpz c(long j) {
        zzfqa zzfqaVar = this.f;
        ScheduledExecutorService scheduledExecutorService = zzfqaVar.b;
        return new zzfpz(zzfqaVar, this.a, this.b, this.c, this.d, zzhcy.g(this.e, j, TimeUnit.SECONDS, scheduledExecutorService));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfpp d() {
        zzfqa zzfqaVar = this.f;
        Object obj = this.a;
        String str = this.b;
        if (str == null) {
            str = zzfqaVar.b(obj);
        }
        zzfpp zzfppVar = new zzfpp(obj, str, this.e);
        zzfqaVar.c.p0(new fjn(zzfppVar, 17));
        nkn nknVar = new nkn(this, zzfppVar, false, 22);
        hsn hsnVar = zzcgj.h;
        this.c.addListener(nknVar, hsnVar);
        zzfppVar.addListener(new vlo(0 == true ? 1 : 0, zzfppVar, new f0o(this, zzfppVar, 0 == true ? 1 : 0, 15)), hsnVar);
        return zzfppVar;
    }
}
