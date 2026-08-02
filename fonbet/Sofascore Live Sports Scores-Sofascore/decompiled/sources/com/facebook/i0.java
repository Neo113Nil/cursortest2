package com.facebook;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i0 {
    public static final i0 a;
    public static final i0 b;
    public static final /* synthetic */ i0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    i0 EF0;

    static {
        i0 i0Var = new i0("REQUESTS", 0);
        i0 i0Var2 = new i0("INCLUDE_ACCESS_TOKENS", 1);
        i0 i0Var3 = new i0("INCLUDE_RAW_RESPONSES", 2);
        i0 i0Var4 = new i0("CACHE", 3);
        i0 i0Var5 = new i0("APP_EVENTS", 4);
        a = i0Var5;
        i0 i0Var6 = new i0("DEVELOPER_ERRORS", 5);
        b = i0Var6;
        c = new i0[]{i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, new i0("GRAPH_API_DEBUG_WARNING", 6), new i0("GRAPH_API_DEBUG_INFO", 7)};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) c.clone();
    }
}
