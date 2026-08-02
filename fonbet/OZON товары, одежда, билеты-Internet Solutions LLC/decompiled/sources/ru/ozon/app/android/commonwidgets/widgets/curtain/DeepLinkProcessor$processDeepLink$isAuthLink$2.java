package ru.ozon.app.android.commonwidgets.widgets.curtain;

import Kk.C3532b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeepLinkProcessor$processDeepLink$isAuthLink$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ Uri $deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkProcessor$processDeepLink$isAuthLink$2(Uri uri) {
        super(0);
        this.$deeplink = uri;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (c8.C5766e.c(r4.$deeplink, "getPathSegments(...)", 1, "credentials-required") != false) goto L10;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke() {
        boolean z11 = Intrinsics.d(this.$deeplink.getAuthority(), "my") && C3532b.g(this.$deeplink, "getPathSegments(...)", "entry");
        return Boolean.valueOf(z11);
    }
}
