package ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.ui.databinding.OpenCloudWidgetBinding;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewHolder.OpenCloudViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewHolder/OpenCloudViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OpenCloudViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OpenCloudViewHolder> {
    final /* synthetic */ OpenCloudViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenCloudViewMapper$holderProducer$1(OpenCloudViewMapper openCloudViewMapper) {
        super(2);
        this.this$0 = openCloudViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OpenCloudViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        OpenCloudWidgetBinding bind = OpenCloudWidgetBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new OpenCloudViewHolder(bind, this.this$0.component().getCustomActionHandlersStoreFactory(), PostRefreshHandlerFactory.create$default(this.this$0.component().getPostRefreshHandlerFactory(), refs, null, 2, null), this.this$0.component().getActionV2Repository(), refs);
    }
}
