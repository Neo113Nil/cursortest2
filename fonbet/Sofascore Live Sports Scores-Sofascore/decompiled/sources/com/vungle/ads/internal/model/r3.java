package com.vungle.ads.internal.model;

import defpackage.lnb;
import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r3 {

    @NotNull
    public static final q3 Companion = new q3();
    public final String a;
    public String b;

    public /* synthetic */ r3(int i, String str, String str2) {
        if (1 != (i & 1)) {
            oea.z(i, 1, p3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public static final void a(r3 r3Var, wf3 wf3Var, uye uyeVar) {
        r3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.y(uyeVar, 0, r3Var.a);
        if (!wf3Var.o(uyeVar) && Intrinsics.c(r3Var.b, "")) {
            return;
        }
        wf3Var.y(uyeVar, 1, r3Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != null && r3.class.equals(obj.getClass())) {
            r3 r3Var = (r3) obj;
            if (Intrinsics.c(this.a, r3Var.a) && Intrinsics.c(this.b, r3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("UnclosedAd(eventId=");
        a.append(this.a);
        a.append(", sessionId=");
        return lnb.q(a, this.b, ')');
    }

    public r3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public /* synthetic */ r3(String str) {
        this(str, "");
    }

    public final void a(String str) {
        str.getClass();
        this.b = str;
    }
}
