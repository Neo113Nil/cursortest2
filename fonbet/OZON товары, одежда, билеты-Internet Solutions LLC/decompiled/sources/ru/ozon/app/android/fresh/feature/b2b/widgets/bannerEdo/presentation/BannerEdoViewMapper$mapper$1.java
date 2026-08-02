package ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.fresh.feature.b2b.widgets.bannerEdo.data.BannerEdoDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/data/BannerEdoDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/presentation/BannerEdoVO;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/bannerEdo/data/BannerEdoDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BannerEdoViewMapper$mapper$1 extends AbstractC7737t implements Function2<BannerEdoDTO, d, List<? extends BannerEdoVO>> {
    final /* synthetic */ BannerEdoViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerEdoViewMapper$mapper$1(BannerEdoViewMapper bannerEdoViewMapper) {
        super(2);
        this.this$0 = bannerEdoViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<BannerEdoVO> invoke(BannerEdoDTO dto, d info) {
        List vo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(dto.getTitle());
        vo = this.this$0.toVo(dto.getList());
        return C7714v.a0(new BannerEdoVO(hashCode, dsTextAtom, vo, dto.getImageSrc(), dto.getButton()));
    }
}
