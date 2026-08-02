package ru.ozon.app.android.common.actionHandlers;

import B0.C2454a;
import android.net.Uri;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.flags.PageTypesWithSaveFiltersEnabled;
import ru.ozon.app.android.common.actionHandlers.flags.SaveFiltersEnabled;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018*\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "Landroid/net/Uri;", "uri", "Lru/ozon/app/android/common/actionHandlers/SearchPageInfo;", "createSearchPageInfo", "(Landroid/net/Uri;)Lru/ozon/app/android/common/actionHandlers/SearchPageInfo;", "", "input", "getPageType", "(Ljava/lang/String;)Ljava/lang/String;", "", "getQueryParameters", "(Landroid/net/Uri;)Ljava/util/Map;", "pageType", "", "isPageInListForSaving", "(Ljava/lang/String;)Z", "filter", "isFilterInListForSaving", "", "toSetByComma", "(Ljava/lang/String;)Ljava/util/Set;", ImagesContract.URL, "", "saveCurrentPage", "(Ljava/lang/String;)V", "modifySearchUrl", "Lru/ozon/app/android/network/abtool/FeatureService;", "prevPageInfo", "Lru/ozon/app/android/common/actionHandlers/SearchPageInfo;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifySearchUrlViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureService featureService;
    private SearchPageInfo prevPageInfo;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel$Companion;", "", "<init>", "()V", "QUERY_TEXT_KEY", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModifySearchUrlViewModel(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
    }

    private final SearchPageInfo createSearchPageInfo(Uri uri) {
        if (!uri.isHierarchical()) {
            uri = Uri.EMPTY;
        }
        Intrinsics.f(uri);
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        String pageType = getPageType(uri2);
        String queryParameter = uri.getQueryParameter("text");
        if (queryParameter == null) {
            queryParameter = "";
        }
        return new SearchPageInfo(uri, pageType, queryParameter, getQueryParameters(uri));
    }

    private final String getPageType(String input) {
        String G02 = h.G0(h.S(input, "ozon://"), '/');
        int I11 = h.I('/', 0, 6, G02);
        if (I11 == -1) {
            return G02;
        }
        String substring = G02.substring(0, I11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private final Map<String, String> getQueryParameters(Uri uri) {
        String queryParameter;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            Intrinsics.f(str);
            if (isFilterInListForSaving(str) && (queryParameter = uri.getQueryParameter(str)) != null) {
                linkedHashMap.put(str, queryParameter);
            }
        }
        return linkedHashMap;
    }

    private final boolean isFilterInListForSaving(String filter) {
        return toSetByComma(this.featureService.getStringKey(SaveFiltersEnabled.INSTANCE)).contains(filter);
    }

    private final boolean isPageInListForSaving(String pageType) {
        return toSetByComma(this.featureService.getStringKey(PageTypesWithSaveFiltersEnabled.INSTANCE)).contains(pageType);
    }

    private final Set<String> toSetByComma(String str) {
        List l11 = h.l(str, new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
        Iterator it = l11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        return C7714v.Y0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.net.Uri] */
    @NotNull
    public final String modifySearchUrl(@NotNull String url) {
        SearchPageInfo searchPageInfo;
        Map<String, String> queryParameters;
        Intrinsics.checkNotNullParameter(url, "url");
        M m11 = new M();
        ?? parse = Uri.parse(url);
        m11.f71787a = parse;
        SearchPageInfo createSearchPageInfo = createSearchPageInfo(parse);
        String text = createSearchPageInfo.getText();
        SearchPageInfo searchPageInfo2 = this.prevPageInfo;
        String text2 = searchPageInfo2 != null ? searchPageInfo2.getText() : null;
        if (text2 == null) {
            text2 = "";
        }
        boolean e02 = h.e0(text, text2, true);
        if (isPageInListForSaving(createSearchPageInfo.getPageType()) && e02 && (searchPageInfo = this.prevPageInfo) != null && (queryParameters = searchPageInfo.getQueryParameters()) != null) {
            final ModifySearchUrlViewModel$modifySearchUrl$1 modifySearchUrlViewModel$modifySearchUrl$1 = new ModifySearchUrlViewModel$modifySearchUrl$1(m11);
            queryParameters.forEach(new BiConsumer() { // from class: zq.a
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Function2.this.invoke(obj, obj2);
                }
            });
        }
        String uri = ((Uri) m11.f71787a).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    public final void saveCurrentPage(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.prevPageInfo = createSearchPageInfo(Uri.parse(url));
    }
}
