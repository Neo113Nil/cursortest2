package ru.ozon.app.android.ugc.core.widgets.commentsListV3.core;

import Kk.c;
import T00.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "dto", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class CommentsListHeaderV3ViewMapper$mapper$1 extends AbstractC7737t implements Function2<CommentsListDTO, d, List<? extends CommentsHeaderVO>> {
    public static final CommentsListHeaderV3ViewMapper$mapper$1 INSTANCE = new CommentsListHeaderV3ViewMapper$mapper$1();

    CommentsListHeaderV3ViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<CommentsHeaderVO> invoke(CommentsListDTO dto, d widgetInfo) {
        String c11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a b11 = widgetInfo.b();
        if (!Intrinsics.d((b11 == null || (c11 = b11.c()) == null) ? null : Boolean.valueOf(!h.t(c11, "comments", false)), Boolean.TRUE)) {
            return K.f71697a;
        }
        return C7714v.a0(new CommentsHeaderVO(c.a(widgetInfo.d(), CommentV3DTO.HEADER_FIELD_NAME), dto.getTitle(), TextDTO.copy$default(dto.getCountText(), new OzonSpannableString(String.valueOf(dto.getTotalCount())), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), dto.getTotalCount(), dto.getEmptyState() != null));
    }
}
