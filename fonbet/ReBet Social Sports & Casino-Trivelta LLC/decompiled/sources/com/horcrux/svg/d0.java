package com.horcrux.svg;

import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum d0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(ViewProps.BOTTOM),
    center("center"),
    top(ViewProps.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* renamed from: r, reason: collision with root package name */
    public static final Map f38825r = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f38826a;

    static {
        for (d0 d0Var : values()) {
            f38825r.put(d0Var.f38826a, d0Var);
        }
    }

    d0(String str) {
        this.f38826a = str;
    }

    public static d0 b(String str) {
        Map map = f38825r;
        if (map.containsKey(str)) {
            return (d0) map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38826a;
    }
}
