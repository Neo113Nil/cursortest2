package ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di;

import DR.a;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.data.SearchBarDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarVO;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/di/SearchBarComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/data/SearchBarDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarVO;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SearchBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/di/SearchBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/di/SearchBarComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchBarComponent create$lambda$0(final C7475g c7475g) {
            return new SearchBarComponent() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(SearchBarComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarComponent
                public Function2<SearchBarDTO, d, List<SearchBarVO>> getMapper() {
                    return (Function2) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarComponent
                public g getOzonRouter() {
                    return ((NavigationComponentApi) C7475g.this.getComponent(NavigationComponentApi.class)).getOzonRouter();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SearchBarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SearchBarComponent.class), new a(storage, 7));
        }
    }

    @NotNull
    Function2<SearchBarDTO, d, List<SearchBarVO>> getMapper();

    @NotNull
    g getOzonRouter();

    @NotNull
    l getTokenizedAnalytics();
}
