package wi;

import C.o0;
import Hi.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final j f104571a;

        public a(@NotNull j album) {
            Intrinsics.checkNotNullParameter(album, "album");
            this.f104571a = album;
        }

        @NotNull
        public final j a() {
            return this.f104571a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f104571a, ((a) obj).f104571a);
        }

        public final int hashCode() {
            return this.f104571a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Album(album=" + this.f104571a + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f104572a;

        public b(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f104572a = title;
        }

        @NotNull
        public final String a() {
            return this.f104572a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f104572a, ((b) obj).f104572a);
        }

        public final int hashCode() {
            return this.f104572a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Title(title="), this.f104572a, ")");
        }
    }
}
