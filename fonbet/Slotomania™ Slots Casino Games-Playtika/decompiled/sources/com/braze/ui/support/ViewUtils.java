package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0001\u001a\n\u0010\u001b\u001a\u00020\u0010*\u00020\u001c\u001a\f\u0010\u001d\u001a\u00020\u0019*\u0004\u0018\u00010\u0017\u001a\u0012\u0010\u001e\u001a\u00020\u0019*\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0001\u001a\n\u0010 \u001a\u00020\u0019*\u00020\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"TABLET_SMALLEST_WIDTH_DP", "", "TAG", "", "convertDpToPixels", "", "context", "Landroid/content/Context;", "valueInDp", "getMaxSafeBottomInset", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "getMaxSafeLeftInset", "getMaxSafeRightInset", "getMaxSafeTopInset", "isCurrentOrientationValid", "", "currentScreenOrientation", "preferredOrientation", "Lcom/braze/enums/inappmessage/Orientation;", "isDeviceInNightMode", "isDeviceNotInTouchMode", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "setHeightOnViewLayoutParams", "", "height", "isRunningOnTablet", "Landroid/app/Activity;", "removeViewFromParent", "setActivityRequestedOrientation", "requestedOrientation", "setFocusableInTouchModeAndRequestFocus", "android-sdk-ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewUtils {
    private static final int TABLET_SMALLEST_WIDTH_DP = 600;
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final void removeViewFromParent(final View view) {
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$removeViewFromParent$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "View passed in is null. Not removing from parent.";
                }
            }, 4, (Object) null);
        }
        if ((view == null ? null : view.getParent()) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            final ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$removeViewFromParent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Removed view: " + view + "\nfrom parent: " + viewGroup;
                }
            }, 4, (Object) null);
        }
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (Function0<String>) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$setFocusableInTouchModeAndRequestFocus$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Caught exception while setting view to focusable in touch mode and requesting focus.";
                }
            });
        }
    }

    public static final double convertDpToPixels(Context context, double d) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d * context.getResources().getDisplayMetrics().density;
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static final void setActivityRequestedOrientation(final Activity activity, final int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$setActivityRequestedOrientation$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to set requested orientation " + i + " for activity class: " + activity.getLocalClassName();
                }
            });
        }
    }

    public static final void setHeightOnViewLayoutParams(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final boolean isDeviceInNightMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isCurrentOrientationValid(final int i, final Orientation preferredOrientation) {
        Intrinsics.checkNotNullParameter(preferredOrientation, "preferredOrientation");
        if (i == 2 && preferredOrientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Current and preferred orientation are landscape.";
                }
            }, 4, (Object) null);
            return true;
        }
        if (i == 1 && preferredOrientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Current and preferred orientation are portrait.";
                }
            }, 4, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, (Function0) new Function0<String>() { // from class: com.braze.ui.support.ViewUtils$isCurrentOrientationValid$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Current orientation " + i + " and preferred orientation " + preferredOrientation + " don't match";
            }
        }, 4, (Object) null);
        return false;
    }

    public static final int getMaxSafeLeftInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout == null ? 0 : displayCutout.getSafeInsetLeft(), windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).left);
    }

    public static final int getMaxSafeRightInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout == null ? 0 : displayCutout.getSafeInsetRight(), windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).right);
    }

    public static final int getMaxSafeTopInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout == null ? 0 : displayCutout.getSafeInsetTop(), windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).top);
    }

    public static final int getMaxSafeBottomInset(WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
        return Math.max(displayCutout == null ? 0 : displayCutout.getSafeInsetBottom(), windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return !view.isInTouchMode();
    }
}
