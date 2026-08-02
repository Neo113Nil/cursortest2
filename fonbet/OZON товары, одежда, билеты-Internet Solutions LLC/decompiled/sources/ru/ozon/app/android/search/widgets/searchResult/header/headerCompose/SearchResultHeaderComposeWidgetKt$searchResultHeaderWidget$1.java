package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose;

import A00.a;
import S0.InterfaceC3967k;
import T00.a;
import Vg.e;
import W10.c;
import a1.C4912a;
import android.net.Uri;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteEntityUpdateKey;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.flags.SearchResultsHeaderComposeEnabled;
import ru.ozon.app.android.search.widgets.searchResult.header.core.SearchResultHeaderConfig;
import ru.ozon.app.android.search.widgets.searchResult.header.data.SearchResultHeaderDTO;
import ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.SearchResultHeaderVI;
import ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation.SearchResultHeaderWidgetKt;
import ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation.SearchResultHeaderViewMapper;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1 extends AbstractC7737t implements Function1<C6018d<SearchResultHeaderDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<SearchResultHeaderDTO, SearchResultHeaderVI>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ SearchResultHeaderComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchResultHeaderComponent searchResultHeaderComponent) {
                super(1);
                this.$component = searchResultHeaderComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof SearchResultHeaderDTO) && this.$component.getFeatureChecker().isEnabled(SearchResultsHeaderComposeEnabled.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "invoke", "(Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<SearchResultHeaderDTO, d, List<? extends SearchResultHeaderVI>> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List<SearchResultHeaderVI> invoke(SearchResultHeaderDTO state, d info) {
                Uri uri;
                SearchResultHeaderDTO.BreadCrumb breadCrumb;
                String deeplink;
                SearchResultHeaderDTO.BreadCrumb breadCrumb2;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                List<SearchResultHeaderDTO.BreadCrumb> breadCrumbs = state.getBreadCrumbs();
                String text = (breadCrumbs == null || (breadCrumb2 = (SearchResultHeaderDTO.BreadCrumb) C7714v.M(breadCrumbs)) == null) ? null : breadCrumb2.getText();
                List<SearchResultHeaderDTO.BreadCrumb> breadCrumbs2 = state.getBreadCrumbs();
                if (breadCrumbs2 != null && (breadCrumb = (SearchResultHeaderDTO.BreadCrumb) C7714v.M(breadCrumbs2)) != null && (deeplink = breadCrumb.getDeeplink()) != null) {
                    if (h.K(deeplink)) {
                        deeplink = null;
                    }
                    if (deeplink != null) {
                        uri = Uri.parse(deeplink);
                        String header = state.getHeader();
                        String totalFound = state.getTotalFound();
                        String searchOriginalText = state.getSearchOriginalText();
                        String deeplink2 = state.getDeeplink();
                        SearchResultHeaderDTO.ShareData shareData = state.getShareData();
                        String text2 = shareData == null ? shareData.getText() : null;
                        SearchResultHeaderDTO.ShareData shareData2 = state.getShareData();
                        String link = shareData2 == null ? shareData2.getLink() : null;
                        FavoriteEntity favoriteEntityButton = state.getFavoriteEntityButton();
                        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                        return C7714v.a0(new SearchResultHeaderVI(hashCode, text, uri, header, totalFound, searchOriginalText, deeplink2, favoriteEntityButton, text2, link, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
                    }
                }
                uri = null;
                String header2 = state.getHeader();
                String totalFound2 = state.getTotalFound();
                String searchOriginalText2 = state.getSearchOriginalText();
                String deeplink22 = state.getDeeplink();
                SearchResultHeaderDTO.ShareData shareData3 = state.getShareData();
                if (shareData3 == null) {
                }
                SearchResultHeaderDTO.ShareData shareData22 = state.getShareData();
                if (shareData22 == null) {
                }
                FavoriteEntity favoriteEntityButton2 = state.getFavoriteEntityButton();
                Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
                return C7714v.a0(new SearchResultHeaderVI(hashCode, text, uri, header2, totalFound2, searchOriginalText2, deeplink22, favoriteEntityButton2, text2, link, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4$4, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18624 extends AbstractC7737t implements Function1<k<SearchResultHeaderVI>, Unit> {
            final /* synthetic */ SearchResultHeaderComponent $component;
            final /* synthetic */ j<SearchResultHeaderDTO, SearchResultHeaderVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/search/widgets/searchResult/header/headerCompose/presentation/SearchResultHeaderVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<SearchResultHeaderVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ SearchResultHeaderComponent $component;
                final /* synthetic */ j<SearchResultHeaderDTO, SearchResultHeaderVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<SearchResultHeaderDTO, SearchResultHeaderVI> jVar, SearchResultHeaderComponent searchResultHeaderComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = searchResultHeaderComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<SearchResultHeaderVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<SearchResultHeaderVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i12 = (interfaceC3967k.n(content) ? 4 : 2) | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    e.a widgetActionHandlerBuilder = WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12 & 14, 14);
                    String d11 = content.getInfo().d();
                    String j11 = content.getInfo().c().j();
                    a b11 = content.getViewItem().c().b();
                    c cVar = new c(d11, j11, b11 != null ? b11.g() : null);
                    SearchResultHeaderVI b12 = content.b();
                    B0 a11 = ((a00.h) interfaceC3967k.m(f.f())).a();
                    final SearchResultHeaderComponent searchResultHeaderComponent = this.$component;
                    w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4$4$1$invoke$$inlined$createViewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            MinifyLinkViewModel minifyLinkViewModel = SearchResultHeaderComponent.this.getViewModelProvider().get();
                            Intrinsics.g(minifyLinkViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return minifyLinkViewModel;
                        }
                    }).a(MinifyLinkViewModel.class);
                    Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
                    SearchResultHeaderWidgetKt.m979SearchResultHeaderWidgetSI6GP0Y(b12, (MinifyLinkViewModel) a12, this.$component.getRouter(), this.$component.getFavoriteEntityInteractor(), this.$component.getFavoriteEntityComposeDelegateFactory(), widgetActionHandlerBuilder, cVar, interfaceC3967k, 262144);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18624(j<SearchResultHeaderDTO, SearchResultHeaderVI> jVar, SearchResultHeaderComponent searchResultHeaderComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = searchResultHeaderComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<SearchResultHeaderVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<SearchResultHeaderVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -959769687, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<SearchResultHeaderDTO, SearchResultHeaderVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<SearchResultHeaderDTO, SearchResultHeaderVI> jVar) {
            SearchResultHeaderComponent searchResultHeaderComponent = (SearchResultHeaderComponent) Ek.a.c(jVar, "$this$viewMapper", SearchResultHeaderComponent.class);
            jVar.i(new AnonymousClass1(searchResultHeaderComponent), AnonymousClass2.INSTANCE);
            jVar.c().put(FavoriteEntityUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$4$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    SearchResultHeaderVI searchResultHeaderVI = (SearchResultHeaderVI) old;
                    return SearchResultHeaderVI.copy$default(searchResultHeaderVI, 0L, null, null, null, null, null, null, FavoriteEntityKt.compareAndGetModel(searchResultHeaderVI.getFavoriteEntityButton(), ((FavoriteEntityUpdateKey) update).getNewFavoriteEntity()), null, null, null, 1919, null);
                }
            });
            jVar.G(new C18624(jVar, searchResultHeaderComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<SearchResultHeaderDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<SearchResultHeaderDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SearchResultHeaderConfig(JsonParser.this);
            }
        });
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SearchResultHeaderComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.SearchResultHeaderComposeWidgetKt$searchResultHeaderWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends l20.c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new SearchResultHeaderViewMapper((SearchResultHeaderComponent) it.getComponent(SearchResultHeaderComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
