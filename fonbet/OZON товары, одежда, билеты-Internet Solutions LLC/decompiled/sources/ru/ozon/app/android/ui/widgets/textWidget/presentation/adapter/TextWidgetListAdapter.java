package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/adapter/TextWidgetListAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "changeExpandedState", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextWidgetListAdapter extends AsyncListDifferDelegationAdapter<TextWidgetVO.TextWidgetItemVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextWidgetListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super TextWidgetVO.TextWidgetItemVO.TextExpandableVO, Unit> changeExpandedState) {
        super(new i.d<TextWidgetVO.TextWidgetItemVO>() { // from class: ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter.TextWidgetListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TextWidgetVO.TextWidgetItemVO oldItem, TextWidgetVO.TextWidgetItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TextWidgetVO.TextWidgetItemVO oldItem, TextWidgetVO.TextWidgetItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(changeExpandedState, "changeExpandedState");
        this.delegatesManager.addDelegate(TextAdapterDelegateKt.textAdapterDelegate(actionHandler)).addDelegate(ExpandableTextAdapterDelegateKt.expandableTextAdapterDelegate(actionHandler, changeExpandedState)).addDelegate(OrderedListCellAdapterDelegateKt.orderedListCellAdapterDelegate(actionHandler)).addDelegate(UnorderedListCellAdapterDelegateKt.unorderedListCellAdapterDelegate(actionHandler)).addDelegate(ImageAdapterDelegateKt.imageAdapterDelegate(actionHandler));
    }
}
