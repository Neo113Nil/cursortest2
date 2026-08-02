package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressNavBarBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarColorsHelper;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "provider", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ExpressNavBarOverlayMapper$provideNestedWidgetManager$1 extends AbstractC7737t implements Function1<NavBarModelProvider, Unit> {
    final /* synthetic */ WidgetExpressNavBarBinding $binding;
    final /* synthetic */ ExpressNavBarColorsHelper $navBarColorsHelper;
    final /* synthetic */ i $this_provideNestedWidgetManager;
    final /* synthetic */ ExpressNavBarOverlayMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressNavBarOverlayMapper$provideNestedWidgetManager$1(ExpressNavBarOverlayMapper expressNavBarOverlayMapper, ExpressNavBarColorsHelper expressNavBarColorsHelper, WidgetExpressNavBarBinding widgetExpressNavBarBinding, i iVar) {
        super(1);
        this.this$0 = expressNavBarOverlayMapper;
        this.$navBarColorsHelper = expressNavBarColorsHelper;
        this.$binding = widgetExpressNavBarBinding;
        this.$this_provideNestedWidgetManager = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavBarModelProvider navBarModelProvider) {
        invoke2(navBarModelProvider);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NavBarModelProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.this$0.provideNavBarModelListener(provider, this.$navBarColorsHelper, this.$binding, this.$this_provideNestedWidgetManager.K());
    }
}
