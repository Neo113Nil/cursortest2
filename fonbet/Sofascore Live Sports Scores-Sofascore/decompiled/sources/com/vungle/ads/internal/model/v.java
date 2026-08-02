package com.vungle.ads.internal.model;

import defpackage.dmi;
import defpackage.q79;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();
    public final Map a;
    public final Map b;

    public /* synthetic */ v(int i, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
    }

    public static final void a(v vVar, wf3 wf3Var, uye uyeVar) {
        vVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || vVar.a != null) {
            uhi uhiVar = uhi.a;
            wf3Var.h(uyeVar, 0, new q79(uhiVar, uhiVar, 1), vVar.a);
        }
        if (!wf3Var.o(uyeVar) && vVar.b == null) {
            return;
        }
        wf3Var.h(uyeVar, 1, new q79(uhi.a, m.a, 1), vVar.b);
    }

    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.c(this.a, vVar.a) && Intrinsics.c(this.b, vVar.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("TemplateSettings(normalReplacements=");
        a.append(this.a);
        a.append(", cacheableReplacements=");
        return dmi.s(a, this.b, ')');
    }

    public final Map a() {
        return this.b;
    }
}
