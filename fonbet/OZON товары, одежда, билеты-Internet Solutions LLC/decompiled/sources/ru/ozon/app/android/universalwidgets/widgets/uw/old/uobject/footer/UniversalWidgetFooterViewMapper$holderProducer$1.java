package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.FooterVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/FooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class UniversalWidgetFooterViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, k<FooterVO>> {
    final /* synthetic */ UniversalWidgetFooterViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalWidgetFooterViewMapper$holderProducer$1(UniversalWidgetFooterViewMapper universalWidgetFooterViewMapper) {
        super(2);
        this.this$0 = universalWidgetFooterViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<FooterVO> invoke(View view, ComposerReferences ref) {
        boolean uwObjectInflateDisabled;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        uwObjectInflateDisabled = this.this$0.getUwObjectInflateDisabled();
        return uwObjectInflateDisabled ? new FooterVHOptimized(view, ref) : new FooterVH(view, ref);
    }
}
