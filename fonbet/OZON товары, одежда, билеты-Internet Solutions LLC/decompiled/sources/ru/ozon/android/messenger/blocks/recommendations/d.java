package ru.ozon.android.messenger.blocks.recommendations;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.recommendations.RecommendationsDTO;
import ru.ozon.android.messenger.blocks.recommendations.e;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class d implements Function2<RecommendationsDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends e>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends e> invoke(RecommendationsDTO recommendationsDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        e.b bVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<RecommendationsDTO.ProductDTO> list;
        RecommendationsDTO state = recommendationsDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        List<RecommendationsDTO.Badge> badges = state.getBadges();
        if (badges != null) {
            List<RecommendationsDTO.Badge> list2 = badges;
            arrayList = new ArrayList(C7714v.z(list2, 10));
            for (RecommendationsDTO.Badge badge : list2) {
                arrayList.add(new e.a(badge.getBadge(), badge.getExpirationDate()));
            }
            bVar = null;
        } else {
            bVar = null;
            arrayList = null;
        }
        BadgeDTO buttonBadge = state.getButtonBadge();
        RecommendationsDTO.ProductsDTO products = state.getProducts();
        if (products == null || (list = products.getList()) == null) {
            arrayList2 = bVar;
        } else {
            List<RecommendationsDTO.ProductDTO> list3 = list;
            arrayList2 = new ArrayList(C7714v.z(list3, 10));
            for (RecommendationsDTO.ProductDTO productDTO : list3) {
                arrayList2.add(new e.c(productDTO.getImageUrl(), productDTO.getTitle(), productDTO.getPrice(), productDTO.isAdult(), productDTO.getIcon(), productDTO.getButton(), productDTO.getAction(), productDTO.getTrackingInfo()));
            }
        }
        RecommendationsDTO.ErrorDTO error = state.getError();
        if (error != null) {
            bVar = new e.b(error.getImageUrl(), error.getDescription(), error.getButton());
        }
        return C7714v.a0(new e(blockId, title, subtitle, arrayList, buttonBadge, arrayList2, bVar, state.getUpdateBlockAction(), state.getLexemes(), state.getTrackingInfo(), null, null, state.getPlace()));
    }
}
