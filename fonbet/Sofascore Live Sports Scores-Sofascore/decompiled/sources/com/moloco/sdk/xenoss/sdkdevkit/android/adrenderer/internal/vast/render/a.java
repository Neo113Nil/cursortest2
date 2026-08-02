package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import defpackage.dmi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final i a;
    public final b b;
    public final List c;
    public final List d;
    public final m0 e;

    public a(i iVar, b bVar, List list, List list2, m0 m0Var) {
        list2.getClass();
        this.a = iVar;
        this.b = bVar;
        this.c = list;
        this.d = list2;
        this.e = m0Var;
    }

    public static a a(a aVar, m0 m0Var) {
        i iVar = aVar.a;
        b bVar = aVar.b;
        List list = aVar.c;
        List list2 = aVar.d;
        aVar.getClass();
        list2.getClass();
        return new a(iVar, bVar, list, list2, m0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Intrinsics.c(this.b, aVar.b) && this.c.equals(aVar.c) && Intrinsics.c(this.d, aVar.d) && Intrinsics.c(this.e, aVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int d = dmi.d(dmi.d((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.c), 31, this.d);
        m0 m0Var = this.e;
        return d + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Ad(linear=" + this.a + ", companion=" + this.b + ", impressionTracking=" + this.c + ", errorTracking=" + this.d + ", dec=" + this.e + ')';
    }
}
