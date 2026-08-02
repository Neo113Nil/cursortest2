package expo.modules.contacts.next.domain;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.domain.wrappers.DataId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.contacts.next.domain.ContactRepository$patch$2", f = "ContactRepository.kt", i = {0, 0}, l = {49, 57}, m = "invokeSuspend", n = {"operations", "idsToKeep"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class ContactRepository$patch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ ContactPatch $contactPatch;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ContactRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactRepository$patch$2(ContactPatch contactPatch, ContactRepository contactRepository, Continuation<? super ContactRepository$patch$2> continuation) {
        super(2, continuation);
        this.$contactPatch = contactPatch;
        this.this$0 = contactRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactRepository$patch$2(this.$contactPatch, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ContactRepository$patch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x011b, code lost:
    
        if (expo.modules.contacts.next.extensions.ContentResolverExtensionsKt.safeApplyBatch(r9.this$0.getContentResolver(), "com.android.contacts", (java.util.List<? extends android.content.ContentProviderOperation>) r6, r9) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List mutableList;
        Set set;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableList = CollectionsKt.toMutableList((Collection) this.$contactPatch.toPatchOperations());
            List<Updatable> toUpdate = this.$contactPatch.getToUpdate();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : toUpdate) {
                if (obj2 instanceof Updatable.Data) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(DataId.m11738boximpl(((Updatable.Data) it.next()).getDataId()));
            }
            set = CollectionsKt.toSet(arrayList3);
            this.L$0 = mutableList;
            this.L$1 = set;
            this.L$2 = mutableList;
            this.label = 1;
            obj = this.this$0.m11640getDataIds0xh38yw(this.$contactPatch.m11660getContactIdS9XCBSM(), this.$contactPatch.getModifiedFields(), this);
            if (obj != coroutine_suspended) {
                list = mutableList;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
        mutableList = (List) this.L$2;
        set = (Set) this.L$1;
        list = (List) this.L$0;
        ResultKt.throwOnFailure(obj);
        List minus = CollectionsKt.minus((Iterable) obj, (Iterable) set);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(minus, 10));
        Iterator it2 = minus.iterator();
        while (it2.hasNext()) {
            ContentProviderOperation build = ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("_id = ?", new String[]{((DataId) it2.next()).m11744unboximpl()}).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            arrayList4.add(build);
        }
        mutableList.addAll(arrayList4);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
