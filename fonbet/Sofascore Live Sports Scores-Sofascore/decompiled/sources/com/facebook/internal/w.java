package com.facebook.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w {
    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final /* synthetic */ w[] e;

    static {
        w wVar = new w("NOT_LOADED", 0);
        a = wVar;
        w wVar2 = new w("LOADING", 1);
        b = wVar2;
        w wVar3 = new w("SUCCESS", 2);
        c = wVar3;
        w wVar4 = new w("ERROR", 3);
        d = wVar4;
        e = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) e.clone();
    }
}
