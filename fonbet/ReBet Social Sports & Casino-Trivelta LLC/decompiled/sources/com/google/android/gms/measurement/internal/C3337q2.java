package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3337q2 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f34242b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f34243c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f34244d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3329p2 f34245a;

    public C3337q2(InterfaceC3329p2 interfaceC3329p2) {
        this.f34245a = interfaceC3329p2;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC3191o.m(strArr);
        AbstractC3191o.m(strArr2);
        AbstractC3191o.m(atomicReference);
        AbstractC3191o.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
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
        return !this.f34245a.zza() ? str : g(str, W3.zzc, W3.zza, f34242b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f34245a.zza() ? str : g(str, X3.zzb, X3.zza, f34243c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f34245a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, Y3.zzb, Y3.zza, f34244d);
        }
        return "experiment_id(" + str + ")";
    }

    public final String d(zzbg zzbgVar) {
        InterfaceC3329p2 interfaceC3329p2 = this.f34245a;
        if (!interfaceC3329p2.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbgVar.f34437c);
        sb2.append(",name=");
        sb2.append(a(zzbgVar.f34435a));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f34436b;
        sb2.append(zzbeVar == null ? null : !interfaceC3329p2.zza() ? zzbeVar.toString() : e(zzbeVar.l()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f34245a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(b(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String e10 = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e10 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(e10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
