package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.logger.LoggerExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "exception", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyPromoBannerViewHolder$onWidgetCreated$1 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ StickyPromoBannerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyPromoBannerViewHolder$onWidgetCreated$1(StickyPromoBannerViewHolder stickyPromoBannerViewHolder) {
        super(1);
        this.this$0 = stickyPromoBannerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable exception) {
        i iVar;
        Intrinsics.checkNotNullParameter(exception, "exception");
        StickyPromoBannerVO stickyPromoBannerVO = (StickyPromoBannerVO) this.this$0.getBoundData();
        if (stickyPromoBannerVO != null) {
            long id2 = stickyPromoBannerVO.getId();
            iVar = this.this$0.container;
            iVar.M().m(id2);
        }
        LoggerExtKt.sendNonFatal$default(new IllegalStateException(exception), exception.getMessage(), null, null, 12, null);
    }
}
