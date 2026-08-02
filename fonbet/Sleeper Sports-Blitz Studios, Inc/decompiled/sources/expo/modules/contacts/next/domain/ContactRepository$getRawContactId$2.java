package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.extensions.ContentResolverExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getRawContactId$2", f = "ContactRepository.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$getRawContactId$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RawContactId>, Object> {
    final /* synthetic */ String $contactId;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getRawContactId$2(ContactRepository contactRepository, String str, Continuation<? super ContactRepository$getRawContactId$2> continuation) {
        super(2, continuation);
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactRepository$getRawContactId$2(this.this$0, this.$contactId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RawContactId> continuation) {
        return ((ContactRepository$getRawContactId$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ContentResolver contentResolver = this.this$0.getContentResolver();
            Uri CONTENT_URI = ContactsContract.RawContacts.CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
            this.label = 1;
            obj = ContentResolverExtensionsKt.queryOne$default(contentResolver, CONTENT_URI, "_id", AnonymousClass1.INSTANCE, "contact_id=?", new String[]{this.$contactId}, null, this, 32, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        String m11746constructorimpl = str != null ? RawContactId.m11746constructorimpl(str) : null;
        if (m11746constructorimpl != null) {
            return RawContactId.m11745boximpl(m11746constructorimpl);
        }
        return null;
    }

    /* compiled from: ContactRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: expo.modules.contacts.next.domain.ContactRepository$getRawContactId$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Cursor, Integer, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ String invoke(Cursor cursor, Integer num) {
            return invoke(cursor, num.intValue());
        }

        public final String invoke(Cursor p0, int i) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getString(i);
        }
    }
}
