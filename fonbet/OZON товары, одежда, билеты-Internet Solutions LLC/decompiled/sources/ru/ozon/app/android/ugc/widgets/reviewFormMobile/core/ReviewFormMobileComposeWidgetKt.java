package ru.ozon.app.android.ugc.widgets.reviewFormMobile.core;

import android.annotation.SuppressLint;
import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "islandSeparatorViewMapper", "Lru/ozon/app/android/widgets/plainText/core/PlainTextViewMapper2;", "plainTextViewMapper2", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerViewMapper;", "mediaPickerViewMapper", "Ln20/i;", "ReviewFormMobileComposeWidget", "(Lru/ozon/app/android/separator/core/SeparatorViewMapper;Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;Lru/ozon/app/android/widgets/plainText/core/PlainTextViewMapper2;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerViewMapper;)Ln20/i;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormMobileComposeWidgetKt {
    @SuppressLint({"RequiredDslCall"})
    @NotNull
    public static final i ReviewFormMobileComposeWidget(@NotNull SeparatorViewMapper separatorViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper, @NotNull PlainTextViewMapper2 plainTextViewMapper2, @NotNull MediaPickerViewMapper mediaPickerViewMapper) {
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(plainTextViewMapper2, "plainTextViewMapper2");
        Intrinsics.checkNotNullParameter(mediaPickerViewMapper, "mediaPickerViewMapper");
        return C6020f.b("rpProduct", "reviewFormMobile", null, new ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1(separatorViewMapper, islandSeparatorViewMapper, plainTextViewMapper2, mediaPickerViewMapper), 4, null);
    }

    public static /* synthetic */ i ReviewFormMobileComposeWidget$default(SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, PlainTextViewMapper2 plainTextViewMapper2, MediaPickerViewMapper mediaPickerViewMapper, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            mediaPickerViewMapper = new MediaPickerViewMapper();
        }
        return ReviewFormMobileComposeWidget(separatorViewMapper, commonIslandSeparatorViewMapper2, plainTextViewMapper2, mediaPickerViewMapper);
    }
}
