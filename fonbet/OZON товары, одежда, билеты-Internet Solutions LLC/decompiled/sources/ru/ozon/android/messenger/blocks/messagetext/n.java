package ru.ozon.android.messenger.blocks.messagetext;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class n extends LinkMovementMethod {
    public abstract void a();

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(@NotNull TextView widget, @NotNull Spannable buffer, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 1) {
            return super.onTouchEvent(widget, buffer, event);
        }
        int x11 = (int) event.getX();
        int y11 = (int) event.getY();
        int totalPaddingLeft = x11 - widget.getTotalPaddingLeft();
        int totalPaddingTop = y11 - widget.getTotalPaddingTop();
        int scrollX = widget.getScrollX() + totalPaddingLeft;
        int scrollY = widget.getScrollY() + totalPaddingTop;
        Layout layout = widget.getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        ru.ozon.android.messenger.utils.spans.a[] aVarArr = (ru.ozon.android.messenger.utils.spans.a[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ru.ozon.android.messenger.utils.spans.a.class);
        Intrinsics.f(aVarArr);
        if (aVarArr.length == 0) {
            a();
            return true;
        }
        ((ru.ozon.android.messenger.utils.spans.a) C7705l.C(aVarArr)).a();
        return true;
    }
}
