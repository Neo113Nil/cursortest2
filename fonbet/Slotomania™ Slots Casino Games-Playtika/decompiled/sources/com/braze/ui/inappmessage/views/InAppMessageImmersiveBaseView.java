package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.sentry.Session;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InAppMessageImmersiveBaseView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\tH\u0016J\u0016\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0017H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006/"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImmersiveView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "messageHeaderTextView", "Landroid/widget/TextView;", "getMessageHeaderTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageTextView", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "getMessageButtonViews", "", "numButtons", "", "onKeyDown", "keyCode", "resetMessageMargins", "", "imageRetrievalSuccessful", "setFrameColor", "color", "setLargerCloseButtonClickArea", "closeButtonView", "setMessageButtons", "messageButtons", "Lcom/braze/models/inappmessage/MessageButton;", "setMessageCloseButtonColor", "setMessageHeaderText", "text", "", "setMessageHeaderTextAlignment", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Lcom/braze/enums/inappmessage/TextAlign;", "setMessageHeaderTextColor", "setupDirectionalNavigation", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int numButtons);

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        TextView messageTextView = getMessageTextView();
        if (StringsKt.isBlank(String.valueOf(messageTextView == null ? null : messageTextView.getText()))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (StringsKt.isBlank(String.valueOf(messageHeaderTextView != null ? messageHeaderTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public void setupDirectionalNavigation(final int numButtons) {
        List<View> messageButtonViews = getMessageButtonViews(numButtons);
        final View messageCloseButtonView = getMessageCloseButtonView();
        Integer valueOf = messageCloseButtonView == null ? null : Integer.valueOf(messageCloseButtonView.getId());
        if (valueOf == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$setupDirectionalNavigation$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "closeButtonId is null. Cannot continue setting up navigation.";
                }
            }, 2, (Object) null);
            return;
        }
        if (numButtons == 0) {
            messageCloseButtonView.setNextFocusUpId(valueOf.intValue());
            messageCloseButtonView.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusRightId(valueOf.intValue());
            messageCloseButtonView.setNextFocusLeftId(valueOf.intValue());
        } else if (numButtons == 1) {
            View view = messageButtonViews.get(0);
            Integer valueOf2 = Integer.valueOf(view.getId());
            view.setNextFocusLeftId(valueOf.intValue());
            view.setNextFocusRightId(valueOf.intValue());
            view.setNextFocusUpId(valueOf.intValue());
            view.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(valueOf2.intValue());
            messageCloseButtonView.setNextFocusDownId(valueOf2.intValue());
            messageCloseButtonView.setNextFocusRightId(valueOf2.intValue());
            messageCloseButtonView.setNextFocusLeftId(valueOf2.intValue());
            messageCloseButtonView = view;
            valueOf = valueOf2;
        } else if (numButtons == 2) {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            Integer valueOf3 = Integer.valueOf(view2.getId());
            Integer valueOf4 = Integer.valueOf(view3.getId());
            view2.setNextFocusLeftId(valueOf4.intValue());
            view2.setNextFocusRightId(valueOf4.intValue());
            view2.setNextFocusUpId(valueOf.intValue());
            view2.setNextFocusDownId(valueOf.intValue());
            view3.setNextFocusLeftId(valueOf3.intValue());
            view3.setNextFocusRightId(valueOf3.intValue());
            view3.setNextFocusUpId(valueOf.intValue());
            view3.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(valueOf3.intValue());
            messageCloseButtonView.setNextFocusDownId(valueOf3.intValue());
            messageCloseButtonView.setNextFocusRightId(valueOf3.intValue());
            messageCloseButtonView.setNextFocusLeftId(valueOf4.intValue());
            valueOf = valueOf3;
            messageCloseButtonView = view2;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$setupDirectionalNavigation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Cannot setup directional navigation. Got unsupported number of buttons: ", Integer.valueOf(numButtons));
                }
            }, 2, (Object) null);
        }
        if (valueOf != null) {
            setNextFocusUpId(valueOf.intValue());
            setNextFocusDownId(valueOf.intValue());
            setNextFocusRightId(valueOf.intValue());
            setNextFocusLeftId(valueOf.intValue());
        }
        if (Build.VERSION.SDK_INT >= 26 && messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView == null) {
            return;
        }
        messageCloseButtonView.post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                messageCloseButtonView.requestFocus();
            }
        });
    }

    public void setMessageButtons(List<? extends MessageButton> messageButtons) {
        Intrinsics.checkNotNullParameter(messageButtons, "messageButtons");
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(messageButtons.size()), messageButtons);
    }

    public void setMessageCloseButtonColor(int color) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView == null) {
            return;
        }
        InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, color);
    }

    public void setMessageHeaderTextColor(int color) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView == null) {
            return;
        }
        InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, color);
    }

    public void setMessageHeaderText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView == null) {
            return;
        }
        messageHeaderTextView.setText(text);
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView == null) {
            return;
        }
        InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
    }

    public void setFrameColor(int color) {
        View frameView = getFrameView();
        if (frameView == null) {
            return;
        }
        InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(color));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isInTouchMode() && event.getKeyCode() == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLargerCloseButtonClickArea(final View closeButtonView) {
        if (closeButtonView == null || closeButtonView.getParent() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$setLargerCloseButtonClickArea$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot increase click area for view if view and/or parent are null.";
                }
            }, 2, (Object) null);
            return;
        }
        final ViewParent parent = closeButtonView.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    InAppMessageImmersiveBaseView.m5231setLargerCloseButtonClickArea$lambda5(closeButtonView, this, parent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setLargerCloseButtonClickArea$lambda-5, reason: not valid java name */
    public static final void m5231setLargerCloseButtonClickArea$lambda5(View view, InAppMessageImmersiveBaseView this$0, ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = this$0.getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = this$0.getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }
}
