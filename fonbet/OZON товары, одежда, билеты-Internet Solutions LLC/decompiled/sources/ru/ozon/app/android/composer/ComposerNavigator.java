package ru.ozon.app.android.composer;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import uZ.C9992d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJA\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/composer/ComposerNavigator;", "", "", "popBackStack", "()V", "", "deeplink", "", "properties", "openDeeplink", "(Ljava/lang/String;Ljava/util/Map;)V", "fragmentTag", "", "targetRequestCode", "LuZ/d$b;", "navigationMode", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "openDeeplinkInBottomSheet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LuZ/d$b;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "openBottomSheet", "(Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/Integer;LuZ/d$b;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;)V", "LpZ/f;", "destination", "navigate", "(LpZ/f;Ljava/lang/Integer;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerNavigator {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void openBottomSheet$default(ComposerNavigator composerNavigator, String str, ComposerScreenConfig composerScreenConfig, Integer num, C9992d.b bVar, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openBottomSheet");
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            if ((i11 & 8) != 0) {
                bVar = C9992d.b.a.f100436a;
            }
            if ((i11 & 16) != 0) {
                overrideDisplayMode = null;
            }
            composerNavigator.openBottomSheet(str, composerScreenConfig, num, bVar, overrideDisplayMode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openDeeplink$default(ComposerNavigator composerNavigator, String str, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDeeplink");
            }
            if ((i11 & 2) != 0) {
                map = U.c();
            }
            composerNavigator.openDeeplink(str, map);
        }

        public static /* synthetic */ void openDeeplinkInBottomSheet$default(ComposerNavigator composerNavigator, String str, String str2, Integer num, C9992d.b bVar, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDeeplinkInBottomSheet");
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            if ((i11 & 8) != 0) {
                bVar = C9992d.b.a.f100436a;
            }
            if ((i11 & 16) != 0) {
                overrideDisplayMode = null;
            }
            composerNavigator.openDeeplinkInBottomSheet(str, str2, num, bVar, overrideDisplayMode);
        }
    }

    void navigate(@NotNull f destination, Integer targetRequestCode);

    void openBottomSheet(@NotNull String fragmentTag, @NotNull ComposerScreenConfig config, Integer targetRequestCode, @NotNull C9992d.b navigationMode, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode);

    void openDeeplink(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties);

    void openDeeplinkInBottomSheet(@NotNull String fragmentTag, @NotNull String deeplink, Integer targetRequestCode, @NotNull C9992d.b navigationMode, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode);

    void popBackStack();
}
