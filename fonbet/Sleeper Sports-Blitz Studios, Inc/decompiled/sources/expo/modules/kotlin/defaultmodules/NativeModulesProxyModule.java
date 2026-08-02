package expo.modules.kotlin.defaultmodules;

import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.PromiseKt;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeCache;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.descriptors.TypeDescriptor;
import expo.modules.kotlin.types.descriptors.TypeDescriptorKt;
import expo.modules.kotlin.types.descriptors.TypeDescriptorOfKt;
import io.github.lukmccall.pika.TypeInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: NativeModulesProxyModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/NativeModulesProxyModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NativeModulesProxyModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        NativeModulesProxyModule nativeModulesProxyModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (nativeModulesProxyModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(nativeModulesProxyModule);
            moduleDefinitionBuilder.Name(NativeModulesProxyModuleKt.NativeModulesProxyModuleName);
            moduleDefinitionBuilder.Constants(new Function0<Map<String, ? extends Object>>() { // from class: expo.modules.kotlin.defaultmodules.NativeModulesProxyModule$definition$1$1
                @Override // kotlin.jvm.functions.Function0
                public final Map<String, ? extends Object> invoke() {
                    NativeModulesProxy nativeModulesProxy;
                    Map<String, ? extends Object> constants;
                    WeakReference<NativeModulesProxy> legacyModulesProxyHolder$expo_modules_core_release = NativeModulesProxyModule.this.getAppContext().getLegacyModulesProxyHolder$expo_modules_core_release();
                    return (legacyModulesProxyHolder$expo_modules_core_release == null || (nativeModulesProxy = legacyModulesProxyHolder$expo_modules_core_release.get()) == null || (constants = nativeModulesProxy.getConstants()) == null) ? MapsKt.emptyMap() : constants;
                }
            });
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
            AnyType[] anyTypeArr = new AnyType[3];
            AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            Object obj = null;
            if (anyType == null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.defaultmodules.NativeModulesProxyModule$definition$lambda$1$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                if (m13473exceptionOrNullimpl != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                    m13470constructorimpl = null;
                }
                TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                if (typeDescriptor == null) {
                    typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType = new AnyType(typeDescriptor, converters);
            }
            anyTypeArr[0] = anyType;
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.defaultmodules.NativeModulesProxyModule$definition$lambda$1$$inlined$AsyncFunctionWithPromise$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    m13470constructorimpl2 = null;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) m13470constructorimpl2;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters);
            }
            anyTypeArr[1] = anyType2;
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArray.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("com.facebook.react.bridge.ReadableArray", Reflection.getOrCreateKotlinClass(ReadableArray.class), false)), new Function0<KType>() { // from class: expo.modules.kotlin.defaultmodules.NativeModulesProxyModule$definition$lambda$1$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ReadableArray.class);
                        }
                    }));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl3 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadableArray.class.getName(), m13473exceptionOrNullimpl3);
                }
                if (!Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    obj = m13470constructorimpl3;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) obj;
                if (typeDescriptor3 == null) {
                    typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ReadableArray.class));
                }
                anyType3 = new AnyType(typeDescriptor3, converters);
            }
            anyTypeArr[2] = anyType3;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("callMethod", anyTypeArr, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.kotlin.defaultmodules.NativeModulesProxyModule$definition$lambda$1$$inlined$AsyncFunctionWithPromise$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    NativeModulesProxy nativeModulesProxy;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    ReadableArray readableArray = (ReadableArray) objArr[2];
                    String str = (String) obj3;
                    String str2 = (String) obj2;
                    com.facebook.react.bridge.Promise bridgePromise = PromiseKt.toBridgePromise(promise);
                    WeakReference<NativeModulesProxy> legacyModulesProxyHolder$expo_modules_core_release = NativeModulesProxyModule.this.getAppContext().getLegacyModulesProxyHolder$expo_modules_core_release();
                    if (legacyModulesProxyHolder$expo_modules_core_release == null || (nativeModulesProxy = legacyModulesProxyHolder$expo_modules_core_release.get()) == null) {
                        throw new UnexpectedException("The legacy modules proxy holder has been lost");
                    }
                    nativeModulesProxy.callMethod(str2, str, readableArray, bridgePromise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder2.getAsyncFunctions().put("callMethod", asyncFunctionWithPromiseComponent);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
