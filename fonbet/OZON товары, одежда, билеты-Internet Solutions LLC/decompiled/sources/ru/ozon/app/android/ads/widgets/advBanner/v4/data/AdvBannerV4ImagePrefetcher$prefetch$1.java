package ru.ozon.app.android.ads.widgets.advBanner.v4.data;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4ImagePrefetcher$prefetch$1", f = "AdvBannerV4ImagePrefetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvBannerV4ImagePrefetcher$prefetch$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Float $aspectRatio;
    final /* synthetic */ List<AdvBannerV4DTO.ItemDTO> $items;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ AdvBannerV4ImagePrefetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4ImagePrefetcher$prefetch$1(AdvBannerV4ImagePrefetcher advBannerV4ImagePrefetcher, List<AdvBannerV4DTO.ItemDTO> list, Float f7, String str, d<? super AdvBannerV4ImagePrefetcher$prefetch$1> dVar) {
        super(2, dVar);
        this.this$0 = advBannerV4ImagePrefetcher;
        this.$items = list;
        this.$aspectRatio = f7;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvBannerV4ImagePrefetcher$prefetch$1(this.this$0, this.$items, this.$aspectRatio, this.$url, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.prefetchInternal(this.$items, this.$aspectRatio, this.$url);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvBannerV4ImagePrefetcher$prefetch$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
