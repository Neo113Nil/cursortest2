package ru.ozon.app.android.pdp.deeplink;

import GZ.j;
import IZ.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.pdfviewer.presentation.PdfViewerActivity;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b*\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b*\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b*\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b*\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u0013\u0010\u0012\u001a\u00020\b*\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\b*\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\nJ#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/deeplink/PdfViewerDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "<init>", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "", "isStatic", "(LGZ/j;)Z", "isPdf", "Landroid/net/Uri;", "", "paramUrl", "(Landroid/net/Uri;)Ljava/lang/String;", "pdfWithAuth", "pdfWithoutAuth", "isFileUrl", "(Ljava/lang/String;)Z", "isImageUrl", "route", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdfViewerDeeplinkHandler implements a {

    @NotNull
    private final DomainsInteractor domainsInteractor;

    public PdfViewerDeeplinkHandler(@NotNull DomainsInteractor domainsInteractor) {
        Intrinsics.checkNotNullParameter(domainsInteractor, "domainsInteractor");
        this.domainsInteractor = domainsInteractor;
    }

    private final boolean isFileUrl(String str) {
        return h.e0(str, "file:", false);
    }

    private final boolean isImageUrl(String str) {
        return h.A(str, "png", false) | h.A(str, "jpg", false) | h.A(str, "jpeg", false);
    }

    private final boolean isPdf(j jVar) {
        Uri b11 = jVar.b();
        if (!Intrinsics.d(b11.getScheme(), "ozon") || !Intrinsics.d(b11.getAuthority(), "pdf")) {
            return false;
        }
        String paramUrl = paramUrl(b11);
        if (paramUrl == null) {
            paramUrl = "";
        }
        return paramUrl.length() > 0;
    }

    private final boolean isStatic(j jVar) {
        return jVar.b().getPathSegments().contains("static");
    }

    private final String paramUrl(Uri uri) {
        return uri.getQueryParameter(ImagesContract.URL);
    }

    private final boolean pdfWithAuth(j jVar) {
        String paramUrl = paramUrl(jVar.b());
        return (paramUrl == null || isStatic(jVar) || (!isFileUrl(paramUrl) && !this.domainsInteractor.isUrlSubdomainOfWebDomains(paramUrl))) ? false : true;
    }

    private final boolean pdfWithoutAuth(j jVar) {
        String paramUrl = paramUrl(jVar.b());
        return paramUrl != null && isStatic(jVar) && (isFileUrl(paramUrl) || this.domainsInteractor.isUrlSubdomainOfStaticsWhitelist(paramUrl));
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (isPdf(route)) {
            return pdfWithAuth(route) || pdfWithoutAuth(route);
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intent startIntent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter(ImagesContract.URL);
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (isImageUrl(queryParameter)) {
            startIntent = GalleryActivity.INSTANCE.newIntent(context, new GalleryRequest(C7714v.a0(new GalleryRequest.GalleryItem.Image(queryParameter, null, false, 6, null)), 0));
        } else {
            startIntent = PdfViewerActivity.INSTANCE.startIntent(context, queryParameter, Boolean.valueOf(isStatic(route) || !this.domainsInteractor.isUrlSubdomainOfNetworkRequestDomains(queryParameter)));
        }
        return new C8880a(startIntent);
    }
}
