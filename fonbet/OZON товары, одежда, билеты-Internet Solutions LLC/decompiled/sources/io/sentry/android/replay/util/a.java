package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Layout f67661a;

    public a(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f67661a = layout;
    }

    @Override // io.sentry.android.replay.util.m
    public final int a(int i11) {
        return this.f67661a.getLineTop(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final float b(int i11, int i12) {
        return this.f67661a.getPrimaryHorizontal(i12);
    }

    @Override // io.sentry.android.replay.util.m
    public final int c(int i11) {
        return this.f67661a.getLineStart(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final Integer d() {
        int i11;
        Layout layout = this.f67661a;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        Intrinsics.g(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        Intrinsics.f(foregroundColorSpanArr);
        int i12 = LinearLayoutManager.INVALID_OFFSET;
        Integer num = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = layout.getText();
            Intrinsics.g(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            Intrinsics.g(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i11 = spanEnd - spanStart) > i12) {
                num = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i12 = i11;
            }
        }
        if (num != null) {
            return Integer.valueOf(num.intValue() | (-16777216));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.m
    public final int e(int i11) {
        return this.f67661a.getLineBottom(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final int f() {
        return this.f67661a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.m
    public final int g(int i11) {
        return this.f67661a.getLineVisibleEnd(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final int h(int i11) {
        return this.f67661a.getEllipsisCount(i11);
    }
}
