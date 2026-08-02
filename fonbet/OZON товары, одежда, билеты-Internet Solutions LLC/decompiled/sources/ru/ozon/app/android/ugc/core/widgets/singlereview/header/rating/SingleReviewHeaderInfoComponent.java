package ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating;

import AO.a;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleReviewHeaderInfoComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleReviewHeaderInfoComponent create$lambda$0(C7475g c7475g) {
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            return new SingleReviewHeaderInfoComponent() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating.SingleReviewHeaderInfoComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(SingleReviewHeaderInfoComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating.SingleReviewHeaderInfoComponent
                public SingleReviewHeaderInfoMapper getMapper() {
                    return (SingleReviewHeaderInfoMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating.SingleReviewHeaderInfoComponent
                public l getTokenizedAnalytics() {
                    return RetainComposerComponentApi.this.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SingleReviewHeaderInfoComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SingleReviewHeaderInfoComponent.class), new a(storage, 15));
        }
    }

    @NotNull
    SingleReviewHeaderInfoMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
