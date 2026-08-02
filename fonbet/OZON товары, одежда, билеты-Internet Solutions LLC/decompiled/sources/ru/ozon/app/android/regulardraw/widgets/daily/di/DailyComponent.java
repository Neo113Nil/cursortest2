package ru.ozon.app.android.regulardraw.widgets.daily.di;

import DD.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import WZ.l;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.regulardraw.di.RegularDrawDefaultComponent;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.daily.core.DailyMapper;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/di/DailyComponent;", "Lru/ozon/app/android/regulardraw/di/RegularDrawDefaultComponent;", "Lru/ozon/app/android/regulardraw/widgets/daily/core/DailyMapper;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/daily/core/DailyMapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DailyComponent extends RegularDrawDefaultComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/di/DailyComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/daily/di/DailyComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DailyComponent create$lambda$0(final C7475g c7475g) {
            return new DailyComponent() { // from class: ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(DailyComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;
                private final StorageComponentApi storageComponentApi;

                {
                    this.networkComponentApi = (NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                    this.storageComponentApi = (StorageComponentApi) C7475g.this.getComponent(StorageComponentApi.class);
                }

                @Override // ru.ozon.app.android.regulardraw.di.RegularDrawDefaultComponent
                public c getDefaultActionHandlers() {
                    return UtilKt.getDefaultActionHandlers$default(C7475g.this, null, 2, null);
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent
                public DailyMapper getMapper() {
                    return (DailyMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent
                public StartupArgsService getStartupArgsService() {
                    return this.storageComponentApi.getStartupArgsService();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<DailyComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DailyComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    DailyMapper getMapper();

    @NotNull
    StartupArgsService getStartupArgsService();

    @NotNull
    l getTokenizedAnalytics();
}
