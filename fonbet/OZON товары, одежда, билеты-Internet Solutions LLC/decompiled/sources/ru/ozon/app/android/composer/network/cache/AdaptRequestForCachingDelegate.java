package ru.ozon.app.android.composer.network.cache;

import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.util.AdaptedPageUrl;
import ru.ozon.app.android.composer.network.cache.util.AdaptedUrl;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\f\b\u0017\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\fR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001a¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/network/cache/AdaptRequestForCachingDelegate;", "", "<init>", "()V", "", "", "containsIgnoreQueryParams", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl", "Lru/ozon/app/android/composer/network/cache/util/AdaptedPageUrl;", "invoke-wvZU0FE", "(Ljava/lang/String;)Ljava/lang/String;", "invoke", "Lru/ozon/app/android/composer/network/cache/util/Url;", ImagesContract.URL, "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "invoke-j-pqkY4", "LWe/A;", "adaptHttpUrlForCaching", "(LWe/A;)LWe/A;", "adaptPageUrlForCaching", "", "urlIgnoreQueryParams", "Ljava/util/Set;", "getUrlIgnoreQueryParams", "()Ljava/util/Set;", "pageUrlIgnoreQueryParams", "getPageUrlIgnoreQueryParams", "allIgnoreQueryParams$delegate", "LSc/j;", "getAllIgnoreQueryParams", "allIgnoreQueryParams", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AdaptRequestForCachingDelegate {

    /* renamed from: allIgnoreQueryParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j allIgnoreQueryParams;

    @NotNull
    private final Set<String> pageUrlIgnoreQueryParams;

    @NotNull
    private final Set<String> urlIgnoreQueryParams;

    @NotNull
    protected static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0004*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/composer/network/cache/AdaptRequestForCachingDelegate$Companion;", "", "<init>", "()V", "LWe/A;", "", "", "removeParamNames", "withoutParams", "(LWe/A;Ljava/util/Set;)LWe/A;", "DEEPLINK_HTTP_URL_PREFIX", "Ljava/lang/String;", "PAGE_CHANGED_URL_IGNORE_QUERY_PARAM", "ANCHOR_PAGE_URL_IGNORE_QUERY_PARAM", "DEEPLINK_QUERY_PARAM", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final A withoutParams(@NotNull A a11, @NotNull Set<String> removeParamNames) {
            Intrinsics.checkNotNullParameter(a11, "<this>");
            Intrinsics.checkNotNullParameter(removeParamNames, "removeParamNames");
            Set<String> q11 = a11.q();
            Set<String> set = removeParamNames;
            Set d11 = e0.d(q11, set);
            if (q11.size() == 1 && q11.size() == d11.size()) {
                return a11;
            }
            List<String> H02 = C7714v.H0(d11);
            A.a j11 = a11.j();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                j11.q((String) it.next());
            }
            for (String str : H02) {
                j11.y(str, a11.p(str));
            }
            return j11.e();
        }

        private Companion() {
        }
    }

    public AdaptRequestForCachingDelegate() {
        String[] elements = {"page_changed", "__rr"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.urlIgnoreQueryParams = C7705l.j0(elements);
        this.pageUrlIgnoreQueryParams = e0.h("anchor");
        this.allIgnoreQueryParams = k.b(new AdaptRequestForCachingDelegate$allIgnoreQueryParams$2(this));
    }

    private final boolean containsIgnoreQueryParams(String str) {
        Set<String> allIgnoreQueryParams = getAllIgnoreQueryParams();
        if ((allIgnoreQueryParams instanceof Collection) && allIgnoreQueryParams.isEmpty()) {
            return false;
        }
        Iterator<T> it = allIgnoreQueryParams.iterator();
        while (it.hasNext()) {
            if (h.t(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    private final Set<String> getAllIgnoreQueryParams() {
        return (Set) this.allIgnoreQueryParams.getValue();
    }

    @NotNull
    protected A adaptHttpUrlForCaching(@NotNull A url) {
        Intrinsics.checkNotNullParameter(url, "url");
        A withoutParams = Companion.withoutParams(url, getUrlIgnoreQueryParams());
        String p11 = withoutParams.p(ImagesContract.URL);
        if (p11 == null) {
            return withoutParams;
        }
        String adaptPageUrlForCaching = adaptPageUrlForCaching(p11);
        A.a j11 = withoutParams.j();
        j11.y(ImagesContract.URL, adaptPageUrlForCaching);
        return j11.e();
    }

    @NotNull
    protected String adaptPageUrlForCaching(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Companion companion = Companion;
        A.f33515l.getClass();
        String substring = companion.withoutParams(A.b.c("http://ozon.ru" + pageUrl), getPageUrlIgnoreQueryParams()).toString().substring(14);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    protected Set<String> getPageUrlIgnoreQueryParams() {
        return this.pageUrlIgnoreQueryParams;
    }

    @NotNull
    protected Set<String> getUrlIgnoreQueryParams() {
        return this.urlIgnoreQueryParams;
    }

    @NotNull
    /* renamed from: invoke-j-pqkY4, reason: not valid java name */
    public String m619invokejpqkY4(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!containsIgnoreQueryParams(url)) {
            return AdaptedUrl.m651constructorimpl(url);
        }
        A.f33515l.getClass();
        return AdaptedUrl.m650constructorimpl(adaptHttpUrlForCaching(A.b.c(url)));
    }

    @NotNull
    /* renamed from: invoke-wvZU0FE, reason: not valid java name */
    public String m620invokewvZU0FE(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        return AdaptedPageUrl.m644constructorimpl(adaptPageUrlForCaching(pageUrl));
    }
}
