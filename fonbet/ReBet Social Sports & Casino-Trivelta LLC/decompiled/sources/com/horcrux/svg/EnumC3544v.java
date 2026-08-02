package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3544v {
    OBJECT_BOUNDING_BOX("objectBoundingBox"),
    USER_SPACE_ON_USE("userSpaceOnUse");


    /* renamed from: d, reason: collision with root package name */
    public static final Map f38950d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38951a;

    static {
        for (EnumC3544v enumC3544v : values()) {
            f38950d.put(enumC3544v.f38951a, enumC3544v);
        }
    }

    EnumC3544v(String str) {
        this.f38951a = str;
    }

    public static EnumC3544v b(String str) {
        Map map = f38950d;
        if (map.containsKey(str)) {
            return (EnumC3544v) map.get(str);
        }
        throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38951a;
    }
}
