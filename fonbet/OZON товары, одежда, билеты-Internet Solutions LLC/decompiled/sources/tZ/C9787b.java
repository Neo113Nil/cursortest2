package tZ;

import EZ.e;
import EZ.g;
import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: tZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9787b extends i<C9786a> {
    @Override // EZ.a
    public final void navigate(@NotNull g navigator, @NotNull e<C9786a> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigator.getActivity().onBackPressed();
    }

    @Override // EZ.a
    public final void navigateForResult(@NotNull g navigator, @NotNull e<C9786a> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigator.getActivity().onBackPressed();
    }
}
