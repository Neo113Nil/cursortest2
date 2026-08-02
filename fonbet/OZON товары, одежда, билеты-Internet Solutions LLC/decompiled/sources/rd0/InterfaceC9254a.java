package rd0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.user.data.OzonIdUser;

/* renamed from: rd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9254a {

    /* renamed from: rd0.a$a, reason: collision with other inner class name */
    public static final class C1418a implements InterfaceC9254a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Throwable f83315a;

        public C1418a(@NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f83315a = cause;
        }

        @NotNull
        public final Throwable a() {
            return this.f83315a;
        }
    }

    /* renamed from: rd0.a$b */
    public static final class b implements InterfaceC9254a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f83316a = new b();
    }

    /* renamed from: rd0.a$c */
    public static final class c implements InterfaceC9254a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final OzonIdUser f83317a;

        public c(@NotNull OzonIdUser user) {
            Intrinsics.checkNotNullParameter(user, "user");
            this.f83317a = user;
        }

        @NotNull
        public final OzonIdUser a() {
            return this.f83317a;
        }
    }
}
