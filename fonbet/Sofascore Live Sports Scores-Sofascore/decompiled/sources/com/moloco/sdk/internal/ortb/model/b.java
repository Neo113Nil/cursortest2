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
public final class b {

    @NotNull
    public static final A$b Companion = new A$b();
    public static final KSerializer[] h = {null, null, e1.Companion.serializer(), o.Companion.serializer(), null, null, null};
    public final boolean a;
    public final int b;
    public final e1 c;
    public final o d;
    public final long e;
    public final y7k f;
    public final r13 g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.moloco.sdk.internal.ortb.model.b$b, reason: collision with other inner class name */
    public final class C1343b {
        @NotNull
        public final KSerializer serializer() {
            return r.a;
        }
    }

    public b(int i, boolean z, y7k y7kVar, e1 e1Var, o oVar, r13 r13Var, y7k y7kVar2, r13 r13Var2) {
        if (31 != (i & 31)) {
            oea.z(i, 31, a.b);
            throw null;
        }
        this.a = z;
        this.b = y7kVar.a;
        this.c = e1Var;
        this.d = oVar;
        this.e = r13Var.a;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = y7kVar2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = r13Var2;
        }
    }

    public b(long j) {
        e1 e1Var = e1.b;
        o oVar = o.b;
        this.a = false;
        this.b = 10;
        this.c = e1Var;
        this.d = oVar;
        this.e = j;
        this.f = null;
        this.g = null;
    }
}
