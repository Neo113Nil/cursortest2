package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import defpackage.b9p;
import defpackage.fl0;
import defpackage.muo;
import defpackage.p9p;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvh implements zzvn {
    public final Context a;
    public final boolean b;

    public zzvh(Context context) {
        this.a = context;
        this.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzvp a(zzvm zzvmVar) {
        String str;
        MediaCodec mediaCodec;
        p9p muoVar;
        fl0 fl0Var;
        Surface surface;
        Context context;
        zzvs zzvsVar;
        MediaCodec createByCodecName;
        int i = Build.VERSION.SDK_INT;
        fl0 fl0Var2 = null;
        r4 = null;
        MediaCodec mediaCodec2 = null;
        fl0Var2 = null;
        int i2 = 0;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            try {
                zzvsVar = zzvmVar.a;
                String str2 = zzvsVar.a;
                Trace.beginSection("createCodec:".concat(str2));
                createByCodecName = MediaCodec.createByCodecName(str2);
                Trace.endSection();
            } catch (IOException e) {
                e = e;
            } catch (RuntimeException e2) {
                e = e2;
            }
            try {
                Trace.beginSection("configureCodec");
                Surface surface2 = zzvmVar.d;
                if (surface2 == null && zzvsVar.h && i >= 35) {
                    i2 = 8;
                }
                createByCodecName.configure(zzvmVar.b, surface2, (MediaCrypto) null, i2);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zzwm(createByCodecName, zzvmVar.e);
            } catch (IOException e3) {
                e = e3;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                }
                throw e;
            }
        }
        int f = zzas.f(zzvmVar.c.o);
        switch (f) {
            case -2:
                str = "none";
                break;
            case -1:
                str = "unknown";
                break;
            case 0:
                str = BuildConfig.FLAVOR;
                break;
            case 1:
                str = "audio";
                break;
            case 2:
                str = "video";
                break;
            case 3:
                str = "text";
                break;
            case 4:
                str = "image";
                break;
            case 5:
                str = TtmlNode.TAG_METADATA;
                break;
            default:
                str = "camera motion";
                break;
        }
        zzeh.b("Creating an asynchronous MediaCodec adapter for track type ".concat(str));
        zzuz zzuzVar = new zzuz(f);
        zzuzVar.c = this.b;
        zzvs zzvsVar2 = zzvmVar.a;
        String str3 = zzvsVar2.a;
        try {
            StringBuilder sb = new StringBuilder(str3.length() + 12);
            sb.append("createCodec:");
            sb.append(str3);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str3);
            try {
                try {
                    if (zzuzVar.c && i >= 36) {
                        muoVar = new muo(mediaCodec, 6);
                        i2 = 4;
                        fl0Var = new fl0(mediaCodec, (HandlerThread) zzuzVar.a.mo792zza(), muoVar, zzvmVar.e);
                        Trace.endSection();
                        surface = zzvmVar.d;
                        if (surface == null && zzvsVar2.h && i >= 35) {
                            i2 |= 8;
                        }
                        fl0Var.G(zzvmVar.b, surface, i2);
                        return fl0Var;
                    }
                    Trace.endSection();
                    surface = zzvmVar.d;
                    if (surface == null) {
                        i2 |= 8;
                    }
                    fl0Var.G(zzvmVar.b, surface, i2);
                    return fl0Var;
                } catch (Exception e5) {
                    e = e5;
                    fl0Var2 = fl0Var;
                    if (fl0Var2 != null) {
                        fl0Var2.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                HandlerThread handlerThread = (HandlerThread) zzuzVar.b.mo792zza();
                zzff zzffVar = zzdp.a;
                muoVar = new b9p(mediaCodec, handlerThread, new zzdt());
                fl0Var = new fl0(mediaCodec, (HandlerThread) zzuzVar.a.mo792zza(), muoVar, zzvmVar.e);
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Exception e7) {
            e = e7;
            mediaCodec = null;
        }
    }

    @Deprecated
    public zzvh() {
        this.a = null;
    }
}
