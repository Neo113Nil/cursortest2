package ru.ozon.app.android.fresh.navigation.deeplinks;

import B0.C2454a;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/navigation/deeplinks/FreshTabOnboardingDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "Landroid/net/Uri;", "deeplink", "", "isValidImageUrl", "(Landroid/net/Uri;)Z", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshTabOnboardingDeeplinkHandler implements a {

    @NotNull
    private final DomainsInteractor domainsInteractor;

    public FreshTabOnboardingDeeplinkHandler(@NotNull DomainsInteractor domainsInteractor) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        this.domainsInteractor = domainsInteractor;
    }

    private final boolean isValidImageUrl(Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter("image");
        if (queryParameter == null) {
            return false;
        }
        return this.domainsInteractor.isUrlSubdomainOfStaticsWhitelist(queryParameter);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getAuthority(), "express") && b11.getPathSegments().size() == 1 && C2454a.h(b11, "expressTabOnboarding", 0) && isValidImageUrl(b11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter(SelectionItemFormDTO.TITLE_FIELD_NAME);
        String queryParameter2 = route.b().getQueryParameter("description");
        String queryParameter3 = route.b().getQueryParameter("image");
        Intrinsics.checkNotNullExpressionValue("FreshTabOnboardingDialog", "getSimpleName(...)");
        return new C9992d(new c("FreshTabOnboardingDialog", FreshTabOnboardingDialog.INSTANCE.newInstance(queryParameter, queryParameter2, queryParameter3), null, false, false, null, false, false, false, 508, null), null, 2, 0 == true ? 1 : 0);
    }
}
