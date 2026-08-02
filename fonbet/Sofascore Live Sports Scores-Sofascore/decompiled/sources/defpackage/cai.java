package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cai {
    public static final cai b;
    public static final cai c;
    public static final cai d;
    public static final /* synthetic */ cai[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;

    static {
        cai caiVar = new cai("SHORT", 0, "Short");
        b = caiVar;
        cai caiVar2 = new cai("FULL", 1, "Full");
        c = caiVar2;
        cai caiVar3 = new cai("FORM", 2, "Form");
        d = caiVar3;
        cai[] caiVarArr = {caiVar, caiVar2, caiVar3};
        e = caiVarArr;
        f = new kp5(caiVarArr);
    }

    public cai(String str, int i, String str2) {
        this.a = str2;
    }

    public static cai valueOf(String str) {
        return (cai) Enum.valueOf(cai.class, str);
    }

    public static cai[] values() {
        return (cai[]) e.clone();
    }
}
