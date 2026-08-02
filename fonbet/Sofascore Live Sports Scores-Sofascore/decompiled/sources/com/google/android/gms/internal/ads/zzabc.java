package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.bjo;
import defpackage.cjo;
import defpackage.d4a;
import defpackage.djo;
import defpackage.ejg;
import defpackage.en0;
import defpackage.f2n;
import defpackage.g7h;
import defpackage.gio;
import defpackage.hjo;
import defpackage.ijo;
import defpackage.mio;
import defpackage.o5n;
import defpackage.q6i;
import defpackage.s6;
import defpackage.v4n;
import defpackage.xwo;
import defpackage.y5n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabc extends zzabi implements zznf {
    public static final gio k = new gio();
    public final Object c;
    public final Context d;
    public zzaaq e;
    public Thread f;
    public zzacr g;
    public zzd h;
    public Boolean i;
    public final zzzx j;

    public zzabc(Context context) {
        zzzx zzzxVar = new zzzx();
        zzaaq zzaaqVar = zzaaq.F;
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.j = zzzxVar;
        if (zzaaqVar != null) {
            this.e = zzaaqVar;
        } else {
            zzaap zzaapVar = new zzaap(zzaaqVar);
            zzaapVar.a(zzaaqVar);
            zzaaqVar = new zzaaq(zzaapVar);
            this.e = zzaaqVar;
        }
        this.h = zzd.b;
        if (zzaaqVar.A && context == null) {
            zzeh.c("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static Pair h(zzabd[] zzabdVarArr, int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzabd zzabdVar = zzabdVarArr[i2];
            if (zzabdVar != null && zzabdVar.a.c == i) {
                return Pair.create(zzabdVar, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static final Pair i(int i, zzabh zzabhVar, int[][][] iArr, zzaat zzaatVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzabh zzabhVar2 = zzabhVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzabhVar2.a[i2]) {
                zzzr zzzrVar = zzabhVar2.b[i2];
                for (int i3 = 0; i3 < zzzrVar.a; i3++) {
                    zzbg a = zzzrVar.a(i3);
                    s o = zzaatVar.o(i2, a, iArr[i2][i3]);
                    int i4 = a.a;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        y5n y5nVar = (y5n) o.get(i5);
                        int zza = y5nVar.zza();
                        if (!zArr[i5] && zza != 0) {
                            if (zza == 1) {
                                randomAccess = zzgxm.t(y5nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(y5nVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    y5n y5nVar2 = (y5n) o.get(i7);
                                    if (y5nVar2.zza() == 2 && y5nVar.a(y5nVar2)) {
                                        arrayList2.add(y5nVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzabhVar2 = zzabhVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((y5n) list.get(i8)).c;
        }
        y5n y5nVar3 = (y5n) list.get(0);
        return Pair.create(new zzabd(y5nVar3.b, iArr2), Integer.valueOf(y5nVar3.a));
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int k(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.d)) {
            return 4;
        }
        String j = j(str);
        String j2 = j(zzvVar.d);
        if (j2 == null || j == null) {
            return (z && j2 == null) ? 1 : 0;
        }
        if (j2.startsWith(j) || j.startsWith(j2)) {
            return 3;
        }
        String str2 = zzfm.a;
        return j2.split("-", 2)[0].equals(j.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ int l(zzv zzvVar, zzgxm zzgxmVar) {
        int i = 0;
        while (i < zzgxmVar.size()) {
            int i2 = 0;
            while (true) {
                zzgxm zzgxmVar2 = zzvVar.c;
                if (i2 < zzgxmVar2.size()) {
                    if (((zzx) zzgxmVar2.get(i2)).b.equals(zzgxmVar.get(i))) {
                        return i;
                    }
                    i2++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static final zzabd m(zzzr zzzrVar, int[][] iArr, zzaaq zzaaqVar) {
        zzaaqVar.q.getClass();
        int i = 0;
        zzbg zzbgVar = null;
        o5n o5nVar = null;
        for (int i2 = 0; i2 < zzzrVar.a; i2++) {
            zzbg a = zzzrVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a.a; i3++) {
                if (zzng.d(iArr2[i3], zzaaqVar.B)) {
                    o5n o5nVar2 = new o5n(a.d[i3], iArr2[i3]);
                    if (o5nVar != null) {
                        if (zzgwz.a.d(o5nVar2.b, o5nVar.b).d(o5nVar2.a, o5nVar.a).e() <= 0) {
                        }
                    }
                    zzbgVar = a;
                    i = i3;
                    o5nVar = o5nVar2;
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzabd(zzbgVar, new int[]{i});
    }

    public static void o(zzabh zzabhVar, zzbl zzblVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 2; i++) {
            zzzr zzzrVar = zzabhVar.b[i];
            for (int i2 = 0; i2 < zzzrVar.a; i2++) {
                if (((zzbh) zzblVar.u.get(zzzrVar.a(i2))) != null) {
                    throw null;
                }
            }
        }
        zzzr zzzrVar2 = zzabhVar.d;
        for (int i3 = 0; i3 < zzzrVar2.a; i3++) {
            if (((zzbh) zzblVar.u.get(zzzrVar2.a(i3))) != null) {
                throw null;
            }
        }
        for (int i4 = 0; i4 < 2; i4++) {
            if (((zzbh) hashMap.get(Integer.valueOf(zzabhVar.a[i4]))) != null) {
                throw null;
            }
        }
    }

    public static void p(zzabh zzabhVar, zzaaq zzaaqVar, zzabd[] zzabdVarArr) {
        for (int i = 0; i < 2; i++) {
            zzzr zzzrVar = zzabhVar.b[i];
            Map map = (Map) zzaaqVar.D.get(i);
            if (map != null && map.containsKey(zzzrVar)) {
                Map map2 = (Map) zzaaqVar.D.get(i);
                if ((map2 != null ? (zzaar) map2.get(zzzrVar) : null) != null) {
                    throw null;
                }
                zzabdVarArr[i] = null;
            }
        }
    }

    public static void q(zzabh zzabhVar, zzaaq zzaaqVar, zzabd[] zzabdVarArr) {
        for (int i = 0; i < 2; i++) {
            int i2 = zzabhVar.a[i];
            if (zzaaqVar.E.get(i) || zzaaqVar.v.contains(Integer.valueOf(i2))) {
                zzabdVarArr[i] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void a() {
        zzacr zzacrVar;
        synchronized (this.c) {
            try {
                Thread thread = this.f;
                if (thread != null) {
                    zzguk.g("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.g) != null) {
            zzacrVar.e();
            this.g = null;
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void c(zzd zzdVar) {
        if (this.h.equals(zzdVar)) {
            return;
        }
        this.h = zzdVar;
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzabi
    public final Pair g(zzabh zzabhVar, int[][][] iArr, int[] iArr2) {
        zzaaq zzaaqVar;
        String str;
        int i;
        int i2;
        long j;
        zzzx zzzxVar;
        zzaaq zzaaqVar2;
        s f;
        int[] iArr3;
        int length;
        zzabe zzabeVar;
        long j2;
        int i3;
        String str2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Point point;
        Context context2;
        Point point2;
        boolean z;
        Context context3;
        synchronized (this.c) {
            this.f = Thread.currentThread();
            zzaaqVar = this.e;
        }
        Boolean bool = this.i;
        if (bool == null && (context3 = this.d) != null) {
            bool = Boolean.valueOf(zzfm.j(context3));
            this.i = bool;
        }
        int i4 = 3;
        if (zzaaqVar.A && Build.VERSION.SDK_INT >= 32 && this.g == null) {
            this.g = new zzacr(this.d, new f2n(this, i4), bool);
        }
        int i5 = 2;
        zzabd[] zzabdVarArr = new zzabd[2];
        o(zzabhVar, zzaaqVar);
        p(zzabhVar, zzaaqVar, zzabdVarArr);
        q(zzabhVar, zzaaqVar, zzabdVarArr);
        Pair h = h(zzabdVarArr, 1);
        if (h == null) {
            int i6 = 0;
            while (true) {
                if (i6 >= 2) {
                    z = false;
                    break;
                }
                if (zzabhVar.a[i6] == 2 && zzabhVar.b[i6].a > 0) {
                    z = true;
                    break;
                }
                i6++;
            }
            h = i(1, zzabhVar, iArr, new en0(this, zzaaqVar, z, iArr2), q6i.c);
            if (h != null) {
                zzabdVarArr[((Integer) h.second).intValue()] = (zzabd) h.first;
            }
        }
        if (h == null) {
            str = null;
        } else {
            zzabd zzabdVar = (zzabd) h.first;
            str = zzabdVar.a.d[zzabdVar.b[0]].d;
        }
        Pair h2 = h(zzabdVarArr, 2);
        Pair h3 = h(zzabdVarArr, 4);
        if (h2 == null && h3 == null) {
            zzaaqVar.q.getClass();
            if (!zzaaqVar.g || (context2 = this.d) == null) {
                i = 1;
                i2 = 0;
                point = null;
            } else {
                String str3 = zzfm.a;
                DisplayManager displayManager = (DisplayManager) context2.getSystemService(U3.i.d);
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                    windowManager.getClass();
                    display = windowManager.getDefaultDisplay();
                }
                if (display.getDisplayId() == 0 && zzfm.j(context2)) {
                    i2 = 0;
                    String n = Build.VERSION.SDK_INT < 28 ? zzfm.n("sys.display-size") : zzfm.n("vendor.display-size");
                    if (TextUtils.isEmpty(n)) {
                        i = 1;
                    } else {
                        try {
                            i = 1;
                            try {
                                String[] split = n.trim().split("x", -1);
                                if (split.length == 2) {
                                    int parseInt = Integer.parseInt(split[0]);
                                    int parseInt2 = Integer.parseInt(split[1]);
                                    if (parseInt > 0 && parseInt2 > 0) {
                                        point = new Point(parseInt, parseInt2);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                        } catch (NumberFormatException unused2) {
                            i = 1;
                        }
                        zzeh.e("Invalid display size: ".concat(String.valueOf(n)));
                    }
                    if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context2.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                        point2 = new Point(3840, 2160);
                        point = point2;
                    }
                } else {
                    i = 1;
                    i2 = 0;
                }
                point2 = new Point();
                Display.Mode mode = display.getMode();
                point2.x = mode.getPhysicalWidth();
                point2.y = mode.getPhysicalHeight();
                point = point2;
            }
            Pair i7 = i(2, zzabhVar, iArr, new g7h(zzaaqVar, str, iArr2, point), v4n.b);
            Pair i8 = i7 == null ? i(4, zzabhVar, iArr, new d4a(zzaaqVar, 27), q6i.d) : null;
            if (i8 != null) {
                zzabdVarArr[((Integer) i8.second).intValue()] = (zzabd) i8.first;
            } else if (i7 != null) {
                zzabdVarArr[((Integer) i7.second).intValue()] = (zzabd) i7.first;
            }
        } else {
            i = 1;
            i2 = 0;
        }
        if (h(zzabdVarArr, 3) == null) {
            zzaaqVar.q.getClass();
            if (!zzaaqVar.t || (context = this.d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                str2 = null;
            } else {
                String str4 = zzfm.a;
                str2 = locale.toLanguageTag();
            }
            Pair i9 = i(3, zzabhVar, iArr, new ejg(22, zzaaqVar, str, str2), q6i.e);
            if (i9 != null) {
                zzabdVarArr[((Integer) i9.second).intValue()] = (zzabd) i9.first;
            }
        }
        zzaaqVar.q.getClass();
        zzgxv zzgxvVar = new zzgxv();
        for (int i10 = i2; i10 < 2; i10++) {
            zzabd zzabdVar2 = zzabdVarArr[i10];
            if (zzabdVar2 != null && !zzaaqVar.E.get(i10)) {
                zzgxw zzgxwVar = zzaaqVar.v;
                zzbg zzbgVar = zzabdVar2.a;
                if (!zzgxwVar.contains(Integer.valueOf(zzbgVar.c))) {
                    zzgxvVar.f(zzbgVar.b);
                    int i11 = i2;
                    while (true) {
                        int[] iArr4 = zzabdVar2.b;
                        if (i11 < iArr4.length) {
                            String str5 = zzbgVar.d[iArr4[i11]].m;
                            if (str5 != null) {
                                zzgxvVar.f(str5);
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        zzgxw h4 = zzgxvVar.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = i2; i12 < 2; i12++) {
            if (zzabhVar.a[i12] == 5) {
                zzzr zzzrVar = zzabhVar.b[i12];
                for (int i13 = i2; i13 < zzzrVar.a; i13++) {
                    zzbg a = zzzrVar.a(i13);
                    arrayList.add(a);
                    int[] iArr5 = (int[]) iArr[i12][i13].clone();
                    for (int i14 = i2; i14 < iArr5.length; i14++) {
                        String str6 = a.d[i14].m;
                        if (str6 != null && !h4.contains(str6)) {
                            iArr5[i14] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i15 = 128;
        int size = arrayList.size();
        zzbg[] zzbgVarArr = new zzbg[size];
        String str7 = zzfm.a;
        zzguk.f(arrayList.size() == size ? i : i2);
        arrayList.toArray(zzbgVarArr);
        zzzr zzzrVar2 = new zzzr(zzbgVarArr);
        int size2 = arrayList2.size();
        int[][] iArr6 = new int[size2][];
        zzguk.f(arrayList2.size() == size2 ? i : i2);
        arrayList2.toArray(iArr6);
        int i16 = i2;
        while (i16 < 2) {
            if (zzabhVar.a[i16] == 5) {
                zzabd m = m(zzzrVar2, iArr6, zzaaqVar);
                zzabdVarArr[i16] = m;
                if (m == null) {
                    break;
                }
                int indexOf = zzzrVar2.b.indexOf(m.a);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                i3 = i15;
                Arrays.fill(iArr6[indexOf], i3);
            } else {
                i3 = i15;
            }
            i16++;
            i15 = i3;
        }
        int i17 = i2;
        while (i17 < 2) {
            int i18 = zzabhVar.a[i17];
            if (i18 != 2 && i18 != i) {
                if (i18 != 3 && i18 != 4 && i18 != 5 && zzabdVarArr[i17] == null) {
                    zzabdVarArr[i17] = m(zzabhVar.b[i17], iArr[i17], zzaaqVar);
                }
            }
            i17++;
            i = 1;
        }
        o(zzabhVar, zzaaqVar);
        p(zzabhVar, zzaaqVar, zzabdVarArr);
        q(zzabhVar, zzaaqVar, zzabdVarArr);
        zzzx zzzxVar2 = this.j;
        this.b.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (int i19 = i2; i19 < 2; i19++) {
            zzabd zzabdVar3 = zzabdVarArr[i19];
            if (zzabdVar3 == null || zzabdVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                mio mioVar = zzgxm.b;
                zzgxj zzgxjVar = new zzgxj();
                zzgxjVar.c(new zzzw(0L, 0L));
                arrayList3.add(zzgxjVar);
            }
        }
        long[][] jArr = new long[2][];
        int i20 = i2;
        while (true) {
            j = -1;
            if (i20 >= 2) {
                break;
            }
            zzabd zzabdVar4 = zzabdVarArr[i20];
            if (zzabdVar4 == null) {
                jArr[i20] = new long[i2];
            } else {
                int[] iArr7 = zzabdVar4.b;
                jArr[i20] = new long[iArr7.length];
                for (int i21 = 0; i21 < iArr7.length; i21++) {
                    long j3 = zzabdVar4.a.d[iArr7[i21]].j;
                    long[] jArr2 = jArr[i20];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i21] = j3;
                }
                Arrays.sort(jArr[i20]);
            }
            i20++;
            i2 = 0;
        }
        int[] iArr8 = new int[2];
        long[] jArr3 = new long[2];
        for (int i22 = 0; i22 < 2; i22++) {
            long[] jArr4 = jArr[i22];
            jArr3[i22] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzzy.a(arrayList3, jArr3);
        bjo bjoVar = new bjo(ijo.a);
        new djo(bjoVar);
        hjo hjoVar = new hjo(bjoVar.a(), new cjo());
        int i23 = 0;
        loop12: while (true) {
            if (i23 >= i5) {
                zzzxVar = zzzxVar2;
                long[][] jArr5 = jArr;
                zzaaqVar2 = zzaaqVar;
                Collection collection = hjoVar.b;
                if (collection == null) {
                    collection = new s6(hjoVar, 4);
                    hjoVar.b = collection;
                }
                zzgxm x = zzgxm.x(collection);
                for (int i24 = 0; i24 < x.size(); i24++) {
                    int intValue = ((Integer) x.get(i24)).intValue();
                    int i25 = iArr8[intValue] + 1;
                    iArr8[intValue] = i25;
                    jArr3[intValue] = jArr5[intValue][i25];
                    zzzy.a(arrayList3, jArr3);
                }
                for (int i26 = 0; i26 < 2; i26++) {
                    if (arrayList3.get(i26) != null) {
                        long j4 = jArr3[i26];
                        jArr3[i26] = j4 + j4;
                    }
                }
                zzzy.a(arrayList3, jArr3);
                zzgxj zzgxjVar2 = new zzgxj();
                for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                    zzgxj zzgxjVar3 = (zzgxj) arrayList3.get(i27);
                    zzgxjVar2.c(zzgxjVar3 == null ? s.e : zzgxjVar3.f());
                }
                f = zzgxjVar2.f();
            } else {
                int length2 = jArr[i23].length;
                if (length2 <= 1) {
                    j2 = j;
                    zzaaqVar2 = zzaaqVar;
                } else {
                    double[] dArr = new double[length2];
                    j2 = j;
                    int i28 = 0;
                    while (true) {
                        long[] jArr6 = jArr[i23];
                        double d = 0.0d;
                        if (i28 >= jArr6.length) {
                            break;
                        }
                        zzaaq zzaaqVar3 = zzaaqVar;
                        long j5 = jArr6[i28];
                        if (j5 != j2) {
                            d = Math.log(j5);
                        }
                        dArr[i28] = d;
                        i28++;
                        zzaaqVar = zzaaqVar3;
                    }
                    zzaaqVar2 = zzaaqVar;
                    int i29 = length2 - 1;
                    double d2 = dArr[i29] - dArr[0];
                    int i30 = 0;
                    while (i30 < i29) {
                        double d3 = dArr[i30];
                        i30++;
                        Double valueOf = Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i30]) * 0.5d) - dArr[0]) / d2);
                        zzzxVar = zzzxVar2;
                        Integer valueOf2 = Integer.valueOf(i23);
                        long[][] jArr7 = jArr;
                        Map map = hjoVar.d;
                        double d4 = d2;
                        Collection collection2 = (Collection) map.get(valueOf);
                        if (collection2 == null) {
                            List list = (List) hjoVar.f.mo792zza();
                            if (!list.add(valueOf2)) {
                                a70.j("New Collection violated the Collection spec");
                                f = null;
                                break loop12;
                            }
                            hjoVar.e++;
                            map.put(valueOf, list);
                        } else if (collection2.add(valueOf2)) {
                            hjoVar.e++;
                        }
                        zzzxVar2 = zzzxVar;
                        jArr = jArr7;
                        d2 = d4;
                    }
                }
                i23++;
                zzaaqVar = zzaaqVar2;
                zzzxVar2 = zzzxVar2;
                jArr = jArr;
                i5 = 2;
                j = j2;
            }
        }
        int i31 = 2;
        zzabe[] zzabeVarArr = new zzabe[2];
        int i32 = 0;
        while (i32 < i31) {
            zzabd zzabdVar5 = zzabdVarArr[i32];
            if (zzabdVar5 != null && (length = (iArr3 = zzabdVar5.b).length) != 0) {
                zzbg zzbgVar2 = zzabdVar5.a;
                if (length == 1) {
                    zzabeVar = new zzabf(zzbgVar2, new int[]{iArr3[0]});
                } else {
                    zzgxm zzgxmVar = (zzgxm) f.get(i32);
                    zzzxVar.getClass();
                    zzzy zzzyVar = new zzzy(zzbgVar2, iArr3);
                    zzgxm.x(zzgxmVar);
                    zzabeVar = zzzyVar;
                }
                zzabeVarArr[i32] = zzabeVar;
            }
            i32++;
            i31 = 2;
        }
        zznh[] zznhVarArr = new zznh[i31];
        for (int i33 = 0; i33 < i31; i33++) {
            zznhVarArr[i33] = (zzaaqVar2.E.get(i33) || zzaaqVar2.v.contains(Integer.valueOf(zzabhVar.a[i33])) || (zzabhVar.a[i33] != -2 && zzabeVarArr[i33] == null)) ? null : zznh.a;
        }
        return Pair.create(zznhVarArr, zzabeVarArr);
    }

    public final void n() {
        boolean z;
        xwo xwoVar;
        zzacr zzacrVar;
        synchronized (this.c) {
            try {
                z = false;
                if (this.e.A && Build.VERSION.SDK_INT >= 32 && (zzacrVar = this.g) != null && zzacrVar.b) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (xwoVar = this.a) == null) {
            return;
        }
        xwoVar.g.g(10);
    }

    @Override // com.google.android.gms.internal.ads.zznf
    public final void zza() {
        synchronized (this.c) {
            this.e.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final zznf d() {
        return this;
    }
}
