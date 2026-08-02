package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();
    public final String a;
    public final String b;
    public final Integer c;

    public /* synthetic */ o(int i, String str, String str2, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public static final void a(o oVar, wf3 wf3Var, uye uyeVar) {
        oVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || oVar.a != null) {
            wf3Var.h(uyeVar, 0, uhi.a, oVar.a);
        }
        if (wf3Var.o(uyeVar) || oVar.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, oVar.b);
        }
        if (!wf3Var.o(uyeVar) && oVar.c == null) {
            return;
        }
        wf3Var.h(uyeVar, 2, a7a.a, oVar.c);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.c(this.a, oVar.a) && Intrinsics.c(this.b, oVar.b) && Intrinsics.c(this.c, oVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CacheableReplacement(url=");
        a.append(this.a);
        a.append(", extension=");
        a.append(this.b);
        a.append(", downloadPercent=");
        return bf3.n(a, this.c, ')');
    }

    public final Integer a() {
        return this.c;
    }
}
