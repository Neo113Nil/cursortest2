package com.vk.photo.editor.markup.element.text.layout;

import android.graphics.Canvas;
import android.text.StaticLayout;
import androidx.annotation.Keep;

/* compiled from: AllLinesDrawStaticLayout.kt */
/* loaded from: classes4.dex */
public final class AllLinesDrawStaticLayout extends StaticLayout {
    @Keep
    public final long getLineRangeForDraw(Canvas canvas) {
        return getLineCount() - 1;
    }
}
