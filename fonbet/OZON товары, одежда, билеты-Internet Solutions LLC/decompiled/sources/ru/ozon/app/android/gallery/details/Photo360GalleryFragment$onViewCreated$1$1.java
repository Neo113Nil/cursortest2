package ru.ozon.app.android.gallery.details;

import GZ.g;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.StorageAnalytic;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Photo360GalleryFragment$onViewCreated$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ItemVO.Photo360 $item;
    final /* synthetic */ Photo360GalleryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360GalleryFragment$onViewCreated$1$1(Photo360GalleryFragment photo360GalleryFragment, ItemVO.Photo360 photo360) {
        super(1);
        this.this$0 = photo360GalleryFragment;
        this.$item = photo360;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        t buttonEvent;
        l tokenizedAnalytics;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Move) {
            String link = ((AtomAction.Move) action).getLink();
            if (link != null) {
                g.a.a(this.this$0.getRouter(), link, null, null, 6);
            }
            ItemVO.Photo360 photo360 = this.$item;
            if (photo360 == null || (buttonEvent = photo360.getButtonEvent()) == null || (tokenizedAnalytics = StorageAnalytic.INSTANCE.getTokenizedAnalytics()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, buttonEvent, null, 2, null);
        }
    }
}
