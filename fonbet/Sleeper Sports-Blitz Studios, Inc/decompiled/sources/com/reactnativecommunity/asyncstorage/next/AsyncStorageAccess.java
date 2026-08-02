package com.reactnativecommunity.asyncstorage.next;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: StorageSupplier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\tH¦@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageAccess;", "", "getValues", "", "Lcom/reactnativecommunity/asyncstorage/next/Entry;", "keys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setValues", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "removeValues", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "mergeValues", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AsyncStorageAccess {
    Object clear(Continuation<? super Unit> continuation);

    Object getKeys(Continuation<? super List<String>> continuation);

    Object getValues(List<String> list, Continuation<? super List<Entry>> continuation);

    Object mergeValues(List<Entry> list, Continuation<? super Unit> continuation);

    Object removeValues(List<String> list, Continuation<? super Unit> continuation);

    Object setValues(List<Entry> list, Continuation<? super Unit> continuation);
}
