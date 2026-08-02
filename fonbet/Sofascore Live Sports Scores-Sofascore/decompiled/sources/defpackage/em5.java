package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class em5 implements tif {
    public static final em5 a;
    public static final /* synthetic */ em5[] b;

    static {
        em5 em5Var = new em5("INSTANCE", 0);
        a = em5Var;
        b = new em5[]{em5Var, new em5("NEVER", 1)};
    }

    public static em5 valueOf(String str) {
        return (em5) Enum.valueOf(em5.class, str);
    }

    public static em5[] values() {
        return (em5[]) b.clone();
    }

    @Override // defpackage.ohh
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.ohh
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ohh
    public final Object poll() {
        return null;
    }

    @Override // defpackage.ohh
    public final void clear() {
    }

    @Override // defpackage.k55
    public final void d() {
    }
}
