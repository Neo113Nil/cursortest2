package com.socure.docv.capturesdk.common.utils;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDirections;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.mlkit.vision.text.Text;
import com.henninghall.date_picker.props.TextColorProp;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.ApiType;
import com.socure.docv.capturesdk.core.pipeline.model.ApiResponse;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import io.intercom.android.sdk.annotations.SeenState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import retrofit2.Response;

/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a(\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\r0\u000eH\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\r*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\r0\u000eH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001e\u001a\u00020\f*\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0000\u001a1\u0010 \u001a\u00020\f*\u00020\u001a2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\"\u001a\u00020\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\r0\u000eH\u0000\u001a\f\u0010&\u001a\u00020\f*\u00020\u0004H\u0000\u001a\u0018\u0010'\u001a\u00020(*\u0006\u0012\u0002\b\u00030)2\u0006\u0010*\u001a\u00020+H\u0000\u001a\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010-*\b\u0012\u0004\u0012\u00020/0.H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"TAG", "", "getDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "Landroid/view/View;", "getSerializable", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", "Landroid/content/Intent;", SDKConstants.PARAM_KEY, "(Landroid/content/Intent;Ljava/lang/String;)Ljava/io/Serializable;", SeenState.HIDE, "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "isNotVisible", "", "percent", "", "", "safeNavigate", "Landroidx/navigation/NavController;", "direction", "Landroidx/navigation/NavDirections;", "id", "setCorner", "Landroid/widget/TextView;", "color", "strokeColor", "setCornerStroke", "setTint", "Landroid/widget/ImageView;", "setupText", "tvText", TextColorProp.name, "visibilityFlag", "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "show", "showWithFadeInAnimation", "toApiResponse", "Lcom/socure/docv/capturesdk/core/pipeline/model/ApiResponse;", "Lretrofit2/Response;", "apiType", "Lcom/socure/docv/capturesdk/common/network/model/ApiType;", "toStringList", "", "", "Lcom/google/mlkit/vision/text/Text$TextBlock;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtensionsKt {
    private static final String TAG = "SDLT_EXT";

    public static final double percent(int i, double d) {
        return (i * d) / 100;
    }

    public static final void setCorner(TextView textView, String color, String strokeColor) {
        GradientDrawable gradientDrawable;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(strokeColor, "strokeColor");
        Drawable background = textView.getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawable = ((RippleDrawable) background).getDrawable(0);
            Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            gradientDrawable = (GradientDrawable) drawable;
        } else {
            gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        }
        if (gradientDrawable != null) {
            gradientDrawable.setColor(Color.parseColor(color));
        }
        int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 1.0f, textView.getResources().getDisplayMetrics()));
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(roundToInt, Color.parseColor(strokeColor));
        }
        if (textView.getBackground() instanceof RippleDrawable) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        textView.getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true);
        textView.setBackground(new RippleDrawable(ColorStateList.valueOf(typedValue.data), gradientDrawable, null));
    }

    public static final void setCornerStroke(TextView textView, String strokeColor) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(strokeColor, "strokeColor");
        Drawable background = textView.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        Drawable drawable = ((RippleDrawable) background).getDrawable(0);
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setStroke(MathKt.roundToInt(TypedValue.applyDimension(1, 1.0f, textView.getResources().getDisplayMetrics())), Color.parseColor(strokeColor));
    }

    public static /* synthetic */ void setupText$default(TextView textView, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        setupText(textView, str, str2, num);
    }

    public static final void setupText(TextView textView, String str, String textColor, Integer num) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        if (str != null) {
            textView.setText(str);
        }
        textView.setTextColor(Color.parseColor(textColor));
        if (num != null) {
            textView.setVisibility(num.intValue());
        }
        textView.setImportantForAccessibility(1);
        textView.setContentDescription(str);
    }

    public static final void safeNavigate(NavController navController, NavDirections direction) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        LoggerKt.logD(TAG, "safeNavigate called actionId: " + direction.getActionId());
        NavDestination currentDestination = navController.getCurrentDestination();
        Unit unit = null;
        if (currentDestination != null) {
            if (currentDestination.getAction(direction.getActionId()) != null) {
                try {
                    navController.navigate(direction);
                } catch (Exception e) {
                    LoggerKt.logD(TAG, "safeNavigate exception: " + e.getLocalizedMessage());
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                LoggerKt.logD(TAG, "safeNavigate getAction null");
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LoggerKt.logD(TAG, "safeNavigate currentDestination null");
        }
    }

    public static final void safeNavigate(NavController navController, int i) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        LoggerKt.logD(TAG, "navigate called using action id: " + i);
        navController.navigate(i);
    }

    public static final List<String> toStringList(List<? extends Text.TextBlock> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String text = ((Text.TextBlock) it.next()).getText();
            Intrinsics.checkNotNullExpressionValue(text, "it.text");
            arrayList.add(text);
        }
        return arrayList;
    }

    public static final ApiResponse toApiResponse(Response<?> response, ApiType apiType) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(apiType, "apiType");
        Pair<Integer, String> errorSocureSdkResponseHttpInfo = ErrorHandlerKt.getErrorSocureSdkResponseHttpInfo(response.errorBody());
        int intValue = errorSocureSdkResponseHttpInfo.getFirst().intValue();
        String second = errorSocureSdkResponseHttpInfo.getSecond();
        int code = response.code();
        String message = response.message();
        Intrinsics.checkNotNullExpressionValue(message, "this.message()");
        return new ApiResponse(apiType, intValue, second, code, message);
    }

    public static final <V extends View> void show(BottomSheetBehavior<V> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setState(3);
    }

    public static final <V extends View> void hide(BottomSheetBehavior<V> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.setState(5);
    }

    public static final <V extends View> boolean isNotVisible(BottomSheetBehavior<V> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        return bottomSheetBehavior.getState() == 5;
    }

    public static final void showWithFadeInAnimation(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), com.socure.docv.capturesdk.R.anim.fade_in));
    }

    public static final Dimension getDimension(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new Dimension(view.getWidth(), view.getHeight());
    }

    public static final void setTint(ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        DrawableCompat.setTint(imageView.getDrawable(), i);
    }

    public static final /* synthetic */ <T extends Serializable> T getSerializable(Intent intent, String key) {
        Serializable serializableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            serializableExtra = intent.getSerializableExtra(key, Serializable.class);
            return (T) serializableExtra;
        }
        T t = (T) intent.getSerializableExtra(key);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t;
    }
}
