package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.android.billingclient.api.BillingResult;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.ActivityMonitorData;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzafr;
import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzagb;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarr;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzcfw;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzckh;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfix;
import com.google.android.gms.internal.ads.zzfj;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzfkr;
import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzfkv;
import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhn;
import com.google.android.gms.internal.ads.zzhr;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.consent_sdk.zzay;
import com.google.android.gms.internal.consent_sdk.zzbs;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzka;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzko;
import com.google.android.gms.internal.play_billing.zzkt;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzkw;
import com.google.android.gms.internal.play_billing.zzld;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Season;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c0l implements zli, j1h, OnCompleteListener, z7p, zzay, zzafs, zzarh, zzaun, RemoteCall, zzcgq, MediationAdLoadCallback, zzhcv, zzhr, zzfkx, lyn {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public c0l(uun uunVar, Context context, String str) {
        this.a = 24;
        zzinx a = zzinx.a(context);
        zzinv zzinvVar = uunVar.N0;
        zzfix zzfixVar = new zzfix(zzinvVar, uunVar.O0, a);
        zzinv a2 = zzinv.a(new zzfki(zzinvVar));
        zzinv a3 = zzinv.a(s8o.a);
        zzinv zzinvVar2 = uunVar.d;
        zzinx zzinxVar = uunVar.L;
        int i = t8o.a;
        zzinv a4 = zzinv.a(new zzfkr(a, zzinvVar2, zzinxVar, zzfixVar, a2, a3));
        this.b = zzinv.a(new zzflb(a4, a2, a3));
        this.c = zzinv.a(new zzfkv(zzinx.b(str), a4, a, a2, a3, uunVar.j, uunVar.M, uunVar.o));
    }

    public void A(zzld zzldVar) {
        try {
            zzku r = zzkw.r();
            r.g((zzkg) this.b);
            zzka p = zzkd.p();
            p.e();
            zzkd.s((zzkd) p.b);
            p.e();
            zzkd.u((zzkd) p.b, 2);
            p.e();
            zzkd.t((zzkd) p.b, zzldVar);
            r.e();
            zzkw.v((zzkw) r.b, (zzkd) p.c());
            ((fjg) this.c).v((zzkw) r.c());
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    public void B(zzlg zzlgVar) {
        try {
            fjg fjgVar = (fjg) this.c;
            zzku r = zzkw.r();
            r.g((zzkg) this.b);
            r.e();
            zzkw.p((zzkw) r.b, zzlgVar);
            fjgVar.v((zzkw) r.c());
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    public void C(zzjl zzjlVar, zzkg zzkgVar) {
        if (zzjlVar == null) {
            return;
        }
        try {
            zzku r = zzkw.r();
            r.g(zzkgVar);
            r.e();
            zzkw.s((zzkw) r.b, zzjlVar);
            ((fjg) this.c).v((zzkw) r.c());
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    public void D(zzjp zzjpVar, zzkg zzkgVar) {
        if (zzjpVar == null) {
            return;
        }
        try {
            zzku r = zzkw.r();
            r.g(zzkgVar);
            r.e();
            zzkw.t((zzkw) r.b, zzjpVar);
            ((fjg) this.c).v((zzkw) r.c());
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzay
    public /* bridge */ /* synthetic */ c0l b(zzbs zzbsVar) {
        this.c = zzbsVar;
        return this;
    }

    @Override // defpackage.j1h
    public int c(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((j12) this.c).E(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public zzafr d(zzagi zzagiVar, long j) {
        long zzn = zzagiVar.zzn();
        int min = (int) Math.min(20000L, zzagiVar.zzo() - zzn);
        zzeu zzeuVar = (zzeu) this.c;
        zzeuVar.y(min);
        zzagiVar.h(0, min, zzeuVar.a);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (zzeuVar.B() >= 4) {
            if (agn.d(zzeuVar.b, zzeuVar.a) != 442) {
                zzeuVar.E(1);
            } else {
                zzeuVar.E(4);
                long a = djn.a(zzeuVar);
                if (a != C.TIME_UNSET) {
                    long c = ((zzfj) this.b).c(a);
                    if (c > j) {
                        return j2 == C.TIME_UNSET ? new zzafr(-1, c, zzn) : new zzafr(0, C.TIME_UNSET, zzn + i2);
                    }
                    j2 = c;
                    long j3 = 100000 + j2;
                    i2 = zzeuVar.b;
                    if (j3 > j) {
                        return new zzafr(0, C.TIME_UNSET, zzn + i2);
                    }
                }
                int i3 = zzeuVar.c;
                if (zzeuVar.B() >= 10) {
                    zzeuVar.E(9);
                    int I = zzeuVar.I() & 7;
                    if (zzeuVar.B() >= I) {
                        zzeuVar.E(I);
                        if (zzeuVar.B() >= 4) {
                            if (agn.d(zzeuVar.b, zzeuVar.a) == 443) {
                                zzeuVar.E(4);
                                int J = zzeuVar.J();
                                if (zzeuVar.B() < J) {
                                    zzeuVar.D(i3);
                                } else {
                                    zzeuVar.E(J);
                                }
                            }
                            while (true) {
                                if (zzeuVar.B() < 4) {
                                    break;
                                }
                                int d = agn.d(zzeuVar.b, zzeuVar.a);
                                if (d == 442 || d == 441 || (d >>> 8) != 1) {
                                    break;
                                }
                                zzeuVar.E(4);
                                if (zzeuVar.B() < 2) {
                                    zzeuVar.D(i3);
                                    break;
                                }
                                zzeuVar.D(Math.min(zzeuVar.c, zzeuVar.b + zzeuVar.J()));
                            }
                        } else {
                            zzeuVar.D(i3);
                        }
                    } else {
                        zzeuVar.D(i3);
                    }
                } else {
                    zzeuVar.D(i3);
                }
                i = zzeuVar.b;
            }
        }
        return j2 != C.TIME_UNSET ? new zzafr(-2, j2, zzn + i) : zzafr.d;
    }

    @Override // defpackage.j1h
    public int e(int i) {
        do {
            i = ((j12) this.c).N(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.j1h
    public int f(int i) {
        do {
            i = ((j12) this.c).E(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.j1h
    public int g(int i) {
        do {
            i = ((j12) this.c).N(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0397, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0116, code lost:
    
        if (")".equals(defpackage.r1l.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.zli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(byte[] bArr, int i, int i2, yli yliVar, wn3 wn3Var) {
        v1l v1lVar;
        String str;
        String sb;
        char c;
        int i3;
        c0l c0lVar = this;
        j9e j9eVar = (j9e) c0lVar.b;
        j9eVar.L(bArr, i + i2);
        j9eVar.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            j2l.d(j9eVar);
            while (!TextUtils.isEmpty(j9eVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    int i6 = 1;
                    if (c2 == 65535) {
                        i5 = j9eVar.b;
                        String n = j9eVar.n(StandardCharsets.UTF_8);
                        c2 = n == null ? (char) 0 : "STYLE".equals(n) ? (char) 2 : n.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        j9eVar.N(i5);
                        if (c2 == 0) {
                            sx2 sx2Var = new sx2();
                            sx2Var.a = Collections.unmodifiableList(new ArrayList(arrayList2));
                            sx2Var.b = new long[arrayList2.size() * 2];
                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                v1l v1lVar2 = (v1l) arrayList2.get(i7);
                                int i8 = i7 * 2;
                                long[] jArr = (long[]) sx2Var.b;
                                jArr[i8] = v1lVar2.b;
                                jArr[i8 + 1] = v1lVar2.c;
                            }
                            long[] jArr2 = (long[]) sx2Var.b;
                            long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                            sx2Var.c = copyOf;
                            Arrays.sort(copyOf);
                            tba.O(sx2Var, yliVar, wn3Var);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(j9eVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    a70.p("A style block was found after the first cue.");
                                    return;
                                }
                                j9eVar.n(StandardCharsets.UTF_8);
                                r1l r1lVar = (r1l) c0lVar.c;
                                j9e j9eVar2 = r1lVar.a;
                                StringBuilder sb2 = r1lVar.b;
                                sb2.setLength(0);
                                int i9 = j9eVar.b;
                                while (!TextUtils.isEmpty(j9eVar.n(StandardCharsets.UTF_8))) {
                                }
                                j9eVar2.L(j9eVar.a, j9eVar.b);
                                j9eVar2.N(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    r1l.c(j9eVar2);
                                    if (j9eVar2.a() >= 5 && "::cue".equals(j9eVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i10 = j9eVar2.b;
                                        String b = r1l.b(j9eVar2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                j9eVar2.N(i10);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i11 = j9eVar2.b;
                                                int i12 = j9eVar2.c;
                                                int i13 = z ? 1 : 0;
                                                while (i11 < i12 && i13 == 0) {
                                                    int i14 = i11 + 1;
                                                    i13 = ((char) j9eVar2.a[i11]) == ')' ? i6 : z ? 1 : 0;
                                                    i11 = i14;
                                                }
                                                str = j9eVar2.y((i11 - 1) - j9eVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(r1l.b(j9eVar2, sb2))) {
                                                t1l t1lVar = new t1l();
                                                t1lVar.a = "";
                                                t1lVar.b = "";
                                                t1lVar.c = Collections.EMPTY_SET;
                                                t1lVar.d = "";
                                                t1lVar.e = str2;
                                                t1lVar.g = z;
                                                t1lVar.i = z;
                                                t1lVar.j = i4;
                                                t1lVar.k = i4;
                                                t1lVar.l = i4;
                                                t1lVar.m = i4;
                                                t1lVar.n = i4;
                                                t1lVar.p = i4;
                                                t1lVar.q = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        Matcher matcher = r1l.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i6);
                                                            group.getClass();
                                                            t1lVar.d = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = nik.a;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        t1lVar.b = str4.substring(z ? 1 : 0, indexOf2);
                                                        t1lVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        t1lVar.b = str4;
                                                    }
                                                    if (split.length > i6) {
                                                        int length = split.length;
                                                        z1a.s(length <= split.length ? i6 : z ? 1 : 0);
                                                        t1lVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i6, length)));
                                                    }
                                                }
                                                boolean z2 = z ? 1 : 0;
                                                String str5 = str2;
                                                ?? r9 = i6;
                                                while (z2 == 0) {
                                                    int i15 = j9eVar2.b;
                                                    str5 = r1l.b(j9eVar2, sb2);
                                                    boolean z3 = (str5 == null || "}".equals(str5)) ? r9 : z;
                                                    if (z3 == 0) {
                                                        j9eVar2.N(i15);
                                                        r1l.c(j9eVar2);
                                                        String a = r1l.a(j9eVar2, sb2);
                                                        if (!a.isEmpty() && ":".equals(r1l.b(j9eVar2, sb2))) {
                                                            r1l.c(j9eVar2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z4 = false;
                                                            while (true) {
                                                                if (z4) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i16 = j9eVar2.b;
                                                                    String b2 = r1l.b(j9eVar2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        j9eVar2.N(i16);
                                                                        z4 = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i17 = j9eVar2.b;
                                                                String b3 = r1l.b(j9eVar2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        j9eVar2.N(i17);
                                                                    } else {
                                                                        continue;
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    t1lVar.f = b23.a(sb, true);
                                                                    t1lVar.g = true;
                                                                } else if ("background-color".equals(a)) {
                                                                    t1lVar.h = b23.a(sb, true);
                                                                    t1lVar.i = true;
                                                                } else if ("ruby-position".equals(a)) {
                                                                    if ("over".equals(sb)) {
                                                                        t1lVar.p = 1;
                                                                    } else if ("under".equals(sb)) {
                                                                        t1lVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a)) {
                                                                    t1lVar.q = Season.YEAR_ALL_TIME.equals(sb) || sb.startsWith("digits");
                                                                } else if ("text-decoration".equals(a)) {
                                                                    if (TtmlNode.UNDERLINE.equals(sb)) {
                                                                        t1lVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a)) {
                                                                    t1lVar.e = rz8.W(sb);
                                                                } else if ("font-weight".equals(a)) {
                                                                    if (TtmlNode.BOLD.equals(sb)) {
                                                                        t1lVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a)) {
                                                                    if (TtmlNode.ITALIC.equals(sb)) {
                                                                        t1lVar.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a)) {
                                                                    Matcher matcher2 = r1l.d.matcher(rz8.W(sb));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        switch (group2.hashCode()) {
                                                                            case 37:
                                                                                if (group2.equals("%")) {
                                                                                    c = 0;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3240:
                                                                                if (group2.equals("em")) {
                                                                                    c = 1;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3592:
                                                                                if (group2.equals("px")) {
                                                                                    c = 2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        c = 65535;
                                                                        switch (c) {
                                                                            case 0:
                                                                                i3 = 1;
                                                                                t1lVar.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i3 = 1;
                                                                                t1lVar.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i3 = 1;
                                                                                t1lVar.n = 1;
                                                                                break;
                                                                            default:
                                                                                zzl.s();
                                                                                return;
                                                                        }
                                                                        String group3 = matcher2.group(i3);
                                                                        group3.getClass();
                                                                        t1lVar.o = Float.parseFloat(group3);
                                                                    } else {
                                                                        tgj.d0("Invalid font-size: '" + sb + "'.");
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z2 = z3;
                                                    z = false;
                                                    r9 = 1;
                                                }
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(t1lVar);
                                                }
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                                i6 = 1;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = f2l.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n2 = j9eVar.n(charset);
                                if (n2 == null) {
                                    v1lVar = null;
                                } else {
                                    Pattern pattern2 = f2l.a;
                                    Matcher matcher3 = pattern2.matcher(n2);
                                    if (matcher3.matches()) {
                                        v1lVar = f2l.d(null, matcher3, j9eVar, arrayList);
                                    } else {
                                        v1lVar = null;
                                        String n3 = j9eVar.n(charset);
                                        if (n3 != null) {
                                            Matcher matcher4 = pattern2.matcher(n3);
                                            if (matcher4.matches()) {
                                                v1lVar = f2l.d(n2.trim(), matcher4, j9eVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (v1lVar != null) {
                                    arrayList2.add(v1lVar);
                                }
                            }
                            c0lVar = this;
                        }
                    }
                }
            }
        } catch (s9e e) {
            ilg.k(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public void i(zzeu zzeuVar) {
        zzarr zzarrVar = (zzarr) this.c;
        SparseArray sparseArray = zzarrVar.g;
        if (zzeuVar.I() == 0 && (zzeuVar.I() & 128) != 0) {
            zzeuVar.E(6);
            int B = zzeuVar.B() / 4;
            for (int i = 0; i < B; i++) {
                zzet zzetVar = (zzet) this.b;
                zzeuVar.F(0, 4, zzetVar.a);
                zzetVar.d(0);
                int h = zzetVar.h(16);
                zzetVar.f(3);
                if (h == 0) {
                    zzetVar.f(13);
                } else {
                    int h2 = zzetVar.h(13);
                    if (sparseArray.get(h2) == null) {
                        sparseArray.put(h2, new zzari(new gtj(zzarrVar, h2)));
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    public void k(cci cciVar, l2a l2aVar) {
        cciVar.getClass();
        zti ztiVar = (zti) this.c;
        kdc kdcVar = new kdc(27, this, cciVar, l2aVar);
        ztiVar.getClass();
        ((zbl) ztiVar).a.execute(kdcVar);
    }

    @Override // defpackage.zli
    public int l() {
        return 1;
    }

    public void m(cci cciVar, int i) {
        cciVar.getClass();
        zti ztiVar = (zti) this.c;
        hfi hfiVar = new hfi((g8f) this.b, cciVar, false, i);
        ztiVar.getClass();
        ((zbl) ztiVar).a.execute(hfiVar);
    }

    public zzagh n(Object... objArr) {
        Constructor mo792zza;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    mo792zza = ((zzagb) this.b).mo792zza();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            mo792zza = null;
        }
        if (mo792zza == null) {
            return null;
        }
        try {
            return (zzagh) mo792zza.newInstance(objArr);
        } catch (Exception e2) {
            sw9.m("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public void o(zzjl zzjlVar) {
        try {
            C(zzjlVar, (zzkg) this.b);
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((zaaa) this.c).b.remove((TaskCompletionSource) this.b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((zzbxh) this.b).a(adError.zza());
        } catch (RemoteException e) {
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public Object onSuccess(Object obj) {
        zzbxh zzbxhVar = (zzbxh) this.b;
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd != null) {
            try {
                zzbxhVar.s(new ObjectWrapper(mediationBannerAd.getView()));
            } catch (RemoteException e) {
                zzo.zzg("", e);
            }
            return new fqn((zzbwa) this.c);
        }
        zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            zzbxhVar.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
            return null;
        }
    }

    public zzfku q() {
        return (zzfku) ((zzinv) this.c).zzb();
    }

    public ewm r() {
        zzbs zzbsVar = (zzbs) this.c;
        if (zzbsVar != null) {
            return new ewm((jfn) this.b, zzbsVar);
        }
        a70.r(String.valueOf(zzbs.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    public void s(zzjl zzjlVar, int i) {
        try {
            zzke zzkeVar = (zzke) ((zzkg) this.b).k();
            zzkeVar.e();
            zzkg.C((zzkg) zzkeVar.b, i);
            this.b = (zzkg) zzkeVar.c();
            o(zzjlVar);
        } catch (Throwable unused) {
            int i2 = zzc.a;
        }
    }

    public void t(zzjl zzjlVar, int i, long j) {
        try {
            zzke zzkeVar = (zzke) ((zzkg) this.b).k();
            zzkeVar.e();
            zzkg.C((zzkg) zzkeVar.b, i);
            zzkg zzkgVar = (zzkg) zzkeVar.c();
            this.b = zzkgVar;
            if (j != 0) {
                zzke zzkeVar2 = (zzke) zzkgVar.k();
                zzkeVar2.i(j);
                zzkgVar = (zzkg) zzkeVar2.c();
            }
            C(zzjlVar, zzkgVar);
        } catch (Throwable unused) {
            int i2 = zzc.a;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Bounds{lower=" + ((u4a) this.b) + " upper=" + ((u4a) this.c) + "}";
            case 18:
                String valueOf = String.valueOf((List) this.b);
                return wt3.m("ErrorListenerSupport [errorListeners=", valueOf, new StringBuilder(valueOf.length() + 38), U3.j.e);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzbm zzbmVar = (zzbm) this.b;
        String str = (String) this.c;
        zzy zzyVar = (zzy) anyClient;
        zzbmVar.m();
        zzah zzahVar = (zzah) zzyVar.getService();
        zzyVar.getContext();
        ApiMetadata a = zzff.a();
        Parcel J = zzahVar.J();
        J.writeString(str);
        com.google.android.gms.internal.cast.zzc.b(J, a);
        zzahVar.l2(J, 5);
        synchronized (zzbmVar.t) {
            try {
                if (zzbmVar.q != null) {
                    taskCompletionSource.setException(ApiExceptionUtil.a(new Status(2001, null, null, null)));
                } else {
                    zzbmVar.q = taskCompletionSource;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(vf vfVar) {
        Iterator it = ((List) this.b).iterator();
        while (it.hasNext()) {
            ((uf) it.next()).a(vfVar);
        }
        ((t6o) this.c).e(InstrumentationData.create(System.currentTimeMillis(), vfVar, t6o.a()));
    }

    public void w(zzjl zzjlVar, long j, boolean z) {
        try {
            zzjj zzjjVar = (zzjj) zzjlVar.k();
            zzko zzkoVar = (zzko) zzjlVar.u().k();
            zzkoVar.e();
            zzkt.q((zzkt) zzkoVar.b, z);
            zzjjVar.e();
            zzjl.p((zzjl) zzjjVar.b, (zzkt) zzkoVar.c());
            zzjl zzjlVar2 = (zzjl) zzjjVar.c();
            zzkg zzkgVar = (zzkg) this.b;
            if (j != 0) {
                zzke zzkeVar = (zzke) zzkgVar.k();
                zzkeVar.i(j);
                zzkgVar = (zzkg) zzkeVar.c();
            }
            C(zzjlVar2, zzkgVar);
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    public void x(zzjl zzjlVar, int i, long j, boolean z) {
        try {
            zzke zzkeVar = (zzke) ((zzkg) this.b).k();
            zzkeVar.e();
            zzkg.C((zzkg) zzkeVar.b, i);
            this.b = (zzkg) zzkeVar.c();
            zzjj zzjjVar = (zzjj) zzjlVar.k();
            zzko zzkoVar = (zzko) zzjlVar.u().k();
            zzkoVar.e();
            zzkt.q((zzkt) zzkoVar.b, z);
            zzjjVar.e();
            zzjl.p((zzjl) zzjjVar.b, (zzkt) zzkoVar.c());
            zzjl zzjlVar2 = (zzjl) zzjjVar.c();
            zzkg zzkgVar = (zzkg) this.b;
            if (j != 0) {
                zzke zzkeVar2 = (zzke) zzkgVar.k();
                zzkeVar2.i(j);
                zzkgVar = (zzkg) zzkeVar2.c();
            }
            C(zzjlVar2, zzkgVar);
        } catch (Throwable unused) {
            int i2 = zzc.a;
        }
    }

    public void y(zzjp zzjpVar, long j, boolean z) {
        try {
            zzjn zzjnVar = (zzjn) zzjpVar.k();
            zzko zzkoVar = (zzko) zzjpVar.r().k();
            zzkoVar.e();
            zzkt.q((zzkt) zzkoVar.b, z);
            zzjnVar.e();
            zzjp.u((zzjp) zzjnVar.b, (zzkt) zzkoVar.c());
            zzjp zzjpVar2 = (zzjp) zzjnVar.c();
            zzkg zzkgVar = (zzkg) this.b;
            if (j != 0) {
                zzke zzkeVar = (zzke) zzkgVar.k();
                zzkeVar.i(j);
                zzkgVar = (zzkg) zzkeVar.c();
            }
            D(zzjpVar2, zzkgVar);
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    public void z(BillingResult billingResult, long j) {
        try {
            zzka p = zzkd.p();
            p.e();
            zzkd.u((zzkd) p.b, 4);
            zzjz zzjzVar = zzjz.IN_APP_BILLING_RESULT_UPDATE_ACTION;
            p.e();
            zzkd.q((zzkd) p.b, zzjzVar);
            if (billingResult != null) {
                zzjq q = zzju.q();
                q.h(billingResult.getResponseCode());
                String debugMessage = billingResult.getDebugMessage();
                q.e();
                zzju.s((zzju) q.b, debugMessage);
                p.e();
                zzkd.r((zzkd) p.b, (zzju) q.c());
            }
            zzku r = zzkw.r();
            zzkg zzkgVar = (zzkg) this.b;
            if (j != 0) {
                zzke zzkeVar = (zzke) zzkgVar.k();
                zzkeVar.i(j);
                zzkgVar = (zzkg) zzkeVar.c();
            }
            r.g(zzkgVar);
            r.e();
            zzkw.v((zzkw) r.b, (zzkd) p.c());
            ((fjg) this.c).v((zzkw) r.c());
        } catch (Throwable unused) {
            int i = zzc.a;
        }
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 7:
                "Failed to collect viewability data: ".concat(String.valueOf(th.getMessage()));
                break;
            case 21:
                ((zzcgq) this.c).mo17zza();
                break;
            case 25:
                break;
            case 26:
                zzcun zzcunVar = (zzcun) this.c;
                zzcunVar.h.a(zzcunVar.g.b(zzcunVar.e, zzcunVar.f, false, (String) this.b, null, zzcunVar.c(), zzcunVar.o, zzcunVar.s), null);
                break;
            default:
                if (((Boolean) zzba.zzc().a(zzbjg.y6)).booleanValue()) {
                    zzt.zzh().e("omid native display exp", th);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.z7p, com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        switch (this.a) {
            case 7:
                c7o c7oVar = (c7o) this.c;
                ((mqn) c7oVar.a).d(new lda(JavaScriptMessage$MsgChannel.activityMonitor, (JavaScriptMessage$MsgType) this.b, c7oVar.b, (ActivityMonitorData) obj, null));
                break;
            case 21:
                ((zzcgs) this.b).mo13zza(obj);
                break;
            case 25:
                ((mqn) ((exn) this.c).b).d(new lda(JavaScriptMessage$MsgChannel.nativeXhr, JavaScriptMessage$MsgType.nativeResponse, (String) this.b, (NetworkResponseData) obj, null));
                break;
            case 26:
                zzcun zzcunVar = (zzcun) this.c;
                List c = zzcunVar.c();
                zzdck zzdckVar = zzcunVar.o;
                zzcfw zzcfwVar = zzcunVar.s;
                zzcunVar.h.a(zzcunVar.g.b(zzcunVar.e, zzcunVar.f, false, (String) this.b, (String) obj, c, zzdckVar, zzcfwVar), zzcunVar.n);
                break;
            default:
                zzdqm zzdqmVar = (zzdqm) this.c;
                View view = (View) this.b;
                zzeml zzemlVar = (zzeml) obj;
                zzclm j = zzdqmVar.m.j();
                if (zzdqmVar.p.c() && zzemlVar != null && j != null && view != null) {
                    zzt.zzu().c(zzemlVar.a, view);
                    break;
                }
                break;
        }
    }

    private final void p(Throwable th) {
    }

    public /* synthetic */ c0l(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ c0l(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ c0l(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ c0l(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ c0l(jfn jfnVar) {
        this.a = 10;
        this.b = jfnVar;
    }

    public c0l(Context context, int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.c = context;
                this.b = null;
                break;
            default:
                this.b = context.getSharedPreferences("odt_storage", 0);
                this.c = new ujg(27);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    /* renamed from: zza, reason: collision with other method in class */
    public File mo16zza() {
        File file = (File) this.b;
        if (file != null) {
            return file;
        }
        File file2 = new File(((Context) this.c).getCacheDir(), "volley");
        this.b = file2;
        return file2;
    }

    @Override // com.google.android.gms.internal.ads.zzcgq
    /* renamed from: zza, reason: collision with other method in class */
    public void mo17zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        ((zzcgo) this.b).zzd(new zzbup("Unable to obtain a JavascriptEngine."));
        ((zzbug) this.c).d();
    }

    public c0l(Context context, zzkg zzkgVar) {
        this.a = 29;
        fjg fjgVar = new fjg();
        try {
            gyj.b(context);
            fjgVar.b = gyj.a().c(zc2.e).a("PLAY_BILLING_LIBRARY", new kn5("proto"), new kwj() { // from class: com.android.billingclient.api.zzds
                @Override // defpackage.kwj
                public final Object apply(Object obj) {
                    return ((zzkw) obj).b();
                }
            });
        } catch (Throwable unused) {
            fjgVar.a = true;
        }
        this.c = fjgVar;
        this.b = zzkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public /* synthetic */ zzhs zza() {
        switch (this.a) {
            case 22:
                zzcku zzckuVar = (zzcku) this.b;
                zzhs zza = ((zzhr) this.c).zza();
                d1l d1lVar = new d1l(zzckuVar, 10);
                return new zzckh(zzckuVar.c, zza, zzckuVar.p, zzckuVar.q, zzckuVar, d1lVar);
            default:
                int i = zzcku.w;
                zzhs zza2 = ((zzhr) this.b).zza();
                byte[] bArr = (byte[]) this.c;
                return new jtn(new zzhn(bArr), bArr.length, zza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public void a(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
    }

    public c0l(zaaa zaaaVar, TaskCompletionSource taskCompletionSource) {
        this.a = 6;
        this.b = taskCompletionSource;
        Objects.requireNonNull(zaaaVar);
        this.c = zaaaVar;
    }

    public c0l(zzagb zzagbVar) {
        this.a = 9;
        this.b = zzagbVar;
        this.c = new AtomicBoolean(false);
    }

    public c0l(zzarr zzarrVar) {
        this.a = 13;
        this.c = zzarrVar;
        this.b = new zzet(new byte[4], 4);
    }

    public /* synthetic */ c0l(zzfj zzfjVar) {
        this.a = 12;
        this.b = zzfjVar;
        this.c = new zzeu();
    }

    public /* synthetic */ c0l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public c0l(t6o t6oVar) {
        this.a = 18;
        this.b = Collections.synchronizedList(new ArrayList(1));
        this.c = t6oVar;
    }

    public c0l(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new j9e();
                this.c = new r1l();
                break;
            default:
                this.b = new i1d(new Reference[16], 0);
                this.c = new ReferenceQueue();
                break;
        }
    }

    public c0l(g8f g8fVar, zti ztiVar) {
        this.a = 4;
        g8fVar.getClass();
        ztiVar.getClass();
        this.b = g8fVar;
        this.c = ztiVar;
    }

    public c0l(WindowInsetsAnimation.Bounds bounds) {
        this.a = 2;
        this.b = b9l.g(bounds);
        this.c = b9l.f(bounds);
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public void zzb() {
        byte[] bArr = zzfm.b;
        int length = bArr.length;
        ((zzeu) this.c).z(0, bArr);
    }
}
