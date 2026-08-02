package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import defpackage.bgf;
import defpackage.fn0;
import defpackage.kn0;
import defpackage.ln0;
import defpackage.mio;
import defpackage.xto;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqr {
    public final Context a;
    public final xto b;
    public final Handler c;
    public final kn0 d;
    public final com.facebook.internal.d e;
    public final ln0 f;
    public zzacr g;
    public zzql h;
    public AudioDeviceInfo i;
    public zzd j;
    public boolean k;

    public zzqr(Context context, xto xtoVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        zzqr zzqrVar;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = xtoVar;
        this.j = zzdVar;
        this.i = audioDeviceInfo;
        String str = zzfm.a;
        Looper myLooper = Looper.myLooper();
        ln0 ln0Var = null;
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.c = handler;
        this.d = new kn0(this, 1);
        this.e = new com.facebook.internal.d(this, 22);
        s sVar = zzql.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        if (uriFor != null) {
            zzqrVar = this;
            ln0Var = new ln0(zzqrVar, handler, applicationContext.getContentResolver(), uriFor, 1);
        } else {
            zzqrVar = this;
        }
        zzqrVar.f = ln0Var;
    }

    public final List a() {
        zzacr zzacrVar;
        if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.g) != null) {
            return zzacrVar.d();
        }
        mio mioVar = zzgxm.b;
        return s.e;
    }

    public final void b(zzql zzqlVar) {
        if (!this.k || zzqlVar.equals(this.h)) {
            return;
        }
        this.h = zzqlVar;
        zzti zztiVar = (zzti) this.b.b;
        zztiVar.e();
        zzql zzqlVar2 = zztiVar.e;
        if (zzqlVar2 == null || zzqlVar.equals(zzqlVar2)) {
            return;
        }
        zztiVar.e = zzqlVar;
        zzeg zzegVar = zztiVar.c;
        if (zzegVar != null) {
            zzegVar.c(-1, bgf.p);
            zzegVar.d();
        }
    }

    public final void c() {
        List a = a();
        zzd zzdVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        s sVar = zzql.e;
        Context context = this.a;
        b(zzql.a(context, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context, null), zzdVar, audioDeviceInfo, a));
    }
}
