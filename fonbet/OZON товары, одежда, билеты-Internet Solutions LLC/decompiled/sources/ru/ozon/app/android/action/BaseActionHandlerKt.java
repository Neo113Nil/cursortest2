package ru.ozon.app.android.action;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toBottomSheetConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "action_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseActionHandlerKt {
    @NotNull
    public static final ComposerScreenConfig.BottomSheetConfig toBottomSheetConfig(@NotNull AtomAction.CurtainShowConfig curtainShowConfig) {
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2;
        Intrinsics.checkNotNullParameter(curtainShowConfig, "<this>");
        if (curtainShowConfig instanceof AtomAction.CurtainShowConfig.Full) {
            bottomSheetConfig2 = new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, false, false, false, false, 2046, null);
        } else {
            if (curtainShowConfig instanceof AtomAction.CurtainShowConfig.Wrap) {
                Integer minimumHeight = ((AtomAction.CurtainShowConfig.Wrap) curtainShowConfig).getMinimumHeight();
                bottomSheetConfig = new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, minimumHeight != null ? ResourceExtKt.toPx(minimumHeight.intValue()) : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT(), false, false, false, false, false, false, 2030, null);
            } else if (curtainShowConfig instanceof AtomAction.CurtainShowConfig.Ratio) {
                bottomSheetConfig2 = new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.REGULAR, false, false, null, 0, false, false, false, false, false, false, 2046, null);
            } else {
                if (!(curtainShowConfig instanceof AtomAction.CurtainShowConfig.None)) {
                    throw new o();
                }
                bottomSheetConfig = new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 2046, null);
            }
            bottomSheetConfig2 = bottomSheetConfig;
        }
        return (ComposerScreenConfig.BottomSheetConfig) WhenExtKt.getExhaustive(bottomSheetConfig2);
    }
}
