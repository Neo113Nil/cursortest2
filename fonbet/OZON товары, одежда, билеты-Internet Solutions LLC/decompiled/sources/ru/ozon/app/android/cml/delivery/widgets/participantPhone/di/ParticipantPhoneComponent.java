package ru.ozon.app.android.cml.delivery.widgets.participantPhone.di;

import AI.c;
import Pc.a;
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
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.data.ParticipantPhoneMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 &2\u00060\u0001j\u0002`\u0002:\u0001&R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/di/ParticipantPhoneComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel;", "getParticipantPhoneViewModelProvider", "()LPc/a;", "participantPhoneViewModelProvider", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneMapper;", "getMapper", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "getContactsRepository", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "contactsRepository", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "getContactsMapper", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "contactsMapper", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "getContactsHelper", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "contactsHelper", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ParticipantPhoneComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/di/ParticipantPhoneComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/di/ParticipantPhoneComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ParticipantPhoneComponent create$lambda$0(C7475g c7475g) {
            return new ParticipantPhoneComponent$Companion$create$1$1((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class));
        }

        @NotNull
        public final C7473e<ParticipantPhoneComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ParticipantPhoneComponent.class), new c(storage, 7));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    ContactsHelper getContactsHelper();

    @NotNull
    ContactsMapper getContactsMapper();

    @NotNull
    ContactsRepository getContactsRepository();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    ParticipantPhoneMapper getMapper();

    @NotNull
    a<ParticipantPhoneViewModel> getParticipantPhoneViewModelProvider();

    @NotNull
    l getTokenizedAnalytics();
}
