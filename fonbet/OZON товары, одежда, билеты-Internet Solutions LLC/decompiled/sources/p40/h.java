package p40;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AVAILABLE;
    public static final h ERROR;
    public static final h NOT_AVAILABLE;
    public static final h PROGRESS;
    public static final h UNKNOWN;

    static {
        h hVar = new h("AVAILABLE", 0);
        AVAILABLE = hVar;
        h hVar2 = new h("NOT_AVAILABLE", 1);
        NOT_AVAILABLE = hVar2;
        h hVar3 = new h(FraudMonInfo.UNKNOWN, 2);
        UNKNOWN = hVar3;
        h hVar4 = new h("ERROR", 3);
        ERROR = hVar4;
        h hVar5 = new h("PROGRESS", 4);
        PROGRESS = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = Xc.b.a(hVarArr);
    }

    private h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
