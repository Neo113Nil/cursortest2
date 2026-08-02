package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s67 {
    public static final s67 f;
    public static final s67 g;
    public static final s67 h;
    public static final s67 i;
    public static final s67 j;
    public static final s67 k;
    public static final s67 l;
    public static final /* synthetic */ s67[] m;
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final String e;

    static {
        s67 s67Var = new s67(0, R.string.captain, R.color.primary_default, R.drawable.ic_captain_circle, null, "CAPTAIN", "captain");
        f = s67Var;
        s67 s67Var2 = new s67(1, R.string.substitute_out_short, R.color.alert, R.drawable.ic_transfer_out_16, Integer.valueOf(R.color.alert), "SUB_OUT", "sub_out");
        g = s67Var2;
        s67 s67Var3 = new s67(2, R.string.substitute_in_short, R.color.success, R.drawable.ic_transfer_in, Integer.valueOf(R.color.success), "SUB_IN", "sub_in");
        h = s67Var3;
        Integer valueOf = Integer.valueOf(R.color.error);
        s67 s67Var4 = new s67(3, R.string.remove, R.color.error, R.drawable.ic_remove, valueOf, "REMOVE", "remove_player");
        i = s67Var4;
        s67 s67Var5 = new s67(4, R.string.transfer_out, R.color.error, R.drawable.ic_transfer_swap, valueOf, "TRANSFER_OUT", "transfer_out");
        j = s67Var5;
        s67 s67Var6 = new s67(5, R.string.restore_player, R.color.primary_default, R.drawable.ic_refresh, Integer.valueOf(R.color.primary_default), "RESTORE", "restore_player");
        k = s67Var6;
        s67 s67Var7 = new s67(6, R.string.replace_player, R.color.error, R.drawable.ic_transfer_out_16, valueOf, "REPLACE", "select_replacement");
        l = s67Var7;
        m = new s67[]{s67Var, s67Var2, s67Var3, s67Var4, s67Var5, s67Var6, s67Var7};
    }

    public s67(int i2, int i3, int i4, int i5, Integer num, String str, String str2) {
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = num;
        this.e = str2;
    }

    public static s67 valueOf(String str) {
        return (s67) Enum.valueOf(s67.class, str);
    }

    public static s67[] values() {
        return (s67[]) m.clone();
    }
}
