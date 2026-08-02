package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentModels;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentModelsKt;
import ru.ozon.app.android.checkoutcomposer.comment.data.CommentVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/checkoutcomposer/comment/data/CommentVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/comment/data/CommentModels;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CommentViewMapper$mapper$1 extends AbstractC7737t implements Function2<CommentModels, d, List<? extends CommentVO>> {
    public static final CommentViewMapper$mapper$1 INSTANCE = new CommentViewMapper$mapper$1();

    CommentViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CommentVO> invoke(CommentModels dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(CommentModelsKt.toVO(dto, info.d()));
    }
}
