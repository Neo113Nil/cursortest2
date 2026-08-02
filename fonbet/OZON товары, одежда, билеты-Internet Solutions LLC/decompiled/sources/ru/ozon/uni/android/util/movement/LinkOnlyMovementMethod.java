package ru.ozon.uni.android.util.movement;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/util/movement/LinkOnlyMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "<init>", "()V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "checkIsLinkLastInRow", "link", "Landroid/text/style/ClickableSpan;", "offset", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinkOnlyMovementMethod extends LinkMovementMethod {

    @NotNull
    public static final LinkOnlyMovementMethod INSTANCE = new LinkOnlyMovementMethod();

    private LinkOnlyMovementMethod() {
    }

    private final boolean checkIsLinkLastInRow(Spannable buffer, ClickableSpan link, int offset) {
        int spanStart = buffer.getSpanStart(link);
        int spanEnd = buffer.getSpanEnd(link);
        Character H11 = h.H(offset, buffer);
        return (spanStart + 1 > offset || offset >= spanEnd) && (H11 != null ? CharsKt.c(H11.charValue()) : true);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        Intrinsics.f(event);
        int action = event.getAction();
        if (action == 0 || action == 1) {
            int x11 = (int) event.getX();
            int y11 = (int) event.getY();
            Intrinsics.f(widget);
            int totalPaddingLeft = x11 - widget.getTotalPaddingLeft();
            int totalPaddingTop = y11 - widget.getTotalPaddingTop();
            int scrollX = widget.getScrollX() + totalPaddingLeft;
            int scrollY = widget.getScrollY() + totalPaddingTop;
            Layout layout = widget.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            Intrinsics.f(buffer);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            Intrinsics.f(clickableSpanArr);
            if (!(clickableSpanArr.length == 0)) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                Intrinsics.f(clickableSpan);
                if (checkIsLinkLastInRow(buffer, clickableSpan, offsetForHorizontal)) {
                    return false;
                }
                if (action == 1) {
                    clickableSpan.onClick(widget);
                } else {
                    Selection.setSelection(buffer, buffer.getSpanStart(clickableSpan), buffer.getSpanEnd(clickableSpan));
                }
                return true;
            }
            Selection.removeSelection(buffer);
        }
        return false;
    }
}
