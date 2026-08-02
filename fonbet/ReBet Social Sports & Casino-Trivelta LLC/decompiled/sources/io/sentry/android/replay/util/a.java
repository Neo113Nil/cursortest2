package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f51755a;

    public a(Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f51755a = layout;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return this.f51755a.getLineTop(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int b() {
        return this.f51755a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.q
    public float c(int i10) {
        return (this.f51755a.getEllipsizedWidth() <= 0 || this.f51755a.getEllipsizedWidth() >= this.f51755a.getWidth()) ? this.f51755a.getLineRight(i10) : this.f51755a.getEllipsizedWidth();
    }

    @Override // io.sentry.android.replay.util.q
    public Integer d() {
        int i10;
        if (!(this.f51755a.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.f51755a.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.f51755a.getText().length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNull(foregroundColorSpanArr);
        int i11 = Integer.MIN_VALUE;
        Integer num = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.f51755a.getText();
            Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.f51755a.getText();
            Intrinsics.checkNotNull(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                num = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (num != null) {
            return Integer.valueOf(r.j(num.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public float e(int i10) {
        if (this.f51755a.getEllipsizedWidth() <= 0 || this.f51755a.getEllipsizedWidth() >= this.f51755a.getWidth()) {
            return this.f51755a.getLineLeft(i10);
        }
        return 0.0f;
    }

    @Override // io.sentry.android.replay.util.q
    public int f(int i10) {
        return this.f51755a.getLineBottom(i10);
    }
}
