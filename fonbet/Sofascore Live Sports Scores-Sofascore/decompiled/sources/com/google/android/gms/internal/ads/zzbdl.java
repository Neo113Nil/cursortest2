package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdl extends zzbdt {
    public final StackTraceElement[] h;

    public zzbdl(zzbcg zzbcgVar, zzaya zzayaVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(zzbcgVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzayaVar, i, 45);
        this.h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.h;
        if (stackTraceElementArr != null) {
            zzbbx zzbbxVar = new zzbbx((String) this.e.invoke(null, stackTraceElementArr));
            zzaya zzayaVar = this.d;
            synchronized (zzayaVar) {
                try {
                    long longValue = zzbbxVar.a.longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).Q(longValue);
                    if (zzbbxVar.b.booleanValue()) {
                        int i = true != zzbbxVar.c.booleanValue() ? 2 : 1;
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).v0(i);
                    } else {
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).v0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
