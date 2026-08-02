package e50;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f62013a = new a();
    }

    public static final class b implements d {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @NotNull
        public final String toString() {
            return "PageLoaded(loadingPageIndex=0)";
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f62014a;

        public c(@NotNull String fileNameTitle) {
            Intrinsics.checkNotNullParameter(fileNameTitle, "fileNameTitle");
            this.f62014a = fileNameTitle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f62014a, ((c) obj).f62014a);
        }

        public final int hashCode() {
            return this.f62014a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("SuccessDownloaded(fileNameTitle="), this.f62014a, ")");
        }
    }
}
