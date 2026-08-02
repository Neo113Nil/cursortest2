package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateLayoutContainerViewHolder;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.uni.android.cell.listItem.UnorderedListCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.listItem.UnorderedListCellHolderKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateLayoutContainerViewHolder;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$UnorderedListCellVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UnorderedListCellAdapterDelegateKt$unorderedListCellAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter.UnorderedListCellAdapterDelegateKt$unorderedListCellAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO> $this_adapterDelegateLayoutContainer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO> adapterDelegateLayoutContainerViewHolder, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateLayoutContainer = adapterDelegateLayoutContainerViewHolder;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO> adapterDelegateLayoutContainerViewHolder = this.$this_adapterDelegateLayoutContainer;
            View view = adapterDelegateLayoutContainerViewHolder.itemView;
            if (!(view instanceof UnorderedListCellView)) {
                view = null;
            }
            if (view != null) {
                Function1<AtomAction, Unit> function1 = this.$actionHandler;
                if (view instanceof UnorderedListCellView) {
                    UnorderedListCellHolderKt.bind((UnorderedListCellView) view, adapterDelegateLayoutContainerViewHolder.getItem().getCell(), function1, adapterDelegateLayoutContainerViewHolder.getItem().getPreset());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnorderedListCellAdapterDelegateKt$unorderedListCellAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO> adapterDelegateLayoutContainerViewHolder) {
        invoke2(adapterDelegateLayoutContainerViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.UnorderedListCellVO> adapterDelegateLayoutContainer) {
        Intrinsics.checkNotNullParameter(adapterDelegateLayoutContainer, "$this$adapterDelegateLayoutContainer");
        adapterDelegateLayoutContainer.bind(new AnonymousClass1(adapterDelegateLayoutContainer, this.$actionHandler));
    }
}
