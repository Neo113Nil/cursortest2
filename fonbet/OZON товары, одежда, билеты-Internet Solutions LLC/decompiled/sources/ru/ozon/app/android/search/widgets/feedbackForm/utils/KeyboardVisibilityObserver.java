package ru.ozon.app.android.search.widgets.feedbackForm.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.utils.KeyboardVisibilityObserver;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0006\u0010\u0017\u001a\u00020\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/utils/KeyboardVisibilityObserver;", "", "<init>", "()V", "bottomSheetView", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "", "minKeyboardHeightRatio", "", "screenHeight", "getScreenHeight", "()F", "threshold", "getThreshold", "defaultBottomPosition", "", "keyboardOpened", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "setListener", "clear", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class KeyboardVisibilityObserver {
    private View bottomSheetView;
    private int defaultBottomPosition;
    private boolean keyboardOpened;
    private Function1<? super Boolean, Unit> listener;
    private final float minKeyboardHeightRatio = 0.25f;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tI.a
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            KeyboardVisibilityObserver.layoutListener$lambda$0(KeyboardVisibilityObserver.this);
        }
    };

    private final float getScreenHeight() {
        View rootView;
        View view = this.bottomSheetView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return 0.0f;
        }
        return rootView.getHeight();
    }

    private final float getThreshold() {
        return getScreenHeight() * this.minKeyboardHeightRatio;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutListener$lambda$0(KeyboardVisibilityObserver keyboardVisibilityObserver) {
        int i11 = keyboardVisibilityObserver.defaultBottomPosition;
        View view = keyboardVisibilityObserver.bottomSheetView;
        boolean z11 = ((float) (i11 - (view != null ? view.getBottom() : i11))) >= keyboardVisibilityObserver.getThreshold();
        if (z11 && !keyboardVisibilityObserver.keyboardOpened) {
            keyboardVisibilityObserver.keyboardOpened = true;
            Function1<? super Boolean, Unit> function1 = keyboardVisibilityObserver.listener;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (z11 || !keyboardVisibilityObserver.keyboardOpened) {
            return;
        }
        keyboardVisibilityObserver.keyboardOpened = false;
        Function1<? super Boolean, Unit> function12 = keyboardVisibilityObserver.listener;
        if (function12 != null) {
            function12.invoke(Boolean.FALSE);
        }
    }

    public final void clear() {
        ViewTreeObserver viewTreeObserver;
        View view = this.bottomSheetView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.layoutListener);
        }
        this.bottomSheetView = null;
        this.listener = null;
    }

    public final void setListener(@NotNull View bottomSheetView, @NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(bottomSheetView, "bottomSheetView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.bottomSheetView = bottomSheetView;
        this.listener = listener;
        this.defaultBottomPosition = bottomSheetView.getBottom();
        bottomSheetView.getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }
}
