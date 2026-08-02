package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzagn;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nq8 implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;

    public static final vy8 A(vy8 vy8Var) {
        return vy8Var.d(new a8l(s25.a));
    }

    public static View B(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final int C(int i, uqa uqaVar, Object obj) {
        int c2;
        return (obj == null || uqaVar.getItemCount() == 0 || (i < uqaVar.getItemCount() && obj.equals(uqaVar.d(i))) || (c2 = uqaVar.c(obj)) == -1) ? i : c2;
    }

    public static final String D(eek eekVar) {
        List E = E(eekVar);
        String str = eekVar.b;
        if (E.isEmpty()) {
            return null;
        }
        String str2 = eekVar.e;
        str2.getClass();
        if (!c.v(str2, str, false)) {
            str = "";
        }
        return CollectionsKt.f0(E, eekVar.b, str, null, null, 60);
    }

    public static final List E(eek eekVar) {
        String str = eekVar.e;
        if (str == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int O = StringsKt.O(str, '/', i2, 4);
            if (O == -1) {
                O = str.length();
            }
            String substring = str.substring(i2, O);
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = O;
        }
        return arrayList;
    }

    public static final vy8 F(vy8 vy8Var, float f2) {
        return vy8Var.d(new q99(new q25(f2)));
    }

    public static final sz8 G(dti dtiVar, String str, Executor executor, Function0 function0) {
        dtiVar.getClass();
        executor.getClass();
        yzc yzcVar = new yzc(sz8.e);
        uh2 uh2Var = new uh2();
        uh2Var.c = new b1g();
        xh2 xh2Var = new xh2(uh2Var);
        uh2Var.b = xh2Var;
        uh2Var.a = wt3.class;
        try {
            executor.execute(new dp1((Object) dtiVar, str, (Object) function0, (Object) yzcVar, (Object) uh2Var, 3));
            Unit unit = Unit.a;
            if (unit != null) {
                uh2Var.a = unit;
            }
        } catch (Exception e2) {
            xh2Var.b(e2);
        }
        return new sz8(yzcVar, xh2Var);
    }

    public static final String H(String str, byte[] bArr) {
        int length = str.length();
        int max = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return c.l(0, i2, 5, bArr);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    bArr[i2] = (byte) Integer.parseInt(str.substring(i + 1, i3), CharsKt.checkRadix(16));
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final oge I(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = new oge();
            av8Var.n0(O);
        }
        return (oge) O;
    }

    public static void J(wje wjeVar) {
        fdi fdiVar;
        cfe cfeVar;
        cfe cfeVar2;
        do {
            fdiVar = kqf.A;
            cfeVar = (cfe) fdiVar.getValue();
            cee ceeVar = cfeVar.d;
            qbb qbbVar = (qbb) ceeVar.get(wjeVar);
            if (qbbVar == null) {
                cfeVar2 = cfeVar;
            } else {
                Object obj = qbbVar.a;
                Object obj2 = qbbVar.b;
                v0k v0kVar = ceeVar.d;
                v0k v = v0kVar.v(wjeVar != null ? wjeVar.hashCode() : 0, 0, wjeVar);
                if (v0kVar != v) {
                    ceeVar = v == null ? cee.f : new cee(v, ceeVar.e - 1);
                }
                it7 it7Var = it7.k;
                if (obj != it7Var) {
                    Object obj3 = ceeVar.get(obj);
                    obj3.getClass();
                    ceeVar = ceeVar.i(obj, new qbb(((qbb) obj3).a, obj2));
                }
                if (obj2 != it7Var) {
                    Object obj4 = ceeVar.get(obj2);
                    obj4.getClass();
                    ceeVar = ceeVar.i(obj2, new qbb(obj, ((qbb) obj4).b));
                }
                Object obj5 = obj != it7Var ? cfeVar.b : obj2;
                if (obj2 != it7Var) {
                    obj = cfeVar.c;
                }
                cfeVar2 = new cfe(obj5, obj, ceeVar);
            }
            if (cfeVar == cfeVar2) {
                return;
            }
        } while (!fdiVar.k(cfeVar, cfeVar2));
    }

    public static final vy8 K(float f2) {
        return F(N(ty8.a, f2), f2);
    }

    public static eek L(String str) {
        String str2;
        String str3;
        String str4 = uae.b;
        String r = !Intrinsics.c(str4, "/") ? c.r(str, str4, "/", false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < r.length()) {
            char charAt = r.charAt(i);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (r.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int min = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, r.length());
        int min2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, min);
        if (i5 != -1) {
            str3 = r.substring(0, i6);
            str2 = r.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, min2));
        } else {
            str2 = null;
            str3 = null;
        }
        String substring = i3 != -1 ? r.substring(i3, min2) : null;
        String substring2 = i4 != -1 ? r.substring(i4, min) : null;
        String substring3 = i2 != -1 ? r.substring(i2, r.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(str3 != null ? str3.length() : 0, Math.max(str2 != null ? str2.length() : 0, Math.max(substring != null ? substring.length() : 0, Math.max(substring2 != null ? substring2.length() : 0, substring3 != null ? substring3.length() : 0)))) - 2)];
        String str5 = substring2;
        String H = str3 != null ? H(str3, bArr) : null;
        String H2 = str2 != null ? H(str2, bArr) : null;
        String H3 = substring != null ? H(substring, bArr) : null;
        if (str5 != null) {
            H(str5, bArr);
        }
        if (substring3 != null) {
            H(substring3, bArr);
        }
        return new eek(r, str4, H, H2, H3);
    }

    public static AdError M(Context context, String str) {
        if (!(context instanceof Activity)) {
            return new AdError(102, "IronSource requires an Activity context to load ads.", IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
        }
        if (TextUtils.isEmpty(str)) {
            return new AdError(101, "Missing or invalid instance ID.", IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
        }
        return null;
    }

    public static final vy8 N(vy8 vy8Var, float f2) {
        return vy8Var.d(new a8l(new q25(f2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int O(Context context, en0 en0Var) {
        en0 en0Var2;
        int i;
        char c2;
        int i2;
        FileInputStream fileInputStream;
        byte[] bArr;
        int i3;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            en0Var2 = en0Var;
            i = 1;
            c2 = 0;
            File[] listFiles = file.listFiles(new c6p(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e2) {
                    P(null, e2.toString(), en0Var2);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            i2 = 5;
                        } else if (s == 40) {
                            i2 = 3;
                        } else if (s == 62) {
                            i2 = 7;
                        } else if (s == 183) {
                            i2 = 6;
                        } else if (s != 243) {
                            P(bArr, null, en0Var2);
                            i2 = 1;
                        } else {
                            i2 = 8;
                        }
                        fileInputStream.close();
                        if (i2 == 1000) {
                            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                            String property = System.getProperty("os.arch");
                            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                                try {
                                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                                    if (strArr != null && strArr.length > 0) {
                                        property = strArr[c2];
                                    }
                                } catch (IllegalAccessException e3) {
                                    en0Var2.z(2024, 0L, e3);
                                } catch (NoSuchFieldException e4) {
                                    en0Var2.z(2024, 0L, e4);
                                }
                                property = Build.CPU_ABI;
                                if (property == null) {
                                    property = Build.CPU_ABI2;
                                }
                            }
                            if (TextUtils.isEmpty(property)) {
                                P(null, "Empty dev arch", en0Var2);
                            } else if (property.equalsIgnoreCase("i686") || property.equalsIgnoreCase("x86")) {
                                i3 = 5;
                            } else if (property.equalsIgnoreCase("x86_64")) {
                                i3 = 7;
                            } else if (property.equalsIgnoreCase("arm64-v8a")) {
                                i3 = 6;
                            } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                                i3 = 3;
                            } else if (property.equalsIgnoreCase("riscv64")) {
                                i3 = 8;
                            } else {
                                P(null, property, en0Var2);
                            }
                            i3 = i;
                        } else {
                            i3 = i2;
                        }
                        en0Var2.A(5018, 0L, null, null, i3 != i ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? i3 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i3;
                    }
                    P(bArr, null, en0Var2);
                }
                fileInputStream.close();
                i2 = 1;
                if (i2 == 1000) {
                }
                en0Var2.A(5018, 0L, null, null, i3 != i ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? i3 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i3;
            }
            en0Var2.A(5017, 0L, null, null, "No .so");
        } else {
            i = 1;
            c2 = 0;
            en0Var2 = en0Var;
            en0Var2.A(5017, 0L, null, null, "No lib/");
        }
        i2 = 1000;
        if (i2 == 1000) {
        }
        en0Var2.A(5018, 0L, null, null, i3 != i ? i3 != 3 ? i3 != 5 ? i3 != 6 ? i3 != 7 ? i3 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i3;
    }

    public static final void P(byte[] bArr, String str, en0 en0Var) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            wt3.A("dbg:", str, sb, ";");
        }
        en0Var.A(4007, 0L, null, null, sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mll mllVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2134628470);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(mllVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            boolean z = mllVar == null;
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            int i5 = 7;
            c(mllVar != null ? mllVar.c : null, mllVar != null ? mllVar.e : new jfj(i5, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0)), mllVar != null ? mllVar.f : null, z, null, av8Var, 0);
            h(av8Var, bkh.e(utcVar, 4.0f));
            c(mllVar != null ? mllVar.d : null, mllVar != null ? mllVar.g : new jfj(i5, (String) (objArr2 == true ? 1 : 0), (Integer) (objArr == true ? 1 : 0)), mllVar != null ? mllVar.h : null, z, null, av8Var, 0);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fll(mllVar, xtcVar, i, i4);
        }
    }

    public static final void b(mll mllVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        int i3;
        xtc xtcVar2;
        boolean z;
        r13 r13Var;
        long j;
        utc utcVar;
        r13 r13Var2;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(866652666);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.i(mllVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            boolean z2 = mllVar == null;
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            l8g a2 = k8g.a(ww9.h, uxf.m, av8Var, 54);
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
            p4h p4hVar = ww9.d;
            u23 a3 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar2);
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
            k(mllVar != null ? mllVar.c : null, null, av8Var, 0);
            h(av8Var, bkh.e(utcVar2, 4.0f));
            k(mllVar != null ? mllVar.d : null, null, av8Var, 0);
            av8Var.s(true);
            u23 a4 = t23.a(p4hVar, uxf.q, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            if (z2) {
                av8Var.d0(-1137903201);
                m(6, av8Var, bkh.e(bkh.p(utcVar2, 24.0f), 12.0f));
                h(av8Var, bkh.e(utcVar2, 2.0f));
                m(6, av8Var, bkh.e(bkh.p(utcVar2, 16.0f), 12.0f));
                av8Var.s(false);
                utcVar = utcVar2;
            } else {
                av8Var.d0(-1137483833);
                jfj jfjVar = mllVar.e;
                String str = jfjVar.a;
                if (str == null) {
                    str = "";
                }
                Integer num = jfjVar.b;
                if (num == null) {
                    av8Var.d0(-1137351681);
                    z = false;
                    av8Var.s(false);
                    r13Var = null;
                } else {
                    z = false;
                    r13Var = new r13(wv8.b(av8Var, -1137351680, num, av8Var, false));
                }
                if (r13Var == null) {
                    j = ljg.f(av8Var, 2041522135, R.color.on_color_primary, av8Var, z);
                } else {
                    av8Var.d0(2041520120);
                    av8Var.s(z);
                    j = r13Var.a;
                }
                yf8 yf8Var = xth.a;
                boolean z3 = z;
                utcVar = utcVar2;
                udj.c(str, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.c(), av8Var, 0, 24576, 114682);
                jfj jfjVar2 = mllVar.g;
                String str2 = jfjVar2.a;
                String str3 = str2 != null ? str2 : "";
                Integer num2 = jfjVar2.b;
                if (num2 == null) {
                    av8Var.d0(-1137048129);
                    av8Var.s(z3);
                    r13Var2 = null;
                } else {
                    r13Var2 = new r13(wv8.b(av8Var, -1137048128, num2, av8Var, z3));
                }
                if (r13Var2 == null) {
                    j2 = ljg.f(av8Var, 2041531927, R.color.on_color_primary, av8Var, z3);
                } else {
                    av8Var.d0(2041529912);
                    av8Var.s(z3);
                    j2 = r13Var2.a;
                }
                udj.c(str3, null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.c(), av8Var, 0, 24576, 114682);
                av8Var = av8Var;
                av8Var.s(z3);
            }
            i3 = 1;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            i3 = 1;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fll(mllVar, xtcVar2, i, i3);
        }
    }

    public static final void c(Bitmap bitmap, jfj jfjVar, jfj jfjVar2, boolean z, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        r13 r13Var;
        long j;
        r13 r13Var2;
        long j2;
        boolean z2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-409070614);
        int i2 = i | (av8Var2.i(bitmap) ? 4 : 2) | (av8Var2.g(jfjVar) ? 32 : 16) | (av8Var2.g(jfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024) | 24576;
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            k(bitmap, null, av8Var2, i2 & 14);
            w1l.o(1.0f, true, av8Var2);
            if (z) {
                av8Var2.d0(1238887412);
                m(6, av8Var2, bkh.l(utcVar, 12.0f));
                av8Var2.s(false);
                av8Var = av8Var2;
                xtcVar2 = utcVar;
                z2 = true;
            } else {
                av8Var2.d0(1238980877);
                String str = jfjVar.a;
                if (str == null) {
                    str = "";
                }
                Integer num = jfjVar.b;
                if (num == null) {
                    av8Var2.d0(1239080386);
                    av8Var2.s(false);
                    r13Var = null;
                } else {
                    r13Var = new r13(wv8.b(av8Var2, 1239080387, num, av8Var2, false));
                }
                if (r13Var == null) {
                    j = ljg.f(av8Var2, 39971252, R.color.on_color_primary, av8Var2, false);
                } else {
                    av8Var2.d0(39969578);
                    av8Var2.s(false);
                    j = r13Var.a;
                }
                yf8 yf8Var = xth.a;
                udj.c(str, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                if ((jfjVar2 != null ? jfjVar2.a : null) == null) {
                    av8Var.d0(1239234270);
                    av8Var.s(false);
                    xtcVar2 = utcVar;
                } else {
                    ljg.r(4.0f, 1239234271, av8Var, av8Var, utcVar);
                    String str2 = jfjVar2.a;
                    Integer num2 = jfjVar2.b;
                    if (num2 == null) {
                        av8Var.d0(-392276344);
                        av8Var.s(false);
                        r13Var2 = null;
                    } else {
                        r13Var2 = new r13(wv8.b(av8Var, -392276343, num2, av8Var, false));
                    }
                    if (r13Var2 == null) {
                        j2 = ljg.f(av8Var, 680083502, R.color.on_color_primary, av8Var, false);
                    } else {
                        av8Var.d0(680081859);
                        av8Var.s(false);
                        j2 = r13Var2.a;
                    }
                    xtcVar2 = utcVar;
                    udj.c(str2, null, j2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(false);
                    Unit unit = Unit.a;
                }
                av8Var.s(false);
                z2 = true;
            }
            av8Var.s(z2);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(bitmap, jfjVar, jfjVar2, z, xtcVar2, i, 21);
        }
    }

    public static final void e(final ypb ypbVar, final Function1 function1, final Function1 function12, final Function0 function0, final Function0 function02, final Function1 function13, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, of3 of3Var, final int i) {
        av8 av8Var;
        ypbVar.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        function13.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(799934061);
        int i2 = i | (av8Var2.i(ypbVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function12) ? 256 : 128) | (av8Var2.i(function0) ? a.o : 1024) | (av8Var2.i(function02) ? 16384 : 8192) | (av8Var2.i(function13) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function03) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.i(function04) ? 8388608 : 4194304) | (av8Var2.i(function05) ? 67108864 : 33554432) | (av8Var2.i(function06) ? 536870912 : 268435456);
        if (av8Var2.T(i2 & 1, (306783379 & i2) != 306783378)) {
            final Context context = (Context) av8Var2.k(nz.b);
            e1d x = rfo.x(ypbVar.j, av8Var2, 0);
            final e1d x2 = rfo.x(ypbVar.p, av8Var2, 0);
            hof hofVar = ypbVar.l;
            boolean z = (i2 & 896) == 256;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new uj8(15, function12);
                av8Var2.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var2, 0, 14);
            tpb tpbVar = (tpb) x.getValue();
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new abb(17);
                av8Var2.n0(O2);
            }
            wkn.a(tpbVar, null, null, (Function1) O2, yqo.H(-626666052, av8Var2, new ct8() { // from class: kpb
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tpb tpbVar2 = (tpb) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    tpbVar2.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(tpbVar2) ? 4 : 2;
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    if (!av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                        av8Var3.W();
                    } else if (tpbVar2.equals(rpb.a)) {
                        av8Var3.d0(1214594197);
                        wnn.n(Function0.this, l98.f0(l98.d0(hkg.J(), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hkg.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 1), 7), lz.D(R.color.surface_P, av8Var3), av8Var3, 0, 0);
                        av8Var3.s(false);
                    } else if (tpbVar2 instanceof spb) {
                        av8Var3.d0(1215014805);
                        c5n.p(function04, function06, function05, av8Var3, 0);
                        av8Var3.s(false);
                    } else {
                        if (!(tpbVar2 instanceof qpb)) {
                            throw dmi.h(av8Var3, -930651208, false);
                        }
                        av8Var3.d0(1215349233);
                        qpb qpbVar = (qpb) tpbVar2;
                        boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
                        Context context2 = context;
                        boolean i3 = av8Var3.i(context2);
                        Function0 function07 = function02;
                        boolean g = i3 | av8Var3.g(function07);
                        Function1 function14 = function1;
                        boolean g2 = g | av8Var3.g(function14);
                        ypb ypbVar2 = ypbVar;
                        boolean i4 = g2 | av8Var3.i(ypbVar2);
                        Function0 function08 = function0;
                        boolean g3 = i4 | av8Var3.g(function08);
                        Function1 function15 = function12;
                        boolean g4 = g3 | av8Var3.g(function15);
                        Function1 function16 = function13;
                        boolean g5 = g4 | av8Var3.g(function16);
                        Object O3 = av8Var3.O();
                        if (g5 || O3 == nf3.a) {
                            gj gjVar = new gj(context2, function07, function14, ypbVar2, function08, function15, function16, 4);
                            av8Var3.n0(gjVar);
                            O3 = gjVar;
                        }
                        oyn.e(qpbVar, booleanValue, (Function1) O3, null, av8Var3, intValue & 14);
                        av8Var3.s(false);
                    }
                    return Unit.a;
                }
            }), av8Var2, 27648, 6);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(function1, function12, function0, function02, function13, function03, function04, function05, function06, i) { // from class: lpb
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    nq8.e(ypb.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(kxe kxeVar, String str, boolean z, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(812257215);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(kxeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function0) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            xtc h = ljg.h(16.0f, xtcVar, lz.D(R.color.surface_1, av8Var), 16.0f);
            u23 a2 = t23.a(ww9.f, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
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
            int i3 = i2;
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
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
            yf8 yf8Var = xth.a;
            int i4 = i3 >> 3;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, i4 & 14, 0, 131066);
            av8Var = av8Var;
            if (z) {
                ljg.r(8.0f, -1356477693, av8Var, av8Var, utcVar);
                udj.c(lnb.o("(", oea.v(R.string.hint_optional, av8Var), ")"), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(-1356206691);
                av8Var.s(false);
            }
            bf3.t(av8Var, true, utcVar, 12.0f, av8Var);
            if (kxeVar == null) {
                av8Var.d0(1750993340);
                scj scjVar = new scj("");
                String v = oea.v(R.string.search_field, av8Var);
                xtc d2 = bkh.d(utcVar, 1.0f);
                boolean z2 = (i3 & 57344) == 16384;
                Object O = av8Var.O();
                if (z2 || O == nf3.a) {
                    O = new rsd(2, function02);
                    av8Var.n0(O);
                }
                av8 av8Var2 = av8Var;
                av8Var = av8Var2;
                uaa.e(scjVar, v, tol.y(d2, false, false, false, 0L, null, (Function0) O, av8Var2, 27), false, av8Var, 3072, 16);
                av8Var.s(false);
            } else {
                av8Var.d0(1751365650);
                kik.a(kxeVar, kxeVar.g, function0, bkh.d(utcVar, 1.0f), av8Var, (i3 & 14) | 3072 | (i4 & 896));
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(kxeVar, str, z, function0, function02, xtcVar, i, 7);
        }
    }

    public static final void g(vy8 vy8Var, int i, int i2, tc3 tc3Var, of3 of3Var, int i3, int i4) {
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1618370649);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (av8Var.g(vy8Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= av8Var.e(i) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= av8Var.g(tc3Var) ? a.o : 1024;
        }
        if ((i5 & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i6 != 0) {
                vy8Var = ty8.a;
            }
            if (i7 != 0) {
                i = 0;
            }
            if (i8 != 0) {
                i2 = 0;
            }
            j8g j8gVar = j8g.b;
            av8Var.e0(578571862);
            av8Var.e0(-548224868);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(j8gVar);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, vy8Var, ned.k);
            waa.K(av8Var, new go(i2), ned.l);
            waa.K(av8Var, new eo(i), ned.m);
            tc3Var.invoke(o8g.a, av8Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
        }
        vy8 vy8Var2 = vy8Var;
        int i9 = i;
        int i10 = i2;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s23(vy8Var2, i9, i10, tc3Var, i3, i4, 1);
        }
    }

    public static final void h(of3 of3Var, xtc xtcVar) {
        g00 g00Var = g00.k;
        av8 av8Var = (av8) of3Var;
        int hashCode = Long.hashCode(av8Var.T);
        xtc C = fqj.C(of3Var, xtcVar);
        aee m = av8Var.m();
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(of3Var, g00Var, hf3.g);
        waa.K(of3Var, m, hf3.f);
        waa.J(of3Var, hf3.k);
        waa.K(of3Var, C, hf3.d);
        waa.K(of3Var, Integer.valueOf(hashCode), hf3.j);
        av8Var2.s(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, d7e d7eVar, xtc xtcVar, long j, boolean z, of3 of3Var, int i, int i2) {
        long j2;
        int i3;
        boolean z2;
        long j3;
        eqf u;
        long f2;
        str.getClass();
        d7eVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-287486700);
        int i4 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.i(d7eVar) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            j2 = j;
        } else {
            j2 = j;
            i3 = i4 | (av8Var.f(j2) ? a.o : 1024);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= av8Var.h(z2) ? 16384 : 8192;
            if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var.W();
                j3 = j2;
            } else {
                long j4 = i5 != 0 ? r13.i : j2;
                if (i6 != 0) {
                    z2 = false;
                }
                lv1 lv1Var = uxf.m;
                xtc c0 = l98.c0(n9e.q(bkh.g(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f, 1), lz.D(R.color.n_lv_1, av8Var), o7g.a(8.0f)), 16.0f, 12.0f);
                l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, c0);
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
                if (z2) {
                    av8Var.d0(-2033931045);
                    av8Var.s(false);
                    f2 = r13.i;
                } else {
                    f2 = ljg.f(av8Var, -2033930499, R.color.surface_1, av8Var, false);
                }
                long j5 = f2;
                utc utcVar = utc.a;
                kq9.a(d7eVar, null, l98.b0(n9e.q(bkh.l(utcVar, 24.0f), j4, o7g.a), 4.0f), j5, av8Var, ((i3 >> 3) & 14) | 56, 0);
                h(av8Var, bkh.p(utcVar, 16.0f));
                yf8 yf8Var = xth.a;
                udj.c(str, null, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, xth.e(), av8Var, i3 & 14, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(true);
                j3 = j4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new f82(str, d7eVar, xtcVar, j3, z2, i, i2, 1);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void j(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1414075991);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            int i2 = 6;
            ng0 ng0Var = new ng0(4.0f, true, new a70(i2));
            xtc f0 = l98.f0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a2 = t23.a(ng0Var, uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(i2));
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a3 = k8g.a(ng0Var2, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
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
            xtc e2 = bkh.e(bkh.p(utcVar, 20.0f), 12.0f);
            long D = lz.D(R.color.n_lv_4, av8Var);
            jf9 jf9Var = oyn.e;
            e12.a(0, av8Var, n9e.q(yso.o(e2, 1.0f, D, jf9Var), lz.D(R.color.surface_1, av8Var), jf9Var));
            String v = oea.v(R.string.home, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            ng0 ng0Var3 = new ng0(8.0f, true, new a70(6));
            xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a4 = k8g.a(ng0Var3, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            e12.a(0, av8Var, n9e.q(bkh.e(bkh.p(utcVar, 20.0f), 12.0f), lz.D(R.color.n_lv_1, av8Var), jf9Var));
            udj.c(oea.v(R.string.away, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 29);
        }
    }

    public static final void k(Bitmap bitmap, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1782830169);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            if (bitmap != null) {
                av8Var2.d0(-727872942);
                boolean g = av8Var2.g(bitmap);
                Object O = av8Var2.O();
                if (g || O == nf3.a) {
                    O = new cx1(new a10(bitmap));
                    av8Var2.n0(O);
                }
                av8Var = av8Var2;
                wkn.k((cx1) O, null, bkh.l(utcVar, 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
                av8Var.s(false);
            } else {
                av8Var2.d0(-727635513);
                kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var2), null, bkh.l(utcVar, 16.0f), lz.D(R.color.on_color_secondary, av8Var2), av8Var2, 48, 0);
                av8Var = av8Var2;
                av8Var.s(false);
            }
            xtcVar = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(bitmap, xtcVar, i, 23);
        }
    }

    public static final void l(m6j m6jVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(346012454);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(m6jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        int i3 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            String str = m6jVar.h;
            String str2 = m6jVar.i;
            tc3 H = yqo.H(-1201031577, av8Var2, new i6j(i3, m6jVar, function1));
            boolean i4 = av8Var2.i(m6jVar) | ((i2 & 112) == 32);
            Object O = av8Var2.O();
            if (i4 || O == nf3.a) {
                O = new j6j(3, m6jVar, function1);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar2, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, null, null, str, str2, (Function0) O, av8Var, ((i2 >> 6) & 14) | 1573248, 442);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k6j(m6jVar, function1, xtcVar, i, 1);
        }
    }

    public static final void m(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(185630540);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            e12.a(0, av8Var, n9e.q(wnn.A(xtcVar, o7g.a(2.0f)), lz.D(R.color.on_color_secondary, av8Var), oyn.e));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oqj(xtcVar, i, 3);
        }
    }

    public static final void n(final List list, final oge ogeVar, final xtc xtcVar, int i, final int i2, final xtc xtcVar2, final dfj dfjVar, final long j, Function1 function1, of3 of3Var, final int i3, final int i4) {
        int i5;
        int i6;
        Function1 function12;
        int i7;
        av8 av8Var;
        final Function1 function13;
        Object mj5Var;
        int i8;
        Function1 function14;
        ksa ksaVar;
        list.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(778105786);
        int i9 = (av8Var2.i(list) ? 4 : 2) | i3 | (av8Var2.g(ogeVar) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i9 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i6 = i9 | 3072;
            i5 = i;
        } else {
            i5 = i;
            i6 = i9 | (av8Var2.e(i5) ? a.o : 1024);
        }
        int i11 = i6 | (av8Var2.g(dfjVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((12582912 & i3) == 0) {
            i11 |= av8Var2.f(j) ? 8388608 : 4194304;
        }
        int i12 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i12 != 0) {
            i7 = i11 | 100663296;
            function12 = function1;
        } else {
            function12 = function1;
            i7 = i11 | (av8Var2.i(function12) ? 67108864 : 33554432);
        }
        int i13 = i7;
        if (av8Var2.T(i13 & 1, (i13 & 38347923) != 38347922)) {
            av8Var2.Y();
            if ((i3 & 1) == 0 || av8Var2.B()) {
                if (i10 != 0) {
                    i5 = 0;
                }
                if (i12 != 0) {
                    function12 = null;
                }
            } else {
                av8Var2.W();
            }
            int i14 = i5;
            av8Var2.t();
            int i15 = i2 / 2;
            ksa a2 = msa.a(((1073741823 - (1073741823 % list.size())) - i15) + i14, 0, av8Var2, 0, 2);
            f8h f8hVar = f8h.i;
            boolean g = av8Var2.g(a2);
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (g || O == obj) {
                O = new gsa(a2, f8hVar);
                av8Var2.n0(O);
            }
            gnh J = kda.J((knh) O, av8Var2);
            Object O2 = av8Var2.O();
            if (O2 == obj) {
                O2 = e.c(0);
                av8Var2.n0(O2);
            }
            znh znhVar = (znh) O2;
            float C0 = ((kx4) av8Var2.k(dh3.h)).C0(znhVar.h());
            Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            long j2 = r13.h;
            v7b D = wxf.D(new Pair[]{new Pair(valueOf, new r13(j2)), new Pair(Float.valueOf(0.5f), new r13(lz.D(R.color.n_lv_1, av8Var2))), new Pair(Float.valueOf(1.0f), new r13(j2))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY);
            boolean g2 = av8Var2.g(a2) | av8Var2.i(list) | av8Var2.e(i15) | ((((i13 & 112) ^ 48) > 32 && av8Var2.g(ogeVar)) || (i13 & 48) == 32) | ((i13 & 234881024) == 67108864);
            Object O3 = av8Var2.O();
            if (g2 || O3 == obj) {
                mj5Var = new mj5(a2, i15, list, ogeVar, function12, (rq3) null, 13);
                i8 = i15;
                function14 = function12;
                av8Var2.n0(mj5Var);
            } else {
                mj5Var = O3;
                i8 = i15;
                function14 = function12;
            }
            hz8.o(av8Var2, a2, (Function2) mj5Var);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc Z = td4.Z(s02.O(bkh.e(bkh.d(utcVar, 1.0f), i2 * C0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 458751), new cuc(D, 1));
            boolean i16 = av8Var2.i(list) | ((((i13 & 3670016) ^ 1572864) > 1048576 && av8Var2.g(dfjVar)) || (i13 & 1572864) == 1048576);
            Object O4 = av8Var2.O();
            if (i16 || O4 == obj) {
                ksaVar = a2;
                Object lwcVar = new lwc(xtcVar2, dfjVar, list, znhVar, 13);
                av8Var2.n0(lwcVar);
                O4 = lwcVar;
            } else {
                ksaVar = a2;
            }
            v8a.a(Z, ksaVar, null, null, kv1Var, J, false, null, (Function1) O4, av8Var2, 196608, TTAdConstant.IMAGE_URL_CODE);
            av8Var = av8Var2;
            int i17 = (i13 >> 15) & 896;
            td4.w(rd0.O(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i8 * C0, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, av8Var, i17, 2);
            td4.w(rd0.O(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i8 + 1) * C0, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, av8Var, i17, 2);
            av8Var.s(true);
            function13 = function14;
            i5 = i14;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            function13 = function12;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final int i18 = i5;
            u.d = new Function2() { // from class: shj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    nq8.n(list, ogeVar, xtcVar, i18, i2, xtcVar2, dfjVar, j, function13, (of3) obj2, aba.K(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    public static eek o(String str) {
        String str2 = uae.b;
        StringBuilder sb = new StringBuilder();
        sb.append(U3.i.b);
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new eek(sb.toString(), str2, U3.i.b, null, str);
    }

    public static final void p(String str, vy8 vy8Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(789711949);
        int i2 = (av8Var.g(str) ? 4 : 2) | i | 48;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            vy8Var = ty8.a;
            g(h5a.O(c5n.t(F(A(vy8Var), 28.0f), new h1g(R.color.surface_1)), 8.0f, 2), 1, 1, yqo.H(-112199831, av8Var, new d82(str, 7)), av8Var, 3072, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(str, vy8Var, i, 15);
        }
    }

    public static final void q(y7l y7lVar, tee teeVar, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        teeVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1065183662);
        int i2 = (av8Var.e(y7lVar.ordinal()) ? 4 : 2) | i | (av8Var.i(teeVar) ? 32 : 16) | (av8Var.h(false) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            tc3 H = yqo.H(-1836444764, av8Var, new e6i(21, teeVar, y7lVar));
            ty8 ty8Var = ty8.a;
            rd0.b(ty8Var, 0, 0, H, av8Var, 3078, 6);
            vy8Var2 = ty8Var;
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(y7lVar, teeVar, vy8Var2, i, 24);
        }
    }

    public static final void r(p7l p7lVar, mll mllVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        Pair pair;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1677262118);
        int i2 = i | (av8Var2.e(p7lVar.ordinal()) ? 4 : 2) | (av8Var2.i(mllVar) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            boolean z = p7lVar == p7l.b;
            av8Var2.d0(1236171097);
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.on_color_highlight_2, av8Var2), oyn.e);
            utc utcVar = utc.a;
            if (z) {
                q = q.z(yso.o(utcVar, 1.0f, lz.D(R.color.stayDarkLive, av8Var2), o7g.a(8.0f)));
            }
            av8Var2.s(false);
            xtc b0 = l98.b0(q, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            int ordinal = p7lVar.ordinal();
            if (ordinal == 0) {
                av8Var2.d0(-1089717882);
                pair = new Pair(Integer.valueOf(R.string.previous), new r13(lz.D(R.color.on_color_secondary, av8Var2)));
                av8Var2.s(false);
            } else if (ordinal == 1) {
                av8Var2.d0(-1089720947);
                pair = new Pair(Integer.valueOf(R.string.standings_live), new r13(lz.D(R.color.stayDarkLive, av8Var2)));
                av8Var2.s(false);
            } else {
                if (ordinal != 2) {
                    throw dmi.h(av8Var2, -1089722685, false);
                }
                av8Var2.d0(-1089715038);
                pair = new Pair(Integer.valueOf(R.string.next), new r13(lz.D(R.color.on_color_secondary, av8Var2)));
                av8Var2.s(false);
            }
            int intValue = ((Number) pair.a).intValue();
            long j = ((r13) pair.b).a;
            String v = oea.v(intValue, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.c(), av8Var2, 0, 24576, 114682);
            av8Var = av8Var2;
            h(av8Var, bkh.e(utcVar, 8.0f));
            int ordinal2 = p7lVar.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                av8Var.d0(578947354);
                a(mllVar, null, av8Var, (i2 >> 3) & 14);
                av8Var.s(false);
            } else {
                if (ordinal2 != 2) {
                    throw dmi.h(av8Var, -1089705713, false);
                }
                av8Var.d0(579070455);
                b(mllVar, null, av8Var, (i2 >> 3) & 14);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(p7lVar, mllVar, xtcVar, i, 4);
        }
    }

    public static final boolean s(i iVar) {
        iVar.getClass();
        return !StringsKt.R(iVar.b);
    }

    public static final void t(ltk ltkVar, nqg nqgVar, g6b g6bVar) {
        nqgVar.getClass();
        g6bVar.getClass();
        gqg gqgVar = (gqg) ltkVar.d("androidx.lifecycle.savedstate.vm.tag");
        if (gqgVar == null || gqgVar.c) {
            return;
        }
        gqgVar.f(nqgVar, g6bVar);
        e6b b2 = g6bVar.b();
        if (b2 == e6b.b || b2.compareTo(e6b.d) >= 0) {
            nqgVar.d();
        } else {
            g6bVar.a(new tq4(3, g6bVar, nqgVar));
        }
    }

    public static AdError u(int i, String str) {
        return new AdError(i, str, IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
    }

    public static final v9e v(List list) {
        list.getClass();
        km5 km5Var = km5.a;
        v9e v9eVar = new v9e(km5Var, km5Var);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                v9eVar = w((v9e) listIterator.previous(), v9eVar);
            }
        }
        return x(v9eVar, km5.a);
    }

    public static final v9e w(v9e v9eVar, v9e v9eVar2) {
        boolean isEmpty = v9eVar.b.isEmpty();
        List list = v9eVar.a;
        if (isEmpty) {
            return new v9e(CollectionsKt.w0(v9eVar2.a, list), v9eVar2.b);
        }
        List list2 = v9eVar.b;
        ArrayList arrayList = new ArrayList(k13.r(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(w((v9e) it.next(), v9eVar2));
        }
        return new v9e(list, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public static final v9e x(v9e v9eVar, List list) {
        List c2;
        ArrayList arrayList = new ArrayList();
        ArrayList U0 = CollectionsKt.U0(list);
        ArrayList arrayList2 = null;
        for (u9e u9eVar : v9eVar.a) {
            if (u9eVar instanceof ajd) {
                if (arrayList2 != null) {
                    arrayList2.addAll(((ajd) u9eVar).a);
                } else {
                    arrayList2 = CollectionsKt.U0(((ajd) u9eVar).a);
                }
            } else if (u9eVar instanceof u9k) {
                U0.add(u9eVar);
            } else {
                if (arrayList2 != null) {
                    arrayList.add(new ajd(arrayList2));
                    arrayList2 = null;
                }
                arrayList.add(u9eVar);
            }
        }
        List list2 = v9eVar.b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            v9e x = x((v9e) it.next(), U0);
            if (x.a.isEmpty()) {
                c2 = x.b;
                if (c2.isEmpty()) {
                    c2 = kotlin.collections.a.c(x);
                }
            } else {
                c2 = kotlin.collections.a.c(x);
            }
            o13.v(c2, arrayList3);
        }
        boolean isEmpty = arrayList3.isEmpty();
        ArrayList<v9e> arrayList4 = arrayList3;
        if (isEmpty) {
            arrayList4 = kotlin.collections.a.c(new v9e(U0, km5.a));
        }
        if (arrayList2 == null) {
            return new v9e(arrayList, arrayList4);
        }
        if (arrayList4 == null || !arrayList4.isEmpty()) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                u9e u9eVar2 = (u9e) CollectionsKt.firstOrNull(((v9e) it2.next()).a);
                if (u9eVar2 != null && (u9eVar2 instanceof ajd)) {
                    ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                    for (v9e v9eVar2 : arrayList4) {
                        List list3 = v9eVar2.a;
                        List list4 = v9eVar2.b;
                        u9e u9eVar3 = (u9e) CollectionsKt.firstOrNull(list3);
                        arrayList5.add(u9eVar3 instanceof ajd ? new v9e(CollectionsKt.w0(CollectionsKt.S(list3, 1), kotlin.collections.a.c(new ajd(CollectionsKt.w0(((ajd) u9eVar3).a, arrayList2)))), list4) : u9eVar3 == null ? new v9e(kotlin.collections.a.c(new ajd(arrayList2)), list4) : new v9e(CollectionsKt.w0(list3, kotlin.collections.a.c(new ajd(arrayList2))), list4));
                    }
                    return new v9e(arrayList, arrayList5);
                }
            }
        }
        arrayList.add(new ajd(arrayList2));
        return new v9e(arrayList, arrayList4);
    }

    public static final vy8 y(vy8 vy8Var) {
        return vy8Var.d(new q99(s25.a));
    }

    public static final vy8 z(vy8 vy8Var) {
        return y(A(vy8Var));
    }
}
