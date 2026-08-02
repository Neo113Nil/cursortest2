package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Sc.s;
import Wc.a;
import android.content.ContentResolver;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.Contact;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsMapper;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsRepository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$onAttach$2", f = "ParticipantPhoneViewHolder.kt", l = {145, 146}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParticipantPhoneViewHolder$onAttach$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ParticipantPhoneViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParticipantPhoneViewHolder$onAttach$2(ParticipantPhoneViewHolder participantPhoneViewHolder, d<? super ParticipantPhoneViewHolder$onAttach$2> dVar) {
        super(2, dVar);
        this.this$0 = participantPhoneViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ParticipantPhoneViewHolder$onAttach$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r6 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        ContentResolver contentResolver;
        ParticipantPhoneViewHolder participantPhoneViewHolder;
        ContactsRepository contactsRepository;
        CellDTO contactCell;
        ContactsMapper contactsMapper;
        ParticipantPhoneViewHolder participantPhoneViewHolder2;
        List list;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            composerReferences = this.this$0.refs;
            r a11 = composerReferences.getContainer().a();
            if (a11 != null && (contentResolver = a11.getContentResolver()) != null) {
                participantPhoneViewHolder = this.this$0;
                contactsRepository = participantPhoneViewHolder.contactsRepository;
                this.L$0 = participantPhoneViewHolder;
                this.label = 1;
                obj = contactsRepository.fetchContacts(contentResolver, this);
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            participantPhoneViewHolder2 = (ParticipantPhoneViewHolder) this.L$0;
            s.b(obj);
            list = (List) obj;
            if (list != null) {
                participantPhoneViewHolder2.allContactsCells = list;
                participantPhoneViewHolder2.bindContacts(list);
                return Unit.f71690a;
            }
            return Unit.f71690a;
        }
        participantPhoneViewHolder = (ParticipantPhoneViewHolder) this.L$0;
        s.b(obj);
        List<Contact> list2 = (List) obj;
        ParticipantPhoneVO boundData = participantPhoneViewHolder.getBoundData();
        if (boundData != null && (contactCell = boundData.getContactCell()) != null) {
            contactsMapper = participantPhoneViewHolder.contactsMapper;
            this.L$0 = participantPhoneViewHolder;
            this.label = 2;
            obj = contactsMapper.mapToCells(list2, contactCell, this);
            if (obj != aVar) {
                participantPhoneViewHolder2 = participantPhoneViewHolder;
                list = (List) obj;
                if (list != null) {
                }
            }
            return aVar;
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((ParticipantPhoneViewHolder$onAttach$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
