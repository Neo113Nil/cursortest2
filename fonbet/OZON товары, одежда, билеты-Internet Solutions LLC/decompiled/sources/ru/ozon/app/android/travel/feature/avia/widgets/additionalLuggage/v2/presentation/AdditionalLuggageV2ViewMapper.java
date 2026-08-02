package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import A00.a;
import android.view.View;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.di.AdditionalLuggageV2Component;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2OptionClickKey;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00112\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\n\u0010-\u001a\u00060+j\u0002`,H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00101\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R,\u00109\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R(\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0=0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR0\u0010E\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060Bj\u0002`C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0011058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<R \u0010K\u001a\u000e\u0012\n\b\u0001\u0012\u00060Gj\u0002`H0F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/di/AdditionalLuggageV2Component;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey;", "info", "oldVO", "updateOptionClick", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "oldAppBar", "updateAppBar", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey$Indicator;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "oldFlights", "updateFlights", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2OptionClickKey;Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2PassengerClickKey;", "oldItem", "updatePassengerClick", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2PassengerClickKey;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2PassengerAsyncKey;", "updateAsync", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2PassengerAsyncKey;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "oldLuggageItem", "newLuggageItem", "", "getOptionItemPosition", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Integer;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalLuggageV2ViewMapper extends WidgetViewMapper2<AdditionalLuggageV2Component, AdditionalLuggageV2DTO, AdditionalLuggageV2VO> {
    private final int layout = R$layout.widget_additional_luggage_v2;

    @NotNull
    private final Function2<View, ComposerReferences, AdditionalLuggageV2WidgetViewHolder> holderProducer = new AdditionalLuggageV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AdditionalLuggageV2OptionClickKey.class, AdditionalLuggageV2PassengerClickKey.class, AdditionalLuggageV2PassengerAsyncKey.class);

    private final Integer getOptionItemPosition(List<? extends AdditionalLuggageV2VO.LuggageItem> oldLuggageItem, List<? extends AdditionalLuggageV2VO.LuggageItem> newLuggageItem) {
        if (oldLuggageItem == null || newLuggageItem == null) {
            return null;
        }
        int size = oldLuggageItem.size();
        for (int i11 = 0; i11 < size; i11++) {
            AdditionalLuggageV2VO.LuggageItem luggageItem = oldLuggageItem.get(i11);
            AdditionalLuggageV2VO.LuggageOptionItem luggageOptionItem = luggageItem instanceof AdditionalLuggageV2VO.LuggageOptionItem ? (AdditionalLuggageV2VO.LuggageOptionItem) luggageItem : null;
            AdditionalLuggageV2VO.LuggageItem luggageItem2 = newLuggageItem.get(i11);
            AdditionalLuggageV2VO.LuggageOptionItem luggageOptionItem2 = luggageItem2 instanceof AdditionalLuggageV2VO.LuggageOptionItem ? (AdditionalLuggageV2VO.LuggageOptionItem) luggageItem2 : null;
            if (luggageOptionItem != null && luggageOptionItem2 != null && luggageOptionItem.getOption().isSelected() != luggageOptionItem2.getOption().isSelected() && Intrinsics.d(luggageOptionItem.getOption(), CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default(luggageOptionItem2.getOption(), !luggageOptionItem2.getOption().isSelected(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 1048574, null))) {
                return Integer.valueOf(i11);
            }
        }
        return null;
    }

    private final AdditionalLuggageV2VO.AppBarVO updateAppBar(AdditionalLuggageV2OptionClickKey.Indicator info, AdditionalLuggageV2VO.AppBarVO oldAppBar) {
        if (info == null) {
            return oldAppBar;
        }
        ArrayList W02 = C7714v.W0(oldAppBar.getPassengerTabs());
        W02.set(info.getPosition(), AdditionalLuggageV2VO.PassengerTabVO.copy$default((AdditionalLuggageV2VO.PassengerTabVO) W02.get(info.getPosition()), null, null, false, info.getHasAddedLuggage(), 7, null));
        return AdditionalLuggageV2VO.AppBarVO.copy$default(oldAppBar, null, false, false, W02, 7, null);
    }

    private final AdditionalLuggageV2VO updateAsync(AdditionalLuggageV2PassengerAsyncKey info, AdditionalLuggageV2VO oldItem) {
        return AdditionalLuggageV2VO.copy$default(oldItem, 0L, info.getNewContent(), null, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<AdditionalLuggageV2VO.FlightItem> updateFlights(AdditionalLuggageV2OptionClickKey info, List<? extends AdditionalLuggageV2VO.FlightItem> oldFlights) {
        int passengerPosition = info.getPassengerPosition();
        int luggagePosition = info.getLuggagePosition();
        Object obj = oldFlights.get(passengerPosition);
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.FlightVO");
        AdditionalLuggageV2VO.LuggageItem luggageItem = ((AdditionalLuggageV2VO.FlightVO) obj).getLuggageItems().get(luggagePosition);
        if (!(luggageItem instanceof AdditionalLuggageV2VO.LuggageOptionItem)) {
            return oldFlights;
        }
        ArrayList W02 = C7714v.W0(oldFlights);
        Object obj2 = W02.get(passengerPosition);
        Intrinsics.g(obj2, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.FlightVO");
        ArrayList W03 = C7714v.W0(((AdditionalLuggageV2VO.FlightVO) obj2).getLuggageItems());
        AdditionalLuggageV2VO.LuggageOptionItem luggageOptionItem = (AdditionalLuggageV2VO.LuggageOptionItem) luggageItem;
        W03.set(luggagePosition, AdditionalLuggageV2VO.LuggageOptionItem.copy$default(luggageOptionItem, 0, null, 0, 0, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default(luggageOptionItem.getOption(), info.getIsSelected(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 1048574, null), 15, null));
        Object obj3 = W02.get(passengerPosition);
        Intrinsics.g(obj3, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.FlightVO");
        W02.set(passengerPosition, AdditionalLuggageV2VO.FlightVO.copy$default((AdditionalLuggageV2VO.FlightVO) obj3, 0, W03, 1, null));
        return W02;
    }

    private final AdditionalLuggageV2VO updateOptionClick(AdditionalLuggageV2OptionClickKey info, AdditionalLuggageV2VO oldVO) {
        return AdditionalLuggageV2VO.copy$default(oldVO, 0L, AdditionalLuggageV2VO.LuggageContent.copy$default(oldVO.getContent(), updateAppBar(info.getIndicator(), oldVO.getContent().getAppBar()), updateFlights(info, oldVO.getContent().getFlights()), null, AdditionalLuggageV2VO.ActionPaneVO.copy$default(oldVO.getContent().getActionPane(), info.getFormattedTotalPrice(), null, null, null, 14, null), info.getAddedLuggage(), 0, info.getTotalPrice(), false, 164, null), null, 5, null);
    }

    private final AdditionalLuggageV2VO updatePassengerClick(AdditionalLuggageV2PassengerClickKey info, AdditionalLuggageV2VO oldItem) {
        ArrayList W02 = C7714v.W0(oldItem.getContent().getAppBar().getPassengerTabs());
        W02.set(info.getOldPosition(), AdditionalLuggageV2VO.PassengerTabVO.copy$default((AdditionalLuggageV2VO.PassengerTabVO) W02.get(info.getOldPosition()), null, null, false, false, 11, null));
        W02.set(info.getNewPosition(), AdditionalLuggageV2VO.PassengerTabVO.copy$default((AdditionalLuggageV2VO.PassengerTabVO) W02.get(info.getNewPosition()), null, null, true, false, 11, null));
        return AdditionalLuggageV2VO.copy$default(oldItem, 0L, AdditionalLuggageV2VO.LuggageContent.copy$default(oldItem.getContent(), AdditionalLuggageV2VO.AppBarVO.copy$default(oldItem.getContent().getAppBar(), null, false, false, W02, 7, null), null, null, null, null, info.getNewPosition(), 0, false, 222, null), null, 5, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AdditionalLuggageV2WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AdditionalLuggageV2DTO, d, List<AdditionalLuggageV2VO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getAdditionalLuggageV2WidgetViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AdditionalLuggageV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AdditionalLuggageV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AdditionalLuggageV2VO oldItem, @NotNull AdditionalLuggageV2VO newItem) {
        Integer num;
        Integer num2;
        int i11;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getContent().getShouldFetchState()) {
            WidgetViewHolderKt.getEMPTY_PAYLOAD();
            return Unit.f71690a;
        }
        if (oldItem.getContent().getTotalPrice() == newItem.getContent().getTotalPrice()) {
            if (oldItem.getContent().getSelectedTabPosition() != newItem.getContent().getSelectedTabPosition()) {
                return new AdditionalLuggageV2TabSelectionPayload(oldItem.getContent().getSelectedTabPosition(), newItem.getContent().getSelectedTabPosition());
            }
            WidgetViewHolderKt.getEMPTY_PAYLOAD();
            return Unit.f71690a;
        }
        int size = oldItem.getContent().getAppBar().getPassengerTabs().size();
        int i12 = 0;
        while (true) {
            num = null;
            if (i12 >= size) {
                num2 = null;
                break;
            }
            if (oldItem.getContent().getAppBar().getPassengerTabs().get(i12).getHasAddedLuggage() != newItem.getContent().getAppBar().getPassengerTabs().get(i12).getHasAddedLuggage()) {
                num2 = Integer.valueOf(i12);
                break;
            }
            i12++;
        }
        int size2 = oldItem.getContent().getFlights().size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                i11 = 0;
                break;
            }
            AdditionalLuggageV2VO.FlightItem flightItem = oldItem.getContent().getFlights().get(i13);
            AdditionalLuggageV2VO.FlightVO flightVO = flightItem instanceof AdditionalLuggageV2VO.FlightVO ? (AdditionalLuggageV2VO.FlightVO) flightItem : null;
            List<AdditionalLuggageV2VO.LuggageItem> luggageItems = flightVO != null ? flightVO.getLuggageItems() : null;
            AdditionalLuggageV2VO.FlightItem flightItem2 = newItem.getContent().getFlights().get(i13);
            AdditionalLuggageV2VO.FlightVO flightVO2 = flightItem2 instanceof AdditionalLuggageV2VO.FlightVO ? (AdditionalLuggageV2VO.FlightVO) flightItem2 : null;
            List<AdditionalLuggageV2VO.LuggageItem> luggageItems2 = flightVO2 != null ? flightVO2.getLuggageItems() : null;
            if (!Intrinsics.d(luggageItems, luggageItems2)) {
                num = getOptionItemPosition(luggageItems, luggageItems2);
                i11 = i13;
                break;
            }
            i13++;
        }
        return new AdditionalLuggageV2OptionSelectionPayload(num2, i11, num, newItem.getContent().getActionPane().getFormattedTotalPrice(), newItem.getContent().getTotalPrice() < oldItem.getContent().getTotalPrice());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AdditionalLuggageV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AdditionalLuggageV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AdditionalLuggageV2OptionClickKey) {
            return updateOptionClick((AdditionalLuggageV2OptionClickKey) update, oldItem);
        }
        if (update instanceof AdditionalLuggageV2PassengerClickKey) {
            return updatePassengerClick((AdditionalLuggageV2PassengerClickKey) update, oldItem);
        }
        if (update instanceof AdditionalLuggageV2PassengerAsyncKey) {
            return updateAsync((AdditionalLuggageV2PassengerAsyncKey) update, oldItem);
        }
        return null;
    }
}
