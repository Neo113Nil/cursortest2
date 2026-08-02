package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rqj {
    public static final pff a;
    public static final rqj b;
    public static final rqj c;
    public static final rqj d;
    public static final rqj e;
    public static final rqj f;
    public static final rqj g;
    public static final rqj h;
    public static final rqj i;
    public static final rqj j;
    public static final /* synthetic */ rqj[] k;

    static {
        rqj rqjVar = new rqj("ROUND_1", 0);
        b = rqjVar;
        rqj rqjVar2 = new rqj("ROUND_2", 1);
        c = rqjVar2;
        rqj rqjVar3 = new rqj("ROUND_3", 2);
        d = rqjVar3;
        rqj rqjVar4 = new rqj("ROUND_OF_32", 3);
        e = rqjVar4;
        rqj rqjVar5 = new rqj("ROUND_OF_16", 4);
        f = rqjVar5;
        rqj rqjVar6 = new rqj("QUARTERFINALS", 5);
        g = rqjVar6;
        rqj rqjVar7 = new rqj("SEMIFINALS", 6);
        h = rqjVar7;
        rqj rqjVar8 = new rqj("FINAL", 7);
        i = rqjVar8;
        rqj rqjVar9 = new rqj("TOURNAMENT", 8);
        j = rqjVar9;
        k = new rqj[]{rqjVar, rqjVar2, rqjVar3, rqjVar4, rqjVar5, rqjVar6, rqjVar7, rqjVar8, rqjVar9, new rqj("SEASON", 9)};
        a = new pff((byte) 0, 4);
    }

    public static rqj valueOf(String str) {
        return (rqj) Enum.valueOf(rqj.class, str);
    }

    public static rqj[] values() {
        return (rqj[]) k.clone();
    }
}
