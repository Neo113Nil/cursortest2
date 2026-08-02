package j$.util;

/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Optional f17602b = new Optional();

    /* renamed from: a, reason: collision with root package name */
    public final Object f17603a;

    public Optional() {
        this.f17603a = null;
    }

    public Optional(Object obj) {
        this.f17603a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> ofNullable(T t3) {
        if (t3 != null) {
            return new Optional<>(t3);
        }
        return f17602b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f17603a, ((Optional) obj).f17603a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17603a);
    }

    public final String toString() {
        Object obj = this.f17603a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
