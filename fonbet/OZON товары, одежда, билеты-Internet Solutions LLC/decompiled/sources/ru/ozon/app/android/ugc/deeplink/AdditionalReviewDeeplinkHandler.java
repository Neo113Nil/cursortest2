package ru.ozon.app.android.ugc.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import Kk.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.flags.ReviewFormTransitionFixEnabled;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/AdditionalReviewDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "getToolbarConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$ToolbarConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "isSelect", "Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalReviewDeeplinkHandler implements a {

    @NotNull
    private final FeatureChecker featureChecker;
    private final boolean isSelect;

    public AdditionalReviewDeeplinkHandler(@NotNull AppType appType, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.isSelect = appType == AppType.SELECT;
    }

    private final ComposerScreenConfig.ToolbarConfig getToolbarConfig() {
        if (this.isSelect) {
            return new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, Integer.valueOf(R$color.bg_dark_key), null, 45, null), 0, 2, null);
        }
        return null;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return (Intrinsics.d(b11.getAuthority(), "products") || Intrinsics.d(b11.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) || Intrinsics.d(b11.getAuthority(), "context") || Intrinsics.d(b11.getAuthority(), "travel")) && b11.getPathSegments().contains("additionalReview");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14), getToolbarConfig(), false, null, false, false, false, false, null, false, false, true, null, null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, 0, 1)), null, null, false, false, null, null, 16611228, null), J.a(context, "context", route, "route", "toString(...)"), 9001, false, !this.featureChecker.isEnabled(ReviewFormTransitionFixEnabled.INSTANCE), null, false, false, null, 488, null);
    }
}
