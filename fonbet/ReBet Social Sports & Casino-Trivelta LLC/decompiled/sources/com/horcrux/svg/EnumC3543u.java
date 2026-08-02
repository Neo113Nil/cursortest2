package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3543u {
    OVER("over"),
    IN("in"),
    OUT("out"),
    ATOP("atop"),
    XOR("xor"),
    ARITHMETIC("arithmetic");


    /* renamed from: h, reason: collision with root package name */
    public static final Map f38946h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38947a;

    static {
        for (EnumC3543u enumC3543u : values()) {
            f38946h.put(enumC3543u.f38947a, enumC3543u);
        }
    }

    EnumC3543u(String str) {
        this.f38947a = str;
    }

    public static EnumC3543u b(String str) {
        Map map = f38946h;
        if (map.containsKey(str)) {
            return (EnumC3543u) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38947a;
    }
}
