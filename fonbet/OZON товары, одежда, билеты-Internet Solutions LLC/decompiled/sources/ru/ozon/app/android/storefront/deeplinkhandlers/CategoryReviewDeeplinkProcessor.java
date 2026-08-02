package ru.ozon.app.android.storefront.deeplinkhandlers;

import GZ.j;
import android.net.Uri;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/CategoryReviewDeeplinkProcessor;", "", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "modifyRoute", "(LGZ/j;)LGZ/j;", "", "Lkotlin/text/Regex;", "reviewRegex", "Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CategoryReviewDeeplinkProcessor {

    @NotNull
    public static final CategoryReviewDeeplinkProcessor INSTANCE = new CategoryReviewDeeplinkProcessor();

    @NotNull
    private static final List<Regex> reviewRegex = C7714v.b0(new Regex("([\\w-]+)-(\\d+)"), new Regex("(\\d+)"));
    public static final int $stable = 8;

    private CategoryReviewDeeplinkProcessor() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean canHandle(@NotNull j route) {
        boolean z11;
        int lastIndexOf;
        Intrinsics.checkNotNullParameter(route, "route");
        if (!Intrinsics.d(route.d().getScheme(), "https")) {
            return false;
        }
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "category")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.d(C7714v.Z(pathSegments), "review")) {
                z11 = true;
                lastIndexOf = b11.getPathSegments().lastIndexOf("review");
                if (lastIndexOf != -1) {
                    return false;
                }
                List<String> subList = b11.getPathSegments().subList(0, lastIndexOf);
                if (subList.size() > 2) {
                    return false;
                }
                List<String> list = subList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    loop0: for (String str : list) {
                        List<Regex> list2 = reviewRegex;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (Regex regex : list2) {
                                Intrinsics.f(str);
                                if (regex.f(str)) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                }
                return z11;
            }
        }
        z11 = false;
        lastIndexOf = b11.getPathSegments().lastIndexOf("review");
        if (lastIndexOf != -1) {
        }
    }

    @NotNull
    public final j modifyRoute(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (!canHandle(route)) {
            return route;
        }
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = route.d().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return j.a(route, LinkGenerator.webView$default(linkGenerator, uri, null, false, false, 14, null));
    }
}
