package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO;", "", "stateId", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "toVI", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "mapToStatus", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;)Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "mapToTheme", "(Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;)Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeChooserMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ThemeChooserDTO.ThemeEnum.values().length];
            try {
                iArr[ThemeChooserDTO.ThemeEnum.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeChooserDTO.ThemeEnum.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeChooserDTO.ThemeEnum.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DarkThemeManager.Status.values().length];
            try {
                iArr2[DarkThemeManager.Status.DAY_THEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DarkThemeManager.Status.NIGHT_THEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DarkThemeManager.Status.BY_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final DarkThemeManager.Status mapToStatus(@NotNull ThemeChooserDTO.ThemeEnum themeEnum) {
        Intrinsics.checkNotNullParameter(themeEnum, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[themeEnum.ordinal()];
        if (i11 == 1) {
            return DarkThemeManager.Status.DAY_THEME;
        }
        if (i11 == 2) {
            return DarkThemeManager.Status.NIGHT_THEME;
        }
        if (i11 == 3) {
            return DarkThemeManager.Status.BY_SYSTEM;
        }
        throw new o();
    }

    @NotNull
    public static final ThemeChooserDTO.ThemeEnum mapToTheme(@NotNull DarkThemeManager.Status status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i11 == 1) {
            return ThemeChooserDTO.ThemeEnum.LIGHT;
        }
        if (i11 == 2) {
            return ThemeChooserDTO.ThemeEnum.DARK;
        }
        if (i11 == 3) {
            return ThemeChooserDTO.ThemeEnum.SYSTEM;
        }
        throw new o();
    }

    @NotNull
    public static final ThemeChooserVI toVI(@NotNull ThemeChooserDTO themeChooserDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(themeChooserDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new ThemeChooserVI(stateId.hashCode(), themeChooserDTO.getSelectors());
    }
}
