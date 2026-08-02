package expo.modules.contacts.next.domain;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
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
import org.socure.imgcodecs.Imgcodecs;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$getLookupKey$2", f = "ContactRepository.kt", i = {}, l = {Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ContactRepository$getLookupKey$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $contactId;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$getLookupKey$2(ContactRepository contactRepository, String str, Continuation<? super ContactRepository$getLookupKey$2> continuation) {
        super(2, continuation);
        this.this$0 = contactRepository;
        this.$contactId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactRepository$getLookupKey$2(this.this$0, this.$contactId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((ContactRepository$getLookupKey$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ContentResolver contentResolver = this.this$0.getContentResolver();
        Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
        this.label = 1;
        Object queryOne$default = ContentResolverExtensionsKt.queryOne$default(contentResolver, CONTENT_URI, "lookup", AnonymousClass1.INSTANCE, "_id = ?", new String[]{this.$contactId}, null, this, 32, null);
        return queryOne$default == coroutine_suspended ? coroutine_suspended : queryOne$default;
    }

    /* compiled from: ContactRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: expo.modules.contacts.next.domain.ContactRepository$getLookupKey$2$1, reason: invalid class name */
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
