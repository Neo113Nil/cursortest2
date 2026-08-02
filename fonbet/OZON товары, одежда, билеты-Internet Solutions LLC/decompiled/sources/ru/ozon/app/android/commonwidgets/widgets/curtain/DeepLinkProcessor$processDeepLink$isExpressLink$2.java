package ru.ozon.app.android.commonwidgets.widgets.curtain;

import B0.C2454a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeepLinkProcessor$processDeepLink$isExpressLink$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ Uri $deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkProcessor$processDeepLink$isExpressLink$2(Uri uri) {
        super(0);
        this.$deeplink = uri;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z11 = false;
        if (Intrinsics.d(this.$deeplink.getAuthority(), "express") && this.$deeplink.getPathSegments().size() == 1 && C2454a.h(this.$deeplink, "expressTabOnboarding", 0)) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
