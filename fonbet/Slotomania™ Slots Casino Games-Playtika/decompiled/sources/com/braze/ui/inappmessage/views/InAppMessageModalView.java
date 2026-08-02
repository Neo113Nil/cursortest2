package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageModalView.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010+\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.2\u0006\u0010/\u001a\u000200H\u0016J0\u00101\u001a\u00020,2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u0002002\u0006\u00107\u001a\u000200H\u0014J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u000203H\u0016J\u001a\u0010:\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J \u0010;\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020<2\u0006\u0010\u0011\u001a\u00020=H\u0014J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u000200H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\nR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"¨\u0006@"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "frameView", "Landroid/view/View;", "getFrameView", "()Landroid/view/View;", "inAppMessage", "Lcom/braze/models/inappmessage/InAppMessageModal;", "getInAppMessage", "()Lcom/braze/models/inappmessage/InAppMessageModal;", "setInAppMessage", "(Lcom/braze/models/inappmessage/InAppMessageModal;)V", "inAppMessageImageView", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "getInAppMessageImageView", "()Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "setInAppMessageImageView", "(Lcom/braze/ui/inappmessage/views/InAppMessageImageView;)V", "messageBackgroundObject", "Landroid/graphics/drawable/Drawable;", "getMessageBackgroundObject", "()Landroid/graphics/drawable/Drawable;", "messageClickableView", "getMessageClickableView", "messageCloseButtonView", "getMessageCloseButtonView", "messageHeaderTextView", "Landroid/widget/TextView;", "getMessageHeaderTextView", "()Landroid/widget/TextView;", "messageIconView", "getMessageIconView", "messageImageView", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageTextView", "getMessageTextView", "applyInAppMessageParameters", "", "getMessageButtonViews", "", "numButtons", "", "onLayout", "changed", "", "left", "top", TtmlNode.RIGHT, "bottom", "resetMessageMargins", "imageRetrievalSuccessful", "resizeGraphicFrameIfAppropriate", "setInAppMessageImageViewAttributes", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "setMessageBackgroundColor", "color", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private InAppMessageModal inAppMessage;
    private InAppMessageImageView inAppMessageImageView;

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final InAppMessageImageView getInAppMessageImageView() {
        return this.inAppMessageImageView;
    }

    protected final void setInAppMessageImageView(InAppMessageImageView inAppMessageImageView) {
        this.inAppMessageImageView = inAppMessageImageView;
    }

    protected final InAppMessageModal getInAppMessage() {
        return this.inAppMessage;
    }

    protected final void setInAppMessage(InAppMessageModal inAppMessageModal) {
        this.inAppMessage = inAppMessageModal;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_modal_frame);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R.id.com_braze_inappmessage_modal);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView == null) {
            return null;
        }
        return messageClickableView.getBackground();
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.com_braze_inappmessage_modal_image_layout);
        if ((imageRetrievalSuccessful || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View findViewById = findViewById(R.id.com_braze_inappmessage_modal_text_layout);
        if (findViewById == null) {
            return;
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InAppMessageModalView.m5234resetMessageMargins$lambda0(InAppMessageModalView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resetMessageMargins$lambda-0, reason: not valid java name */
    public static final void m5234resetMessageMargins$lambda0(InAppMessageModalView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$resetMessageMargins$1$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Passing scrollView click event to message clickable view.";
            }
        }, 3, (Object) null);
        View messageClickableView = this$0.getMessageClickableView();
        if (messageClickableView == null) {
            return;
        }
        messageClickableView.performClick();
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View findViewById = findViewById(R.id.com_braze_inappmessage_modal);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.com_braze_inappmessage_modal)");
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById, color);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int numButtons) {
        ArrayList arrayList = new ArrayList();
        if (numButtons == 1) {
            View findViewById = findViewById(R.id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R.id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (numButtons == 2) {
            View findViewById3 = findViewById(R.id.com_braze_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R.id.com_braze_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(R.id.com_braze_inappmessage_modal_button_dual_two);
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

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    public void applyInAppMessageParameters(Context context, InAppMessageModal inAppMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(context, inAppMessage, inAppMessageImageView);
        }
        resizeGraphicFrameIfAppropriate(context, inAppMessage);
    }

    protected void setInAppMessageImageViewAttributes(Context context, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageImageView, "inAppMessageImageView");
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(context, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            inAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            inAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, 0.0f, 0.0f);
        }
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
    }

    protected void resizeGraphicFrameIfAppropriate(Context context, InAppMessageModal inAppMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((inAppMessage == null ? null : inAppMessage.getBitmap()) != null && inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            final double width = r0.getWidth() / r0.getHeight();
            Resources resources = context.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_margin);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_max_width);
            final int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_max_height);
            post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InAppMessageModalView.m5235resizeGraphicFrameIfAppropriate$lambda2(InAppMessageModalView.this, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resizeGraphicFrameIfAppropriate$lambda-2, reason: not valid java name */
    public static final void m5235resizeGraphicFrameIfAppropriate$lambda2(InAppMessageModalView this$0, int i, int i2, int i3, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        double min = Math.min(this$0.getMeasuredWidth() - i, i2);
        double min2 = Math.min(this$0.getMeasuredHeight() - i, i3);
        double d2 = min / min2;
        View findViewById = this$0.findViewById(R.id.com_braze_inappmessage_modal_graphic_bound);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (d >= d2) {
                layoutParams2.width = (int) min;
                layoutParams2.height = (int) (min / d);
            } else {
                layoutParams2.width = (int) (d * min2);
                layoutParams2.height = (int) min2;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
    }
}
