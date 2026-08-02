package pZ;

import C.o0;
import android.widget.Toast;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f80373a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f80374b;

    public static final class a implements EZ.a<h> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<h> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            r activity = navigator.getActivity();
            String a11 = response.b().a();
            if (a11 == null || kotlin.text.h.K(a11)) {
                return;
            }
            Toast.makeText(activity, a11, 1).show();
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<h> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            r activity = navigator.getActivity();
            String a11 = response.b().a();
            if (a11 == null || kotlin.text.h.K(a11)) {
                return;
            }
            Toast.makeText(activity, a11, 1).show();
        }
    }

    public h() {
        this((String) null);
    }

    public final String a() {
        return this.f80373a;
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f80374b;
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("ToastDestination(message="), this.f80373a, ")");
    }

    public /* synthetic */ h(int i11) {
        this((String) null);
    }

    public h(String str) {
        this.f80373a = str;
        this.f80374b = N.b(a.class);
    }
}
