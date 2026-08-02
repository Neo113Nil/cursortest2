package ru.ozon.app.android.cart.common.interceptor;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartDeeplinkInterceptor$intercept$finalUri$1 extends AbstractC7737t implements Function1<Uri, Uri> {
    final /* synthetic */ CartDeeplinkInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartDeeplinkInterceptor$intercept$finalUri$1(CartDeeplinkInterceptor cartDeeplinkInterceptor) {
        super(1);
        this.this$0 = cartDeeplinkInterceptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Uri invoke(Uri it) {
        Uri updateMiniApp;
        Intrinsics.checkNotNullParameter(it, "it");
        updateMiniApp = this.this$0.updateMiniApp(it);
        return updateMiniApp;
    }
}
