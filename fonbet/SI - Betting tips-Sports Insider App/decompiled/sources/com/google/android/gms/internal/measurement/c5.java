package com.google.android.gms.internal.measurement;

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
public final class c5 {

    /* renamed from: b, reason: collision with root package name */
    public static final c5 f4948b;

    /* renamed from: c, reason: collision with root package name */
    public static final c5 f4949c;

    /* renamed from: d, reason: collision with root package name */
    public static final c5[] f4950d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c5[] f4951e;

    /* renamed from: a, reason: collision with root package name */
    public final int f4952a;

    /* JADX INFO: Fake field, exist only in values array */
    c5 EF0;

    static {
        q5 q5Var = q5.f5191e;
        c5 c5Var = new c5("DOUBLE", 0, 0, 1, q5Var);
        q5 q5Var2 = q5.f5190d;
        c5 c5Var2 = new c5("FLOAT", 1, 1, 1, q5Var2);
        q5 q5Var3 = q5.f5189c;
        c5 c5Var3 = new c5("INT64", 2, 2, 1, q5Var3);
        c5 c5Var4 = new c5("UINT64", 3, 3, 1, q5Var3);
        q5 q5Var4 = q5.f5188b;
        c5 c5Var5 = new c5("INT32", 4, 4, 1, q5Var4);
        c5 c5Var6 = new c5("FIXED64", 5, 5, 1, q5Var3);
        c5 c5Var7 = new c5("FIXED32", 6, 6, 1, q5Var4);
        q5 q5Var5 = q5.f5192f;
        c5 c5Var8 = new c5("BOOL", 7, 7, 1, q5Var5);
        q5 q5Var6 = q5.f5193g;
        c5 c5Var9 = new c5("STRING", 8, 8, 1, q5Var6);
        q5 q5Var7 = q5.j;
        c5 c5Var10 = new c5("MESSAGE", 9, 9, 1, q5Var7);
        q5 q5Var8 = q5.f5194h;
        c5 c5Var11 = new c5("BYTES", 10, 10, 1, q5Var8);
        c5 c5Var12 = new c5("UINT32", 11, 11, 1, q5Var4);
        q5 q5Var9 = q5.f5195i;
        c5 c5Var13 = new c5("ENUM", 12, 12, 1, q5Var9);
        c5 c5Var14 = new c5("SFIXED32", 13, 13, 1, q5Var4);
        c5 c5Var15 = new c5("SFIXED64", 14, 14, 1, q5Var3);
        c5 c5Var16 = new c5("SINT32", 15, 15, 1, q5Var4);
        c5 c5Var17 = new c5("SINT64", 16, 16, 1, q5Var3);
        c5 c5Var18 = new c5("GROUP", 17, 17, 1, q5Var7);
        c5 c5Var19 = new c5("DOUBLE_LIST", 18, 18, 2, q5Var);
        c5 c5Var20 = new c5("FLOAT_LIST", 19, 19, 2, q5Var2);
        c5 c5Var21 = new c5("INT64_LIST", 20, 20, 2, q5Var3);
        c5 c5Var22 = new c5("UINT64_LIST", 21, 21, 2, q5Var3);
        c5 c5Var23 = new c5("INT32_LIST", 22, 22, 2, q5Var4);
        c5 c5Var24 = new c5("FIXED64_LIST", 23, 23, 2, q5Var3);
        c5 c5Var25 = new c5("FIXED32_LIST", 24, 24, 2, q5Var4);
        c5 c5Var26 = new c5("BOOL_LIST", 25, 25, 2, q5Var5);
        c5 c5Var27 = new c5("STRING_LIST", 26, 26, 2, q5Var6);
        c5 c5Var28 = new c5("MESSAGE_LIST", 27, 27, 2, q5Var7);
        c5 c5Var29 = new c5("BYTES_LIST", 28, 28, 2, q5Var8);
        c5 c5Var30 = new c5("UINT32_LIST", 29, 29, 2, q5Var4);
        c5 c5Var31 = new c5("ENUM_LIST", 30, 30, 2, q5Var9);
        c5 c5Var32 = new c5("SFIXED32_LIST", 31, 31, 2, q5Var4);
        c5 c5Var33 = new c5("SFIXED64_LIST", 32, 32, 2, q5Var3);
        c5 c5Var34 = new c5("SINT32_LIST", 33, 33, 2, q5Var4);
        c5 c5Var35 = new c5("SINT64_LIST", 34, 34, 2, q5Var3);
        c5 c5Var36 = new c5("DOUBLE_LIST_PACKED", 35, 35, 3, q5Var);
        f4948b = c5Var36;
        c5 c5Var37 = new c5("FLOAT_LIST_PACKED", 36, 36, 3, q5Var2);
        c5 c5Var38 = new c5("INT64_LIST_PACKED", 37, 37, 3, q5Var3);
        c5 c5Var39 = new c5("UINT64_LIST_PACKED", 38, 38, 3, q5Var3);
        c5 c5Var40 = new c5("INT32_LIST_PACKED", 39, 39, 3, q5Var4);
        c5 c5Var41 = new c5("FIXED64_LIST_PACKED", 40, 40, 3, q5Var3);
        c5 c5Var42 = new c5("FIXED32_LIST_PACKED", 41, 41, 3, q5Var4);
        c5 c5Var43 = new c5("BOOL_LIST_PACKED", 42, 42, 3, q5Var5);
        c5 c5Var44 = new c5("UINT32_LIST_PACKED", 43, 43, 3, q5Var4);
        c5 c5Var45 = new c5("ENUM_LIST_PACKED", 44, 44, 3, q5Var9);
        c5 c5Var46 = new c5("SFIXED32_LIST_PACKED", 45, 45, 3, q5Var4);
        c5 c5Var47 = new c5("SFIXED64_LIST_PACKED", 46, 46, 3, q5Var3);
        c5 c5Var48 = new c5("SINT32_LIST_PACKED", 47, 47, 3, q5Var4);
        c5 c5Var49 = new c5("SINT64_LIST_PACKED", 48, 48, 3, q5Var3);
        f4949c = c5Var49;
        f4951e = new c5[]{c5Var, c5Var2, c5Var3, c5Var4, c5Var5, c5Var6, c5Var7, c5Var8, c5Var9, c5Var10, c5Var11, c5Var12, c5Var13, c5Var14, c5Var15, c5Var16, c5Var17, c5Var18, c5Var19, c5Var20, c5Var21, c5Var22, c5Var23, c5Var24, c5Var25, c5Var26, c5Var27, c5Var28, c5Var29, c5Var30, c5Var31, c5Var32, c5Var33, c5Var34, c5Var35, c5Var36, c5Var37, c5Var38, c5Var39, c5Var40, c5Var41, c5Var42, c5Var43, c5Var44, c5Var45, c5Var46, c5Var47, c5Var48, c5Var49, new c5("GROUP_LIST", 49, 49, 2, q5Var7), new c5("MAP", 50, 50, 4, q5.f5187a)};
        c5[] values = values();
        f4950d = new c5[values.length];
        for (c5 c5Var50 : values) {
            f4950d[c5Var50.f4952a] = c5Var50;
        }
    }

    public c5(String str, int i5, int i10, int i11, q5 q5Var) {
        this.f4952a = i10;
        int i12 = i11 - 1;
        if (i12 == 1) {
            q5Var.getClass();
        } else if (i12 == 3) {
            q5Var.getClass();
        }
        if (i11 == 1) {
            q5 q5Var2 = q5.f5187a;
            q5Var.ordinal();
        }
    }

    public static c5[] values() {
        return (c5[]) f4951e.clone();
    }
}
