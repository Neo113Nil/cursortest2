package ru.ozon.app.android.ugc.widgets.reviewSort.di;

import AM.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/di/ReviewSortButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/composer/ComposerNavigator;", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/app/android/ugc/widgets/reviewSort/core/ReviewSortMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewSort/core/ReviewSortMapper;", "mapper", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReviewSortButtonComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/di/ReviewSortButtonComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/reviewSort/di/ReviewSortButtonComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReviewSortButtonComponent getInstance$lambda$0(final C7475g c7475g) {
            return new ReviewSortButtonComponent() { // from class: ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent$Companion$getInstance$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ReviewSortButtonComponent$Companion$getInstance$1$1$mapper$2.INSTANCE);

                private final AndroidPlatformComponentDependencies getAndroidPlatformComponentDependencies() {
                    return (AndroidPlatformComponentDependencies) C7475g.this.getComponent(AndroidPlatformComponentDependencies.class);
                }

                private final RetainComposerComponentApi getRetainComposerComponentApi() {
                    return (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent
                public AppType getAppType() {
                    return getAndroidPlatformComponentDependencies().getAppType();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent
                public ComposerNavigator getComposerNavigator() {
                    return getRetainComposerComponentApi().getComposerNavigator();
                }

                @Override // ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent
                public ReviewSortMapper getMapper() {
                    return (ReviewSortMapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<ReviewSortButtonComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ReviewSortButtonComponent.class), new a(storage, 17));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    ComposerNavigator getComposerNavigator();

    @NotNull
    ReviewSortMapper getMapper();
}
