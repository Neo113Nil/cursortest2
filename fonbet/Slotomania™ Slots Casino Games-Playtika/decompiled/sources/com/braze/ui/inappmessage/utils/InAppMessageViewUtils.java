package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageViewUtils.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0002J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0007H\u0007J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\rH\u0007¨\u0006&"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageViewUtils;", "", "()V", "closeInAppMessageOnKeycodeBack", "", "resetMessageMarginsIfNecessary", "messageView", "Landroid/widget/TextView;", "headerView", "setDrawableColor", "drawable", "Landroid/graphics/drawable/Drawable;", "color", "", "setDrawableColorFilter", "setFrameColor", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;Ljava/lang/Integer;)V", "setIcon", "context", "Landroid/content/Context;", "icon", "", "iconColor", "iconBackgroundColor", "textView", "setImage", "bitmap", "Landroid/graphics/Bitmap;", "imageView", "Landroid/widget/ImageView;", "setTextAlignment", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Lcom/braze/enums/inappmessage/TextAlign;", "setTextViewColor", "setViewBackgroundColor", "setViewBackgroundColorFilter", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    private InAppMessageViewUtils() {
    }

    @JvmStatic
    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @JvmStatic
    public static final void setIcon(Context context, String icon, int iconColor, int iconBackgroundColor, TextView textView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (icon != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(icon);
                setTextViewColor(textView, iconColor);
                if (textView.getBackground() != null) {
                    Drawable background = textView.getBackground();
                    Intrinsics.checkNotNullExpressionValue(background, "textView.background");
                    setDrawableColor(background, iconBackgroundColor);
                    return;
                }
                setViewBackgroundColor(textView, iconBackgroundColor);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$setIcon$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Caught exception setting icon typeface. Not rendering icon.";
                    }
                });
            }
        }
    }

    @JvmStatic
    public static final void setFrameColor(View view, Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color == null) {
            return;
        }
        view.setBackgroundColor(color.intValue());
    }

    @JvmStatic
    public static final void setTextViewColor(TextView textView, int color) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor(color);
    }

    @JvmStatic
    public static final void setViewBackgroundColor(View view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(color);
    }

    @JvmStatic
    public static final void setViewBackgroundColorFilter(View view, int color) {
        Intrinsics.checkNotNullParameter(view, "view");
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "view.background");
        inAppMessageViewUtils.setDrawableColorFilter(background, color);
        view.getBackground().setAlpha(Color.alpha(color));
    }

    @JvmStatic
    public static final void setDrawableColor(Drawable drawable, int color) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0 && (layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                Intrinsics.checkNotNullExpressionValue(drawable2, "drawable.getDrawable(0)");
                setDrawableColor(drawable2, color);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$setDrawableColor$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
                    }
                }, 3, (Object) null);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, color);
        }
    }

    @JvmStatic
    public static final void resetMessageMarginsIfNecessary(TextView messageView, TextView headerView) {
        if (headerView != null || messageView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(messageView.getLayoutParams().width, messageView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        messageView.setLayoutParams(layoutParams);
    }

    @JvmStatic
    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Back button intercepted by in-app message view, closing in-app message.";
            }
        }, 3, (Object) null);
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    @JvmStatic
    public static final void setTextAlignment(TextView textView, TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        if (textAlign == TextAlign.START) {
            textView.setGravity(GravityCompat.START);
        } else if (textAlign == TextAlign.END) {
            textView.setGravity(GravityCompat.END);
        } else if (textAlign == TextAlign.CENTER) {
            textView.setGravity(17);
        }
    }

    private final void setDrawableColorFilter(Drawable drawable, int color) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
