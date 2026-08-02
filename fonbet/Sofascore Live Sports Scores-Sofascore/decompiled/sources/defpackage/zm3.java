package defpackage;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zm3 {
    public static final zm3 j = new zm3();
    public final jbd a;
    public final nad b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public zm3(zm3 zm3Var) {
        zm3Var.getClass();
        this.c = zm3Var.c;
        this.d = zm3Var.d;
        this.b = zm3Var.b;
        this.a = zm3Var.a;
        this.e = zm3Var.e;
        this.f = zm3Var.f;
        this.i = zm3Var.i;
        this.g = zm3Var.g;
        this.h = zm3Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zm3.class.equals(obj.getClass())) {
            return false;
        }
        zm3 zm3Var = (zm3) obj;
        if (this.c == zm3Var.c && this.d == zm3Var.d && this.e == zm3Var.e && this.f == zm3Var.f && this.g == zm3Var.g && this.h == zm3Var.h && Intrinsics.c(a(), zm3Var.a()) && this.a == zm3Var.a) {
            return Intrinsics.c(this.i, zm3Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int hashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest a = a();
        return hashCode2 + (a != null ? a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public zm3(nad nadVar, jbd jbdVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        set.getClass();
        this.b = nadVar;
        this.a = jbdVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public zm3() {
        jbd jbdVar = jbd.a;
        rm5 rm5Var = rm5.a;
        rm5Var.getClass();
        this.b = new nad(null);
        this.a = jbdVar;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = rm5Var;
    }
}
