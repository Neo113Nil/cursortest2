package v;

import C.C2698s;
import De.C2859b;
import De.C2860c;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.impl.AbstractC5081a;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.V0;
import g.C6594f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.C9553a;
import u.C9887a;
import w.C10340H;
import w.C10348a;
import w.C10368u;
import z.C10948f;
import z.C10962t;

/* loaded from: classes8.dex */
final class D1 {

    /* renamed from: i, reason: collision with root package name */
    private final String f100889i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC10094f f100890j;

    /* renamed from: k, reason: collision with root package name */
    private final C10368u f100891k;

    /* renamed from: l, reason: collision with root package name */
    private final C10948f f100892l;

    /* renamed from: m, reason: collision with root package name */
    private final int f100893m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f100894n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f100895o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f100896p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f100897q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f100898r;

    /* renamed from: s, reason: collision with root package name */
    androidx.camera.core.impl.W0 f100899s;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    private final C10081a1 f100901u;

    /* renamed from: x, reason: collision with root package name */
    private final C10084b1 f100904x;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f100881a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f100882b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f100883c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f100884d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f100885e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f100886f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f100887g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f100888h = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    ArrayList f100900t = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    private final C9553a f100902v = new C9553a();

    /* renamed from: w, reason: collision with root package name */
    private final C10962t f100903w = new C10962t();

    static abstract class a {
        a() {
        }

        abstract int a();

        abstract int b();

        abstract boolean c();

