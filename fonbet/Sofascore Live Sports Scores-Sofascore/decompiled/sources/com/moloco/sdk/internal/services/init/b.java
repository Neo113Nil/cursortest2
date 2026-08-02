package com.moloco.sdk.internal.services.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final /* synthetic */ b[] g;

    static {
        b bVar = new b("RequestTimeout", 0);
        a = bVar;
        b bVar2 = new b("UnknownHostHttpError", 1);
        b = bVar2;
        b bVar3 = new b("HttpSocketError", 2);
        c = bVar3;
        b bVar4 = new b("HttpSslError", 3);
        d = bVar4;
        b bVar5 = new b("PersistentHttpUnavailableError", 4);
        e = bVar5;
        b bVar6 = new b("Unknown", 5);
        f = bVar6;
        g = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) g.clone();
    }
}
