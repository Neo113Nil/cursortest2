package ru.ozon.app.android.ads.data.pixel;

import Nk.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PixelHeadersInterceptor$userAgentForPixel$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ PixelHeadersInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PixelHeadersInterceptor$userAgentForPixel$2(PixelHeadersInterceptor pixelHeadersInterceptor) {
        super(0);
        this.this$0 = pixelHeadersInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AppVersionStorage appVersionStorage;
        appVersionStorage = this.this$0.appVersionStorage;
        return a.b("OzonExternalAndroid/", appVersionStorage.getVersionName());
    }
}
