package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation;

import WZ.l;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.flags.FreshTilesRefactoring;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegate;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileView;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FreshTileGridBaseViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, k<FreshTileVO>> {
    final /* synthetic */ FreshTileGridBaseViewMapper this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function1<t, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, TokenizedAnalyticsExtensionsKt.class, "processClickEvents", "processClickEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
            invoke2(tVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            TokenizedAnalyticsExtensionsKt.processClickEvents$default((l) this.receiver, p02, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper$holderProducer$1$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<FreshTileViewModel> {
        final /* synthetic */ ComposerReferences $refs;
        final /* synthetic */ FreshTileGridBaseViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FreshTileGridBaseViewMapper freshTileGridBaseViewMapper, ComposerReferences composerReferences) {
            super(0);
            this.this$0 = freshTileGridBaseViewMapper;
            this.$refs = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FreshTileViewModel invoke() {
            FreshTileViewModel viewModel;
            viewModel = this.this$0.getViewModel(this.$refs);
            return viewModel;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper$holderProducer$1$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<FreshTileModel, Unit> {
        final /* synthetic */ ComposerReferences $refs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ComposerReferences composerReferences) {
            super(1);
            this.$refs = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FreshTileModel freshTileModel) {
            invoke2(freshTileModel);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FreshTileModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FreshTileVO freshTileVO = it instanceof FreshTileVO ? (FreshTileVO) it : null;
            if (freshTileVO != null) {
                this.$refs.getController().d(freshTileVO);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileGridBaseViewMapper$holderProducer$1(FreshTileGridBaseViewMapper freshTileGridBaseViewMapper) {
        super(2);
        this.this$0 = freshTileGridBaseViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<FreshTileVO> invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return this.this$0.component().getFeatureChecker().isEnabled(FreshTilesRefactoring.INSTANCE) ? new FreshTileViewHolderV2((FreshTileViewV2) view, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getFreshTileDelegateV2(), refs, this.this$0.component().getCustomActionHandlersStoreFactory()) : new FreshTileViewHolder((FreshTileView) view, this.this$0.component().getTokenizedAnalytics(), new FreshTileDelegate(new AnonymousClass1(this.this$0.component().getTokenizedAnalytics()), new AnonymousClass2(this.this$0, refs), new AnonymousClass3(refs)), refs, this.this$0.component().getCustomActionHandlersStoreFactory());
    }
}
