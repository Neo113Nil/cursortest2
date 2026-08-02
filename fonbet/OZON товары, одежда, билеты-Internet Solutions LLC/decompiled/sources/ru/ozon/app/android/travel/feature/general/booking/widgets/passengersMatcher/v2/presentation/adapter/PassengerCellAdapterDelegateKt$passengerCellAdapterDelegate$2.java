package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter;

import B3.D;
import Sc.o;
import android.graphics.drawable.GradientDrawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleDefaultHolderKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.PassengersMatcherV2VO;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO$PassengersMatcherItemVO$PassengerCellVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter.PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ int $bottomOffset;
        final /* synthetic */ int $defaultOffset;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>> $this_adapterDelegateViewBinding;
        final /* synthetic */ int $topOffset;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter.PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$2$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PassengersMatcherV2VO.LayoutModel.Position.values().length];
                try {
                    iArr[PassengersMatcherV2VO.LayoutModel.Position.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PassengersMatcherV2VO.LayoutModel.Position.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PassengersMatcherV2VO.LayoutModel.Position.START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PassengersMatcherV2VO.LayoutModel.Position.MIDDLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1, int i11, int i12, int i13) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$actionHandler = function1;
            this.$topOffset = i11;
            this.$bottomOffset = i12;
            this.$defaultOffset = i13;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CellWithSubtitleDefaultView constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            int i11 = this.$topOffset;
            int i12 = this.$bottomOffset;
            int i13 = this.$defaultOffset;
            CellWithSubtitleDefaultView cellWithSubtitleDefaultView = constraintLayout;
            CellWithSubtitleDefaultHolderKt.bind(cellWithSubtitleDefaultView, adapterDelegateViewBindingViewHolder.getItem().getCell(), function1);
            cellWithSubtitleDefaultView.setBackground(PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$2.invoke$setCellBgRadius(adapterDelegateViewBindingViewHolder, adapterDelegateViewBindingViewHolder.getItem().getLayoutModel()));
            int i14 = WhenMappings.$EnumSwitchMapping$0[adapterDelegateViewBindingViewHolder.getItem().getLayoutModel().getPosition().ordinal()];
            if (i14 == 1) {
                cellWithSubtitleDefaultView.setPadding(cellWithSubtitleDefaultView.getPaddingLeft(), i11, cellWithSubtitleDefaultView.getPaddingRight(), i12);
                return;
            }
            if (i14 == 2) {
                cellWithSubtitleDefaultView.setPadding(cellWithSubtitleDefaultView.getPaddingLeft(), i13, cellWithSubtitleDefaultView.getPaddingRight(), i12);
            } else if (i14 == 3) {
                cellWithSubtitleDefaultView.setPadding(cellWithSubtitleDefaultView.getPaddingLeft(), i11, cellWithSubtitleDefaultView.getPaddingRight(), i13);
            } else {
                if (i14 != 4) {
                    throw new o();
                }
                cellWithSubtitleDefaultView.setPadding(cellWithSubtitleDefaultView.getPaddingLeft(), i13, cellWithSubtitleDefaultView.getPaddingRight(), i13);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GradientDrawable invoke$setCellBgRadius(AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>> adapterDelegateViewBindingViewHolder, PassengersMatcherV2VO.LayoutModel layoutModel) {
        GradientDrawable b11 = D.b(0);
        b11.setColor(ThemeExtKt.themeColor(adapterDelegateViewBindingViewHolder.getContext(), R$attr.bgSecondary));
        b11.setCornerRadii(new float[]{layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius()});
        return b11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<PassengersMatcherV2VO.PassengersMatcherItemVO.PassengerCellVO, TypedViewBinding<CellWithSubtitleDefaultView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        int px = ResourceExtKt.toPx(6, adapterDelegateViewBinding.getContext());
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$actionHandler, ResourceExtKt.toPx(4, adapterDelegateViewBinding.getContext()), px, ResourceExtKt.toPx(2, adapterDelegateViewBinding.getContext())));
    }
}
