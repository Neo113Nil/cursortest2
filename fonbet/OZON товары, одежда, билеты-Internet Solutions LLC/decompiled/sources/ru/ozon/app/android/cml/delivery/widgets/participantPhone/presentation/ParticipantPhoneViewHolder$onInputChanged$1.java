package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.contacts.ContactsHelper;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewHolder$onInputChanged$1", f = "ParticipantPhoneViewHolder.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParticipantPhoneViewHolder$onInputChanged$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $input;
    int label;
    final /* synthetic */ ParticipantPhoneViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParticipantPhoneViewHolder$onInputChanged$1(ParticipantPhoneViewHolder participantPhoneViewHolder, String str, d<? super ParticipantPhoneViewHolder$onInputChanged$1> dVar) {
        super(2, dVar);
        this.this$0 = participantPhoneViewHolder;
        this.$input = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ParticipantPhoneViewHolder$onInputChanged$1(this.this$0, this.$input, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ContactsHelper contactsHelper;
        List list;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            contactsHelper = this.this$0.contactsHelper;
            String str = this.$input;
            list = this.this$0.allContactsCells;
            this.label = 1;
            obj = contactsHelper.filterForSearch(str, list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.bindContacts((List) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ParticipantPhoneViewHolder$onInputChanged$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
