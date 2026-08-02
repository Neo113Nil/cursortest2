package w90;

import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment;
import ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment;
import ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment;
import ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment;
import ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment;

/* loaded from: classes3.dex */
public interface b extends X30.a {
    void A0(@NotNull FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment);

    void H0(@NotNull AntifraudJsonFragment antifraudJsonFragment);

    void L0(@NotNull FintechPreferencesFragment fintechPreferencesFragment);

    void Z0(@NotNull FintechCbdcFragment fintechCbdcFragment);

    void i(@NotNull FintechScannerSettingsFragment fintechScannerSettingsFragment);

    void o0(@NotNull TestingFeaturesV1EditFragment testingFeaturesV1EditFragment);

    void p1(@NotNull FintechThemeFragment fintechThemeFragment);

    void q0(@NotNull TestingFeaturesV2EditFragment testingFeaturesV2EditFragment);

    void r(@NotNull InputPlaygroundFragment inputPlaygroundFragment);

    void s(@NotNull FintechCameraSettingsFragment fintechCameraSettingsFragment);

    void v(@NotNull FintechLogCatFragment fintechLogCatFragment);
}
