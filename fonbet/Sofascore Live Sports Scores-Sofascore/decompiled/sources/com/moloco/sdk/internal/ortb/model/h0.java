package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import com.moloco.sdk.internal.ortb.model.k;
import defpackage.hkg;
import defpackage.r13;
import defpackage.r5h;
import defpackage.y7k;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class h0 {

    @NotNull
    public static final k.b Companion = new k.b();
    public static final KSerializer[] i = {null, null, null, null, e1.Companion.serializer(), o.Companion.serializer(), null, null};
    public final String a;
    public final boolean b;
    public final int c;
    public final Integer d;
    public final e1 e;
    public final o f;
    public final long g;
    public final long h;

    public /* synthetic */ h0(int i2, String str, boolean z, y7k y7kVar, Integer num, e1 e1Var, o oVar, r13 r13Var, r13 r13Var2) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
        this.c = (i2 & 4) == 0 ? 30 : y7kVar.a;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i2 & 16) == 0) {
            this.e = e1.f;
        } else {
            this.e = e1Var;
        }
        if ((i2 & 32) == 0) {
            this.f = o.b;
        } else {
            this.f = oVar;
        }
        this.g = (i2 & 64) == 0 ? hkg.b(Color.parseColor("#FF4285f4")) : r13Var.a;
        this.h = (i2 & 128) == 0 ? hkg.b(Color.parseColor("#FFFFFFFF")) : r13Var2.a;
    }
}
