package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.core;

import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.data.PriceActionsDTO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsVO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.utils.PriceActionExtKt;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u0016*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/core/PriceActionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widgetId", "toVo", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO;J)Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$PriceAction;", "actions", "", "", "getActionsWidth", "(Ljava/util/List;)Ljava/util/Map;", "width", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "toVoAction", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$PriceAction;JLjava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Action;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;", "toVoDisclosure", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsVO$Disclosure;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceActionsMapper implements Function2<PriceActionsDTO, d, List<? extends PriceActionsVO>> {

    @NotNull
    private final Context context;

    public PriceActionsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Map<Integer, Integer> getActionsWidth(List<PriceActionsDTO.PriceAction> actions) {
        int i11;
        int i12;
        int i13;
        int i14;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (actions.size() <= 4) {
            int i15 = 0;
            for (Object obj : actions) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C7714v.O0();
                    throw null;
                }
                PriceActionsDTO.PriceAction priceAction = (PriceActionsDTO.PriceAction) obj;
                if (priceAction.getIcon() != null) {
                    i13 = PriceActionsMapperKt.PRICE_ACTION_ICON_PADDING;
                    i14 = PriceActionsMapperKt.PRICE_ACTION_ICON_WIDTH;
                    i11 = i14 + i13;
                } else {
                    i11 = 0;
                }
                i12 = PriceActionsMapperKt.CHEVRON_ICON_WIDTH;
                int measuredWidth = PriceActionExtKt.getMeasuredWidth(TextMapperKt.dsTextAtom$default(priceAction.getText(), null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null), this.context) + i12 + i11;
                SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
                linkedHashMap.put(Integer.valueOf(i15), Integer.valueOf(sellerV4DisclosureViewFactory.getDp12() + sellerV4DisclosureViewFactory.getDp4() + sellerV4DisclosureViewFactory.getDp8() + measuredWidth));
                i15 = i16;
            }
        }
        return linkedHashMap;
    }

    private final PriceActionsVO toVo(PriceActionsDTO priceActionsDTO, long j11) {
        Integer num;
        SellerV4DisclosureViewFactory sellerV4DisclosureViewFactory = SellerV4DisclosureViewFactory.INSTANCE;
        int dp16 = this.context.getResources().getDisplayMetrics().widthPixels - (sellerV4DisclosureViewFactory.getDp16() + (sellerV4DisclosureViewFactory.getDp16() + ((priceActionsDTO.getActions().size() - 1) * sellerV4DisclosureViewFactory.getDp8())));
        Map<Integer, Integer> actionsWidth = getActionsWidth(priceActionsDTO.getActions());
        int J02 = C7714v.J0(actionsWidth.values());
        int i11 = dp16 - J02;
        List<PriceActionsDTO.PriceAction> actions = priceActionsDTO.getActions();
        ArrayList arrayList = new ArrayList(C7714v.z(actions, 10));
        Iterator<T> it = actions.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                String backgroundColor = priceActionsDTO.getBackgroundColor();
                if (backgroundColor == null) {
                    backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
                }
                String str = backgroundColor;
                Map<String, TokenizedTrackingInfo> trackingInfo = priceActionsDTO.getTrackingInfo();
                return new PriceActionsVO(j11, arrayList, str, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            PriceActionsDTO.PriceAction priceAction = (PriceActionsDTO.PriceAction) next;
            int i14 = -2;
            if (J02 < dp16 && (num = actionsWidth.get(Integer.valueOf(i12))) != null) {
                float intValue = num.intValue();
                i14 = (int) (((i11 * intValue) / J02) + intValue);
            }
            arrayList.add(toVoAction(priceAction, j11, Integer.valueOf(i14)));
            i12 = i13;
        }
    }

    private final PriceActionsVO.Action toVoAction(PriceActionsDTO.PriceAction priceAction, long j11, Integer num) {
        String backgroundColor = priceAction.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_PRIMARY.getToken();
        }
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(priceAction.getText(), null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null);
        Icon icon = priceAction.getIcon();
        PriceActionsDTO.Disclosure disclosure = priceAction.getDisclosure();
        PriceActionsVO.Disclosure voDisclosure = disclosure != null ? toVoDisclosure(disclosure) : null;
        AtomActionDTO action = priceAction.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, priceAction.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = priceAction.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Integer animationTimer = priceAction.getAnimationTimer();
        Map<String, TokenizedTrackingInfo> animationTrackingInfo = priceAction.getAnimationTrackingInfo();
        return new PriceActionsVO.Action(backgroundColor, dsTextAtom$default, icon, voDisclosure, atomAction, mapToTokenizedEvent$default, animationTimer, animationTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(animationTrackingInfo, Long.valueOf(j11), null, 2, null) : null, priceAction.getOnboarding(), num);
    }

    private final PriceActionsVO.Disclosure toVoDisclosure(PriceActionsDTO.Disclosure disclosure) {
        String tintColor = disclosure.getTintColor();
        if (tintColor == null) {
            tintColor = UniColors.GRAPHIC_NEUTRAL.getToken();
        }
        return new PriceActionsVO.Disclosure(tintColor);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceActionsVO> invoke(@NotNull PriceActionsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return state.getActions().isEmpty() ? K.f71697a : C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
