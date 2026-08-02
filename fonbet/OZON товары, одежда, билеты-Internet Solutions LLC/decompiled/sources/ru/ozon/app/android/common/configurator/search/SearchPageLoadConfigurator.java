package ru.ozon.app.android.common.configurator.search;

import A00.a;
import He.b;
import L00.j;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.t0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.request.RegisterSearchEventRequestParams;
import ru.ozon.app.android.common.request.SearchCacheTrackerApi;
import ru.ozon.app.android.common.request.ServerTimingsParsersKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.tracker.performance.ServerTimingsParser;
import xe.C10720e0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/configurator/search/SearchPageLoadConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/common/request/SearchCacheTrackerApi;", "api", "<init>", "(Lru/ozon/app/android/common/request/SearchCacheTrackerApi;)V", "LL00/j;", "response", "", "onSearchPageLoaded", "(LL00/j;)V", "", "isSearchPage", "(LL00/j;)Z", "Landroidx/lifecycle/P;", "LA00/a;", "LA00/a$o;", "firstLoadCompleted", "(Landroidx/lifecycle/P;)Landroidx/lifecycle/P;", "onComposerInitialized", "()V", "Lru/ozon/app/android/common/request/SearchCacheTrackerApi;", "Lxe/J;", "exceptionHandler$delegate", "LSc/j;", "getExceptionHandler", "()Lxe/J;", "exceptionHandler", "Companion", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchPageLoadConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<String> searchPageTypes;

    @NotNull
    private static final ServerTimingsParser serverTimingsParser;

    @NotNull
    private final SearchCacheTrackerApi api;

    /* renamed from: exceptionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j exceptionHandler;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/common/configurator/search/SearchPageLoadConfigurator$Companion;", "", "<init>", "()V", "", "PAGE_TYPE_HEADER_NAME", "Ljava/lang/String;", "Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingsParser", "Lru/ozon/tracker/performance/ServerTimingsParser;", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        String[] elements = {"category", "category/brand", "category/landing", "category/tag", "search", "highlight", "classified_category", "classified_highlight", "classified_search", "person", "seria", "publisher", "brand"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        searchPageTypes = C7705l.j0(elements);
        serverTimingsParser = new ServerTimingsParser();
    }

    public SearchPageLoadConfigurator(@NotNull SearchCacheTrackerApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.exceptionHandler = k.b(SearchPageLoadConfigurator$exceptionHandler$2.INSTANCE);
    }

    private final P<a.o<?>> firstLoadCompleted(P<a> p11) {
        T t2 = new T();
        t2.a(p11, new SearchPageLoadConfigurator$inlined$sam$i$androidx_lifecycle_Observer$0(new SearchPageLoadConfigurator$firstLoadCompleted$$inlined$filterIsInstance$1(t2)));
        return t0.c(t2, new SearchPageLoadConfigurator$firstLoadCompleted$1(p11));
    }

    private final J getExceptionHandler() {
        return (J) this.exceptionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSearchPage(j response) {
        String str = response.c().get("X-O3-Page-Type");
        if (str == null) {
            return false;
        }
        return searchPageTypes.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSearchPageLoaded(j response) {
        String requestId = ServerTimingsParsersKt.getRequestId(serverTimingsParser, response);
        if (requestId == null || requestId.length() == 0) {
            return;
        }
        RegisterSearchEventRequestParams registerSearchEventRequestParams = new RegisterSearchEventRequestParams(requestId, response.f() == null);
        D a11 = K.a(getOwner());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b.plus(getExceptionHandler()), null, new SearchPageLoadConfigurator$onSearchPageLoaded$1(this, registerSearchEventRequestParams, null), 2);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        T b11 = t0.b(firstLoadCompleted(references.getController().getEvents()), SearchPageLoadConfigurator$onComposerInitialized$1.INSTANCE);
        T t2 = new T();
        t2.a(b11, new SearchPageLoadConfigurator$inlined$sam$i$androidx_lifecycle_Observer$0(new SearchPageLoadConfigurator$onComposerInitialized$$inlined$filter$1(t2, this)));
        t2.observe(getOwner(), new SearchPageLoadConfigurator$sam$androidx_lifecycle_Observer$0(new SearchPageLoadConfigurator$onComposerInitialized$3(this)));
    }
}
