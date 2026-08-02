package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.U3;
import defpackage.b1l;
import defpackage.fc6;
import defpackage.lnb;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgn {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final b1l a;

    public zzgn(b1l b1lVar) {
        this.a = b1lVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.i(atomicReference);
        Preconditions.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
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
        if (!this.a.d()) {
            return str;
        }
        return g(str, zzjm.f, zzjm.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.d()) {
            return str;
        }
        return g(str, zzjn.b, zzjn.a, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.d()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return lnb.o("experiment_id(", str, ")");
        }
        return g(str, zzjo.b, zzjo.a, d);
    }

    public final String d(zzbh zzbhVar) {
        b1l b1lVar = this.a;
        if (!b1lVar.d()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.c);
        sb.append(",name=");
        sb.append(a(zzbhVar.a));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.b;
        sb.append(zzbfVar == null ? null : !b1lVar.d() ? zzbfVar.a.toString() : e(zzbfVar.b1()));
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.d()) {
            return bundle.toString();
        }
        StringBuilder q = fc6.q("Bundle[{");
        for (String str : bundle.keySet()) {
            if (q.length() != 8) {
                q.append(", ");
            }
            q.append(b(str));
            q.append(U3.j.b);
            Object obj = bundle.get(str);
            q.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        q.append("}]");
        return q.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder q = fc6.q(U3.j.d);
        for (Object obj : objArr) {
            String e = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e != null) {
                if (q.length() != 1) {
                    q.append(", ");
                }
                q.append(e);
            }
        }
        q.append(U3.j.e);
        return q.toString();
    }
}
