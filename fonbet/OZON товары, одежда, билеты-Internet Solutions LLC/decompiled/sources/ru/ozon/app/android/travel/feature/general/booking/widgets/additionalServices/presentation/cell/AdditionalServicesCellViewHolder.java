package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemAdditionalServicesCellBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesControlActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffItemDecoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffSkeletonVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.aspect.AdditionalServicesTariffAspectsAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.skeleton.AdditionalServicesTariffSkeletonsAdapter;
import ru.ozon.app.android.travel.molecules.view.counterInput.v2.CounterInputV2View;
import ru.ozon.app.android.travel.molecules.view.counterInput.v2.CounterInputV2ViewKt;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xN.a;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010$J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010$J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010$J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010$J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J=\u0010=\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u0001092\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u000105¢\u0006\u0004\b@\u00108J\u0015\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020G2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020A¢\u0006\u0004\bL\u0010DJ\u0015\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020A¢\u0006\u0004\bN\u0010DJ\u0015\u0010P\u001a\u00020\u00062\u0006\u0010O\u001a\u00020A¢\u0006\u0004\bP\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010RR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010RR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010RR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010SR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010TR\u0016\u0010b\u001a\u0004\u0018\u00010_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemAdditionalServicesCellBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper;", "onControlActionWrapperClicked", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesInfoActionWrapper;", "onInfoActionWrapperClicked", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;", "onTariffActionWrapperClicked", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemDecoration;", "tariffItemDecoration", "", "", "Landroid/os/Parcelable;", "tariffScrollStates", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemAdditionalServicesCellBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemDecoration;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;", "button", "cellId", "bindButton", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;I)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;", "toggle", "bindToggle", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;I)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;", "counter", "bindCounterInput", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;I)V", "initAdapters", "()V", "setRecyclerView", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffSkeletonVO;", "getTariffSkeletons", "()Ljava/util/List;", "onViewInVisibleBounds", "saveTariffsScroll", "restoreTariffsScroll", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "bindImage", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "titleInfoButton", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "control", "bindTitleInfoButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;I)V", "subtitle", "bindSubtitle", "", "isSubtitleSkeletonVisible", "bindSubtitleSkeleton", "(Z)V", "bindControl", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;I)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "cellType", "bindCellType", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;I)V", "isTariffsVisible", "bindTariffsVisibility", "isTariffSkeletonsVisible", "bindTariffSkeletons", "hideSeparator", "bindSeparator", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemAdditionalServicesCellBinding;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffItemDecoration;", "Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectsAdapter;", "tariffAspectsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectsAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/skeleton/AdditionalServicesTariffSkeletonsAdapter;", "tariffSkeletonsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/skeleton/AdditionalServicesTariffSkeletonsAdapter;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Landroidx/recyclerview/widget/RecyclerView$o;", "getTariffsLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$o;", "tariffsLayoutManager", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesCellViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemAdditionalServicesCellBinding binding;

    @NotNull
    private final Function1<AdditionalServicesControlActionWrapper, Unit> onControlActionWrapperClicked;

    @NotNull
    private final Function1<AdditionalServicesInfoActionWrapper, Unit> onInfoActionWrapperClicked;

    @NotNull
    private final Function1<AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked;
    private AdditionalServicesTariffAspectsAdapter tariffAspectsAdapter;

    @NotNull
    private final AdditionalServicesTariffItemDecoration tariffItemDecoration;

    @NotNull
    private final Map<Integer, Parcelable> tariffScrollStates;
    private AdditionalServicesTariffSkeletonsAdapter tariffSkeletonsAdapter;
    private Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdditionalServicesCellViewHolder(@NotNull ItemAdditionalServicesCellBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AdditionalServicesControlActionWrapper, Unit> onControlActionWrapperClicked, @NotNull Function1<? super AdditionalServicesInfoActionWrapper, Unit> onInfoActionWrapperClicked, @NotNull Function1<? super AdditionalServicesTariffActionWrapper, Unit> onTariffActionWrapperClicked, @NotNull AdditionalServicesTariffItemDecoration tariffItemDecoration, @NotNull Map<Integer, Parcelable> tariffScrollStates) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onControlActionWrapperClicked, "onControlActionWrapperClicked");
        Intrinsics.checkNotNullParameter(onInfoActionWrapperClicked, "onInfoActionWrapperClicked");
        Intrinsics.checkNotNullParameter(onTariffActionWrapperClicked, "onTariffActionWrapperClicked");
        Intrinsics.checkNotNullParameter(tariffItemDecoration, "tariffItemDecoration");
        Intrinsics.checkNotNullParameter(tariffScrollStates, "tariffScrollStates");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.onControlActionWrapperClicked = onControlActionWrapperClicked;
        this.onInfoActionWrapperClicked = onInfoActionWrapperClicked;
        this.onTariffActionWrapperClicked = onTariffActionWrapperClicked;
        this.tariffItemDecoration = tariffItemDecoration;
        this.tariffScrollStates = tariffScrollStates;
        initAdapters();
        setRecyclerView();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindButton(AdditionalServicesCellVO.ControlType.Button button, int cellId) {
        ButtonV3View buttonV3View = this.binding.additionalServicesButtonBV;
        Intrinsics.f(buttonV3View);
        ButtonV3HolderKt.bindOrGone$default(buttonV3View, button.getButtonV3DTO(), null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(buttonV3View, 0L, new AdditionalServicesCellViewHolder$bindButton$1$1(button, this, cellId), 1, null);
        if (button.getIsLoading()) {
            buttonV3View.setOnTouchListener(new a());
            buttonV3View.showLoader();
        } else {
            buttonV3View.hideLoader();
            buttonV3View.setOnTouchListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindButton$lambda$6$lambda$5(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void bindCounterInput(AdditionalServicesCellVO.ControlType.Counter counter, int cellId) {
        CounterInputV2View counterInputV2View = this.binding.additionalServicesCounterInputCIV;
        Intrinsics.f(counterInputV2View);
        CounterInputV2ViewKt.bindOrGone$default(counterInputV2View, counter.getCounterInputV2DTO(), null, 2, null);
        Context context = counterInputV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        counterInputV2View.setCurrentValueHorizontalMargin(ResourceExtKt.toPx(6, context));
        IconButtonV3View decrementButtonIBV = counterInputV2View.getDecrementButtonIBV();
        ViewExtKt.setOnClickListenerThrottle$default(decrementButtonIBV, 0L, new AdditionalServicesCellViewHolder$bindCounterInput$1$1$1(counter, this, cellId), 1, null);
        ViewExtKt.showOrInvisible(decrementButtonIBV, !counter.getIsDecrementLoading());
        ViewExtKt.showOrGone(counterInputV2View.getDecrementLoaderViewLV(), Boolean.valueOf(counter.getIsDecrementLoading()));
        IconButtonV3View incrementButtonIBV = counterInputV2View.getIncrementButtonIBV();
        ViewExtKt.setOnClickListenerThrottle$default(incrementButtonIBV, 0L, new AdditionalServicesCellViewHolder$bindCounterInput$1$2$1(counter, this, cellId), 1, null);
        ViewExtKt.showOrInvisible(incrementButtonIBV, !counter.getIsIncrementLoading());
        ViewExtKt.showOrGone(counterInputV2View.getIncrementLoaderViewLV(), Boolean.valueOf(counter.getIsIncrementLoading()));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindToggle(final AdditionalServicesCellVO.ControlType.Toggle toggle, final int cellId) {
        final ToggleView toggleView = this.binding.additionalServicesToggleTV;
        Intrinsics.f(toggleView);
        ToggleHolderKt.bindOrGone$default(toggleView, toggle.getToggleDTO(), null, 2, null);
        toggleView.setClickable(false);
        toggleView.setOnTouchListener(new View.OnTouchListener() { // from class: xN.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean bindToggle$lambda$8$lambda$7;
                bindToggle$lambda$8$lambda$7 = AdditionalServicesCellViewHolder.bindToggle$lambda$8$lambda$7(AdditionalServicesCellViewHolder.this, toggle, cellId, toggleView, view, motionEvent);
                return bindToggle$lambda$8$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindToggle$lambda$8$lambda$7(AdditionalServicesCellViewHolder additionalServicesCellViewHolder, AdditionalServicesCellVO.ControlType.Toggle toggle, int i11, ToggleView toggleView, View view, MotionEvent motionEvent) {
        additionalServicesCellViewHolder.onControlActionWrapperClicked.invoke(new AdditionalServicesControlActionWrapper.Toggle(toggle.getAction(), i11, !toggleView.isChecked()));
        additionalServicesCellViewHolder.actionHandler.invoke(toggle.getAction());
        return false;
    }

    private final List<AdditionalServicesTariffSkeletonVO> getTariffSkeletons() {
        ArrayList arrayList = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.add(new AdditionalServicesTariffSkeletonVO(i11));
        }
        return arrayList;
    }

    private final RecyclerView.o getTariffsLayoutManager() {
        return this.binding.additionalServicesTariffItemsRV.getLayoutManager();
    }

    private final void initAdapters() {
        this.tariffAspectsAdapter = new AdditionalServicesTariffAspectsAdapter(this.onTariffActionWrapperClicked, this.actionHandler);
        AdditionalServicesTariffSkeletonsAdapter additionalServicesTariffSkeletonsAdapter = new AdditionalServicesTariffSkeletonsAdapter();
        additionalServicesTariffSkeletonsAdapter.submitList(getTariffSkeletons());
        this.tariffSkeletonsAdapter = additionalServicesTariffSkeletonsAdapter;
    }

    private final void setRecyclerView() {
        RecyclerView recyclerView = this.binding.additionalServicesTariffItemsRV;
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(this.tariffItemDecoration);
        recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xN.c
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                AdditionalServicesCellViewHolder.this.saveTariffsScroll();
            }
        });
    }

    public final void bind(@NotNull AdditionalServicesCellVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindImage(item.getImage());
        bindTitle(item.getTitle());
        bindTitleInfoButton(item.getTitleInfoButton(), this.actionHandler, item.getControl(), item.getId());
        bindSubtitle(item.getSubtitle());
        bindSubtitleSkeleton(item.getIsSubtitleSkeletonVisible());
        bindControl(item.getControl(), item.getId());
        bindCellType(item.getCellType(), item.getId());
        bindTariffsVisibility(item.getIsTariffsVisible());
        bindTariffSkeletons(item.getIsTariffSkeletonsVisible());
        bindSeparator(item.getHideSeparator());
        this.trackingInfo = item.getTrackingInfo();
    }

    public final void bindCellType(@NotNull AdditionalServicesCellVO.CellType cellType, int cellId) {
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        if (!(cellType instanceof AdditionalServicesCellVO.CellType.WithTariffs)) {
            this.tariffAspectsAdapter = null;
            this.tariffSkeletonsAdapter = null;
            return;
        }
        List tariffs = ((AdditionalServicesCellVO.CellType.WithTariffs) cellType).getTariffs();
        if (tariffs.isEmpty()) {
            this.binding.additionalServicesTariffItemsRV.setAdapter(this.tariffSkeletonsAdapter);
            return;
        }
        AdditionalServicesTariffAspectsAdapter additionalServicesTariffAspectsAdapter = this.tariffAspectsAdapter;
        if (additionalServicesTariffAspectsAdapter != null) {
            additionalServicesTariffAspectsAdapter.setCellId(cellId);
            additionalServicesTariffAspectsAdapter.submitList(null);
            additionalServicesTariffAspectsAdapter.submitList(tariffs);
            this.binding.additionalServicesTariffItemsRV.setAdapter(additionalServicesTariffAspectsAdapter);
        }
        restoreTariffsScroll();
    }

    public final void bindControl(AdditionalServicesCellVO.ControlType control, int cellId) {
        if (control instanceof AdditionalServicesCellVO.ControlType.Button) {
            ToggleView additionalServicesToggleTV = this.binding.additionalServicesToggleTV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesToggleTV, "additionalServicesToggleTV");
            additionalServicesToggleTV.setVisibility(8);
            CounterInputV2View additionalServicesCounterInputCIV = this.binding.additionalServicesCounterInputCIV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesCounterInputCIV, "additionalServicesCounterInputCIV");
            additionalServicesCounterInputCIV.setVisibility(8);
            bindButton((AdditionalServicesCellVO.ControlType.Button) control, cellId);
            return;
        }
        if (control instanceof AdditionalServicesCellVO.ControlType.Toggle) {
            ButtonV3View additionalServicesButtonBV = this.binding.additionalServicesButtonBV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesButtonBV, "additionalServicesButtonBV");
            additionalServicesButtonBV.setVisibility(8);
            CounterInputV2View additionalServicesCounterInputCIV2 = this.binding.additionalServicesCounterInputCIV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesCounterInputCIV2, "additionalServicesCounterInputCIV");
            additionalServicesCounterInputCIV2.setVisibility(8);
            bindToggle((AdditionalServicesCellVO.ControlType.Toggle) control, cellId);
            return;
        }
        if (control instanceof AdditionalServicesCellVO.ControlType.Counter) {
            ButtonV3View additionalServicesButtonBV2 = this.binding.additionalServicesButtonBV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesButtonBV2, "additionalServicesButtonBV");
            additionalServicesButtonBV2.setVisibility(8);
            ToggleView additionalServicesToggleTV2 = this.binding.additionalServicesToggleTV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesToggleTV2, "additionalServicesToggleTV");
            additionalServicesToggleTV2.setVisibility(8);
            bindCounterInput((AdditionalServicesCellVO.ControlType.Counter) control, cellId);
            return;
        }
        ButtonV3View additionalServicesButtonBV3 = this.binding.additionalServicesButtonBV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesButtonBV3, "additionalServicesButtonBV");
        additionalServicesButtonBV3.setVisibility(8);
        ToggleView additionalServicesToggleTV3 = this.binding.additionalServicesToggleTV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesToggleTV3, "additionalServicesToggleTV");
        additionalServicesToggleTV3.setVisibility(8);
        CounterInputV2View additionalServicesCounterInputCIV3 = this.binding.additionalServicesCounterInputCIV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesCounterInputCIV3, "additionalServicesCounterInputCIV");
        additionalServicesCounterInputCIV3.setVisibility(8);
    }

    public final void bindImage(@NotNull ImageDTO image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Image additionalServicesImageI = this.binding.additionalServicesImageI;
        Intrinsics.checkNotNullExpressionValue(additionalServicesImageI, "additionalServicesImageI");
        ImageHolderKt.bind$default(additionalServicesImageI, image, null, 2, null);
    }

    public final void bindSeparator(boolean hideSeparator) {
        View additionalServicesSeparatorV = this.binding.additionalServicesSeparatorV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesSeparatorV, "additionalServicesSeparatorV");
        additionalServicesSeparatorV.setVisibility(!hideSeparator ? 0 : 8);
    }

    public final void bindSubtitle(TextDTO subtitle) {
        TextAtomV2View additionalServicesSubtitleTAV = this.binding.additionalServicesSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesSubtitleTAV, "additionalServicesSubtitleTAV");
        TextHolderKt.bindOrGone$default(additionalServicesSubtitleTAV, subtitle, null, 2, null);
    }

    public final void bindSubtitleSkeleton(boolean isSubtitleSkeletonVisible) {
        ItemAdditionalServicesCellBinding itemAdditionalServicesCellBinding = this.binding;
        if (isSubtitleSkeletonVisible) {
            TextAtomV2View additionalServicesSubtitleTAV = itemAdditionalServicesCellBinding.additionalServicesSubtitleTAV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesSubtitleTAV, "additionalServicesSubtitleTAV");
            additionalServicesSubtitleTAV.setVisibility(4);
            RoundedShimmerView additionalServicesSubtitleSkeletonRSV = itemAdditionalServicesCellBinding.additionalServicesSubtitleSkeletonRSV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesSubtitleSkeletonRSV, "additionalServicesSubtitleSkeletonRSV");
            additionalServicesSubtitleSkeletonRSV.setVisibility(0);
            return;
        }
        TextAtomV2View additionalServicesSubtitleTAV2 = itemAdditionalServicesCellBinding.additionalServicesSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesSubtitleTAV2, "additionalServicesSubtitleTAV");
        additionalServicesSubtitleTAV2.setVisibility(0);
        RoundedShimmerView additionalServicesSubtitleSkeletonRSV2 = itemAdditionalServicesCellBinding.additionalServicesSubtitleSkeletonRSV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesSubtitleSkeletonRSV2, "additionalServicesSubtitleSkeletonRSV");
        additionalServicesSubtitleSkeletonRSV2.setVisibility(8);
    }

    public final void bindTariffSkeletons(boolean isTariffSkeletonsVisible) {
        if (isTariffSkeletonsVisible) {
            this.binding.additionalServicesTariffItemsRV.setAdapter(this.tariffSkeletonsAdapter);
        }
    }

    public final void bindTariffsVisibility(boolean isTariffsVisible) {
        RecyclerView additionalServicesTariffItemsRV = this.binding.additionalServicesTariffItemsRV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesTariffItemsRV, "additionalServicesTariffItemsRV");
        additionalServicesTariffItemsRV.setVisibility(isTariffsVisible ? 0 : 8);
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextAtomV2View additionalServicesTitleTAV = this.binding.additionalServicesTitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesTitleTAV, "additionalServicesTitleTAV");
        TextHolderKt.bind$default(additionalServicesTitleTAV, title, null, 2, null);
    }

    public final void bindTitleInfoButton(IconButtonV3DTO titleInfoButton, @NotNull Function1<? super AtomAction, Unit> actionHandler, AdditionalServicesCellVO.ControlType control, int cellId) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconButtonV3View iconButtonV3View = this.binding.additionalServicesTitleInfoButtonIBV;
        Intrinsics.f(iconButtonV3View);
        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View, titleInfoButton, null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(iconButtonV3View, 0L, new AdditionalServicesCellViewHolder$bindTitleInfoButton$1$1(titleInfoButton, this, cellId, control, actionHandler), 1, null);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.actionHandler.invoke(new AtomAction.ViewAction(this.trackingInfo, null, 2, null));
    }

    public final void restoreTariffsScroll() {
        Unit unit;
        Parcelable parcelable = this.tariffScrollStates.get(Integer.valueOf(getLayoutPosition()));
        if (parcelable != null) {
            RecyclerView.o tariffsLayoutManager = getTariffsLayoutManager();
            if (tariffsLayoutManager != null) {
                tariffsLayoutManager.onRestoreInstanceState(parcelable);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        RecyclerView.o tariffsLayoutManager2 = getTariffsLayoutManager();
        if (tariffsLayoutManager2 != null) {
            tariffsLayoutManager2.scrollToPosition(0);
        }
    }

    public final void saveTariffsScroll() {
        Map<Integer, Parcelable> map = this.tariffScrollStates;
        Integer valueOf = Integer.valueOf(getLayoutPosition());
        RecyclerView.o tariffsLayoutManager = getTariffsLayoutManager();
        map.put(valueOf, tariffsLayoutManager != null ? tariffsLayoutManager.onSaveInstanceState() : null);
    }
}
