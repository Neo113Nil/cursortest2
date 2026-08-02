package com.moloco.sdk.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {
    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;
    public static final /* synthetic */ z[] g;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z("AD_LOAD_LIMIT_REACHED", 0);
        z zVar2 = new z("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);
        a = zVar2;
        z zVar3 = new z("BID_LOAD_ERROR_PARSE_INVALID_JSON", 2);
        b = zVar3;
        z zVar4 = new z("BID_LOAD_ERROR_PARSE_MISSING_REQUIRED_FIELD", 3);
        c = zVar4;
        z zVar5 = new z("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 4);
        d = zVar5;
        z zVar6 = new z("AD_SHOW_ERROR_NOT_LOADED", 5);
        e = zVar6;
        z zVar7 = new z("AD_SHOW_ERROR_ALREADY_DISPLAYING", 6);
        f = zVar7;
        g = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
