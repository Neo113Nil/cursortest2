package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.F0;
import androidx.core.view.r;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import com.braze.ui.support.ViewUtils;
import com.twilio.voice.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!\u001a\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!\u001a\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!\u001a\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroid/view/View;", "", "removeViewFromParent", "(Landroid/view/View;)V", "setFocusableInTouchModeAndRequestFocus", "Landroid/content/Context;", "context", "", "valueInDp", "convertDpToPixels", "(Landroid/content/Context;D)D", "Landroid/app/Activity;", "", "isRunningOnTablet", "(Landroid/app/Activity;)Z", "", "requestedOrientation", "setActivityRequestedOrientation", "(Landroid/app/Activity;I)V", "view", "height", "setHeightOnViewLayoutParams", "(Landroid/view/View;I)V", "isDeviceInNightMode", "(Landroid/content/Context;)Z", "currentScreenOrientation", "Lcom/braze/enums/inappmessage/Orientation;", "preferredOrientation", "isCurrentOrientationValid", "(ILcom/braze/enums/inappmessage/Orientation;)Z", "Landroidx/core/view/F0;", "windowInsets", "getMaxSafeLeftInset", "(Landroidx/core/view/F0;)I", "getMaxSafeRightInset", "getMaxSafeTopInset", "getMaxSafeBottomInset", "isDeviceNotInTouchMode", "(Landroid/view/View;)Z", "getStatusBarHeight", "(Landroid/content/Context;)I", "", "TAG", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "ViewUtils")
/* loaded from: classes.dex */
public abstract class ViewUtils {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final double convertDpToPixels(@NotNull Context context, double d10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d10 * context.getResources().getDisplayMetrics().density;
    }

    public static final int getMaxSafeBottomInset(@NotNull F0 windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        r e10 = windowInsets.e();
        return Math.max(e10 != null ? e10.a() : 0, windowInsets.f(F0.p.g()).f19101d);
    }

    public static final int getMaxSafeLeftInset(@NotNull F0 windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        r e10 = windowInsets.e();
        return Math.max(e10 != null ? e10.b() : 0, windowInsets.f(F0.p.g()).f19098a);
    }

    public static final int getMaxSafeRightInset(@NotNull F0 windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        r e10 = windowInsets.e();
        return Math.max(e10 != null ? e10.c() : 0, windowInsets.f(F0.p.g()).f19100c);
    }

    public static final int getMaxSafeTopInset(@NotNull F0 windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        r e10 = windowInsets.e();
        return Math.max(e10 != null ? e10.d() : 0, windowInsets.f(F0.p.g()).f19099b);
    }

    public static final int getStatusBarHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", Constants.PLATFORM_ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final boolean isCurrentOrientationValid(final int i10, @NotNull final Orientation preferredOrientation) {
        Intrinsics.checkNotNullParameter(preferredOrientation, "preferredOrientation");
        if (i10 == 2 && preferredOrientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: p4.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isCurrentOrientationValid$lambda$0;
                    isCurrentOrientationValid$lambda$0 = ViewUtils.isCurrentOrientationValid$lambda$0();
                    return isCurrentOrientationValid$lambda$0;
                }
            }, 12, (Object) null);
            return true;
        }
        if (i10 == 1 && preferredOrientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: p4.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isCurrentOrientationValid$lambda$1;
                    isCurrentOrientationValid$lambda$1 = ViewUtils.isCurrentOrientationValid$lambda$1();
                    return isCurrentOrientationValid$lambda$1;
                }
            }, 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: p4.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String isCurrentOrientationValid$lambda$2;
                isCurrentOrientationValid$lambda$2 = ViewUtils.isCurrentOrientationValid$lambda$2(i10, preferredOrientation);
                return isCurrentOrientationValid$lambda$2;
            }
        }, 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$0() {
        return "Current and preferred orientation are landscape.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$1() {
        return "Current and preferred orientation are portrait.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$2(int i10, Orientation orientation) {
        return "Current orientation " + i10 + " and preferred orientation " + orientation + " don't match";
    }

    public static final boolean isDeviceInNightMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDeviceNotInTouchMode(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static final void removeViewFromParent(@Nullable final View view) {
        if (view == null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: p4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeViewFromParent$lambda$0;
                        removeViewFromParent$lambda$0 = ViewUtils.removeViewFromParent$lambda$0();
                        return removeViewFromParent$lambda$0;
                    }
                }, 12, (Object) null);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: p4.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeViewFromParent$lambda$2;
                        removeViewFromParent$lambda$2 = ViewUtils.removeViewFromParent$lambda$2();
                        return removeViewFromParent$lambda$2;
                    }
                }, 8, (Object) null);
                return;
            }
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            final ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: p4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeViewFromParent$lambda$1;
                    removeViewFromParent$lambda$1 = ViewUtils.removeViewFromParent$lambda$1(view, viewGroup);
                    return removeViewFromParent$lambda$1;
                }
            }, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$0() {
        return "View passed in is null. Not removing from parent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$1(View view, ViewGroup viewGroup) {
        return "Removed view: " + view + "\nfrom parent: " + viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$2() {
        return "Caught exception while removing view from parent.";
    }

    public static final void setActivityRequestedOrientation(@NotNull final Activity activity, final int i10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            activity.setRequestedOrientation(i10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: p4.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String activityRequestedOrientation$lambda$0;
                    activityRequestedOrientation$lambda$0 = ViewUtils.setActivityRequestedOrientation$lambda$0(i10, activity);
                    return activityRequestedOrientation$lambda$0;
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setActivityRequestedOrientation$lambda$0(int i10, Activity activity) {
        return "Failed to set requested orientation " + i10 + " for activity class: " + activity.getLocalClassName();
    }

    public static final void setFocusableInTouchModeAndRequestFocus(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: p4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String focusableInTouchModeAndRequestFocus$lambda$0;
                    focusableInTouchModeAndRequestFocus$lambda$0 = ViewUtils.setFocusableInTouchModeAndRequestFocus$lambda$0();
                    return focusableInTouchModeAndRequestFocus$lambda$0;
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFocusableInTouchModeAndRequestFocus$lambda$0() {
        return "Caught exception while setting view to focusable in touch mode and requesting focus.";
    }

    public static final void setHeightOnViewLayoutParams(@NotNull View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }
}
