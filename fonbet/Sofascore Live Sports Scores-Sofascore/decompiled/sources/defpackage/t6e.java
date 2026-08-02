package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t6e {
    public static final t6e a;
    public static final t6e b;
    public static final /* synthetic */ t6e[] c;

    static {
        t6e t6eVar = new t6e("LAST", 0);
        a = t6eVar;
        t6e t6eVar2 = new t6e("NEXT", 1);
        b = t6eVar2;
        c = new t6e[]{t6eVar, t6eVar2};
    }

    public static t6e valueOf(String str) {
        return (t6e) Enum.valueOf(t6e.class, str);
    }

    public static t6e[] values() {
        return (t6e[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String lowerCase = super.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
