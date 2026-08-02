package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation;

import B90.u0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000eJN\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\rH&¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector;", "", "detect", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onTapUp", "Lkotlin/Function0;", "", "onTapDown", "callSuper", "Lkotlin/Function1;", "Default", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LongTapDetector {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector$Default;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector;", "<init>", "()V", "isLongTap", "", "onLongTapDown", "Lkotlin/Function0;", "", "longPressTimeout", "", "onActionDownRunnable", "Ljava/lang/Runnable;", "detect", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "onTapUp", "onTapDown", "callSuper", "Lkotlin/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements LongTapDetector {
        private boolean isLongTap;
        private final long longPressTimeout = ViewConfiguration.getLongPressTimeout();

        @NotNull
        private final Runnable onActionDownRunnable = new u0(this, 2);
        private Function0<Unit> onLongTapDown;

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onActionDownRunnable$lambda$0(Default r12) {
            r12.isLongTap = true;
            Function0<Unit> function0 = r12.onLongTapDown;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.LongTapDetector
        public boolean detect(@NotNull View view, @NotNull MotionEvent event, Function0<Unit> onTapUp, Function0<Unit> onTapDown, @NotNull Function1<? super MotionEvent, Boolean> callSuper) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(callSuper, "callSuper");
            this.onLongTapDown = onTapDown;
            if (onTapUp == null || onTapDown == null) {
                return callSuper.invoke(event).booleanValue();
            }
            int action = event.getAction();
            if (action == 0) {
                this.isLongTap = false;
                view.postDelayed(this.onActionDownRunnable, this.longPressTimeout);
                return true;
            }
            if (action == 1) {
                view.removeCallbacks(this.onActionDownRunnable);
                if (this.isLongTap) {
                    onTapUp.invoke();
                } else {
                    view.performClick();
                }
                return true;
            }
            if (action != 3) {
                return callSuper.invoke(event).booleanValue();
            }
            view.removeCallbacks(this.onActionDownRunnable);
            if (this.isLongTap) {
                onTapUp.invoke();
                this.isLongTap = false;
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean detect$default(LongTapDetector longTapDetector, View view, MotionEvent motionEvent, Function0 function0, Function0 function02, Function1 function1, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: detect");
            }
            if ((i11 & 16) != 0) {
                function1 = LongTapDetector$detect$1.INSTANCE;
            }
            return longTapDetector.detect(view, motionEvent, function0, function02, function1);
        }
    }

    boolean detect(@NotNull View view, @NotNull MotionEvent event, Function0<Unit> onTapUp, Function0<Unit> onTapDown, @NotNull Function1<? super MotionEvent, Boolean> callSuper);
}
