package w20;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f103391a = new a();
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f103392a = new b();
    }

    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ComponentCallbacksC5392m f103393a;

        public c(@NotNull ComponentCallbacksC5392m fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f103393a = fragment;
        }

        @NotNull
        public final ComponentCallbacksC5392m a() {
            return this.f103393a;
        }
    }
}
