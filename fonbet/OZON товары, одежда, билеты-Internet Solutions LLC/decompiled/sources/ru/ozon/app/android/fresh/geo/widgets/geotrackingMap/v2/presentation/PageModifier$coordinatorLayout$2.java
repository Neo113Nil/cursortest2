package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import v10.C10183a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PageModifier$coordinatorLayout$2 extends AbstractC7737t implements Function0<CoordinatorLayout> {
    final /* synthetic */ PageModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageModifier$coordinatorLayout$2(PageModifier pageModifier) {
        super(0);
        this.this$0 = pageModifier;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CoordinatorLayout invoke() {
        ViewGroup viewGroup;
        viewGroup = this.this$0.composerRootView;
        return C10183a.f(viewGroup);
    }
}
