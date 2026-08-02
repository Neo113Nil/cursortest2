package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum i0 {
    None(ViewProps.NONE),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");


    /* renamed from: g, reason: collision with root package name */
    public static final Map f38866g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38867a;

    static {
        for (i0 i0Var : values()) {
            f38866g.put(i0Var.f38867a, i0Var);
        }
    }

    i0(String str) {
        this.f38867a = str;
    }

    public static i0 b(String str) {
        Map map = f38866g;
        if (map.containsKey(str)) {
            return (i0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38867a;
    }
}
