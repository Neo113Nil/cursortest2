package com.google.android.gms.internal.auth;

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
public final class zzho {
    public static final /* synthetic */ zzho[] b;
    public final zzhp a;

    /* JADX INFO: Fake field, exist only in values array */
    zzho EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzho EF2;

    /* JADX INFO: Fake field, exist only in values array */
    zzho EF3;

    static {
        zzho zzhoVar = new zzho("DOUBLE", 0, zzhp.DOUBLE);
        zzho zzhoVar2 = new zzho("FLOAT", 1, zzhp.FLOAT);
        zzhp zzhpVar = zzhp.LONG;
        zzho zzhoVar3 = new zzho("INT64", 2, zzhpVar);
        zzho zzhoVar4 = new zzho("UINT64", 3, zzhpVar);
        zzhp zzhpVar2 = zzhp.INT;
        zzho zzhoVar5 = new zzho("INT32", 4, zzhpVar2);
        zzho zzhoVar6 = new zzho("FIXED64", 5, zzhpVar);
        zzho zzhoVar7 = new zzho("FIXED32", 6, zzhpVar2);
        zzho zzhoVar8 = new zzho("BOOL", 7, zzhp.BOOLEAN);
        zzho zzhoVar9 = new zzho("STRING", 8, zzhp.STRING);
        zzhp zzhpVar3 = zzhp.MESSAGE;
        b = new zzho[]{zzhoVar, zzhoVar2, zzhoVar3, zzhoVar4, zzhoVar5, zzhoVar6, zzhoVar7, zzhoVar8, zzhoVar9, new zzho("GROUP", 9, zzhpVar3), new zzho("MESSAGE", 10, zzhpVar3), new zzho("BYTES", 11, zzhp.BYTE_STRING), new zzho("UINT32", 12, zzhpVar2), new zzho("ENUM", 13, zzhp.ENUM), new zzho("SFIXED32", 14, zzhpVar2), new zzho("SFIXED64", 15, zzhpVar), new zzho("SINT32", 16, zzhpVar2), new zzho("SINT64", 17, zzhpVar)};
    }

    public zzho(String str, int i, zzhp zzhpVar) {
        this.a = zzhpVar;
    }

    public static zzho[] values() {
        return (zzho[]) b.clone();
    }
}
