package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.Country;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class n9e {
    public static final tc3 a = new tc3(2061575337, new ed3(11), false);
    public static final tc3 b = new tc3(302005192, new pd3(15), false);
    public static final tc3 c = new tc3(556651098, new ud3(6), false);
    public static final m39 d = new m39(5);
    public static final k20 e = new k20(1000);
    public static final k20 f;
    public static final k20 g;
    public static final Object h;
    public static volatile wo0 i;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    static {
        new k20(1007);
        f = new k20(1008);
        g = new k20(1002);
        h = new Object();
    }

    public static String A(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c90.v(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int B(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c90.C(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public static Uri C(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c90.D(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final Integer D(Iterable iterable, Function1 function1) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                b.q();
                throw null;
            }
            if (((Boolean) function1.invoke(next)).booleanValue()) {
                break;
            }
            i2++;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (i2 != -1) {
            return valueOf;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(ga5 ga5Var) {
        if (((wtc) ga5Var).a.n) {
            c6o.a0(ga5Var, 1).l1();
        }
    }

    public static final boolean F(String str) {
        return !(str == null || str.length() == 0);
    }

    public static final String G(String str, String str2) {
        List split$default;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{str2}, false, 0, 6, null);
        return CollectionsKt.f0(CollectionsKt.B0(split$default), str2, null, null, null, 62);
    }

    public static final Integer H(int i2, csa csaVar) {
        Object obj;
        Iterator it = csaVar.k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dsa) obj).a == i2) {
                break;
            }
        }
        dsa dsaVar = (dsa) obj;
        if (dsaVar != null) {
            return Integer.valueOf((-(((((int) (csaVar.e() >> 32)) - (-csaVar.l)) - csaVar.p) - dsaVar.p)) / 2);
        }
        return null;
    }

    public static boolean I() {
        VersionInfo version = MobileAds.getVersion();
        version.getClass();
        VersionInfo versionInfo = new VersionInfo(1, 2, 0);
        return version.getMajorVersion() > versionInfo.getMajorVersion() || (version.getMajorVersion() == versionInfo.getMajorVersion() && (version.getMinorVersion() > versionInfo.getMinorVersion() || (version.getMinorVersion() == versionInfo.getMinorVersion() && version.getMicroVersion() >= versionInfo.getMicroVersion())));
    }

    public static final xtc J(xtc xtcVar, String str) {
        return xtcVar.z(new l7j(str));
    }

    public static final Bundle K(FirebaseBundle firebaseBundle) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Long> entry : firebaseBundle.getLongMap().entrySet()) {
            bundle.putLong(entry.getKey(), entry.getValue().longValue());
        }
        for (Map.Entry<String, Double> entry2 : firebaseBundle.getDoubleMap().entrySet()) {
            bundle.putDouble(entry2.getKey(), entry2.getValue().doubleValue());
        }
        for (Map.Entry<String, String> entry3 : firebaseBundle.getStringMap().entrySet()) {
            bundle.putString(entry3.getKey(), entry3.getValue());
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Icon L(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        String str;
        InputStream openInputStream;
        int i2 = iconCompat.a;
        switch (i2) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                a70.p("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i2 == -1) {
                    str = A(iconCompat.b);
                } else {
                    if (i2 != 2) {
                        yhk.r(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str2 = iconCompat.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.b).split(":", -1)[0] : iconCompat.j;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = y9.a(iconCompat.c());
                    break;
                } else {
                    if (context == null) {
                        zzl.i(iconCompat.c(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri c2 = iconCompat.c();
                    String scheme = c2.getScheme();
                    if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme) || U3.i.b.equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(c2);
                        } catch (Exception unused) {
                            c2.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException unused2) {
                            c2.toString();
                            openInputStream = null;
                            if (openInputStream == null) {
                            }
                        }
                    }
                    if (openInputStream == null) {
                        sw9.i(iconCompat.c(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static final joa M(Function0 function0, Function0 function02) {
        return ypa.a(ysa.c, new h84(18, function0, function02));
    }

    public static final List N(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return km5.a;
        }
        ArrayList U0 = CollectionsKt.U0(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            xqa xqaVar = (xqa) arrayList.get(i4);
            int index = xqaVar.getIndex();
            if (i2 <= index && index <= i3) {
                U0.add(xqaVar);
            }
        }
        n13.u(d, U0);
        return U0;
    }

    public static boolean O(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static ez2 P(File file) {
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        file.getClass();
        hq4Var.getClass();
        CoroutineContext plus = new gu3("file-writer").plus(hq4Var);
        rq3 rq3Var = null;
        int i2 = 5;
        zi7 zi7Var = new zi7(file, rq3Var, i2);
        plus.getClass();
        va2 va2Var = new va2();
        g9i L = xw3.L(c09.a, plus, null, new u1(zi7Var, va2Var, rq3Var, i2), 2);
        L.n(new ic2(va2Var, 1));
        return new ez2(va2Var, new r3(L, rq3Var, 4));
    }

    public static final void a(ss1 ss1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        tc3 tc3Var;
        int i4;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1357509071);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(ss1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = 0;
        int i7 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i8 = ss1Var.g;
            x43 x43Var = ss1Var.p;
            String str = ss1Var.h;
            String str2 = ss1Var.i;
            boolean z = ss1Var.e;
            tc3 H = yqo.H(-1513838389, av8Var2, new os1(ss1Var, i6));
            tc3 H2 = yqo.H(970283601, av8Var2, new os1(ss1Var, i7));
            tc3 H3 = yqo.H(102356239, av8Var2, new os1(ss1Var, i5));
            int i9 = i3 & 112;
            boolean i10 = (i9 == 32) | av8Var2.i(ss1Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i10 || O == a99Var) {
                tc3Var = H3;
                i4 = 0;
                O = new ps1(function1, ss1Var, i4);
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i4 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i9 == 32) {
                i4 = 1;
            }
            int i11 = i4 | (av8Var2.i(ss1Var) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i11 != 0 || O2 == a99Var) {
                O2 = new ps1(function1, ss1Var, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i8, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i3 & 896) | 1600512, (i3 << 15) & 3670016, 62624);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qs1(ss1Var, function1, xtcVar, i2, 0);
        }
    }

    public static ewh b(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        w52 w52Var = new w52();
        w52Var.m(length, bArr);
        return new ewh(w52Var);
    }

    public static final void c(int i2, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1674839039);
        if (av8Var2.T(i2 & 1, i2 != 0)) {
            String upperCase = oea.v(R.string.coming_soon, av8Var2).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long D = lz.D(R.color.primary_default, av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(upperCase, l98.c0(q(utc.a, lz.D(R.color.primary_highlight, av8Var2), o7g.a(12.0f)), 6.0f, 2.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 109560);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sc6(i2, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0050  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i2, int i3, of3 of3Var, xtc xtcVar, String str, String str2, String str3, Function0 function0) {
        xtc xtcVar2;
        int i4;
        Function0 function02;
        int i5;
        int i6;
        String str4;
        int i7;
        xtc xtcVar3;
        String str5;
        eqf u;
        int i8;
        xtc xtcVar4;
        Function0 function03;
        xtc xtcVar5;
        str.getClass();
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1105345661);
        int i9 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(str2) ? 32 : 16);
        int i10 = i3 & 4;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i9 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i5 = i9 | 3072;
                function02 = function0;
            } else {
                function02 = function0;
                i5 = i9 | (av8Var.i(function02) ? a.o : 1024);
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i7 = i5 | 24576;
                str4 = str3;
            } else {
                str4 = str3;
                i7 = i5 | (av8Var.g(str4) ? 16384 : 8192);
            }
            if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                str5 = str4;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar6 = i10 != 0 ? utcVar : xtcVar2;
                if (i4 != 0) {
                    function02 = null;
                }
                String str6 = i6 != 0 ? null : str4;
                xtc d2 = bkh.d(l98.b0(xtcVar6, 8.0f), 1.0f);
                lv1 lv1Var = uxf.m;
                wxf wxfVar = ww9.b;
                l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                Function0 function04 = function02;
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d2);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                yf8 yf8Var = xth.a;
                xtc xtcVar7 = xtcVar6;
                int i11 = i7;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, i7 & 14, 0, 131066);
                av8 av8Var2 = av8Var;
                w1l.o(1.0f, true, av8Var2);
                if (str6 == null) {
                    av8Var2.d0(1058385953);
                    av8Var2.s(false);
                    i8 = 0;
                    xtcVar4 = utcVar;
                } else {
                    av8Var2.d0(1058385954);
                    i8 = 0;
                    udj.c(str6, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, (i11 >> 12) & 14, 0, 131066);
                    av8Var2 = av8Var2;
                    xtcVar4 = utcVar;
                    nq8.h(av8Var2, bkh.p(xtcVar4, 16.0f));
                    Unit unit = Unit.a;
                    av8Var2.s(false);
                }
                av8Var2.d0(1835265389);
                if (function04 != null) {
                    long D = lz.D(R.color.n_lv_4, av8Var2);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[i8];
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = b74.d;
                        av8Var2.n0(O2);
                    }
                    function03 = function04;
                    gm gmVar = new gm((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), function03, 12);
                    xtc xtcVar8 = xtcVar4;
                    xtcVar4 = tol.y(xtcVar8, true, true, true, D, wzcVar, gmVar, av8Var2, 0);
                    xtcVar5 = xtcVar8;
                } else {
                    function03 = function04;
                    xtcVar5 = xtcVar4;
                }
                av8Var2.s(i8);
                l8g a3 = k8g.a(wxfVar, uxf.l, av8Var2, i8);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, xtcVar4);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a3, f50Var);
                waa.K(av8Var2, m2, ff3Var);
                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C2, f50Var3);
                av8 av8Var3 = av8Var2;
                Function0 function05 = function03;
                udj.c(str2, null, function03 == null ? ljg.f(av8Var2, -343179324, R.color.n_lv_1, av8Var2, i8) : ljg.f(av8Var2, -343178834, R.color.primary_default, av8Var2, i8), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, function03 == null ? xth.e() : xth.l(), av8Var3, (i11 >> 3) & 14, 0, 131066);
                av8Var = av8Var3;
                if (function05 != null) {
                    av8Var.d0(-2048507456);
                    kq9.a(haa.t(R.drawable.ic_chevron_right_large_16, i8, av8Var), null, bkh.l(l98.f0(xtcVar5, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 440, 0);
                    av8Var.s(i8);
                } else {
                    av8Var.d0(-2048179321);
                    av8Var.s(i8);
                }
                av8Var.s(true);
                av8Var.s(true);
                str5 = str6;
                function02 = function05;
                xtcVar3 = xtcVar7;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ei(i2, i3, xtcVar3, str, str2, str5, function02);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void e(ww5 ww5Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-201502533);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? av8Var.g(ww5Var) : av8Var.i(ww5Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 5);
            boolean i5 = av8Var.i(ww5Var) | ((i4 & 112) == 32);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new r82(28, ww5Var, function1);
                av8Var.n0(O);
            }
            v8a.a(J, null, C, null, null, null, false, null, (Function1) O, av8Var, 100663680, 250);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(ww5Var, function1, xtcVar2, i2, 20);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if ((r23 & 8) != 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(mp6 mp6Var, Function1 function1, xtc xtcVar, long j2, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        long j3;
        mp6Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-660806266);
        int i4 = 2;
        long j4 = j2;
        int i5 = i2 | (av8Var.g(mp6Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (((i3 & 8) == 0 && av8Var.f(j4)) ? a.o : 1024);
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                if ((i3 & 8) != 0) {
                    j4 = lz.D(R.color.surface_1, av8Var);
                    i5 &= -7169;
                }
                long j5 = j4;
                av8Var.t();
                boolean z = mp6Var.h != lp6.a;
                ek2 t = rd0.t(j5, av8Var, (i5 >> 9) & 14);
                n7g a2 = o7g.a(16.0f);
                gk2 u = rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62);
                av8Var.d0(620356852);
                xtcVar2 = xtcVar;
                xtc e2 = bkh.e(xtcVar2, 96.0f);
                if (z) {
                    boolean z2 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
                    Object O = av8Var.O();
                    if (z2 || O == nf3.a) {
                        O = new h84(23, function1, mp6Var);
                        av8Var.n0(O);
                    }
                    e2 = e2.z(tol.n(utc.a, 0.95f, (Function0) O, 2));
                }
                av8Var.s(false);
                un0.a(e2, a2, t, u, null, yqo.H(-1512546696, av8Var, new kr1(mp6Var, i4)), av8Var, 196608, 16);
                j3 = j5;
            } else {
                av8Var.W();
            }
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
            j3 = j4;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new dv6(mp6Var, function1, xtcVar2, j3, i2, i3);
        }
    }

    public static final void g(final int i2, int i3, final long j2, of3 of3Var, xtc xtcVar, final Function1 function1, final boolean z) {
        av8 av8Var;
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-974126357);
        int i4 = i3 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | 24576;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            final Context context = (Context) av8Var2.k(nz.b);
            final cdi M = hda.M(j2, av8Var2, (i4 >> 3) & 14);
            final mhj mhjVar = new mhj(((js8) M.getValue()).d, R.string.days_short);
            final mhj mhjVar2 = new mhj(((js8) M.getValue()).e, R.string.hours_short);
            final mhj mhjVar3 = new mhj(((js8) M.getValue()).f, R.string.minutes_short);
            final mhj mhjVar4 = new mhj(((js8) M.getValue()).g, R.string.seconds_short);
            ek2 t = rd0.t(lz.D(R.color.surface_1, av8Var2), av8Var2, 0);
            n7g a2 = o7g.a(12.0f);
            tc3 H = yqo.H(-1299185735, av8Var2, new ct8() { // from class: w77
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String w;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((v23) obj).getClass();
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                        kv1 kv1Var = uxf.p;
                        utc utcVar = utc.a;
                        xtc q = bkh.q(fz8.d0(l98.b0(utcVar, 16.0f), n9a.b), 232.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        u23 a3 = t23.a(ww9.d, kv1Var, av8Var3, 48);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m = av8Var3.m();
                        xtc C = fqj.C(av8Var3, q);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a3, hf3.g);
                        waa.K(av8Var3, m, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C, hf3.d);
                        kq9.b(s6a.N(R.drawable.ic_matches, 6, av8Var3), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var3), av8Var3, 432, 0);
                        nq8.h(av8Var3, bkh.e(utcVar, 24.0f));
                        long D = lz.D(R.color.n_lv_1, av8Var3);
                        yf8 yf8Var = xth.a;
                        dfj j3 = xth.j();
                        cdi cdiVar = M;
                        boolean z2 = ((js8) cdiVar.getValue()).a;
                        int i5 = i2;
                        if (z2) {
                            av8Var3.d0(-864045684);
                            w = oea.w(R.string.fantasy_round_reveal_countdown, new Object[]{Integer.valueOf(i5)}, av8Var3);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(-863925590);
                            w = oea.w(R.string.fantasy_round_x_fixtures_are_set, new Object[]{Integer.valueOf(i5)}, av8Var3);
                            av8Var3.s(false);
                        }
                        udj.c(w, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j3, av8Var3, 0, 24960, 110586);
                        udj.c(rik.j(context, j2, bi4.PATTERN_DMM, ", "), null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
                        nq8.h(av8Var3, bkh.e(utcVar, 24.0f));
                        xtc g2 = bkh.g(utcVar, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        mv1 mv1Var = uxf.g;
                        Boolean valueOf = Boolean.valueOf(((js8) cdiVar.getValue()).a);
                        Object O = av8Var3.O();
                        if (O == nf3.a) {
                            O = new yt6(24);
                            av8Var3.n0(O);
                        }
                        l98.b(valueOf, g2, (Function1) O, mv1Var, null, null, yqo.H(55808224, av8Var3, new y77(mhjVar, mhjVar2, mhjVar3, mhjVar4, z, function1, cdiVar)), av8Var3, 1576368, 48);
                        av8Var3.s(true);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            });
            utc utcVar = utc.a;
            av8Var = av8Var2;
            un0.a(utcVar, a2, t, null, null, H, av8Var, 196614, 24);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x77(i2, i3, j2, xtcVar2, function1, z);
        }
    }

    public static final void h(gv9 gv9Var, ev6 ev6Var, Function1 function1, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        gv9Var.getClass();
        function1.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2074020196);
        int i3 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.g(ev6Var) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            int i4 = ev6Var.c;
            BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
            it7 it7Var = un6.b;
            un6 un6Var = un6.FULL;
            it7Var.getClass();
            av8Var = av8Var2;
            wkn.d(i4, brandingFantasyCompetition, it7.x(brandingFantasyCompetition, un6Var, true), d2, yqo.H(-47771570, av8Var2, new er6(16, gv9Var, ev6Var, function0, function1)), av8Var, 24576);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(gv9Var, ev6Var, function1, function0, xtcVar, i2, 10);
        }
    }

    public static final void i(rm7 rm7Var, ksa ksaVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(239643127);
        int i3 = (av8Var.g(rm7Var) ? 4 : 2) | i2 | (av8Var.g(ksaVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            wkn.a(Boolean.valueOf(rm7Var.d), null, null, null, yqo.H(349476824, av8Var, new hl6(3, ksaVar, rm7Var)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(rm7Var, ksaVar, i2, 17);
        }
    }

    public static final void j(tm7 tm7Var, Function1 function1, of3 of3Var, int i2) {
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-29930426);
        int i3 = 4;
        int i4 = (av8Var.i(tm7Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            cdi O = z1a.O(a2, av8Var);
            Boolean bool = (Boolean) O.getValue();
            bool.booleanValue();
            boolean g2 = av8Var.g(O) | ((i4 & 112) == 32);
            Object O2 = av8Var.O();
            if (g2 || O2 == nf3.a) {
                O2 = new p97(function1, O, null, i3);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, bool, (Function2) O2);
            i((rm7) ((eoh) tm7Var.h).getValue(), a2, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(tm7Var, function1, i2, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    public static final void k(qm7 qm7Var, xtc xtcVar, of3 of3Var, int i2) {
        qm7 qm7Var2;
        xtc xtcVar2;
        ?? r15;
        boolean z;
        boolean z2;
        String str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1879189295);
        int i3 = i2 | (av8Var.g(qm7Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d2 = bkh.d(utcVar, 1.0f);
            wxf wxfVar = ww9.b;
            lv1 lv1Var = uxf.l;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            p8g p8gVar = p8g.a;
            xtc a4 = p8gVar.a(1.0f, utcVar, true);
            String v = oea.v(R.string.total, av8Var);
            int i4 = qm7Var.a;
            String str2 = qm7Var.h;
            String str3 = qm7Var.g;
            boolean z3 = qm7Var.c;
            boolean z4 = qm7Var.d;
            l4a.c(v, String.valueOf(i4), a4, av8Var, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            l4a.c(oea.v(R.string.fantasy_deducted_pts, av8Var), String.valueOf(qm7Var.b), p8gVar.a(1.0f, utcVar, true), av8Var, 0);
            bf3.t(av8Var, true, utcVar, 8.0f, av8Var);
            if (z3 || z4) {
                av8Var.d0(-895342486);
                xtc d3 = bkh.d(utcVar, 1.0f);
                l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, d3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                String str4 = "-";
                if (z3) {
                    av8Var.d0(1386018721);
                    xtc a6 = p8gVar.a(1.0f, utcVar, true);
                    String v2 = oea.v(R.string.fantasy_quick_fix_token, av8Var);
                    qm7Var2 = qm7Var;
                    if (qm7Var2.e) {
                        z2 = false;
                        str = ljg.k(av8Var, -232376095, R.string.available, av8Var, false);
                    } else {
                        z2 = false;
                        z2 = false;
                        if (str3 != null) {
                            av8Var.d0(-232372294);
                            str = oea.w(R.string.fantasy_token_used_in_round, new Object[]{str3}, av8Var);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(1386522576);
                            av8Var.s(false);
                            str = "-";
                        }
                    }
                    l4a.c(v2, str, a6, av8Var, z2 ? 1 : 0);
                    if (z4) {
                        ljg.r(8.0f, 1386631281, av8Var, av8Var, utcVar);
                        av8Var.s(z2);
                    } else {
                        av8Var.d0(1386714888);
                        av8Var.s(z2);
                    }
                    av8Var.s(z2);
                    r15 = z2;
                } else {
                    r15 = 0;
                    qm7Var2 = qm7Var;
                    av8Var.d0(1386732744);
                    av8Var.s(false);
                }
                if (z4) {
                    av8Var.d0(1386824008);
                    xtc a7 = p8gVar.a(1.0f, utcVar, true);
                    String v3 = oea.v(R.string.fantasy_rebuild_squad_token, av8Var);
                    if (qm7Var2.f) {
                        str4 = ljg.k(av8Var, -232350399, R.string.available, av8Var, r15);
                    } else if (str2 != null) {
                        av8Var.d0(-232346466);
                        str4 = oea.w(R.string.fantasy_token_used_in_round, new Object[]{str2}, av8Var);
                        av8Var.s(r15);
                    } else {
                        av8Var.d0(1387327088);
                        av8Var.s(r15);
                    }
                    l4a.c(v3, str4, a7, av8Var, r15);
                    av8Var.s(r15);
                } else {
                    av8Var.d0(1387395400);
                    av8Var.s(r15);
                }
                z = true;
                av8Var.s(true);
                av8Var.s(r15);
            } else {
                av8Var.d0(-893836599);
                av8Var.s(false);
                qm7Var2 = qm7Var;
                z = true;
            }
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            qm7Var2 = qm7Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(qm7Var2, xtcVar2, i2, 18);
        }
    }

    public static final void l(dh8 dh8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1025348657);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(dh8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            String str = dh8Var.h;
            String str2 = dh8Var.i;
            tc3 H = yqo.H(-1596996336, av8Var2, new zg8(dh8Var, 3));
            boolean i5 = av8Var2.i(dh8Var) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            if (i5 || O == nf3.a) {
                O = new ah8(function1, dh8Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, null, null, str, str2, (Function0) O, av8Var, ((i3 >> 6) & 14) | 1573248, 442);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bh8(dh8Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void m(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1686415655);
        int i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtcVar2 = xtcVar;
            dy0.b(xtcVar2, null, yqo.H(-239302993, av8Var, new cv5(av8Var.k(dh3.n) == ema.b, i4)), av8Var, (i3 & 14) | 3072, 6);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 6);
        }
    }

    public static final void n(long j2, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1465846993);
        int i4 = (av8Var.f(j2) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_crowdsourcing, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
            String E = uxf.E(j2, 58, false);
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            i3 = 1;
            udj.c(E, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kv3(j2, i2, i3);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(4:(1:(1:(2:12|13))(2:15|16))|24|22|23)(4:25|26|(4:28|(1:30)|22|23)(2:31|(1:33))|21)|17|(1:19)|22|23))|38|6|7|(0)(0)|17|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r7.f(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[Catch: Exception -> 0x0083, TRY_LEAVE, TryCatch #0 {Exception -> 0x0083, blocks: (B:16:0x0035, B:17:0x0068, B:19:0x0072, B:24:0x0039, B:26:0x0040, B:28:0x004a, B:31:0x005b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(ksa ksaVar, int i2, sq3 sq3Var) {
        ce3 ce3Var;
        int i3;
        Integer H;
        if (sq3Var instanceof ce3) {
            ce3Var = (ce3) sq3Var;
            int i4 = ce3Var.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ce3Var.u = i4 - Integer.MIN_VALUE;
                Object obj = ce3Var.t;
                lu3 lu3Var = lu3.a;
                i3 = ce3Var.u;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            i2 = ce3Var.s;
                            ksaVar = ce3Var.r;
                            y6a.M(obj);
                        } else if (i3 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y6a.M(obj);
                    return Unit.a;
                }
                y6a.M(obj);
                Integer H2 = H(i2, ksaVar.j());
                if (H2 != null) {
                    int intValue = H2.intValue();
                    ce3Var.r = null;
                    ce3Var.s = i2;
                    ce3Var.u = 1;
                    if (ksaVar.f(i2, intValue, ce3Var) == lu3Var) {
                    }
                    return Unit.a;
                }
                ce3Var.r = ksaVar;
                ce3Var.s = i2;
                ce3Var.u = 2;
                if (ksa.l(i2, ce3Var, ksaVar) == lu3Var) {
                }
                return lu3Var;
                H = H(i2, ksaVar.j());
                if (H != null) {
                    int intValue2 = H.intValue();
                    ce3Var.r = null;
                    ce3Var.s = i2;
                    ce3Var.u = 3;
                }
                return Unit.a;
            }
        }
        ce3Var = new ce3(sq3Var);
        Object obj2 = ce3Var.t;
        lu3 lu3Var2 = lu3.a;
        i3 = ce3Var.u;
        if (i3 == 0) {
        }
        H = H(i2, ksaVar.j());
        if (H != null) {
        }
        return Unit.a;
    }

    public static xtc p(xtc xtcVar, n52 n52Var, n7g n7gVar, int i2) {
        uah uahVar = n7gVar;
        if ((i2 & 2) != 0) {
            uahVar = oyn.e;
        }
        return xtcVar.z(new cy0(0L, n52Var, uahVar, 1));
    }

    public static final xtc q(xtc xtcVar, long j2, uah uahVar) {
        return xtcVar.z(new cy0(j2, null, uahVar, 2));
    }

    public static final void r(long j2, ewd ewdVar) {
        if (ewdVar == ewd.a) {
            if (an3.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            u3a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (an3.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            u3a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static IconCompat s(Icon icon) {
        icon.getClass();
        int B = B(icon);
        if (B == 2) {
            return IconCompat.a(z(icon), A(icon));
        }
        if (B == 4) {
            Uri C = C(icon);
            PorterDuff.Mode mode = IconCompat.k;
            C.getClass();
            String uri = C.toString();
            uri.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = uri;
            return iconCompat;
        }
        if (B != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri C2 = C(icon);
        PorterDuff.Mode mode2 = IconCompat.k;
        C2.getClass();
        String uri2 = C2.toString();
        uri2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = uri2;
        return iconCompat3;
    }

    public static final t3e t(pr4 pr4Var, float f2) {
        pr4Var.getClass();
        if (pr4Var.n() == 1) {
            return l98.B(f2, 2);
        }
        boolean z = pr4Var.k() == pr4Var.n() - 1;
        float f3 = z ? 32.0f : f2;
        if (!z) {
            f2 = 32.0f;
        }
        return l98.C(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
    }

    public static final void u(Context context, Function1 function1) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        function1.invoke(edit);
        edit.apply();
    }

    public static k7l v(wm3 wm3Var, int i2, ArrayList arrayList, k7l k7lVar) {
        int i3;
        int i4 = i2 == 0 ? wm3Var.o0 : wm3Var.p0;
        if (i4 != -1 && (k7lVar == null || i4 != k7lVar.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                k7l k7lVar2 = (k7l) arrayList.get(i5);
                if (k7lVar2.b == i4) {
                    if (k7lVar != null) {
                        k7lVar.c(i2, k7lVar2);
                        arrayList.remove(k7lVar);
                    }
                    k7lVar = k7lVar2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return k7lVar;
        }
        if (k7lVar == null) {
            if (wm3Var instanceof t99) {
                t99 t99Var = (t99) wm3Var;
                int i6 = 0;
                while (true) {
                    if (i6 >= t99Var.s0) {
                        i3 = -1;
                        break;
                    }
                    wm3 wm3Var2 = t99Var.r0[i6];
                    if ((i2 == 0 && (i3 = wm3Var2.o0) != -1) || (i2 == 1 && (i3 = wm3Var2.p0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        k7l k7lVar3 = (k7l) arrayList.get(i7);
                        if (k7lVar3.b == i3) {
                            k7lVar = k7lVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (k7lVar == null) {
                k7lVar = new k7l();
                k7lVar.a = new ArrayList();
                k7lVar.d = null;
                k7lVar.e = -1;
                int i8 = k7l.f;
                k7l.f = i8 + 1;
                k7lVar.b = i8;
                k7lVar.c = i2;
            }
            arrayList.add(k7lVar);
        }
        ArrayList arrayList2 = k7lVar.a;
        if (arrayList2.contains(wm3Var)) {
            return k7lVar;
        }
        arrayList2.add(wm3Var);
        if (wm3Var instanceof s49) {
            s49 s49Var = (s49) wm3Var;
            s49Var.u0.c(s49Var.v0 == 0 ? 1 : 0, k7lVar, arrayList);
        }
        int i9 = k7lVar.b;
        if (i2 == 0) {
            wm3Var.o0 = i9;
            wm3Var.J.c(i2, k7lVar, arrayList);
            wm3Var.L.c(i2, k7lVar, arrayList);
        } else {
            wm3Var.p0 = i9;
            wm3Var.K.c(i2, k7lVar, arrayList);
            wm3Var.N.c(i2, k7lVar, arrayList);
            wm3Var.M.c(i2, k7lVar, arrayList);
        }
        wm3Var.Q.c(i2, k7lVar, arrayList);
        return k7lVar;
    }

    public static final Object w(f5e f5eVar, int i2) {
        if (i2 < 0 || i2 >= f5eVar.f()) {
            pvd.m(f5eVar.f(), lnb.t(i2, "Index: ", ", Size: "));
            return null;
        }
        int i3 = i2 - f5eVar.c;
        if (i3 < 0 || i3 >= f5eVar.b) {
            return null;
        }
        return f5eVar.c(i3);
    }

    public static final Object x(Context context, Function1 function1) {
        SharedPreferences d2;
        context.getClass();
        function1.getClass();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return function1.invoke(sharedPreferences);
    }

    public static final List y(Country country) {
        return country.equals(zu3.v0) ? yuf.n : country.equals(zu3.n0) ? xuf.d : country.equals(zu3.k) ? wuf.d : km5.a;
    }

    public static int z(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c90.u(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
