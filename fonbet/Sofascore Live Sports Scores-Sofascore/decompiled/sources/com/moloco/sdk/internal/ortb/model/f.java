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
public final class f {

    @NotNull
    public static final C$b Companion = new C$b();
    public static final KSerializer[] e = {null, e1.Companion.serializer(), o.Companion.serializer(), null};
    public final int a;
    public final e1 b;
    public final o c;
    public final long d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return z.a;
        }
    }

    public f(int i, y7k y7kVar, e1 e1Var, o oVar, r13 r13Var) {
        if (15 != (i & 15)) {
            oea.z(i, 15, e.b);
            throw null;
        }
        this.a = y7kVar.a;
        this.b = e1Var;
        this.c = oVar;
        this.d = r13Var.a;
    }

    public f(long j) {
        e1 e1Var = e1.c;
        o oVar = o.d;
        this.a = 0;
        this.b = e1Var;
        this.c = oVar;
        this.d = j;
    }
}
