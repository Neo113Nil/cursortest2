package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zztm {
    public final Context a;
    public Boolean b;

    public zztm(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public final zzqw a(zzd zzdVar, zzv zzvVar) {
        int i;
        Boolean bool;
        boolean booleanValue;
        int i2;
        zzvVar.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || (i = zzvVar.J) == -1) {
            return zzqw.d;
        }
        Boolean bool2 = this.b;
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            Context context = this.a;
            if (context != null) {
                String parameters = zzcj.a(context).getParameters("offloadVariableRateSupported");
                bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = bool;
            } else {
                bool = Boolean.FALSE;
                this.b = bool;
            }
            booleanValue = bool.booleanValue();
        }
        String str = zzvVar.o;
        str.getClass();
        int g = zzas.g(str, zzvVar.k);
        if (g != 0) {
            switch (g) {
                case 2:
                case 3:
                    i2 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i2 = 21;
                    break;
                case 7:
                case 8:
                    i2 = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i2 = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                default:
                    i2 = Integer.MAX_VALUE;
                    break;
                case 14:
                    i2 = 25;
                    break;
                case 20:
                    i2 = 30;
                    break;
                case 21:
                case 22:
                    i2 = 31;
                    break;
                case 30:
                case 31:
                    i2 = 34;
                    break;
            }
            if (i3 >= i2) {
                int i4 = zzvVar.I;
                if (i4 == -1) {
                    i4 = zzfm.e(zzvVar.H);
                }
                if (i4 == 0) {
                    return zzqw.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(i4).setEncoding(g).build();
                    if (i3 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, zzdVar.a());
                        if ((directPlaybackSupport & 1) == 0) {
                            return zzqw.d;
                        }
                        r4 = (directPlaybackSupport & 3) == 3;
                        zzqv zzqvVar = new zzqv();
                        zzqvVar.a = true;
                        zzqvVar.b = r4;
                        zzqvVar.c = booleanValue;
                        return zzqvVar.a();
                    }
                    if (i3 < 31) {
                        if (!AudioManager.isOffloadedPlaybackSupported(build, zzdVar.a())) {
                            return zzqw.d;
                        }
                        zzqv zzqvVar2 = new zzqv();
                        zzqvVar2.a = true;
                        zzqvVar2.c = booleanValue;
                        return zzqvVar2.a();
                    }
                    int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, zzdVar.a());
                    if (playbackOffloadSupport == 0) {
                        return zzqw.d;
                    }
                    zzqv zzqvVar3 = new zzqv();
                    if (i3 > 32 && playbackOffloadSupport == 2) {
                        r4 = true;
                    }
                    zzqvVar3.a = true;
                    zzqvVar3.b = r4;
                    zzqvVar3.c = booleanValue;
                    return zzqvVar3.a();
                } catch (IllegalArgumentException unused) {
                    return zzqw.d;
                }
            }
        }
        return zzqw.d;
    }

    public zztm() {
        this(null);
    }
}
