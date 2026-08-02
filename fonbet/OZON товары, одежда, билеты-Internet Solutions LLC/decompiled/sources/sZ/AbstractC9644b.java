package sZ;

import EZ.e;
import EZ.g;
import EZ.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* renamed from: sZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9644b<T extends f> extends i<T> {
    @Override // EZ.a
    public final void navigate(@NotNull g navigator, @NotNull e<T> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateFragment(navigator, response, 0);
    }

    @Override // EZ.a
    public final void navigateForResult(@NotNull g navigator, @NotNull e<T> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateFragment(navigator, response, i11);
    }

    public abstract void navigateFragment(@NotNull g gVar, @NotNull e<T> eVar, int i11);
}
