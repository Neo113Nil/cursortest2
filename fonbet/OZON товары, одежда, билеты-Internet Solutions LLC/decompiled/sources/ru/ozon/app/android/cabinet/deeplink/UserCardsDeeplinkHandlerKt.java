package ru.ozon.app.android.cabinet.deeplink;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"clearQueryParameters", "Landroid/net/Uri;", "cabinet_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserCardsDeeplinkHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri clearQueryParameters(Uri uri) {
        Uri build = uri.buildUpon().clearQuery().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
