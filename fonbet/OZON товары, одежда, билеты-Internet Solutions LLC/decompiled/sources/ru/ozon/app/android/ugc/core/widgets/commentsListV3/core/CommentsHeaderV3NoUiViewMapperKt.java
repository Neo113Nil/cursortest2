package ru.ozon.app.android.ugc.core.widgets.commentsListV3.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.header.CommentsHeaderVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"updateCount", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/header/CommentsHeaderVO;", "count", "", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsHeaderV3NoUiViewMapperKt {
    @NotNull
    public static final CommentsHeaderVO updateCount(@NotNull CommentsHeaderVO commentsHeaderVO, int i11) {
        Intrinsics.checkNotNullParameter(commentsHeaderVO, "<this>");
        return CommentsHeaderVO.copy$default(commentsHeaderVO, 0L, null, TextDTO.copy$default(commentsHeaderVO.getCountText(), new OzonSpannableString(String.valueOf(i11)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), i11, false, 19, null);
    }
}
