package ru.ozon.app.android.navigation.newrouter.ui;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "", "showBottomNavigationWithTranslationAnimation", "", "duration", "", "hideBottomNavigationWithTranslationAnimation", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", "removeListener", "getBottomNavigationAnimationState", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BottomNavigationAnimationController {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void hideBottomNavigationWithTranslationAnimation$default(BottomNavigationAnimationController bottomNavigationAnimationController, long j11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideBottomNavigationWithTranslationAnimation");
            }
            if ((i11 & 1) != 0) {
                j11 = 250;
            }
            bottomNavigationAnimationController.hideBottomNavigationWithTranslationAnimation(j11);
        }

        public static /* synthetic */ void showBottomNavigationWithTranslationAnimation$default(BottomNavigationAnimationController bottomNavigationAnimationController, long j11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBottomNavigationWithTranslationAnimation");
            }
            if ((i11 & 1) != 0) {
                j11 = 250;
            }
            bottomNavigationAnimationController.showBottomNavigationWithTranslationAnimation(j11);
        }
    }

    void addListener(@NotNull BottomNavigationAnimationStateListener listener);

    @NotNull
    TranslateAnimationState getBottomNavigationAnimationState();

    void hideBottomNavigationWithTranslationAnimation(long duration);

    void removeListener(@NotNull BottomNavigationAnimationStateListener listener);

    void showBottomNavigationWithTranslationAnimation(long duration);
}
