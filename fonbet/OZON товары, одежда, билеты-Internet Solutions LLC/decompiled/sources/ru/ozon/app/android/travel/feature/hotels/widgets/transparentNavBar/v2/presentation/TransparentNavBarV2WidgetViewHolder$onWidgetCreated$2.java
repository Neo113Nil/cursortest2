package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import Sc.s;
import Wc.a;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view.TransparentNavBarV2View;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollUpdate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2", f = "TransparentNavBarV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2 extends j implements Function2<ScrollUpdate, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransparentNavBarV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder, d<? super TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2> dVar) {
        super(2, dVar);
        this.this$0 = transparentNavBarV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2 transparentNavBarV2WidgetViewHolder$onWidgetCreated$2 = new TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2(this.this$0, dVar);
        transparentNavBarV2WidgetViewHolder$onWidgetCreated$2.L$0 = obj;
        return transparentNavBarV2WidgetViewHolder$onWidgetCreated$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TransparentNavBarViewModel transparentNavBarViewModel;
        TransparentNavBarViewModel transparentNavBarViewModel2;
        TransparentNavBarV2View navbarView;
        i iVar;
        LinearLayout linearLayout;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ScrollUpdate scrollUpdate = (ScrollUpdate) this.L$0;
        boolean isVisible = scrollUpdate.getIsVisible();
        boolean z11 = !isVisible;
        TransparentNavBarV2VO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder = this.this$0;
            if (Intrinsics.d(scrollUpdate.getScrollAnchorId(), boundData.getScrollAnchorId()) && boundData.getIsDynamicAlpha()) {
                Boolean valueOf = Boolean.valueOf(z11);
                transparentNavBarViewModel = transparentNavBarV2WidgetViewHolder.transparentNavBarViewModel;
                if (!valueOf.equals(transparentNavBarViewModel.getPreviousIsPlaceholderVisible())) {
                    transparentNavBarViewModel2 = transparentNavBarV2WidgetViewHolder.transparentNavBarViewModel;
                    transparentNavBarViewModel2.setPreviousIsPlaceholderVisible(Boolean.valueOf(z11));
                    navbarView = transparentNavBarV2WidgetViewHolder.getNavbarView();
                    navbarView.updateNavbar(z11);
                    iVar = transparentNavBarV2WidgetViewHolder.container;
                    iVar.M().d(new PlaceholderVisibilityUpdateKey(z11));
                    linearLayout = transparentNavBarV2WidgetViewHolder.composerTopContainer;
                    linearLayout.setVisibility(!isVisible ? 0 : 8);
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollUpdate scrollUpdate, d<? super Unit> dVar) {
        return ((TransparentNavBarV2WidgetViewHolder$onWidgetCreated$2) create(scrollUpdate, dVar)).invokeSuspend(Unit.f71690a);
    }
}
