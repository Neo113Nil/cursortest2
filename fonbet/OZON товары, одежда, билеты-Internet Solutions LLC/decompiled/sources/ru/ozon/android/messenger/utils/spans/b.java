package ru.ozon.android.messenger.utils.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f91989a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91990b;

    /* renamed from: c, reason: collision with root package name */
    private final int f91991c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91992d;

    public b(int i11, int i12, int i13, int i14) {
        this.f91989a = i11;
        this.f91990b = i12;
        this.f91991c = i13;
        this.f91992d = i14;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int i11, int i12, int i13, int i14, int i15, @NotNull CharSequence text, int i16, int i17, boolean z11, Layout layout) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (z11) {
            paint.setStyle(Paint.Style.FILL);
            float f7 = (i13 + i15) / 2.0f;
            float f11 = (this.f91989a * this.f91992d) + i11;
            int i18 = this.f91991c;
            canvas.drawCircle((f11 - (i18 / 2.0f)) * i12, f7, i18, paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return (this.f91989a * this.f91992d) + this.f91990b;
    }
}
