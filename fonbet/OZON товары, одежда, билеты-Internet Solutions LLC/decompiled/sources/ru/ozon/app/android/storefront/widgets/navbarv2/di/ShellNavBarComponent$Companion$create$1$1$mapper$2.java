package ru.ozon.app.android.storefront.widgets.navbarv2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.ShellNavBarMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ShellNavBarComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<ShellNavBarMapper> {
    final /* synthetic */ ShellNavBarComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavBarComponent$Companion$create$1$1$mapper$2(ShellNavBarComponent$Companion$create$1$1 shellNavBarComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = shellNavBarComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ShellNavBarMapper invoke() {
        AndroidPlatformComponentApi androidPlatformComponentApi;
        androidPlatformComponentApi = this.this$0.androidPlatformComponentApi;
        return new ShellNavBarMapper(androidPlatformComponentApi.getAppType());
    }
}
