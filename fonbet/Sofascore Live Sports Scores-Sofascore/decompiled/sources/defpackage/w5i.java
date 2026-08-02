package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w5i {
    public static final bgf b;
    public static final w5i c;
    public static final w5i d;
    public static final w5i e;
    public static final w5i f;
    public static final w5i g;
    public static final w5i h;
    public static final /* synthetic */ w5i[] i;
    public static final /* synthetic */ kp5 j;
    public final List a;

    static {
        w5i w5iVar = new w5i(0, "None", km5.a);
        c = w5iVar;
        w5i w5iVar2 = new w5i(1, "Greece", zu3.C.getMccList());
        d = w5iVar2;
        w5i w5iVar3 = new w5i(2, "Germany", zu3.z.getMccList());
        e = w5iVar3;
        w5i w5iVar4 = new w5i(3, "Canada", zu3.k.getMccList());
        f = w5iVar4;
        w5i w5iVar5 = new w5i(4, "Italy", zu3.J.getMccList());
        w5i w5iVar6 = new w5i(5, "Argentina", zu3.c.getMccList());
        g = w5iVar6;
        w5i w5iVar7 = new w5i(6, "Australia", zu3.d.getMccList());
        h = w5iVar7;
        w5i[] w5iVarArr = {w5iVar, w5iVar2, w5iVar3, w5iVar4, w5iVar5, w5iVar6, w5iVar7};
        i = w5iVarArr;
        j = new kp5(w5iVarArr);
        b = new bgf(2);
    }

    public w5i(int i2, String str, List list) {
        this.a = list;
    }

    public static w5i valueOf(String str) {
        return (w5i) Enum.valueOf(w5i.class, str);
    }

    public static w5i[] values() {
        return (w5i[]) i.clone();
    }
}
