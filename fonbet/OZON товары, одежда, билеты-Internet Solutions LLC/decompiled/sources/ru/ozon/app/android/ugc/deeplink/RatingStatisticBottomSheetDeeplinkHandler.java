package ru.ozon.app.android.ugc.deeplink;

import GZ.j;
import HY.b;
import IZ.a;
import J.d;
import Kk.c;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import uZ.C9992d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/RatingStatisticBottomSheetDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "minHeightBottomSheet", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingStatisticBottomSheetDeeplinkHandler implements a {
    private final int minHeightBottomSheet = ResourceExtKt.toPx(70);

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && D40.d.a(route) >= 3 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "rating") && Co.a.e(route, 2, "statistic");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new BottomSheetComposerFragmentDestination(c.c(route, "toString(...)"), new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, this.minHeightBottomSheet, false, false, false, false, false, false, 2030, null), false, false, false, false, null, false, false, false, null, null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16744438, null), C9992d.b.c.f100438a, null, null, null, 56, null);
    }
}
