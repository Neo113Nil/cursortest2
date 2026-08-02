package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.fn0;
import defpackage.fso;
import defpackage.mgo;
import defpackage.mz1;
import defpackage.wfo;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgu extends fso {
    public char d;
    public long e;
    public String f;
    public final zzgs g;
    public final zzgs h;
    public final zzgs i;
    public final zzgs j;
    public final zzgs k;
    public final zzgs l;
    public final zzgs m;
    public final zzgs n;
    public final zzgs o;

    public zzgu(zzic zzicVar) {
        super(zzicVar);
        this.d = (char) 0;
        this.e = -1L;
        this.g = new zzgs(this, 6, false, false);
        this.h = new zzgs(this, 6, true, false);
        this.i = new zzgs(this, 6, false, true);
        this.j = new zzgs(this, 5, false, false);
        this.k = new zzgs(this, 5, true, false);
        this.l = new zzgs(this, 5, false, true);
        this.m = new zzgs(this, 4, false, false);
        this.n = new zzgs(this, 3, false, false);
        this.o = new zzgs(this, 2, false, false);
    }

    public static mgo U(String str) {
        if (str == null) {
            return null;
        }
        return new mgo(str);
    }

    public static String X(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String Y = Y(obj, z);
        String Y2 = Y(obj2, z);
        String Y3 = Y(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(Y)) {
            sb.append(str2);
            sb.append(Y);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(Y2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(Y2);
        }
        if (!TextUtils.isEmpty(Y3)) {
            sb.append(str3);
            sb.append(Y3);
        }
        return sb.toString();
    }

    public static String Y(Object obj, boolean z) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(mz1.d(str.length() + length + 3, String.valueOf(round2).length(), str));
            fn0.t(round, str, "...", sb);
            return x5n.m(round2, str, sb);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof mgo ? ((mgo) obj).a : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = zzic.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // defpackage.fso
    public final boolean R() {
        return false;
    }

    public final void V(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(W(), i)) {
            X(false, str, obj, obj2, obj3);
            W();
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.i(str);
        zzhz zzhzVar = ((zzic) this.b).g;
        if (zzhzVar == null) {
            W();
        } else {
            if (!zzhzVar.c) {
                W();
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzhzVar.Z(new wfo(this, i, str, obj, obj2, obj3));
        }
    }

    public final String W() {
        String str;
        synchronized (this) {
            try {
                str = this.f;
                if (str == null) {
                    ((zzic) ((zzic) this.b).d.b).getClass();
                    str = "FA";
                    this.f = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
