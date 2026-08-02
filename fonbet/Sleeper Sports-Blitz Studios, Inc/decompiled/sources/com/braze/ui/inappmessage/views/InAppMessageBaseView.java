package com.braze.ui.inappmessage.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.support.ViewUtils;
import io.sentry.Session;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InAppMessageBaseView.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0016J \u00100\u001a\u00020#2\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\u000fH\u0016J\u0010\u00106\u001a\u00020#2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020#H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006>"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "messageClickableView", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "hasAppliedWindowInsets", "", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "messageTextView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageIconView", "getMessageIconView", "messageBackgroundObject", "", "getMessageBackgroundObject", "()Ljava/lang/Object;", "setMessageBackgroundColor", "", "color", "", "setMessageTextColor", "setMessageTextAlign", "textAlign", "Lcom/braze/enums/inappmessage/TextAlign;", "setMessage", "text", "", "setMessageImageView", "bitmap", "Landroid/graphics/Bitmap;", "setMessageIcon", "icon", "iconColor", "iconBackgroundColor", "resetMessageMargins", "imageRetrievalSuccessful", "applyWindowInsets", "insets", "Landroidx/core/view/WindowInsetsCompat;", "onBackProgressed", "backEvent", "Landroid/window/BackEvent;", "onBackCancelled", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView, IInAppMessageBackEventListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float PREDICTIVE_BACK_MAX_SCALE_FACTOR = 0.85f;
    private static final int TRANSLATE_X_FACTOR = 2;
    private static final int TRANSLATE_Y_FACTOR = 8;
    private boolean hasAppliedWindowInsets;

    @JvmStatic
    public static final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
        return INSTANCE.getAppropriateImageUrl(iInAppMessageWithImage);
    }

    public abstract Object getMessageBackgroundObject();

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

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
        Intrinsics.checkNotNull(messageBackgroundObject, "null cannot be cast to non-null type android.view.View");
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, color);
    }

    public void setMessageTextColor(int color) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, color);
        }
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    public void setMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setText(text);
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageIcon(String icon, int iconColor, int iconBackgroundColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InAppMessageViewUtils.setIcon(context, icon, iconColor, iconBackgroundColor, messageIconView);
        }
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

    @Override // com.braze.ui.inappmessage.views.IInAppMessageBackEventListener
    public void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        if (Build.VERSION.SDK_INT >= 34) {
            float width = getWidth();
            float height = getHeight();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 0.85f), ObjectAnimator.ofFloat(this, "scaleY", 0.85f), ObjectAnimator.ofFloat(this, "translationX", (width - (width * 0.85f)) / 2), ObjectAnimator.ofFloat(this, "translationY", (height - (height * 0.85f)) / 8));
            animatorSet.start();
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageBackEventListener
    public void onBackCancelled() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f), ObjectAnimator.ofFloat(this, "translationX", 0.0f));
        animatorSet.start();
    }

    /* compiled from: InAppMessageBaseView.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageBaseView$Companion;", "", "<init>", "()V", "PREDICTIVE_BACK_MAX_SCALE_FACTOR", "", "TRANSLATE_X_FACTOR", "", "TRANSLATE_Y_FACTOR", "getAppropriateImageUrl", "", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageWithImage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.InAppMessageBaseView$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String appropriateImageUrl$lambda$0;
                        appropriateImageUrl$lambda$0 = InAppMessageBaseView.Companion.getAppropriateImageUrl$lambda$0(localImageUrl);
                        return appropriateImageUrl$lambda$0;
                    }
                }, 6, (Object) null);
            }
            return inAppMessage.getRemoteImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getAppropriateImageUrl$lambda$0(String str) {
            return "Local bitmap file does not exist. Using remote url instead. Local path: " + str;
        }
    }
}
