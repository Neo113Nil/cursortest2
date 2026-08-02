package ru.ozon.app.android.commonwidgets.widgets.textblock.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"mapToVO", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;", "stateId", "", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockMappersKt {
    @NotNull
    public static final TextBlockVO mapToVO(@NotNull TextBlockDTO textBlockDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(textBlockDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new TextBlockVO(stateId.hashCode(), textBlockDTO.getTitle(), textBlockDTO.getBody(), textBlockDTO.isRounded(), textBlockDTO.getAtomSpacing());
    }
}
