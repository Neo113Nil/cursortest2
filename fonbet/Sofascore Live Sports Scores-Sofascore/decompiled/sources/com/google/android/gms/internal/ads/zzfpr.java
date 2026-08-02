package com.google.android.gms.internal.ads;

import defpackage.mio;
import defpackage.msg;
import defpackage.rlo;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfpr {
    public final Object a;
    public final List b;
    public final /* synthetic */ zzfqa c;

    public /* synthetic */ zzfpr(zzfqa zzfqaVar, Object obj, List list) {
        this.c = zzfqaVar;
        this.a = obj;
        this.b = list;
    }

    public final zzfpz a(Callable callable) {
        mio mioVar = zzgxm.b;
        List list = this.b;
        list.getClass();
        zzhcx zzhcxVar = new zzhcx(zzgxm.x(list), true);
        rlo a = zzhcxVar.a(zzcgj.h, msg.f);
        zzfqa zzfqaVar = this.c;
        return new zzfpz(zzfqaVar, this.a, null, a, list, zzhcxVar.a(zzfqaVar.a, callable));
    }
}
