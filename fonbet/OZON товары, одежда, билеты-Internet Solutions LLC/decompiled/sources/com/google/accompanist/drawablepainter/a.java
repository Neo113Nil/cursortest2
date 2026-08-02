package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import k1.C7465k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DrawablePainter f57776a;

    a(DrawablePainter drawablePainter) {
        this.f57776a = drawablePainter;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        DrawablePainter drawablePainter = this.f57776a;
        DrawablePainter.c(drawablePainter, DrawablePainter.a(drawablePainter) + 1);
        Drawable f57770a = drawablePainter.getF57770a();
        int i11 = N6.a.f18745b;
        DrawablePainter.f(drawablePainter, (f57770a.getIntrinsicWidth() < 0 || f57770a.getIntrinsicHeight() < 0) ? 9205357640488583168L : C7465k.a(f57770a.getIntrinsicWidth(), f57770a.getIntrinsicHeight()));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable d11, @NotNull Runnable what, long j11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        N6.a.a().postAtTime(what, j11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable d11, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(d11, "d");
        Intrinsics.checkNotNullParameter(what, "what");
        N6.a.a().removeCallbacks(what);
    }
}
