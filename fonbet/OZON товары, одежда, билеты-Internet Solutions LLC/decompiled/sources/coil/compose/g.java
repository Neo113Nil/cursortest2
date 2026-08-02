package coil.compose;

import B0.A0;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.NotNull;
import z5.InterfaceC10986d;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f57283a = new a();

    public static final class a implements InterfaceC10986d {
        @Override // x5.InterfaceC10658b
        public final void a(@NotNull Drawable drawable) {
        }

        @Override // x5.InterfaceC10658b
        public final void b(Drawable drawable) {
        }

        @Override // x5.InterfaceC10658b
        public final void c(Drawable drawable) {
        }
    }

    static void b(String str) {
        throw new IllegalArgumentException(Sh.b.c("Unsupported type: ", str, ". ", A0.b("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
