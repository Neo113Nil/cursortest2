package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

import BV.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "getSubscribeAuthorsIdStorage", "()Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleReviewSocialHeaderComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleReviewSocialHeaderComponent create$lambda$0(C7475g c7475g) {
            final NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
            final StorageComponentApi storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            final CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
            final SingleReviewPrefetcher singleReviewPrefetcher = new SingleReviewPrefetcher(((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class)).getContext());
            return new SingleReviewSocialHeaderComponent(singleReviewPrefetcher, retainComposerComponentApi, networkComponentApi, storageComponentApi, customActionHandlersComponentApi) { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderComponent$Companion$create$1$1
                final /* synthetic */ CustomActionHandlersComponentApi $customActionHandlersComponentApi;
                final /* synthetic */ NetworkComponentApi $networkComponentApi;
                final /* synthetic */ RetainComposerComponentApi $retainComponentApi;
                final /* synthetic */ StorageComponentApi $storageComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;

                {
                    this.$retainComponentApi = retainComposerComponentApi;
                    this.$networkComponentApi = networkComponentApi;
                    this.$storageComponentApi = storageComponentApi;
                    this.$customActionHandlersComponentApi = customActionHandlersComponentApi;
                    this.mapper = k.b(new SingleReviewSocialHeaderComponent$Companion$create$1$1$mapper$2(singleReviewPrefetcher));
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.$customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderComponent
                public SingleReviewSocialHeaderMapper getMapper() {
                    return (SingleReviewSocialHeaderMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderComponent
                public SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage() {
                    return this.$storageComponentApi.getSubscribeAuthorsIdStorage();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderComponent
                public l getTokenizedAnalytics() {
                    return this.$retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SingleReviewSocialHeaderComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SingleReviewSocialHeaderComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    SingleReviewSocialHeaderMapper getMapper();

    @NotNull
    SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage();

    @NotNull
    l getTokenizedAnalytics();
}
