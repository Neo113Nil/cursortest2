package com.reactnativecommunity.asyncstorage.next;

import android.content.Context;
import com.facebook.appevents.UserDataStore;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StorageSupplier.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010\u0011\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\rJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0096@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageSupplier;", "Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageAccess;", UserDataStore.DATE_OF_BIRTH, "Lcom/reactnativecommunity/asyncstorage/next/StorageDb;", "<init>", "(Lcom/reactnativecommunity/asyncstorage/next/StorageDb;)V", "access", "Lcom/reactnativecommunity/asyncstorage/next/StorageDao;", "getValues", "", "Lcom/reactnativecommunity/asyncstorage/next/Entry;", "keys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setValues", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "removeValues", "mergeValues", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StorageSupplier implements AsyncStorageAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final StorageDao access;

    /* compiled from: StorageSupplier.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageSupplier$Companion;", "", "<init>", "()V", "getInstance", "Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageAccess;", "ctx", "Landroid/content/Context;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AsyncStorageAccess getInstance(Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            return new StorageSupplier(StorageDb.INSTANCE.getDatabase(ctx));
        }
    }

    public StorageSupplier(StorageDb db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.access = db.storage();
    }

    @Override // com.reactnativecommunity.asyncstorage.next.AsyncStorageAccess
    public Object getValues(List<String> list, Continuation<? super List<Entry>> continuation) {
        return this.access.getValues(list, continuation);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.AsyncStorageAccess
    public Object setValues(List<Entry> list, Continuation<? super Unit> continuation) {
        Object values = this.access.setValues(list, continuation);
        return values == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? values : Unit.INSTANCE;
    }

    @Override // com.reactnativecommunity.asyncstorage.next.AsyncStorageAccess
    public Object removeValues(List<String> list, Continuation<? super Unit> continuation) {
        Object removeValues = this.access.removeValues(list, continuation);
        return removeValues == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeValues : Unit.INSTANCE;
    }

    @Override // com.reactnativecommunity.asyncstorage.next.AsyncStorageAccess
    public Object mergeValues(List<Entry> list, Continuation<? super Unit> continuation) {
        Object mergeValues = this.access.mergeValues(list, continuation);
        return mergeValues == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mergeValues : Unit.INSTANCE;
    }

    @Override // com.reactnativecommunity.asyncstorage.next.AsyncStorageAccess
    public Object getKeys(Continuation<? super List<String>> continuation) {
        return this.access.getKeys(continuation);
    }

    @Override // com.reactnativecommunity.asyncstorage.next.AsyncStorageAccess
    public Object clear(Continuation<? super Unit> continuation) {
        Object clear = this.access.clear(continuation);
        return clear == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clear : Unit.INSTANCE;
    }
}
