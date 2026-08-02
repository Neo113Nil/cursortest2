package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
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
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageFullView.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020$H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u0014022\u0006\u00103\u001a\u00020$H\u0016J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\fH\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0016J \u00109\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020:H\u0002J\u0018\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\u0014H\u0002J\u0018\u0010>\u001a\u00020*2\u0006\u0010<\u001a\u0002082\u0006\u0010?\u001a\u00020\u0014H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0016\u0010!\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006@"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "isGraphic", "", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageHeaderTextView", "getMessageHeaderTextView", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "messageCloseButtonView", "getMessageCloseButtonView", "messageClickableView", "getMessageClickableView", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageIconView", "getMessageIconView", "messageBackgroundObject", "getMessageBackgroundObject", "longEdge", "", "getLongEdge", "()I", "shortEdge", "getShortEdge", "createAppropriateViews", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "setMessageBackgroundColor", "color", "getMessageButtonViews", "", "numButtons", "resetMessageMargins", "imageRetrievalSuccessful", "applyWindowInsets", "insets", "Landroidx/core/view/WindowInsetsCompat;", "setInAppMessageImageViewAttributes", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "applyDisplayCutoutMarginsToCloseButton", "windowInsets", "closeButtonView", "applyDisplayCutoutMarginsToContentArea", "contentAreaView", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView implements IInAppMessageBackEventListener {
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return null;
    }

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_header_text);
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
        if ((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, color);
            return;
        }
        if (this.isGraphic) {
            super.setMessageBackgroundColor(color);
            return;
        }
        View findViewById = findViewById(R.id.com_braze_inappmessage_full_all_content_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        InAppMessageViewUtils.setViewBackgroundColor(findViewById, color);
        View findViewById2 = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
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
        if (messageClickableView != null) {
            findViewById(R.id.com_braze_inappmessage_full_text_layout).setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InAppMessageFullView.resetMessageMargins$lambda$3$lambda$2(InAppMessageFullView.this, messageClickableView, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$3$lambda$2(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageFullView, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetMessageMargins$lambda$3$lambda$2$lambda$1;
                resetMessageMargins$lambda$3$lambda$2$lambda$1 = InAppMessageFullView.resetMessageMargins$lambda$3$lambda$2$lambda$1();
                return resetMessageMargins$lambda$3$lambda$2$lambda$1;
            }
        }, 7, (Object) null);
        view.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$3$lambda$2$lambda$1() {
        return "Passing scrollView click event to message clickable view.";
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
            View findViewById = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                applyDisplayCutoutMarginsToContentArea(insets, findViewById);
                return;
            }
            View findViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById2 == null || findViewById2.getVisibility() != 0) {
                return;
            }
            applyDisplayCutoutMarginsToContentArea(insets, findViewById2);
            return;
        }
        View findViewById3 = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        if (findViewById3 != null) {
            applyDisplayCutoutMarginsToContentArea(insets, findViewById3);
        }
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        inAppMessageImageView.setAltImageText(inAppMessage.getAltImageText());
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyDisplayCutoutMarginsToCloseButton$lambda$6;
                    applyDisplayCutoutMarginsToCloseButton$lambda$6 = InAppMessageFullView.applyDisplayCutoutMarginsToCloseButton$lambda$6();
                    return applyDisplayCutoutMarginsToCloseButton$lambda$6;
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = closeButtonView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(windowInsets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToCloseButton$lambda$6() {
        return "Close button layout params are null or not of the expected class. Not applying window insets.";
    }

    private final void applyDisplayCutoutMarginsToContentArea(WindowInsetsCompat windowInsets, View contentAreaView) {
        if (!(contentAreaView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String applyDisplayCutoutMarginsToContentArea$lambda$7;
                    applyDisplayCutoutMarginsToContentArea$lambda$7 = InAppMessageFullView.applyDisplayCutoutMarginsToContentArea$lambda$7();
                    return applyDisplayCutoutMarginsToContentArea$lambda$7;
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = contentAreaView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsets) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsets) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToContentArea$lambda$7() {
        return "Content area layout params are null or not of the expected class. Not applying window insets.";
    }
}
