package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di;

import CN.a;
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
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationStickyButtonMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "Lhi/a;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationMapper;", "getPersonalInfoMapper", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationMapper;", "personalInfoMapper", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationStickyButtonMapper;", "getStickyButtonMapper", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationStickyButtonMapper;", "stickyButtonMapper", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "getPersonalInfoVerificationViewModel", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "personalInfoVerificationViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PersonalInfoVerificationComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PersonalInfoVerificationComponent create$lambda$0(C7475g c7475g) {
            return new PersonalInfoVerificationComponent$Companion$create$1$1((ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class));
        }

        @NotNull
        public final C7473e<PersonalInfoVerificationComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PersonalInfoVerificationComponent.class), new a(storage, 8));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    PersonalInfoVerificationMapper getPersonalInfoMapper();

    @NotNull
    PersonalInfoVerificationViewModel getPersonalInfoVerificationViewModel();

    @NotNull
    PersonalInfoVerificationStickyButtonMapper getStickyButtonMapper();

    @NotNull
    l getTokenizedAnalytics();
}
