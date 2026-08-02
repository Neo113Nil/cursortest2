package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts;

import Sc.s;
import Wc.a;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/contacts/Contact;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepositoryImpl$fetchContacts$2", f = "ContactsRepository.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ContactsRepositoryImpl$fetchContacts$2 extends j implements Function2<M, d<? super List<? extends Contact>>, Object> {
    final /* synthetic */ ContentResolver $resolver;
    int label;
    final /* synthetic */ ContactsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsRepositoryImpl$fetchContacts$2(ContentResolver contentResolver, ContactsRepositoryImpl contactsRepositoryImpl, d<? super ContactsRepositoryImpl$fetchContacts$2> dVar) {
        super(2, dVar);
        this.$resolver = contentResolver;
        this.this$0 = contactsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContactsRepositoryImpl$fetchContacts$2(this.$resolver, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends Contact>> dVar) {
        return invoke2(m11, (d<? super List<Contact>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ContactsHelper contactsHelper;
        String string;
        String generateInitials;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        Cursor query = this.$resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data1"}, null, null, "contact_id");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (query != null && query.moveToNext()) {
            String string2 = query.getString(0);
            if (string2 != null && (string = query.getString(1)) != null) {
                generateInitials = this.this$0.generateInitials(string2);
                linkedHashSet.add(new Contact(string2, string, generateInitials));
            }
        }
        if (query != null) {
            query.close();
        }
        contactsHelper = this.this$0.contactsHelper;
        this.label = 1;
        Object sortByName = contactsHelper.sortByName(linkedHashSet, this);
        return sortByName == aVar ? aVar : sortByName;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<Contact>> dVar) {
        return ((ContactsRepositoryImpl$fetchContacts$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
