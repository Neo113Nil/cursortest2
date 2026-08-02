package io.radar.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.nimbusds.jose.jwk.JWKParameterNames;
import io.radar.sdk.model.RadarInAppMessage;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarInAppMessageView.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0001H\u0002J\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0002J\u001f\u0010&\u001a\u00020'\"\b\b\u0000\u0010(*\u00020)2\u0006\u0010*\u001a\u0002H(H\u0002¢\u0006\u0002\u0010+JF\u0010,\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0.R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lio/radar/sdk/RadarInAppMessageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDismissListener", "Lkotlin/Function0;", "", "onInAppMessageButtonClicked", "createActionButton", "Landroid/widget/Button;", "button", "Lio/radar/sdk/model/RadarInAppMessage$Button;", "createDismissButton", "Landroid/widget/TextView;", "createHeaderContainer", "createImageContainer", "image", "Landroid/graphics/Bitmap;", "createInAppMessageView", "inAppMessage", "Lio/radar/sdk/model/RadarInAppMessage;", "createMessageView", "body", "Lio/radar/sdk/model/RadarInAppMessage$Body;", "createModalContainer", "Landroid/widget/LinearLayout;", "hasImage", "", "createOverlayBackground", "Landroid/view/View;", "createTitleView", "title", "Lio/radar/sdk/model/RadarInAppMessage$Title;", JWKParameterNames.RSA_FIRST_FACTOR_CRT_EXPONENT, "", ExifInterface.GPS_DIRECTION_TRUE, "", "v", "(Ljava/lang/Number;)F", "initialize", "onViewReady", "Lkotlin/Function1;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarInAppMessageView extends FrameLayout {
    private static final String DISMISS_BUTTON_BACKGROUND_COLOR = "#808080";
    private static final String DISMISS_BUTTON_TEXT_COLOR = "#FFFFFF";
    private static final String MODAL_BACKGROUND_COLOR = "#FFFFFF";
    private static final String OVERLAY_BACKGROUND_COLOR = "#80000000";
    private Function0<Unit> onDismissListener;
    private Function0<Unit> onInAppMessageButtonClicked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarInAppMessageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarInAppMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createModalContainer$lambda$5$lambda$4(View view) {
    }

    public /* synthetic */ RadarInAppMessageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarInAppMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initialize$default(RadarInAppMessageView radarInAppMessageView, RadarInAppMessage radarInAppMessage, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        radarInAppMessageView.initialize(radarInAppMessage, function0, function02, function1);
    }

    public final void initialize(final RadarInAppMessage inAppMessage, Function0<Unit> onDismissListener, Function0<Unit> onInAppMessageButtonClicked, final Function1<? super View, Unit> onViewReady) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(onViewReady, "onViewReady");
        this.onDismissListener = onDismissListener;
        this.onInAppMessageButtonClicked = onInAppMessageButtonClicked;
        RadarInAppMessage.Image image = inAppMessage.getImage();
        Radar.loadImage(image != null ? image.getUrl() : null, new Function1<Bitmap, Unit>() { // from class: io.radar.sdk.RadarInAppMessageView$initialize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Bitmap bitmap) {
                RadarInAppMessageView.this.createInAppMessageView(inAppMessage, bitmap);
                onViewReady.invoke(RadarInAppMessageView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends Number> float dp(T v) {
        return v.floatValue() * getContext().getResources().getDisplayMetrics().density;
    }

    static /* synthetic */ void createInAppMessageView$default(RadarInAppMessageView radarInAppMessageView, RadarInAppMessage radarInAppMessage, Bitmap bitmap, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        radarInAppMessageView.createInAppMessageView(radarInAppMessage, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createInAppMessageView(RadarInAppMessage inAppMessage, Bitmap image) {
        removeAllViews();
        View createOverlayBackground = createOverlayBackground();
        LinearLayout createModalContainer = createModalContainer(image != null);
        if (image != null) {
            createModalContainer.addView(createImageContainer(image));
        } else {
            FrameLayout createHeaderContainer = createHeaderContainer();
            TextView createDismissButton = createDismissButton();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            Unit unit = Unit.INSTANCE;
            createHeaderContainer.addView(createDismissButton, layoutParams);
            createModalContainer.addView(createHeaderContainer);
        }
        createModalContainer.addView(createTitleView(inAppMessage.getTitle()));
        createModalContainer.addView(createMessageView(inAppMessage.getBody()));
        if (inAppMessage.getButton() != null) {
            createModalContainer.addView(createActionButton(inAppMessage.getButton()));
        }
        addView(createOverlayBackground);
        addView(createModalContainer);
    }

    private final View createOverlayBackground() {
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(Color.parseColor(OVERLAY_BACKGROUND_COLOR));
        view.setOnClickListener(new View.OnClickListener() { // from class: io.radar.sdk.RadarInAppMessageView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RadarInAppMessageView.createOverlayBackground$lambda$2$lambda$1(RadarInAppMessageView.this, view2);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOverlayBackground$lambda$2$lambda$1(RadarInAppMessageView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    static /* synthetic */ LinearLayout createModalContainer$default(RadarInAppMessageView radarInAppMessageView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return radarInAppMessageView.createModalContainer(z);
    }

    private final LinearLayout createModalContainer(boolean hasImage) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        if (hasImage) {
            linearLayout.setPadding(0, 0, 0, 40);
        } else {
            linearLayout.setPadding(40, 40, 40, 40);
        }
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams((int) dp((Number) 350), -2, 17));
        linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: io.radar.sdk.RadarInAppMessageView$createModalContainer$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float dp;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                int width = view.getWidth();
                int height = view.getHeight();
                dp = RadarInAppMessageView.this.dp((Number) 20);
                outline.setRoundRect(0, 0, width, height, dp);
            }
        });
        linearLayout.setClipToOutline(true);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: io.radar.sdk.RadarInAppMessageView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadarInAppMessageView.createModalContainer$lambda$5$lambda$4(view);
            }
        });
        return linearLayout;
    }

    private final TextView createTitleView(RadarInAppMessage.Title title) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(Color.parseColor(title.getColor()));
        textView.setTextSize(2, 34.0f);
        textView.setTypeface(null, 1);
        textView.setText(title.getText());
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, 15);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dp((Number) 310), -2);
        layoutParams.setMargins(48, 0, 48, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private final TextView createMessageView(RadarInAppMessage.Body body) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(Color.parseColor(body.getColor()));
        textView.setTextSize(2, 17.0f);
        textView.setText(body.getText());
        textView.setGravity(17);
        textView.setLineSpacing(0.0f, 1.2f);
        textView.setPadding(0, 0, 0, 50);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dp((Number) 310), -2);
        layoutParams.setMargins(48, 0, 48, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private final Button createActionButton(RadarInAppMessage.Button button) {
        Button button2 = new Button(getContext());
        button2.setText(button.getText());
        button2.setTransformationMethod(null);
        button2.setTextColor(Color.parseColor(button.getColor()));
        button2.setTextSize(2, 22.0f);
        button2.setTypeface(null, 1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 12.0f, button2.getContext().getResources().getDisplayMetrics()));
        gradientDrawable.setColor(Color.parseColor(button.getBackgroundColor()));
        button2.setBackground(gradientDrawable);
        button2.setStateListAnimator(null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dp((Number) 310), (int) dp((Number) 50));
        layoutParams.setMargins(48, 0, 48, 0);
        button2.setLayoutParams(layoutParams);
        button2.setOnClickListener(new View.OnClickListener() { // from class: io.radar.sdk.RadarInAppMessageView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadarInAppMessageView.createActionButton$lambda$13$lambda$12(RadarInAppMessageView.this, view);
            }
        });
        return button2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionButton$lambda$13$lambda$12(RadarInAppMessageView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onInAppMessageButtonClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final TextView createDismissButton() {
        TextView textView = new TextView(getContext());
        Drawable drawable = ContextCompat.getDrawable(textView.getContext(), R.drawable.close);
        if (drawable != null) {
            drawable.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(DISMISS_BUTTON_BACKGROUND_COLOR));
        gradientDrawable.setAlpha(127);
        textView.setBackground(gradientDrawable);
        textView.setPadding(18, 12, 18, 12);
        textView.setOnClickListener(new View.OnClickListener() { // from class: io.radar.sdk.RadarInAppMessageView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadarInAppMessageView.createDismissButton$lambda$17$lambda$16(RadarInAppMessageView.this, view);
            }
        });
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDismissButton$lambda$17$lambda$16(RadarInAppMessageView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final FrameLayout createHeaderContainer() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(0, 0, 0, 20);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    private final FrameLayout createImageContainer(Bitmap image) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) dp((Number) 200));
        layoutParams.setMargins(0, 0, 0, 24);
        frameLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setImageBitmap(image);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView);
        TextView createDismissButton = createDismissButton();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388661;
        int dp = (int) dp((Number) 12);
        layoutParams2.setMargins(dp, dp, dp, dp);
        createDismissButton.setLayoutParams(layoutParams2);
        frameLayout.addView(createDismissButton);
        return frameLayout;
    }
}
