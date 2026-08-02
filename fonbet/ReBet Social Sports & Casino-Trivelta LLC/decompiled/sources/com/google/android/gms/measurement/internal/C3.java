package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzrb;
import com.twilio.voice.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class C3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f33314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N3 f33316c;

    public C3(N3 n32, zzbg zzbgVar, String str) {
        this.f33314a = zzbgVar;
        this.f33315b = str;
        Objects.requireNonNull(n32);
        this.f33316c = n32;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3228c5 c3228c5;
        byte[] bArr;
        S6 s62;
        Z6 z62;
        S6 s63;
        D2 d22;
        C3298l3 c3298l3;
        zzic zzicVar;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        zzhz zzhzVar;
        B a10;
        long j10;
        byte[] bArr2;
        N3 n32 = this.f33316c;
        n32.O0().E();
        C3228c5 J02 = n32.O0().J0();
        J02.h();
        C3298l3 c3298l32 = J02.f33578a;
        C3298l3.q();
        zzbg zzbgVar = this.f33314a;
        AbstractC3191o.m(zzbgVar);
        String str2 = this.f33315b;
        AbstractC3191o.g(str2);
        String str3 = zzbgVar.f34435a;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            J02.f33578a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        S6 s64 = J02.f34418b;
        zzhz zzh = zzib.zzh();
        s64.F0().r0();
        try {
            D2 J03 = s64.F0().J0(str2);
            if (J03 == null) {
                J02.f33578a.a().v().b("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (J03.d()) {
                    zzic zzaE = zzid.zzaE();
                    zzaE.zza(1);
                    zzaE.zzC(Constants.PLATFORM_ANDROID);
                    if (!TextUtils.isEmpty(J03.o0())) {
                        zzaE.zzL(J03.o0());
                    }
                    if (!TextUtils.isEmpty(J03.H0())) {
                        zzaE.zzJ((String) AbstractC3191o.m(J03.H0()));
                    }
                    if (!TextUtils.isEmpty(J03.D0())) {
                        zzaE.zzM((String) AbstractC3191o.m(J03.D0()));
                    }
                    if (J03.F0() != -2147483648L) {
                        zzaE.zzaj((int) J03.F0());
                    }
                    zzaE.zzN(J03.J0());
                    zzaE.zzar(J03.b());
                    String r02 = J03.r0();
                    if (!TextUtils.isEmpty(r02)) {
                        zzaE.zzad(r02);
                    }
                    zzaE.zzay(J03.X());
                    V3 g10 = J02.f34418b.g(str2);
                    zzaE.zzY(J03.L0());
                    if (c3298l32.g() && J02.f33578a.w().k(zzaE.zzK()) && g10.o(U3.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzaE.zzam(null);
                    }
                    zzaE.zzat(g10.k());
                    if (g10.o(U3.AD_STORAGE) && J03.P()) {
                        Pair m10 = s64.L0().m(J03.o0(), g10);
                        if (J03.P() && !TextUtils.isEmpty((CharSequence) m10.first)) {
                            try {
                                zzaE.zzQ(C3228c5.m((String) m10.first, Long.toString(zzbgVar.f34438d)));
                                Object obj2 = m10.second;
                                if (obj2 != null) {
                                    zzaE.zzT(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                J02.f33578a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                s62 = J02.f34418b;
                                s62.F0().t0();
                                return bArr;
                            }
                        }
                    }
                    C3298l3 c3298l33 = J02.f33578a;
                    c3298l33.K().l();
                    zzaE.zzF(Build.MODEL);
                    c3298l33.K().l();
                    zzaE.zzE(Build.VERSION.RELEASE);
                    zzaE.zzI((int) c3298l33.K().o());
                    zzaE.zzH(c3298l33.K().p());
                    try {
                        if (g10.o(U3.ANALYTICS_STORAGE) && J03.p0() != null) {
                            zzaE.zzW(C3228c5.m((String) AbstractC3191o.m(J03.p0()), Long.toString(zzbgVar.f34438d)));
                        }
                        if (!TextUtils.isEmpty(J03.x0())) {
                            zzaE.zzah((String) AbstractC3191o.m(J03.x0()));
                        }
                        String o02 = J03.o0();
                        S6 s65 = J02.f34418b;
                        List C02 = s65.F0().C0(o02);
                        Iterator it = C02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z62 = null;
                                break;
                            }
                            z62 = (Z6) it.next();
                            if ("_lte".equals(z62.f33792c)) {
                                break;
                            }
                        }
                        if (z62 == null || z62.f33794e == null) {
                            Z6 z63 = new Z6(o02, "auto", "_lte", J02.f33578a.e().a(), 0L);
                            C02.add(z63);
                            s65.F0().A0(z63);
                        }
                        zziu[] zziuVarArr = new zziu[C02.size()];
                        for (int i10 = 0; i10 < C02.size(); i10++) {
                            zzit zzm = zziu.zzm();
                            zzm.zzb(((Z6) C02.get(i10)).f33792c);
                            zzm.zza(((Z6) C02.get(i10)).f33793d);
                            s65.K0().G(zzm, ((Z6) C02.get(i10)).f33794e);
                            zziuVarArr[i10] = (zziu) zzm.zzbc();
                        }
                        zzaE.zzq(Arrays.asList(zziuVarArr));
                        S6 s66 = J02.f34418b;
                        s66.n(J03, zzaE);
                        s66.o(J03, zzaE);
                        C3400y2 a11 = C3400y2.a(zzbgVar);
                        C3298l3 c3298l34 = J02.f33578a;
                        b7 C10 = c3298l34.C();
                        Bundle bundle2 = a11.f34397d;
                        C10.w(bundle2, s65.F0().G(str2));
                        c3298l34.C().u(a11, c3298l34.w().w(str2));
                        bundle2.putLong("_c", 1L);
                        c3298l34.a().v().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = zzbgVar.f34437c;
                        bundle2.putString("_o", str4);
                        if (c3298l34.C().P(zzaE.zzK(), J03.l0())) {
                            c3298l34.C().A(bundle2, "_dbg", 1L);
                            c3298l34.C().A(bundle2, "_r", 1L);
                        }
                        C3357t F02 = s65.F0();
                        String str5 = zzbgVar.f34435a;
                        B v02 = F02.v0(str2, str5);
                        if (v02 == null) {
                            d22 = J03;
                            c3298l3 = c3298l34;
                            zzicVar = zzaE;
                            s63 = s66;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            a10 = new B(str2, str5, 0L, 0L, 0L, zzbgVar.f34438d, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                            zzhzVar = zzh;
                        } else {
                            s63 = s66;
                            d22 = J03;
                            c3298l3 = c3298l34;
                            zzicVar = zzaE;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            zzhzVar = zzh;
                            long j11 = v02.f33288f;
                            a10 = v02.a(zzbgVar.f34438d);
                            j10 = j11;
                        }
                        B b10 = a10;
                        s65.F0().w0(b10);
                        C3298l3 c3298l35 = J02.f33578a;
                        long j12 = zzbgVar.f34438d;
                        boolean z11 = z10;
                        D2 d23 = d22;
                        zzic zzicVar2 = zzicVar;
                        S6 s67 = s63;
                        try {
                            A a12 = new A(c3298l35, str, str2, str5, j12, j10, bundle);
                            zzhr zzk = zzhs.zzk();
                            zzk.zzo(a12.f33264d);
                            zzk.zzl(a12.f33262b);
                            zzk.zzq(a12.f33265e);
                            zzbe zzbeVar = a12.f33266f;
                            C c10 = new C(zzbeVar);
                            while (c10.hasNext()) {
                                String next = c10.next();
                                zzhv zzn = zzhw.zzn();
                                zzn.zzb(next);
                                Object g11 = zzbeVar.g(next);
                                if (g11 != null) {
                                    s65.K0().H(zzn, g11);
                                    zzk.zzg(zzn);
                                }
                            }
                            zzicVar2.zzg(zzk);
                            zzie zza = zzig.zza();
                            zzht zza2 = zzhu.zza();
                            zza2.zzb(b10.f33285c);
                            zza2.zza(str5);
                            zza.zza(zza2);
                            zzicVar2.zzap(zza);
                            zzicVar2.zzaf(s65.I0().m(d23.o0(), Collections.EMPTY_LIST, zzicVar2.zzk(), Long.valueOf(zzk.zzn()), Long.valueOf(zzk.zzn()), false));
                            if (zzk.zzm()) {
                                zzicVar2.zzv(zzk.zzn());
                                zzicVar2.zzx(zzk.zzn());
                            }
                            long B02 = d23.B0();
                            if (B02 != 0) {
                                zzicVar2.zzA(B02);
                            }
                            long z02 = d23.z0();
                            if (z02 != 0) {
                                zzicVar2.zzy(z02);
                            } else if (B02 != 0) {
                                zzicVar2.zzy(B02);
                            }
                            String t02 = d23.t0();
                            zzrb.zza();
                            if (c3298l3.w().H(str2, AbstractC3209a2.f33827N0) && t02 != null) {
                                zzicVar2.zzau(t02);
                            }
                            d23.l();
                            zzicVar2.zzZ((int) d23.g());
                            c3298l3.w().A();
                            zzicVar2.zzO(133005L);
                            zzicVar2.zzs(c3298l3.e().a());
                            zzicVar2.zzae(z11);
                            s67.x(zzicVar2.zzK(), zzicVar2);
                            zzhzVar.zze(zzicVar2);
                            d23.A0(zzicVar2.zzu());
                            d23.C0(zzicVar2.zzw());
                            s65.F0().K0(d23, false, false);
                            s65.F0().s0();
                            s65.F0().t0();
                            try {
                                return s65.K0().V(((zzib) zzhzVar.zzbc()).zzcc());
                            } catch (IOException e11) {
                                J02.f33578a.a().o().c("Data loss. Failed to bundle and serialize. appId", C3392x2.x(str2), e11);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c3228c5 = J02;
                            c3228c5.f34418b.F0().t0();
                            throw th;
                        }
                    } catch (SecurityException e12) {
                        c3228c5 = J02;
                        try {
                            c3228c5.f33578a.a().v().b("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            s62 = c3228c5.f34418b;
                            s62.F0().t0();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                            c3228c5.f34418b.F0().t0();
                            throw th;
                        }
                    }
                }
                J02.f33578a.a().v().b("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            s64.F0().t0();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            c3228c5 = J02;
            c3228c5.f34418b.F0().t0();
            throw th;
        }
    }
}
