package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.presentation.AddLegalInnMobileVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/data/GetLegalsByInnResponse;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalInnMobile/presentation/AddLegalInnMobileVO$StateVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddLegalInnMobileRepository$getLegalsByInn$1 extends AbstractC7737t implements Function1<GetLegalsByInnResponse, AddLegalInnMobileVO.StateVO> {
    final /* synthetic */ String $inn;
    final /* synthetic */ AddLegalInnMobileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddLegalInnMobileRepository$getLegalsByInn$1(AddLegalInnMobileRepository addLegalInnMobileRepository, String str) {
        super(1);
        this.this$0 = addLegalInnMobileRepository;
        this.$inn = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AddLegalInnMobileVO.StateVO invoke(GetLegalsByInnResponse it) {
        AddLegalInnMobileVO.StateVO vo;
        Intrinsics.checkNotNullParameter(it, "it");
        vo = this.this$0.toVo(it, this.$inn);
        return vo;
    }
}
