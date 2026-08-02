package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import Bm.C2665a;
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
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleReviewUserInfoComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleReviewUserInfoComponent create$lambda$0(C7475g c7475g) {
            final NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            final SingleReviewPrefetcher singleReviewPrefetcher = new SingleReviewPrefetcher(((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class)).getContext());
            return new SingleReviewUserInfoComponent(singleReviewPrefetcher, networkComponentApi, retainComposerComponentApi) { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo.SingleReviewUserInfoComponent$Companion$create$1$1
                final /* synthetic */ NetworkComponentApi $networkComponentApi;
                final /* synthetic */ RetainComposerComponentApi $retainComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;

                {
                    this.$networkComponentApi = networkComponentApi;
                    this.$retainComponentApi = retainComposerComponentApi;
                    this.mapper = k.b(new SingleReviewUserInfoComponent$Companion$create$1$1$mapper$2(singleReviewPrefetcher));
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo.SingleReviewUserInfoComponent
                public SingleReviewUserInfoMapper getMapper() {
                    return (SingleReviewUserInfoMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo.SingleReviewUserInfoComponent
                public l getTokenizedAnalytics() {
                    return this.$retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SingleReviewUserInfoComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SingleReviewUserInfoComponent.class), new C2665a(storage, 1));
        }
    }

    @NotNull
    SingleReviewUserInfoMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
