package com.moloco.sdk.acm.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public static final c a;
    public static final c b;
    public static final /* synthetic */ c[] c;

    static {
        c cVar = new c("TIMER", 0);
        a = cVar;
        c cVar2 = new c("COUNT", 1);
        b = cVar2;
        c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) c.clone();
    }
}
