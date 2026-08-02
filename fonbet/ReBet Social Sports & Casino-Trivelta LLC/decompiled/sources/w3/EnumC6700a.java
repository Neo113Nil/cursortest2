package w3;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6700a {
    ARM32(0),
    ARM64(1),
    X86(2),
    X86_64(3),
    RISCV64(4),
    NONE(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f67293a;

    EnumC6700a(int i10) {
        this.f67293a = i10;
    }

    public static EnumC6700a b(int i10) {
        for (EnumC6700a enumC6700a : values()) {
            if (enumC6700a.f67293a == i10) {
                return enumC6700a;
            }
        }
        return NONE;
    }
}
