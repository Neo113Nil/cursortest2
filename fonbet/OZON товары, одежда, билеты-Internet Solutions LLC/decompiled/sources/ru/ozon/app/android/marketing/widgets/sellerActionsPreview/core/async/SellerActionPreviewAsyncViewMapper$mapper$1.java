package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.async;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Async;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Async;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SellerActionPreviewAsyncViewMapper$mapper$1 extends AbstractC7737t implements Function2<SellerActionsPreviewDtoWrapper.Async, d, List<SellerActionsPreviewVO.Async>> {
    public static final SellerActionPreviewAsyncViewMapper$mapper$1 INSTANCE = new SellerActionPreviewAsyncViewMapper$mapper$1();

    SellerActionPreviewAsyncViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SellerActionsPreviewVO.Async> invoke(SellerActionsPreviewDtoWrapper.Async state, d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        ArrayList arrayList = new ArrayList();
        String a11 = info.c().a();
        if (a11 != null) {
            arrayList.add(SellerActionsPreviewDtoWrapper.DefaultImpls.mapToVo$default(state, info.d().hashCode(), a11, false, 4, null));
        }
        return arrayList;
    }
}
