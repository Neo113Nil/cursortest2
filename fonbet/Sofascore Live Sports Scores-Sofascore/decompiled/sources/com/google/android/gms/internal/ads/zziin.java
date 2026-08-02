package com.google.android.gms.internal.ads;

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
public final class zziin {
    public static final zziin c;
    public static final zziin d;
    public static final zziin e;
    public static final /* synthetic */ zziin[] f;
    public final zziio a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    zziin EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zziin EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zziin EF0;

    static {
        zziin zziinVar = new zziin("DOUBLE", 0, zziio.d, 1);
        zziin zziinVar2 = new zziin("FLOAT", 1, zziio.c, 5);
        zziio zziioVar = zziio.b;
        zziin zziinVar3 = new zziin("INT64", 2, zziioVar, 0);
        zziin zziinVar4 = new zziin("UINT64", 3, zziioVar, 0);
        zziio zziioVar2 = zziio.a;
        zziin zziinVar5 = new zziin("INT32", 4, zziioVar2, 0);
        zziin zziinVar6 = new zziin("FIXED64", 5, zziioVar, 1);
        zziin zziinVar7 = new zziin("FIXED32", 6, zziioVar2, 5);
        zziin zziinVar8 = new zziin("BOOL", 7, zziio.e, 0);
        zziin zziinVar9 = new zziin("STRING", 8, zziio.f, 2);
        c = zziinVar9;
        zziio zziioVar3 = zziio.i;
        zziin zziinVar10 = new zziin("GROUP", 9, zziioVar3, 3);
        d = zziinVar10;
        zziin zziinVar11 = new zziin("MESSAGE", 10, zziioVar3, 2);
        e = zziinVar11;
        f = new zziin[]{zziinVar, zziinVar2, zziinVar3, zziinVar4, zziinVar5, zziinVar6, zziinVar7, zziinVar8, zziinVar9, zziinVar10, zziinVar11, new zziin("BYTES", 11, zziio.g, 2), new zziin("UINT32", 12, zziioVar2, 0), new zziin("ENUM", 13, zziio.h, 0), new zziin("SFIXED32", 14, zziioVar2, 5), new zziin("SFIXED64", 15, zziioVar, 1), new zziin("SINT32", 16, zziioVar2, 0), new zziin("SINT64", 17, zziioVar, 0)};
    }

    public zziin(String str, int i, zziio zziioVar, int i2) {
        this.a = zziioVar;
        this.b = i2;
    }

    public static zziin[] values() {
        return (zziin[]) f.clone();
    }
}
