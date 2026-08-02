package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormViewModel;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.data.BloggerPersonalDataFormContentMapper;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.data.BloggerPersonalDataFormOverlayMapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/di/BloggerPersonalDataFormComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormContentMapper;", "getContentMapper", "()Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormContentMapper;", "contentMapper", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormOverlayMapper;", "getOverlayMapper", "()Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormOverlayMapper;", "overlayMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BloggerPersonalDataFormComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/di/BloggerPersonalDataFormComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/di/BloggerPersonalDataFormComponent;", "create", "(Lk20/g;)Lk20/e;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BloggerPersonalDataFormComponent create$lambda$0(final C7475g c7475g) {
            return new BloggerPersonalDataFormComponent(c7475g) { // from class: ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent$Companion$create$1$1

                /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j customActionHandlersStoreFactory;

                /* renamed from: contentMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j contentMapper = k.b(BloggerPersonalDataFormComponent$Companion$create$1$1$contentMapper$2.INSTANCE);

                /* renamed from: overlayMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j overlayMapper = k.b(BloggerPersonalDataFormComponent$Companion$create$1$1$overlayMapper$2.INSTANCE);

                /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModelProvider = k.b(BloggerPersonalDataFormComponent$Companion$create$1$1$viewModelProvider$2.INSTANCE);

                {
                    this.customActionHandlersStoreFactory = k.b(new BloggerPersonalDataFormComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(c7475g));
                }

                @Override // ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent
                public BloggerPersonalDataFormContentMapper getContentMapper() {
                    return (BloggerPersonalDataFormContentMapper) this.contentMapper.getValue();
                }

                @Override // ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent
                public d getCustomActionHandlersStoreFactory() {
                    return (d) this.customActionHandlersStoreFactory.getValue();
                }

                @Override // ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent
                public BloggerPersonalDataFormOverlayMapper getOverlayMapper() {
                    return (BloggerPersonalDataFormOverlayMapper) this.overlayMapper.getValue();
                }

                @Override // ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent
                public Pc.a<BloggerPersonalDataFormViewModel> getViewModelProvider() {
                    return (Pc.a) this.viewModelProvider.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<BloggerPersonalDataFormComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BloggerPersonalDataFormComponent.class), new CA.a(storage, 0));
        }
    }

    @NotNull
    BloggerPersonalDataFormContentMapper getContentMapper();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    BloggerPersonalDataFormOverlayMapper getOverlayMapper();

    @NotNull
    Pc.a<BloggerPersonalDataFormViewModel> getViewModelProvider();
}
