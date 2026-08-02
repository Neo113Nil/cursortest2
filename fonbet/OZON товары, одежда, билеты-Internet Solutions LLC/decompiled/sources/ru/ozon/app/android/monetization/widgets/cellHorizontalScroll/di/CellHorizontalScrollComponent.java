package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di;

import Ug.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LUg/a;", "getActionHandlerComponentApi", "()LUg/a;", "actionHandlerComponentApi", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CellHorizontalScrollComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/di/CellHorizontalScrollComponent;", "create", "(Lk20/g;)Lk20/e;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CellHorizontalScrollComponent create$lambda$0(final C7475g c7475g) {
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            final NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
            return new CellHorizontalScrollComponent() { // from class: ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent$Companion$create$1$1
                @Override // ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent
                public a getActionHandlerComponentApi() {
                    return (a) c7475g.getComponent(a.class);
                }

                @Override // ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent
                public FeatureChecker getFeatureChecker() {
                    return networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent
                public l getTokenizedAnalytics() {
                    return RetainComposerComponentApi.this.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<CellHorizontalScrollComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CellHorizontalScrollComponent.class), new DA.a(storage, 0));
        }
    }

    @NotNull
    a getActionHandlerComponentApi();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    l getTokenizedAnalytics();
}
