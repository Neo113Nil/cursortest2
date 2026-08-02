package ru.ozon.app.android.pdp.utils;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/utils/LinkOnlyMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "onLinkClick", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "getOffsetForEvent", "", "textView", "(Landroid/widget/TextView;Landroid/view/MotionEvent;)Ljava/lang/Integer;", "checkIsLinkLastInRow", "link", "Landroid/text/style/ClickableSpan;", "offset", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LinkOnlyMovementMethod extends LinkMovementMethod {

    @NotNull
    private final Function1<String, Unit> onLinkClick;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkOnlyMovementMethod(@NotNull Function1<? super String, Unit> onLinkClick) {
        Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
        this.onLinkClick = onLinkClick;
    }

    private final boolean checkIsLinkLastInRow(Spannable buffer, ClickableSpan link, int offset) {
        int spanStart = buffer.getSpanStart(link);
        int spanEnd = buffer.getSpanEnd(link);
        Character H11 = h.H(offset, buffer);
        return (spanStart + 1 > offset || offset >= spanEnd) && (H11 != null ? CharsKt.c(H11.charValue()) : true);
    }

    private final Integer getOffsetForEvent(TextView textView, MotionEvent event) {
        int x11 = (int) ((event.getX() - textView.getTotalPaddingLeft()) + textView.getScrollX());
        int y11 = (int) ((event.getY() - textView.getTotalPaddingTop()) + textView.getScrollY());
        Layout layout = textView.getLayout();
        if (layout == null) {
            return null;
        }
        return Integer.valueOf(layout.getOffsetForHorizontal(layout.getLineForVertical(y11), x11));
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        Integer offsetForEvent;
        if (widget == null || buffer == null || event == null) {
            return false;
        }
        if ((event.getAction() != 1 && event.getAction() != 0) || (offsetForEvent = getOffsetForEvent(widget, event)) == null) {
            return false;
        }
        int intValue = offsetForEvent.intValue();
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(intValue, intValue, ClickableSpan.class);
        Intrinsics.f(clickableSpanArr);
        if (clickableSpanArr.length == 0) {
            Selection.removeSelection(buffer);
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) C7705l.C(clickableSpanArr);
        Intrinsics.f(clickableSpan);
        if (checkIsLinkLastInRow(buffer, clickableSpan, intValue)) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            Selection.setSelection(buffer, buffer.getSpanStart(clickableSpan), buffer.getSpanEnd(clickableSpan));
        } else if (action == 1) {
            if (clickableSpan instanceof OzonUrlSpan) {
                this.onLinkClick.invoke(((OzonUrlSpan) clickableSpan).getUrl());
            }
            clickableSpan.onClick(widget);
        }
        return true;
    }
}
