package ru.ozon.app.android.common.ui.actionCards.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.ui.actionCards.ButtonMeasurer;
import ru.ozon.app.android.common.ui.actionCards.data.ActionCardsDTO;
import ru.ozon.app.android.common.ui.actionCards.presentation.CardVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/ui/actionCards/core/ActionCardsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/ui/actionCards/data/ActionCardsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/common/ui/actionCards/ButtonMeasurer;", "buttonMeasurer", "<init>", "(Lru/ozon/app/android/common/ui/actionCards/ButtonMeasurer;)V", "Lru/ozon/app/android/common/ui/actionCards/data/ActionCardsDTO$CardDTO;", "", "id", "", "buttonWidth", "cardsSize", "position", "toVo", "(Lru/ozon/app/android/common/ui/actionCards/data/ActionCardsDTO$CardDTO;JIII)Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO;", "Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "defineMarginModel", "(II)Lru/ozon/app/android/common/ui/actionCards/presentation/CardVO$MarginModel;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/ui/actionCards/data/ActionCardsDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/common/ui/actionCards/ButtonMeasurer;", "dp16", "I", "dp7", "dp1", "action-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionCardsMapper implements Function2<ActionCardsDTO, d, List<? extends CardVO>> {

    @NotNull
    private final ButtonMeasurer buttonMeasurer;
    private final int dp1;
    private final int dp16;
    private final int dp7;

    public ActionCardsMapper(@NotNull ButtonMeasurer buttonMeasurer) {
        Intrinsics.checkNotNullParameter(buttonMeasurer, "buttonMeasurer");
        this.buttonMeasurer = buttonMeasurer;
        this.dp16 = UiExtKt.toPx(16);
        this.dp7 = UiExtKt.toPx(7);
        this.dp1 = UiExtKt.toPx(1);
    }

    private final CardVO.MarginModel defineMarginModel(int cardsSize, int position) {
        return new CardVO.MarginModel(position == 1 ? this.dp16 : this.dp1, (cardsSize == 1 || cardsSize == position) ? this.dp16 : this.dp7);
    }

    private final CardVO toVo(ActionCardsDTO.CardDTO cardDTO, long j11, int i11, int i12, int i13) {
        String image = cardDTO.getImage();
        TextAtom title = cardDTO.getTitle();
        TextAtom subtitle = cardDTO.getSubtitle();
        ButtonV3Atom.SmallButton button = cardDTO.getButton();
        AtomActionDTO action = cardDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, cardDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = cardDTO.getTrackingInfo();
        return new CardVO(j11, image, title, subtitle, button, atomAction, i11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, defineMarginModel(i12, i13));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CardVO> invoke(@NotNull ActionCardsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ActionCardsDTO.CardDTO> cards = state.getCards();
        ArrayList arrayList = new ArrayList(C7714v.z(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(this.buttonMeasurer.measure(((ActionCardsDTO.CardDTO) it.next()).getButton())));
        }
        Integer num = (Integer) C7714v.d0(arrayList);
        int i11 = 0;
        int intValue = num != null ? num.intValue() : 0;
        long hashCode = widgetInfo.d().hashCode();
        List<ActionCardsDTO.CardDTO> cards2 = state.getCards();
        ArrayList arrayList2 = new ArrayList(C7714v.z(cards2, 10));
        for (Object obj : cards2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList2.add(toVo((ActionCardsDTO.CardDTO) obj, hashCode, intValue, state.getCards().size(), i12));
            i11 = i12;
        }
        return arrayList2;
    }
}
