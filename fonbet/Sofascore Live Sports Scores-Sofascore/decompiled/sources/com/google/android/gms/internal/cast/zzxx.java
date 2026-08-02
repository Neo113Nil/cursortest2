package com.google.android.gms.internal.cast;

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
public final class zzxx {
    public static final zzxx b;
    public static final zzxx c;
    public static final zzxx[] d;
    public static final /* synthetic */ zzxx[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zzxx EF0;

    static {
        zzyp zzypVar = zzyp.f;
        zzxx zzxxVar = new zzxx("DOUBLE", 0, 0, 1, zzypVar);
        zzyp zzypVar2 = zzyp.e;
        zzxx zzxxVar2 = new zzxx("FLOAT", 1, 1, 1, zzypVar2);
        zzyp zzypVar3 = zzyp.d;
        zzxx zzxxVar3 = new zzxx("INT64", 2, 2, 1, zzypVar3);
        zzxx zzxxVar4 = new zzxx("UINT64", 3, 3, 1, zzypVar3);
        zzyp zzypVar4 = zzyp.c;
        zzxx zzxxVar5 = new zzxx("INT32", 4, 4, 1, zzypVar4);
        zzxx zzxxVar6 = new zzxx("FIXED64", 5, 5, 1, zzypVar3);
        zzxx zzxxVar7 = new zzxx("FIXED32", 6, 6, 1, zzypVar4);
        zzyp zzypVar5 = zzyp.g;
        zzxx zzxxVar8 = new zzxx("BOOL", 7, 7, 1, zzypVar5);
        zzyp zzypVar6 = zzyp.h;
        zzxx zzxxVar9 = new zzxx("STRING", 8, 8, 1, zzypVar6);
        zzyp zzypVar7 = zzyp.k;
        zzxx zzxxVar10 = new zzxx("MESSAGE", 9, 9, 1, zzypVar7);
        zzyp zzypVar8 = zzyp.i;
        zzxx zzxxVar11 = new zzxx("BYTES", 10, 10, 1, zzypVar8);
        zzxx zzxxVar12 = new zzxx("UINT32", 11, 11, 1, zzypVar4);
        zzyp zzypVar9 = zzyp.j;
        zzxx zzxxVar13 = new zzxx("ENUM", 12, 12, 1, zzypVar9);
        zzxx zzxxVar14 = new zzxx("SFIXED32", 13, 13, 1, zzypVar4);
        zzxx zzxxVar15 = new zzxx("SFIXED64", 14, 14, 1, zzypVar3);
        zzxx zzxxVar16 = new zzxx("SINT32", 15, 15, 1, zzypVar4);
        zzxx zzxxVar17 = new zzxx("SINT64", 16, 16, 1, zzypVar3);
        zzxx zzxxVar18 = new zzxx("GROUP", 17, 17, 1, zzypVar7);
        zzxx zzxxVar19 = new zzxx("DOUBLE_LIST", 18, 18, 2, zzypVar);
        zzxx zzxxVar20 = new zzxx("FLOAT_LIST", 19, 19, 2, zzypVar2);
        zzxx zzxxVar21 = new zzxx("INT64_LIST", 20, 20, 2, zzypVar3);
        zzxx zzxxVar22 = new zzxx("UINT64_LIST", 21, 21, 2, zzypVar3);
        zzxx zzxxVar23 = new zzxx("INT32_LIST", 22, 22, 2, zzypVar4);
        zzxx zzxxVar24 = new zzxx("FIXED64_LIST", 23, 23, 2, zzypVar3);
        zzxx zzxxVar25 = new zzxx("FIXED32_LIST", 24, 24, 2, zzypVar4);
        zzxx zzxxVar26 = new zzxx("BOOL_LIST", 25, 25, 2, zzypVar5);
        zzxx zzxxVar27 = new zzxx("STRING_LIST", 26, 26, 2, zzypVar6);
        zzxx zzxxVar28 = new zzxx("MESSAGE_LIST", 27, 27, 2, zzypVar7);
        zzxx zzxxVar29 = new zzxx("BYTES_LIST", 28, 28, 2, zzypVar8);
        zzxx zzxxVar30 = new zzxx("UINT32_LIST", 29, 29, 2, zzypVar4);
        zzxx zzxxVar31 = new zzxx("ENUM_LIST", 30, 30, 2, zzypVar9);
        zzxx zzxxVar32 = new zzxx("SFIXED32_LIST", 31, 31, 2, zzypVar4);
        zzxx zzxxVar33 = new zzxx("SFIXED64_LIST", 32, 32, 2, zzypVar3);
        zzxx zzxxVar34 = new zzxx("SINT32_LIST", 33, 33, 2, zzypVar4);
        zzxx zzxxVar35 = new zzxx("SINT64_LIST", 34, 34, 2, zzypVar3);
        zzxx zzxxVar36 = new zzxx("DOUBLE_LIST_PACKED", 35, 35, 3, zzypVar);
        b = zzxxVar36;
        zzxx zzxxVar37 = new zzxx("FLOAT_LIST_PACKED", 36, 36, 3, zzypVar2);
        zzxx zzxxVar38 = new zzxx("INT64_LIST_PACKED", 37, 37, 3, zzypVar3);
        zzxx zzxxVar39 = new zzxx("UINT64_LIST_PACKED", 38, 38, 3, zzypVar3);
        zzxx zzxxVar40 = new zzxx("INT32_LIST_PACKED", 39, 39, 3, zzypVar4);
        zzxx zzxxVar41 = new zzxx("FIXED64_LIST_PACKED", 40, 40, 3, zzypVar3);
        zzxx zzxxVar42 = new zzxx("FIXED32_LIST_PACKED", 41, 41, 3, zzypVar4);
        zzxx zzxxVar43 = new zzxx("BOOL_LIST_PACKED", 42, 42, 3, zzypVar5);
        zzxx zzxxVar44 = new zzxx("UINT32_LIST_PACKED", 43, 43, 3, zzypVar4);
        zzxx zzxxVar45 = new zzxx("ENUM_LIST_PACKED", 44, 44, 3, zzypVar9);
        zzxx zzxxVar46 = new zzxx("SFIXED32_LIST_PACKED", 45, 45, 3, zzypVar4);
        zzxx zzxxVar47 = new zzxx("SFIXED64_LIST_PACKED", 46, 46, 3, zzypVar3);
        zzxx zzxxVar48 = new zzxx("SINT32_LIST_PACKED", 47, 47, 3, zzypVar4);
        zzxx zzxxVar49 = new zzxx("SINT64_LIST_PACKED", 48, 48, 3, zzypVar3);
        c = zzxxVar49;
        e = new zzxx[]{zzxxVar, zzxxVar2, zzxxVar3, zzxxVar4, zzxxVar5, zzxxVar6, zzxxVar7, zzxxVar8, zzxxVar9, zzxxVar10, zzxxVar11, zzxxVar12, zzxxVar13, zzxxVar14, zzxxVar15, zzxxVar16, zzxxVar17, zzxxVar18, zzxxVar19, zzxxVar20, zzxxVar21, zzxxVar22, zzxxVar23, zzxxVar24, zzxxVar25, zzxxVar26, zzxxVar27, zzxxVar28, zzxxVar29, zzxxVar30, zzxxVar31, zzxxVar32, zzxxVar33, zzxxVar34, zzxxVar35, zzxxVar36, zzxxVar37, zzxxVar38, zzxxVar39, zzxxVar40, zzxxVar41, zzxxVar42, zzxxVar43, zzxxVar44, zzxxVar45, zzxxVar46, zzxxVar47, zzxxVar48, zzxxVar49, new zzxx("GROUP_LIST", 49, 49, 2, zzypVar7), new zzxx("MAP", 50, 50, 4, zzyp.b)};
        zzxx[] values = values();
        d = new zzxx[values.length];
        for (zzxx zzxxVar50 : values) {
            d[zzxxVar50.a] = zzxxVar50;
        }
    }

    public zzxx(String str, int i, int i2, int i3, zzyp zzypVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = zzypVar.a;
        } else if (i4 == 3) {
            Class cls2 = zzypVar.a;
        }
        if (i3 == 1) {
            zzyp zzypVar2 = zzyp.b;
            zzypVar.ordinal();
        }
    }

    public static zzxx[] values() {
        return (zzxx[]) e.clone();
    }
}
