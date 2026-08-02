package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util;

import Fq.ViewTreeObserverOnGlobalLayoutListenerC3058a;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bJ\u0010\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001d\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\n \u0011*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper;", "", "<init>", "()V", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "register", "", "activity", "Landroid/app/Activity;", "onVisibilityChanged", "Lkotlin/Function1;", "", "unregister", "isKeyboardVisible", "getActivityRoot", "Landroid/view/View;", "kotlin.jvm.PlatformType", "(Landroid/app/Activity;)Landroid/view/View;", "getContentRoot", "Landroid/view/ViewGroup;", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class KeyboardVisibilityHelper {
    private ViewTreeObserver.OnGlobalLayoutListener layoutListener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/util/KeyboardVisibilityHelper$Companion;", "", "<init>", "()V", "KEYBOARD_MIN_HEIGHT_RATIO", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final View getActivityRoot(Activity activity) {
        return getContentRoot(activity).getRootView();
    }

    private final ViewGroup getContentRoot(Activity activity) {
        return (ViewGroup) activity.findViewById(R.id.content);
    }

    private final boolean isKeyboardVisible(Activity activity) {
        Rect rect = new Rect();
        View activityRoot = getActivityRoot(activity);
        activityRoot.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        getContentRoot(activity).getLocationOnScreen(iArr);
        int height = activityRoot.getRootView().getHeight();
        return ((double) ((height - rect.height()) - iArr[1])) > ((double) height) * 0.15d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(KeyboardVisibilityHelper keyboardVisibilityHelper, Activity activity, Function1 function1) {
        function1.invoke(Boolean.valueOf(keyboardVisibilityHelper.isKeyboardVisible(activity)));
    }

    public final void register(Activity activity, @NotNull Function1<? super Boolean, Unit> onVisibilityChanged) {
        Intrinsics.checkNotNullParameter(onVisibilityChanged, "onVisibilityChanged");
        if (activity == null) {
            return;
        }
        if ((activity.getWindow().getAttributes().softInputMode & 48) == 48) {
            throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
        }
        View activityRoot = getActivityRoot(activity);
        this.layoutListener = new ViewTreeObserverOnGlobalLayoutListenerC3058a(this, activity, onVisibilityChanged, 1);
        activityRoot.getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    public final void unregister(Activity activity) {
        if (activity == null) {
            return;
        }
        getActivityRoot(activity).getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        this.layoutListener = null;
    }
}
