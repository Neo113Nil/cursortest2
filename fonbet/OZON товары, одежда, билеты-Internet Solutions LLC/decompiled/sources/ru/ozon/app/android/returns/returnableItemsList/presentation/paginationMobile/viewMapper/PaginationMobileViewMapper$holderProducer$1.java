package ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper;

import A00.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewHolder.PaginationMobileViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewHolder/PaginationMobileViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PaginationMobileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PaginationMobileViewHolder> {
    final /* synthetic */ PaginationMobileViewMapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<a, Unit> {
        final /* synthetic */ ComposerReferences $refs;
        final /* synthetic */ PaginationMobileViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaginationMobileViewMapper paginationMobileViewMapper, ComposerReferences composerReferences) {
            super(1);
            this.this$0 = paginationMobileViewMapper;
            this.$refs = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.collectEvents(it, this.$refs);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaginationMobileViewMapper$holderProducer$1(PaginationMobileViewMapper paginationMobileViewMapper) {
        super(2);
        this.this$0 = paginationMobileViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PaginationMobileViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new PaginationMobileViewHolder((PaginationMobileView) view, this.this$0.component().getPostRefreshHandlerFactory().create(refs, new AnonymousClass1(this.this$0, refs)), refs);
    }
}
