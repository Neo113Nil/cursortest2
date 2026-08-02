package ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ShoppingListsV2CreateListViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ShoppingListsV2CreateListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingListsV2CreateListViewHolder$actionHandler$1(ShoppingListsV2CreateListViewHolder shoppingListsV2CreateListViewHolder) {
        super(1);
        this.this$0 = shoppingListsV2CreateListViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, String> params = it.getParams();
        boolean parseBoolean = (params == null || (str = params.get("shouldMoveToNewList")) == null) ? false : Boolean.parseBoolean(str);
        if (Intrinsics.d(it.getId(), "openCreateList")) {
            this.this$0.openCreateNewList(parseBoolean, it);
        }
    }
}
