package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3392x2 extends P3 {

    /* renamed from: c, reason: collision with root package name */
    public char f34371c;

    /* renamed from: d, reason: collision with root package name */
    public long f34372d;

    /* renamed from: e, reason: collision with root package name */
    public String f34373e;

    /* renamed from: f, reason: collision with root package name */
    public final C3376v2 f34374f;

    /* renamed from: g, reason: collision with root package name */
    public final C3376v2 f34375g;

    /* renamed from: h, reason: collision with root package name */
    public final C3376v2 f34376h;

    /* renamed from: i, reason: collision with root package name */
    public final C3376v2 f34377i;

    /* renamed from: j, reason: collision with root package name */
    public final C3376v2 f34378j;

    /* renamed from: k, reason: collision with root package name */
    public final C3376v2 f34379k;

    /* renamed from: l, reason: collision with root package name */
    public final C3376v2 f34380l;

    /* renamed from: m, reason: collision with root package name */
    public final C3376v2 f34381m;

    /* renamed from: n, reason: collision with root package name */
    public final C3376v2 f34382n;

    public C3392x2(C3298l3 c3298l3) {
        super(c3298l3);
        this.f34371c = (char) 0;
        this.f34372d = -1L;
        this.f34374f = new C3376v2(this, 6, false, false);
        this.f34375g = new C3376v2(this, 6, true, false);
        this.f34376h = new C3376v2(this, 6, false, true);
        this.f34377i = new C3376v2(this, 5, false, false);
        this.f34378j = new C3376v2(this, 5, true, false);
        this.f34379k = new C3376v2(this, 5, false, true);
        this.f34380l = new C3376v2(this, 4, false, false);
        this.f34381m = new C3376v2(this, 3, false, false);
        this.f34382n = new C3376v2(this, 2, false, false);
    }

    public static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String B10 = B(z10, obj);
        String B11 = B(z10, obj2);
        String B12 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B10)) {
            sb2.append(str2);
            sb2.append(B10);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(B11)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(B11);
        }
        if (!TextUtils.isEmpty(B12)) {
            sb2.append(str3);
            sb2.append(B12);
        }
        return sb2.toString();
    }

    public static String B(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C3384w2 ? ((C3384w2) obj).a() : z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String C10 = C(C3298l3.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C10)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb3.toString();
    }

    public static String C(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, lastIndexOf);
    }

    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new C3384w2(str);
    }

    public final /* synthetic */ char D() {
        return this.f34371c;
    }

    public final /* synthetic */ void E(char c10) {
        this.f34371c = c10;
    }

    public final /* synthetic */ long F() {
        return this.f34372d;
    }

    public final /* synthetic */ void G(long j10) {
        this.f34372d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final boolean i() {
        return false;
    }

    public final C3376v2 o() {
        return this.f34374f;
    }

    public final C3376v2 p() {
        return this.f34375g;
    }

    public final C3376v2 q() {
        return this.f34376h;
    }

    public final C3376v2 r() {
        return this.f34377i;
    }

    public final C3376v2 s() {
        return this.f34378j;
    }

    public final C3376v2 t() {
        return this.f34379k;
    }

    public final C3376v2 u() {
        return this.f34380l;
    }

    public final C3376v2 v() {
        return this.f34381m;
    }

    public final C3376v2 w() {
        return this.f34382n;
    }

    public final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        AbstractC3191o.m(str);
        C3234d3 A10 = this.f33578a.A();
        if (A10 == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!A10.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            A10.t(new RunnableC3368u2(this, i10, str, obj, obj2, obj3));
        }
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f34373e == null) {
                    this.f34373e = this.f33578a.w().u();
                }
                AbstractC3191o.m(this.f34373e);
                str = this.f34373e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
