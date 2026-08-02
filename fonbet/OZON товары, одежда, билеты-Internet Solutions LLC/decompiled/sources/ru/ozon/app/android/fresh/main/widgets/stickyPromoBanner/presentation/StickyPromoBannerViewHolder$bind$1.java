package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyPromoBannerViewHolder$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ StickyPromoBannerVO $item;
    final /* synthetic */ StickyPromoBannerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyPromoBannerViewHolder$bind$1(StickyPromoBannerVO stickyPromoBannerVO, StickyPromoBannerViewHolder stickyPromoBannerViewHolder) {
        super(0);
        this.$item = stickyPromoBannerVO;
        this.this$0 = stickyPromoBannerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        i iVar;
        Function1 actionHandler;
        AtomAction closeIconAction = this.$item.getCloseIconAction();
        if (closeIconAction != null) {
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(closeIconAction);
        }
        long id2 = this.$item.getId();
        iVar = this.this$0.container;
        iVar.M().m(id2);
    }
}
