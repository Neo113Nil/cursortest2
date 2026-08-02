package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import io.reactivex.p;
import io.reactivex.u;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Float;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class PromoCarouselViewHolder$startAnimation$1 extends AbstractC7737t implements Function1<Float, u<? extends Float>> {
    public static final PromoCarouselViewHolder$startAnimation$1 INSTANCE = new PromoCarouselViewHolder$startAnimation$1();

    PromoCarouselViewHolder$startAnimation$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final u<? extends Float> invoke(Float it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return p.just(it).delay(300L, TimeUnit.MILLISECONDS);
    }
}
