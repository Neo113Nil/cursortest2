package expo.modules.contacts.next;

import expo.modules.contacts.next.records.SkipFormatter;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.socure.imgcodecs.Imgcodecs;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", "", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3", f = "ContactsNextModule.kt", i = {}, l = {Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3 contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3 = new ContactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3(continuation);
        contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3.L$0 = objArr;
        return contactsNextModule$definition$lambda$86$lambda$84$$inlined$Coroutine$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SkipFormatter skipFormatter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Set<? extends ContactField> set = (Set) objArr[1];
            SkipFormatter skipFormatter2 = new SkipFormatter(set);
            this.L$0 = skipFormatter2;
            this.label = 1;
            obj = ((Contact) obj2).getDetails(set, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            skipFormatter = skipFormatter2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            skipFormatter = (SkipFormatter) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return skipFormatter.format((GetContactDetailsRecord) obj);
    }
}
