package net.time4j.format;

/* loaded from: classes5.dex */
public enum e implements oi.y {
    FULL(0),
    LONG(1),
    MEDIUM(2),
    SHORT(3);

    private static e[] ENUMS = values();

    /* renamed from: a, reason: collision with root package name */
    public final transient int f57851a;

    e(int i10) {
        this.f57851a = i10;
    }

    public static e b(int i10) {
        for (e eVar : ENUMS) {
            if (eVar.a() == i10) {
                return eVar;
            }
        }
        throw new UnsupportedOperationException("Unknown format style: " + i10);
    }

    @Override // oi.y
    public int a() {
        return this.f57851a;
    }
}
