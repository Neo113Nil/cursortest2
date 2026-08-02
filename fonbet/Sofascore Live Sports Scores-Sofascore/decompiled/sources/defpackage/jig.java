package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jig {
    public static final List a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final /* synthetic */ jig[] e;

    /* JADX INFO: Fake field, exist only in values array */
    jig EF0;

    static {
        jig jigVar = new jig("VIEWCOUNT", 0);
        e = new jig[]{jigVar};
        a = Arrays.asList(jigVar);
        b = Arrays.asList(new jig[0]);
        c = Arrays.asList(jigVar);
        d = Arrays.asList(jigVar);
    }

    public static jig a(String str) {
        for (jig jigVar : values()) {
            jigVar.getClass();
            if ("viewcount".equalsIgnoreCase(str)) {
                return jigVar;
            }
        }
        return null;
    }

    public static jig valueOf(String str) {
        return (jig) Enum.valueOf(jig.class, str);
    }

    public static jig[] values() {
        return (jig[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "viewcount";
    }
}
