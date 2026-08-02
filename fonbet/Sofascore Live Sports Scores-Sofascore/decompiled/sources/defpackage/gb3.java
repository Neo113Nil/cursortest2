package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gb3 {
    public static final gb3 a;
    public static final /* synthetic */ gb3[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gb3 EF0;

    static {
        gb3 gb3Var = new gb3("NOT_SET", 0);
        gb3 gb3Var2 = new gb3("EVENT_OVERRIDE", 1);
        a = gb3Var2;
        b = new gb3[]{gb3Var, gb3Var2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, gb3Var);
        sparseArray.put(5, gb3Var2);
    }

    public static gb3 valueOf(String str) {
        return (gb3) Enum.valueOf(gb3.class, str);
    }

    public static gb3[] values() {
        return (gb3[]) b.clone();
    }
}
