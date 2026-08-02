package ze;

import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final b f108947b = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Object f108948a;

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f108949a;

        public a(Throwable th2) {
            this.f108949a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.d(this.f108949a, ((a) obj).f108949a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f108949a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // ze.l.b
        @NotNull
        public final String toString() {
            return "Closed(" + this.f108949a + ')';
        }
    }

    public static class b {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ l(Object obj) {
        this.f108948a = obj;
    }

    public static final /* synthetic */ l b(Object obj) {
        return new l(obj);
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f108949a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T d(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public final /* synthetic */ Object e() {
        return this.f108948a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Intrinsics.d(this.f108948a, ((l) obj).f108948a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f108948a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public final String toString() {
        Object obj = this.f108948a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
