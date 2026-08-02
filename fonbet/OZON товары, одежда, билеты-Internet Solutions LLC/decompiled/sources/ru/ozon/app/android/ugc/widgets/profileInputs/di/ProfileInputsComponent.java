package ru.ozon.app.android.ugc.widgets.profileInputs.di;

import LP.a;
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
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.widgets.profileInputs.core.ProfileInputsMapper;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewModel;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewModelImpl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/di/ProfileInputsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/widgets/profileInputs/core/ProfileInputsMapper;", "getProfileInputsMapper", "()Lru/ozon/app/android/ugc/widgets/profileInputs/core/ProfileInputsMapper;", "profileInputsMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;", "getProfileInputsViewModel", "()Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;", "profileInputsViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProfileInputsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/di/ProfileInputsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/profileInputs/di/ProfileInputsComponent;", "create", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProfileInputsComponent create$lambda$0(final C7475g c7475g) {
            return new ProfileInputsComponent(c7475g) { // from class: ru.ozon.app.android.ugc.widgets.profileInputs.di.ProfileInputsComponent$Companion$create$1$1
                private final ActionComponentApi actionComponentApi;

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(ProfileInputsComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                /* renamed from: profileInputsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j profileInputsMapper = k.b(ProfileInputsComponent$Companion$create$1$1$profileInputsMapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComponentApi;

                {
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileInputs.di.ProfileInputsComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileInputs.di.ProfileInputsComponent
                public ProfileInputsMapper getProfileInputsMapper() {
                    return (ProfileInputsMapper) this.profileInputsMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileInputs.di.ProfileInputsComponent
                public ProfileInputsViewModel getProfileInputsViewModel() {
                    return new ProfileInputsViewModelImpl(this.actionComponentApi.getActionRepository());
                }

                @Override // ru.ozon.app.android.ugc.widgets.profileInputs.di.ProfileInputsComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<ProfileInputsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ProfileInputsComponent.class), new a(storage, 3));
        }
    }

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    ProfileInputsMapper getProfileInputsMapper();

    @NotNull
    ProfileInputsViewModel getProfileInputsViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
