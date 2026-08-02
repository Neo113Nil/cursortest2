package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import GZ.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2WidgetHolder$addReviewActionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ RateItemsV2WidgetHolder this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$addReviewActionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$addReviewActionHandler$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        final /* synthetic */ RateItemsV2WidgetHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RateItemsV2WidgetHolder rateItemsV2WidgetHolder) {
            super(1);
            this.this$0 = rateItemsV2WidgetHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction action) {
            RateItemsV2ViewModel rateItemsV2ViewModel;
            boolean z11;
            g gVar;
            Intrinsics.checkNotNullParameter(action, "action");
            rateItemsV2ViewModel = this.this$0.viewModel;
            rateItemsV2ViewModel.vibrateOnRateClick();
            if (action instanceof AtomAction.Move) {
                String link = ((AtomAction.Move) action).getLink();
                if (link != null) {
                    gVar = this.this$0.router;
                    g.a.a(gVar, link, null, null, 6);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$addReviewActionHandler$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
        final /* synthetic */ RateItemsV2WidgetHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(RateItemsV2WidgetHolder rateItemsV2WidgetHolder) {
            super(1);
            this.this$0 = rateItemsV2WidgetHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
            invoke2(composerAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.ComposerAction action) {
            RateItemsV2ViewModel rateItemsV2ViewModel;
            String str;
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.d(action.getId(), "submitReviewFormMobileV2")) {
                Map<String, String> params = action.getParams();
                boolean z11 = !Intrinsics.d((params == null || (str = params.get("withAnimation")) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(str)), Boolean.TRUE);
                RateItemsV2WrapperVO boundData = this.this$0.getBoundData();
                if (boundData != null) {
                    long id2 = boundData.getId();
                    rateItemsV2ViewModel = this.this$0.viewModel;
                    rateItemsV2ViewModel.createReviewFromRateItemsWidget(action, id2, z11);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2WidgetHolder$addReviewActionHandler$2(RateItemsV2WidgetHolder rateItemsV2WidgetHolder) {
        super(0);
        this.this$0 = rateItemsV2WidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        i iVar;
        iVar = this.this$0.container;
        return new ActionHandler.Builder(iVar, this.this$0).customAnalyticHandler(AnonymousClass1.INSTANCE).onPreProcess(new AnonymousClass2(this.this$0)).onComposerAction(new AnonymousClass3(this.this$0)).buildHandler();
    }
}
