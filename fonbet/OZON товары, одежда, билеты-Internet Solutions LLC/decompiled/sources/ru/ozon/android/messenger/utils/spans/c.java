package ru.ozon.android.messenger.utils.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f91993a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91994b;

    /* renamed from: c, reason: collision with root package name */
    private final int f91995c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91996d;

    public c(int i11, int i12, int i13, int i14) {
        this.f91993a = i11;
        this.f91994b = i12;
        this.f91995c = i13;
        this.f91996d = i14;
    }

    public final int a() {
        return this.f91995c;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int i11, int i12, int i13, int i14, int i15, @NotNull CharSequence text, int i16, int i17, boolean z11, Layout layout) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (z11) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawText(this.f91995c + ".", (((this.f91993a * this.f91996d) + i11) - (paint.measureText("4.") / 2)) * i12, i15 - paint.descent(), paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return (this.f91993a * this.f91996d) + this.f91994b;
    }
}
