package defpackage;

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
/* loaded from: classes2.dex */
public final class k9n {
    public static final k9n b;
    public static final k9n c;
    public static final k9n[] d;
    public static final /* synthetic */ k9n[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    k9n EF0;

    static {
        nan nanVar = nan.f;
        k9n k9nVar = new k9n("DOUBLE", 0, 0, 1, nanVar);
        nan nanVar2 = nan.e;
        k9n k9nVar2 = new k9n("FLOAT", 1, 1, 1, nanVar2);
        nan nanVar3 = nan.d;
        k9n k9nVar3 = new k9n("INT64", 2, 2, 1, nanVar3);
        k9n k9nVar4 = new k9n("UINT64", 3, 3, 1, nanVar3);
        nan nanVar4 = nan.c;
        k9n k9nVar5 = new k9n("INT32", 4, 4, 1, nanVar4);
        k9n k9nVar6 = new k9n("FIXED64", 5, 5, 1, nanVar3);
        k9n k9nVar7 = new k9n("FIXED32", 6, 6, 1, nanVar4);
        nan nanVar5 = nan.g;
        k9n k9nVar8 = new k9n("BOOL", 7, 7, 1, nanVar5);
        nan nanVar6 = nan.h;
        k9n k9nVar9 = new k9n("STRING", 8, 8, 1, nanVar6);
        nan nanVar7 = nan.k;
        k9n k9nVar10 = new k9n("MESSAGE", 9, 9, 1, nanVar7);
        nan nanVar8 = nan.i;
        k9n k9nVar11 = new k9n("BYTES", 10, 10, 1, nanVar8);
        k9n k9nVar12 = new k9n("UINT32", 11, 11, 1, nanVar4);
        nan nanVar9 = nan.j;
        k9n k9nVar13 = new k9n("ENUM", 12, 12, 1, nanVar9);
        k9n k9nVar14 = new k9n("SFIXED32", 13, 13, 1, nanVar4);
        k9n k9nVar15 = new k9n("SFIXED64", 14, 14, 1, nanVar3);
        k9n k9nVar16 = new k9n("SINT32", 15, 15, 1, nanVar4);
        k9n k9nVar17 = new k9n("SINT64", 16, 16, 1, nanVar3);
        k9n k9nVar18 = new k9n("GROUP", 17, 17, 1, nanVar7);
        k9n k9nVar19 = new k9n("DOUBLE_LIST", 18, 18, 2, nanVar);
        k9n k9nVar20 = new k9n("FLOAT_LIST", 19, 19, 2, nanVar2);
        k9n k9nVar21 = new k9n("INT64_LIST", 20, 20, 2, nanVar3);
        k9n k9nVar22 = new k9n("UINT64_LIST", 21, 21, 2, nanVar3);
        k9n k9nVar23 = new k9n("INT32_LIST", 22, 22, 2, nanVar4);
        k9n k9nVar24 = new k9n("FIXED64_LIST", 23, 23, 2, nanVar3);
        k9n k9nVar25 = new k9n("FIXED32_LIST", 24, 24, 2, nanVar4);
        k9n k9nVar26 = new k9n("BOOL_LIST", 25, 25, 2, nanVar5);
        k9n k9nVar27 = new k9n("STRING_LIST", 26, 26, 2, nanVar6);
        k9n k9nVar28 = new k9n("MESSAGE_LIST", 27, 27, 2, nanVar7);
        k9n k9nVar29 = new k9n("BYTES_LIST", 28, 28, 2, nanVar8);
        k9n k9nVar30 = new k9n("UINT32_LIST", 29, 29, 2, nanVar4);
        k9n k9nVar31 = new k9n("ENUM_LIST", 30, 30, 2, nanVar9);
        k9n k9nVar32 = new k9n("SFIXED32_LIST", 31, 31, 2, nanVar4);
        k9n k9nVar33 = new k9n("SFIXED64_LIST", 32, 32, 2, nanVar3);
        k9n k9nVar34 = new k9n("SINT32_LIST", 33, 33, 2, nanVar4);
        k9n k9nVar35 = new k9n("SINT64_LIST", 34, 34, 2, nanVar3);
        k9n k9nVar36 = new k9n("DOUBLE_LIST_PACKED", 35, 35, 3, nanVar);
        b = k9nVar36;
        k9n k9nVar37 = new k9n("FLOAT_LIST_PACKED", 36, 36, 3, nanVar2);
        k9n k9nVar38 = new k9n("INT64_LIST_PACKED", 37, 37, 3, nanVar3);
        k9n k9nVar39 = new k9n("UINT64_LIST_PACKED", 38, 38, 3, nanVar3);
        k9n k9nVar40 = new k9n("INT32_LIST_PACKED", 39, 39, 3, nanVar4);
        k9n k9nVar41 = new k9n("FIXED64_LIST_PACKED", 40, 40, 3, nanVar3);
        k9n k9nVar42 = new k9n("FIXED32_LIST_PACKED", 41, 41, 3, nanVar4);
        k9n k9nVar43 = new k9n("BOOL_LIST_PACKED", 42, 42, 3, nanVar5);
        k9n k9nVar44 = new k9n("UINT32_LIST_PACKED", 43, 43, 3, nanVar4);
        k9n k9nVar45 = new k9n("ENUM_LIST_PACKED", 44, 44, 3, nanVar9);
        k9n k9nVar46 = new k9n("SFIXED32_LIST_PACKED", 45, 45, 3, nanVar4);
        k9n k9nVar47 = new k9n("SFIXED64_LIST_PACKED", 46, 46, 3, nanVar3);
        k9n k9nVar48 = new k9n("SINT32_LIST_PACKED", 47, 47, 3, nanVar4);
        k9n k9nVar49 = new k9n("SINT64_LIST_PACKED", 48, 48, 3, nanVar3);
        c = k9nVar49;
        e = new k9n[]{k9nVar, k9nVar2, k9nVar3, k9nVar4, k9nVar5, k9nVar6, k9nVar7, k9nVar8, k9nVar9, k9nVar10, k9nVar11, k9nVar12, k9nVar13, k9nVar14, k9nVar15, k9nVar16, k9nVar17, k9nVar18, k9nVar19, k9nVar20, k9nVar21, k9nVar22, k9nVar23, k9nVar24, k9nVar25, k9nVar26, k9nVar27, k9nVar28, k9nVar29, k9nVar30, k9nVar31, k9nVar32, k9nVar33, k9nVar34, k9nVar35, k9nVar36, k9nVar37, k9nVar38, k9nVar39, k9nVar40, k9nVar41, k9nVar42, k9nVar43, k9nVar44, k9nVar45, k9nVar46, k9nVar47, k9nVar48, k9nVar49, new k9n("GROUP_LIST", 49, 49, 2, nanVar7), new k9n("MAP", 50, 50, 4, nan.b)};
        k9n[] values = values();
        d = new k9n[values.length];
        for (k9n k9nVar50 : values) {
            d[k9nVar50.a] = k9nVar50;
        }
    }

    public k9n(String str, int i, int i2, int i3, nan nanVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1) {
            Class cls = nanVar.a;
        } else if (i4 == 3) {
            Class cls2 = nanVar.a;
        }
        if (i3 == 1) {
            nan nanVar2 = nan.b;
            nanVar.ordinal();
        }
    }

    public static k9n[] values() {
        return (k9n[]) e.clone();
    }
}
