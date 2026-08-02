package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.sentry.Session;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InAppMessageBaseView.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0016J \u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0016J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u00068"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "hasAppliedWindowInsets", "", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "messageBackgroundObject", "", "getMessageBackgroundObject", "()Ljava/lang/Object;", "messageClickableView", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageIconView", "Landroid/widget/TextView;", "getMessageIconView", "()Landroid/widget/TextView;", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageTextView", "getMessageTextView", "applyWindowInsets", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "resetMessageMargins", "imageRetrievalSuccessful", "setMessage", "text", "", "setMessageBackgroundColor", "color", "", "setMessageIcon", "icon", "iconColor", "iconBackgroundColor", "setMessageImageView", "bitmap", "Landroid/graphics/Bitmap;", "setMessageTextAlign", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Lcom/braze/enums/inappmessage/TextAlign;", "setMessageTextColor", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean hasAppliedWindowInsets;

    @JvmStatic
    public static final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
        return INSTANCE.getAppropriateImageUrl(iInAppMessageWithImage);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract Object getMessageBackgroundObject();

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setMessageBackgroundColor(int color) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        if (messageBackgroundObject == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, color);
    }

    public void setMessageTextColor(int color) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView == null) {
            return;
        }
        InAppMessageViewUtils.setTextViewColor(messageTextView, color);
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView == null) {
            return;
        }
        InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
    }

    public void setMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView == null) {
            return;
        }
        messageTextView.setText(text);
    }

    public void setMessageImageView(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView == null) {
            return;
        }
        InAppMessageViewUtils.setImage(bitmap, messageImageView);
    }

    public void setMessageIcon(String icon, int iconColor, int iconBackgroundColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        InAppMessageViewUtils.setIcon(context, icon, iconColor, iconBackgroundColor, messageIconView);
    }

    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        CharSequence text;
        String obj;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!imageRetrievalSuccessful) {
                ViewUtils.removeViewFromParent(messageImageView);
            } else {
                ViewUtils.removeViewFromParent(getMessageIconView());
            }
        }
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null || (text = messageIconView.getText()) == null || (obj = text.toString()) == null || !StringsKt.isBlank(obj)) {
            return;
        }
        ViewUtils.removeViewFromParent(getMessageIconView());
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setHasAppliedWindowInsets(true);
    }

    /* compiled from: InAppMessageBaseView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView$Companion;", "", "()V", "getAppropriateImageUrl", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String getAppropriateImageUrl(IInAppMessageWithImage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            final String localImageUrl = inAppMessage.getLocalImageUrl();
            String str = localImageUrl;
            if (str != null && !StringsKt.isBlank(str)) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.D, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageBaseView$Companion$getAppropriateImageUrl$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Local bitmap file does not exist. Using remote url instead. Local path: ", localImageUrl);
                    }
                }, 2, (Object) null);
            }
            return inAppMessage.getRemoteImageUrl();
        }
    }
}
