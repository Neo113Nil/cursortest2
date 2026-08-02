package com.swmansion.enriched.markdown.spans;

import android.graphics.Paint;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginBottomSpan.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/swmansion/enriched/markdown/spans/MarginBottomSpan;", "Landroid/text/style/LineHeightSpan;", ViewProps.MARGIN_BOTTOM, "", "<init>", "(F)V", "getMarginBottom", "()F", "chooseHeight", "", "text", "", "start", "", "end", "spanstartv", ViewProps.LINE_HEIGHT, "fm", "Landroid/graphics/Paint$FontMetricsInt;", "hasContentAfter", "", "pos", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarginBottomSpan implements android.text.style.LineHeightSpan {
    private final float marginBottom;

    public MarginBottomSpan(float f) {
        this.marginBottom = f;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int lineHeight, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fm, "fm");
        if (end <= start || text.charAt(end - 1) != '\n') {
            return;
        }
        int i = (int) this.marginBottom;
        if (end - start == 1 && text.charAt(start) == '\n') {
            if (hasContentAfter(text, end)) {
                fm.top = 0;
                fm.ascent = 0;
                fm.descent = i;
                fm.bottom = i;
                return;
            }
            fm.top = 0;
            fm.ascent = 0;
            fm.descent = 0;
            fm.bottom = 0;
            return;
        }
        if (hasContentAfter(text, end)) {
            fm.descent += i;
            fm.bottom += i;
        }
    }

    private final boolean hasContentAfter(CharSequence text, int pos) {
        if (pos >= text.length()) {
            return false;
        }
        if (text.charAt(pos) != '\n') {
            return true;
        }
        int i = pos + 1;
        return i < text.length() && text.charAt(i) != '\n';
    }
}
