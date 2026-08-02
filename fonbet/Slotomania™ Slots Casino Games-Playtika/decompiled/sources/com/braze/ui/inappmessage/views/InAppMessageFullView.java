package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageFullView.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bH\u0002J\u0018\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010-\u001a\u00020\bH\u0002J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020*H\u0016J \u00100\u001a\u00020(2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\b062\u0006\u00107\u001a\u00020\u0010H\u0016J\u0010\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\u000eH\u0016J \u0010:\u001a\u00020(2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u0010\u000b\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u0010H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0012¨\u0006>"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "isGraphic", "", "longEdge", "", "getLongEdge", "()I", "messageBackgroundObject", "getMessageBackgroundObject", "messageClickableView", "getMessageClickableView", "messageCloseButtonView", "getMessageCloseButtonView", "messageHeaderTextView", "Landroid/widget/TextView;", "getMessageHeaderTextView", "()Landroid/widget/TextView;", "messageIconView", "getMessageIconView", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageTextView", "getMessageTextView", "shortEdge", "getShortEdge", "applyDisplayCutoutMarginsToCloseButton", "", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "closeButtonView", "applyDisplayCutoutMarginsToContentArea", "contentAreaView", "applyWindowInsets", "insets", "createAppropriateViews", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "getMessageButtonViews", "", "numButtons", "resetMessageMargins", "imageRetrievalSuccessful", "setInAppMessageImageViewAttributes", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "setMessageBackgroundColor", "color", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView {
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        View findViewById = findViewById(R.id.com_braze_inappmessage_full_message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.com_br…nappmessage_full_message)");
        return (TextView) findViewById;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        View findViewById = findViewById(R.id.com_braze_inappmessage_full_header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.com_br…message_full_header_text)");
        return (TextView) findViewById;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_full_frame);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    public int getLongEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    public int getShortEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    public void createAppropriateViews(Activity activity, IInAppMessageImmersive inAppMessage, boolean isGraphic) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(activity, inAppMessage, inAppMessageImageView);
        }
        this.isGraphic = isGraphic;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if ((messageBackgroundObject == null ? null : messageBackgroundObject.getBackground()) instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, color);
            return;
        }
        if (this.isGraphic) {
            super.setMessageBackgroundColor(color);
            return;
        }
        View findViewById = findViewById(R.id.com_braze_inappmessage_full_all_content_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.com_br…_full_all_content_parent)");
        InAppMessageViewUtils.setViewBackgroundColor(findViewById, color);
        View findViewById2 = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.com_br…nd_button_content_parent)");
        InAppMessageViewUtils.setViewBackgroundColor(findViewById2, color);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int numButtons) {
        ArrayList arrayList = new ArrayList();
        if (numButtons == 1) {
            View findViewById = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (numButtons == 2) {
            View findViewById3 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R.id.com_braze_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(R.id.com_braze_inappmessage_full_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        final View messageClickableView = getMessageClickableView();
        if (messageClickableView == null) {
            return;
        }
        findViewById(R.id.com_braze_inappmessage_full_text_layout).setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InAppMessageFullView.m5229resetMessageMargins$lambda2$lambda1(InAppMessageFullView.this, messageClickableView, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resetMessageMargins$lambda-2$lambda-1, reason: not valid java name */
    public static final void m5229resetMessageMargins$lambda2$lambda1(InAppMessageFullView this$0, View msgClickableView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msgClickableView, "$msgClickableView");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$resetMessageMargins$1$1$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Passing scrollView click event to message clickable view.";
            }
        }, 3, (Object) null);
        msgClickableView.performClick();
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        super.applyWindowInsets(insets);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(insets, messageCloseButtonView);
        }
        if (this.isGraphic) {
            View singleButtonParent = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
            if (singleButtonParent != null && singleButtonParent.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(singleButtonParent, "singleButtonParent");
                applyDisplayCutoutMarginsToContentArea(insets, singleButtonParent);
                return;
            }
            View dualButtonParent = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
            if (dualButtonParent != null && dualButtonParent.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(dualButtonParent, "dualButtonParent");
                applyDisplayCutoutMarginsToContentArea(insets, dualButtonParent);
                return;
            }
            return;
        }
        View findViewById = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        if (findViewById == null) {
            return;
        }
        applyDisplayCutoutMarginsToContentArea(insets, findViewById);
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        if (ViewUtils.isRunningOnTablet(activity)) {
            float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, BrazeInAppMessageParams.getModalizedImageRadiusDp());
            if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
                inAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
                return;
            } else {
                inAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
                return;
            }
        }
        inAppMessageImageView.setCornersRadiusPx(0.0f);
    }

    private final void applyDisplayCutoutMarginsToCloseButton(WindowInsetsCompat windowInsets, View closeButtonView) {
        if (closeButtonView.getLayoutParams() == null || !(closeButtonView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$applyDisplayCutoutMarginsToCloseButton$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Close button layout params are null or not of the expected class. Not applying window insets.";
                }
            }, 3, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = closeButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(windowInsets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    private final void applyDisplayCutoutMarginsToContentArea(WindowInsetsCompat windowInsets, View contentAreaView) {
        if (!(contentAreaView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$applyDisplayCutoutMarginsToContentArea$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Content area layout params are null or not of the expected class. Not applying window insets.";
                }
            }, 3, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = contentAreaView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }
}
