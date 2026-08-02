package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzbkq {
    public final String a;
    public final Object b;
    public final int c;

    public zzbkq(int i, Object obj, String str) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static zzbkq a(String str, boolean z) {
        return new zzbkq(1, Boolean.valueOf(z), str);
    }

    public static zzbkq b(long j, String str) {
        return new zzbkq(2, Long.valueOf(j), str);
    }

    public final Object c() {
        zzblx zzblxVar = (zzblx) zzblz.a.get();
        Object obj = this.b;
        if (zzblxVar != null) {
            int i = this.c - 1;
            String str = this.a;
            return i != 0 ? i != 1 ? i != 2 ? zzblxVar.a(str, (String) obj) : zzblxVar.b(str, ((Double) obj).doubleValue()) : zzblxVar.d(((Long) obj).longValue(), str) : zzblxVar.c(str, ((Boolean) obj).booleanValue());
        }
        AtomicReference atomicReference = zzblz.b;
        if (((zzbly) atomicReference.get()) != null) {
            ((zzbly) atomicReference.get()).zza();
        }
        return obj;
    }
}
