package expo.modules.notifications.permissions;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.os.BundleKt;
import androidx.tracing.Trace;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
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
import expo.modules.notifications.ModuleNotFoundException;
import expo.modules.notifications.service.NotificationsService;
import io.github.lukmccall.pika.TypeInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;

/* compiled from: NotificationPermissionsModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lexpo/modules/notifications/permissions/NotificationPermissionsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "permissions", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getPermissionsWithPromiseImplApi33", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "getPermissionsWithPromiseImplClassic", "requestPermissionsWithPromiseImplApi33", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NotificationPermissionsModule extends Module {
    private final Permissions getPermissions() {
        Permissions permissions = getAppContext().getPermissions();
        if (permissions != null) {
            return permissions;
        }
        throw new ModuleNotFoundException(Reflection.getOrCreateKotlinClass(Permissions.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        Object m13470constructorimpl2;
        NotificationPermissionsModule notificationPermissionsModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (notificationPermissionsModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(notificationPermissionsModule);
            moduleDefinitionBuilder.Name("ExpoNotificationPermissionsModule");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            Object obj = null;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Context context;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        context = NotificationPermissionsModule.this.getContext();
                        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                            NotificationPermissionsModule.this.getPermissionsWithPromiseImplClassic(promise);
                        } else {
                            NotificationPermissionsModule.this.getPermissionsWithPromiseImplApi33(promise);
                        }
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunction$2
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m13470constructorimpl);
                    if (m13473exceptionOrNullimpl != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl)) {
                        m13470constructorimpl = null;
                    }
                    TypeDescriptor typeDescriptor = (TypeDescriptor) m13470constructorimpl;
                    if (typeDescriptor == null) {
                        typeDescriptor = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType = new AnyType(typeDescriptor, converters);
                }
                anyTypeArr[0] = anyType;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Context context;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        context = NotificationPermissionsModule.this.getContext();
                        if (context.getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                            NotificationPermissionsModule.this.getPermissionsWithPromiseImplClassic(promise);
                        } else {
                            NotificationPermissionsModule.this.getPermissionsWithPromiseImplApi33(promise);
                        }
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getPermissionsAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[1];
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArguments.class), true));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.core.arguments.ReadableArguments", Reflection.getOrCreateKotlinClass(ReadableArguments.class), true)), new Function0<KType>() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(ReadableArguments.class);
                        }
                    }));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m13473exceptionOrNullimpl2 = Result.m13473exceptionOrNullimpl(m13470constructorimpl2);
                if (m13473exceptionOrNullimpl2 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadableArguments.class.getName(), m13473exceptionOrNullimpl2);
                }
                if (!Result.m13476isFailureimpl(m13470constructorimpl2)) {
                    obj = m13470constructorimpl2;
                }
                TypeDescriptor typeDescriptor2 = (TypeDescriptor) obj;
                if (typeDescriptor2 == null) {
                    typeDescriptor2 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(ReadableArguments.class));
                }
                anyType2 = new AnyType(typeDescriptor2, converters2);
            }
            anyTypeArr2[0] = anyType2;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Context context;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    context = NotificationPermissionsModule.this.getContext();
                    if (context.getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                        NotificationPermissionsModule.this.getPermissionsWithPromiseImplClassic(promise);
                    } else {
                        NotificationPermissionsModule.this.requestPermissionsWithPromiseImplApi33(promise);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder3.getAsyncFunctions().put("requestPermissionsAsync", asyncFunctionWithPromiseComponent2);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = asyncFunctionWithPromiseComponent2;
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getPermissionsWithPromiseImplApi33(final Promise promise) {
        String[] strArr;
        Permissions permissions = getPermissions();
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$$ExternalSyntheticLambda0
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                NotificationPermissionsModule.getPermissionsWithPromiseImplApi33$lambda$7(NotificationPermissionsModule.this, promise, map);
            }
        };
        strArr = NotificationPermissionsModuleKt.PERMISSIONS;
        permissions.getPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPermissionsWithPromiseImplApi33$lambda$7(NotificationPermissionsModule notificationPermissionsModule, Promise promise, Map permissionsMap) {
        boolean z;
        boolean z2;
        boolean z3;
        String status;
        Intrinsics.checkNotNullParameter(permissionsMap, "permissionsMap");
        NotificationManagerCompat from = NotificationManagerCompat.from(notificationPermissionsModule.getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        boolean areNotificationsEnabled = from.areNotificationsEnabled();
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("importance", Integer.valueOf(from.getImportance())));
        Object systemService = notificationPermissionsModule.getContext().getSystemService(NotificationsService.NOTIFICATION_KEY);
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleOf.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        if (!permissionsMap.isEmpty()) {
            Iterator it = permissionsMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!permissionsMap.isEmpty()) {
            Iterator it2 = permissionsMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() != PermissionsStatus.DENIED) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (!permissionsMap.isEmpty()) {
            Iterator it3 = permissionsMap.entrySet().iterator();
            while (it3.hasNext()) {
                if (!((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain()) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        if (z2) {
            status = PermissionsStatus.DENIED.getStatus();
        } else if (!areNotificationsEnabled) {
            status = PermissionsStatus.DENIED.getStatus();
        } else if (z) {
            status = PermissionsStatus.GRANTED.getStatus();
        } else {
            status = PermissionsStatus.UNDETERMINED.getStatus();
        }
        promise.resolve(BundleKt.bundleOf(TuplesKt.to(PermissionsResponse.EXPIRES_KEY, "never"), TuplesKt.to("status", status), TuplesKt.to(PermissionsResponse.CAN_ASK_AGAIN_KEY, Boolean.valueOf(z3)), TuplesKt.to(PermissionsResponse.GRANTED_KEY, Boolean.valueOf(z)), TuplesKt.to("android", bundleOf)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getPermissionsWithPromiseImplClassic(Promise promise) {
        NotificationManagerCompat from = NotificationManagerCompat.from(getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        boolean areNotificationsEnabled = from.areNotificationsEnabled();
        PermissionsStatus permissionsStatus = areNotificationsEnabled ? PermissionsStatus.GRANTED : PermissionsStatus.DENIED;
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.to("importance", Integer.valueOf(from.getImportance())));
        Object systemService = getContext().getSystemService(NotificationsService.NOTIFICATION_KEY);
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleOf.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to(PermissionsResponse.EXPIRES_KEY, "never");
        pairArr[1] = TuplesKt.to("status", permissionsStatus.getStatus());
        pairArr[2] = TuplesKt.to(PermissionsResponse.CAN_ASK_AGAIN_KEY, Boolean.valueOf(areNotificationsEnabled));
        pairArr[3] = TuplesKt.to(PermissionsResponse.GRANTED_KEY, Boolean.valueOf(permissionsStatus == PermissionsStatus.GRANTED));
        pairArr[4] = TuplesKt.to("android", bundleOf);
        promise.resolve(BundleKt.bundleOf(pairArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissionsWithPromiseImplApi33(final Promise promise) {
        String[] strArr;
        Permissions permissions = getPermissions();
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.notifications.permissions.NotificationPermissionsModule$$ExternalSyntheticLambda1
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                NotificationPermissionsModule.this.getPermissionsWithPromiseImplApi33(promise);
            }
        };
        strArr = NotificationPermissionsModuleKt.PERMISSIONS;
        permissions.askForPermissions(permissionsResponseListener, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
