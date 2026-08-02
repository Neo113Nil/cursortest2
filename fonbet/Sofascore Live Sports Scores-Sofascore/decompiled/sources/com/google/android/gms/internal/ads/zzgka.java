package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgka implements zzgjz {
    public final String a;
    public final String b;
    public final zzgiw c;
    public final zzaya d;
    public final zzgrf e;

    public zzgka(String str, String str2, zzaya zzayaVar, zzgiw zzgiwVar, zzgrf zzgrfVar) {
        this.a = str;
        this.b = str2;
        this.d = zzayaVar;
        this.c = zzgiwVar;
        this.e = zzgrfVar;
    }

    public abstract void a(Method method, zzaya zzayaVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzgrf zzgrfVar = this.e;
        try {
            zzgrfVar.a();
            Method c = this.c.c(this.a, this.b);
            if (c != null) {
                a(c, this.d);
            }
            zzgrfVar.c();
            return null;
        } finally {
        }
    }
}
