package com.logrocket.protobuf;

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
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f6804b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f6805c;

    /* renamed from: d, reason: collision with root package name */
    public static final v[] f6806d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f6807e;

    /* renamed from: a, reason: collision with root package name */
    public final int f6808a;

    /* JADX INFO: Fake field, exist only in values array */
    v EF0;

    static {
        g0 g0Var = g0.f6709e;
        v vVar = new v("DOUBLE", 0, 0, 1, g0Var);
        g0 g0Var2 = g0.f6708d;
        v vVar2 = new v("FLOAT", 1, 1, 1, g0Var2);
        g0 g0Var3 = g0.f6707c;
        v vVar3 = new v("INT64", 2, 2, 1, g0Var3);
        v vVar4 = new v("UINT64", 3, 3, 1, g0Var3);
        g0 g0Var4 = g0.f6706b;
        v vVar5 = new v("INT32", 4, 4, 1, g0Var4);
        v vVar6 = new v("FIXED64", 5, 5, 1, g0Var3);
        v vVar7 = new v("FIXED32", 6, 6, 1, g0Var4);
        g0 g0Var5 = g0.f6710f;
        v vVar8 = new v("BOOL", 7, 7, 1, g0Var5);
        g0 g0Var6 = g0.f6711g;
        v vVar9 = new v("STRING", 8, 8, 1, g0Var6);
        g0 g0Var7 = g0.j;
        v vVar10 = new v("MESSAGE", 9, 9, 1, g0Var7);
        g0 g0Var8 = g0.f6712h;
        v vVar11 = new v("BYTES", 10, 10, 1, g0Var8);
        v vVar12 = new v("UINT32", 11, 11, 1, g0Var4);
        g0 g0Var9 = g0.f6713i;
        v vVar13 = new v("ENUM", 12, 12, 1, g0Var9);
        v vVar14 = new v("SFIXED32", 13, 13, 1, g0Var4);
        v vVar15 = new v("SFIXED64", 14, 14, 1, g0Var3);
        v vVar16 = new v("SINT32", 15, 15, 1, g0Var4);
        v vVar17 = new v("SINT64", 16, 16, 1, g0Var3);
        v vVar18 = new v("GROUP", 17, 17, 1, g0Var7);
        v vVar19 = new v("DOUBLE_LIST", 18, 18, 2, g0Var);
        v vVar20 = new v("FLOAT_LIST", 19, 19, 2, g0Var2);
        v vVar21 = new v("INT64_LIST", 20, 20, 2, g0Var3);
        v vVar22 = new v("UINT64_LIST", 21, 21, 2, g0Var3);
        v vVar23 = new v("INT32_LIST", 22, 22, 2, g0Var4);
        v vVar24 = new v("FIXED64_LIST", 23, 23, 2, g0Var3);
        v vVar25 = new v("FIXED32_LIST", 24, 24, 2, g0Var4);
        v vVar26 = new v("BOOL_LIST", 25, 25, 2, g0Var5);
        v vVar27 = new v("STRING_LIST", 26, 26, 2, g0Var6);
        v vVar28 = new v("MESSAGE_LIST", 27, 27, 2, g0Var7);
        v vVar29 = new v("BYTES_LIST", 28, 28, 2, g0Var8);
        v vVar30 = new v("UINT32_LIST", 29, 29, 2, g0Var4);
        v vVar31 = new v("ENUM_LIST", 30, 30, 2, g0Var9);
        v vVar32 = new v("SFIXED32_LIST", 31, 31, 2, g0Var4);
        v vVar33 = new v("SFIXED64_LIST", 32, 32, 2, g0Var3);
        v vVar34 = new v("SINT32_LIST", 33, 33, 2, g0Var4);
        v vVar35 = new v("SINT64_LIST", 34, 34, 2, g0Var3);
        v vVar36 = new v("DOUBLE_LIST_PACKED", 35, 35, 3, g0Var);
        f6804b = vVar36;
        v vVar37 = new v("FLOAT_LIST_PACKED", 36, 36, 3, g0Var2);
        v vVar38 = new v("INT64_LIST_PACKED", 37, 37, 3, g0Var3);
        v vVar39 = new v("UINT64_LIST_PACKED", 38, 38, 3, g0Var3);
        v vVar40 = new v("INT32_LIST_PACKED", 39, 39, 3, g0Var4);
        v vVar41 = new v("FIXED64_LIST_PACKED", 40, 40, 3, g0Var3);
        v vVar42 = new v("FIXED32_LIST_PACKED", 41, 41, 3, g0Var4);
        v vVar43 = new v("BOOL_LIST_PACKED", 42, 42, 3, g0Var5);
        v vVar44 = new v("UINT32_LIST_PACKED", 43, 43, 3, g0Var4);
        v vVar45 = new v("ENUM_LIST_PACKED", 44, 44, 3, g0Var9);
        v vVar46 = new v("SFIXED32_LIST_PACKED", 45, 45, 3, g0Var4);
        v vVar47 = new v("SFIXED64_LIST_PACKED", 46, 46, 3, g0Var3);
        v vVar48 = new v("SINT32_LIST_PACKED", 47, 47, 3, g0Var4);
        v vVar49 = new v("SINT64_LIST_PACKED", 48, 48, 3, g0Var3);
        f6805c = vVar49;
        f6807e = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, vVar26, vVar27, vVar28, vVar29, vVar30, vVar31, vVar32, vVar33, vVar34, vVar35, vVar36, vVar37, vVar38, vVar39, vVar40, vVar41, vVar42, vVar43, vVar44, vVar45, vVar46, vVar47, vVar48, vVar49, new v("GROUP_LIST", 49, 49, 2, g0Var7), new v("MAP", 50, 50, 4, g0.f6705a)};
        v[] values = values();
        f6806d = new v[values.length];
        for (v vVar50 : values) {
            f6806d[vVar50.f6808a] = vVar50;
        }
    }

    public v(String str, int i5, int i10, int i11, g0 g0Var) {
        this.f6808a = i10;
        int d10 = v.f.d(i11);
        if (d10 == 1) {
            g0Var.getClass();
        } else if (d10 == 3) {
            g0Var.getClass();
        }
        if (i11 == 1) {
            g0Var.ordinal();
        }
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f6807e.clone();
    }
}
