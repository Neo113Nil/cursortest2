package ru.ozon.android.messenger.utils.view;

import android.R;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.Q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/utils/view/TightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TightTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TightTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int lineCount = getLayout().getLineCount();
        if (lineCount <= 1 || View.MeasureSpec.getMode(i11) == 1073741824) {
            return;
        }
        IntRange o11 = kotlin.ranges.h.o(0, lineCount);
        Layout layout = getLayout();
        Iterator<Integer> it = o11.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Q q11 = (Q) it;
        float lineWidth = layout.getLineWidth(q11.b());
        while (it.hasNext()) {
            lineWidth = Math.max(lineWidth, layout.getLineWidth(q11.b()));
        }
        int ceil = ((int) Math.ceil(lineWidth)) + getCompoundPaddingEnd() + getCompoundPaddingStart();
        if (ceil < getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, LinearLayoutManager.INVALID_OFFSET), i12);
        }
    }
}
