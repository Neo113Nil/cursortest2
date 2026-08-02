package ru.ozon.app.android.travel.feature.general.common.widgets.banner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BannerWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ BannerWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerWidgetViewHolder$actionHandler$1(BannerWidgetViewHolder bannerWidgetViewHolder) {
        super(1);
        this.this$0 = bannerWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        BannerViewModel bannerViewModel;
        i iVar;
        Intrinsics.checkNotNullParameter(action, "action");
        BannerVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            iVar = this.this$0.container;
            iVar.M().m(id2);
        }
        bannerViewModel = this.this$0.viewModel;
        bannerViewModel.performComposerAction(action);
    }
}
