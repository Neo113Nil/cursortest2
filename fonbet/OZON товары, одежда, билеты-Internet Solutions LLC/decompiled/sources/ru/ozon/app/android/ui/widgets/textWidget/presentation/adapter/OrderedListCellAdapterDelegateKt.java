package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslLayoutContainerListAdapterDelegate;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¨\u0006\b"}, d2 = {"orderedListCellAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OrderedListCellAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<TextWidgetVO.TextWidgetItemVO>> orderedListCellAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        OrderedListCellAdapterDelegateKt$orderedListCellAdapterDelegate$1 orderedListCellAdapterDelegateKt$orderedListCellAdapterDelegate$1 = OrderedListCellAdapterDelegateKt$orderedListCellAdapterDelegate$1.INSTANCE;
        return new DslLayoutContainerListAdapterDelegate(0, OrderedListCellAdapterDelegateKt$orderedListCellAdapterDelegate$$inlined$adapterDelegateLayoutContainer$default$1.INSTANCE, new OrderedListCellAdapterDelegateKt$orderedListCellAdapterDelegate$2(actionHandler), orderedListCellAdapterDelegateKt$orderedListCellAdapterDelegate$1);
    }
}
