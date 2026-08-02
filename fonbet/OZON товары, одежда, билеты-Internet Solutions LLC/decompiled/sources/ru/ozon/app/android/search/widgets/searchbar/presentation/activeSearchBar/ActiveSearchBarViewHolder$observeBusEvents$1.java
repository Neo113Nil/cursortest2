package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.commonTapTags.SuggestedTapTagClickKey;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ActiveSearchBarViewHolder$observeBusEvents$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ ActiveSearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewHolder$observeBusEvents$1(ActiveSearchBarViewHolder activeSearchBarViewHolder) {
        super(1);
        this.this$0 = activeSearchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.J) {
            a.J.InterfaceC0007a d11 = ((a.J) event).d();
            if (d11 instanceof SuggestedTapTagClickKey) {
                SuggestedTapTagClickKey suggestedTapTagClickKey = (SuggestedTapTagClickKey) d11;
                this.this$0.onSuggestedTapTagClicked(suggestedTapTagClickKey.getSuggestedTag(), suggestedTapTagClickKey.getShouldOverrideExistingText());
            }
        }
    }
}
