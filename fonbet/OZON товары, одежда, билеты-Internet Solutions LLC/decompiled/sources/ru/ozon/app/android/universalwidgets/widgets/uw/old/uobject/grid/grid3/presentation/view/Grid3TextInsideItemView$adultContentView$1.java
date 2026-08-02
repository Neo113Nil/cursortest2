package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.view;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.views.AdultContentView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/views/AdultContentView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class Grid3TextInsideItemView$adultContentView$1 extends AbstractC7737t implements Function0<AdultContentView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Grid3TextInsideItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Grid3TextInsideItemView$adultContentView$1(Context context, Grid3TextInsideItemView grid3TextInsideItemView) {
        super(0);
        this.$context = context;
        this.this$0 = grid3TextInsideItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdultContentView invoke() {
        AdultContentView adultContentView = new AdultContentView(this.$context, null, 0, 0, 14, null);
        adultContentView.setId(R$id.uwAdultContentView);
        this.this$0.addView(adultContentView);
        return adultContentView;
    }
}
