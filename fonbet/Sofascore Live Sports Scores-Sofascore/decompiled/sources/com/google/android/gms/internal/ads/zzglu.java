package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import defpackage.b0a;
import defpackage.ddb;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzglu implements zzgac {
    public final Context a;
    public final zzgqc b;
    public final String c;
    public final long d;
    public final long e;

    public zzglu(Context context, zzgei zzgeiVar, zzgqc zzgqcVar) {
        this.a = context;
        this.c = zzgeiVar.V();
        this.d = zzgeiVar.c0();
        this.e = zzgeiVar.d0();
        this.b = zzgqcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap hashMap) {
        String str;
        ddb ddbVar;
        zzaza zzazaVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hashMap.put("v", this.c);
        hashMap.put("t", new Throwable());
        try {
            ddbVar = (ddb) hashMap.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (ddbVar != null && ((Build.VERSION.SDK_INT < 31 || ddbVar.isDone()) && (zzazaVar = (zzaza) ddbVar.get(this.d, timeUnit)) != null && zzazaVar.z0().length() > 1)) {
            str = zzazaVar.z0();
            if (str.equals("E")) {
                try {
                    ddb ddbVar2 = (ddb) hashMap.get("ai");
                    if (ddbVar2 != null) {
                        String str2 = (String) ddbVar2.get(this.e, timeUnit);
                        if (!b0a.U(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            hashMap.put("int", str);
        }
        str = "E";
        if (str.equals("E")) {
        }
        hashMap.put("int", str);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zzb() {
        HashMap a = this.b.a();
        a(a);
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zzc() {
        HashMap b = this.b.b(this.a, null);
        a(b);
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zzd() {
        HashMap c = this.b.c();
        a(c);
        return c;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final HashMap zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
