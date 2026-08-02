package com.vungle.ads.internal.model;

import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();
    public final String a;
    public final i b;
    public final l c;

    public /* synthetic */ s(int i, String str, i iVar, l lVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = lVar;
        }
    }

    public static final void a(s sVar, wf3 wf3Var, uye uyeVar) {
        sVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || sVar.a != null) {
            wf3Var.h(uyeVar, 0, uhi.a, sVar.a);
        }
        if (wf3Var.o(uyeVar) || sVar.b != null) {
            wf3Var.h(uyeVar, 1, g.a, sVar.b);
        }
        if (!wf3Var.o(uyeVar) && sVar.c == null) {
            return;
        }
        wf3Var.h(uyeVar, 2, j.a, sVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.c(this.a, sVar.a) && Intrinsics.c(this.b, sVar.b) && Intrinsics.c(this.c, sVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.c;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("PlacementAdUnit(placementReferenceId=");
        a.append(this.a);
        a.append(", adMarkup=");
        a.append(this.b);
        a.append(", csb=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }
}
