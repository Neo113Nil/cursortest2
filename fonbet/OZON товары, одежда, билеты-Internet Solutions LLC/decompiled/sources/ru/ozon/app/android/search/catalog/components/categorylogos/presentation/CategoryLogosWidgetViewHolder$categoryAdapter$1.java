package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CategoryLogosWidgetViewHolder$categoryAdapter$1 extends C7735q implements Function1<CategoryLogoVO.Logo, Unit> {
    CategoryLogosWidgetViewHolder$categoryAdapter$1(Object obj) {
        super(1, obj, CategoryLogosWidgetViewHolder.class, "categoryClick", "categoryClick(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CategoryLogoVO.Logo logo) {
        invoke2(logo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CategoryLogoVO.Logo logo) {
        ((CategoryLogosWidgetViewHolder) this.receiver).categoryClick(logo);
    }
}
