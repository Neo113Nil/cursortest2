package ru.ozon.app.android.ugc.widgets.profileHeader.di;

import Av.C2447a;
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
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.widgets.profileHeader.core.ProfileHeaderMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/di/ProfileHeaderComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/profileHeader/core/ProfileHeaderMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "getSubscribeAuthorsIdStorage", "()Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProfileHeaderComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/di/ProfileHeaderComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/profileHeader/di/ProfileHeaderComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProfileHeaderComponent create$lambda$0(final C7475g c7475g) {
            return new ProfileHeaderComponent() { // from class: ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent$Companion$create$1$1

                /* renamed from: inhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j inhibitor = k.b(ProfileHeaderComponent$Companion$create$1$1$inhibitor$2.INSTANCE);

                @Override // ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent
                public d getCustomActionHandlersFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent
                public HandlersInhibitor getInhibitor() {
                    return (HandlersInhibitor) this.inhibitor.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent
                public ProfileHeaderMapper getMapper() {
                    return new ProfileHeaderMapper();
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent
                public SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage() {
                    return ((StorageComponentApi) C7475g.this.getComponent(StorageComponentApi.class)).getSubscribeAuthorsIdStorage();
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<ProfileHeaderComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ProfileHeaderComponent.class), new C2447a(storage, 10));
        }
    }

    @NotNull
    d getCustomActionHandlersFactory();

    @NotNull
    HandlersInhibitor getInhibitor();

    @NotNull
    ProfileHeaderMapper getMapper();

    @NotNull
    SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage();

    @NotNull
    l getTokenizedAnalytics();
}
