package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.wt3;
import defpackage.z1a;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzmv implements Comparable {
    public final long a;
    public final String b;
    public final int c;
    public final long d;
    public final Object e;
    public final RuntimeException f;

    public zzmv(long j, String str, int i, long j2, Object obj) {
        z1a.s(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        if (i != 5) {
            this.f = null;
            return;
        }
        if (obj == null) {
            this.f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof zzacr)) {
            this.f = null;
        } else {
            this.f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i = this.c;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.d;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.e;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            a70.j("Impossible, this was validated when parsed or created");
            return null;
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((zzacr) obj).s();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzmv zzmvVar = (zzmv) obj;
        long j = zzmvVar.a;
        long j2 = this.a;
        int compare = Long.compare(j2, j);
        if (compare != 0) {
            return compare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.b;
        str.getClass();
        String str2 = zzmvVar.b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmv)) {
            return false;
        }
        zzmv zzmvVar = (zzmv) obj;
        return this.a == zzmvVar.a && Objects.equals(this.b, zzmvVar.b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            str = Long.toString(this.a);
        }
        String valueOf = String.valueOf(a());
        return wt3.m(str, ":", new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), valueOf);
    }
}
