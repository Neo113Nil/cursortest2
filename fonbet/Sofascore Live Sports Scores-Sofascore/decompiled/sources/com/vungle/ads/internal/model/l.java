package com.vungle.ads.internal.model;

import defpackage.fc6;
import defpackage.h75;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public final Double a;
    public final List b;
    public final List c;

    public /* synthetic */ l(int i, Double d, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public static final void a(l lVar, wf3 wf3Var, uye uyeVar) {
        lVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || lVar.a != null) {
            wf3Var.h(uyeVar, 0, h75.a, lVar.a);
        }
        if (wf3Var.o(uyeVar) || lVar.b != null) {
            wf3Var.h(uyeVar, 1, new xg0(uhi.a, 0), lVar.b);
        }
        if (!wf3Var.o(uyeVar) && lVar.c == null) {
            return;
        }
        wf3Var.h(uyeVar, 2, new xg0(uhi.a, 0), lVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.c(this.a, lVar.a) && Intrinsics.c(this.b, lVar.b) && Intrinsics.c(this.c, lVar.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CSBResponse(price=");
        a.append(this.a);
        a.append(", nurls=");
        a.append(this.b);
        a.append(", lurls=");
        return fc6.p(a, this.c, ')');
    }
}
