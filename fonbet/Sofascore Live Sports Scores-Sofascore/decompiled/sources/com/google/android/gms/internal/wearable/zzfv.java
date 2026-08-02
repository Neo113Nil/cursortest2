package com.google.android.gms.internal.wearable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
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
public final class zzfv {
    public static final /* synthetic */ zzfv[] b;
    public final zzfw a;

    /* JADX INFO: Fake field, exist only in values array */
    zzfv EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzfv EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzfv EF3;

    static {
        zzfv zzfvVar = new zzfv("DOUBLE", 0, zzfw.d);
        zzfv zzfvVar2 = new zzfv("FLOAT", 1, zzfw.c);
        zzfw zzfwVar = zzfw.b;
        zzfv zzfvVar3 = new zzfv("INT64", 2, zzfwVar);
        zzfv zzfvVar4 = new zzfv("UINT64", 3, zzfwVar);
        zzfw zzfwVar2 = zzfw.a;
        zzfv zzfvVar5 = new zzfv("INT32", 4, zzfwVar2);
        zzfv zzfvVar6 = new zzfv("FIXED64", 5, zzfwVar);
        zzfv zzfvVar7 = new zzfv("FIXED32", 6, zzfwVar2);
        zzfv zzfvVar8 = new zzfv("BOOL", 7, zzfw.e);
        zzfv zzfvVar9 = new zzfv("STRING", 8, zzfw.f);
        zzfw zzfwVar3 = zzfw.i;
        b = new zzfv[]{zzfvVar, zzfvVar2, zzfvVar3, zzfvVar4, zzfvVar5, zzfvVar6, zzfvVar7, zzfvVar8, zzfvVar9, new zzfv("GROUP", 9, zzfwVar3), new zzfv("MESSAGE", 10, zzfwVar3), new zzfv("BYTES", 11, zzfw.g), new zzfv("UINT32", 12, zzfwVar2), new zzfv("ENUM", 13, zzfw.h), new zzfv("SFIXED32", 14, zzfwVar2), new zzfv("SFIXED64", 15, zzfwVar), new zzfv("SINT32", 16, zzfwVar2), new zzfv("SINT64", 17, zzfwVar)};
    }

    public zzfv(String str, int i, zzfw zzfwVar) {
        this.a = zzfwVar;
    }

    public static zzfv[] values() {
        return (zzfv[]) b.clone();
    }
}
