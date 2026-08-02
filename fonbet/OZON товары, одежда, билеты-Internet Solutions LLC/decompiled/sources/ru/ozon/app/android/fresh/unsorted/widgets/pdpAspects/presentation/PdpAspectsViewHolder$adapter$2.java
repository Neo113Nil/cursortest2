package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.recyclerview.AspectsItemAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectsItemAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PdpAspectsViewHolder$adapter$2 extends AbstractC7737t implements Function0<AspectsItemAdapter> {
    final /* synthetic */ PdpAspectsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpAspectsViewHolder$adapter$2(PdpAspectsViewHolder pdpAspectsViewHolder) {
        super(0);
        this.this$0 = pdpAspectsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AspectsItemAdapter invoke() {
        Function1 actionHandler;
        actionHandler = this.this$0.getActionHandler();
        return new AspectsItemAdapter(actionHandler);
    }
}
