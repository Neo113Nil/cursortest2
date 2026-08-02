package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.i;
import defpackage.oea;
import defpackage.r13;
import defpackage.r5h;
import defpackage.y7k;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class e0 {

    @NotNull
    public static final i.b Companion = new i.b();
    public static final KSerializer[] h = {null, null, null, e1.Companion.serializer(), o.Companion.serializer(), null, null};
    public final String a;
    public final String b;
    public final int c;
    public final e1 d;
    public final o e;
    public final long f;
    public final r13 g;

    public e0(int i, String str, String str2, y7k y7kVar, e1 e1Var, o oVar, r13 r13Var, r13 r13Var2) {
        if (61 != (i & 61)) {
            oea.z(i, 61, d0.b);
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = y7kVar.a;
        this.d = e1Var;
        this.e = oVar;
        this.f = r13Var.a;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = r13Var2;
        }
    }
}
