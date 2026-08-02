package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.wao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzfys {
    public final Context a;
    public final Looper b;

    public zzfys(Context context, Looper looper) {
        this.a = context;
        this.b = looper;
    }

    public final void a(String str) {
        zzfzc D = zzfze.D();
        Context context = this.a;
        String packageName = context.getPackageName();
        D.n();
        ((zzfze) D.b).E(packageName);
        D.n();
        ((zzfze) D.b).G(2);
        zzfza D2 = zzfzb.D();
        D2.n();
        ((zzfzb) D2.b).E(str);
        D2.n();
        ((zzfzb) D2.b).F(2);
        D.n();
        ((zzfze) D.b).F((zzfzb) D2.o());
        wao waoVar = new wao(context, this.b, (zzfze) D.o());
        synchronized (waoVar.c) {
            try {
                if (!waoVar.d) {
                    waoVar.d = true;
                    waoVar.a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
