package ru.ozon.app.android.marketing.ui.trustfactors.core;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.ui.trustfactors.data.Alignment;
import ru.ozon.app.android.marketing.ui.trustfactors.data.TrustFactorItem;
import ru.ozon.app.android.marketing.ui.trustfactors.data.TrustFactorsDTO;
import ru.ozon.app.android.marketing.ui.trustfactors.presentation.TrustFactorItemVO;
import ru.ozon.app.android.marketing.ui.trustfactors.presentation.TrustFactorsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/core/TrustFactorsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/ui/trustfactors/data/TrustFactorsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/marketing/ui/trustfactors/data/TrustFactorItem;", "", "widgetId", "Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorItemVO;", "toVo", "(Lru/ozon/app/android/marketing/ui/trustfactors/data/TrustFactorItem;J)Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/ui/trustfactors/data/TrustFactorsDTO;Ll20/d;)Ljava/util/List;", "Companion", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrustFactorsMapper implements Function2<TrustFactorsDTO, d, List<? extends TrustFactorsVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/core/TrustFactorsMapper$Companion;", "", "<init>", "()V", "MIN_SIZE", "", "MAX_SIZE", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final TrustFactorItemVO toVo(TrustFactorItem trustFactorItem, long j11) {
        IconDTO icon = trustFactorItem.getIcon();
        TextDTO title = trustFactorItem.getTitle();
        TextDTO subtitle = trustFactorItem.getSubtitle();
        Alignment alignment = trustFactorItem.getAlignment();
        if (alignment == null) {
            alignment = Alignment.CENTER;
        }
        AtomActionDTO action = trustFactorItem.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, trustFactorItem.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = trustFactorItem.getTrackingInfo();
        return new TrustFactorItemVO(icon, title, subtitle, alignment, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TrustFactorsVO> invoke(@NotNull TrustFactorsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int size = state.getTrustFactors().size();
        if (3 > size || size >= 5) {
            throw new IllegalStateException("Trust factor size should be between 3 and 4");
        }
        String backgroundColor = state.getBackgroundColor();
        List<TrustFactorItem> trustFactors = state.getTrustFactors();
        ArrayList arrayList = new ArrayList(C7714v.z(trustFactors, 10));
        Iterator<T> it = trustFactors.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((TrustFactorItem) it.next(), hashCode));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new TrustFactorsVO(hashCode, backgroundColor, arrayList, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }
}
