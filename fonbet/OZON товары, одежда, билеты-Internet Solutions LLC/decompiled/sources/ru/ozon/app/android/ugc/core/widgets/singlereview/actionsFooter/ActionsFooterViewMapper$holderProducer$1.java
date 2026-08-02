package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import a00.h;
import a00.j;
import android.view.View;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVH;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ActionsFooterViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ActionsFooterVH> {
    final /* synthetic */ ActionsFooterViewMapper this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<UgcCachedActionsSharedViewModel> {
        final /* synthetic */ ActionsFooterViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ActionsFooterViewMapper actionsFooterViewMapper) {
            super(0);
            this.this$0 = actionsFooterViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UgcCachedActionsSharedViewModel invoke() {
            return this.this$0.component().getUgcCachedActionsSharedViewModel().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionsFooterViewMapper$holderProducer$1(ActionsFooterViewMapper actionsFooterViewMapper) {
        super(2);
        this.this$0 = actionsFooterViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ActionsFooterVH invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ActionsFooterView actionsFooterView = (ActionsFooterView) view;
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        w0 w0Var = (w0) j.a(viewModelOwnerProvider.b(), N.b(UgcCachedActionsSharedViewModel.class), new AnonymousClass1(this.this$0)).getValue();
        Intrinsics.checkNotNullExpressionValue(w0Var, "sharedViewModel(...)");
        return new ActionsFooterVH(actionsFooterView, (UgcCachedActionsSharedViewModel) w0Var, refs, this.this$0.component().getCustomActionHandlersStore(), this.this$0.component().getHandlersInhibitor());
    }
}
