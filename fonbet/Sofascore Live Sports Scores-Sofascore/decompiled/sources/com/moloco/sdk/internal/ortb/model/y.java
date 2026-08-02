package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.e;
import defpackage.oea;
import defpackage.r5h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class y {

    @NotNull
    public static final e.b Companion = new e.b();
    public final String a;
    public final float b;
    public final String c;
    public final a0 d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return h1.a;
        }
    }

    public y(int i, String str, float f, String str2, a0 a0Var, String str3, String str4, Integer num, Integer num2) {
        if (11 != (i & 11)) {
            oea.z(i, 11, x.b);
            throw null;
        }
        this.a = str;
        this.b = f;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = a0Var;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
    }

    public y(String str, float f, String str2, a0 a0Var, String str3, String str4, Integer num, Integer num2) {
        str.getClass();
        a0Var.getClass();
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = a0Var;
        this.e = str3;
        this.f = str4;
        this.g = num;
        this.h = num2;
    }
}
