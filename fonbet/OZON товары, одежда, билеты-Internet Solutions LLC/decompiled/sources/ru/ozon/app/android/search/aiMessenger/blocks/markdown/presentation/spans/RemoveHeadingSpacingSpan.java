package ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.spans;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/spans/RemoveHeadingSpacingSpan;", "Landroid/text/style/LineHeightSpan;", "<init>", "()V", "chooseHeight", "", "text", "", "start", "", "end", "spanstartv", "vertical", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RemoveHeadingSpacingSpan implements LineHeightSpan {
    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int vertical, @NotNull Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        fm.ascent = fm.top;
        fm.descent = 0;
        fm.bottom = 0;
    }
}
