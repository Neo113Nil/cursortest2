package ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation;

import A00.a;
import androidx.recyclerview.widget.RecyclerView;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV4SizeWidgetViewHolder$adapter$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ AspectsV4SizeWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV4SizeWidgetViewHolder$adapter$1(AspectsV4SizeWidgetViewHolder aspectsV4SizeWidgetViewHolder, ComposerReferences composerReferences) {
        super(1);
        this.this$0 = aspectsV4SizeWidgetViewHolder;
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String deeplink) {
        Integer scrollWidgetKey;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        AspectsV4SizeVO boundData = this.this$0.getBoundData();
        if (boundData == null || (scrollWidgetKey = boundData.getScrollWidgetKey()) == null) {
            return;
        }
        ComposerReferences composerReferences = this.$refs;
        AspectsV4SizeWidgetViewHolder aspectsV4SizeWidgetViewHolder = this.this$0;
        int intValue = scrollWidgetKey.intValue();
        InterfaceC7851b controller = composerReferences.getController();
        recyclerView = aspectsV4SizeWidgetViewHolder.view;
        InterfaceC7851b.a.a(controller, deeplink, null, null, new h.b(new a.C.d(intValue, (int) recyclerView.getY(), 20, false), null, 2), 6);
    }
}
