package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class yal {
    public static final ual c;
    public static final val d;
    public static final wal e;
    public static final /* synthetic */ yal[] f;
    public final zal a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    yal EF0;

    /* JADX INFO: Fake field, exist only in values array */
    yal EF1;

    /* JADX INFO: Fake field, exist only in values array */
    yal EF2;

    static {
        yal yalVar = new yal("DOUBLE", 0, zal.DOUBLE, 1);
        yal yalVar2 = new yal("FLOAT", 1, zal.FLOAT, 5);
        zal zalVar = zal.LONG;
        yal yalVar3 = new yal("INT64", 2, zalVar, 0);
        yal yalVar4 = new yal("UINT64", 3, zalVar, 0);
        zal zalVar2 = zal.INT;
        yal yalVar5 = new yal("INT32", 4, zalVar2, 0);
        yal yalVar6 = new yal("FIXED64", 5, zalVar, 1);
        yal yalVar7 = new yal("FIXED32", 6, zalVar2, 5);
        yal yalVar8 = new yal("BOOL", 7, zal.BOOLEAN, 0);
        ual ualVar = new ual("STRING", 8, zal.STRING, 2);
        c = ualVar;
        zal zalVar3 = zal.MESSAGE;
        val valVar = new val("GROUP", 9, zalVar3, 3);
        d = valVar;
        wal walVar = new wal("MESSAGE", 10, zalVar3, 2);
        e = walVar;
        f = new yal[]{yalVar, yalVar2, yalVar3, yalVar4, yalVar5, yalVar6, yalVar7, yalVar8, ualVar, valVar, walVar, new xal("BYTES", 11, zal.BYTE_STRING, 2), new yal("UINT32", 12, zalVar2, 0), new yal("ENUM", 13, zal.ENUM, 0), new yal("SFIXED32", 14, zalVar2, 5), new yal("SFIXED64", 15, zalVar, 1), new yal("SINT32", 16, zalVar2, 0), new yal("SINT64", 17, zalVar, 0)};
    }

    public yal(String str, int i, zal zalVar, int i2) {
        this.a = zalVar;
        this.b = i2;
    }

    public static yal valueOf(String str) {
        return (yal) Enum.valueOf(yal.class, str);
    }

    public static yal[] values() {
        return (yal[]) f.clone();
    }
}
