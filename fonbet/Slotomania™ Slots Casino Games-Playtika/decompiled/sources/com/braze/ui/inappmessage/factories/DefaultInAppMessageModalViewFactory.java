package com.braze.ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultInAppMessageModalViewFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0003¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageModalViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "()V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getAppropriateModalView", "isGraphic", "", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DefaultInAppMessageModalViewFactory implements IInAppMessageViewFactory {
    private static final float NON_GRAPHIC_ASPECT_RATIO = 2.9f;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InAppMessageModalView createInAppMessageView(Activity activity, IInAppMessage inAppMessage) {
        IInAppMessage iInAppMessage;
        View frameView;
        Integer frameColor;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        InAppMessageModal inAppMessageModal = (InAppMessageModal) inAppMessage;
        boolean z = inAppMessageModal.getImageStyle() == ImageStyle.GRAPHIC;
        InAppMessageModalView appropriateModalView = getAppropriateModalView(activity, z);
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        appropriateModalView.applyInAppMessageParameters(applicationContext, inAppMessageModal);
        String appropriateImageUrl = InAppMessageBaseView.INSTANCE.getAppropriateImageUrl(inAppMessageModal);
        String str = appropriateImageUrl;
        if (str != null && str.length() != 0) {
            IBrazeImageLoader imageLoader = Braze.INSTANCE.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateModalView.getMessageImageView();
            if (messageImageView != null) {
                iInAppMessage = inAppMessage;
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, iInAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.IN_APP_MESSAGE_MODAL);
                frameView = appropriateModalView.getFrameView();
                if (frameView != null) {
                    frameView.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DefaultInAppMessageModalViewFactory.m5224createInAppMessageView$lambda1(DefaultInAppMessageModalViewFactory.this, view);
                        }
                    });
                }
                appropriateModalView.setMessageBackgroundColor(iInAppMessage.getBackgroundColor());
                frameColor = inAppMessageModal.getFrameColor();
                if (frameColor != null) {
                    appropriateModalView.setFrameColor(frameColor.intValue());
                }
                appropriateModalView.setMessageButtons(inAppMessageModal.getMessageButtons());
                appropriateModalView.setMessageCloseButtonColor(inAppMessageModal.getCloseButtonColor());
                if (!z) {
                    String message = iInAppMessage.getMessage();
                    if (message != null) {
                        appropriateModalView.setMessage(message);
                    }
                    appropriateModalView.setMessageTextColor(iInAppMessage.getMessageTextColor());
                    String header = inAppMessageModal.getHeader();
                    if (header != null) {
                        appropriateModalView.setMessageHeaderText(header);
                    }
                    appropriateModalView.setMessageHeaderTextColor(inAppMessageModal.getHeaderTextColor());
                    String icon = iInAppMessage.getIcon();
                    if (icon != null) {
                        appropriateModalView.setMessageIcon(icon, iInAppMessage.getIconColor(), iInAppMessage.getIconBackgroundColor());
                    }
                    appropriateModalView.setMessageHeaderTextAlignment(inAppMessageModal.getHeaderTextAlign());
                    appropriateModalView.setMessageTextAlign(inAppMessageModal.getMessageTextAlign());
                    appropriateModalView.resetMessageMargins(inAppMessageModal.getImageDownloadSuccessful());
                    ImageView messageImageView2 = appropriateModalView.getMessageImageView();
                    if (messageImageView2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
                    }
                    ((InAppMessageImageView) messageImageView2).setAspectRatio(NON_GRAPHIC_ASPECT_RATIO);
                }
                appropriateModalView.setLargerCloseButtonClickArea(appropriateModalView.getMessageCloseButtonView());
                appropriateModalView.setupDirectionalNavigation(inAppMessageModal.getMessageButtons().size());
                return appropriateModalView;
            }
        }
        iInAppMessage = inAppMessage;
        frameView = appropriateModalView.getFrameView();
        if (frameView != null) {
        }
        appropriateModalView.setMessageBackgroundColor(iInAppMessage.getBackgroundColor());
        frameColor = inAppMessageModal.getFrameColor();
        if (frameColor != null) {
        }
        appropriateModalView.setMessageButtons(inAppMessageModal.getMessageButtons());
        appropriateModalView.setMessageCloseButtonColor(inAppMessageModal.getCloseButtonColor());
        if (!z) {
        }
        appropriateModalView.setLargerCloseButtonClickArea(appropriateModalView.getMessageCloseButtonView());
        appropriateModalView.setupDirectionalNavigation(inAppMessageModal.getMessageButtons().size());
        return appropriateModalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createInAppMessageView$lambda-1, reason: not valid java name */
    public static final void m5224createInAppMessageView$lambda1(DefaultInAppMessageModalViewFactory this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (BrazeInAppMessageManager.INSTANCE.getInstance().getDoesClickOutsideModalViewDismissInAppMessageViewField()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory$createInAppMessageView$2$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Dismissing modal after frame click";
                }
            }, 2, (Object) null);
            BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
        }
    }

    private final InAppMessageModalView getAppropriateModalView(Activity activity, boolean isGraphic) {
        if (isGraphic) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_modal_graphic, (ViewGroup) null);
            if (inflate != null) {
                return (InAppMessageModalView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
        }
        View inflate2 = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_modal, (ViewGroup) null);
        if (inflate2 != null) {
            return (InAppMessageModalView) inflate2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageModalView");
    }
}
