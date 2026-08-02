package expo.modules.contacts;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import expo.modules.kotlin.Promise;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.ContactsModule$definition$1$7$1", f = "ContactsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactsModule$definition$1$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ ContactsModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsModule$definition$1$7$1(ContactsModule contactsModule, Promise promise, Continuation<? super ContactsModule$definition$1$7$1> continuation) {
        super(2, continuation);
        this.this$0 = contactsModule;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactsModule$definition$1$7$1(this.this$0, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactsModule$definition$1$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ContentResolver resolver;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            resolver = this.this$0.getResolver();
            Cursor query = resolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id"}, null, null, null);
            if (query != null) {
                Cursor cursor = query;
                try {
                    this.$promise.resolve(cursor.moveToFirst());
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                    return Unit.INSTANCE;
                } finally {
                }
            } else {
                throw new ContactsCheckFailedException();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
