package ru.ozon.app.android.analytics.plugins.af;

import Ge.f;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver;", "", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "appsFlyerConversionStorage", "<init>", "(Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;)V", "Landroid/net/Uri;", "uri", "", "isLinkSupported", "(Landroid/net/Uri;)Z", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "resolveLink", "(Landroid/net/Uri;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerConversionStorage;", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppsFlyerResolver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AppsFlyerConversionStorage appsFlyerConversionStorage;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerResolver$Companion;", "", "<init>", "()V", "ONE_LINK_HOST", "", "isLinkSupported", "", "uri", "Landroid/net/Uri;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isLinkSupported(Uri uri) {
            String host;
            return (uri == null || (host = uri.getHost()) == null || !h.t(host, "onelink", false)) ? false : true;
        }

        private Companion() {
        }
    }

    public AppsFlyerResolver(@NotNull AppsFlyerConversionStorage appsFlyerConversionStorage) {
        Intrinsics.checkNotNullParameter(appsFlyerConversionStorage, "appsFlyerConversionStorage");
        this.appsFlyerConversionStorage = appsFlyerConversionStorage;
    }

    public final boolean isLinkSupported(Uri uri) {
        return INSTANCE.isLinkSupported(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveLink(@NotNull Uri uri, @NotNull d<? super AppsFlyerDeeplinkResult> dVar) {
        AppsFlyerResolver$resolveLink$1 appsFlyerResolver$resolveLink$1;
        int i11;
        if (dVar instanceof AppsFlyerResolver$resolveLink$1) {
            appsFlyerResolver$resolveLink$1 = (AppsFlyerResolver$resolveLink$1) dVar;
            int i12 = appsFlyerResolver$resolveLink$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                appsFlyerResolver$resolveLink$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = appsFlyerResolver$resolveLink$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = appsFlyerResolver$resolveLink$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    this.appsFlyerConversionStorage.performDeeplink(uri);
                    p<AppsFlyerDeeplinkResult> observeResult = this.appsFlyerConversionStorage.observeResult();
                    appsFlyerResolver$resolveLink$1.label = 1;
                    obj = f.c(observeResult, appsFlyerResolver$resolveLink$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "awaitFirst(...)");
                return obj;
            }
        }
        appsFlyerResolver$resolveLink$1 = new AppsFlyerResolver$resolveLink$1(this, dVar);
        Object obj2 = appsFlyerResolver$resolveLink$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = appsFlyerResolver$resolveLink$1.label;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "awaitFirst(...)");
        return obj2;
    }
}
