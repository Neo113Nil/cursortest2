package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzdb;
import com.google.android.gms.internal.wearable.zzdg;
import defpackage.a70;
import defpackage.d6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzdb<MessageType extends zzdg<MessageType, BuilderType>, BuilderType extends zzdb<MessageType, BuilderType>> extends zzbq<MessageType, BuilderType> {
    public final zzdg a;
    public zzdg b;

    public zzdb(zzdg zzdgVar) {
        this.a = zzdgVar;
        if (zzdgVar.e()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = (zzdg) zzdgVar.d(4, null);
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final boolean c() {
        return zzdg.m(this.b, false);
    }

    @Override // com.google.android.gms.internal.wearable.zzbq
    public final Object clone() {
        zzdb zzdbVar = (zzdb) this.a.d(5, null);
        boolean e = this.b.e();
        zzdg zzdgVar = this.b;
        if (e) {
            zzdgVar.getClass();
            d6o.c.a(zzdgVar.getClass()).c(zzdgVar);
            zzdgVar.h();
            zzdgVar = this.b;
        }
        zzdbVar.b = zzdgVar;
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.wearable.zzbq
    /* renamed from: e */
    public final zzdb clone() {
        zzdb zzdbVar = (zzdb) this.a.d(5, null);
        boolean e = this.b.e();
        zzdg zzdgVar = this.b;
        if (e) {
            zzdgVar.getClass();
            d6o.c.a(zzdgVar.getClass()).c(zzdgVar);
            zzdgVar.h();
            zzdgVar = this.b;
        }
        zzdbVar.b = zzdgVar;
        return zzdbVar;
    }

    public final void i() {
        if (this.b.e()) {
            return;
        }
        zzdg zzdgVar = (zzdg) this.a.d(4, null);
        d6o.c.a(zzdgVar.getClass()).a(zzdgVar, this.b);
        this.b = zzdgVar;
    }

    public final zzdg j() {
        boolean e = this.b.e();
        zzdg zzdgVar = this.b;
        if (e) {
            zzdgVar.getClass();
            d6o.c.a(zzdgVar.getClass()).c(zzdgVar);
            zzdgVar.h();
            zzdgVar = this.b;
        }
        zzdgVar.getClass();
        if (zzdg.m(zzdgVar, true)) {
            return zzdgVar;
        }
        throw new zzfh();
    }

    @Override // com.google.android.gms.internal.wearable.zzek
    public final zzdg zzw() {
        boolean e = this.b.e();
        zzdg zzdgVar = this.b;
        if (!e) {
            return zzdgVar;
        }
        zzdgVar.getClass();
        d6o.c.a(zzdgVar.getClass()).c(zzdgVar);
        zzdgVar.h();
        return this.b;
    }
}
