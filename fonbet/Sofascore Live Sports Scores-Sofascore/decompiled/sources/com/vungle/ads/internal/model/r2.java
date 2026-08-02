package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.gz1;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();
    public final Integer a;
    public final Boolean b;

    public /* synthetic */ r2(int i, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public static final void a(r2 r2Var, wf3 wf3Var, uye uyeVar) {
        r2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || r2Var.a != null) {
            wf3Var.h(uyeVar, 0, a7a.a, r2Var.a);
        }
        if (!wf3Var.o(uyeVar) && r2Var.b == null) {
            return;
        }
        wf3Var.h(uyeVar, 1, gz1.a, r2Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Intrinsics.c(this.a, r2Var.a) && Intrinsics.c(this.b, r2Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("LogMetricsSettings(errorLogLevel=");
        a.append(this.a);
        a.append(", metricsEnabled=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
