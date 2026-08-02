package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class brc {
    public static final brc a;
    public static final brc b;
    public static final brc c;
    public static final brc d;
    public static final brc e;
    public static final brc f;
    public static final brc g;
    public static final brc h;
    public static final /* synthetic */ brc[] i;

    static {
        brc brcVar = new brc("CIRCULAR", 0);
        a = brcVar;
        brc brcVar2 = new brc("LINEAR", 1);
        b = brcVar2;
        brc brcVar3 = new brc("TEXTUAL", 2);
        brc brcVar4 = new brc("TEXTUAL_VALUE", 3);
        c = brcVar4;
        brc brcVar5 = new brc("TEXTUAL_GROUP", 4);
        d = brcVar5;
        brc brcVar6 = new brc("BODY_HEAD", 5);
        e = brcVar6;
        brc brcVar7 = new brc("BODY_TORSO", 6);
        f = brcVar7;
        brc brcVar8 = new brc("BODY_LEGS", 7);
        g = brcVar8;
        brc brcVar9 = new brc("BODY_HEAD_RL", 8);
        brc brcVar10 = new brc("BODY_ARMS_RL", 9);
        brc brcVar11 = new brc("BODY_LEGS_RL", 10);
        brc brcVar12 = new brc("ROW_ITEM", 11);
        h = brcVar12;
        i = new brc[]{brcVar, brcVar2, brcVar3, brcVar4, brcVar5, brcVar6, brcVar7, brcVar8, brcVar9, brcVar10, brcVar11, brcVar12};
    }

    public static brc valueOf(String str) {
        return (brc) Enum.valueOf(brc.class, str);
    }

    public static brc[] values() {
        return (brc[]) i.clone();
    }
}
