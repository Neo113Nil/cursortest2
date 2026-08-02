package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjg {
    public static final zzjg c;
    public static final zzjg d;
    public static final zzjg e;
    public static final /* synthetic */ zzjg[] f;
    public final zzjh a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zzjg EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzjg EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzjg EF0;

    static {
        zzjg zzjgVar = new zzjg("DOUBLE", 0, zzjh.d, 1);
        zzjg zzjgVar2 = new zzjg("FLOAT", 1, zzjh.c, 5);
        zzjh zzjhVar = zzjh.b;
        zzjg zzjgVar3 = new zzjg("INT64", 2, zzjhVar, 0);
        zzjg zzjgVar4 = new zzjg("UINT64", 3, zzjhVar, 0);
        zzjh zzjhVar2 = zzjh.a;
        zzjg zzjgVar5 = new zzjg("INT32", 4, zzjhVar2, 0);
        zzjg zzjgVar6 = new zzjg("FIXED64", 5, zzjhVar, 1);
        zzjg zzjgVar7 = new zzjg("FIXED32", 6, zzjhVar2, 5);
        zzjg zzjgVar8 = new zzjg("BOOL", 7, zzjh.e, 0);
        zzjg zzjgVar9 = new zzjg("STRING", 8, zzjh.f, 2);
        c = zzjgVar9;
        zzjh zzjhVar3 = zzjh.i;
        zzjg zzjgVar10 = new zzjg("GROUP", 9, zzjhVar3, 3);
        d = zzjgVar10;
        zzjg zzjgVar11 = new zzjg("MESSAGE", 10, zzjhVar3, 2);
        e = zzjgVar11;
        f = new zzjg[]{zzjgVar, zzjgVar2, zzjgVar3, zzjgVar4, zzjgVar5, zzjgVar6, zzjgVar7, zzjgVar8, zzjgVar9, zzjgVar10, zzjgVar11, new zzjg("BYTES", 11, zzjh.g, 2), new zzjg("UINT32", 12, zzjhVar2, 0), new zzjg("ENUM", 13, zzjh.h, 0), new zzjg("SFIXED32", 14, zzjhVar2, 5), new zzjg("SFIXED64", 15, zzjhVar, 1), new zzjg("SINT32", 16, zzjhVar2, 0), new zzjg("SINT64", 17, zzjhVar, 0)};
    }

    public zzjg(String str, int i, zzjh zzjhVar, int i2) {
        this.a = zzjhVar;
        this.b = i2;
    }

    public static zzjg[] values() {
        return (zzjg[]) f.clone();
    }
}
