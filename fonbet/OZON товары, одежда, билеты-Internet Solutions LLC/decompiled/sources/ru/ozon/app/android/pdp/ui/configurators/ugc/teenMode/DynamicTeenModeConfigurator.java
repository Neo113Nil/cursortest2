package ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;

@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/DynamicTeenModeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/BaseTeenModeConfigurator;", "<init>", "()V", "bottomNavListener", "ru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/DynamicTeenModeConfigurator$bottomNavListener$1", "Lru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/DynamicTeenModeConfigurator$bottomNavListener$1;", "applyTeenModeSettings", "", "restoreSettings", "getBottomNavigationController", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicTeenModeConfigurator extends BaseTeenModeConfigurator {

    @NotNull
    private final DynamicTeenModeConfigurator$bottomNavListener$1 bottomNavListener = new BottomNavigationAnimationStateListener() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.DynamicTeenModeConfigurator$bottomNavListener$1

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TranslateAnimationState.values().length];
                try {
                    iArr[TranslateAnimationState.HIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TranslateAnimationState.SHOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener
        public void onBottomNavigationAnimationChanged(TranslateAnimationState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1) {
                DynamicTeenModeConfigurator.this.applyTransparentNavBar();
            } else {
                if (i11 != 2) {
                    return;
                }
                DynamicTeenModeConfigurator.this.restoreDefaultSettings();
            }
        }
    };

    private final BottomNavigationAnimationController getBottomNavigationController() {
        ComponentCallbacksC5392m parentFragment;
        ComponentCallbacksC5392m c11 = getContainer().c();
        InterfaceC5431s parentFragment2 = (c11 == null || (parentFragment = c11.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
        if (parentFragment2 instanceof BottomNavigationAnimationController) {
            return (BottomNavigationAnimationController) parentFragment2;
        }
        return null;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.BaseTeenModeConfigurator
    protected void applyTeenModeSettings() {
        BottomNavigationAnimationController bottomNavigationController = getBottomNavigationController();
        if (bottomNavigationController != null) {
            bottomNavigationController.addListener(this.bottomNavListener);
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.BaseTeenModeConfigurator
    protected void restoreSettings() {
        BottomNavigationAnimationController bottomNavigationController = getBottomNavigationController();
        if (bottomNavigationController != null) {
            bottomNavigationController.removeListener(this.bottomNavListener);
        }
        restoreDefaultSettings();
    }
}
