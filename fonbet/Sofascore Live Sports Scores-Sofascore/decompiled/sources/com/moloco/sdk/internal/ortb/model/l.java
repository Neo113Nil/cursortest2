package com.moloco.sdk.internal.ortb.model;

import defpackage.oea;
import defpackage.r13;
import defpackage.r5h;
import defpackage.y7k;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final F$b Companion = new F$b();
    public static final KSerializer[] h = {null, null, null, e1.Companion.serializer(), o.Companion.serializer(), null, null};
    public final int a;
    public final int b;
    public final int c;
    public final e1 d;
    public final o e;
    public final long f;
    public final r13 g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return i0.a;
        }
    }

    public l(int i, y7k y7kVar, y7k y7kVar2, y7k y7kVar3, e1 e1Var, o oVar, r13 r13Var, r13 r13Var2) {
        if (63 != (i & 63)) {
            oea.z(i, 63, k.b);
            throw null;
        }
        this.a = y7kVar.a;
        this.b = y7kVar2.a;
        this.c = y7kVar3.a;
        this.d = e1Var;
        this.e = oVar;
        this.f = r13Var.a;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = r13Var2;
        }
    }

    public l(long j) {
        e1 e1Var = e1.d;
        o oVar = o.b;
        this.a = 5;
        this.b = 10;
        this.c = 30;
        this.d = e1Var;
        this.e = oVar;
        this.f = j;
        this.g = null;
    }
}
