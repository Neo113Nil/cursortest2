package com.google.android.gms.internal.wearable;

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
public final class zzcy {
    public static final zzcy b;
    public static final zzcy c;
    public static final zzcy[] d;
    public static final /* synthetic */ zzcy[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zzcy EF0;

    static {
        zzdw zzdwVar = zzdw.f;
        zzcy zzcyVar = new zzcy("DOUBLE", 0, 0, 1, zzdwVar);
        zzdw zzdwVar2 = zzdw.e;
        zzcy zzcyVar2 = new zzcy("FLOAT", 1, 1, 1, zzdwVar2);
        zzdw zzdwVar3 = zzdw.d;
        zzcy zzcyVar3 = new zzcy("INT64", 2, 2, 1, zzdwVar3);
        zzcy zzcyVar4 = new zzcy("UINT64", 3, 3, 1, zzdwVar3);
        zzdw zzdwVar4 = zzdw.c;
        zzcy zzcyVar5 = new zzcy("INT32", 4, 4, 1, zzdwVar4);
        zzcy zzcyVar6 = new zzcy("FIXED64", 5, 5, 1, zzdwVar3);
        zzcy zzcyVar7 = new zzcy("FIXED32", 6, 6, 1, zzdwVar4);
        zzdw zzdwVar5 = zzdw.g;
        zzcy zzcyVar8 = new zzcy("BOOL", 7, 7, 1, zzdwVar5);
        zzdw zzdwVar6 = zzdw.h;
        zzcy zzcyVar9 = new zzcy("STRING", 8, 8, 1, zzdwVar6);
        zzdw zzdwVar7 = zzdw.k;
        zzcy zzcyVar10 = new zzcy("MESSAGE", 9, 9, 1, zzdwVar7);
        zzdw zzdwVar8 = zzdw.i;
        zzcy zzcyVar11 = new zzcy("BYTES", 10, 10, 1, zzdwVar8);
        zzcy zzcyVar12 = new zzcy("UINT32", 11, 11, 1, zzdwVar4);
        zzdw zzdwVar9 = zzdw.j;
        zzcy zzcyVar13 = new zzcy("ENUM", 12, 12, 1, zzdwVar9);
        zzcy zzcyVar14 = new zzcy("SFIXED32", 13, 13, 1, zzdwVar4);
        zzcy zzcyVar15 = new zzcy("SFIXED64", 14, 14, 1, zzdwVar3);
        zzcy zzcyVar16 = new zzcy("SINT32", 15, 15, 1, zzdwVar4);
        zzcy zzcyVar17 = new zzcy("SINT64", 16, 16, 1, zzdwVar3);
        zzcy zzcyVar18 = new zzcy("GROUP", 17, 17, 1, zzdwVar7);
        zzcy zzcyVar19 = new zzcy("DOUBLE_LIST", 18, 18, 2, zzdwVar);
        zzcy zzcyVar20 = new zzcy("FLOAT_LIST", 19, 19, 2, zzdwVar2);
        zzcy zzcyVar21 = new zzcy("INT64_LIST", 20, 20, 2, zzdwVar3);
        zzcy zzcyVar22 = new zzcy("UINT64_LIST", 21, 21, 2, zzdwVar3);
        zzcy zzcyVar23 = new zzcy("INT32_LIST", 22, 22, 2, zzdwVar4);
        zzcy zzcyVar24 = new zzcy("FIXED64_LIST", 23, 23, 2, zzdwVar3);
        zzcy zzcyVar25 = new zzcy("FIXED32_LIST", 24, 24, 2, zzdwVar4);
        zzcy zzcyVar26 = new zzcy("BOOL_LIST", 25, 25, 2, zzdwVar5);
        zzcy zzcyVar27 = new zzcy("STRING_LIST", 26, 26, 2, zzdwVar6);
        zzcy zzcyVar28 = new zzcy("MESSAGE_LIST", 27, 27, 2, zzdwVar7);
        zzcy zzcyVar29 = new zzcy("BYTES_LIST", 28, 28, 2, zzdwVar8);
        zzcy zzcyVar30 = new zzcy("UINT32_LIST", 29, 29, 2, zzdwVar4);
        zzcy zzcyVar31 = new zzcy("ENUM_LIST", 30, 30, 2, zzdwVar9);
        zzcy zzcyVar32 = new zzcy("SFIXED32_LIST", 31, 31, 2, zzdwVar4);
        zzcy zzcyVar33 = new zzcy("SFIXED64_LIST", 32, 32, 2, zzdwVar3);
        zzcy zzcyVar34 = new zzcy("SINT32_LIST", 33, 33, 2, zzdwVar4);
        zzcy zzcyVar35 = new zzcy("SINT64_LIST", 34, 34, 2, zzdwVar3);
        zzcy zzcyVar36 = new zzcy("DOUBLE_LIST_PACKED", 35, 35, 3, zzdwVar);
        b = zzcyVar36;
        zzcy zzcyVar37 = new zzcy("FLOAT_LIST_PACKED", 36, 36, 3, zzdwVar2);
        zzcy zzcyVar38 = new zzcy("INT64_LIST_PACKED", 37, 37, 3, zzdwVar3);
        zzcy zzcyVar39 = new zzcy("UINT64_LIST_PACKED", 38, 38, 3, zzdwVar3);
        zzcy zzcyVar40 = new zzcy("INT32_LIST_PACKED", 39, 39, 3, zzdwVar4);
        zzcy zzcyVar41 = new zzcy("FIXED64_LIST_PACKED", 40, 40, 3, zzdwVar3);
        zzcy zzcyVar42 = new zzcy("FIXED32_LIST_PACKED", 41, 41, 3, zzdwVar4);
        zzcy zzcyVar43 = new zzcy("BOOL_LIST_PACKED", 42, 42, 3, zzdwVar5);
        zzcy zzcyVar44 = new zzcy("UINT32_LIST_PACKED", 43, 43, 3, zzdwVar4);
        zzcy zzcyVar45 = new zzcy("ENUM_LIST_PACKED", 44, 44, 3, zzdwVar9);
        zzcy zzcyVar46 = new zzcy("SFIXED32_LIST_PACKED", 45, 45, 3, zzdwVar4);
        zzcy zzcyVar47 = new zzcy("SFIXED64_LIST_PACKED", 46, 46, 3, zzdwVar3);
        zzcy zzcyVar48 = new zzcy("SINT32_LIST_PACKED", 47, 47, 3, zzdwVar4);
        zzcy zzcyVar49 = new zzcy("SINT64_LIST_PACKED", 48, 48, 3, zzdwVar3);
        c = zzcyVar49;
        e = new zzcy[]{zzcyVar, zzcyVar2, zzcyVar3, zzcyVar4, zzcyVar5, zzcyVar6, zzcyVar7, zzcyVar8, zzcyVar9, zzcyVar10, zzcyVar11, zzcyVar12, zzcyVar13, zzcyVar14, zzcyVar15, zzcyVar16, zzcyVar17, zzcyVar18, zzcyVar19, zzcyVar20, zzcyVar21, zzcyVar22, zzcyVar23, zzcyVar24, zzcyVar25, zzcyVar26, zzcyVar27, zzcyVar28, zzcyVar29, zzcyVar30, zzcyVar31, zzcyVar32, zzcyVar33, zzcyVar34, zzcyVar35, zzcyVar36, zzcyVar37, zzcyVar38, zzcyVar39, zzcyVar40, zzcyVar41, zzcyVar42, zzcyVar43, zzcyVar44, zzcyVar45, zzcyVar46, zzcyVar47, zzcyVar48, zzcyVar49, new zzcy("GROUP_LIST", 49, 49, 2, zzdwVar7), new zzcy("MAP", 50, 50, 4, zzdw.b)};
        zzcy[] values = values();
        d = new zzcy[values.length];
        for (zzcy zzcyVar50 : values) {
            d[zzcyVar50.a] = zzcyVar50;
        }
    }

    public zzcy(String str, int i, int i2, int i3, zzdw zzdwVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = zzdwVar.a;
        } else if (i4 == 3) {
            Class cls2 = zzdwVar.a;
        }
        if (i3 == 1) {
            zzdw zzdwVar2 = zzdw.b;
            zzdwVar.ordinal();
        }
    }

    public static zzcy[] values() {
        return (zzcy[]) e.clone();
    }
}
