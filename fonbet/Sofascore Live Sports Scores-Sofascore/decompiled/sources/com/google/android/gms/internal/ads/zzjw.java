package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import defpackage.b1l;
import defpackage.fjn;
import defpackage.nso;
import defpackage.py3;
import defpackage.qc4;
import defpackage.v9f;
import defpackage.w00;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjw {
    public static final /* synthetic */ int l = 0;
    public final Context a;
    public final zzff b;
    public final fjn c;
    public final w00 d;
    public zzgvc e;
    public zzgvc f;
    public final py3 g;
    public final Looper h;
    public final zznl i;
    public boolean j;
    public final zzjg k;

    static {
        String str = zzfm.a;
        String a = zzgts.a(Build.DEVICE);
        if (a.contains("emulator") || a.contains("emu64a") || a.contains("emu64x")) {
            return;
        }
        a.contains("generic");
    }

    public zzjw(Context context, b1l b1lVar) {
        fjn fjnVar = new fjn(b1lVar, 24);
        w00 w00Var = new w00(context, 4);
        qc4 qc4Var = new qc4(context, 6);
        v9f v9fVar = v9f.p;
        py3 py3Var = new py3(context, 3);
        context.getClass();
        this.a = context;
        this.c = fjnVar;
        this.d = w00Var;
        this.e = qc4Var;
        this.f = v9fVar;
        this.g = py3Var;
        String str = zzfm.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        zzd zzdVar = zzd.b;
        this.i = zznl.b;
        this.k = new zzjg(zzfm.u(20L), zzfm.u(500L));
        this.b = zzdp.a;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = nso.a;
        }
    }
}
