package ru.ozon.app.android.cml.delivery.widgets.searchBar.di;

import Bw.C2676a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.data.SearchBarMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/di/SearchBarComponent;", "Lhi/a;", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarMapper;", "getMapper", "()Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SearchBarComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/di/SearchBarComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/di/SearchBarComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchBarComponent create$lambda$0(C7475g c7475g) {
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            return new SearchBarComponent() { // from class: ru.ozon.app.android.cml.delivery.widgets.searchBar.di.SearchBarComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(SearchBarComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.cml.delivery.widgets.searchBar.di.SearchBarComponent
                public SearchBarMapper getMapper() {
                    return (SearchBarMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.searchBar.di.SearchBarComponent
                public l getTokenizedAnalytics() {
                    return RetainComposerComponentApi.this.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SearchBarComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SearchBarComponent.class), new C2676a(storage, 9));
        }
    }

    @NotNull
    SearchBarMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
