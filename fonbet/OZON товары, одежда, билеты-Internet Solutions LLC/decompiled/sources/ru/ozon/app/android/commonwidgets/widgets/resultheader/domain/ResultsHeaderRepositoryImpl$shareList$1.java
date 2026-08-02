package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.model.ShareListResponseDTO;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ShareListVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ShareListVO;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ShareListResponseDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ShareListResponseDTO;)Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ShareListVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ResultsHeaderRepositoryImpl$shareList$1 extends AbstractC7737t implements Function1<ShareListResponseDTO, ShareListVO> {
    public static final ResultsHeaderRepositoryImpl$shareList$1 INSTANCE = new ResultsHeaderRepositoryImpl$shareList$1();

    ResultsHeaderRepositoryImpl$shareList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ShareListVO invoke(ShareListResponseDTO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ShareListVO(g.c(it.getTitle(), " ", it.getUrl()));
    }
}
