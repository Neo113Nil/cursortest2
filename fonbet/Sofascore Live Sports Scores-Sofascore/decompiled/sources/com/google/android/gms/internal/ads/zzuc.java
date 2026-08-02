package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.auo;
import defpackage.dno;
import defpackage.g7p;
import defpackage.gmo;
import defpackage.gvo;
import defpackage.i4p;
import defpackage.jgo;
import defpackage.jyo;
import defpackage.ln0;
import defpackage.mio;
import defpackage.o5i;
import defpackage.p7p;
import defpackage.uvn;
import defpackage.vvo;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzuc extends zzvz implements zzmf {
    public final zztw A0;
    public final zzvl B0;
    public int C0;
    public boolean D0;
    public zzv E0;
    public zzv F0;
    public long G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public boolean M0;
    public long N0;
    public final Context y0;
    public final zzry z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuc(Context context, zzvh zzvhVar, Handler handler, auo auoVar, zztw zztwVar) {
        super(context.getApplicationContext(), 1, zzvhVar);
        zzvl zzvlVar = Build.VERSION.SDK_INT >= 35 ? new zzvl(0) : null;
        this.y0 = context.getApplicationContext();
        this.A0 = zztwVar;
        this.B0 = zzvlVar;
        this.L0 = -1000;
        this.z0 = new zzry(handler, auoVar);
        this.N0 = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r1.isEmpty() ? null : (com.google.android.gms.internal.ads.zzvs) r1.get(0)) != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    @Override // com.google.android.gms.internal.ads.zzvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int W(zzv zzvVar) {
        int i;
        zzt zztVar;
        s b;
        boolean z;
        String str = zzvVar.o;
        if (!zzas.a(str)) {
            return 128;
        }
        int i2 = zzvVar.P;
        int i3 = 1;
        boolean z2 = i2 == 0;
        zztw zztwVar = this.A0;
        if (z2) {
            if (i2 != 0) {
                List a = zzwl.a(MimeTypes.AUDIO_RAW, false, false);
            }
            zzre a2 = zztwVar.p.a(zztwVar.n(zzvVar));
            zzqv zzqvVar = new zzqv();
            zzqvVar.a = a2.a;
            zzqvVar.b = a2.b;
            zzqvVar.c = a2.c;
            zzqw a3 = zzqvVar.a();
            if (a3.a) {
                i = true != a3.b ? 512 : 1536;
                if (a3.c) {
                    i |= com.ironsource.mediationsdk.metadata.a.o;
                }
            } else {
                i = 0;
            }
            if (zztwVar.o(zzvVar) != 0) {
                return i | 172;
            }
            if (MimeTypes.AUDIO_RAW.equals(str) || zztwVar.o(zzvVar) != 0) {
                int i4 = zzvVar.H;
                int i5 = zzvVar.J;
                zztVar = new zzt();
                zztVar.d(MimeTypes.AUDIO_RAW);
                zztVar.G = i4;
                zztVar.I = i5;
                zztVar.J = 2;
                if (zztwVar.o(new zzv(zztVar)) != 0) {
                    if (zzvVar.o == null) {
                        mio mioVar = zzgxm.b;
                        b = s.e;
                    } else {
                        if (zztwVar.o(zzvVar) != 0) {
                            List a4 = zzwl.a(MimeTypes.AUDIO_RAW, false, false);
                            zzvs zzvsVar = a4.isEmpty() ? null : (zzvs) a4.get(0);
                            if (zzvsVar != null) {
                                b = zzgxm.t(zzvsVar);
                            }
                        }
                        b = zzwl.b(zzvVar, false, false);
                    }
                    if (!b.isEmpty()) {
                        if (z2) {
                            zzvs zzvsVar2 = (zzvs) b.get(0);
                            Context context = this.y0;
                            boolean b2 = zzvsVar2.b(context, zzvVar);
                            if (!b2) {
                                for (int i6 = 1; i6 < b.d; i6++) {
                                    zzvs zzvsVar3 = (zzvs) b.get(i6);
                                    if (zzvsVar3.b(context, zzvVar)) {
                                        z = false;
                                        b2 = true;
                                        zzvsVar2 = zzvsVar3;
                                        break;
                                    }
                                }
                            }
                            z = true;
                            int i7 = true != b2 ? 3 : 4;
                            int i8 = 8;
                            if (b2 && zzvsVar2.c(zzvVar)) {
                                i8 = 16;
                            }
                            return i7 | i8 | 32 | (true != zzvsVar2.g ? 0 : 64) | (true != z ? 0 : 128) | i;
                        }
                        i3 = 2;
                    }
                }
            }
            return i3 | 128;
        }
        i = 0;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
        }
        int i42 = zzvVar.H;
        int i52 = zzvVar.J;
        zztVar = new zzt();
        zztVar.d(MimeTypes.AUDIO_RAW);
        zztVar.G = i42;
        zztVar.I = i52;
        zztVar.J = 2;
        if (zztwVar.o(new zzv(zztVar)) != 0) {
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final ArrayList X(zzv zzvVar) {
        s b;
        if (zzvVar.o == null) {
            mio mioVar = zzgxm.b;
            b = s.e;
        } else {
            if (this.A0.o(zzvVar) != 0) {
                List a = zzwl.a(MimeTypes.AUDIO_RAW, false, false);
                zzvs zzvsVar = a.isEmpty() ? null : (zzvs) a.get(0);
                if (zzvsVar != null) {
                    b = zzgxm.t(zzvsVar);
                }
            }
            b = zzwl.b(zzvVar, false, false);
        }
        HashMap hashMap = zzwl.a;
        ArrayList arrayList = new ArrayList(b);
        Collections.sort(arrayList, new o5i(new gvo(14, this.y0, zzvVar), 5));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean Y(zzv zzvVar) {
        p();
        return this.A0.o(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm Z(zzvs zzvsVar, zzv zzvVar, float f) {
        int i;
        zzv[] zzvVarArr = this.j;
        zzvVarArr.getClass();
        int length = zzvVarArr.length;
        String str = zzvsVar.a;
        "OMX.google.raw.decoder".equals(str);
        int i2 = zzvVar.p;
        int i3 = 0;
        if (length != 1) {
            for (zzv zzvVar2 : zzvVarArr) {
                if (zzvsVar.d(zzvVar, zzvVar2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i2 = Math.max(i2, zzvVar2.p);
                }
            }
        }
        this.C0 = i2;
        this.D0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzvsVar.c;
        int i4 = this.C0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i5 = zzvVar.H;
        mediaFormat.setInteger("channel-count", i5);
        int i6 = zzvVar.J;
        mediaFormat.setInteger("sample-rate", i6);
        zzek.a(mediaFormat, zzvVar.r);
        zzek.b(mediaFormat, "max-input-size", i4);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzvVar.o;
        if ("audio/ac4".equals(str3)) {
            Pair b = zzdr.b(zzvVar);
            if (b != null) {
                zzek.b(mediaFormat, "profile", ((Integer) b.first).intValue());
                zzek.b(mediaFormat, "level", ((Integer) b.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        zzt zztVar = new zzt();
        zztVar.d(MimeTypes.AUDIO_RAW);
        zztVar.G = i5;
        zztVar.I = i6;
        zztVar.J = 4;
        zzv zzvVar3 = new zzv(zztVar);
        zztw zztwVar = this.A0;
        if (zztwVar.o(zzvVar3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i7 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.L0));
        }
        zzv zzvVar4 = null;
        if (Objects.equals(str3, "audio/iamf")) {
            zzti zztiVar = zztwVar.p;
            zzql zzqlVar = zztiVar != null ? zztiVar.e : null;
            int i8 = 12;
            if (zzqlVar == null) {
                zzeh.c("AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                zzgxw zzgxwVar = zzua.a;
                Iterator it = zzqlVar.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = 0;
                        break;
                    }
                    Integer num = (Integer) it.next();
                    i = num.intValue();
                    if (zzua.a.contains(num)) {
                        break;
                    }
                }
                if (i != 0) {
                    i8 = i;
                } else {
                    Iterator it2 = zzqlVar.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) it2.next();
                        int intValue = num2.intValue();
                        if (zzua.a.contains(num2)) {
                            i3 = intValue;
                            break;
                        }
                    }
                    if (i3 != 0) {
                        i8 = i3;
                    }
                }
                int bitCount = Integer.bitCount(i8);
                mediaFormat.setInteger("channel-mask", i8);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        q0(mediaFormat);
        if (MimeTypes.AUDIO_RAW.equals(zzvsVar.b) && !MimeTypes.AUDIO_RAW.equals(str3)) {
            zzvVar4 = zzvVar;
        }
        this.F0 = zzvVar4;
        return new zzvm(zzvsVar, mediaFormat, zzvVar, null, this.B0);
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final String a() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzjf a0(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i;
        int i2;
        zzjf d = zzvsVar.d(zzvVar, zzvVar2);
        int i3 = d.e;
        if (this.G == null && Y(zzvVar2)) {
            i3 |= 32768;
        }
        "OMX.google.raw.decoder".equals(zzvsVar.a);
        if (zzvVar2.p > this.C0) {
            i3 |= 64;
        }
        String str = zzvsVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = d.d;
        }
        return new zzjf(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long b0(long j, long j2) {
        long w;
        zztw zztwVar = this.A0;
        boolean z = zztwVar.t() && this.N0 != C.TIME_UNSET;
        if (this.M0) {
            if (!zztwVar.l()) {
                w = -9223372036854775807L;
            } else if (zztwVar.n.c()) {
                w = zzfm.v(((zzri) zztwVar.n.e).b, zztwVar.r.c());
            } else {
                long c = zztwVar.r.c();
                int b = zzagl.b(((zzri) zztwVar.n.e).a);
                zzguk.f(b != -2147483647);
                w = zzfm.w(c, 1000000L, b, RoundingMode.DOWN);
            }
            if (this.K0 && z && w != C.TIME_UNSET) {
                float min = Math.min(w, this.N0 - j);
                zzav zzavVar = zztwVar.v;
                return Math.max(Ua.s, (long) ((min / (zzavVar != null ? zzavVar.a : 1.0f)) / 2.0f));
            }
        } else if (z || this.m0) {
            return 1000000L;
        }
        return Ua.s;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final float c0(float f, zzv zzvVar, zzv[] zzvVarArr) {
        int i = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.J;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            MediaFormat mediaFormat = this.M;
            i = (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) ? -1 : mediaFormat.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void d0(long j, long j2, String str) {
        zzry zzryVar = this.z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new i4p(zzryVar, str, j, j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void e(zzav zzavVar) {
        float f = zzavVar.a;
        String str = zzfm.a;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.b, 8.0f)));
        zztw zztwVar = this.A0;
        zztwVar.v = zzavVar2;
        p7p p7pVar = new p7p(zzavVar2, C.TIME_UNSET, C.TIME_UNSET);
        if (zztwVar.l()) {
            zztwVar.t = p7pVar;
        } else {
            zztwVar.u = p7pVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void e0(String str) {
        zzry zzryVar = this.z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new i4p(zzryVar, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public final void f(int i, Object obj) {
        zzvl zzvlVar;
        zztw zztwVar = this.A0;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (zztwVar.G != floatValue) {
                zztwVar.G = floatValue;
                if (zztwVar.l()) {
                    zztwVar.r.a.setVolume(zztwVar.G);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            zzd zzdVar = (zzd) obj;
            zzdVar.getClass();
            if (zztwVar.s.equals(zzdVar)) {
                return;
            }
            zztwVar.s = zzdVar;
            zztwVar.j();
            return;
        }
        if (i == 6) {
            zze zzeVar = (zze) obj;
            zzeVar.getClass();
            if (zztwVar.Q.equals(zzeVar)) {
                return;
            }
            zztwVar.Q = zzeVar;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            zztwVar.R = audioDeviceInfo;
            zztd zztdVar = zztwVar.r;
            if (zztdVar != null) {
                zztdVar.f(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.L0 = ((Integer) obj).intValue();
            zzvp zzvpVar = this.K;
            if (zzvpVar == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.L0));
            zzvpVar.j(bundle);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            int i2 = zztwVar.S;
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (i2 == intValue) {
                return;
            }
            zztwVar.S = intValue;
            zztwVar.j();
            return;
        }
        if (i == 9) {
            obj.getClass();
            zztwVar.w = ((Boolean) obj).booleanValue();
            p7p p7pVar = new p7p(zztwVar.v, C.TIME_UNSET, C.TIME_UNSET);
            if (zztwVar.l()) {
                zztwVar.t = p7pVar;
                return;
            } else {
                zztwVar.u = p7pVar;
                return;
            }
        }
        if (i != 10) {
            super.f(i, obj);
            return;
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        if (zztwVar.P) {
            if (zztwVar.O == intValue2) {
                zztwVar.P = false;
            }
            if (Build.VERSION.SDK_INT >= 35 || (zzvlVar = this.B0) == null) {
            }
            zzvlVar.a(intValue2);
            return;
        }
        if (zztwVar.O != intValue2) {
            zztwVar.O = intValue2;
            zztwVar.j();
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void f0(Exception exc) {
        zzeh.f("Audio codec error", exc);
        zzry zzryVar = this.z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new i4p(zzryVar, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void g(long j, boolean z, boolean z2) {
        super.g(j, z, z2);
        this.A0.a();
        this.G0 = j;
        this.N0 = C.TIME_UNSET;
        this.J0 = false;
        this.K0 = false;
        this.H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzjf g0(zzma zzmaVar) {
        zzv zzvVar = zzmaVar.b;
        zzvVar.getClass();
        this.E0 = zzvVar;
        zzjf g0 = super.g0(zzmaVar);
        zzry zzryVar = this.z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new jgo(15, zzryVar, zzvVar, g0));
        }
        return g0;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean h() {
        if (!this.m0) {
            return false;
        }
        zztw zztwVar = this.A0;
        if (zztwVar.l()) {
            return zztwVar.K && !zztwVar.t();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void h0(zzv zzvVar, MediaFormat mediaFormat) {
        int integer;
        zzxo zzxoVar;
        zzv zzvVar2 = this.F0;
        zzhbf zzhbfVar = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (this.K != null) {
            mediaFormat.getClass();
            int integer2 = MimeTypes.AUDIO_RAW.equals(zzvVar.o) ? zzvVar.K : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzfm.b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            int integer3 = mediaFormat.getInteger("channel-count");
            int i = zzvVar.I;
            if (i == -1 || zzvVar.H != integer3) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer3) {
                i = integer;
            }
            zzt zztVar = new zzt();
            zztVar.d(MimeTypes.AUDIO_RAW);
            zztVar.J = integer2;
            zztVar.K = zzvVar.L;
            zztVar.L = zzvVar.M;
            zztVar.k = zzvVar.l;
            zztVar.a = zzvVar.a;
            zztVar.b = zzvVar.b;
            zztVar.c = zzgxm.x(zzvVar.c);
            zztVar.d = zzvVar.d;
            zztVar.e = zzvVar.e;
            zztVar.f = zzvVar.f;
            zztVar.G = integer3;
            zztVar.H = i;
            zztVar.I = mediaFormat.getInteger("sample-rate");
            zzvVar = new zzv(zztVar);
            if (this.D0) {
                int i2 = zzvVar.H;
                if (i2 == 3) {
                    zzhbfVar = zzahv.a;
                } else if (i2 == 5) {
                    zzhbfVar = zzahv.b;
                } else if (i2 == 6) {
                    zzhbfVar = zzahv.c;
                } else if (i2 == 7) {
                    zzhbfVar = zzahv.d;
                } else if (i2 != 8) {
                    zzhbf zzhbfVar2 = zzahv.a;
                } else {
                    zzhbfVar = zzahv.e;
                }
            }
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i3 >= 29) {
                if (this.Z) {
                    p();
                }
                zzguk.f(i3 >= 29);
            }
            zztw zztwVar = this.A0;
            zzsa zzsaVar = new zzsa(zzvVar);
            zzsaVar.b = zzhbfVar;
            zzbf zzbfVar = this.p;
            zzsaVar.c = zzbfVar;
            zzsaVar.d = this.q;
            if (!zzbfVar.g() && (zzxoVar = zzsaVar.d) != null) {
                if (zzsaVar.c.e(zzxoVar.a) == -1) {
                    z = false;
                }
                zzguk.a(z);
            }
            zztwVar.p(new zzsb(zzsaVar));
            r0(this.L);
        } catch (zzsd e) {
            throw q(e, e.a, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void i0() {
        this.A0.C = true;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void j() {
        this.A0.q();
        this.M0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean j0(long j, long j2, zzvp zzvpVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) {
        byteBuffer.getClass();
        this.N0 = C.TIME_UNSET;
        if (this.F0 != null && (i2 & 2) != 0) {
            zzvpVar.getClass();
            zzvpVar.k(i);
            return true;
        }
        zztw zztwVar = this.A0;
        if (z) {
            if (zzvpVar != null) {
                zzvpVar.k(i);
            }
            this.o0.f += i3;
            zztwVar.C = true;
            return true;
        }
        try {
            if (!zztwVar.r(j3, i3, byteBuffer)) {
                this.N0 = j3;
                return false;
            }
            if (zzvpVar != null) {
                zzvpVar.k(i);
            }
            this.o0.e += i3;
            return true;
        } catch (zzse e) {
            zzv zzvVar2 = this.E0;
            if (this.Z) {
                p();
            }
            throw q(e, zzvVar2, false, IronSourceConstants.errorCode_biddingDataException);
        } catch (zzsh e2) {
            if (this.Z) {
                p();
            }
            throw q(e2, zzvVar, e2.b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void k() {
        x0();
        this.M0 = false;
        zztw zztwVar = this.A0;
        zztwVar.N = false;
        if (zztwVar.l()) {
            zztd zztdVar = zztwVar.r;
            g7p g7pVar = zztdVar.e;
            g7pVar.k = 0L;
            g7pVar.t = 0;
            g7pVar.s = 0;
            g7pVar.l = 0L;
            g7pVar.y = C.TIME_UNSET;
            g7pVar.z = C.TIME_UNSET;
            if (g7pVar.u == C.TIME_UNSET) {
                g7pVar.h.b(0);
            }
            g7pVar.w = g7pVar.c();
            if (!zztdVar.j || zztdVar.b()) {
                zztdVar.a.pause();
            }
        }
        this.K0 = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void k0(zzjc zzjcVar) {
        zzry zzryVar = this.z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new vvo(6, zzryVar, zzjcVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void l() {
        zzry zzryVar = this.z0;
        this.I0 = true;
        this.E0 = null;
        this.N0 = C.TIME_UNSET;
        boolean z = false;
        this.K0 = false;
        int i = 5;
        try {
            try {
                this.A0.a();
                super.l();
                zzje zzjeVar = this.o0;
                synchronized (zzjeVar) {
                }
                Handler handler = zzryVar.a;
                if (handler != null) {
                    handler.post(new jyo(zzryVar, zzjeVar, z, i));
                }
            } catch (Throwable th) {
                super.l();
                zzje zzjeVar2 = this.o0;
                synchronized (zzjeVar2) {
                    Handler handler2 = zzryVar.a;
                    if (handler2 != null) {
                        handler2.post(new jyo(zzryVar, zzjeVar2, z, i));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            zzje zzjeVar3 = this.o0;
            synchronized (zzjeVar3) {
                Handler handler3 = zzryVar.a;
                if (handler3 != null) {
                    handler3.post(new jyo(zzryVar, zzjeVar3, z, i));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void l0() {
        try {
            this.A0.s();
            long j = this.p0.f;
            if (j != C.TIME_UNSET) {
                this.N0 = j;
            }
        } catch (zzsh e) {
            throw q(e, e.c, e.b, true != this.Z ? IronSourceConstants.errorCode_isReadyException : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void m() {
        zztw zztwVar = this.A0;
        this.J0 = false;
        this.K0 = false;
        this.N0 = C.TIME_UNSET;
        try {
            super.m();
            if (this.I0) {
                this.I0 = false;
                zztwVar.b();
            }
        } catch (Throwable th) {
            if (this.I0) {
                this.I0 = false;
                zztwVar.b();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void m0(long j) {
        this.A0.F = j;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    public final void n() {
        zzvl zzvlVar;
        zzacr zzacrVar;
        zzti zztiVar = this.A0.p;
        zzeg zzegVar = zztiVar.c;
        if (zzegVar != null) {
            zzegVar.e();
        }
        zzqr zzqrVar = zztiVar.f;
        if (zzqrVar != null && zzqrVar.k) {
            zzqrVar.h = null;
            Context context = zzqrVar.a;
            zzcj.a(context).unregisterAudioDeviceCallback(zzqrVar.d);
            if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = zzqrVar.g) != null) {
                zzacrVar.e();
                zzqrVar.g = null;
            }
            context.unregisterReceiver(zzqrVar.e);
            ln0 ln0Var = zzqrVar.f;
            if (ln0Var != null) {
                ln0Var.b.unregisterContentObserver(ln0Var);
            }
            zzqrVar.k = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (zzvlVar = this.B0) == null) {
            return;
        }
        zzvlVar.d();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void n0(zziy zziyVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zziyVar.b) == null || !Objects.equals(zzvVar.o, MimeTypes.AUDIO_OPUS) || !this.Z) {
            return;
        }
        ByteBuffer byteBuffer = zziyVar.f;
        byteBuffer.getClass();
        zziyVar.b.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            zztd zztdVar = this.A0.r;
            if (zztdVar != null) {
                zztdVar.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    public final void t(boolean z, boolean z2) {
        super.t(z, z2);
        zzje zzjeVar = this.o0;
        zzry zzryVar = this.z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new i4p(zzryVar, zzjeVar, 8));
        }
        p();
        zzqj zzqjVar = this.f;
        zzqjVar.getClass();
        zztw zztwVar = this.A0;
        zztwVar.k = zzqjVar;
        zzdp zzdpVar = this.g;
        zzdpVar.getClass();
        zztwVar.p.d = zzdpVar;
        zztwVar.l = new gmo(this, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean x() {
        return this.A0.t();
    }

    public final void x0() {
        long j;
        long j2;
        ArrayDeque arrayDeque;
        long j3;
        h();
        zztw zztwVar = this.A0;
        zztr zztrVar = zztwVar.X;
        if (!zztwVar.l() || zztwVar.D) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            long min = Math.min(zztwVar.r.d(), zzfm.v(((zzri) zztwVar.n.e).b, zztwVar.m()));
            while (true) {
                arrayDeque = zztwVar.g;
                if (arrayDeque.isEmpty() || min < ((p7p) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    zztwVar.u = (p7p) arrayDeque.remove();
                }
            }
            p7p p7pVar = zztwVar.u;
            long j4 = min - p7pVar.c;
            long y = zzfm.y(j4, p7pVar.a.a);
            if (arrayDeque.isEmpty()) {
                zzcv zzcvVar = zztrVar.c;
                if (!zzcvVar.zzc()) {
                    j = Long.MIN_VALUE;
                } else if (zzcvVar.n >= 1024) {
                    long j5 = zzcvVar.m;
                    zzcvVar.j.getClass();
                    long zza = j5 - (((uvn) r10.q).zza() * (r10.i * r10.b));
                    int i = zzcvVar.h.a;
                    int i2 = zzcvVar.g.a;
                    j = Long.MIN_VALUE;
                    long j6 = zzcvVar.n;
                    j4 = i == i2 ? zzfm.w(j4, zza, j6, RoundingMode.DOWN) : zzfm.w(j4, zza * i, j6 * i2, RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    j4 = (long) (zzcvVar.c * j4);
                }
                p7p p7pVar2 = zztwVar.u;
                j3 = p7pVar2.b + j4;
                p7pVar2.d = j4 - y;
            } else {
                j = Long.MIN_VALUE;
                p7p p7pVar3 = zztwVar.u;
                j3 = p7pVar3.b + y + p7pVar3.d;
            }
            long j7 = zztrVar.b.l;
            j2 = zzfm.v(((zzri) zztwVar.n.e).b, j7) + j3;
            long j8 = zztwVar.U;
            if (j7 > j8) {
                long v = zzfm.v(((zzri) zztwVar.n.e).b, j7 - j8);
                zztwVar.U = j7;
                zztwVar.V += v;
                Handler handler = zztwVar.W;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    zztwVar.W = handler;
                }
                handler.removeCallbacksAndMessages(null);
                zztwVar.W.postDelayed(new dno(zztwVar, 21), 100L);
            }
        }
        if (j2 != j) {
            if (!this.H0) {
                j2 = Math.max(this.G0, j2);
            }
            this.G0 = j2;
            this.H0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzg() {
        if (this.h == 2) {
            x0();
        }
        return this.G0;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzh() {
        boolean z = this.J0;
        this.J0 = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzav zzj() {
        return this.A0.v;
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzne
    public final zzmf zzd() {
        return this;
    }
}
