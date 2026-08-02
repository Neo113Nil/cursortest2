package ru.ozon.app.android.composer.network.referrer;

import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/network/referrer/ReferrerHeaderInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "referrerValueController", "<init>", "(Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;)V", "LWe/L;", "", "path", "", "isComposerRedirect", "(LWe/L;Ljava/lang/String;)Z", "LWe/B$a;", "chain", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReferrerHeaderInterceptor extends BXInterceptor {

    @NotNull
    private final ReferrerValueController referrerValueController;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/referrer/ReferrerHeaderInterceptor$Companion;", "", "<init>", "()V", "HEADER_REFERER", "", "HEADER_SERVER_REDIRECT_FINAL", "QUERY_URL", "CHECKOUT_PATCH_PREFIX", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReferrerHeaderInterceptor(@NotNull ReferrerValueController referrerValueController) {
        Intrinsics.checkNotNullParameter(referrerValueController, "referrerValueController");
        this.referrerValueController = referrerValueController;
    }

    private final boolean isComposerRedirect(L l11, String str) {
        Uri parse;
        String path;
        String c11 = l11.r().c("server-redirect-final");
        String S11 = (c11 == null || (parse = Uri.parse(c11)) == null || (path = parse.getPath()) == null) ? null : h.S(path, "/");
        return (S11 == null || S11.equals(str)) ? false : true;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Uri parse;
        String path;
        String S11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String p11 = request.j().p(ImagesContract.URL);
        if (p11 != null && (parse = Uri.parse(p11)) != null && (path = parse.getPath()) != null) {
            if (!h.e0(path, "/gocheckout", false)) {
                path = null;
            }
            if (path != null && (S11 = h.S(path, "/")) != null) {
                String referrerValue = this.referrerValueController.getReferrerValue();
                if (referrerValue == null) {
                    return chain.proceed(request);
                }
                G.a aVar = new G.a(request);
                aVar.a("app-referrer", referrerValue);
                L proceed = chain.proceed(aVar.b());
                if (!proceed.v() || isComposerRedirect(proceed, S11)) {
                    this.referrerValueController.setCurrentPageReferrer(referrerValue);
                    return proceed;
                }
                this.referrerValueController.setCurrentPageReferrer(null);
                return proceed;
            }
        }
        return chain.proceed(request);
    }
}
