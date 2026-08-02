package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di;

import DR.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterParser;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.mapper.TopAuthorAnimationMapper;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.mapper.TopAuthorCounterMapper;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.mapper.TopAuthorMapper;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.domain.TopAuthorRepository;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/di/TopAuthorCounterComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorAnimationMapper;", "getTopAuthorAnimationMapper", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorAnimationMapper;", "topAuthorAnimationMapper", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorCounterMapper;", "getCounterMapper", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorCounterMapper;", "counterMapper", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorMapper;", "getTopAuthorMapper", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/mapper/TopAuthorMapper;", "topAuthorMapper", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/domain/TopAuthorRepository;", "getTopAuthorRepository", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/domain/TopAuthorRepository;", "topAuthorRepository", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/core/TopAuthorCounterParser;", "getParser", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/core/TopAuthorCounterParser;", "parser", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TopAuthorCounterComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/di/TopAuthorCounterComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/di/TopAuthorCounterComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TopAuthorCounterComponent create$lambda$0(C7475g c7475g) {
            final StorageComponentApi storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            final NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
            return new TopAuthorCounterComponent(networkComponentApi, storageComponentApi) { // from class: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent$Companion$create$1$1
                final /* synthetic */ NetworkComponentApi $networkComponentApi;

                /* renamed from: parser$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j parser;

                /* renamed from: topAuthorRepository$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j topAuthorRepository;

                /* renamed from: counterMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j counterMapper = k.b(TopAuthorCounterComponent$Companion$create$1$1$counterMapper$2.INSTANCE);

                /* renamed from: topAuthorMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j topAuthorMapper = k.b(TopAuthorCounterComponent$Companion$create$1$1$topAuthorMapper$2.INSTANCE);

                /* renamed from: topAuthorAnimationMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j topAuthorAnimationMapper = k.b(TopAuthorCounterComponent$Companion$create$1$1$topAuthorAnimationMapper$2.INSTANCE);

                {
                    this.$networkComponentApi = networkComponentApi;
                    this.topAuthorRepository = k.b(new TopAuthorCounterComponent$Companion$create$1$1$topAuthorRepository$2(storageComponentApi));
                    this.parser = k.b(new TopAuthorCounterComponent$Companion$create$1$1$parser$2(networkComponentApi));
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent
                public TopAuthorCounterMapper getCounterMapper() {
                    return (TopAuthorCounterMapper) this.counterMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent
                public TopAuthorCounterParser getParser() {
                    return (TopAuthorCounterParser) this.parser.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent
                public TopAuthorAnimationMapper getTopAuthorAnimationMapper() {
                    return (TopAuthorAnimationMapper) this.topAuthorAnimationMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent
                public TopAuthorMapper getTopAuthorMapper() {
                    return (TopAuthorMapper) this.topAuthorMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent
                public TopAuthorRepository getTopAuthorRepository() {
                    return (TopAuthorRepository) this.topAuthorRepository.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<TopAuthorCounterComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TopAuthorCounterComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    TopAuthorCounterMapper getCounterMapper();

    @NotNull
    TopAuthorCounterParser getParser();

    @NotNull
    TopAuthorAnimationMapper getTopAuthorAnimationMapper();

    @NotNull
    TopAuthorMapper getTopAuthorMapper();

    @NotNull
    TopAuthorRepository getTopAuthorRepository();
}
