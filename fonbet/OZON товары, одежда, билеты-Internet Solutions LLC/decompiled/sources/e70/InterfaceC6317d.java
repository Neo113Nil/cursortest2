package e70;

import T7.E;
import e70.InterfaceC6316c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e70.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6317d<D, E extends InterfaceC6316c> {

    /* renamed from: e70.d$a */
    public static final class a<E extends InterfaceC6316c> implements InterfaceC6317d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final E f62029a;

        public a(@NotNull E error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f62029a = error;
        }

        @NotNull
        public final E a() {
            return this.f62029a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f62029a, ((a) obj).f62029a);
        }

        public final int hashCode() {
            return this.f62029a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(error=" + this.f62029a + ")";
        }
    }

    /* renamed from: e70.d$b */
    public static final class b<D> implements InterfaceC6317d {

        /* renamed from: a, reason: collision with root package name */
        private final D f62030a;

        public b(D d11) {
            this.f62030a = d11;
        }

        public final D a() {
            return this.f62030a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f62030a, ((b) obj).f62030a);
        }

        public final int hashCode() {
            D d11 = this.f62030a;
            if (d11 == null) {
                return 0;
            }
            return d11.hashCode();
        }

        @NotNull
        public final String toString() {
            return E.c(this.f62030a, ")", new StringBuilder("Success(data="));
        }
    }
}
