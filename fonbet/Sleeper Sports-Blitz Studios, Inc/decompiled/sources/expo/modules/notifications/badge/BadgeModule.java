package expo.modules.notifications.badge;

import android.content.Context;
import android.util.Log;
import androidx.tracing.Trace;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
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
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: BadgeModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/notifications/badge/BadgeModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BadgeModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        BadgeModule badgeModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (badgeModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(badgeModule);
            moduleDefinitionBuilder.Name("ExpoBadgeModule");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr = new AnyType[0];
            Function1<Object[], Integer> function1 = new Function1<Object[], Integer>() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(BadgeHelper.INSTANCE.getBadgeCount());
                }
            };
            if (!Intrinsics.areEqual(Integer.class, Integer.TYPE)) {
                if (!Intrinsics.areEqual(Integer.class, Boolean.TYPE)) {
                    if (!Intrinsics.areEqual(Integer.class, Double.TYPE)) {
                        if (!Intrinsics.areEqual(Integer.class, Float.TYPE)) {
                            if (Intrinsics.areEqual(Integer.class, String.class)) {
                                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1);
                            } else {
                                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1);
                }
            } else {
                untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("getBadgeCountAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getBadgeCountAsync", untypedAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Integer.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("setBadgeCountAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        int intValue = ((Integer) promise).intValue();
                        BadgeHelper badgeHelper = BadgeHelper.INSTANCE;
                        Context reactContext = BadgeModule.this.getAppContext().getReactContext();
                        if (reactContext != null) {
                            badgeHelper.setBadgeCount(reactContext, intValue);
                            return;
                        }
                        throw new Exceptions.ReactContextLost();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder3.getConverters();
                AnyType[] anyTypeArr2 = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Integer.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.Int", Reflection.getOrCreateKotlinClass(Integer.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$3
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Integer.TYPE);
                            }
                        }));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Integer.class.getName(), m13473exceptionOrNullimpl);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        m13470constructorimpl = null;
                    }
                    TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                        typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Integer.TYPE));
                    }
                    anyType = new AnyType(typeDescriptor, converters);
                }
                anyTypeArr2[0] = anyType;
                Function1<Object[], Boolean> function12 = new Function1<Object[], Boolean>() { // from class: expo.modules.notifications.badge.BadgeModule$definition$lambda$2$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        int intValue = ((Number) objArr[0]).intValue();
                        BadgeHelper badgeHelper = BadgeHelper.INSTANCE;
                        Context reactContext = BadgeModule.this.getAppContext().getReactContext();
                        if (reactContext == null) {
                            throw new Exceptions.ReactContextLost();
                        }
                        return Boolean.valueOf(badgeHelper.setBadgeCount(reactContext, intValue));
                    }
                };
                if (!Intrinsics.areEqual(Boolean.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Boolean.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Boolean.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Boolean.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Boolean.class, String.class)) {
                                    untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
                                } else {
                                    untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
                                }
                            } else {
                                untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("setBadgeCountAsync", anyTypeArr2, function12);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("setBadgeCountAsync", asyncFunctionWithPromiseComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }
}
