package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class abi {
    public static final abi a;
    public static final abi b;
    public static final abi c;
    public static final abi d;
    public static final /* synthetic */ abi[] e;

    static {
        abi abiVar = new abi("FIRST_TEAM", 0);
        a = abiVar;
        abi abiVar2 = new abi("SECOND_TEAM", 1);
        b = abiVar2;
        abi abiVar3 = new abi("NEUTRAL", 2);
        c = abiVar3;
        abi abiVar4 = new abi("NONE", 3);
        d = abiVar4;
        e = new abi[]{abiVar, abiVar2, abiVar3, abiVar4};
    }

    public static abi valueOf(String str) {
        return (abi) Enum.valueOf(abi.class, str);
    }

    public static abi[] values() {
        return (abi[]) e.clone();
    }
}
