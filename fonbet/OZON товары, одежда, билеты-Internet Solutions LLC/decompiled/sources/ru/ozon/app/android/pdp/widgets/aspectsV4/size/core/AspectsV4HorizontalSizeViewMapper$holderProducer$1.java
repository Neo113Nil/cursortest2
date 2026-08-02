package ru.ozon.app.android.pdp.widgets.aspectsV4.size.core;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeWidgetViewHolder;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AspectsV4HorizontalSizeViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AspectsV4SizeWidgetViewHolder> {
    final /* synthetic */ AspectsV4HorizontalSizeViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4HorizontalSizeViewMapper$holderProducer$1(AspectsV4HorizontalSizeViewMapper aspectsV4HorizontalSizeViewMapper) {
        super(2);
        this.this$0 = aspectsV4HorizontalSizeViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AspectsV4SizeWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new AspectsV4SizeWidgetViewHolder((RecyclerView) view, false, refs, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getAppType() == AppType.SELECT);
    }
}
