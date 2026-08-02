package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.Orientation;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.R;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.support.ViewUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultInAppMessageFullViewFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageFullViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageFullView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getAppropriateFullView", "isGraphic", "", "resetLayoutParamsIfAppropriate", ViewHierarchyConstants.VIEW_KEY, k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultInAppMessageFullViewFactory implements IInAppMessageViewFactory {
    private static final int BUTTONS_PRESENT_SCROLLVIEW_EXCESS_HEIGHT_VALUE_IN_DP = 64;

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageFullView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        final Context applicationContext = activity.getApplicationContext();
        final InAppMessageFull inAppMessageFull = (InAppMessageFull) inAppMessage;
        boolean z = inAppMessageFull.getImageStyle() == ImageStyle.GRAPHIC;
        final InAppMessageFullView appropriateFullView = getAppropriateFullView(activity, z);
        appropriateFullView.createAppropriateViews(activity, inAppMessageFull, z);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageFull);
        String str = appropriateImageUrl;
        if (str != null && str.length() != 0) {
            Braze.Companion companion = Braze.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            IBrazeImageLoader imageLoader = companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateFullView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, inAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.NO_BOUNDS);
            }
        }
        View frameView = appropriateFullView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(null);
        }
        appropriateFullView.setMessageBackgroundColor(inAppMessageFull.getBackgroundColor());
        Integer frameColor = inAppMessageFull.getFrameColor();
        if (frameColor != null) {
            appropriateFullView.setFrameColor(frameColor.intValue());
        }
        appropriateFullView.setMessageButtons(inAppMessageFull.getMessageButtons());
        appropriateFullView.setMessageCloseButtonColor(inAppMessageFull.getCloseButtonColor());
        if (!z) {
            String message = inAppMessageFull.getMessage();
            if (message != null) {
                appropriateFullView.setMessage(message);
            }
            appropriateFullView.setMessageTextColor(inAppMessageFull.getMessageTextColor());
            String header = inAppMessageFull.getHeader();
            if (header != null) {
                appropriateFullView.setMessageHeaderText(header);
            }
            appropriateFullView.setMessageHeaderTextColor(inAppMessageFull.getHeaderTextColor());
            appropriateFullView.setMessageHeaderTextAlignment(inAppMessageFull.getHeaderTextAlign());
            appropriateFullView.setMessageTextAlign(inAppMessageFull.getMessageTextAlign());
            appropriateFullView.resetMessageMargins(inAppMessageFull.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateFullView.getMessageImageView();
            if (messageImageView2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
            ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
        }
        appropriateFullView.setLargerCloseButtonClickArea(appropriateFullView.getMessageCloseButtonView());
        resetLayoutParamsIfAppropriate(activity, inAppMessageFull, appropriateFullView);
        appropriateFullView.setupDirectionalNavigation(inAppMessageFull.getMessageButtons().size());
        final View findViewById = appropriateFullView.findViewById(R.id.com_braze_inappmessage_full_scrollview);
        if (findViewById == null) {
            return appropriateFullView;
        }
        final View findViewById2 = appropriateFullView.findViewById(R.id.com_braze_inappmessage_full_all_content_parent);
        findViewById.post(new Runnable() { // from class: com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DefaultInAppMessageFullViewFactory.m5223createInAppMessageView$lambda4(findViewById2, appropriateFullView, inAppMessageFull, applicationContext, findViewById);
            }
        });
        return appropriateFullView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createInAppMessageView$lambda-4, reason: not valid java name */
    public static final void m5223createInAppMessageView$lambda4(View view, InAppMessageFullView view2, InAppMessageFull inAppMessageFull, Context applicationContext, View scrollView) {
        Intrinsics.checkNotNullParameter(view2, "$view");
        Intrinsics.checkNotNullParameter(inAppMessageFull, "$inAppMessageFull");
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = view2.findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        if (!inAppMessageFull.getMessageButtons().isEmpty()) {
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            i += (int) ViewUtils.convertDpToPixels(applicationContext, 64.0d);
        }
        int min = Math.min(scrollView.getHeight(), height - i);
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        ViewUtils.setHeightOnViewLayoutParams(scrollView, min);
        scrollView.requestLayout();
        ImageView messageImageView = view2.getMessageImageView();
        if (messageImageView == null) {
            return;
        }
        messageImageView.requestLayout();
    }

    private final boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage inAppMessage, InAppMessageFullView view) {
        RelativeLayout.LayoutParams layoutParams;
        if (!ViewUtils.isRunningOnTablet(activity) || inAppMessage.getOrientation() == Orientation.ANY) {
            return false;
        }
        int longEdge = view.getLongEdge();
        int shortEdge = view.getShortEdge();
        if (longEdge <= 0 || shortEdge <= 0) {
            return false;
        }
        if (inAppMessage.getOrientation() == Orientation.LANDSCAPE) {
            layoutParams = new RelativeLayout.LayoutParams(longEdge, shortEdge);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(shortEdge, longEdge);
        }
        layoutParams.addRule(13, -1);
        View messageBackgroundObject = view.getMessageBackgroundObject();
        if (messageBackgroundObject == null) {
            return true;
        }
        messageBackgroundObject.setLayoutParams(layoutParams);
        return true;
    }

    public final InAppMessageFullView getAppropriateFullView(Activity activity, boolean isGraphic) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isGraphic) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            if (inflate != null) {
                return (InAppMessageFullView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
        }
        View inflate2 = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_full, (ViewGroup) null);
        if (inflate2 != null) {
            return (InAppMessageFullView) inflate2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
    }
}
