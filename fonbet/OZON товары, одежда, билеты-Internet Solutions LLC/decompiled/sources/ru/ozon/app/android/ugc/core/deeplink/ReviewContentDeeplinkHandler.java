package ru.ozon.app.android.ugc.core.deeplink;

import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import i10.l;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewContentParam;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery.ReviewGalleryV2Configurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoMoleculeConfigurator;
import ru.ozon.app.android.pdpvideomolecule.presentation.VideoPreloadCleanerConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/ReviewContentDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "createReviewContentDeeplink", "(Landroid/net/Uri;)Landroid/net/Uri;", "Landroid/net/Uri$Builder;", "", "includeMiniAppParam", "addAdditionalParamsAndBuild", "(Landroid/net/Uri$Builder;Landroid/net/Uri;Z)Landroid/net/Uri;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewContentDeeplinkHandler implements a {
    private final Uri addAdditionalParamsAndBuild(Uri.Builder builder, Uri uri, boolean z11) {
        builder.appendPath("review");
        builder.appendPath("photos");
        if (!uri.getQueryParameterNames().contains("rg_type")) {
            builder.appendQueryParameter("rg_type", "single");
        }
        if (!uri.getQueryParameterNames().contains("review_id")) {
            builder.appendQueryParameter("review_id", "0");
        }
        if (!uri.getQueryParameterNames().contains("video_id")) {
            builder.appendQueryParameter("video_id", "0");
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            if (!Intrinsics.d(str, "miniapp") || z11) {
                String queryParameter = uri.getQueryParameter(str);
                if (queryParameter != null) {
                    builder.appendQueryParameter(str, queryParameter);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "with(...)");
        return build;
    }

    static /* synthetic */ Uri addAdditionalParamsAndBuild$default(ReviewContentDeeplinkHandler reviewContentDeeplinkHandler, Uri.Builder builder, Uri uri, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return reviewContentDeeplinkHandler.addAdditionalParamsAndBuild(builder, uri, z11);
    }

    private final Uri createReviewContentDeeplink(Uri uri) {
        if (uri.getPathSegments().size() > 2 && uri.getQueryParameterNames().size() >= 2 && Intrinsics.d(uri.getAuthority(), "travel")) {
            Uri.Builder appendPath = new Uri.Builder().scheme("ozon").authority(uri.getAuthority()).appendPath("hotels").appendPath(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            String str = pathSegments.get(2);
            Uri.Builder appendPath2 = appendPath.appendPath(str != null ? str : "");
            Intrinsics.checkNotNullExpressionValue(appendPath2, "appendPath(...)");
            return addAdditionalParamsAndBuild(appendPath2, uri, true);
        }
        List<String> pathSegments2 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        if (!pathSegments2.isEmpty() && uri.getQueryParameterNames().size() >= 3 && uri.getQueryParameterNames().contains("miniapp") && Intrinsics.d(uri.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
            Uri.Builder authority = new Uri.Builder().scheme("ozon").authority(uri.getAuthority());
            List<String> pathSegments3 = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments3, "getPathSegments(...)");
            String str2 = pathSegments3.get(0);
            Uri.Builder appendPath3 = authority.appendPath(str2 != null ? str2 : "");
            Intrinsics.checkNotNullExpressionValue(appendPath3, "appendPath(...)");
            return addAdditionalParamsAndBuild(appendPath3, uri, true);
        }
        List<String> pathSegments4 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments4, "getPathSegments(...)");
        if (pathSegments4.isEmpty() || uri.getQueryParameterNames().size() < 2 || !Intrinsics.d(uri.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
            return uri;
        }
        Uri.Builder authority2 = new Uri.Builder().scheme("ozon").authority(uri.getAuthority());
        List<String> pathSegments5 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments5, "getPathSegments(...)");
        String str3 = pathSegments5.get(0);
        Uri.Builder appendPath4 = authority2.appendPath(str3 != null ? str3 : "");
        Intrinsics.checkNotNullExpressionValue(appendPath4, "appendPath(...)");
        return addAdditionalParamsAndBuild$default(this, appendPath4, uri, false, 2, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        ReviewContentParam reviewContentParam = ReviewContentParam.INSTANCE;
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return reviewContentParam.isReviewContentDeeplink(uri);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String uri = createReviewContentDeeplink(route.b()).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String str = null;
        h.c.a aVar = new h.c.a(uri, str, str, 14);
        Class[] elements = {VideoPreloadCleanerConfigurator.class, VideoMoleculeConfigurator.class, ReviewGalleryV2Configurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        int i11 = R$color.black;
        return new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, j02, null, Integer.valueOf(i11), null, false, new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, Integer.valueOf(context.getColor(R$color.black)), 1)), null, null, false, false, null, null, 14526396, null), uri, null, false, false, null, false, false, null, 508, null);
    }
}
