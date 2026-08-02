package c4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import eg.g0;
import eg.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final k f3597a = new k(Boolean.TRUE);

    public static b0 a(String str) {
        String str2 = Path.DIRECTORY_SEPARATOR;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file");
        sb2.append(':');
        if (str != null) {
            sb2.append(str);
        }
        return new b0(sb2.toString(), str2, "file", null, str);
    }

    public static final Drawable b(m mVar, Resources resources) {
        return mVar instanceof f ? ((f) mVar).f3589a : mVar instanceof a ? new BitmapDrawable(resources, ((a) mVar).f3564a) : new androidx.appcompat.widget.b(1, mVar);
    }

    public static final m c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new a(((BitmapDrawable) drawable).getBitmap()) : new f(drawable);
    }

    public static final q4.c d(q4.h hVar, g0 g0Var) {
        s4.b bVar = hVar.f21978c;
        if (!(bVar instanceof s4.a)) {
            return new i2.d(28, g0Var);
        }
        q4.s s8 = k2.x.s(((s4.a) bVar).f22622b);
        synchronized (s8) {
            io.sentry.android.replay.p pVar = s8.f22030a;
            if (pVar != null) {
                Bitmap.Config[] configArr = v4.r.f24431a;
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && s8.f22033d) {
                    s8.f22033d = false;
                    pVar.f16068a = g0Var;
                    return pVar;
                }
            }
            t1 t1Var = s8.f22031b;
            if (t1Var != null) {
                t1Var.k(null);
            }
            s8.f22031b = null;
            io.sentry.android.replay.p pVar2 = new io.sentry.android.replay.p();
            pVar2.f16068a = g0Var;
            s8.f22030a = pVar2;
            return pVar2;
        }
    }

    public static final Object e(q4.h hVar, k kVar) {
        Object obj = hVar.f21992s.f3595a.get(kVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = hVar.f21994u.f21966n.f3595a.get(kVar);
        return obj2 == null ? kVar.f3593a : obj2;
    }

    public static final Object f(q4.n nVar, k kVar) {
        Object obj = nVar.j.f3595a.get(kVar);
        return obj == null ? kVar.f3593a : obj;
    }

    public static final String g(b0 b0Var) {
        List h10 = h(b0Var);
        String str = b0Var.f3570b;
        if (h10.isEmpty()) {
            return null;
        }
        String str2 = b0Var.f3573e;
        Intrinsics.checkNotNull(str2);
        if (!kotlin.text.z.o(str2, str, false)) {
            str = "";
        }
        return CollectionsKt.J(h10, b0Var.f3570b, str, null, null, 60);
    }

    public static final List h(b0 b0Var) {
        String str = b0Var.f3573e;
        if (str == null) {
            return e0.f19204a;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = -1;
        while (i5 < str.length()) {
            int i10 = i5 + 1;
            int F = StringsKt.F(str, '/', i10, false, 4);
            if (F == -1) {
                F = str.length();
            }
            String substring = str.substring(i10, F);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i5 = F;
        }
        return arrayList;
    }

    public static final String i(String str, byte[] bArr) {
        int length = str.length();
        int max = Math.max(0, length - 2);
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i5 >= max) {
                if (i5 == i10) {
                    return str;
                }
                if (i5 >= length) {
                    Intrinsics.checkNotNullParameter(bArr, "<this>");
                    kotlin.collections.c cVar = kotlin.collections.f.Companion;
                    int length2 = bArr.length;
                    cVar.getClass();
                    kotlin.collections.c.a(0, i10, length2);
                    return new String(bArr, 0, i10, Charsets.UTF_8);
                }
            } else if (str.charAt(i5) == '%') {
                int i11 = i5 + 3;
                try {
                    String substring = str.substring(i5 + 1, i11);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    bArr[i10] = (byte) Integer.parseInt(substring, CharsKt.checkRadix(16));
                    i10++;
                    i5 = i11;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i10] = (byte) str.charAt(i5);
            i10++;
            i5++;
        }
    }

    public static b0 j(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = Path.DIRECTORY_SEPARATOR;
        String m6 = !Intrinsics.areEqual(str7, "/") ? kotlin.text.z.m(str, str7, "/") : str;
        int i5 = 0;
        boolean z5 = true;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (i5 < m6.length()) {
            char charAt = m6.charAt(i5);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i12 == -1 && i10 == -1) {
                            i12 = i5 + 1;
                        }
                    } else if (z5 && i12 == -1 && i10 == -1) {
                        int i15 = i5 + 2;
                        if (i15 < str.length() && str.charAt(i5 + 1) == '/' && str.charAt(i15) == '/') {
                            i13 = i5 + 3;
                            z5 = false;
                            i14 = i5;
                            i5 = i15;
                        } else if (Intrinsics.areEqual(m6, str)) {
                            i11 = i5 + 1;
                            i14 = i5;
                            i5 = i11;
                            i13 = i5;
                        }
                    }
                } else if (i11 == -1 && i12 == -1 && i10 == -1) {
                    i11 = i13 == -1 ? 0 : i5;
                    z5 = false;
                }
            } else if (i10 == -1) {
                i10 = i5 + 1;
            }
            i5++;
        }
        int min = Math.min(i10 == -1 ? Integer.MAX_VALUE : i10 - 1, m6.length());
        int min2 = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, min);
        if (i13 != -1) {
            str3 = m6.substring(0, i14);
            Intrinsics.checkNotNullExpressionValue(str3, "substring(...)");
            str2 = m6.substring(i13, Math.min(i11 != -1 ? i11 : Integer.MAX_VALUE, min2));
            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
        } else {
            str2 = null;
            str3 = null;
        }
        if (i11 != -1) {
            str4 = m6.substring(i11, min2);
            Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
        } else {
            str4 = null;
        }
        if (i12 != -1) {
            str5 = m6.substring(i12, min);
            Intrinsics.checkNotNullExpressionValue(str5, "substring(...)");
        } else {
            str5 = null;
        }
        if (i10 != -1) {
            str6 = m6.substring(i10, m6.length());
            Intrinsics.checkNotNullExpressionValue(str6, "substring(...)");
        } else {
            str6 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(str3 != null ? str3.length() : 0, Math.max(str2 != null ? str2.length() : 0, Math.max(str4 != null ? str4.length() : 0, Math.max(str5 != null ? str5.length() : 0, str6 != null ? str6.length() : 0)))) - 2)];
        String i16 = str3 != null ? i(str3, bArr) : null;
        String i17 = str2 != null ? i(str2, bArr) : null;
        String i18 = str4 != null ? i(str4, bArr) : null;
        if (str5 != null) {
            i(str5, bArr);
        }
        if (str6 != null) {
            i(str6, bArr);
        }
        return new b0(m6, str7, i16, i17, i18);
    }
}
