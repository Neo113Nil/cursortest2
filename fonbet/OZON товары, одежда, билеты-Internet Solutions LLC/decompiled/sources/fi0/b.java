package fi0;

import Jl.C3398a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f63487a = new a();
    }

    /* renamed from: fi0.b$b, reason: collision with other inner class name */
    public static final class C1028b implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C3398a f63488a;

        public C1028b(@NotNull C3398a currentPageProvider) {
            Intrinsics.checkNotNullParameter(currentPageProvider, "currentPageProvider");
            this.f63488a = currentPageProvider;
        }

        @NotNull
        public final C3398a a() {
            return this.f63488a;
        }
    }
}
