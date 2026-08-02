package com.google.android.gms.internal.consent_sdk;

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
public final class zzqg {
    public static final zzqg b;
    public static final zzqg c;
    public static final zzqg[] d;
    public static final /* synthetic */ zzqg[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zzqg EF0;

    static {
        zzqv zzqvVar = zzqv.f;
        zzqg zzqgVar = new zzqg("DOUBLE", 0, 0, 1, zzqvVar);
        zzqv zzqvVar2 = zzqv.e;
        zzqg zzqgVar2 = new zzqg("FLOAT", 1, 1, 1, zzqvVar2);
        zzqv zzqvVar3 = zzqv.d;
        zzqg zzqgVar3 = new zzqg("INT64", 2, 2, 1, zzqvVar3);
        zzqg zzqgVar4 = new zzqg("UINT64", 3, 3, 1, zzqvVar3);
        zzqv zzqvVar4 = zzqv.c;
        zzqg zzqgVar5 = new zzqg("INT32", 4, 4, 1, zzqvVar4);
        zzqg zzqgVar6 = new zzqg("FIXED64", 5, 5, 1, zzqvVar3);
        zzqg zzqgVar7 = new zzqg("FIXED32", 6, 6, 1, zzqvVar4);
        zzqv zzqvVar5 = zzqv.g;
        zzqg zzqgVar8 = new zzqg("BOOL", 7, 7, 1, zzqvVar5);
        zzqv zzqvVar6 = zzqv.h;
        zzqg zzqgVar9 = new zzqg("STRING", 8, 8, 1, zzqvVar6);
        zzqv zzqvVar7 = zzqv.k;
        zzqg zzqgVar10 = new zzqg("MESSAGE", 9, 9, 1, zzqvVar7);
        zzqv zzqvVar8 = zzqv.i;
        zzqg zzqgVar11 = new zzqg("BYTES", 10, 10, 1, zzqvVar8);
        zzqg zzqgVar12 = new zzqg("UINT32", 11, 11, 1, zzqvVar4);
        zzqv zzqvVar9 = zzqv.j;
        zzqg zzqgVar13 = new zzqg("ENUM", 12, 12, 1, zzqvVar9);
        zzqg zzqgVar14 = new zzqg("SFIXED32", 13, 13, 1, zzqvVar4);
        zzqg zzqgVar15 = new zzqg("SFIXED64", 14, 14, 1, zzqvVar3);
        zzqg zzqgVar16 = new zzqg("SINT32", 15, 15, 1, zzqvVar4);
        zzqg zzqgVar17 = new zzqg("SINT64", 16, 16, 1, zzqvVar3);
        zzqg zzqgVar18 = new zzqg("GROUP", 17, 17, 1, zzqvVar7);
        zzqg zzqgVar19 = new zzqg("DOUBLE_LIST", 18, 18, 2, zzqvVar);
        zzqg zzqgVar20 = new zzqg("FLOAT_LIST", 19, 19, 2, zzqvVar2);
        zzqg zzqgVar21 = new zzqg("INT64_LIST", 20, 20, 2, zzqvVar3);
        zzqg zzqgVar22 = new zzqg("UINT64_LIST", 21, 21, 2, zzqvVar3);
        zzqg zzqgVar23 = new zzqg("INT32_LIST", 22, 22, 2, zzqvVar4);
        zzqg zzqgVar24 = new zzqg("FIXED64_LIST", 23, 23, 2, zzqvVar3);
        zzqg zzqgVar25 = new zzqg("FIXED32_LIST", 24, 24, 2, zzqvVar4);
        zzqg zzqgVar26 = new zzqg("BOOL_LIST", 25, 25, 2, zzqvVar5);
        zzqg zzqgVar27 = new zzqg("STRING_LIST", 26, 26, 2, zzqvVar6);
        zzqg zzqgVar28 = new zzqg("MESSAGE_LIST", 27, 27, 2, zzqvVar7);
        zzqg zzqgVar29 = new zzqg("BYTES_LIST", 28, 28, 2, zzqvVar8);
        zzqg zzqgVar30 = new zzqg("UINT32_LIST", 29, 29, 2, zzqvVar4);
        zzqg zzqgVar31 = new zzqg("ENUM_LIST", 30, 30, 2, zzqvVar9);
        zzqg zzqgVar32 = new zzqg("SFIXED32_LIST", 31, 31, 2, zzqvVar4);
        zzqg zzqgVar33 = new zzqg("SFIXED64_LIST", 32, 32, 2, zzqvVar3);
        zzqg zzqgVar34 = new zzqg("SINT32_LIST", 33, 33, 2, zzqvVar4);
        zzqg zzqgVar35 = new zzqg("SINT64_LIST", 34, 34, 2, zzqvVar3);
        zzqg zzqgVar36 = new zzqg("DOUBLE_LIST_PACKED", 35, 35, 3, zzqvVar);
        b = zzqgVar36;
        zzqg zzqgVar37 = new zzqg("FLOAT_LIST_PACKED", 36, 36, 3, zzqvVar2);
        zzqg zzqgVar38 = new zzqg("INT64_LIST_PACKED", 37, 37, 3, zzqvVar3);
        zzqg zzqgVar39 = new zzqg("UINT64_LIST_PACKED", 38, 38, 3, zzqvVar3);
        zzqg zzqgVar40 = new zzqg("INT32_LIST_PACKED", 39, 39, 3, zzqvVar4);
        zzqg zzqgVar41 = new zzqg("FIXED64_LIST_PACKED", 40, 40, 3, zzqvVar3);
        zzqg zzqgVar42 = new zzqg("FIXED32_LIST_PACKED", 41, 41, 3, zzqvVar4);
        zzqg zzqgVar43 = new zzqg("BOOL_LIST_PACKED", 42, 42, 3, zzqvVar5);
        zzqg zzqgVar44 = new zzqg("UINT32_LIST_PACKED", 43, 43, 3, zzqvVar4);
        zzqg zzqgVar45 = new zzqg("ENUM_LIST_PACKED", 44, 44, 3, zzqvVar9);
        zzqg zzqgVar46 = new zzqg("SFIXED32_LIST_PACKED", 45, 45, 3, zzqvVar4);
        zzqg zzqgVar47 = new zzqg("SFIXED64_LIST_PACKED", 46, 46, 3, zzqvVar3);
        zzqg zzqgVar48 = new zzqg("SINT32_LIST_PACKED", 47, 47, 3, zzqvVar4);
        zzqg zzqgVar49 = new zzqg("SINT64_LIST_PACKED", 48, 48, 3, zzqvVar3);
        c = zzqgVar49;
        e = new zzqg[]{zzqgVar, zzqgVar2, zzqgVar3, zzqgVar4, zzqgVar5, zzqgVar6, zzqgVar7, zzqgVar8, zzqgVar9, zzqgVar10, zzqgVar11, zzqgVar12, zzqgVar13, zzqgVar14, zzqgVar15, zzqgVar16, zzqgVar17, zzqgVar18, zzqgVar19, zzqgVar20, zzqgVar21, zzqgVar22, zzqgVar23, zzqgVar24, zzqgVar25, zzqgVar26, zzqgVar27, zzqgVar28, zzqgVar29, zzqgVar30, zzqgVar31, zzqgVar32, zzqgVar33, zzqgVar34, zzqgVar35, zzqgVar36, zzqgVar37, zzqgVar38, zzqgVar39, zzqgVar40, zzqgVar41, zzqgVar42, zzqgVar43, zzqgVar44, zzqgVar45, zzqgVar46, zzqgVar47, zzqgVar48, zzqgVar49, new zzqg("GROUP_LIST", 49, 49, 2, zzqvVar7), new zzqg("MAP", 50, 50, 4, zzqv.b)};
        zzqg[] values = values();
        d = new zzqg[values.length];
        for (zzqg zzqgVar50 : values) {
            d[zzqgVar50.a] = zzqgVar50;
        }
    }

    public zzqg(String str, int i, int i2, int i3, zzqv zzqvVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = zzqvVar.a;
        } else if (i4 == 3) {
            Class cls2 = zzqvVar.a;
        }
        if (i3 == 1) {
            zzqv zzqvVar2 = zzqv.b;
            zzqvVar.ordinal();
        }
    }

    public static zzqg[] values() {
        return (zzqg[]) e.clone();
    }
}
