package com.reactnativecommunity.asyncstorage.next;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: StorageSupplier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0097@¢\u0006\u0002\u0010\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageDao;", "", "getValues", "", "Lcom/reactnativecommunity/asyncstorage/next/Entry;", "keys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setValues", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "removeValues", "mergeValues", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface StorageDao {
    Object clear(Continuation<? super Unit> continuation);

    Object getKeys(Continuation<? super List<String>> continuation);

    Object getValues(List<String> list, Continuation<? super List<Entry>> continuation);

    Object mergeValues(List<Entry> list, Continuation<? super Unit> continuation);

    Object removeValues(List<String> list, Continuation<? super Unit> continuation);

    Object setValues(List<Entry> list, Continuation<? super Unit> continuation);

    /* compiled from: StorageSupplier.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
        
            if (r11.setValues(r2, r0) != r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x011b, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x007a, code lost:
        
            if (r13 == r1) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object mergeValues(StorageDao storageDao, List<Entry> list, Continuation<? super Unit> continuation) {
            StorageDao$mergeValues$1 storageDao$mergeValues$1;
            int i;
            Object obj;
            if (continuation instanceof StorageDao$mergeValues$1) {
                storageDao$mergeValues$1 = (StorageDao$mergeValues$1) continuation;
                if ((storageDao$mergeValues$1.label & Integer.MIN_VALUE) != 0) {
                    storageDao$mergeValues$1.label -= Integer.MIN_VALUE;
                    Object obj2 = storageDao$mergeValues$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = storageDao$mergeValues$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        List<Entry> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Entry) it.next()).getKey());
                        }
                        storageDao$mergeValues$1.L$0 = storageDao;
                        storageDao$mergeValues$1.L$1 = list;
                        storageDao$mergeValues$1.label = 1;
                        obj2 = storageDao.getValues(arrayList, storageDao$mergeValues$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        list = (List) storageDao$mergeValues$1.L$1;
                        storageDao = (StorageDao) storageDao$mergeValues$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                    }
                    List list3 = (List) obj2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Entry entry : list) {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (Intrinsics.areEqual(((Entry) obj).getKey(), entry.getKey())) {
                                break;
                            }
                        }
                        Entry entry2 = (Entry) obj;
                        if ((entry2 != null ? entry2.getValue() : null) == null) {
                            arrayList2.add(entry);
                        } else if (!ArgumentHelpersKt.isValidJson(entry2.getValue()) || !ArgumentHelpersKt.isValidJson(entry.getValue())) {
                            arrayList2.add(entry);
                        } else {
                            String jSONObject = ArgumentHelpersKt.mergeWith(new JSONObject(entry2.getValue()), new JSONObject(entry.getValue())).toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                            arrayList2.add(Entry.copy$default(entry, null, jSONObject, 1, null));
                        }
                    }
                    storageDao$mergeValues$1.L$0 = null;
                    storageDao$mergeValues$1.L$1 = null;
                    storageDao$mergeValues$1.label = 2;
                }
            }
            storageDao$mergeValues$1 = new StorageDao$mergeValues$1(continuation);
            Object obj22 = storageDao$mergeValues$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = storageDao$mergeValues$1.label;
            if (i != 0) {
            }
            List list32 = (List) obj22;
            ArrayList arrayList22 = new ArrayList();
            while (r12.hasNext()) {
            }
            storageDao$mergeValues$1.L$0 = null;
            storageDao$mergeValues$1.L$1 = null;
            storageDao$mergeValues$1.label = 2;
        }
    }
}
