package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetUserLegalEntitiesV2LayoutBinding;
import ru.ozon.app.android.storefront.actionHandlers.PopAndRedirectActionHandler;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/UserLegalEntitiesWidgetViewHolderV2;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UserLegalEntitiesViewMapperV2$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, UserLegalEntitiesWidgetViewHolderV2> {
    final /* synthetic */ UserLegalEntitiesViewMapperV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserLegalEntitiesViewMapperV2$holderProducer$1(UserLegalEntitiesViewMapperV2 userLegalEntitiesViewMapperV2) {
        super(2);
        this.this$0 = userLegalEntitiesViewMapperV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final UserLegalEntitiesWidgetViewHolderV2 invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        WidgetUserLegalEntitiesV2LayoutBinding bind = WidgetUserLegalEntitiesV2LayoutBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new UserLegalEntitiesWidgetViewHolderV2(bind, references, this.this$0.component().getCustomActionHandlersStoreFactory().create(CopyTextActionHandler.class, PopAndRedirectActionHandler.class));
    }
}
