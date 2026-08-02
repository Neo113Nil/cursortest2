package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class u3f implements m3f {
    public static final q3f a;
    public static final /* synthetic */ u3f[] b;

    static {
        q3f q3fVar = new q3f();
        a = q3fVar;
        b = new u3f[]{q3fVar, new u3f() { // from class: r3f
            @Override // defpackage.m3f
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new u3f() { // from class: s3f
            @Override // defpackage.m3f
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new u3f() { // from class: t3f
            @Override // defpackage.m3f
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static u3f valueOf(String str) {
        return (u3f) Enum.valueOf(u3f.class, str);
    }

    public static u3f[] values() {
        return (u3f[]) b.clone();
    }
}
