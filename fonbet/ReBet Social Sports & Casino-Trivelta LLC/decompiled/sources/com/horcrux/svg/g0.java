package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum g0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* renamed from: o, reason: collision with root package name */
    public static final Map f38852o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38853a;

    static {
        for (g0 g0Var : values()) {
            f38852o.put(g0Var.f38853a, g0Var);
        }
    }

    g0(String str) {
        this.f38853a = str;
    }

    public static g0 b(String str) {
        return (g0) f38852o.get(str);
    }

    public static boolean c(String str) {
        return f38852o.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38853a;
    }
}
