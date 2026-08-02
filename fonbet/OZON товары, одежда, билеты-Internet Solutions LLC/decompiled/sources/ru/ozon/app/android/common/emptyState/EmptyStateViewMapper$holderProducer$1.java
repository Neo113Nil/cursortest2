package ru.ozon.app.android.common.emptyState;

import GZ.g;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "<unused var>", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/emptyState/EmptyStateVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class EmptyStateViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, k<EmptyStateVO>> {
    final /* synthetic */ g $router;
    final /* synthetic */ EmptyStateViewMapper<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateViewMapper$holderProducer$1(EmptyStateViewMapper<T> emptyStateViewMapper, g gVar) {
        super(2);
        this.this$0 = emptyStateViewMapper;
        this.$router = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<EmptyStateVO> invoke(View view, ComposerReferences composerReferences) {
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "<unused var>");
        z11 = ((EmptyStateViewMapper) this.this$0).cartPrecreationEnabled;
        return z11 ? new EmptyStatePrecreationViewHolder((EmptyStateViewGroup) view, this.$router) : new EmptyStateViewHolder(view, this.$router);
    }
}
