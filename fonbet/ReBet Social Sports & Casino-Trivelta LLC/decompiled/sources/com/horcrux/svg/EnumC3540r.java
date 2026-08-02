package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3540r {
    UNKNOWN("unknown"),
    DUPLICATE("duplicate"),
    WRAP("wrap"),
    NONE(ViewProps.NONE);


    /* renamed from: f, reason: collision with root package name */
    public static final Map f38924f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38925a;

    static {
        for (EnumC3540r enumC3540r : values()) {
            f38924f.put(enumC3540r.f38925a, enumC3540r);
        }
    }

    EnumC3540r(String str) {
        this.f38925a = str;
    }

    public static EnumC3540r b(String str) {
        Map map = f38924f;
        if (map.containsKey(str)) {
            return (EnumC3540r) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'edgeMode' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38925a;
    }
}
