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
/* loaded from: classes6.dex */
public final class m49 {
    public static final m49 c;
    public static final m49[] d;
    public static final /* synthetic */ m49[] e;
    public final int a;
    public final xei b;

    /* JADX INFO: Fake field, exist only in values array */
    m49 EF0;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    static {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m49.<clinit>():void");
    }

    public m49(String str, int i, int i2, xei xeiVar) {
        this.a = i2;
        String str2 = "HTTP/2 error code: " + name();
        this.b = xeiVar.h(xeiVar.b != null ? mz1.o(mz1.r(str2, " ("), xeiVar.b, ")") : str2);
    }

    public static m49 valueOf(String str) {
        return (m49) Enum.valueOf(m49.class, str);
    }

    public static m49[] values() {
        return (m49[]) e.clone();
    }
}
