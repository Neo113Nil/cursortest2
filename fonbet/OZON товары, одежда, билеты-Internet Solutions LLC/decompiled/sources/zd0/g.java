package zd0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f108890a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f108891a;

        public a(@NotNull String pageName) {
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            this.f108891a = pageName;
        }

        @NotNull
        public final g a() {
            return new g(this.f108891a);
        }
    }

    public g(String str) {
        this.f108890a = str;
    }

    @NotNull
    public final String a() {
        return this.f108890a;
    }
}
