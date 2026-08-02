package ru.ozon.app.android.abtool.presentation.views;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/abtool/presentation/views/TextViewLinkHandler;", "Landroid/text/method/LinkMovementMethod;", "<init>", "()V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "onLinkClick", "", ImagesContract.URL, "", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TextViewLinkHandler extends LinkMovementMethod {
    public abstract void onLinkClick(String url);

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(@NotNull TextView widget, @NotNull Spannable buffer, @NotNull MotionEvent event) {
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
        URLSpan[] uRLSpanArr = (URLSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
        Intrinsics.f(uRLSpanArr);
        if (!(uRLSpanArr.length == 0)) {
            onLinkClick(uRLSpanArr[0].getURL());
        }
        return true;
    }
}
