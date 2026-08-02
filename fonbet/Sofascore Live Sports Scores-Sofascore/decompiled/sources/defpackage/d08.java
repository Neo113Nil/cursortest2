package defpackage;

import java.lang.reflect.Type;

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
/* loaded from: classes.dex */
public final class d08 {
    public static final d08 b;
    public static final d08 c;
    public static final d08[] d;
    public static final Type[] e;
    public static final /* synthetic */ d08[] f;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    d08 EF0;

    static {
        oda odaVar = oda.DOUBLE;
        d08 d08Var = new d08("DOUBLE", 0, 0, 1, odaVar);
        oda odaVar2 = oda.FLOAT;
        d08 d08Var2 = new d08("FLOAT", 1, 1, 1, odaVar2);
        oda odaVar3 = oda.LONG;
        d08 d08Var3 = new d08("INT64", 2, 2, 1, odaVar3);
        d08 d08Var4 = new d08("UINT64", 3, 3, 1, odaVar3);
        oda odaVar4 = oda.INT;
        d08 d08Var5 = new d08("INT32", 4, 4, 1, odaVar4);
        d08 d08Var6 = new d08("FIXED64", 5, 5, 1, odaVar3);
        d08 d08Var7 = new d08("FIXED32", 6, 6, 1, odaVar4);
        oda odaVar5 = oda.BOOLEAN;
        d08 d08Var8 = new d08("BOOL", 7, 7, 1, odaVar5);
        oda odaVar6 = oda.STRING;
        d08 d08Var9 = new d08("STRING", 8, 8, 1, odaVar6);
        oda odaVar7 = oda.MESSAGE;
        d08 d08Var10 = new d08("MESSAGE", 9, 9, 1, odaVar7);
        oda odaVar8 = oda.BYTE_STRING;
        d08 d08Var11 = new d08("BYTES", 10, 10, 1, odaVar8);
        d08 d08Var12 = new d08("UINT32", 11, 11, 1, odaVar4);
        oda odaVar9 = oda.ENUM;
        d08 d08Var13 = new d08("ENUM", 12, 12, 1, odaVar9);
        d08 d08Var14 = new d08("SFIXED32", 13, 13, 1, odaVar4);
        d08 d08Var15 = new d08("SFIXED64", 14, 14, 1, odaVar3);
        d08 d08Var16 = new d08("SINT32", 15, 15, 1, odaVar4);
        d08 d08Var17 = new d08("SINT64", 16, 16, 1, odaVar3);
        d08 d08Var18 = new d08("GROUP", 17, 17, 1, odaVar7);
        d08 d08Var19 = new d08("DOUBLE_LIST", 18, 18, 2, odaVar);
        d08 d08Var20 = new d08("FLOAT_LIST", 19, 19, 2, odaVar2);
        d08 d08Var21 = new d08("INT64_LIST", 20, 20, 2, odaVar3);
        d08 d08Var22 = new d08("UINT64_LIST", 21, 21, 2, odaVar3);
        d08 d08Var23 = new d08("INT32_LIST", 22, 22, 2, odaVar4);
        d08 d08Var24 = new d08("FIXED64_LIST", 23, 23, 2, odaVar3);
        d08 d08Var25 = new d08("FIXED32_LIST", 24, 24, 2, odaVar4);
        d08 d08Var26 = new d08("BOOL_LIST", 25, 25, 2, odaVar5);
        d08 d08Var27 = new d08("STRING_LIST", 26, 26, 2, odaVar6);
        d08 d08Var28 = new d08("MESSAGE_LIST", 27, 27, 2, odaVar7);
        d08 d08Var29 = new d08("BYTES_LIST", 28, 28, 2, odaVar8);
        d08 d08Var30 = new d08("UINT32_LIST", 29, 29, 2, odaVar4);
        d08 d08Var31 = new d08("ENUM_LIST", 30, 30, 2, odaVar9);
        d08 d08Var32 = new d08("SFIXED32_LIST", 31, 31, 2, odaVar4);
        d08 d08Var33 = new d08("SFIXED64_LIST", 32, 32, 2, odaVar3);
        d08 d08Var34 = new d08("SINT32_LIST", 33, 33, 2, odaVar4);
        d08 d08Var35 = new d08("SINT64_LIST", 34, 34, 2, odaVar3);
        d08 d08Var36 = new d08("DOUBLE_LIST_PACKED", 35, 35, 3, odaVar);
        b = d08Var36;
        d08 d08Var37 = new d08("FLOAT_LIST_PACKED", 36, 36, 3, odaVar2);
        d08 d08Var38 = new d08("INT64_LIST_PACKED", 37, 37, 3, odaVar3);
        d08 d08Var39 = new d08("UINT64_LIST_PACKED", 38, 38, 3, odaVar3);
        d08 d08Var40 = new d08("INT32_LIST_PACKED", 39, 39, 3, odaVar4);
        d08 d08Var41 = new d08("FIXED64_LIST_PACKED", 40, 40, 3, odaVar3);
        d08 d08Var42 = new d08("FIXED32_LIST_PACKED", 41, 41, 3, odaVar4);
        d08 d08Var43 = new d08("BOOL_LIST_PACKED", 42, 42, 3, odaVar5);
        d08 d08Var44 = new d08("UINT32_LIST_PACKED", 43, 43, 3, odaVar4);
        d08 d08Var45 = new d08("ENUM_LIST_PACKED", 44, 44, 3, odaVar9);
        d08 d08Var46 = new d08("SFIXED32_LIST_PACKED", 45, 45, 3, odaVar4);
        d08 d08Var47 = new d08("SFIXED64_LIST_PACKED", 46, 46, 3, odaVar3);
        d08 d08Var48 = new d08("SINT32_LIST_PACKED", 47, 47, 3, odaVar4);
        d08 d08Var49 = new d08("SINT64_LIST_PACKED", 48, 48, 3, odaVar3);
        c = d08Var49;
        f = new d08[]{d08Var, d08Var2, d08Var3, d08Var4, d08Var5, d08Var6, d08Var7, d08Var8, d08Var9, d08Var10, d08Var11, d08Var12, d08Var13, d08Var14, d08Var15, d08Var16, d08Var17, d08Var18, d08Var19, d08Var20, d08Var21, d08Var22, d08Var23, d08Var24, d08Var25, d08Var26, d08Var27, d08Var28, d08Var29, d08Var30, d08Var31, d08Var32, d08Var33, d08Var34, d08Var35, d08Var36, d08Var37, d08Var38, d08Var39, d08Var40, d08Var41, d08Var42, d08Var43, d08Var44, d08Var45, d08Var46, d08Var47, d08Var48, d08Var49, new d08("GROUP_LIST", 49, 49, 2, odaVar7), new d08("MAP", 50, 50, 4, oda.VOID)};
        e = new Type[0];
        d08[] values = values();
        d = new d08[values.length];
        for (d08 d08Var50 : values) {
            d[d08Var50.a] = d08Var50;
        }
    }

    public d08(String str, int i, int i2, int i3, oda odaVar) {
        this.a = i2;
        int C = wt3.C(i3);
        if (C == 1) {
            Class cls = odaVar.a;
        } else if (C == 3) {
            Class cls2 = odaVar.a;
        }
        if (i3 == 1) {
            odaVar.ordinal();
        }
    }

    public static d08 valueOf(String str) {
        return (d08) Enum.valueOf(d08.class, str);
    }

    public static d08[] values() {
        return (d08[]) f.clone();
    }
}
