package ru.ozon.app.android.minifyLink.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/minifyLink/data/MinifyLinkDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MinifyLinkRepositoryImpl$minifyLink$1 extends AbstractC7737t implements Function1<ActionV2Response<MinifyLinkDTO>, String> {
    final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MinifyLinkRepositoryImpl$minifyLink$1(String str) {
        super(1);
        this.$url = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(ActionV2Response<MinifyLinkDTO> it) {
        String shortURL;
        Intrinsics.checkNotNullParameter(it, "it");
        MinifyLinkDTO data = it.getData();
        return (data == null || (shortURL = data.getShortURL()) == null) ? this.$url : shortURL;
    }
}
