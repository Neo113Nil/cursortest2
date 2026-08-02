package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3542t {
    MATRIX("matrix"),
    SATURATE("saturate"),
    HUE_ROTATE("hueRotate"),
    LUMINANCE_TO_ALPHA("luminanceToAlpha");


    /* renamed from: f, reason: collision with root package name */
    public static final Map f38938f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38939a;

    static {
        for (EnumC3542t enumC3542t : values()) {
            f38938f.put(enumC3542t.f38939a, enumC3542t);
        }
    }

    EnumC3542t(String str) {
        this.f38939a = str;
    }

    public static EnumC3542t b(String str) {
        Map map = f38938f;
        if (map.containsKey(str)) {
            return (EnumC3542t) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38939a;
    }
}
