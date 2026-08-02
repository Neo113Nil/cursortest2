package defpackage;

import java.time.LocalDate;
import java.time.Month;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qv7 {
    public static final qv7 e;
    public static final /* synthetic */ qv7[] f;
    public final LocalDate a;
    public final LocalDate b;
    public final LocalDate c;
    public final LocalDate d;

    static {
        LocalDate.of(2025, Month.JUNE, 15).getClass();
        Month month = Month.JANUARY;
        LocalDate of = LocalDate.of(2026, month, 21);
        of.getClass();
        Month month2 = Month.DECEMBER;
        LocalDate of2 = LocalDate.of(2025, month2, 12);
        of2.getClass();
        LocalDate of3 = LocalDate.of(2025, month2, 29);
        of3.getClass();
        LocalDate of4 = LocalDate.of(2026, month, 2);
        of4.getClass();
        qv7 qv7Var = new qv7(of, of2, of3, of4);
        e = qv7Var;
        f = new qv7[]{qv7Var};
    }

    public qv7(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4) {
        this.a = localDate;
        this.b = localDate2;
        this.c = localDate3;
        this.d = localDate4;
    }

    public static qv7 valueOf(String str) {
        return (qv7) Enum.valueOf(qv7.class, str);
    }

    public static qv7[] values() {
        return (qv7[]) f.clone();
    }
}
