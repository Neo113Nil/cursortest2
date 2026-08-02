package ru.ozon.app.android.cml.delivery.widgets.participantPhone.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.data.ParticipantPhoneMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010 R\u0018\u0010&\u001a\u00060\"j\u0002`#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010+\u001a\u00060'j\u0002`(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"ru/ozon/app/android/cml/delivery/widgets/participantPhone/di/ParticipantPhoneComponent$Companion$create$1$1", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/di/ParticipantPhoneComponent;", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/ParticipantPhoneViewModel;", "participantPhoneViewModelProvider", "LPc/a;", "getParticipantPhoneViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/data/ParticipantPhoneMapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "contactsHelper$delegate", "getContactsHelper", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsHelper;", "contactsHelper", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "contactsMapper$delegate", "getContactsMapper", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsMapper;", "contactsMapper", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "contactsRepository$delegate", "getContactsRepository", "()Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/ContactsRepository;", "contactsRepository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParticipantPhoneComponent$Companion$create$1$1 implements ParticipantPhoneComponent {
    final /* synthetic */ CustomActionHandlersComponentApi $actionHandlersApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;
    private final a<ParticipantPhoneViewModel> participantPhoneViewModelProvider = new Hp.a(1);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ParticipantPhoneComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(ParticipantPhoneComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: contactsHelper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j contactsHelper = k.b(ParticipantPhoneComponent$Companion$create$1$1$contactsHelper$2.INSTANCE);

    /* renamed from: contactsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j contactsMapper = k.b(ParticipantPhoneComponent$Companion$create$1$1$contactsMapper$2.INSTANCE);

    /* renamed from: contactsRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j contactsRepository = k.b(new ParticipantPhoneComponent$Companion$create$1$1$contactsRepository$2(this));

    ParticipantPhoneComponent$Companion$create$1$1(CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
        this.$actionHandlersApi = customActionHandlersComponentApi;
        this.$retainComposerApi = retainComposerComponentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParticipantPhoneViewModel participantPhoneViewModelProvider$lambda$0() {
        return new ParticipantPhoneViewModel();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public d getActionHandlersStoreFactory() {
        return this.$actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public ContactsHelper getContactsHelper() {
        return (ContactsHelper) this.contactsHelper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public ContactsMapper getContactsMapper() {
        return (ContactsMapper) this.contactsMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public ContactsRepository getContactsRepository() {
        return (ContactsRepository) this.contactsRepository.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public ParticipantPhoneMapper getMapper() {
        return (ParticipantPhoneMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public a<ParticipantPhoneViewModel> getParticipantPhoneViewModelProvider() {
        return this.participantPhoneViewModelProvider;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }
}
