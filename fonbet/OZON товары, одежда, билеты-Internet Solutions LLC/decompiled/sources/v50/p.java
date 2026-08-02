package v50;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v50.j;

/* loaded from: classes3.dex */
public interface p {

    public interface a {
        @NotNull
        u a();

        @NotNull
        u b(@NotNull j.a aVar);

        void dismiss();

        String getId();

        void show();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f102398a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<a> f102399b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f102400c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f102401d;

        public b(@NotNull j snack, int i11) {
            Intrinsics.checkNotNullParameter(snack, "snack");
            this.f102398a = i11;
            this.f102399b = new WeakReference<>(snack);
        }

        public final boolean a() {
            return this.f102401d;
        }

        public final boolean b() {
            return this.f102400c;
        }

        public final int c() {
            return this.f102398a;
        }

        @NotNull
        public final WeakReference<a> d() {
            return this.f102399b;
        }

        public final boolean e(@NotNull a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            return Intrinsics.d(this.f102399b.get(), callback);
        }

        public final void f() {
            this.f102401d = true;
        }

        public final void g(boolean z11) {
            this.f102400c = z11;
        }
    }

    void a(@NotNull j jVar, int i11);

    void b(@NotNull j jVar);

    void c(@NotNull j jVar);

    void d(@NotNull j jVar);

    void e(@NotNull j jVar);

    void f(@NotNull j jVar);
}
