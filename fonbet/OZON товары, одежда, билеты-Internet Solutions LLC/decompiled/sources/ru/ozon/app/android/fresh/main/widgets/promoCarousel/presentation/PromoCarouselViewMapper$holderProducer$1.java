package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import B0.C2454a;
import WZ.l;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.fresh.common.flags.FreshPerfPromoCarousel;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.PromoCarouselBannerDecorator;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PromoCarouselViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PromoCarouselViewHolder> {
    final /* synthetic */ PromoCarouselViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoCarouselViewMapper$holderProducer$1(PromoCarouselViewMapper promoCarouselViewMapper) {
        super(2);
        this.this$0 = promoCarouselViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PromoCarouselViewHolder invoke(View view, ComposerReferences refs) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        PromoCarouselRecyclerView promoCarouselRecyclerView = (PromoCarouselRecyclerView) view;
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        PromoCarouselBannerDecorator decorator = this.this$0.component().getDecorator();
        List m11 = h.m(this.this$0.component().getFeatureService().getStringKey(CategoryMainPageFreshPreCreateWidgetsNewConfiguration.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d((String) obj, "promoCarousel")) {
                break;
            }
        }
        return new PromoCarouselViewHolder(promoCarouselRecyclerView, refs, tokenizedAnalytics, decorator, obj != null, this.this$0.component().getFeatureService().getBooleanKey(FreshPerfPromoCarousel.INSTANCE));
    }
}
