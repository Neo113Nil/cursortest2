package com.reactnativecommunity.asyncstorage.next;

import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec;
import com.reactnativecommunity.asyncstorage.SerialExecutor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: StorageModule.kt */
@ReactModule(name = "RNCAsyncStorage")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0017R\u0016\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageModule;", "Lcom/reactnativecommunity/asyncstorage/NativeAsyncStorageModuleSpec;", "Lkotlinx/coroutines/CoroutineScope;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "executor", "Lcom/reactnativecommunity/asyncstorage/SerialExecutor;", "getExecutor$annotations", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "storage", "Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageAccess;", "multiGet", "", "keys", "Lcom/facebook/react/bridge/ReadableArray;", "cb", "Lcom/facebook/react/bridge/Callback;", "multiSet", "keyValueArray", "multiRemove", "multiMerge", "getAllKeys", "clear", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StorageModule extends NativeAsyncStorageModuleSpec implements CoroutineScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "RNCAsyncStorage";
    private final CoroutineContext coroutineContext;
    private final SerialExecutor executor;
    private final AsyncStorageAccess storage;

    private static /* synthetic */ void getExecutor$annotations() {
    }

    @JvmStatic
    public static final AsyncStorageAccess getStorageInstance(Context context) {
        return INSTANCE.getStorageInstance(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.executor = new SerialExecutor(ExecutorsKt.asExecutor(Dispatchers.getMain()));
        this.coroutineContext = Dispatchers.getIO().plus(new CoroutineName("AsyncStorageScope")).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        this.storage = StorageSupplier.INSTANCE.getInstance(reactContext);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* compiled from: StorageModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/StorageModule$Companion;", "", "<init>", "()V", "NAME", "", "getStorageInstance", "Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageAccess;", "ctx", "Landroid/content/Context;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AsyncStorageAccess getStorageInstance(Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            return StorageSupplier.INSTANCE.getInstance(ctx);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray keys, Callback cb) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(this, ErrorHelpersKt.createExceptionHandler(cb), null, new StorageModule$multiGet$1(this, keys, cb, null), 2, null);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray keyValueArray, Callback cb) {
        Intrinsics.checkNotNullParameter(keyValueArray, "keyValueArray");
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(this, ErrorHelpersKt.createExceptionHandler(cb), null, new StorageModule$multiSet$1(keyValueArray, this, cb, null), 2, null);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray keys, Callback cb) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(this, ErrorHelpersKt.createExceptionHandler(cb), null, new StorageModule$multiRemove$1(this, keys, cb, null), 2, null);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray keyValueArray, Callback cb) {
        Intrinsics.checkNotNullParameter(keyValueArray, "keyValueArray");
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(this, ErrorHelpersKt.createExceptionHandler(cb), null, new StorageModule$multiMerge$1(keyValueArray, this, cb, null), 2, null);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(this, ErrorHelpersKt.createExceptionHandler(cb), null, new StorageModule$getAllKeys$1(this, cb, null), 2, null);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(this, ErrorHelpersKt.createExceptionHandler(cb), null, new StorageModule$clear$1(this, cb, null), 2, null);
    }
}
