package z9;

/* renamed from: z9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C11004b {

    /* renamed from: a, reason: collision with root package name */
    private final int f107357a;

    /* renamed from: b, reason: collision with root package name */
    private final int f107358b;

    public C11004b(int i11, int i12) {
        this.f107357a = i11;
        this.f107358b = i12;
    }

    public final int a() {
        return this.f107358b;
    }

    public final int b() {
        return this.f107357a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11004b)) {
            return false;
        }
        C11004b c11004b = (C11004b) obj;
        return this.f107357a == c11004b.f107357a && this.f107358b == c11004b.f107358b;
    }

    public final int hashCode() {
        return this.f107357a ^ this.f107358b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f107357a);
        sb2.append("(");
        return Ek.a.d(sb2, this.f107358b, ')');
    }
}
