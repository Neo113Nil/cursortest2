package ru.ozon.app.android.storefront.deeplinkhandlers.home;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "", "", "deeplink", "", "failedExternalLinkRetryEnabled", "LpZ/f;", "createFragmentDestination", "(Ljava/lang/String;Z)LpZ/f;", "Landroid/content/Context;", "context", "redirectDeeplink", "LpZ/a;", "createActivityDestination", "(Landroid/content/Context;Ljava/lang/String;)LpZ/a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HomeDestinationFactory {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ C8880a createActivityDestination$default(HomeDestinationFactory homeDestinationFactory, Context context, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createActivityDestination");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            return homeDestinationFactory.createActivityDestination(context, str);
        }
    }

    @NotNull
    C8880a createActivityDestination(@NotNull Context context, String redirectDeeplink);

    @NotNull
    f createFragmentDestination(@NotNull String deeplink, boolean failedExternalLinkRetryEnabled);
}
