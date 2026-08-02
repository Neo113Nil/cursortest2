package K7;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f6249a = new C();

    public static final int a(int i10, int i11, int i12) {
        return Math.min(Math.max(0, i12 - i10), i11);
    }

    public static final void b(int i10, int i11, int i12, int i13, int i14) {
        D6.k.d(i13 >= 0, "count (%d) ! >= 0", Integer.valueOf(i13));
        D6.k.d(i10 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i10));
        D6.k.d(i12 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i12));
        D6.k.d(i10 + i13 <= i14, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i10), Integer.valueOf(i13), Integer.valueOf(i14));
        D6.k.d(i12 + i13 <= i11, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i11));
    }
}
