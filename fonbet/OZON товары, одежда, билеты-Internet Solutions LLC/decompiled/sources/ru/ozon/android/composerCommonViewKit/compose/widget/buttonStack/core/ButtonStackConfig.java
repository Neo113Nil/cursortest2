package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/core/ButtonStackConfig;", "", "<init>", "()V", "", "Lru/ozon/composer/compose/widget/WidgetVersion;", "supportedVersions", "[J", "getSupportedVersions", "()[J", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonStackConfig {

    @NotNull
    public static final ButtonStackConfig INSTANCE = new ButtonStackConfig();

    @NotNull
    private static final long[] supportedVersions = k.a(1);
    public static final int $stable = 8;

    private ButtonStackConfig() {
    }

    @NotNull
    public final long[] getSupportedVersions() {
        return supportedVersions;
    }
}
