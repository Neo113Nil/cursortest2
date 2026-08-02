package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view.TouristCountSelectorV3RoomView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;)V", "", "isVisible", "", "processVisibility", "(Z)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3RoomView;", "roomView", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3RoomView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "getRoomId", "()Ljava/lang/Long;", "roomId", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3RoomWidgetViewHolder extends k<TouristCountSelectorV3RoomVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final TouristCountSelectorV3RoomView roomView;

    @NotNull
    private final TouristCountSelectorV3ViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cell", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<TouristCountSelectorV3QuantityCellVO, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO) {
            invoke2(touristCountSelectorV3QuantityCellVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TouristCountSelectorV3QuantityCellVO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Long roomId = TouristCountSelectorV3RoomWidgetViewHolder.this.getRoomId();
            if (roomId != null) {
                TouristCountSelectorV3RoomWidgetViewHolder touristCountSelectorV3RoomWidgetViewHolder = TouristCountSelectorV3RoomWidgetViewHolder.this;
                touristCountSelectorV3RoomWidgetViewHolder.viewModel.onPlusButtonClicked(roomId.longValue(), cell);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cell", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<TouristCountSelectorV3QuantityCellVO, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO) {
            invoke2(touristCountSelectorV3QuantityCellVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TouristCountSelectorV3QuantityCellVO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Long roomId = TouristCountSelectorV3RoomWidgetViewHolder.this.getRoomId();
            if (roomId != null) {
                TouristCountSelectorV3RoomWidgetViewHolder touristCountSelectorV3RoomWidgetViewHolder = TouristCountSelectorV3RoomWidgetViewHolder.this;
                touristCountSelectorV3RoomWidgetViewHolder.viewModel.onMinusButtonClicked(roomId.longValue(), cell);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "childFormPosition", "", "selectedChip", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomWidgetViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function2<Integer, ChipDTO, Unit> {
        AnonymousClass3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, ChipDTO chipDTO) {
            invoke(num.intValue(), chipDTO);
            return Unit.f71690a;
        }

        public final void invoke(int i11, ChipDTO selectedChip) {
            Intrinsics.checkNotNullParameter(selectedChip, "selectedChip");
            Long roomId = TouristCountSelectorV3RoomWidgetViewHolder.this.getRoomId();
            if (roomId != null) {
                TouristCountSelectorV3RoomWidgetViewHolder touristCountSelectorV3RoomWidgetViewHolder = TouristCountSelectorV3RoomWidgetViewHolder.this;
                touristCountSelectorV3RoomWidgetViewHolder.viewModel.onChildAgeSelected(roomId.longValue(), i11, selectedChip);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3RoomWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull TouristCountSelectorV3ViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        TouristCountSelectorV3RoomView touristCountSelectorV3RoomView = containerView instanceof TouristCountSelectorV3RoomView ? (TouristCountSelectorV3RoomView) containerView : null;
        this.roomView = touristCountSelectorV3RoomView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).onClick(new TouristCountSelectorV3RoomWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        if (touristCountSelectorV3RoomView != null) {
            touristCountSelectorV3RoomView.setupCallbacks(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), buildHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getRoomId() {
        TouristCountSelectorV3RoomVO boundData = getBoundData();
        if (boundData != null) {
            return Long.valueOf(boundData.getId());
        }
        return null;
    }

    private final void processVisibility(boolean isVisible) {
        if (isVisible) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (itemView.getVisibility() == 8) {
                View itemView2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                ViewGroup.LayoutParams layoutParams = itemView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -1;
                layoutParams.height = -2;
                itemView2.setLayoutParams(layoutParams);
                View itemView3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                itemView3.setVisibility(0);
                return;
            }
            return;
        }
        View itemView4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        if (itemView4.getVisibility() == 0) {
            View itemView5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
            ViewGroup.LayoutParams layoutParams2 = itemView5.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = 0;
            layoutParams2.height = 0;
            itemView5.setLayoutParams(layoutParams2);
            View itemView6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView6, "itemView");
            itemView6.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TouristCountSelectorV3RoomVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.viewModel.onBindNewItem(item);
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj == TouristCountSelectorV3RoomPayload.TITLE) {
                TouristCountSelectorV3RoomView touristCountSelectorV3RoomView = this.roomView;
                if (touristCountSelectorV3RoomView != null) {
                    touristCountSelectorV3RoomView.bindTitle(item.getRoomTitle(), item.getIsRoomTitleVisible());
                }
            } else if (obj == TouristCountSelectorV3RoomPayload.DELETE_BUTTON) {
                TouristCountSelectorV3RoomView touristCountSelectorV3RoomView2 = this.roomView;
                if (touristCountSelectorV3RoomView2 != null) {
                    touristCountSelectorV3RoomView2.bindDeleteRoomButton(item.getDeleteRoomButton(), item.getIsDeleteRoomButtonVisible());
                }
            } else if (obj == TouristCountSelectorV3RoomPayload.GUESTS) {
                TouristCountSelectorV3RoomView touristCountSelectorV3RoomView3 = this.roomView;
                if (touristCountSelectorV3RoomView3 != null) {
                    touristCountSelectorV3RoomView3.bindGuests(item.getGuests());
                }
            } else if (obj == TouristCountSelectorV3RoomPayload.FORMS) {
                TouristCountSelectorV3RoomView touristCountSelectorV3RoomView4 = this.roomView;
                if (touristCountSelectorV3RoomView4 != null) {
                    touristCountSelectorV3RoomView4.bindChildForms(item.getChildForms());
                }
            } else if (obj == TouristCountSelectorV3RoomPayload.VISIBILITY) {
                processVisibility(item.getIsRoomVisible());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TouristCountSelectorV3RoomVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.onBindNewItem(item);
        TouristCountSelectorV3RoomView touristCountSelectorV3RoomView = this.roomView;
        if (touristCountSelectorV3RoomView != null) {
            touristCountSelectorV3RoomView.bind(item);
        }
        processVisibility(item.getIsRoomVisible());
    }
}
