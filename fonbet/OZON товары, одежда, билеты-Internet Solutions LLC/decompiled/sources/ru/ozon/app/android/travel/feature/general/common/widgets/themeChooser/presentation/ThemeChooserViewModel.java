package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "darkThemeManager", "<init>", "(Lru/ozon/app/android/platform/theme/DarkThemeManager;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "data", "", "bindData", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "theme", "onThemeSelected", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;)V", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "LAe/x0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/UIState;", "_widgetState", "LAe/x0;", "LAe/M0;", "widgetState", "LAe/M0;", "getWidgetState", "()LAe/M0;", "Factory", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeChooserViewModel extends w0 {

    @NotNull
    private final x0<UIState> _widgetState;
    private final DarkThemeManager darkThemeManager;

    @NotNull
    private final M0<UIState> widgetState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserViewModel$Factory;", "Landroidx/lifecycle/z0$b;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "darkThemeManager", "<init>", "(Lru/ozon/app/android/platform/theme/DarkThemeManager;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements z0.b {
        private final DarkThemeManager darkThemeManager;

        public Factory(DarkThemeManager darkThemeManager) {
            this.darkThemeManager = darkThemeManager;
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new ThemeChooserViewModel(this.darkThemeManager);
        }
    }

    public ThemeChooserViewModel(DarkThemeManager darkThemeManager) {
        this.darkThemeManager = darkThemeManager;
        x0<UIState> a11 = O0.a(new UIState(null, null, 3, null));
        this._widgetState = a11;
        this.widgetState = C2399j.b(a11);
    }

    public final void bindData(ThemeChooserVI data) {
        DarkThemeManager.Status status;
        if (data != null) {
            DarkThemeManager darkThemeManager = this.darkThemeManager;
            if (darkThemeManager == null || (status = darkThemeManager.getStatus()) == null) {
                status = DarkThemeManager.Status.DAY_THEME;
            }
            ThemeChooserDTO.ThemeEnum mapToTheme = ThemeChooserMapperKt.mapToTheme(status);
            List<ThemeChooserDTO.ThemeSelector> selectors = data.getSelectors();
            ArrayList arrayList = new ArrayList(C7714v.z(selectors, 10));
            for (ThemeChooserDTO.ThemeSelector themeSelector : selectors) {
                arrayList.add(ThemeChooserDTO.ThemeSelector.copy$default(themeSelector, null, null, null, RadioDTO.copy$default(themeSelector.getRadio(), null, Boolean.valueOf(themeSelector.getTheme() == mapToTheme), null, null, null, null, 61, null), null, 23, null));
            }
            this._widgetState.setValue(new UIState(ThemeChooserVI.copy$default(data, 0L, arrayList, 1, null), mapToTheme));
        }
    }

    @NotNull
    public final M0<UIState> getWidgetState() {
        return this.widgetState;
    }

    public final void onThemeSelected(@NotNull ThemeChooserDTO.ThemeEnum theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        DarkThemeManager darkThemeManager = this.darkThemeManager;
        if (darkThemeManager != null) {
            darkThemeManager.setStatus(ThemeChooserMapperKt.mapToStatus(theme));
        }
        bindData(this._widgetState.getValue().getData());
    }
}
