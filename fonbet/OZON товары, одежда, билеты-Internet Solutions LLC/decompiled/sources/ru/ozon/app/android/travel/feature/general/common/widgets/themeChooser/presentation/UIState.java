package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/UIState;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "data", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "currentTheme", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "getData", "()Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "getCurrentTheme", "()Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UIState {

    @NotNull
    private final ThemeChooserDTO.ThemeEnum currentTheme;
    private final ThemeChooserVI data;

    /* JADX WARN: Multi-variable type inference failed */
    public UIState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.d(this.data, uIState.data) && this.currentTheme == uIState.currentTheme;
    }

    @NotNull
    public final ThemeChooserDTO.ThemeEnum getCurrentTheme() {
        return this.currentTheme;
    }

    public final ThemeChooserVI getData() {
        return this.data;
    }

    public int hashCode() {
        ThemeChooserVI themeChooserVI = this.data;
        return this.currentTheme.hashCode() + ((themeChooserVI == null ? 0 : themeChooserVI.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "UIState(data=" + this.data + ", currentTheme=" + this.currentTheme + ")";
    }

    public UIState(ThemeChooserVI themeChooserVI, @NotNull ThemeChooserDTO.ThemeEnum currentTheme) {
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        this.data = themeChooserVI;
        this.currentTheme = currentTheme;
    }

    public /* synthetic */ UIState(ThemeChooserVI themeChooserVI, ThemeChooserDTO.ThemeEnum themeEnum, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : themeChooserVI, (i11 & 2) != 0 ? ThemeChooserDTO.ThemeEnum.SYSTEM : themeEnum);
    }
}
