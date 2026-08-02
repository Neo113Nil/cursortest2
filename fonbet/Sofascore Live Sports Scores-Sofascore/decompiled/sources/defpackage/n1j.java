package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n1j {
    public static final n1j c;
    public static final n1j d;
    public static final n1j e;
    public static final n1j f;
    public static final n1j g;
    public static final /* synthetic */ n1j[] h;
    public static final /* synthetic */ kp5 i;
    public final Function1 a;
    public final Function2 b;

    static {
        byte b = 0;
        n1j n1jVar = new n1j("DepthChart", b, new i1j(b));
        c = n1jVar;
        int i2 = 1;
        n1j n1jVar2 = new n1j("General", i2, new i1j(5));
        d = n1jVar2;
        n1j n1jVar3 = new n1j("Age", 2, new i1j(6), new c8i(b, 15));
        e = n1jVar3;
        n1j n1jVar4 = new n1j("Height", 3, new i1j(7), new c8i(b, 16));
        f = n1jVar4;
        n1j n1jVar5 = new n1j("MarketValue", 4, new i1j(8), new c8i(b, 17));
        g = n1jVar5;
        n1j[] n1jVarArr = {n1jVar, n1jVar2, n1jVar3, n1jVar4, n1jVar5, new n1j("Contract", 5, new i1j(i2), j1j.b), new n1j("PreviousClub", 6, new i1j(2), k1j.b), new n1j("NationalStats", 7, new i1j(3), l1j.b), new n1j("NationalDebut", 8, new i1j(4), m1j.b)};
        h = n1jVarArr;
        i = new kp5(n1jVarArr);
    }

    public /* synthetic */ n1j(String str, int i2, Function1 function1) {
        this(str, i2, function1, new c8i((byte) 0, 14));
    }

    public static n1j valueOf(String str) {
        return (n1j) Enum.valueOf(n1j.class, str);
    }

    public static n1j[] values() {
        return (n1j[]) h.clone();
    }

    public n1j(String str, int i2, Function1 function1, Function2 function2) {
        this.a = function1;
        this.b = function2;
    }
}
