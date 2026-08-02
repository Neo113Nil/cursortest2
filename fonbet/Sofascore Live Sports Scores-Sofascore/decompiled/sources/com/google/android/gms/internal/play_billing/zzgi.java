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
public final class zzgi {
    public static final zzgi b;
    public static final zzgi c;
    public static final zzgi[] d;
    public static final /* synthetic */ zzgi[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zzgi EF0;

    static {
        zzhc zzhcVar = zzhc.f;
        zzgi zzgiVar = new zzgi("DOUBLE", 0, 0, 1, zzhcVar);
        zzhc zzhcVar2 = zzhc.e;
        zzgi zzgiVar2 = new zzgi("FLOAT", 1, 1, 1, zzhcVar2);
        zzhc zzhcVar3 = zzhc.d;
        zzgi zzgiVar3 = new zzgi("INT64", 2, 2, 1, zzhcVar3);
        zzgi zzgiVar4 = new zzgi("UINT64", 3, 3, 1, zzhcVar3);
        zzhc zzhcVar4 = zzhc.c;
        zzgi zzgiVar5 = new zzgi("INT32", 4, 4, 1, zzhcVar4);
        zzgi zzgiVar6 = new zzgi("FIXED64", 5, 5, 1, zzhcVar3);
        zzgi zzgiVar7 = new zzgi("FIXED32", 6, 6, 1, zzhcVar4);
        zzhc zzhcVar5 = zzhc.g;
        zzgi zzgiVar8 = new zzgi("BOOL", 7, 7, 1, zzhcVar5);
        zzhc zzhcVar6 = zzhc.h;
        zzgi zzgiVar9 = new zzgi("STRING", 8, 8, 1, zzhcVar6);
        zzhc zzhcVar7 = zzhc.k;
        zzgi zzgiVar10 = new zzgi("MESSAGE", 9, 9, 1, zzhcVar7);
        zzhc zzhcVar8 = zzhc.i;
        zzgi zzgiVar11 = new zzgi("BYTES", 10, 10, 1, zzhcVar8);
        zzgi zzgiVar12 = new zzgi("UINT32", 11, 11, 1, zzhcVar4);
        zzhc zzhcVar9 = zzhc.j;
        zzgi zzgiVar13 = new zzgi("ENUM", 12, 12, 1, zzhcVar9);
        zzgi zzgiVar14 = new zzgi("SFIXED32", 13, 13, 1, zzhcVar4);
        zzgi zzgiVar15 = new zzgi("SFIXED64", 14, 14, 1, zzhcVar3);
        zzgi zzgiVar16 = new zzgi("SINT32", 15, 15, 1, zzhcVar4);
        zzgi zzgiVar17 = new zzgi("SINT64", 16, 16, 1, zzhcVar3);
        zzgi zzgiVar18 = new zzgi("GROUP", 17, 17, 1, zzhcVar7);
        zzgi zzgiVar19 = new zzgi("DOUBLE_LIST", 18, 18, 2, zzhcVar);
        zzgi zzgiVar20 = new zzgi("FLOAT_LIST", 19, 19, 2, zzhcVar2);
        zzgi zzgiVar21 = new zzgi("INT64_LIST", 20, 20, 2, zzhcVar3);
        zzgi zzgiVar22 = new zzgi("UINT64_LIST", 21, 21, 2, zzhcVar3);
        zzgi zzgiVar23 = new zzgi("INT32_LIST", 22, 22, 2, zzhcVar4);
        zzgi zzgiVar24 = new zzgi("FIXED64_LIST", 23, 23, 2, zzhcVar3);
        zzgi zzgiVar25 = new zzgi("FIXED32_LIST", 24, 24, 2, zzhcVar4);
        zzgi zzgiVar26 = new zzgi("BOOL_LIST", 25, 25, 2, zzhcVar5);
        zzgi zzgiVar27 = new zzgi("STRING_LIST", 26, 26, 2, zzhcVar6);
        zzgi zzgiVar28 = new zzgi("MESSAGE_LIST", 27, 27, 2, zzhcVar7);
        zzgi zzgiVar29 = new zzgi("BYTES_LIST", 28, 28, 2, zzhcVar8);
        zzgi zzgiVar30 = new zzgi("UINT32_LIST", 29, 29, 2, zzhcVar4);
        zzgi zzgiVar31 = new zzgi("ENUM_LIST", 30, 30, 2, zzhcVar9);
        zzgi zzgiVar32 = new zzgi("SFIXED32_LIST", 31, 31, 2, zzhcVar4);
        zzgi zzgiVar33 = new zzgi("SFIXED64_LIST", 32, 32, 2, zzhcVar3);
        zzgi zzgiVar34 = new zzgi("SINT32_LIST", 33, 33, 2, zzhcVar4);
        zzgi zzgiVar35 = new zzgi("SINT64_LIST", 34, 34, 2, zzhcVar3);
        zzgi zzgiVar36 = new zzgi("DOUBLE_LIST_PACKED", 35, 35, 3, zzhcVar);
        b = zzgiVar36;
        zzgi zzgiVar37 = new zzgi("FLOAT_LIST_PACKED", 36, 36, 3, zzhcVar2);
        zzgi zzgiVar38 = new zzgi("INT64_LIST_PACKED", 37, 37, 3, zzhcVar3);
        zzgi zzgiVar39 = new zzgi("UINT64_LIST_PACKED", 38, 38, 3, zzhcVar3);
        zzgi zzgiVar40 = new zzgi("INT32_LIST_PACKED", 39, 39, 3, zzhcVar4);
        zzgi zzgiVar41 = new zzgi("FIXED64_LIST_PACKED", 40, 40, 3, zzhcVar3);
        zzgi zzgiVar42 = new zzgi("FIXED32_LIST_PACKED", 41, 41, 3, zzhcVar4);
        zzgi zzgiVar43 = new zzgi("BOOL_LIST_PACKED", 42, 42, 3, zzhcVar5);
        zzgi zzgiVar44 = new zzgi("UINT32_LIST_PACKED", 43, 43, 3, zzhcVar4);
        zzgi zzgiVar45 = new zzgi("ENUM_LIST_PACKED", 44, 44, 3, zzhcVar9);
        zzgi zzgiVar46 = new zzgi("SFIXED32_LIST_PACKED", 45, 45, 3, zzhcVar4);
        zzgi zzgiVar47 = new zzgi("SFIXED64_LIST_PACKED", 46, 46, 3, zzhcVar3);
        zzgi zzgiVar48 = new zzgi("SINT32_LIST_PACKED", 47, 47, 3, zzhcVar4);
        zzgi zzgiVar49 = new zzgi("SINT64_LIST_PACKED", 48, 48, 3, zzhcVar3);
        c = zzgiVar49;
        e = new zzgi[]{zzgiVar, zzgiVar2, zzgiVar3, zzgiVar4, zzgiVar5, zzgiVar6, zzgiVar7, zzgiVar8, zzgiVar9, zzgiVar10, zzgiVar11, zzgiVar12, zzgiVar13, zzgiVar14, zzgiVar15, zzgiVar16, zzgiVar17, zzgiVar18, zzgiVar19, zzgiVar20, zzgiVar21, zzgiVar22, zzgiVar23, zzgiVar24, zzgiVar25, zzgiVar26, zzgiVar27, zzgiVar28, zzgiVar29, zzgiVar30, zzgiVar31, zzgiVar32, zzgiVar33, zzgiVar34, zzgiVar35, zzgiVar36, zzgiVar37, zzgiVar38, zzgiVar39, zzgiVar40, zzgiVar41, zzgiVar42, zzgiVar43, zzgiVar44, zzgiVar45, zzgiVar46, zzgiVar47, zzgiVar48, zzgiVar49, new zzgi("GROUP_LIST", 49, 49, 2, zzhcVar7), new zzgi("MAP", 50, 50, 4, zzhc.b)};
        zzgi[] values = values();
        d = new zzgi[values.length];
        for (zzgi zzgiVar50 : values) {
            d[zzgiVar50.a] = zzgiVar50;
        }
    }

    public zzgi(String str, int i, int i2, int i3, zzhc zzhcVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = zzhcVar.a;
        } else if (i4 == 3) {
            Class cls2 = zzhcVar.a;
        }
        if (i3 == 1) {
            zzhc zzhcVar2 = zzhc.b;
            zzhcVar.ordinal();
        }
    }

    public static zzgi[] values() {
        return (zzgi[]) e.clone();
    }
}
