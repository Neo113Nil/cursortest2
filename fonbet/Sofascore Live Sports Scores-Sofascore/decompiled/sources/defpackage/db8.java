package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class db8 {
    public static final db8 a;
    public static final /* synthetic */ db8[] b;

    /* JADX INFO: Fake field, exist only in values array */
    db8 EF0;

    static {
        db8 db8Var = new db8("Visible", 0);
        db8 db8Var2 = new db8("Clip", 1);
        a = db8Var2;
        b = new db8[]{db8Var, db8Var2, new db8("ExpandIndicator", 2), new db8("ExpandOrCollapseIndicator", 3)};
    }

    public static db8 valueOf(String str) {
        return (db8) Enum.valueOf(db8.class, str);
    }

    public static db8[] values() {
        return (db8[]) b.clone();
    }
}
