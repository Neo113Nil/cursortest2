package s7;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f22801b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f22802c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f22803d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final x0 f22804a;

    public i0(x0 x0Var) {
        this.f22804a = x0Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        g6.v.h(atomicReference);
        g6.v.b(strArr.length == strArr2.length);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (Objects.equals(str, strArr[i5])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i5];
                        if (str2 == null) {
                            str2 = strArr2[i5] + "(" + strArr[i5] + ")";
                            strArr3[i5] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22804a.a() ? str : g(str, r1.f22977c, r1.f22975a, f22801b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22804a.a() ? str : g(str, r1.f22980f, r1.f22979e, f22802c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22804a.a() ? str : str.startsWith("_exp_") ? androidx.appcompat.widget.c1.n("experiment_id(", str, ")") : g(str, r1.j, r1.f22983i, f22803d);
    }

    public final String d(zzbg zzbgVar) {
        x0 x0Var = this.f22804a;
        if (!x0Var.a()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbgVar.f5799c);
        sb2.append(",name=");
        sb2.append(a(zzbgVar.f5797a));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f5798b;
        sb2.append(zzbeVar == null ? null : !x0Var.a() ? zzbeVar.f5796a.toString() : e(zzbeVar.s0()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f22804a.a()) {
            return bundle.toString();
        }
        StringBuilder b10 = v.f.b("Bundle[{");
        for (String str : bundle.keySet()) {
            if (b10.length() != 8) {
                b10.append(", ");
            }
            b10.append(b(str));
            b10.append("=");
            Object obj = bundle.get(str);
            b10.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        b10.append("}]");
        return b10.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder b10 = v.f.b("[");
        for (Object obj : objArr) {
            String e7 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e7 != null) {
                if (b10.length() != 1) {
                    b10.append(", ");
                }
                b10.append(e7);
            }
        }
        b10.append("]");
        return b10.toString();
    }
}
