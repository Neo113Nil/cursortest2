package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.x;
import defpackage.r13;
import defpackage.r5h;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class g1 {

    @NotNull
    public static final x.b Companion = new x.b();
    public final String a;
    public final Boolean b;
    public final String c;
    public final r13 d;
    public final r13 e;
    public final Integer f;
    public final Integer g;

    public /* synthetic */ g1(int i, String str, Boolean bool, String str2, r13 r13Var, r13 r13Var2, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = r13Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = r13Var2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
    }
}
