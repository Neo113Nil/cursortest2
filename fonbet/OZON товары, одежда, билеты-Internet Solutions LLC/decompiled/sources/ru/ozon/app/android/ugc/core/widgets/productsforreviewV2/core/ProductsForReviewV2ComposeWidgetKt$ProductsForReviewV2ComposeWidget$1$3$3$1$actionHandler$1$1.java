package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductForReviewV2VI;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$actionHandler$1$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ ProductForReviewV2VI $item;
    final /* synthetic */ Function1<NotificationDTO, Unit> $showNotification;
    final /* synthetic */ ProductsForReviewV2ViewModel $viewModel;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$actionHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ InterfaceC7851b $composerController;
        final /* synthetic */ ProductForReviewV2VI $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC7851b interfaceC7851b, ProductForReviewV2VI productForReviewV2VI) {
            super(0);
            this.$composerController = interfaceC7851b;
            this.$item = productForReviewV2VI;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$composerController.m(this.$item.getId());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$actionHandler$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<NotificationDTO, Unit> {
        final /* synthetic */ Function1<NotificationDTO, Unit> $showNotification;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super NotificationDTO, Unit> function1) {
            super(1);
            this.$showNotification = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NotificationDTO notificationDTO) {
            invoke2(notificationDTO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NotificationDTO it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$showNotification.invoke(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$actionHandler$1$1(ProductsForReviewV2ViewModel productsForReviewV2ViewModel, InterfaceC7851b interfaceC7851b, ProductForReviewV2VI productForReviewV2VI, Function1<? super NotificationDTO, Unit> function1) {
        super(1);
        this.$viewModel = productsForReviewV2ViewModel;
        this.$composerController = interfaceC7851b;
        this.$item = productForReviewV2VI;
        this.$showNotification = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action.getId(), "rpIgnoreItemV2")) {
            this.$viewModel.onComposerAction(action, new AnonymousClass1(this.$composerController, this.$item), new AnonymousClass2(this.$showNotification));
        }
    }
}
