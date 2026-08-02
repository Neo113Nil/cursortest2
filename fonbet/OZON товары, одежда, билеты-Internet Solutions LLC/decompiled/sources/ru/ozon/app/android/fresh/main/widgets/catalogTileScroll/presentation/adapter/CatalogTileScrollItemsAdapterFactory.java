package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter;

import WZ.l;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapterFactory;", "", "<init>", "()V", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function0;", "Ll20/d;", "widgetInfoProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter;", "create", "(Landroidx/lifecycle/J;LWZ/l;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileScrollItemsAdapter;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileScrollItemsAdapterFactory {
    @NotNull
    public final CatalogTileScrollItemsAdapter create(@NotNull J containerViewLifecycleOwner, @NotNull l tokenizedAnalytics, @NotNull Function0<d> widgetInfoProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(widgetInfoProvider, "widgetInfoProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return new CatalogTileScrollItemsAdapter(containerViewLifecycleOwner, tokenizedAnalytics, widgetInfoProvider, actionHandler);
    }
}
