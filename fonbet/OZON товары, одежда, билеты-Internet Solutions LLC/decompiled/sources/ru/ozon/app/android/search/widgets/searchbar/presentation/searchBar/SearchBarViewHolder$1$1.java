package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import Sc.s;
import WZ.t;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.K;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticNavBarModel;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchBarViewHolder$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SearchBarViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$1$1$2", f = "SearchBarViewHolder.kt", l = {179}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$1$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Comparable<?> $deeplink;
        final /* synthetic */ SearchBarVO $item;
        int label;
        final /* synthetic */ SearchBarViewHolder this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$1$1$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends C7719a implements Function0<Unit> {
            AnonymousClass1(Object obj) {
                super(0, obj, InterfaceC7851b.class, "showLoader", "showLoader(Lru/ozon/composer/state/Loader$Type;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((InterfaceC7851b) this.receiver).e(new l.a.C1079a(0L, null, 3));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$1$1$2$2, reason: invalid class name and collision with other inner class name */
        static final class C18632 extends AbstractC7737t implements Function1<String, Unit> {
            final /* synthetic */ Comparable<?> $deeplink;
            final /* synthetic */ Map<String, Object> $deeplinkProperties;
            final /* synthetic */ SearchBarViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18632(SearchBarViewHolder searchBarViewHolder, Comparable<?> comparable, Map<String, ? extends Object> map) {
                super(1);
                this.this$0 = searchBarViewHolder;
                this.$deeplink = comparable;
                this.$deeplinkProperties = map;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                ComposerReferences composerReferences;
                ComposerReferences composerReferences2;
                Intrinsics.checkNotNullParameter(it, "it");
                composerReferences = this.this$0.references;
                composerReferences.getController().hideLoader();
                composerReferences2 = this.this$0.references;
                composerReferences2.getNavigator().openDeeplink(this.$deeplink.toString(), this.$deeplinkProperties);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SearchBarViewHolder searchBarViewHolder, SearchBarVO searchBarVO, Comparable<?> comparable, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = searchBarViewHolder;
            this.$item = searchBarVO;
            this.$deeplink = comparable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$item, this.$deeplink, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            NavBarModelProvider.NavBarModel navBarModel;
            StaticNavBarModel formatNavBarModel;
            SearchUrlPrefetchService searchUrlPrefetchService;
            ComposerReferences composerReferences;
            ComposerReferences composerReferences2;
            ComposerReferences composerReferences3;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                function1 = this.this$0.navbarModelListener;
                if (function1 == null) {
                    navBarModel = null;
                    formatNavBarModel = this.this$0.formatNavBarModel(this.$item, navBarModel);
                    Map<String, ? extends Object> i12 = U.i(new Pair("navBarModel", formatNavBarModel));
                    if (navBarModel == null) {
                        composerReferences3 = this.this$0.references;
                        composerReferences3.getNavigator().openDeeplink(this.$deeplink.toString(), i12);
                    } else {
                        searchUrlPrefetchService = this.this$0.searchUrlPrefetchService;
                        String deeplink = this.$item.getDeeplink();
                        composerReferences = this.this$0.references;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(composerReferences.getController());
                        composerReferences2 = this.this$0.references;
                        searchUrlPrefetchService.navigateWhenRequestPrefetched(deeplink, composerReferences2.getContainer().g(), new C18632(this.this$0, this.$deeplink, i12), anonymousClass1);
                    }
                    return Unit.f71690a;
                }
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            navBarModel = (NavBarModelProvider.NavBarModel) obj;
            formatNavBarModel = this.this$0.formatNavBarModel(this.$item, navBarModel);
            Map<String, ? extends Object> i122 = U.i(new Pair("navBarModel", formatNavBarModel));
            if (navBarModel == null) {
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewHolder$1$1(SearchBarViewHolder searchBarViewHolder) {
        super(0);
        this.this$0 = searchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l20.d dVar;
        Comparable uri;
        T00.a b11;
        B0 b02;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        SearchBarVO boundData = this.this$0.getBoundData();
        if (boundData == null) {
            return;
        }
        Uri parse = Uri.parse(boundData.getDeeplink());
        if (Intrinsics.d(parse.getAuthority(), "dialogSearch") || parse.getPathSegments().contains("dialogSearch")) {
            dVar = this.this$0.info;
            uri = parse.buildUpon().appendQueryParameter("CURRENT_PAGE", (dVar == null || (b11 = dVar.b()) == null) ? null : b11.c()).build().toString();
            Intrinsics.f(uri);
        } else {
            uri = LinkGenerator.INSTANCE.searchSuggestions(boundData.getSearchText(), boundData.getDeeplink(), boundData.getLink(), boundData.getHint());
        }
        t searchBarTokenizedEvent = boundData.getSearchBarTokenizedEvent();
        if (searchBarTokenizedEvent != null) {
            composerReferences2 = this.this$0.references;
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences2.getTokenizedAnalytics(), searchBarTokenizedEvent, null, 2, null);
        }
        b02 = this.this$0.openSuggestsScreenJob;
        if (b02 == null || !b02.isActive()) {
            SearchBarViewHolder searchBarViewHolder = this.this$0;
            composerReferences = searchBarViewHolder.references;
            searchBarViewHolder.openSuggestsScreenJob = C10727i.c(K.a(composerReferences.getContainer().g()), null, null, new AnonymousClass2(this.this$0, boundData, uri, null), 3);
        }
    }
}
