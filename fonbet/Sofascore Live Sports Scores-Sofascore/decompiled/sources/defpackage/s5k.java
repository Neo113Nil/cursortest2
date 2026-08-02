package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
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
public final class s5k {
    public static final s5k b;
    public static final s5k c;
    public static final s5k d;
    public static final /* synthetic */ s5k[] e;
    public final List a;

    static {
        eli eliVar = eli.AI;
        s5k s5kVar = new s5k(0, "EVENT", a.c(eliVar));
        b = s5kVar;
        s5k s5kVar2 = new s5k(1, "REFERRAL", a.c(eliVar));
        c = s5kVar2;
        s5k s5kVar3 = new s5k(2, "UPGRADE", b.j(eli.ADS, eliVar));
        d = s5kVar3;
        e = new s5k[]{s5kVar, s5kVar2, s5kVar3};
    }

    public s5k(int i, String str, List list) {
        this.a = list;
    }

    public static s5k valueOf(String str) {
        return (s5k) Enum.valueOf(s5k.class, str);
    }

    public static s5k[] values() {
        return (s5k[]) e.clone();
    }
}
