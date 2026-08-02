package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.Display;
import android.view.ViewGroup;
import com.facebook.w;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rik implements u02, ec3, xid, lnh, f, zzqp, zzyh, q92, pjd, gml, s35, xn3 {
    public static volatile rik f;
    public final /* synthetic */ int a;
    public static final rik b = new rik(0);
    public static final rik c = new rik(1);
    public static final rik d = new rik(3);
    public static final Object e = new Object();
    public static final rik g = new rik(5);
    public static final rik h = new rik(7);
    public static final rik i = new rik(8);
    public static final rik j = new rik(9);
    public static final rik k = new rik(10);
    public static final rik l = new rik(11);
    public static final rik m = new rik(12);
    public static final rik n = new rik(13);
    public static final rik o = new rik(14);

    public /* synthetic */ rik(int i2) {
        this.a = i2;
    }

    public static String h(long j2, bi4 bi4Var) {
        bi4Var.getClass();
        ConcurrentHashMap concurrentHashMap = hk4.a;
        return fc6.i(j2, hk4.a(bi4Var.d()));
    }

    public static String i(long j2, bi4 bi4Var, Locale locale, ZoneId zoneId) {
        locale.getClass();
        zoneId.getClass();
        return fc6.i(j2, DateTimeFormatter.ofPattern(bi4Var.d(), locale).withZone(zoneId).withDecimalStyle(DecimalStyle.of(locale)));
    }

    public static String j(Context context, long j2, bi4 bi4Var, String str) {
        context.getClass();
        return lnb.o(h(j2, bi4Var), str, m(j2, context));
    }

    public static String m(long j2, Context context) {
        context.getClass();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        return fc6.i(j2, hk4.a(bestPattern));
    }

    public static rik o() {
        rik rikVar;
        synchronized (e) {
            try {
                if (f == null) {
                    f = new rik(4);
                }
                rikVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rikVar;
    }

    public static final File p() {
        if (cw3.a.contains(rik.class)) {
            return null;
        }
        try {
            File file = new File(w.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            cw3.a(rik.class, th);
            return null;
        }
    }

    public static String q(long j2, Context context) {
        context.getClass();
        return ug5.u(j2) ? wv8.i(context.getString(R.string.today), ", ", m(j2, context)) : ug5.v(j2) ? wv8.i(context.getString(R.string.tomorrow), ", ", m(j2, context)) : j(context, j2, bi4.PATTERN_DMM, ", ");
    }

    public static String r(Long l2, long j2) {
        if (l2 != null) {
            long longValue = l2.longValue();
            LocalDate t = fc6.t(Instant.ofEpochSecond(j2));
            LocalDate localDate = Instant.ofEpochSecond(longValue).atZone(ZoneId.systemDefault()).toLocalDate();
            localDate.getClass();
            if (!t.isEqual(localDate)) {
                bi4 bi4Var = bi4.PATTERN_DMM;
                return lnb.o(h(j2, bi4Var), " - ", h(l2.longValue(), bi4Var));
            }
        }
        return h(j2, bi4.PATTERN_DMM);
    }

    public static String s(long j2, Context context) {
        context.getClass();
        if (ug5.u(j2)) {
            return m(j2, context);
        }
        if (ug5.v(j2)) {
            String string = context.getString(R.string.tomorrow);
            string.getClass();
            return string;
        }
        Locale d2 = dla.d();
        String string2 = context.getString(R.string.in_n_days);
        string2.getClass();
        return String.format(d2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(ug5.n(yaa.v(), j2 * 1000))}, 1));
    }

    public static void t(hcd hcdVar, ViewGroup viewGroup, pyf pyfVar) {
        hcdVar.getClass();
        viewGroup.getClass();
        fhh fhhVar = qyf.a;
        qyf qyfVar = (qyf) fhhVar.get(hcdVar.d());
        if (qyfVar == null) {
            qyfVar = (qyf) fhhVar.get(hcdVar.type());
        }
        if (qyfVar == null) {
            ((pcd) pyfVar).onError(new qcd(4, "No renderer installed for inline " + hcdVar.d() + ' ' + hcdVar.type(), null));
            return;
        }
        lcd lcdVar = viewGroup instanceof lcd ? (lcd) viewGroup : null;
        if (lcdVar == null) {
            Context context = viewGroup.getContext();
            context.getClass();
            lcdVar = new lcd(context);
        }
        f4a f4aVar = new f4a(hcdVar, qyf.c);
        qyfVar.a((hcd) f4aVar.c, lcdVar, new ag(0, new s53(1, viewGroup, lcdVar, pyfVar), f4aVar));
    }

    public static ky1 u(Context context, hcd hcdVar) {
        context.getClass();
        hcdVar.getClass();
        fhh fhhVar = qyf.b;
        ly1 ly1Var = (ly1) fhhVar.get(hcdVar.d());
        if (ly1Var == null) {
            ly1Var = (ly1) fhhVar.get(hcdVar.type());
        }
        if (iie.e.get() == null && (context instanceof Activity)) {
            iie.e = new WeakReference(context);
        }
        if (ly1Var == null) {
            cjb.a("No renderer installed for blocking " + hcdVar.d() + ' ' + hcdVar.type());
            return null;
        }
        ArrayList arrayList = qyf.c;
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            wt3.z(it.next());
            throw null;
        }
        int i2 = Boolean.parseBoolean((String) hcdVar.f().get("is_rewarded")) ? 5000 : 0;
        int i3 = ly1.b;
        ky1 ky1Var = new ky1(hcdVar, i3 > -1 ? i3 : 5000, i2 > 0 ? i2 : 0);
        ly1.b = -1;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return ky1Var;
        }
        wt3.z(it2.next());
        throw null;
    }

    public static long w(c9g c9gVar) {
        Object u2gVar;
        Date parse;
        c9gVar.getClass();
        try {
            p2g p2gVar = w2g.b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
            String str = c9gVar.e;
            u2gVar = Long.valueOf((str == null || (parse = simpleDateFormat.parse(str)) == null) ? 0L : parse.getTime() / 1000);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = 0L;
        }
        return ((Number) u2gVar).longValue();
    }

    public static String x(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.lnh
    public int a(int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        hda.L(new bqd((Throwable) obj));
    }

    @Override // defpackage.s35
    public File b(pia piaVar) {
        return null;
    }

    @Override // defpackage.q92
    public Class c() {
        return InputStream.class;
    }

    @Override // defpackage.xid
    public String e() {
        return "expected an Int value";
    }

    @Override // defpackage.u02
    public Rect f(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + dimensionPixelSize;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.q92
    public Object g(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.gml
    public lw1 k(String str, int i2, EnumMap enumMap) {
        int i3;
        int i4;
        int i5;
        lw1 lw1Var;
        int i6;
        int i7;
        if (str.isEmpty()) {
            a70.p("Found empty contents");
            return null;
        }
        if (i2 != 6) {
            a70.p("Can only encode DATA_MATRIX, but got ".concat(fn0.C(i2)));
            return null;
        }
        ipi ipiVar = (ipi) enumMap.get(cn5.c);
        ipi ipiVar2 = ipi.a;
        if (ipiVar == null) {
            ipiVar = ipiVar2;
        }
        if (enumMap.get(cn5.d) != null) {
            pvd.j();
            return null;
        }
        if (enumMap.get(cn5.e) != null) {
            pvd.j();
            return null;
        }
        int i8 = 0;
        int i9 = 1;
        int i10 = 2;
        fn5[] fn5VarArr = {new f8h(15), new dti(17), new k9j(i8), new k9j(i9), new tnf(21), new tnf(16)};
        in5 in5Var = new in5();
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i11 = 0;
        while (i11 < length) {
            char c2 = (char) (bytes[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            int i12 = i8;
            if (c2 == '?' && str.charAt(i11) != '?') {
                a70.p("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c2);
            i11++;
            i8 = i12;
        }
        int i13 = i8;
        in5Var.d = sb.toString();
        in5Var.e = ipiVar2;
        in5Var.f = new StringBuilder(str.length());
        in5Var.b = -1;
        StringBuilder sb2 = (StringBuilder) in5Var.f;
        in5Var.e = ipiVar;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            in5Var.e((char) 236);
            in5Var.c = 2;
            in5Var.a += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            in5Var.e((char) 237);
            in5Var.c = 2;
            in5Var.a += 7;
        }
        int i14 = i13;
        while (in5Var.b()) {
            fn5VarArr[i14].f(in5Var);
            int i15 = in5Var.b;
            if (i15 >= 0) {
                in5Var.b = -1;
                i14 = i15;
            }
        }
        int length2 = sb2.length();
        in5Var.d(sb2.length());
        int i16 = ((hpi) in5Var.g).b;
        if (length2 < i16 && i14 != 0 && i14 != 5 && i14 != 4) {
            in5Var.e((char) 254);
        }
        if (sb2.length() < i16) {
            sb2.append((char) 129);
        }
        while (sb2.length() < i16) {
            int length3 = ((sb2.length() + 1) * 149) % 253;
            int i17 = length3 + 130;
            if (i17 > 254) {
                i17 = length3 - 124;
            }
            sb2.append((char) i17);
        }
        String sb3 = sb2.toString();
        hpi e2 = hpi.e(sb3.length(), ipiVar);
        int i18 = e2.e;
        int i19 = e2.d;
        int[] iArr = vp5.a;
        int length4 = sb3.length();
        int i20 = e2.b;
        int i21 = e2.c;
        if (length4 != i20) {
            a70.p("The number of codewords does not match the selected symbol");
            return null;
        }
        StringBuilder sb4 = new StringBuilder(i20 + i21);
        sb4.append(sb3);
        int c3 = e2.c();
        if (c3 == 1) {
            sb4.append(vp5.a(i21, sb3));
        } else {
            sb4.setLength(sb4.capacity());
            int[] iArr2 = new int[c3];
            int[] iArr3 = new int[c3];
            int[] iArr4 = new int[c3];
            int i22 = i13;
            while (i22 < c3) {
                int i23 = i22 + 1;
                iArr2[i22] = e2.a(i23);
                iArr3[i22] = e2.h;
                iArr4[i22] = i13;
                if (i22 > 0) {
                    iArr4[i22] = iArr4[i22 - 1] + iArr2[i22];
                }
                i22 = i23;
            }
            for (int i24 = i13; i24 < c3; i24++) {
                StringBuilder sb5 = new StringBuilder(iArr2[i24]);
                for (int i25 = i24; i25 < i20; i25 += c3) {
                    sb5.append(sb3.charAt(i25));
                }
                String a = vp5.a(iArr3[i24], sb5.toString());
                int i26 = i13;
                int i27 = i24;
                while (i27 < iArr3[i24] * c3) {
                    sb4.setCharAt(i20 + i27, a.charAt(i26));
                    i27 += c3;
                    i26++;
                }
            }
        }
        String sb6 = sb4.toString();
        int b2 = e2.b() * i19;
        int d2 = e2.d() * i18;
        j12 j12Var = new j12(sb6, b2, d2);
        int i28 = j12Var.c;
        byte[] bArr = (byte[]) j12Var.e;
        int i29 = i13;
        int i30 = i29;
        int i31 = 4;
        while (true) {
            if (i31 == d2 && i30 == 0) {
                int i32 = d2 - 1;
                int i33 = i13;
                j12Var.C(i32, i33, i29, i9);
                j12Var.C(i32, i9, i29, i10);
                j12Var.C(i32, i10, i29, 3);
                j12Var.C(i33, b2 - 2, i29, 4);
                int i34 = b2 - 1;
                j12Var.C(i33, i34, i29, 5);
                j12Var.C(1, i34, i29, 6);
                j12Var.C(i10, i34, i29, 7);
                j12Var.C(3, i34, i29, 8);
                i29++;
            }
            i3 = d2 - 2;
            if (i31 == i3 && i30 == 0 && b2 % 4 != 0) {
                i4 = i28;
                j12Var.C(d2 - 3, 0, i29, 1);
                j12Var.C(i3, 0, i29, i10);
                j12Var.C(d2 - 1, 0, i29, 3);
                j12Var.C(0, b2 - 4, i29, 4);
                j12Var.C(0, b2 - 3, i29, 5);
                j12Var.C(0, b2 - 2, i29, 6);
                int i35 = b2 - 1;
                j12Var.C(0, i35, i29, 7);
                j12Var.C(1, i35, i29, 8);
                i29++;
            } else {
                i4 = i28;
            }
            if (i31 == i3 && i30 == 0 && b2 % 8 == 4) {
                j12Var.C(d2 - 3, 0, i29, 1);
                j12Var.C(i3, 0, i29, i10);
                j12Var.C(d2 - 1, 0, i29, 3);
                j12Var.C(0, b2 - 2, i29, 4);
                int i36 = b2 - 1;
                j12Var.C(0, i36, i29, 5);
                j12Var.C(1, i36, i29, 6);
                i5 = 2;
                j12Var.C(2, i36, i29, 7);
                j12Var.C(3, i36, i29, 8);
                i29++;
            } else {
                i5 = i10;
            }
            if (i31 == d2 + 4 && i30 == i5 && b2 % 8 == 0) {
                int i37 = d2 - 1;
                j12Var.C(i37, 0, i29, 1);
                int i38 = b2 - 1;
                j12Var.C(i37, i38, i29, i5);
                int i39 = b2 - 3;
                j12Var.C(0, i39, i29, 3);
                int i40 = b2 - 2;
                j12Var.C(0, i40, i29, 4);
                j12Var.C(0, i38, i29, 5);
                j12Var.C(1, i39, i29, 6);
                j12Var.C(1, i40, i29, 7);
                j12Var.C(1, i38, i29, 8);
                i29++;
            }
            while (true) {
                if (i31 < d2 && i30 >= 0 && bArr[(i31 * i4) + i30] < 0) {
                    j12Var.R(i31, i30, i29);
                    i29++;
                }
                int i41 = i31 - 2;
                int i42 = i30 + 2;
                if (i41 < 0 || i42 >= b2) {
                    break;
                }
                i31 = i41;
                i30 = i42;
            }
            int i43 = i31 - 1;
            int i44 = i30 + 5;
            while (true) {
                if (i43 >= 0 && i44 < b2 && bArr[(i43 * i4) + i44] < 0) {
                    j12Var.R(i43, i44, i29);
                    i29++;
                }
                int i45 = i43 + 2;
                int i46 = i44 - 2;
                if (i45 >= d2 || i46 < 0) {
                    break;
                }
                i43 = i45;
                i44 = i46;
            }
            i31 = i43 + 5;
            i30 = i44 - 1;
            if (i31 >= d2 && i30 >= b2) {
                break;
            }
            i28 = i4;
            i13 = 0;
            i9 = 1;
            i10 = 2;
        }
        int i47 = b2 - 1;
        boolean z = true;
        int i48 = d2 - 1;
        if (bArr[(i48 * i4) + i47] < 0) {
            bArr[(i48 * i4) + i47] = 1;
            bArr[(i3 * i4) + (b2 - 2)] = 1;
        }
        int b3 = e2.b() * i19;
        int d3 = e2.d() * i18;
        und undVar = new und((e2.b() * i19) + (e2.b() << 1), (e2.d() * i18) + (e2.d() << 1), 3);
        int i49 = 0;
        int i50 = 0;
        while (i50 < d3) {
            int i51 = i50 % i18;
            if (i51 == 0) {
                int i52 = 0;
                int i53 = 0;
                while (i52 < (e2.b() * i19) + (e2.b() << 1)) {
                    undVar.f(i53, i49, i52 % 2 == 0 ? z : false);
                    i53++;
                    i52++;
                    z = true;
                }
                i49++;
            }
            int i54 = 0;
            for (int i55 = 0; i55 < b3; i55++) {
                int i56 = i55 % i19;
                if (i56 == 0) {
                    undVar.f(i54, i49, true);
                    i54++;
                }
                undVar.f(i54, i49, bArr[(i50 * i4) + i55] == 1);
                int i57 = i54 + 1;
                if (i56 == i19 - 1) {
                    undVar.f(i57, i49, i50 % 2 == 0);
                    i54 += 2;
                } else {
                    i54 = i57;
                }
            }
            int i58 = i49 + 1;
            if (i51 == i18 - 1) {
                int i59 = 0;
                for (int i60 = 0; i60 < (e2.b() * i19) + (e2.b() << 1); i60++) {
                    undVar.f(i59, i58, true);
                    i59++;
                }
                i49 += 2;
            } else {
                i49 = i58;
            }
            i50++;
            z = true;
        }
        int i61 = undVar.b;
        int i62 = undVar.c;
        int max = Math.max(200, i61);
        int max2 = Math.max(200, i62);
        int min = Math.min(max / i61, max2 / i62);
        int i63 = (max - (i61 * min)) / 2;
        int i64 = (max2 - (i62 * min)) / 2;
        if (200 < i62 || 200 < i61) {
            lw1Var = new lw1(i61, i62);
            i6 = 0;
            i7 = 0;
        } else {
            lw1Var = new lw1(200, 200);
            i6 = i63;
            i7 = i64;
        }
        int[] iArr5 = lw1Var.d;
        int length5 = iArr5.length;
        for (int i65 = 0; i65 < length5; i65++) {
            iArr5[i65] = 0;
        }
        int i66 = i7;
        int i67 = 0;
        while (i67 < i62) {
            int i68 = i6;
            int i69 = 0;
            while (i69 < i61) {
                if (undVar.c(i69, i67) == 1) {
                    lw1Var.c(i68, i66, min, min);
                }
                i69++;
                i68 += min;
            }
            i67++;
            i66 += min;
        }
        return lw1Var;
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        Object h2 = vngVar.h(new oif(s9k.class, Executor.class));
        h2.getClass();
        return fz8.P((Executor) h2);
    }

    @Override // defpackage.pjd
    public Object n() {
        return new nbb(true);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "Start";
            default:
                return super.toString();
        }
    }

    public String v(String str) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.d(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            String join = TextUtils.join(" ", (String[]) new Regex("\\s+").h(str.subSequence(i2, length + 1).toString()).toArray(new String[0]));
            join.getClass();
            return join;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public int[] y(String str) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            str.getClass();
            int[] iArr = new int[128];
            String v = v(str);
            Charset forName = Charset.forName(C.UTF8_NAME);
            forName.getClass();
            byte[] bytes = v.getBytes(forName);
            bytes.getClass();
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    @Override // defpackage.s35
    public void d(pia piaVar, sx2 sx2Var) {
    }
}
