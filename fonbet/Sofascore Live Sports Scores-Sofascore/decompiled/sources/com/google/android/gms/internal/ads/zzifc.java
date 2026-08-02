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
public final class zzifc {
    public static final zzifc b;
    public static final zzifc c;
    public static final zzifc[] d;
    public static final /* synthetic */ zzifc[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    zzifc EF0;

    static {
        zzigg zziggVar = zzigg.f;
        zzifc zzifcVar = new zzifc("DOUBLE", 0, 0, 1, zziggVar);
        zzigg zziggVar2 = zzigg.e;
        zzifc zzifcVar2 = new zzifc("FLOAT", 1, 1, 1, zziggVar2);
        zzigg zziggVar3 = zzigg.d;
        zzifc zzifcVar3 = new zzifc("INT64", 2, 2, 1, zziggVar3);
        zzifc zzifcVar4 = new zzifc("UINT64", 3, 3, 1, zziggVar3);
        zzigg zziggVar4 = zzigg.c;
        zzifc zzifcVar5 = new zzifc("INT32", 4, 4, 1, zziggVar4);
        zzifc zzifcVar6 = new zzifc("FIXED64", 5, 5, 1, zziggVar3);
        zzifc zzifcVar7 = new zzifc("FIXED32", 6, 6, 1, zziggVar4);
        zzigg zziggVar5 = zzigg.g;
        zzifc zzifcVar8 = new zzifc("BOOL", 7, 7, 1, zziggVar5);
        zzigg zziggVar6 = zzigg.h;
        zzifc zzifcVar9 = new zzifc("STRING", 8, 8, 1, zziggVar6);
        zzigg zziggVar7 = zzigg.k;
        zzifc zzifcVar10 = new zzifc("MESSAGE", 9, 9, 1, zziggVar7);
        zzigg zziggVar8 = zzigg.i;
        zzifc zzifcVar11 = new zzifc("BYTES", 10, 10, 1, zziggVar8);
        zzifc zzifcVar12 = new zzifc("UINT32", 11, 11, 1, zziggVar4);
        zzigg zziggVar9 = zzigg.j;
        zzifc zzifcVar13 = new zzifc("ENUM", 12, 12, 1, zziggVar9);
        zzifc zzifcVar14 = new zzifc("SFIXED32", 13, 13, 1, zziggVar4);
        zzifc zzifcVar15 = new zzifc("SFIXED64", 14, 14, 1, zziggVar3);
        zzifc zzifcVar16 = new zzifc("SINT32", 15, 15, 1, zziggVar4);
        zzifc zzifcVar17 = new zzifc("SINT64", 16, 16, 1, zziggVar3);
        zzifc zzifcVar18 = new zzifc("GROUP", 17, 17, 1, zziggVar7);
        zzifc zzifcVar19 = new zzifc("DOUBLE_LIST", 18, 18, 2, zziggVar);
        zzifc zzifcVar20 = new zzifc("FLOAT_LIST", 19, 19, 2, zziggVar2);
        zzifc zzifcVar21 = new zzifc("INT64_LIST", 20, 20, 2, zziggVar3);
        zzifc zzifcVar22 = new zzifc("UINT64_LIST", 21, 21, 2, zziggVar3);
        zzifc zzifcVar23 = new zzifc("INT32_LIST", 22, 22, 2, zziggVar4);
        zzifc zzifcVar24 = new zzifc("FIXED64_LIST", 23, 23, 2, zziggVar3);
        zzifc zzifcVar25 = new zzifc("FIXED32_LIST", 24, 24, 2, zziggVar4);
        zzifc zzifcVar26 = new zzifc("BOOL_LIST", 25, 25, 2, zziggVar5);
        zzifc zzifcVar27 = new zzifc("STRING_LIST", 26, 26, 2, zziggVar6);
        zzifc zzifcVar28 = new zzifc("MESSAGE_LIST", 27, 27, 2, zziggVar7);
        zzifc zzifcVar29 = new zzifc("BYTES_LIST", 28, 28, 2, zziggVar8);
        zzifc zzifcVar30 = new zzifc("UINT32_LIST", 29, 29, 2, zziggVar4);
        zzifc zzifcVar31 = new zzifc("ENUM_LIST", 30, 30, 2, zziggVar9);
        zzifc zzifcVar32 = new zzifc("SFIXED32_LIST", 31, 31, 2, zziggVar4);
        zzifc zzifcVar33 = new zzifc("SFIXED64_LIST", 32, 32, 2, zziggVar3);
        zzifc zzifcVar34 = new zzifc("SINT32_LIST", 33, 33, 2, zziggVar4);
        zzifc zzifcVar35 = new zzifc("SINT64_LIST", 34, 34, 2, zziggVar3);
        zzifc zzifcVar36 = new zzifc("DOUBLE_LIST_PACKED", 35, 35, 3, zziggVar);
        b = zzifcVar36;
        zzifc zzifcVar37 = new zzifc("FLOAT_LIST_PACKED", 36, 36, 3, zziggVar2);
        zzifc zzifcVar38 = new zzifc("INT64_LIST_PACKED", 37, 37, 3, zziggVar3);
        zzifc zzifcVar39 = new zzifc("UINT64_LIST_PACKED", 38, 38, 3, zziggVar3);
        zzifc zzifcVar40 = new zzifc("INT32_LIST_PACKED", 39, 39, 3, zziggVar4);
        zzifc zzifcVar41 = new zzifc("FIXED64_LIST_PACKED", 40, 40, 3, zziggVar3);
        zzifc zzifcVar42 = new zzifc("FIXED32_LIST_PACKED", 41, 41, 3, zziggVar4);
        zzifc zzifcVar43 = new zzifc("BOOL_LIST_PACKED", 42, 42, 3, zziggVar5);
        zzifc zzifcVar44 = new zzifc("UINT32_LIST_PACKED", 43, 43, 3, zziggVar4);
        zzifc zzifcVar45 = new zzifc("ENUM_LIST_PACKED", 44, 44, 3, zziggVar9);
        zzifc zzifcVar46 = new zzifc("SFIXED32_LIST_PACKED", 45, 45, 3, zziggVar4);
        zzifc zzifcVar47 = new zzifc("SFIXED64_LIST_PACKED", 46, 46, 3, zziggVar3);
        zzifc zzifcVar48 = new zzifc("SINT32_LIST_PACKED", 47, 47, 3, zziggVar4);
        zzifc zzifcVar49 = new zzifc("SINT64_LIST_PACKED", 48, 48, 3, zziggVar3);
        c = zzifcVar49;
        e = new zzifc[]{zzifcVar, zzifcVar2, zzifcVar3, zzifcVar4, zzifcVar5, zzifcVar6, zzifcVar7, zzifcVar8, zzifcVar9, zzifcVar10, zzifcVar11, zzifcVar12, zzifcVar13, zzifcVar14, zzifcVar15, zzifcVar16, zzifcVar17, zzifcVar18, zzifcVar19, zzifcVar20, zzifcVar21, zzifcVar22, zzifcVar23, zzifcVar24, zzifcVar25, zzifcVar26, zzifcVar27, zzifcVar28, zzifcVar29, zzifcVar30, zzifcVar31, zzifcVar32, zzifcVar33, zzifcVar34, zzifcVar35, zzifcVar36, zzifcVar37, zzifcVar38, zzifcVar39, zzifcVar40, zzifcVar41, zzifcVar42, zzifcVar43, zzifcVar44, zzifcVar45, zzifcVar46, zzifcVar47, zzifcVar48, zzifcVar49, new zzifc("GROUP_LIST", 49, 49, 2, zziggVar7), new zzifc("MAP", 50, 50, 4, zzigg.b)};
        zzifc[] values = values();
        d = new zzifc[values.length];
        for (zzifc zzifcVar50 : values) {
            d[zzifcVar50.a] = zzifcVar50;
        }
    }

    public zzifc(String str, int i, int i2, int i3, zzigg zziggVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = zziggVar.a;
        } else if (i4 == 3) {
            Class cls2 = zziggVar.a;
        }
        if (i3 == 1) {
            zzigg zziggVar2 = zzigg.b;
            zziggVar.ordinal();
        }
    }

    public static zzifc[] values() {
        return (zzifc[]) e.clone();
    }
}
