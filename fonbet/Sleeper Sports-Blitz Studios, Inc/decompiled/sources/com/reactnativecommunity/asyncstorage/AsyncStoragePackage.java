package com.reactnativecommunity.asyncstorage;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.reactnativecommunity.asyncstorage.next.StorageModule;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AsyncStoragePackage.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/AsyncStoragePackage;", "Lcom/facebook/react/TurboReactPackage;", "<init>", "()V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", "name", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AsyncStoragePackage extends TurboReactPackage {
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(String name, ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(name, "RNCAsyncStorage")) {
            return new StorageModule(context);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        try {
            Object newInstance = Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (ReactModuleInfoProvider) newInstance;
        } catch (ClassNotFoundException unused) {
            return new ReactModuleInfoProvider() { // from class: com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ExternalSyntheticLambda0
                @Override // com.facebook.react.module.model.ReactModuleInfoProvider
                public final Map getReactModuleInfos() {
                    Map reactModuleInfoProvider$lambda$0;
                    reactModuleInfoProvider$lambda$0 = AsyncStoragePackage.getReactModuleInfoProvider$lambda$0();
                    return reactModuleInfoProvider$lambda$0;
                }
            };
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for AsyncStoragePackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for AsyncStoragePackage$$ReactModuleInfoProvider", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        Annotation annotation = StorageModule.class.getAnnotation(ReactModule.class);
        Intrinsics.checkNotNull(annotation);
        ReactModule reactModule = (ReactModule) annotation;
        String name = reactModule.name();
        String name2 = StorageModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return MapsKt.mapOf(TuplesKt.to("RNCAsyncStorage", new ReactModuleInfo(name, name2, reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), true)));
    }
}
