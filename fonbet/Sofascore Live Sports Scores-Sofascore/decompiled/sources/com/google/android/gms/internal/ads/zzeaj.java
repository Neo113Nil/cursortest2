package com.google.android.gms.internal.ads;

import defpackage.hsn;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeaj {
    public final zzeao a;
    public final hsn b;
    public final HashMap c;

    public zzeaj(zzeao zzeaoVar, hsn hsnVar) {
        this.a = zzeaoVar;
        zzeaoVar.getClass();
        this.c = new HashMap(zzeaoVar.a);
        this.b = hsnVar;
    }

    public final zzeai a() {
        zzeai zzeaiVar = new zzeai(this);
        zzeaiVar.a.putAll(this.c);
        return zzeaiVar;
    }

    public final void b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.nd)).booleanValue()) {
            zzeai a = a();
            a.b("action", "pecr");
            a.c();
        }
    }
}
