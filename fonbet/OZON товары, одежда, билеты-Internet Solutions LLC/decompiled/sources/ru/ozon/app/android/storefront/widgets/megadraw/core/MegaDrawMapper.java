package ru.ozon.app.android.storefront.widgets.megadraw.core;

import android.graphics.Color;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.megadraw.data.CountBlockDTO;
import ru.ozon.app.android.storefront.widgets.megadraw.data.MegaDrawDTO;
import ru.ozon.app.android.storefront.widgets.megadraw.presentation.MegaDrawVO;
import ru.ozon.app.android.storefront.widgets.megadraw.presentation.PrizeBlockVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/core/MegaDrawMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/megadraw/presentation/MegaDrawVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/megadraw/data/MegaDrawDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MegaDrawMapper implements Function2<MegaDrawDTO, d, List<? extends MegaDrawVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MegaDrawVO> invoke(@NotNull MegaDrawDTO state, @NotNull d widgetInfo) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        List<String> gradientColors = state.getPrizesBlock().getGradientColors();
        String backgroundColor = state.getPrizesBlock().getBackgroundColor();
        TextDTO countTitle = state.getPrizesBlock().getCountTitle();
        TextDTO subtitle = state.getPrizesBlock().getSubtitle();
        float progress = state.getPrizesBlock().getProgress();
        if (gradientColors != null && gradientColors.size() == 1) {
            gradientColors = C7714v.p0(gradientColors, gradientColors);
        } else if (gradientColors == null || Intrinsics.i(gradientColors.size(), 1) != 1) {
            gradientColors = null;
        }
        if (gradientColors != null) {
            List<String> list = gradientColors;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
            }
            iArr = C7714v.T0(arrayList);
        } else {
            iArr = null;
        }
        PrizeBlockVO prizeBlockVO = new PrizeBlockVO(backgroundColor, countTitle, subtitle, progress, iArr);
        CountBlockDTO countBlock = state.getCountBlock();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(state.getAction(), state.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new MegaDrawVO(hashCode, atomAction, countBlock, prizeBlockVO, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
