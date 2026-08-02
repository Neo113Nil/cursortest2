package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbdt implements Callable {
    public final zzbcg a;
    public final String b;
    public final String c;
    public final zzaya d;
    public Method e;
    public final int f;
    public final int g;

    public zzbdt(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        this.a = zzbcgVar;
        this.b = str;
        this.c = str2;
        this.d = zzayaVar;
        this.f = i;
        this.g = i2;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzbcg zzbcgVar = this.a;
            Method d = zzbcgVar.d(this.b, this.c);
            this.e = d;
            if (d == null) {
                return null;
            }
            a();
            zzbax zzbaxVar = zzbcgVar.k;
            if (zzbaxVar == null || (i = this.f) == Integer.MIN_VALUE) {
                return null;
            }
            zzbaxVar.a(this.g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
