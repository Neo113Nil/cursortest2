package defpackage;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m38 {
    public static final m38 a;
    public static final m38 b;
    public static final /* synthetic */ m38[] c;

    static {
        m38 m38Var = new m38("GRANTED", 0);
        a = m38Var;
        m38 m38Var2 = new m38("DENIED", 1);
        b = m38Var2;
        c = new m38[]{m38Var, m38Var2};
    }

    @NonNull
    public static m38 valueOf(@NonNull String str) {
        return (m38) Enum.valueOf(m38.class, str);
    }

    @NonNull
    public static m38[] values() {
        return (m38[]) c.clone();
    }
}
