package ru.ozon.app.android.commonwidgets.widgets.curtain;

import Kk.C3532b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeepLinkProcessor$processDeepLink$isFashionLink$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ Uri $deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkProcessor$processDeepLink$isFashionLink$2(Uri uri) {
        super(0);
        this.$deeplink = uri;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Intrinsics.d(this.$deeplink.getAuthority(), "storefront") && C3532b.g(this.$deeplink, "getPathSegments(...)", "onboarding_fashion"));
    }
}
