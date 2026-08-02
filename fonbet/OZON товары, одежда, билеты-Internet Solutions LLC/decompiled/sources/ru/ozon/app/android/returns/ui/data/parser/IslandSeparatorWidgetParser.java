package ru.ozon.app.android.returns.ui.data.parser;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/ui/data/parser/IslandSeparatorWidgetParser;", "T", "Lkotlin/Function2;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO$Configuration;", "config", "", "physicalPartHeight", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createIslandSeparator", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO$Configuration;Ljava/lang/Integer;)Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createBeginIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "createEndIslandSeparator", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class IslandSeparatorWidgetParser<T> implements Function2<String, String, T> {
    public static /* synthetic */ IslandSeparatorDTO createIslandSeparator$default(IslandSeparatorWidgetParser islandSeparatorWidgetParser, IslandSeparatorDTO.Configuration configuration, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createIslandSeparator");
        }
        if ((i11 & 1) != 0) {
            configuration = IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS;
        }
        if ((i11 & 2) != 0) {
            num = Integer.valueOf(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between());
        }
        return islandSeparatorWidgetParser.createIslandSeparator(configuration, num);
    }

    @NotNull
    protected final IslandSeparatorDTO createBeginIslandSeparator() {
        return createIslandSeparator(IslandSeparatorDTO.Configuration.SECTION_BEGIN, 0);
    }

    @NotNull
    protected final IslandSeparatorDTO createEndIslandSeparator() {
        return createIslandSeparator(IslandSeparatorDTO.Configuration.SECTION_END, 0);
    }

    @NotNull
    protected final IslandSeparatorDTO createIslandSeparator(@NotNull IslandSeparatorDTO.Configuration config, Integer physicalPartHeight) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new IslandSeparatorDTO(physicalPartHeight, UniColors.LAYER_FLOOR_0.getToken(), config, null, null, null);
    }
}
