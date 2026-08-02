package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
        Intrinsics.checkNotNullParameter(ninePatchDrawable, "ninePatchDrawable");
    }

    @Override // com.facebook.drawee.drawable.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (N7.b.d()) {
            N7.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!k()) {
            super.draw(canvas);
            if (N7.b.d()) {
                N7.b.b();
                return;
            }
            return;
        }
        m();
        l();
        canvas.clipPath(this.f30491e);
        super.draw(canvas);
        if (N7.b.d()) {
            N7.b.b();
        }
    }
}
