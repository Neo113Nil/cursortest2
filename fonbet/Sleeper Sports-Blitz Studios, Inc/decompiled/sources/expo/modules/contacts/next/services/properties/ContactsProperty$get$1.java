package expo.modules.contacts.next.services.properties;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactsProperty.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.services.properties.ContactsProperty", f = "ContactsProperty.kt", i = {}, l = {16}, m = "get", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactsProperty$get$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContactsProperty<TDomain, TDto> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsProperty$get$1(ContactsProperty<TDomain, TDto> contactsProperty, Continuation<? super ContactsProperty$get$1> continuation) {
        super(continuation);
        this.this$0 = contactsProperty;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(this);
    }
}
