package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import Sc.s;
import Wc.a;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/Contact;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper$sortByName$2", f = "ContactsHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ContactsHelper$sortByName$2 extends j implements Function2<M, d<? super List<? extends Contact>>, Object> {
    final /* synthetic */ Collection<Contact> $contacts;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsHelper$sortByName$2(Collection<Contact> collection, d<? super ContactsHelper$sortByName$2> dVar) {
        super(2, dVar);
        this.$contacts = collection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContactsHelper$sortByName$2(this.$contacts, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends Contact>> dVar) {
        return invoke2(m11, (d<? super List<Contact>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ContactsHelper.Companion companion;
        ContactsHelper.Companion companion2;
        ContactsHelper.Companion companion3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (Contact contact : this.$contacts) {
            Character F11 = h.F(contact.getName());
            Character ch2 = F11 != null ? new Character(Character.toLowerCase(F11.charValue())) : null;
            if (ch2 == null) {
                hashSet4.add(contact);
            } else {
                companion = ContactsHelper.Companion;
                if (companion.getCyryllics().contains(ch2)) {
                    hashSet.add(contact);
                } else {
                    companion2 = ContactsHelper.Companion;
                    if (companion2.getLatins().contains(ch2)) {
                        hashSet2.add(contact);
                    } else {
                        companion3 = ContactsHelper.Companion;
                        if (companion3.getDigits().contains(ch2)) {
                            hashSet3.add(contact);
                        } else {
                            hashSet4.add(contact);
                        }
                    }
                }
            }
        }
        return C7714v.p0(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper$sortByName$2$invokeSuspend$$inlined$sortedBy$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(((Contact) t2).getName(), ((Contact) t11).getName());
            }
        }, hashSet4), C7714v.p0(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper$sortByName$2$invokeSuspend$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(((Contact) t2).getName(), ((Contact) t11).getName());
            }
        }, hashSet3), C7714v.p0(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper$sortByName$2$invokeSuspend$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(((Contact) t2).getName(), ((Contact) t11).getName());
            }
        }, hashSet2), C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper$sortByName$2$invokeSuspend$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(((Contact) t2).getName(), ((Contact) t11).getName());
            }
        }, hashSet))));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<Contact>> dVar) {
        return ((ContactsHelper$sortByName$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
