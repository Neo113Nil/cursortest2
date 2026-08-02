package ru.ozon.app.android.pdp.utils;

import android.net.Uri;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewContentParam;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.StringExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/utils/ProductDeeplinkChecker;", "", "<init>", "()V", "", "pathSegment", "", "isValidPathSegment", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "deeplink", "isProductDeeplink", "(Landroid/net/Uri;)Z", "Lkotlin/text/Regex;", "friendlyUrlPathSegmentRegex", "Lkotlin/text/Regex;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductDeeplinkChecker {

    @NotNull
    public static final ProductDeeplinkChecker INSTANCE = new ProductDeeplinkChecker();

    @NotNull
    private static final Regex friendlyUrlPathSegmentRegex = new Regex("^[a-z0-9-]+-[0-9]+$");
    public static final int $stable = 8;

    private ProductDeeplinkChecker() {
    }

    private final boolean isValidPathSegment(String pathSegment) {
        return StringExtKt.isDigital(pathSegment) || friendlyUrlPathSegmentRegex.f(pathSegment);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isProductDeeplink(@NotNull Uri deeplink) {
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        Object K11;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ReviewContentParam reviewContentParam = ReviewContentParam.INSTANCE;
        String uri = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (!reviewContentParam.isReviewContentDeeplink(uri)) {
            List<String> pathSegments = deeplink.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : pathSegments) {
                String str = (String) obj2;
                Intrinsics.f(str);
                if (!h.e0(str, "&", false)) {
                    arrayList.add(obj2);
                }
            }
            if (Intrinsics.d(deeplink.getAuthority(), "products") && !arrayList.isEmpty()) {
                String str2 = (String) C7714v.X(arrayList);
                Character ch2 = null;
                if (str2 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= str2.length()) {
                            break;
                        }
                        char charAt = str2.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            ch2 = Character.valueOf(charAt);
                            break;
                        }
                        i11++;
                    }
                }
                if (ch2 == null) {
                    z11 = true;
                    if (Intrinsics.d(deeplink.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME) && arrayList.size() == 1) {
                        K11 = C7714v.K(arrayList);
                        Intrinsics.checkNotNullExpressionValue(K11, "first(...)");
                        if (isValidPathSegment((String) K11)) {
                            z12 = true;
                            if (Intrinsics.d(deeplink.getAuthority(), "context") && arrayList.size() == 3 && Intrinsics.d(arrayList.get(0), ProductAction.ACTION_DETAIL) && Intrinsics.d(arrayList.get(1), "id")) {
                                obj = arrayList.get(2);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                if (isValidPathSegment((String) obj)) {
                                    z13 = true;
                                    if (!z11 || z12 || z13) {
                                        return true;
                                    }
                                }
                            }
                            z13 = false;
                            if (!z11) {
                            }
                            return true;
                        }
                    }
                    z12 = false;
                    if (Intrinsics.d(deeplink.getAuthority(), "context")) {
                        obj = arrayList.get(2);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        if (isValidPathSegment((String) obj)) {
                        }
                    }
                    z13 = false;
                    if (!z11) {
                    }
                    return true;
                }
            }
            z11 = false;
            if (Intrinsics.d(deeplink.getAuthority(), ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME)) {
                K11 = C7714v.K(arrayList);
                Intrinsics.checkNotNullExpressionValue(K11, "first(...)");
                if (isValidPathSegment((String) K11)) {
                }
            }
            z12 = false;
            if (Intrinsics.d(deeplink.getAuthority(), "context")) {
            }
            z13 = false;
            if (!z11) {
            }
            return true;
        }
        return false;
    }
}
