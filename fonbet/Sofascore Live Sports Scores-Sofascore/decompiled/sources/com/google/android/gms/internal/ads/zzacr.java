package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.fxh;
import defpackage.m10;
import defpackage.mio;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzacr {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final fxh d;

    public zzacr(Context context, Runnable runnable, Boolean bool) {
        AudioManager a = context == null ? null : zzcj.a(context);
        if (a == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = a.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.c = handler;
        fxh fxhVar = new fxh(this, runnable);
        this.d = fxhVar;
        spatializer.addOnSpatializerStateChangedListener(new m10(handler, 5), fxhVar);
    }

    public final boolean a() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean b() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final boolean c(zzd zzdVar, zzv zzvVar) {
        int i;
        if (this.a == null || !this.b || !a() || !b()) {
            return false;
        }
        String str = zzvVar.o;
        int i2 = zzvVar.H;
        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            if (i2 == 16) {
                i = 12;
            }
            i = i2;
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i2 == -1) {
                i = 6;
            }
            i = i2;
        } else {
            if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                i = 24;
            }
            i = i2;
        }
        int i3 = zzvVar.I;
        if (i3 == -1 || i2 != i) {
            i3 = zzfm.e(i);
        }
        if (i3 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(i3);
        int i4 = zzvVar.J;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(zzdVar.a(), channelMask.build());
    }

    public final List d() {
        if (this.a == null || !this.b || !a() || !b()) {
            mio mioVar = zzgxm.b;
            return s.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return zzgxm.t(252);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final void e() {
        fxh fxhVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (fxhVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(fxhVar);
        handler.removeCallbacksAndMessages(null);
    }
}
