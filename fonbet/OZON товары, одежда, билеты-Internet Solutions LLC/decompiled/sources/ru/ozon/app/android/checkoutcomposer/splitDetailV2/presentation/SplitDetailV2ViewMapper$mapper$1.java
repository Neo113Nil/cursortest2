package ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.data.SplitDetailV2DTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/checkoutcomposer/splitDetailV2/presentation/SplitDetailV2VO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/splitDetailV2/data/SplitDetailV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SplitDetailV2ViewMapper$mapper$1 extends AbstractC7737t implements Function2<SplitDetailV2DTO, d, List<? extends SplitDetailV2VO>> {
    final /* synthetic */ SplitDetailV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplitDetailV2ViewMapper$mapper$1(SplitDetailV2ViewMapper splitDetailV2ViewMapper) {
        super(2);
        this.this$0 = splitDetailV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SplitDetailV2VO> invoke(SplitDetailV2DTO dto, d info) {
        SplitDetailV2VO mapToViewObject;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        if (dto.getHorizontal() != null && dto.getVertical() != null) {
            throw new IllegalArgumentException("Rfbs Split Error: Only one of the types should be implemented");
        }
        if (dto.getVertical() == null && dto.getHorizontal() == null) {
            throw new IllegalArgumentException("Rfbs Split Error: One of the types must be implemented");
        }
        mapToViewObject = this.this$0.mapToViewObject(info.d(), dto);
        return C7714v.a0(mapToViewObject);
    }
}
