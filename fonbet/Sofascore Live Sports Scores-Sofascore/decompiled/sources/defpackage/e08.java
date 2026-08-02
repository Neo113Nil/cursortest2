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
public final class e08 {
    public static final e08 b;
    public static final e08 c;
    public static final e08[] d;
    public static final Type[] e;
    public static final /* synthetic */ e08[] f;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    e08 EF0;

    static {
        pda pdaVar = pda.DOUBLE;
        e08 e08Var = new e08("DOUBLE", 0, 0, 1, pdaVar);
        pda pdaVar2 = pda.FLOAT;
        e08 e08Var2 = new e08("FLOAT", 1, 1, 1, pdaVar2);
        pda pdaVar3 = pda.LONG;
        e08 e08Var3 = new e08("INT64", 2, 2, 1, pdaVar3);
        e08 e08Var4 = new e08("UINT64", 3, 3, 1, pdaVar3);
        pda pdaVar4 = pda.INT;
        e08 e08Var5 = new e08("INT32", 4, 4, 1, pdaVar4);
        e08 e08Var6 = new e08("FIXED64", 5, 5, 1, pdaVar3);
        e08 e08Var7 = new e08("FIXED32", 6, 6, 1, pdaVar4);
        pda pdaVar5 = pda.BOOLEAN;
        e08 e08Var8 = new e08("BOOL", 7, 7, 1, pdaVar5);
        pda pdaVar6 = pda.STRING;
        e08 e08Var9 = new e08("STRING", 8, 8, 1, pdaVar6);
        pda pdaVar7 = pda.MESSAGE;
        e08 e08Var10 = new e08("MESSAGE", 9, 9, 1, pdaVar7);
        pda pdaVar8 = pda.BYTE_STRING;
        e08 e08Var11 = new e08("BYTES", 10, 10, 1, pdaVar8);
        e08 e08Var12 = new e08("UINT32", 11, 11, 1, pdaVar4);
        pda pdaVar9 = pda.ENUM;
        e08 e08Var13 = new e08("ENUM", 12, 12, 1, pdaVar9);
        e08 e08Var14 = new e08("SFIXED32", 13, 13, 1, pdaVar4);
        e08 e08Var15 = new e08("SFIXED64", 14, 14, 1, pdaVar3);
        e08 e08Var16 = new e08("SINT32", 15, 15, 1, pdaVar4);
        e08 e08Var17 = new e08("SINT64", 16, 16, 1, pdaVar3);
        e08 e08Var18 = new e08("GROUP", 17, 17, 1, pdaVar7);
        e08 e08Var19 = new e08("DOUBLE_LIST", 18, 18, 2, pdaVar);
        e08 e08Var20 = new e08("FLOAT_LIST", 19, 19, 2, pdaVar2);
        e08 e08Var21 = new e08("INT64_LIST", 20, 20, 2, pdaVar3);
        e08 e08Var22 = new e08("UINT64_LIST", 21, 21, 2, pdaVar3);
        e08 e08Var23 = new e08("INT32_LIST", 22, 22, 2, pdaVar4);
        e08 e08Var24 = new e08("FIXED64_LIST", 23, 23, 2, pdaVar3);
        e08 e08Var25 = new e08("FIXED32_LIST", 24, 24, 2, pdaVar4);
        e08 e08Var26 = new e08("BOOL_LIST", 25, 25, 2, pdaVar5);
        e08 e08Var27 = new e08("STRING_LIST", 26, 26, 2, pdaVar6);
        e08 e08Var28 = new e08("MESSAGE_LIST", 27, 27, 2, pdaVar7);
        e08 e08Var29 = new e08("BYTES_LIST", 28, 28, 2, pdaVar8);
        e08 e08Var30 = new e08("UINT32_LIST", 29, 29, 2, pdaVar4);
        e08 e08Var31 = new e08("ENUM_LIST", 30, 30, 2, pdaVar9);
        e08 e08Var32 = new e08("SFIXED32_LIST", 31, 31, 2, pdaVar4);
        e08 e08Var33 = new e08("SFIXED64_LIST", 32, 32, 2, pdaVar3);
        e08 e08Var34 = new e08("SINT32_LIST", 33, 33, 2, pdaVar4);
        e08 e08Var35 = new e08("SINT64_LIST", 34, 34, 2, pdaVar3);
        e08 e08Var36 = new e08("DOUBLE_LIST_PACKED", 35, 35, 3, pdaVar);
        b = e08Var36;
        e08 e08Var37 = new e08("FLOAT_LIST_PACKED", 36, 36, 3, pdaVar2);
        e08 e08Var38 = new e08("INT64_LIST_PACKED", 37, 37, 3, pdaVar3);
        e08 e08Var39 = new e08("UINT64_LIST_PACKED", 38, 38, 3, pdaVar3);
        e08 e08Var40 = new e08("INT32_LIST_PACKED", 39, 39, 3, pdaVar4);
        e08 e08Var41 = new e08("FIXED64_LIST_PACKED", 40, 40, 3, pdaVar3);
        e08 e08Var42 = new e08("FIXED32_LIST_PACKED", 41, 41, 3, pdaVar4);
        e08 e08Var43 = new e08("BOOL_LIST_PACKED", 42, 42, 3, pdaVar5);
        e08 e08Var44 = new e08("UINT32_LIST_PACKED", 43, 43, 3, pdaVar4);
        e08 e08Var45 = new e08("ENUM_LIST_PACKED", 44, 44, 3, pdaVar9);
        e08 e08Var46 = new e08("SFIXED32_LIST_PACKED", 45, 45, 3, pdaVar4);
        e08 e08Var47 = new e08("SFIXED64_LIST_PACKED", 46, 46, 3, pdaVar3);
        e08 e08Var48 = new e08("SINT32_LIST_PACKED", 47, 47, 3, pdaVar4);
        e08 e08Var49 = new e08("SINT64_LIST_PACKED", 48, 48, 3, pdaVar3);
        c = e08Var49;
        f = new e08[]{e08Var, e08Var2, e08Var3, e08Var4, e08Var5, e08Var6, e08Var7, e08Var8, e08Var9, e08Var10, e08Var11, e08Var12, e08Var13, e08Var14, e08Var15, e08Var16, e08Var17, e08Var18, e08Var19, e08Var20, e08Var21, e08Var22, e08Var23, e08Var24, e08Var25, e08Var26, e08Var27, e08Var28, e08Var29, e08Var30, e08Var31, e08Var32, e08Var33, e08Var34, e08Var35, e08Var36, e08Var37, e08Var38, e08Var39, e08Var40, e08Var41, e08Var42, e08Var43, e08Var44, e08Var45, e08Var46, e08Var47, e08Var48, e08Var49, new e08("GROUP_LIST", 49, 49, 2, pdaVar7), new e08("MAP", 50, 50, 4, pda.VOID)};
        e = new Type[0];
        e08[] values = values();
        d = new e08[values.length];
        for (e08 e08Var50 : values) {
            d[e08Var50.a] = e08Var50;
        }
    }

    public e08(String str, int i, int i2, int i3, pda pdaVar) {
        this.a = i2;
        int C = wt3.C(i3);
        if (C == 1) {
            Class cls = pdaVar.a;
        } else if (C == 3) {
            Class cls2 = pdaVar.a;
        }
        if (i3 == 1) {
            pdaVar.ordinal();
        }
    }

    public static e08 valueOf(String str) {
        return (e08) Enum.valueOf(e08.class, str);
    }

    public static e08[] values() {
        return (e08[]) f.clone();
    }
}
