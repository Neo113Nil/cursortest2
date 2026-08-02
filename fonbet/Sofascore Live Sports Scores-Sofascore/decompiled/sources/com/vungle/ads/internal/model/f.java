package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();
    public final Integer a;
    public final Integer b;

    public /* synthetic */ f(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = num2;
        }
    }

    public static final void a(f fVar, wf3 wf3Var, uye uyeVar) {
        Integer num;
        Integer num2;
        fVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || (num2 = fVar.a) == null || num2.intValue() != 0) {
            wf3Var.h(uyeVar, 0, a7a.a, fVar.a);
        }
        if (wf3Var.o(uyeVar) || (num = fVar.b) == null || num.intValue() != 0) {
            wf3Var.h(uyeVar, 1, a7a.a, fVar.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.c(this.a, fVar.a) && Intrinsics.c(this.b, fVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdSizeInfo(width=");
        a.append(this.a);
        a.append(", height=");
        return bf3.n(a, this.b, ')');
    }
}
