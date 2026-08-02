package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3541s {
    UNKNOWN("unknown"),
    NORMAL("normal"),
    MULTIPLY("multiply"),
    SCREEN("screen"),
    DARKEN("darken"),
    LIGHTEN("lighten");


    /* renamed from: h, reason: collision with root package name */
    public static final Map f38932h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38933a;

    static {
        for (EnumC3541s enumC3541s : values()) {
            f38932h.put(enumC3541s.f38933a, enumC3541s);
        }
    }

    EnumC3541s(String str) {
        this.f38933a = str;
    }

    public static EnumC3541s b(String str) {
        Map map = f38932h;
        if (map.containsKey(str)) {
            return (EnumC3541s) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38933a;
    }
}