        abstract boolean d();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05a9 A[EDGE_INSN: B:85:0x05a9->B:86:0x05a9 BREAK  A[LOOP:2: B:77:0x0538->B:80:0x05a4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    D1(@NonNull Context context, @NonNull String str, @NonNull C10340H c10340h, @NonNull InterfaceC10094f interfaceC10094f) throws C2698s {
        CameraCharacteristics.Key key;
        boolean z11;
        int[] iArr;
        int length;
        int i11;
        this.f100894n = false;
        this.f100895o = false;
        this.f100896p = false;
        this.f100897q = false;
        this.f100898r = false;
        str.getClass();
        this.f100889i = str;
        interfaceC10094f.getClass();
        this.f100890j = interfaceC10094f;
        this.f100892l = new C10948f();
        this.f100901u = C10081a1.b(context);
        try {
            C10368u b11 = c10340h.b(str);
            this.f100891k = b11;
            Integer num = (Integer) b11.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f100893m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) b11.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i12 : iArr2) {
                    if (i12 == 3) {
                        this.f100894n = true;
                    } else if (i12 == 6) {
                        this.f100895o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i12 == 16) {
                        this.f100898r = true;
                    }
                }
            }
            C10084b1 c10084b1 = new C10084b1(this.f100891k);
            this.f100904x = c10084b1;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            androidx.camera.core.impl.U0 u02 = new androidx.camera.core.impl.U0();
            V0.b bVar = V0.b.PRIV;
            V0.a aVar = V0.a.MAXIMUM;
            androidx.camera.core.impl.U0 d11 = C2859b.d(bVar, aVar, u02, arrayList2, u02);
            V0.b bVar2 = V0.b.JPEG;
            androidx.camera.core.impl.U0 d12 = C2859b.d(bVar2, aVar, d11, arrayList2, d11);
            V0.b bVar3 = V0.b.YUV;
            androidx.camera.core.impl.U0 d13 = C2859b.d(bVar3, aVar, d12, arrayList2, d12);
            V0.a aVar2 = V0.a.PREVIEW;
            Kk.c.h(bVar, aVar2, d13, bVar2, aVar);
            androidx.camera.core.impl.U0 a11 = C2860c.a(arrayList2, d13);
            Kk.c.h(bVar3, aVar2, a11, bVar2, aVar);
            androidx.camera.core.impl.U0 a12 = C2860c.a(arrayList2, a11);
            Kk.c.h(bVar, aVar2, a12, bVar, aVar2);
            androidx.camera.core.impl.U0 a13 = C2860c.a(arrayList2, a12);
            Kk.c.h(bVar, aVar2, a13, bVar3, aVar2);
            androidx.camera.core.impl.U0 a14 = C2860c.a(arrayList2, a13);
            Kk.c.h(bVar, aVar2, a14, bVar3, aVar2);
            a14.a(androidx.camera.core.impl.V0.a(bVar2, aVar));
            arrayList2.add(a14);
            arrayList.addAll(arrayList2);
            int i13 = this.f100893m;
            if (i13 == 0 || i13 == 1 || i13 == 3) {
                ArrayList arrayList3 = new ArrayList();
                androidx.camera.core.impl.U0 u03 = new androidx.camera.core.impl.U0();
                u03.a(androidx.camera.core.impl.V0.a(bVar, aVar2));
                V0.a aVar3 = V0.a.RECORD;
                androidx.camera.core.impl.U0 d14 = C2859b.d(bVar, aVar3, u03, arrayList3, u03);
                Kk.c.h(bVar, aVar2, d14, bVar3, aVar3);
                androidx.camera.core.impl.U0 a15 = C2860c.a(arrayList3, d14);
                Kk.c.h(bVar3, aVar2, a15, bVar3, aVar3);
                androidx.camera.core.impl.U0 a16 = C2860c.a(arrayList3, a15);
                Kk.c.h(bVar, aVar2, a16, bVar, aVar3);
                androidx.camera.core.impl.U0 d15 = C2859b.d(bVar2, aVar3, a16, arrayList3, a16);
                Kk.c.h(bVar, aVar2, d15, bVar3, aVar3);
                androidx.camera.core.impl.U0 d16 = C2859b.d(bVar2, aVar3, d15, arrayList3, d15);
                Kk.c.h(bVar3, aVar2, d16, bVar3, aVar2);
                d16.a(androidx.camera.core.impl.V0.a(bVar2, aVar));
                arrayList3.add(d16);
                arrayList.addAll(arrayList3);
            }
            if (i13 == 1 || i13 == 3) {
                ArrayList arrayList4 = new ArrayList();
                androidx.camera.core.impl.U0 u04 = new androidx.camera.core.impl.U0();
                Kk.c.h(bVar, aVar2, u04, bVar, aVar);
                androidx.camera.core.impl.U0 a17 = C2860c.a(arrayList4, u04);
                Kk.c.h(bVar, aVar2, a17, bVar3, aVar);
                androidx.camera.core.impl.U0 a18 = C2860c.a(arrayList4, a17);
                Kk.c.h(bVar3, aVar2, a18, bVar3, aVar);
                androidx.camera.core.impl.U0 a19 = C2860c.a(arrayList4, a18);
                Kk.c.h(bVar, aVar2, a19, bVar, aVar2);
                androidx.camera.core.impl.U0 d17 = C2859b.d(bVar2, aVar, a19, arrayList4, a19);
                V0.a aVar4 = V0.a.VGA;
                Kk.c.h(bVar3, aVar4, d17, bVar, aVar2);
                androidx.camera.core.impl.U0 d18 = C2859b.d(bVar3, aVar, d17, arrayList4, d17);
                Kk.c.h(bVar3, aVar4, d18, bVar3, aVar2);
                d18.a(androidx.camera.core.impl.V0.a(bVar3, aVar));
                arrayList4.add(d18);
                arrayList.addAll(arrayList4);
            }
            if (this.f100894n) {
                ArrayList arrayList5 = new ArrayList();
                androidx.camera.core.impl.U0 u05 = new androidx.camera.core.impl.U0();
                V0.b bVar4 = V0.b.RAW;
                androidx.camera.core.impl.U0 d19 = C2859b.d(bVar4, aVar, u05, arrayList5, u05);
                Kk.c.h(bVar, aVar2, d19, bVar4, aVar);
                androidx.camera.core.impl.U0 a21 = C2860c.a(arrayList5, d19);
                Kk.c.h(bVar3, aVar2, a21, bVar4, aVar);
                androidx.camera.core.impl.U0 a22 = C2860c.a(arrayList5, a21);
                Kk.c.h(bVar, aVar2, a22, bVar, aVar2);
                androidx.camera.core.impl.U0 d21 = C2859b.d(bVar4, aVar, a22, arrayList5, a22);
                Kk.c.h(bVar, aVar2, d21, bVar3, aVar2);
                androidx.camera.core.impl.U0 d22 = C2859b.d(bVar4, aVar, d21, arrayList5, d21);
                Kk.c.h(bVar3, aVar2, d22, bVar3, aVar2);
                androidx.camera.core.impl.U0 d23 = C2859b.d(bVar4, aVar, d22, arrayList5, d22);
                Kk.c.h(bVar, aVar2, d23, bVar2, aVar);
                androidx.camera.core.impl.U0 d24 = C2859b.d(bVar4, aVar, d23, arrayList5, d23);
                Kk.c.h(bVar3, aVar2, d24, bVar2, aVar);
                d24.a(androidx.camera.core.impl.V0.a(bVar4, aVar));
                arrayList5.add(d24);
                arrayList.addAll(arrayList5);
            }
            if (this.f100895o && i13 == 0) {
                ArrayList arrayList6 = new ArrayList();
                androidx.camera.core.impl.U0 u06 = new androidx.camera.core.impl.U0();
                Kk.c.h(bVar, aVar2, u06, bVar, aVar);
                androidx.camera.core.impl.U0 a23 = C2860c.a(arrayList6, u06);
                Kk.c.h(bVar, aVar2, a23, bVar3, aVar);
                androidx.camera.core.impl.U0 a24 = C2860c.a(arrayList6, a23);
                Kk.c.h(bVar3, aVar2, a24, bVar3, aVar);
                arrayList6.add(a24);
                arrayList.addAll(arrayList6);
            }
            if (i13 == 3) {
                ArrayList arrayList7 = new ArrayList();
                androidx.camera.core.impl.U0 u07 = new androidx.camera.core.impl.U0();
                u07.a(androidx.camera.core.impl.V0.a(bVar, aVar2));
                V0.a aVar5 = V0.a.VGA;
                Kk.c.h(bVar, aVar5, u07, bVar3, aVar);
                V0.b bVar5 = V0.b.RAW;
                androidx.camera.core.impl.U0 d25 = C2859b.d(bVar5, aVar, u07, arrayList7, u07);
                Kk.c.h(bVar, aVar2, d25, bVar, aVar5);
                Kk.c.h(bVar2, aVar, d25, bVar5, aVar);
                arrayList7.add(d25);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.f100881a;
            arrayList8.addAll(arrayList);
            arrayList8.addAll(this.f100892l.a(this.f100889i));
            if (this.f100898r) {
                ArrayList arrayList9 = new ArrayList();
                androidx.camera.core.impl.U0 u08 = new androidx.camera.core.impl.U0();
                V0.a aVar6 = V0.a.ULTRA_MAXIMUM;
                Kk.c.h(bVar3, aVar6, u08, bVar, aVar2);
                V0.a aVar7 = V0.a.RECORD;
                androidx.camera.core.impl.U0 d26 = C2859b.d(bVar, aVar7, u08, arrayList9, u08);
                Kk.c.h(bVar2, aVar6, d26, bVar, aVar2);
                androidx.camera.core.impl.U0 d27 = C2859b.d(bVar, aVar7, d26, arrayList9, d26);
                V0.b bVar6 = V0.b.RAW;
                Kk.c.h(bVar6, aVar6, d27, bVar, aVar2);
                androidx.camera.core.impl.U0 d28 = C2859b.d(bVar, aVar7, d27, arrayList9, d27);
                Kk.c.h(bVar3, aVar6, d28, bVar, aVar2);
                androidx.camera.core.impl.U0 d29 = C2859b.d(bVar2, aVar, d28, arrayList9, d28);
                Kk.c.h(bVar2, aVar6, d29, bVar, aVar2);
                androidx.camera.core.impl.U0 d31 = C2859b.d(bVar2, aVar, d29, arrayList9, d29);
                Kk.c.h(bVar6, aVar6, d31, bVar, aVar2);
                androidx.camera.core.impl.U0 d32 = C2859b.d(bVar2, aVar, d31, arrayList9, d31);
                Kk.c.h(bVar3, aVar6, d32, bVar, aVar2);
                androidx.camera.core.impl.U0 d33 = C2859b.d(bVar3, aVar, d32, arrayList9, d32);
                Kk.c.h(bVar2, aVar6, d33, bVar, aVar2);
                androidx.camera.core.impl.U0 d34 = C2859b.d(bVar3, aVar, d33, arrayList9, d33);
                Kk.c.h(bVar6, aVar6, d34, bVar, aVar2);
                androidx.camera.core.impl.U0 d35 = C2859b.d(bVar3, aVar, d34, arrayList9, d34);
                Kk.c.h(bVar3, aVar6, d35, bVar, aVar2);
                androidx.camera.core.impl.U0 d36 = C2859b.d(bVar6, aVar, d35, arrayList9, d35);
                Kk.c.h(bVar2, aVar6, d36, bVar, aVar2);
                androidx.camera.core.impl.U0 d37 = C2859b.d(bVar6, aVar, d36, arrayList9, d36);
                Kk.c.h(bVar6, aVar6, d37, bVar, aVar2);
                d37.a(androidx.camera.core.impl.V0.a(bVar6, aVar));
                arrayList9.add(d37);
                this.f100882b.addAll(arrayList9);
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f100896p = hasSystemFeature;
            if (hasSystemFeature) {
                ArrayList arrayList10 = new ArrayList();
                androidx.camera.core.impl.U0 u09 = new androidx.camera.core.impl.U0();
                V0.a aVar8 = V0.a.s1440p;
                androidx.camera.core.impl.U0 d38 = C2859b.d(bVar3, aVar8, u09, arrayList10, u09);
                androidx.camera.core.impl.U0 d39 = C2859b.d(bVar, aVar8, d38, arrayList10, d38);
                androidx.camera.core.impl.U0 d41 = C2859b.d(bVar2, aVar8, d39, arrayList10, d39);
                V0.a aVar9 = V0.a.s720p;
                Kk.c.h(bVar3, aVar9, d41, bVar2, aVar8);
                androidx.camera.core.impl.U0 a25 = C2860c.a(arrayList10, d41);
                Kk.c.h(bVar, aVar9, a25, bVar2, aVar8);
                androidx.camera.core.impl.U0 a26 = C2860c.a(arrayList10, a25);
                Kk.c.h(bVar3, aVar9, a26, bVar3, aVar8);
                androidx.camera.core.impl.U0 a27 = C2860c.a(arrayList10, a26);
                Kk.c.h(bVar3, aVar9, a27, bVar, aVar8);
                androidx.camera.core.impl.U0 a28 = C2860c.a(arrayList10, a27);
                Kk.c.h(bVar, aVar9, a28, bVar3, aVar8);
                androidx.camera.core.impl.U0 a29 = C2860c.a(arrayList10, a28);
                Kk.c.h(bVar, aVar9, a29, bVar, aVar8);
                arrayList10.add(a29);
                this.f100883c.addAll(arrayList10);
            }
            if (c10084b1.d()) {
                ArrayList arrayList11 = new ArrayList();
                androidx.camera.core.impl.U0 u010 = new androidx.camera.core.impl.U0();
                androidx.camera.core.impl.U0 d42 = C2859b.d(bVar, aVar, u010, arrayList11, u010);
                androidx.camera.core.impl.U0 d43 = C2859b.d(bVar3, aVar, d42, arrayList11, d42);
                Kk.c.h(bVar, aVar2, d43, bVar2, aVar);
                androidx.camera.core.impl.U0 a31 = C2860c.a(arrayList11, d43);
                Kk.c.h(bVar, aVar2, a31, bVar3, aVar);
                androidx.camera.core.impl.U0 a32 = C2860c.a(arrayList11, a31);
                Kk.c.h(bVar3, aVar2, a32, bVar3, aVar);
                androidx.camera.core.impl.U0 a33 = C2860c.a(arrayList11, a32);
                a33.a(androidx.camera.core.impl.V0.a(bVar, aVar2));
                V0.a aVar10 = V0.a.RECORD;
                androidx.camera.core.impl.U0 d44 = C2859b.d(bVar, aVar10, a33, arrayList11, a33);
                Kk.c.h(bVar, aVar2, d44, bVar, aVar10);
                androidx.camera.core.impl.U0 d45 = C2859b.d(bVar3, aVar10, d44, arrayList11, d44);
                Kk.c.h(bVar, aVar2, d45, bVar, aVar10);
                d45.a(androidx.camera.core.impl.V0.a(bVar2, aVar10));
                arrayList11.add(d45);
                this.f100886f.addAll(arrayList11);
            }
            int[] b12 = this.f100891k.b().b();
            if (b12 != null) {
                int length2 = b12.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        break;
                    }
                    if (b12[i14] == 4101) {
                        ArrayList arrayList12 = new ArrayList();
                        androidx.camera.core.impl.U0 u011 = new androidx.camera.core.impl.U0();
                        V0.b bVar7 = V0.b.JPEG_R;
                        V0.a aVar11 = V0.a.MAXIMUM;
                        androidx.camera.core.impl.U0 d46 = C2859b.d(bVar7, aVar11, u011, arrayList12, u011);
                        Kk.c.h(V0.b.PRIV, V0.a.PREVIEW, d46, bVar7, aVar11);
                        arrayList12.add(d46);
                        this.f100887g.addAll(arrayList12);
                        break;
                    }
                    i14++;
                }
            }
            C10368u c10368u = this.f100891k;
            T.a<Long> aVar12 = C1.f100872a;
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33) {
                key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                long[] jArr = (long[]) c10368u.a(key);
                if (jArr != null && jArr.length != 0) {
                    z11 = true;
                    this.f100897q = z11;
                    if (!z11 && i15 >= 33) {
                        ArrayList arrayList13 = new ArrayList();
                        androidx.camera.core.impl.U0 u012 = new androidx.camera.core.impl.U0();
                        V0.b bVar8 = V0.b.PRIV;
                        V0.a aVar13 = V0.a.s1440p;
                        u012.a(androidx.camera.core.impl.V0.b(bVar8, aVar13, 4L));
                        arrayList13.add(u012);
                        androidx.camera.core.impl.U0 u013 = new androidx.camera.core.impl.U0();
                        V0.b bVar9 = V0.b.YUV;
                        u013.a(androidx.camera.core.impl.V0.b(bVar9, aVar13, 4L));
                        arrayList13.add(u013);
                        androidx.camera.core.impl.U0 u014 = new androidx.camera.core.impl.U0();
                        V0.a aVar14 = V0.a.RECORD;
                        u014.a(androidx.camera.core.impl.V0.b(bVar8, aVar14, 3L));
                        arrayList13.add(u014);
                        androidx.camera.core.impl.U0 u015 = new androidx.camera.core.impl.U0();
                        u015.a(androidx.camera.core.impl.V0.b(bVar9, aVar14, 3L));
                        arrayList13.add(u015);
                        androidx.camera.core.impl.U0 u016 = new androidx.camera.core.impl.U0();
                        V0.b bVar10 = V0.b.JPEG;
                        V0.a aVar15 = V0.a.MAXIMUM;
                        u016.a(androidx.camera.core.impl.V0.b(bVar10, aVar15, 2L));
                        arrayList13.add(u016);
                        androidx.camera.core.impl.U0 u017 = new androidx.camera.core.impl.U0();
                        u017.a(androidx.camera.core.impl.V0.b(bVar9, aVar15, 2L));
                        arrayList13.add(u017);
                        androidx.camera.core.impl.U0 u018 = new androidx.camera.core.impl.U0();
                        V0.a aVar16 = V0.a.PREVIEW;
                        u018.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u018.a(androidx.camera.core.impl.V0.b(bVar10, aVar15, 2L));
                        arrayList13.add(u018);
                        androidx.camera.core.impl.U0 u019 = new androidx.camera.core.impl.U0();
                        u019.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u019.a(androidx.camera.core.impl.V0.b(bVar9, aVar15, 2L));
                        arrayList13.add(u019);
                        androidx.camera.core.impl.U0 u020 = new androidx.camera.core.impl.U0();
                        u020.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u020.a(androidx.camera.core.impl.V0.b(bVar8, aVar14, 3L));
                        arrayList13.add(u020);
                        androidx.camera.core.impl.U0 u021 = new androidx.camera.core.impl.U0();
                        u021.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u021.a(androidx.camera.core.impl.V0.b(bVar9, aVar14, 3L));
                        arrayList13.add(u021);
                        androidx.camera.core.impl.U0 u022 = new androidx.camera.core.impl.U0();
                        u022.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u022.a(androidx.camera.core.impl.V0.b(bVar9, aVar16, 1L));
                        arrayList13.add(u022);
                        androidx.camera.core.impl.U0 u023 = new androidx.camera.core.impl.U0();
                        u023.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u023.a(androidx.camera.core.impl.V0.b(bVar8, aVar14, 3L));
                        u023.a(androidx.camera.core.impl.V0.b(bVar10, aVar14, 2L));
                        arrayList13.add(u023);
                        androidx.camera.core.impl.U0 u024 = new androidx.camera.core.impl.U0();
                        u024.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u024.a(androidx.camera.core.impl.V0.b(bVar9, aVar14, 3L));
                        u024.a(androidx.camera.core.impl.V0.b(bVar10, aVar14, 2L));
                        arrayList13.add(u024);
                        androidx.camera.core.impl.U0 u025 = new androidx.camera.core.impl.U0();
                        u025.a(androidx.camera.core.impl.V0.b(bVar8, aVar16, 1L));
                        u025.a(androidx.camera.core.impl.V0.b(bVar9, aVar16, 1L));
                        u025.a(androidx.camera.core.impl.V0.b(bVar10, aVar15, 2L));
                        arrayList13.add(u025);
                        this.f100888h.addAll(arrayList13);
                    }
                    C10368u c10368u2 = this.f100891k;
                    if (i15 >= 33 && (iArr = (int[]) c10368u2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
                        length = iArr.length;
                        i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                break;
                            }
                            if (iArr[i11] != 2) {
                                i11++;
                            } else if (Build.VERSION.SDK_INT >= 33) {
                                ArrayList arrayList14 = new ArrayList();
                                androidx.camera.core.impl.U0 u026 = new androidx.camera.core.impl.U0();
                                V0.b bVar11 = V0.b.PRIV;
                                V0.a aVar17 = V0.a.s1440p;
                                androidx.camera.core.impl.U0 d47 = C2859b.d(bVar11, aVar17, u026, arrayList14, u026);
                                V0.b bVar12 = V0.b.YUV;
                                androidx.camera.core.impl.U0 d48 = C2859b.d(bVar12, aVar17, d47, arrayList14, d47);
                                d48.a(androidx.camera.core.impl.V0.a(bVar11, aVar17));
                                V0.b bVar13 = V0.b.JPEG;
                                V0.a aVar18 = V0.a.MAXIMUM;
                                androidx.camera.core.impl.U0 d49 = C2859b.d(bVar13, aVar18, d48, arrayList14, d48);
                                Kk.c.h(bVar12, aVar17, d49, bVar13, aVar18);
                                androidx.camera.core.impl.U0 a34 = C2860c.a(arrayList14, d49);
                                Kk.c.h(bVar11, aVar17, a34, bVar12, aVar18);
                                androidx.camera.core.impl.U0 a35 = C2860c.a(arrayList14, a34);
                                Kk.c.h(bVar12, aVar17, a35, bVar12, aVar18);
                                androidx.camera.core.impl.U0 a36 = C2860c.a(arrayList14, a35);
                                V0.a aVar19 = V0.a.PREVIEW;
                                Kk.c.h(bVar11, aVar19, a36, bVar11, aVar17);
                                androidx.camera.core.impl.U0 a37 = C2860c.a(arrayList14, a36);
                                Kk.c.h(bVar12, aVar19, a37, bVar11, aVar17);
                                androidx.camera.core.impl.U0 a38 = C2860c.a(arrayList14, a37);
                                Kk.c.h(bVar11, aVar19, a38, bVar12, aVar17);
                                androidx.camera.core.impl.U0 a39 = C2860c.a(arrayList14, a38);
                                Kk.c.h(bVar12, aVar19, a39, bVar12, aVar17);
                                arrayList14.add(a39);
                                this.f100884d.addAll(arrayList14);
                            }
                        }
                    }
                    b();
                }
            }
            z11 = false;
            this.f100897q = z11;
            if (!z11) {
            }
            C10368u c10368u22 = this.f100891k;
            if (i15 >= 33) {
                length = iArr.length;
                i11 = 0;
                while (true) {
                    if (i11 >= length) {
                    }
                    i11++;
                }
            }
            b();
        } catch (C10348a e11) {
            throw new C2698s(e11);
        }
    }

    private void b() {
        Size size;
        Size size2;
        Size size3;
        int parseInt;
        InterfaceC10094f interfaceC10094f;
        CamcorderProfile camcorderProfile;
        CamcorderProfile a11;
        Size e11 = this.f100901u.e();
        try {
            parseInt = Integer.parseInt(this.f100889i);
            interfaceC10094f = this.f100890j;
            camcorderProfile = null;
            a11 = interfaceC10094f.b(parseInt, 1) ? interfaceC10094f.a(parseInt, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.f100891k.b().d().getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = M.c.f17202d;
            } else {
                Arrays.sort(outputSizes, new G.e(true));
                for (Size size4 : outputSizes) {
                    int width = size4.getWidth();
                    Size size5 = M.c.f17204f;
                    if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                        size2 = size4;
                        break;
                    }
                }
                size = M.c.f17202d;
            }
            size2 = size;
        }
        if (a11 != null) {
            size2 = new Size(a11.videoFrameWidth, a11.videoFrameHeight);
        } else {
            Size size6 = M.c.f17202d;
            if (interfaceC10094f.b(parseInt, 10)) {
                camcorderProfile = interfaceC10094f.a(parseInt, 10);
            } else if (interfaceC10094f.b(parseInt, 8)) {
                camcorderProfile = interfaceC10094f.a(parseInt, 8);
            } else if (interfaceC10094f.b(parseInt, 12)) {
                camcorderProfile = interfaceC10094f.a(parseInt, 12);
            } else if (interfaceC10094f.b(parseInt, 6)) {
                camcorderProfile = interfaceC10094f.a(parseInt, 6);
            } else if (interfaceC10094f.b(parseInt, 5)) {
                camcorderProfile = interfaceC10094f.a(parseInt, 5);
            } else if (interfaceC10094f.b(parseInt, 4)) {
                camcorderProfile = interfaceC10094f.a(parseInt, 4);
            }
            if (camcorderProfile == null) {
                size3 = size6;
                this.f100899s = androidx.camera.core.impl.W0.a(M.c.f17201c, new HashMap(), e11, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        size3 = size2;
        this.f100899s = androidx.camera.core.impl.W0.a(M.c.f17201c, new HashMap(), e11, new HashMap(), size3, new HashMap(), new HashMap());
    }

    private static Size c(StreamConfigurationMap streamConfigurationMap, int i11, boolean z11) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i11 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i11);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        G.e eVar = new G.e(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), eVar);
        Size size2 = M.c.f17199a;
        if (z11 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i11)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    private static int e(Range<Integer> range, Range<Integer> range2) {
        x2.i.f("Ranges must not intersect", (range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true);
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    private static int f(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    private Pair h(int i11, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i12, HashMap hashMap, HashMap hashMap2) {
        int i13;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5081a abstractC5081a = (AbstractC5081a) it.next();
            arrayList4.add(abstractC5081a.g());
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), abstractC5081a);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            Size size = (Size) list.get(i14);
            androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) arrayList2.get(((Integer) arrayList3.get(i14)).intValue());
            int i15 = b1Var.i();
            arrayList4.add(androidx.camera.core.impl.V0.g(i11, i15, size, i(i15)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), b1Var);
            }
            try {
                i13 = (int) (1.0E9d / ((StreamConfigurationMap) this.f100891k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(b1Var.i(), size));
            } catch (Exception unused) {
                i13 = 0;
            }
            i12 = Math.min(i12, i13);
        }
        return new Pair(arrayList4, Integer.valueOf(i12));
    }

    private void j(@NonNull Map<Integer, Size> map, @NonNull Size size, int i11) {
        if (this.f100896p) {
            Size c11 = c(this.f100891k.b().d(), i11, false);
            Integer valueOf = Integer.valueOf(i11);
            if (c11 != null) {
                size = (Size) Collections.min(Arrays.asList(size, c11), new G.e(false));
            }
            map.put(valueOf, size);
        }
    }

    final boolean a(@NonNull C10091e c10091e, List list) {
        List list2;
        HashMap hashMap = this.f100885e;
        if (hashMap.containsKey(c10091e)) {
            list2 = (List) hashMap.get(c10091e);
        } else {
            ArrayList arrayList = new ArrayList();
            if (c10091e.d()) {
                if (c10091e.a() == 0) {
                    arrayList.addAll(this.f100887g);
                }
            } else if (c10091e.b() == 8) {
                int a11 = c10091e.a();
                if (a11 != 1) {
                    ArrayList arrayList2 = this.f100881a;
                    if (a11 != 2) {
                        if (c10091e.c()) {
                            arrayList2 = this.f100884d;
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        arrayList.addAll(this.f100882b);
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    arrayList = this.f100883c;
                }
            } else if (c10091e.b() == 10 && c10091e.a() == 0) {
                arrayList.addAll(this.f100886f);
            }
            hashMap.put(c10091e, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 = ((androidx.camera.core.impl.U0) it.next()).c(list) != null;
            if (z11) {
                break;
            }
        }
        return z11;
    }

    final List d(@NonNull C10091e c10091e, List list) {
        T.a<Long> aVar = C1.f100872a;
        if (c10091e.a() != 0 || c10091e.b() != 8) {
            return null;
        }
        Iterator it = this.f100888h.iterator();
        while (it.hasNext()) {
            List<androidx.camera.core.impl.V0> c11 = ((androidx.camera.core.impl.U0) it.next()).c(list);
            if (c11 != null) {
                return c11;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x07ba, code lost:
    
        if (f(r6) < f(r10)) goto L308;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d3 A[SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Pair g(int i11, @NonNull ArrayList arrayList, @NonNull HashMap hashMap, boolean z11, boolean z12) {
        boolean z13;
        int i12;
        boolean z14;
        C10368u c10368u;
        HashMap hashMap2;
        int i13;
        HashMap hashMap3;
        HashMap hashMap4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Range<Integer> range;
        String str;
        List list;
        List list2;
        String str2;
        HashMap hashMap5;
        HashMap hashMap6;
        String str3;
        String str4;
        int i14;
        List list3;
        int i15;
        List list4;
        List list5;
        C10368u c10368u2;
        HashMap hashMap7;
        Range range2;
        HashMap hashMap8;
        Iterator it;
        Range<Integer>[] rangeArr;
        C10368u c10368u3;
        HashMap hashMap9;
        List list6;
        CameraCharacteristics.Key key;
        int i16;
        Rational rational;
        HashMap hashMap10;
        String str5;
        int i17;
        Set set;
        D1 d12 = this;
        HashMap hashMap11 = hashMap;
        C10081a1 c10081a1 = d12.f100901u;
        c10081a1.f();
        if (d12.f100899s == null) {
            d12.b();
        } else {
            d12.f100899s = androidx.camera.core.impl.W0.a(d12.f100899s.b(), d12.f100899s.g(), c10081a1.e(), d12.f100899s.f(), d12.f100899s.e(), d12.f100899s.c(), d12.f100899s.h());
        }
        ArrayList arrayList5 = new ArrayList(hashMap11.keySet());
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            int L11 = ((androidx.camera.core.impl.b1) it2.next()).L();
            if (!arrayList7.contains(Integer.valueOf(L11))) {
                arrayList7.add(Integer.valueOf(L11));
            }
        }
        Collections.sort(arrayList7);
        Collections.reverse(arrayList7);
        Iterator it3 = arrayList7.iterator();
        while (it3.hasNext()) {
            int intValue = ((Integer) it3.next()).intValue();
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                androidx.camera.core.impl.b1 b1Var = (androidx.camera.core.impl.b1) it4.next();
                if (intValue == b1Var.L()) {
                    arrayList6.add(Integer.valueOf(arrayList5.indexOf(b1Var)));
                }
            }
        }
        HashMap e11 = d12.f100904x.e(arrayList, arrayList5, arrayList6);
        Iterator it5 = arrayList.iterator();
        while (true) {
            if (it5.hasNext()) {
                if (((AbstractC5081a) it5.next()).d() == 4101) {
                    break;
                }
            } else {
                Iterator it6 = hashMap11.keySet().iterator();
                while (it6.hasNext()) {
                    if (((androidx.camera.core.impl.b1) it6.next()).i() == 4101) {
                    }
                }
                z13 = false;
            }
        }
        Iterator it7 = e11.values().iterator();
        while (true) {
            if (!it7.hasNext()) {
                i12 = 8;
                break;
            }
            if (((C.A) it7.next()).a() == 10) {
                i12 = 10;
                break;
            }
        }
        String str6 = d12.f100889i;
        if (i11 != 0 && z13) {
            throw new IllegalArgumentException(V.e.a("Camera device id is ", str6, ". Ultra HDR is not currently supported in ", i11 != 1 ? i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i11 != 0 && i12 == 10) {
            throw new IllegalArgumentException(V.e.a("Camera device id is ", str6, ". 10 bit dynamic range is not currently supported in ", i11 != 1 ? i11 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        C10091e c10091e = new C10091e(i11, i12, z11, z13);
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList8.add(((AbstractC5081a) it8.next()).g());
        }
        G.e eVar = new G.e(false);
        for (androidx.camera.core.impl.b1 b1Var2 : hashMap11.keySet()) {
            List list7 = (List) hashMap11.get(b1Var2);
            x2.i.a("No available output size is found for " + b1Var2 + ".", (list7 == null || list7.isEmpty()) ? false : true);
            Size size = (Size) Collections.min(list7, eVar);
            int i18 = b1Var2.i();
            arrayList8.add(androidx.camera.core.impl.V0.g(c10091e.a(), i18, size, d12.i(i18)));
        }
        boolean a11 = d12.a(c10091e, arrayList8);
        String str7 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str8 = " New configs: ";
        String str9 = "No supported surface combination is found for camera device - Id : ";
        if (!a11) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + str6 + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList + " New configs: " + arrayList5);
        }
        Iterator it9 = arrayList.iterator();
        Range<Integer> range3 = null;
        while (it9.hasNext()) {
            Range<Integer> h11 = ((AbstractC5081a) it9.next()).h();
            if (range3 == null) {
                range3 = h11;
            } else if (h11 != null) {
                try {
                    range3 = range3.intersect(h11);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        Iterator it10 = arrayList6.iterator();
        while (it10.hasNext()) {
            Range<Integer> I11 = ((androidx.camera.core.impl.b1) arrayList5.get(((Integer) it10.next()).intValue())).I(null);
            if (range3 == null) {
                range3 = I11;
            } else if (I11 != null) {
                try {
                    range3 = range3.intersect(I11);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        HashMap hashMap12 = new HashMap();
        Iterator it11 = hashMap11.keySet().iterator();
        while (true) {
            boolean hasNext = it11.hasNext();
            z14 = a11;
            c10368u = d12.f100891k;
            hashMap2 = e11;
            if (!hasNext) {
                break;
            }
            androidx.camera.core.impl.b1 b1Var3 = (androidx.camera.core.impl.b1) it11.next();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = arrayList6;
            HashMap hashMap13 = new HashMap();
            for (Size size2 : (List) hashMap11.get(b1Var3)) {
                Range<Integer> range4 = range3;
                int i19 = b1Var3.i();
                Iterator it12 = it11;
                String str10 = str8;
                V0.a c11 = androidx.camera.core.impl.V0.g(c10091e.a(), i19, size2, d12.i(i19)).c();
                if (range4 != null) {
                    try {
                        str5 = str7;
                        try {
                            i17 = (int) (1.0E9d / ((StreamConfigurationMap) c10368u.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i19, size2));
                        } catch (Exception unused3) {
                            i17 = 0;
                            set = (Set) hashMap13.get(c11);
                            if (set == null) {
                            }
                            if (set.contains(Integer.valueOf(i17))) {
                            }
                            range3 = range4;
                            it11 = it12;
                            str8 = str10;
                            str7 = str5;
                        }
                    } catch (Exception unused4) {
                        str5 = str7;
                    }
                } else {
                    str5 = str7;
                    i17 = Integer.MAX_VALUE;
                }
                set = (Set) hashMap13.get(c11);
                if (set == null) {
                    set = new HashSet();
                    hashMap13.put(c11, set);
                }
                if (set.contains(Integer.valueOf(i17))) {
                    arrayList9.add(size2);
                    set.add(Integer.valueOf(i17));
                }
                range3 = range4;
                it11 = it12;
                str8 = str10;
                str7 = str5;
            }
            hashMap12.put(b1Var3, arrayList9);
            hashMap11 = hashMap;
            a11 = z14;
            e11 = hashMap2;
            arrayList6 = arrayList10;
        }
        ArrayList arrayList11 = arrayList6;
        Range<Integer> range5 = range3;
        String str11 = str7;
        String str12 = str8;
        ArrayList arrayList12 = new ArrayList();
        Iterator it13 = arrayList11.iterator();
        while (it13.hasNext()) {
            androidx.camera.core.impl.b1 b1Var4 = (androidx.camera.core.impl.b1) arrayList5.get(((Integer) it13.next()).intValue());
            List<Size> list8 = (List) hashMap12.get(b1Var4);
            int i21 = b1Var4.i();
            d12.f100902v.getClass();
            char c12 = (((Nexus4AndroidLTargetAspectRatioQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) androidx.camera.camera2.internal.compat.quirk.a.a(c10368u).b(AspectRatioLegacyApi21Quirk.class)) == null) ? (char) 3 : (char) 2;
            if (c12 == 0) {
                rational = G.a.f9592a;
            } else if (c12 == 1) {
                rational = G.a.f9594c;
            } else if (c12 != 2) {
                rational = null;
            } else {
                Size size3 = d12.i(256).c().get(256);
                rational = new Rational(size3.getWidth(), size3.getHeight());
            }
            if (rational == null) {
                hashMap10 = hashMap12;
            } else {
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                for (Size size4 : list8) {
                    Rational rational2 = G.a.f9592a;
                    HashMap hashMap14 = hashMap12;
                    if (G.a.a(size4, rational, M.c.f17201c)) {
                        arrayList13.add(size4);
                    } else {
                        arrayList14.add(size4);
                    }
                    hashMap12 = hashMap14;
                }
                hashMap10 = hashMap12;
                arrayList14.addAll(0, arrayList13);
                list8 = arrayList14;
            }
            arrayList12.add(d12.f100903w.a(androidx.camera.core.impl.V0.e(i21), list8));
            hashMap12 = hashMap10;
        }
        Iterator it14 = arrayList12.iterator();
        int i22 = 1;
        while (it14.hasNext()) {
            i22 *= ((List) it14.next()).size();
        }
        if (i22 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList15 = new ArrayList();
        for (int i23 = 0; i23 < i22; i23++) {
            arrayList15.add(new ArrayList());
        }
        int i24 = 0;
        int size5 = i22 / ((List) arrayList12.get(0)).size();
        int i25 = i22;
        int i26 = 0;
        while (i26 < arrayList12.size()) {
            List list9 = (List) arrayList12.get(i26);
            int i27 = i24;
            while (i27 < i22) {
                int i28 = size5;
                ((List) arrayList15.get(i27)).add((Size) list9.get((i27 % i25) / i28));
                i27++;
                size5 = i28;
            }
            int i29 = size5;
            if (i26 < arrayList12.size() - 1) {
                size5 = i29 / ((List) arrayList12.get(i26 + 1)).size();
                i25 = i29;
            } else {
                size5 = i29;
            }
            i26++;
            i24 = 0;
        }
        HashMap hashMap15 = new HashMap();
        HashMap hashMap16 = new HashMap();
        HashMap hashMap17 = new HashMap();
        HashMap hashMap18 = new HashMap();
        boolean b11 = C1.b(arrayList, arrayList5);
        Iterator it15 = arrayList.iterator();
        int i31 = Integer.MAX_VALUE;
        while (it15.hasNext()) {
            AbstractC5081a abstractC5081a = (AbstractC5081a) it15.next();
            boolean z15 = b11;
            try {
                i16 = (int) (1.0E9d / ((StreamConfigurationMap) c10368u.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(abstractC5081a.d(), abstractC5081a.f()));
            } catch (Exception unused5) {
                i16 = 0;
            }
            i31 = Math.min(i31, i16);
            b11 = z15;
        }
        boolean z16 = b11;
        if (!d12.f100897q || z16) {
            i13 = i31;
            hashMap3 = hashMap17;
            hashMap4 = hashMap18;
            arrayList2 = arrayList;
            arrayList3 = arrayList15;
            arrayList4 = arrayList11;
            range = range5;
            str = str12;
            list = null;
            list2 = null;
        } else {
            Iterator it16 = arrayList15.iterator();
            list2 = null;
            loop18: while (true) {
                if (!it16.hasNext()) {
                    HashMap hashMap19 = hashMap18;
                    i13 = i31;
                    hashMap3 = hashMap17;
                    hashMap4 = hashMap19;
                    arrayList2 = arrayList;
                    arrayList3 = arrayList15;
                    arrayList4 = arrayList11;
                    range = range5;
                    list = null;
                    break;
                }
                arrayList2 = arrayList;
                arrayList3 = arrayList15;
                arrayList4 = arrayList11;
                range = range5;
                list = null;
                Pair h12 = d12.h(i11, arrayList2, (List) it16.next(), arrayList5, arrayList4, i31, hashMap17, hashMap18);
                HashMap hashMap20 = hashMap18;
                i13 = i31;
                hashMap3 = hashMap17;
                hashMap4 = hashMap20;
                list2 = d12.d(c10091e, (List) h12.first);
                if (list2 != null && !C1.a(hashMap3, hashMap4, list2)) {
                    list2 = null;
                }
                if (list2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                        long[] jArr = (long[]) c10368u.a(key);
                        if (jArr != null && jArr.length != 0) {
                            HashSet hashSet = new HashSet();
                            List list10 = list2;
                            for (long j11 : jArr) {
                                hashSet.add(Long.valueOf(j11));
                            }
                            Iterator it17 = list10.iterator();
                            while (it17.hasNext()) {
                                if (!hashSet.contains(Long.valueOf(((androidx.camera.core.impl.V0) it17.next()).f()))) {
                                }
                            }
                            list2 = list10;
                            break loop18;
                        }
                    }
                    list2 = null;
                }
                hashMap3.clear();
                hashMap4.clear();
                hashMap17 = hashMap3;
                i31 = i13;
                hashMap18 = hashMap4;
                d12 = this;
                arrayList11 = arrayList4;
                range5 = range;
                arrayList15 = arrayList3;
            }
            if (list2 == null && !z14) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + str6 + str11 + arrayList2 + str12 + arrayList5);
            }
            str = str12;
        }
        Iterator it18 = arrayList3.iterator();
        List list11 = list;
        List list12 = list11;
        int i32 = Integer.MAX_VALUE;
        boolean z17 = false;
        boolean z18 = false;
        int i33 = Integer.MAX_VALUE;
        while (true) {
            if (!it18.hasNext()) {
                str2 = str;
                hashMap5 = hashMap3;
                hashMap6 = hashMap4;
                str3 = str6;
                str4 = str9;
                i14 = i32;
                list3 = list2;
                i15 = i33;
                list4 = list11;
                list5 = list12;
                break;
            }
            List list13 = (List) it18.next();
            hashMap5 = hashMap3;
            int i34 = i13;
            str2 = str;
            str3 = str6;
            str4 = str9;
            hashMap6 = hashMap4;
            i14 = i32;
            list3 = list2;
            Pair h13 = h(i11, arrayList2, list13, arrayList5, arrayList4, i34, null, null);
            List list14 = (List) h13.first;
            i15 = ((Integer) h13.second).intValue();
            boolean z19 = range == null || i34 <= i15 || i15 >= range.getLower().intValue();
            if (z17 || !a(c10091e, list14)) {
                list6 = list13;
            } else {
                list6 = list13;
                if (i14 == Integer.MAX_VALUE || i14 < i15) {
                    list11 = list6;
                    i14 = i15;
                }
                if (z19) {
                    if (z18) {
                        list4 = list6;
                        i14 = i15;
                        list5 = list12;
                        i15 = i33;
                        break;
                    }
                    list11 = list6;
                    i14 = i15;
                    z17 = true;
                }
            }
            if (list3 == null || z18 || d(c10091e, list14) == null) {
                i33 = i33;
            } else {
                int i35 = i33;
                if (i35 != Integer.MAX_VALUE && i35 >= i15) {
                    i33 = i35;
                } else {
                    list12 = list6;
                    i33 = i15;
                }
                if (!z19) {
                    continue;
                } else {
                    if (z17) {
                        list5 = list6;
                        list4 = list11;
                        break;
                    }
                    list12 = list6;
                    i33 = i15;
                    z18 = true;
                }
            }
            i13 = i34;
            i32 = i14;
            list2 = list3;
            hashMap3 = hashMap5;
            str6 = str3;
            str = str2;
            hashMap4 = hashMap6;
            str9 = str4;
        }
        if (list4 == null) {
            StringBuilder b12 = C6594f.b(str4, str3, " and Hardware level: ");
            b12.append(this.f100893m);
            b12.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            b12.append(arrayList2);
            b12.append(str2);
            b12.append(arrayList5);
            throw new IllegalArgumentException(b12.toString());
        }
        if (range != null) {
            Range<Integer> range6 = androidx.camera.core.impl.T0.f38211a;
            if (range.equals(range6) || (rangeArr = (Range[]) c10368u.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
                c10368u2 = c10368u;
                hashMap7 = hashMap15;
                range2 = range6;
            } else {
                Range<Integer> range7 = new Range<>(Integer.valueOf(Math.min(range.getLower().intValue(), i14)), Integer.valueOf(Math.min(range.getUpper().intValue(), i14)));
                int length = rangeArr.length;
                Range<Integer> range8 = range6;
                int i36 = 0;
                int i37 = 0;
                while (true) {
                    if (i37 >= length) {
                        break;
                    }
                    int i38 = length;
                    Range<Integer> range9 = rangeArr[i37];
                    int i39 = i37;
                    if (i14 >= range9.getLower().intValue()) {
                        if (range8.equals(androidx.camera.core.impl.T0.f38211a)) {
                            range8 = range9;
                        }
                        if (range9.equals(range7)) {
                            range8 = range9;
                            break;
                        }
                        try {
                            int f7 = f(range9.intersect(range7));
                            if (i36 == 0) {
                                i36 = f7;
                                c10368u3 = c10368u;
                                hashMap9 = hashMap15;
                            } else {
                                if (f7 >= i36) {
                                    c10368u3 = c10368u;
                                    hashMap9 = hashMap15;
                                    double f11 = f(range8.intersect(range7));
                                    try {
                                        double f12 = f(range9.intersect(range7));
                                        double f13 = f12 / f(range9);
                                        double f14 = f11 / f(range8);
                                        i36 = f12 <= f11 ? f(range7.intersect(range8)) : f(range7.intersect(range8));
                                    } catch (IllegalArgumentException unused6) {
                                        if (i36 == 0) {
                                            if (e(range9, range7) >= e(range8, range7)) {
                                                if (e(range9, range7) == e(range8, range7)) {
                                                    if (range9.getLower().intValue() <= range8.getUpper().intValue()) {
                                                    }
                                                }
                                            }
                                            range8 = range9;
                                        }
                                        i37 = i39 + 1;
                                        hashMap15 = hashMap9;
                                        length = i38;
                                        c10368u = c10368u3;
                                    }
                                } else {
                                    c10368u3 = c10368u;
                                    hashMap9 = hashMap15;
                                }
                                range9 = range8;
                            }
                        } catch (IllegalArgumentException unused7) {
                            c10368u3 = c10368u;
                            hashMap9 = hashMap15;
                        }
                        range8 = range9;
                    } else {
                        c10368u3 = c10368u;
                        hashMap9 = hashMap15;
                    }
                    i37 = i39 + 1;
                    hashMap15 = hashMap9;
                    length = i38;
                    c10368u = c10368u3;
                }
                c10368u2 = c10368u;
                hashMap7 = hashMap15;
                range2 = range8;
            }
        } else {
            c10368u2 = c10368u;
            hashMap7 = hashMap15;
            range2 = list;
        }
        Iterator it19 = arrayList5.iterator();
        while (it19.hasNext()) {
            androidx.camera.core.impl.b1 b1Var5 = (androidx.camera.core.impl.b1) it19.next();
            T0.a a12 = androidx.camera.core.impl.T0.a((Size) list4.get(arrayList4.indexOf(Integer.valueOf(arrayList5.indexOf(b1Var5)))));
            HashMap hashMap21 = hashMap2;
            C.A a13 = (C.A) hashMap21.get(b1Var5);
            a13.getClass();
            a12.b(a13);
            C5123v0 R11 = C5123v0.R();
            T.a<Long> aVar = C9887a.f99590I;
            if (b1Var5.d(aVar)) {
                it = it19;
                R11.U(aVar, (Long) b1Var5.a(aVar));
            } else {
                it = it19;
            }
            T.a<Boolean> aVar2 = androidx.camera.core.impl.b1.f38262B;
            if (b1Var5.d(aVar2)) {
                R11.U(aVar2, (Boolean) b1Var5.a(aVar2));
            }
            T.a<Integer> aVar3 = C5098i0.f38313H;
            if (b1Var5.d(aVar3)) {
                R11.U(aVar3, (Integer) b1Var5.a(aVar3));
            }
            T.a<Integer> aVar4 = InterfaceC5100j0.f38330j;
            if (b1Var5.d(aVar4)) {
                R11.U(aVar4, (Integer) b1Var5.a(aVar4));
            }
            a12.d(new C9887a(R11));
            a12.f(z12);
            if (range2 != 0) {
                a12.c(range2);
            }
            hashMap16.put(b1Var5, a12.a());
            it19 = it;
            hashMap2 = hashMap21;
        }
        if (list3 != null && i14 == i15 && list4.size() == list5.size()) {
            for (int i41 = 0; i41 < list4.size(); i41++) {
                if (((Size) list4.get(i41)).equals(list5.get(i41))) {
                }
            }
            hashMap8 = hashMap7;
            if (!C1.f(c10368u2, arrayList2, hashMap16, hashMap8)) {
                C1.g(hashMap16, hashMap8, hashMap5, hashMap6, list3);
            }
            return new Pair(hashMap16, hashMap8);
        }
        hashMap8 = hashMap7;
        return new Pair(hashMap16, hashMap8);
    }

    @NonNull
    final androidx.camera.core.impl.W0 i(int i11) {
        CameraCharacteristics.Key key;
        ArrayList arrayList = this.f100900t;
        if (!arrayList.contains(Integer.valueOf(i11))) {
            j(this.f100899s.g(), M.c.f17203e, i11);
            j(this.f100899s.f(), M.c.f17205g, i11);
            Map<Integer, Size> c11 = this.f100899s.c();
            C10368u c10368u = this.f100891k;
            Size c12 = c(c10368u.b().d(), i11, true);
            if (c12 != null) {
                c11.put(Integer.valueOf(i11), c12);
            }
            Map<Integer, Size> h11 = this.f100899s.h();
            if (Build.VERSION.SDK_INT >= 31 && this.f100898r) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c10368u.a(key);
                if (streamConfigurationMap != null) {
                    h11.put(Integer.valueOf(i11), c(streamConfigurationMap, i11, true));
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return this.f100899s;
    }
}
