package com.moloco.sdk.internal.ortb.model;

import defpackage.oea;
import defpackage.r5h;
import defpackage.y7k;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class n {

    @NotNull
    public static final G$b Companion = new G$b();
    public static final KSerializer[] d = {null, e1.Companion.serializer(), o.Companion.serializer()};
    public final int a;
    public final e1 b;
    public final o c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return m0.a;
        }
    }

    public n(int i, y7k y7kVar, e1 e1Var, o oVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, m.b);
            throw null;
        }
        this.a = y7kVar.a;
        this.b = e1Var;
        this.c = oVar;
    }
}
