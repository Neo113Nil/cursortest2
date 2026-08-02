package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xm5 implements ajf {
    public static final xm5 a;
    public static final /* synthetic */ xm5[] b;

    static {
        xm5 xm5Var = new xm5("INSTANCE", 0);
        a = xm5Var;
        b = new xm5[]{xm5Var};
    }

    public static void a(ed8 ed8Var) {
        ed8Var.b(a);
        ed8Var.onComplete();
    }

    public static void b(Throwable th, ed8 ed8Var) {
        ed8Var.b(a);
        ed8Var.onError(th);
    }

    public static xm5 valueOf(String str) {
        return (xm5) Enum.valueOf(xm5.class, str);
    }

    public static xm5[] values() {
        return (xm5[]) b.clone();
    }

    @Override // defpackage.zif
    public final int c(int i) {
        return 2;
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

    @Override // defpackage.iki
    public final void request(long j) {
        pki.c(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // defpackage.iki
    public final void cancel() {
    }

    @Override // defpackage.ohh
    public final void clear() {
    }
}
