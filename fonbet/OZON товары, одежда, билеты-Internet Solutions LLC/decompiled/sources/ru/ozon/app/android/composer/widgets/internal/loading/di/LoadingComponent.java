package ru.ozon.app.android.composer.widgets.internal.loading.di;

import HT.a;
import Ih.b;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerPagePerformanceComponentApi;
import ru.ozon.app.android.composer.widgets.internal.loading.LoadingMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/loading/di/LoadingComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/widgets/internal/loading/LoadingMapper;", "getMapper", "()Lru/ozon/app/android/composer/widgets/internal/loading/LoadingMapper;", "mapper", "LIh/b;", "getPagePerformanceTracker", "()LIh/b;", "pagePerformanceTracker", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LoadingComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/loading/di/LoadingComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/internal/loading/di/LoadingComponent;", "invoke", "(Lk20/g;)Lk20/e;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LoadingComponent invoke$lambda$0(final C7475g c7475g) {
            return new LoadingComponent(c7475g) { // from class: ru.ozon.app.android.composer.widgets.internal.loading.di.LoadingComponent$Companion$invoke$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(LoadingComponent$Companion$invoke$1$1$mapper$2.INSTANCE);
                private final RetainComposerPagePerformanceComponentApi retainComponentApi;

                {
                    this.retainComponentApi = (RetainComposerPagePerformanceComponentApi) c7475g.getComponent(RetainComposerPagePerformanceComponentApi.class);
                }

                @Override // ru.ozon.app.android.composer.widgets.internal.loading.di.LoadingComponent
                public LoadingMapper getMapper() {
                    return (LoadingMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.composer.widgets.internal.loading.di.LoadingComponent
                public b getPagePerformanceTracker() {
                    return this.retainComponentApi.getPagePerformanceTracker();
                }
            };
        }

        @NotNull
        public final C7473e<LoadingComponent> invoke(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(LoadingComponent.class), new a(storage, 5));
        }
    }

    @NotNull
    LoadingMapper getMapper();

    @NotNull
    b getPagePerformanceTracker();
}
