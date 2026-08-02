package ru.ozon.app.android.storefront.core.atoms.holders.openRangeFilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.BindExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterView;", "Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterView;Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;Lkotlin/jvm/functions/Function1;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenRangeFilterHolderKt {
    public static final void bind(@NotNull OpenRangeFilterView openRangeFilterView, @NotNull OpenRangeFilter dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(openRangeFilterView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(openRangeFilterView, dto, new OpenRangeFilterHolderKt$bind$provider$1(openRangeFilterView), function1);
    }
}
