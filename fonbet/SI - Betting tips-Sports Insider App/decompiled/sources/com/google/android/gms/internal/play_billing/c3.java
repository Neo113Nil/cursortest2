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
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: b, reason: collision with root package name */
    public static final c3 f5411b;

    /* renamed from: c, reason: collision with root package name */
    public static final c3 f5412c;

    /* renamed from: d, reason: collision with root package name */
    public static final c3[] f5413d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c3[] f5414e;

    /* renamed from: a, reason: collision with root package name */
    public final int f5415a;

    /* JADX INFO: Fake field, exist only in values array */
    c3 EF0;

    static {
        o3 o3Var = o3.f5539e;
        c3 c3Var = new c3("DOUBLE", 0, 0, 1, o3Var);
        o3 o3Var2 = o3.f5538d;
        c3 c3Var2 = new c3("FLOAT", 1, 1, 1, o3Var2);
        o3 o3Var3 = o3.f5537c;
        c3 c3Var3 = new c3("INT64", 2, 2, 1, o3Var3);
        c3 c3Var4 = new c3("UINT64", 3, 3, 1, o3Var3);
        o3 o3Var4 = o3.f5536b;
        c3 c3Var5 = new c3("INT32", 4, 4, 1, o3Var4);
        c3 c3Var6 = new c3("FIXED64", 5, 5, 1, o3Var3);
        c3 c3Var7 = new c3("FIXED32", 6, 6, 1, o3Var4);
        o3 o3Var5 = o3.f5540f;
        c3 c3Var8 = new c3("BOOL", 7, 7, 1, o3Var5);
        o3 o3Var6 = o3.f5541g;
        c3 c3Var9 = new c3("STRING", 8, 8, 1, o3Var6);
        o3 o3Var7 = o3.j;
        c3 c3Var10 = new c3("MESSAGE", 9, 9, 1, o3Var7);
        o3 o3Var8 = o3.f5542h;
        c3 c3Var11 = new c3("BYTES", 10, 10, 1, o3Var8);
        c3 c3Var12 = new c3("UINT32", 11, 11, 1, o3Var4);
        o3 o3Var9 = o3.f5543i;
        c3 c3Var13 = new c3("ENUM", 12, 12, 1, o3Var9);
        c3 c3Var14 = new c3("SFIXED32", 13, 13, 1, o3Var4);
        c3 c3Var15 = new c3("SFIXED64", 14, 14, 1, o3Var3);
        c3 c3Var16 = new c3("SINT32", 15, 15, 1, o3Var4);
        c3 c3Var17 = new c3("SINT64", 16, 16, 1, o3Var3);
        c3 c3Var18 = new c3("GROUP", 17, 17, 1, o3Var7);
        c3 c3Var19 = new c3("DOUBLE_LIST", 18, 18, 2, o3Var);
        c3 c3Var20 = new c3("FLOAT_LIST", 19, 19, 2, o3Var2);
        c3 c3Var21 = new c3("INT64_LIST", 20, 20, 2, o3Var3);
        c3 c3Var22 = new c3("UINT64_LIST", 21, 21, 2, o3Var3);
        c3 c3Var23 = new c3("INT32_LIST", 22, 22, 2, o3Var4);
        c3 c3Var24 = new c3("FIXED64_LIST", 23, 23, 2, o3Var3);
        c3 c3Var25 = new c3("FIXED32_LIST", 24, 24, 2, o3Var4);
        c3 c3Var26 = new c3("BOOL_LIST", 25, 25, 2, o3Var5);
        c3 c3Var27 = new c3("STRING_LIST", 26, 26, 2, o3Var6);
        c3 c3Var28 = new c3("MESSAGE_LIST", 27, 27, 2, o3Var7);
        c3 c3Var29 = new c3("BYTES_LIST", 28, 28, 2, o3Var8);
        c3 c3Var30 = new c3("UINT32_LIST", 29, 29, 2, o3Var4);
        c3 c3Var31 = new c3("ENUM_LIST", 30, 30, 2, o3Var9);
        c3 c3Var32 = new c3("SFIXED32_LIST", 31, 31, 2, o3Var4);
        c3 c3Var33 = new c3("SFIXED64_LIST", 32, 32, 2, o3Var3);
        c3 c3Var34 = new c3("SINT32_LIST", 33, 33, 2, o3Var4);
        c3 c3Var35 = new c3("SINT64_LIST", 34, 34, 2, o3Var3);
        c3 c3Var36 = new c3("DOUBLE_LIST_PACKED", 35, 35, 3, o3Var);
        f5411b = c3Var36;
        c3 c3Var37 = new c3("FLOAT_LIST_PACKED", 36, 36, 3, o3Var2);
        c3 c3Var38 = new c3("INT64_LIST_PACKED", 37, 37, 3, o3Var3);
        c3 c3Var39 = new c3("UINT64_LIST_PACKED", 38, 38, 3, o3Var3);
        c3 c3Var40 = new c3("INT32_LIST_PACKED", 39, 39, 3, o3Var4);
        c3 c3Var41 = new c3("FIXED64_LIST_PACKED", 40, 40, 3, o3Var3);
        c3 c3Var42 = new c3("FIXED32_LIST_PACKED", 41, 41, 3, o3Var4);
        c3 c3Var43 = new c3("BOOL_LIST_PACKED", 42, 42, 3, o3Var5);
        c3 c3Var44 = new c3("UINT32_LIST_PACKED", 43, 43, 3, o3Var4);
        c3 c3Var45 = new c3("ENUM_LIST_PACKED", 44, 44, 3, o3Var9);
        c3 c3Var46 = new c3("SFIXED32_LIST_PACKED", 45, 45, 3, o3Var4);
        c3 c3Var47 = new c3("SFIXED64_LIST_PACKED", 46, 46, 3, o3Var3);
        c3 c3Var48 = new c3("SINT32_LIST_PACKED", 47, 47, 3, o3Var4);
        c3 c3Var49 = new c3("SINT64_LIST_PACKED", 48, 48, 3, o3Var3);
        f5412c = c3Var49;
        f5414e = new c3[]{c3Var, c3Var2, c3Var3, c3Var4, c3Var5, c3Var6, c3Var7, c3Var8, c3Var9, c3Var10, c3Var11, c3Var12, c3Var13, c3Var14, c3Var15, c3Var16, c3Var17, c3Var18, c3Var19, c3Var20, c3Var21, c3Var22, c3Var23, c3Var24, c3Var25, c3Var26, c3Var27, c3Var28, c3Var29, c3Var30, c3Var31, c3Var32, c3Var33, c3Var34, c3Var35, c3Var36, c3Var37, c3Var38, c3Var39, c3Var40, c3Var41, c3Var42, c3Var43, c3Var44, c3Var45, c3Var46, c3Var47, c3Var48, c3Var49, new c3("GROUP_LIST", 49, 49, 2, o3Var7), new c3("MAP", 50, 50, 4, o3.f5535a)};
        c3[] values = values();
        f5413d = new c3[values.length];
        for (c3 c3Var50 : values) {
            f5413d[c3Var50.f5415a] = c3Var50;
        }
    }

    public c3(String str, int i5, int i10, int i11, o3 o3Var) {
        this.f5415a = i10;
        int i12 = i11 - 1;
        if (i12 == 1) {
            o3Var.getClass();
        } else if (i12 == 3) {
            o3Var.getClass();
        }
        if (i11 == 1) {
            o3 o3Var2 = o3.f5535a;
            o3Var.ordinal();
        }
    }

    public static c3[] values() {
        return (c3[]) f5414e.clone();
    }
}
