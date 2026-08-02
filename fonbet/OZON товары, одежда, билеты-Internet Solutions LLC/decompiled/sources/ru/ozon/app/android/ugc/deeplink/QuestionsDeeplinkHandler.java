package ru.ozon.app.android.ugc.deeplink;

import B0.C2454a;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsConfigurator;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$color;
import uZ.C9992d;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/QuestionsDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "processDeeplink", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "bottomSheetConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Ljava/lang/String;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QuestionsDeeplinkHandler implements a {
    private final ComposerScreenConfig getScreenConfig(String deeplink, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        return new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), null, false, bottomSheetConfig, false, false, false, false, null, false, false, false, e0.h(QuestionsConfigurator.class), null, Integer.valueOf(R$color.layer_floor_0), null, false, null, null, null, false, false, null, null, 16756726, null);
    }

    static /* synthetic */ ComposerScreenConfig getScreenConfig$default(QuestionsDeeplinkHandler questionsDeeplinkHandler, String str, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bottomSheetConfig = null;
        }
        return questionsDeeplinkHandler.getScreenConfig(str, bottomSheetConfig);
    }

    private final Uri processDeeplink(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2) {
            return uri;
        }
        String str = pathSegments.get(0);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        if (!StringExtKt.isDigital(str) || !Intrinsics.d(pathSegments.get(1), "questions") || uri.getQueryParameter("qid") == null) {
            return uri;
        }
        String str2 = pathSegments.get(0);
        String queryParameter = uri.getQueryParameter("qid");
        if (queryParameter == null) {
            return uri;
        }
        Uri build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath(str2).appendPath("question").appendPath(queryParameter).build();
        Intrinsics.f(build);
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (ru.ozon.app.android.utils.StringExtKt.isDigital(r2) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[ADDED_TO_REGION] */
    @Override // IZ.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canHandle(@NotNull j route) {
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() >= 3) {
                String str = b11.getPathSegments().get(0);
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                if (StringExtKt.isDigital(str) && C2454a.h(b11, "question", 1) && !b11.getPathSegments().contains("new")) {
                    z11 = true;
                    if (!Intrinsics.d(b11.getAuthority(), "questions")) {
                        if (Intrinsics.d(b11.getAuthority(), "question")) {
                            List<String> pathSegments2 = b11.getPathSegments();
                            Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
                            if (pathSegments2.size() == 1) {
                                String str2 = b11.getPathSegments().get(0);
                                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                            }
                        }
                        z12 = false;
                        if (Intrinsics.d(b11.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
                            List<String> pathSegments3 = b11.getPathSegments();
                            Intrinsics.checkNotNullExpressionValue(pathSegments3, "getPathSegments(...)");
                            if (pathSegments3.size() == 2) {
                                String str3 = b11.getPathSegments().get(0);
                                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                                if (StringExtKt.isDigital(str3) && C2454a.h(b11, "questions", 1)) {
                                    z13 = true;
                                    return !z12 || z13 || z11;
                                }
                            }
                        }
                        z13 = false;
                        if (z12) {
                        }
                    }
                    z12 = true;
                    if (Intrinsics.d(b11.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
                    }
                    z13 = false;
                    if (z12) {
                    }
                }
            }
        }
        z11 = false;
        if (!Intrinsics.d(b11.getAuthority(), "questions")) {
        }
        z12 = true;
        if (Intrinsics.d(b11.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
        }
        z13 = false;
        if (z12) {
        }
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String uri = processDeeplink(route.b()).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        int i11 = 9820;
        if (MiniAppExtKt.isExpress(route.b())) {
            return new BottomSheetComposerFragmentDestination(uri, getScreenConfig(uri, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, true, false, false, false, 1918, null)), C9992d.b.c.f100438a, null, i11, null, 40, null);
        }
        return new ComposerFragmentDestination(getScreenConfig$default(this, uri, null, 2, null), uri, i11, false, false, null, false, false, null, 504, null);
    }
}
