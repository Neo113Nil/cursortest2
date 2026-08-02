package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.w;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.joa;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class e1 {

    @NotNull
    public static final w.a Companion;
    public static final joa a;
    public static final e1 b;
    public static final e1 c;
    public static final e1 d;
    public static final e1 e;
    public static final e1 f;
    public static final /* synthetic */ e1[] g;

    static {
        e1 e1Var = new e1("Start", 0);
        b = e1Var;
        e1 e1Var2 = new e1("Center", 1);
        c = e1Var2;
        e1 e1Var3 = new e1("End", 2);
        d = e1Var3;
        e1 e1Var4 = new e1(PlayerKt.PREFERRED_FOOT_LEFT, 3);
        e = e1Var4;
        e1 e1Var5 = new e1(PlayerKt.PREFERRED_FOOT_RIGHT, 4);
        f = e1Var5;
        g = new e1[]{e1Var, e1Var2, e1Var3, e1Var4, e1Var5};
        Companion = new w.a();
        a = ypa.a(ysa.b, new com.appsflyer.c(14));
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) g.clone();
    }
}
