package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.a70;
import defpackage.c7p;
import defpackage.dno;
import defpackage.fn0;
import defpackage.kn0;
import defpackage.ln0;
import defpackage.xto;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzti implements zzrj {
    public final Context a;
    public final c7p b;
    public zzeg c;
    public zzdp d;
    public zzql e;
    public zzqr f;
    public Looper g;
    public Context h;
    public final zztm i;

    public /* synthetic */ zzti(zztg zztgVar) {
        Context context = zztgVar.a;
        this.a = context;
        zztm zztmVar = zztgVar.c;
        zztmVar.getClass();
        this.i = zztmVar;
        this.e = zztgVar.b;
        this.b = context == null ? null : new c7p(this);
        this.d = zzdp.a;
    }

    public final zzre a(zzrc zzrcVar) {
        d(zzrcVar);
        zzv zzvVar = zzrcVar.a;
        zzd zzdVar = zzrcVar.b;
        zzqw a = this.i.a(zzdVar, zzvVar);
        zzrd zzrdVar = new zzrd();
        int i = 0;
        if (!Objects.equals(zzvVar.o, MimeTypes.AUDIO_RAW) ? this.e.b(zzdVar, zzvVar) != null : zzvVar.K == 2) {
            i = 2;
        }
        zzrdVar.d = i;
        zzrdVar.a = a.a;
        zzrdVar.b = a.b;
        zzrdVar.c = a.c;
        return zzrdVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzri b(zzrc zzrcVar) {
        int intValue;
        int intValue2;
        char c;
        int i;
        int i2;
        int i3;
        int max;
        int i4;
        int i5;
        int b;
        d(zzrcVar);
        zzv zzvVar = zzrcVar.a;
        zzd zzdVar = zzrcVar.b;
        String str = zzvVar.o;
        int i6 = zzvVar.H;
        int i7 = zzvVar.J;
        if (Objects.equals(str, MimeTypes.AUDIO_RAW)) {
            intValue = zzvVar.K;
            zzguk.a(zzfm.d(intValue));
            intValue2 = zzvVar.I;
            if (intValue2 == -1) {
                intValue2 = zzfm.e(i6);
            }
            i = zzfm.f(intValue) * i6;
            c = 0;
        } else {
            zzqw zzqwVar = zzqw.d;
            Pair b2 = this.e.b(zzdVar, zzvVar);
            if (b2 == null) {
                throw new zzra("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
            intValue = ((Integer) b2.first).intValue();
            intValue2 = ((Integer) b2.second).intValue();
            c = 2;
            i = -1;
        }
        int i8 = zzvVar.j;
        if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS) && i8 == -1) {
            i8 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i7, intValue2, intValue);
        zzguk.f(minBufferSize != -2);
        if (i == -1) {
            i = 1;
        }
        if (c != 0) {
            if (c != 1) {
                if (intValue == 5) {
                    i4 = 500000;
                } else if (intValue == 8) {
                    i4 = 1000000;
                    i5 = 8;
                    if (i8 == -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        b = zzhaz.a(i8, 8);
                    } else {
                        b = zzagl.b(i5);
                        zzguk.f(b != -2147483647);
                    }
                    max = zzhbj.a((i4 * b) / 1000000);
                } else {
                    i4 = 250000;
                }
                i5 = intValue;
                if (i8 == -1) {
                }
                max = zzhbj.a((i4 * b) / 1000000);
            } else {
                int b3 = zzagl.b(intValue);
                zzguk.f(b3 != -2147483647);
                max = zzhbj.a((b3 * 50000000) / 1000000);
            }
            i2 = -1;
            i3 = intValue2;
        } else {
            long j = i7;
            i2 = -1;
            i3 = intValue2;
            long j2 = i;
            int a = zzhbj.a(((250000 * j) * j2) / 1000000);
            int a2 = zzhbj.a(((750000 * j) * j2) / 1000000);
            String str2 = zzfm.a;
            max = Math.max(a, Math.min(minBufferSize * 4, a2));
        }
        int max2 = (((Math.max(minBufferSize, max) + i) + i2) / i) * i;
        zzrh zzrhVar = new zzrh();
        zzrhVar.b = i7;
        zzrhVar.c = i3;
        zzrhVar.a = intValue;
        zzrhVar.d = max2;
        zzrhVar.f = zzrcVar.d;
        zzrhVar.e = zzdVar;
        zzrhVar.g = zzrcVar.e;
        return new zzri(zzrhVar);
    }

    public final zztd c(zzri zzriVar) {
        Context context;
        try {
            int i = zzriVar.f;
            int i2 = zzriVar.g;
            Context context2 = null;
            if (i2 != -1 && (context = this.a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.h;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.h = context.createDeviceContext(i2);
                }
                context2 = this.h;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzriVar.e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzriVar.b).setChannelMask(zzriVar.c).setEncoding(zzriVar.a).build()).setTransferMode(1).setBufferSizeInBytes(zzriVar.d).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i3 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new zztd(build, zzriVar, this.b, this.d);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzrf();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzrf(e);
        }
    }

    public final void d(zzrc zzrcVar) {
        Context context;
        zzql a;
        AudioDeviceInfo audioDeviceInfo = zzrcVar.c;
        zzd zzdVar = zzrcVar.b;
        e();
        zzqr zzqrVar = this.f;
        if (zzqrVar == null && (context = this.a) != null) {
            zzqr zzqrVar2 = new zzqr(context, new xto(this, 7), zzdVar, audioDeviceInfo);
            this.f = zzqrVar2;
            if (zzqrVar2.k) {
                a = zzqrVar2.h;
                a.getClass();
            } else {
                zzqrVar2.k = true;
                ln0 ln0Var = zzqrVar2.f;
                if (ln0Var != null) {
                    ln0Var.b.registerContentObserver(ln0Var.c, false, ln0Var);
                }
                Context context2 = zzqrVar2.a;
                AudioManager a2 = zzcj.a(context2);
                kn0 kn0Var = zzqrVar2.d;
                Handler handler = zzqrVar2.c;
                a2.registerAudioDeviceCallback(kn0Var, handler);
                if (Build.VERSION.SDK_INT >= 32 && zzqrVar2.g == null) {
                    zzqrVar2.g = new zzacr(context2, new dno(zzqrVar2, 17), Boolean.valueOf(zzfm.j(context2)));
                }
                a = zzql.a(context2, context2.registerReceiver(zzqrVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), zzqrVar2.j, zzqrVar2.i, zzqrVar2.a());
                zzqrVar2.h = a;
            }
            this.e = a;
        } else if (zzqrVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(zzqrVar.i)) {
                zzqrVar.i = audioDeviceInfo;
                Context context3 = zzqrVar.a;
                zzd zzdVar2 = zzqrVar.j;
                List a3 = zzqrVar.a();
                s sVar = zzql.e;
                zzqrVar.b(zzql.a(context3, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context3, null), zzdVar2, audioDeviceInfo, a3));
            }
            zzqr zzqrVar3 = this.f;
            if (!zzdVar.equals(zzqrVar3.j)) {
                zzqrVar3.j = zzdVar;
                Context context4 = zzqrVar3.a;
                AudioDeviceInfo audioDeviceInfo2 = zzqrVar3.i;
                List a4 = zzqrVar3.a();
                s sVar2 = zzql.e;
                zzqrVar3.b(zzql.a(context4, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context4, null), zzdVar, audioDeviceInfo2, a4));
            }
        }
        this.e.getClass();
    }

    public final void e() {
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.g;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (z) {
            this.g = myLooper;
        } else {
            a70.r(zzgvb.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
