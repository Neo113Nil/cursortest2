package m1;

/* loaded from: classes.dex */
public final class N0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f56118a;

    public N0(int i10) {
        super(a(i10));
        this.f56118a = i10;
    }

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
