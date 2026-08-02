package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SellerActionsPreviewComponent$Companion$create$1$1$isSelect$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ SellerActionsPreviewComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerActionsPreviewComponent$Companion$create$1$1$isSelect$2(SellerActionsPreviewComponent$Companion$create$1$1 sellerActionsPreviewComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = sellerActionsPreviewComponent$Companion$create$1$1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AndroidPlatformComponentApi androidPlatformComponentApi;
        androidPlatformComponentApi = this.this$0.androidPlatformComponentApi;
        return Boolean.valueOf(androidPlatformComponentApi.getAppType() == AppType.SELECT);
    }
}
