package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.SelectorPayloads;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.adapter.TravelPassengersCountSelectorTravelClassDecoration;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\r\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001c\u001a\u00020\n2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\n2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010#JS\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0006¢\u0006\u0004\b)\u0010*R$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u0014\u00105\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelPassengersCountSelectorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "items", "Lkotlin/Function1;", "", "onMinusClickedCallback", "onPlusClickedCallback", "inflateQuantityCells", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "vo", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "chips", "fixChipClicks", "(Landroid/view/ViewGroup;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Ljava/util/List;)V", "", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "additionalClassInfo", "id", "sampleText", "bindAdditionalInfo", "(Ljava/util/Map;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "onAttach", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/SelectorPayloads;", "payloads", "update", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "dp4", "I", "dp8", "dp16", "dp32", "cellsContainerLl", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "travelClassContainerHal", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "Landroid/widget/HorizontalScrollView;", "scrollContainer", "Landroid/widget/HorizontalScrollView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "additionalInfoTextView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getAdditionalInfoTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "additionalInfoTextView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "atomButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPassengersCountSelectorView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelPassengersCountSelectorView.class, "additionalInfoTextView", "getAdditionalInfoTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private Function1<? super AtomAction, Unit> actionHandler;

    /* renamed from: additionalInfoTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate additionalInfoTextView;

    @NotNull
    private final LargeButtonView atomButtonView;
    private AtomsAdapter atomsAdapter;

    @NotNull
    private final LinearLayout cellsContainerLl;
    private final int dp16;
    private final int dp32;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final HorizontalScrollView scrollContainer;

    @NotNull
    private final HorizontalAtomsLayout travelClassContainerHal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectorPayloads.values().length];
            try {
                iArr[SelectorPayloads.CELLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectorPayloads.TRAVEL_CLASS_SELECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPassengersCountSelectorView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        int margin4 = dimens$default.getMargin4();
        this.dp4 = margin4;
        int margin8 = dimens$default.getMargin8();
        this.dp8 = margin8;
        int margin16 = dimens$default.getMargin16();
        this.dp16 = margin16;
        int margin32 = dimens$default.getMargin32();
        this.dp32 = margin32;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.cellsContainerLl);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = margin4;
        layoutParams.leftMargin = margin16;
        layoutParams.rightMargin = margin16;
        layoutParams.bottomMargin = margin8;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(margin16, margin16, margin16, margin16);
        this.cellsContainerLl = linearLayout;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(R$id.travelClassContainerHal);
        horizontalAtomsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.travelClassContainerHal = horizontalAtomsLayout;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setId(R$id.scrollContainer);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = margin4;
        layoutParams2.bottomMargin = margin8;
        horizontalScrollView.setLayoutParams(layoutParams2);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setOverScrollMode(2);
        ViewExtKt.updatePadding$default(horizontalScrollView, margin16, 0, margin16, 0, 10, null);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.scrollContainer = horizontalScrollView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.additionalInfoTextView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new TravelPassengersCountSelectorView$special$$inlined$preCreationViewPool$default$1(this), new TravelPassengersCountSelectorView$special$$inlined$preCreationViewPool$default$2(this));
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        largeButtonView.setId(R$id.atomButtonView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = margin16;
        layoutParams3.leftMargin = margin16;
        layoutParams3.rightMargin = margin16;
        largeButtonView.setLayoutParams(layoutParams3);
        this.atomButtonView = largeButtonView;
        this.atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        setOrientation(1);
        setPadding(0, 0, 0, margin32);
        addView(linearLayout);
        addView(horizontalScrollView);
        horizontalScrollView.addView(horizontalAtomsLayout);
        addView(getAdditionalInfoTextView());
        addView(largeButtonView);
        linearLayout.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), ResourceExtKt.toPxF(16, context)));
        horizontalAtomsLayout.setAdapter(this.atomsAdapter);
        horizontalAtomsLayout.setDecorator(new TravelPassengersCountSelectorTravelClassDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindAdditionalInfo(Map<String, TextDTO> additionalClassInfo, String id2, TextDTO sampleText) {
        TextDTO textDTO = additionalClassInfo != null ? additionalClassInfo.get(id2) : null;
        TextAtomV2View additionalInfoTextView = getAdditionalInfoTextView();
        if (textDTO != null) {
            sampleText = textDTO;
        }
        TextHolderKt.bindOrGone$default(additionalInfoTextView, sampleText, null, 2, null);
    }

    private final void fixChipClicks(ViewGroup viewGroup, TravelPassengersCountSelectorVO travelPassengersCountSelectorVO, List<ChipDTO> list) {
        Object obj;
        AtomActionDTO action;
        Iterator it = l.h(C5316f0.b(viewGroup), TravelPassengersCountSelectorView$fixChipClicks$$inlined$filterIsInstance$1.INSTANCE).iterator();
        int i11 = 0;
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            String str = null;
            if (!aVar.hasNext()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((ChipDTO) obj).getState() == ChipState.SELECTED) {
                            break;
                        }
                    }
                }
                ChipDTO chipDTO = (ChipDTO) obj;
                if (chipDTO != null) {
                    Map<String, TextDTO> additionalClassInfo = travelPassengersCountSelectorVO.getAdditionalClassInfo();
                    CommonControlSettings common = chipDTO.getCommon();
                    if (common != null && (action = common.getAction()) != null) {
                        str = action.getLink();
                    }
                    bindAdditionalInfo(additionalClassInfo, str, travelPassengersCountSelectorVO.getSampleText());
                    return;
                }
                return;
            }
            Object next = aVar.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ChipView chipView = (ChipView) next;
            chipView.setUnselectByClick(false);
            chipView.setOnSelect(new TravelPassengersCountSelectorView$fixChipClicks$1$1(list, i11, this, travelPassengersCountSelectorVO));
            i11 = i12;
        }
    }

    private final TextAtomV2View getAdditionalInfoTextView() {
        return (TextAtomV2View) this.additionalInfoTextView.getValue(this, $$delegatedProperties[0]);
    }

    private final void inflateQuantityCells(List<TravelQuantityCellVO> items, Function1<? super TravelQuantityCellVO, Unit> onMinusClickedCallback, Function1<? super TravelQuantityCellVO, Unit> onPlusClickedCallback) {
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TravelQuantityCellVO travelQuantityCellVO = (TravelQuantityCellVO) obj;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TravelQuantityCellView travelQuantityCellView = new TravelQuantityCellView(context, null, 0, 0, 14, null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            if (i11 > 0) {
                marginLayoutParams.topMargin = this.dp16;
            }
            travelQuantityCellView.setLayoutParams(marginLayoutParams);
            travelQuantityCellView.setOnMinusButtonClicked(onMinusClickedCallback);
            travelQuantityCellView.setOnPlusButtonClicked(onPlusClickedCallback);
            travelQuantityCellView.bind(travelQuantityCellVO);
            this.cellsContainerLl.addView(travelQuantityCellView);
            i11 = i12;
        }
    }

    public final void bind(@NotNull TravelPassengersCountSelectorVO item, Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super TravelQuantityCellVO, Unit> onMinusClickedCallback, @NotNull Function1<? super TravelQuantityCellVO, Unit> onPlusClickedCallback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onMinusClickedCallback, "onMinusClickedCallback");
        Intrinsics.checkNotNullParameter(onPlusClickedCallback, "onPlusClickedCallback");
        this.actionHandler = actionHandler;
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.setOnAction(actionHandler);
        }
        inflateQuantityCells(item.getQuantityCells(), onMinusClickedCallback, onPlusClickedCallback);
        this.scrollContainer.setVisibility(item.getTravelClassSelector() == null ? 8 : 0);
        TravelPassengersCountSelectorVO.TravelClassSelectorVO travelClassSelector = item.getTravelClassSelector();
        List<ChipDTO> chips = travelClassSelector != null ? travelClassSelector.getChips() : null;
        if (chips == null) {
            chips = K.f71697a;
        }
        AtomsAdapter atomsAdapter2 = this.atomsAdapter;
        if (atomsAdapter2 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter2.bind(context, chips);
        }
        fixChipClicks(this.travelClassContainerHal, item, chips);
        LargeButtonHolderKt.bind(this.atomButtonView, item.getApplyButton(), actionHandler);
    }

    public final void onAttach(Function1<? super AtomAction, Unit> actionHandler) {
        this.actionHandler = actionHandler;
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.setOnAction(actionHandler);
        }
    }

    public final void onDetach() {
        this.actionHandler = null;
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        if (atomsAdapter != null) {
            atomsAdapter.setOnAction(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0010, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(@NotNull TravelPassengersCountSelectorVO item, @NotNull List<? extends SelectorPayloads> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Iterator<T> it = payloads.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((SelectorPayloads) it.next()).ordinal()];
            if (i11 == 1) {
                Iterator it2 = l.h(C5316f0.b(this.cellsContainerLl), TravelPassengersCountSelectorView$update$lambda$11$$inlined$filterIsInstance$1.INSTANCE).iterator();
                int i12 = 0;
                while (true) {
                    C7747g.a aVar = (C7747g.a) it2;
                    if (aVar.hasNext()) {
                        Object next = aVar.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        ((TravelQuantityCellView) next).bind(item.getQuantityCells().get(i12));
                        i12 = i13;
                    }
                }
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                TravelPassengersCountSelectorVO.TravelClassSelectorVO travelClassSelector = item.getTravelClassSelector();
                List<ChipDTO> chips = travelClassSelector != null ? travelClassSelector.getChips() : null;
                if (chips == null) {
                    chips = K.f71697a;
                }
                AtomsAdapter atomsAdapter = this.atomsAdapter;
                if (atomsAdapter != null) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    atomsAdapter.bind(context, chips);
                }
                fixChipClicks(this.travelClassContainerHal, item, chips);
            }
        }
    }
}
