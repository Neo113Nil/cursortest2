package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class ThemeChooserContentKt$ThemeChooserContent$1$1$1$1 extends C7735q implements Function1<ThemeChooserDTO.ThemeEnum, Unit> {
    ThemeChooserContentKt$ThemeChooserContent$1$1$1$1(Object obj) {
        super(1, obj, ThemeChooserViewModel.class, "onThemeSelected", "onThemeSelected(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ThemeChooserDTO.ThemeEnum themeEnum) {
        invoke2(themeEnum);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ThemeChooserDTO.ThemeEnum p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ThemeChooserViewModel) this.receiver).onThemeSelected(p02);
    }
}
