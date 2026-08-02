package expo.modules.notifications.notifications.scheduling;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.tracing.Trace;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.errors.InvalidArgumentException;
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
import expo.modules.notifications.UtilsKt;
import expo.modules.notifications.notifications.ArgumentsNotificationContentBuilder;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.interfaces.NotificationTrigger;
import expo.modules.notifications.notifications.interfaces.SchedulableNotificationTrigger;
import expo.modules.notifications.notifications.model.NotificationContent;
import expo.modules.notifications.notifications.model.NotificationRequest;
import expo.modules.notifications.notifications.triggers.ChannelAwareTrigger;
import expo.modules.notifications.notifications.triggers.DailyTrigger;
import expo.modules.notifications.notifications.triggers.DateTrigger;
import expo.modules.notifications.notifications.triggers.MonthlyTrigger;
import expo.modules.notifications.notifications.triggers.TimeIntervalTrigger;
import expo.modules.notifications.notifications.triggers.WeeklyTrigger;
import expo.modules.notifications.notifications.triggers.YearlyTrigger;
import expo.modules.notifications.service.NotificationsService;
import io.github.lukmccall.pika.TypeInfo;
import io.sentry.metrics.MetricsUnit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: NotificationScheduler.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\n\u001a\u00020\u000b2<\u0010\f\u001a8\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0004J\"\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001fH\u0014J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020#0*H\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lexpo/modules/notifications/notifications/scheduling/NotificationScheduler;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "schedulingContext", "Landroid/content/Context;", "getSchedulingContext", "()Landroid/content/Context;", "handler", "Landroid/os/Handler;", "createResultReceiver", "Landroid/os/ResultReceiver;", "body", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "resultCode", "Landroid/os/Bundle;", "resultData", "", "Lexpo/modules/notifications/ResultReceiverBody;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "cancelScheduledNotificationAsync", "identifier", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "cancelAllScheduledNotificationsAsync", "triggerFromParams", "Lexpo/modules/notifications/notifications/interfaces/NotificationTrigger;", "params", "Lexpo/modules/core/arguments/ReadableArguments;", "createNotificationRequest", "Lexpo/modules/notifications/notifications/model/NotificationRequest;", "content", "Lexpo/modules/notifications/notifications/model/NotificationContent;", "notificationTrigger", "serializeScheduledNotificationRequests", "", "requests", "", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class NotificationScheduler extends Module {
    private final Handler handler = new Handler(Looper.getMainLooper());

    protected Context getSchedulingContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    protected final ResultReceiver createResultReceiver(Function2<? super Integer, ? super Bundle, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return UtilsKt.createDefaultResultReceiver(this.handler, body);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        boolean z;
        boolean z2;
        Object m13470constructorimpl4;
        Object m13470constructorimpl5;
        Object m13470constructorimpl6;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent2;
        Object m13470constructorimpl7;
        NotificationScheduler notificationScheduler = this;
        Trace.beginSection("[ExpoModulesCore] " + (notificationScheduler.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(notificationScheduler);
            moduleDefinitionBuilder.Name("ExpoNotificationScheduler");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getAllScheduledNotificationsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        NotificationsService.INSTANCE.getAllScheduledNotifications(NotificationScheduler.this.getSchedulingContext(), NotificationScheduler.this.createResultReceiver(new NotificationScheduler$definition$1$1$1(promise, NotificationScheduler.this)));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$2
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
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        NotificationsService.INSTANCE.getAllScheduledNotifications(NotificationScheduler.this.getSchedulingContext(), NotificationScheduler.this.createResultReceiver(new NotificationScheduler$definition$1$1$1((Promise) objArr[0], NotificationScheduler.this)));
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getAllScheduledNotificationsAsync", anyTypeArr, function1);
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getAllScheduledNotificationsAsync", intAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[3];
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$1
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
                anyType2 = new AnyType(typeDescriptor2, converters2);
            }
            anyTypeArr2[0] = anyType2;
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArguments.class), false));
            if (anyType3 != null) {
                z2 = false;
            } else {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.core.arguments.ReadableArguments", Reflection.getOrCreateKotlinClass(ReadableArguments.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(ReadableArguments.class);
                        }
                    }));
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                if (m13473exceptionOrNullimpl3 != null) {
                    z = false;
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadableArguments.class.getName(), m13473exceptionOrNullimpl3);
                } else {
                    z = false;
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor3 == null) {
                    typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ReadableArguments.class));
                }
                anyType3 = new AnyType(typeDescriptor3, converters2);
                z2 = z;
            }
            anyTypeArr2[1] = anyType3;
            AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArguments.class), true));
            if (anyType4 == null) {
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.core.arguments.ReadableArguments", Reflection.getOrCreateKotlinClass(ReadableArguments.class), true)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$3
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(ReadableArguments.class);
                        }
                    }));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                }
                Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                if (m13473exceptionOrNullimpl4 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadableArguments.class.getName(), m13473exceptionOrNullimpl4);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl4)) {
                    m13470constructorimpl4 = null;
                }
                TypeDescriptor typeDescriptor4 = (TypeDescriptor) m13470constructorimpl4;
                if (typeDescriptor4 == null) {
                    typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(ReadableArguments.class));
                }
                anyType4 = new AnyType(typeDescriptor4, converters2);
            }
            anyTypeArr2[2] = anyType4;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("scheduleNotificationAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    ReadableArguments readableArguments = (ReadableArguments) objArr[2];
                    final String str = (String) obj;
                    try {
                        NotificationContent build = new ArgumentsNotificationContentBuilder(NotificationScheduler.this.getSchedulingContext()).setPayload((ReadableArguments) obj2).build();
                        NotificationScheduler notificationScheduler2 = NotificationScheduler.this;
                        Intrinsics.checkNotNull(build);
                        NotificationsService.INSTANCE.schedule(NotificationScheduler.this.getSchedulingContext(), notificationScheduler2.createNotificationRequest(str, build, NotificationScheduler.this.triggerFromParams(readableArguments)), NotificationScheduler.this.createResultReceiver(new Function2<Integer, Bundle, Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$1$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Bundle bundle) {
                                invoke(num.intValue(), bundle);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i, Bundle bundle) {
                                if (i == 0) {
                                    Promise.this.resolve(str);
                                    return;
                                }
                                Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
                                Exception exc = serializable instanceof Exception ? (Exception) serializable : null;
                                Promise.this.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. " + (exc != null ? exc.getMessage() : null), exc);
                            }
                        }));
                    } catch (InvalidArgumentException e) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. " + e.getMessage(), e);
                    } catch (NullPointerException e2) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. Encountered unexpected null value. " + e2.getMessage(), e2);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder3.getAsyncFunctions().put("scheduleNotificationAsync", asyncFunctionWithPromiseComponent);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2 = asyncFunctionWithPromiseComponent;
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[1];
            AnyType anyType5 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), Boolean.valueOf(z2)));
            ?? r16 = z2;
            if (anyType5 == null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), z2 ? 1 : 0)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$5
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.typeOf(String.class);
                        }
                    }));
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    m13470constructorimpl5 = Result.m13470constructorimpl(ResultKt.createFailure(th5));
                }
                Throwable m13473exceptionOrNullimpl5 = Result.m13473exceptionOrNullimpl(m13470constructorimpl5);
                if (m13473exceptionOrNullimpl5 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl5);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl5)) {
                    m13470constructorimpl5 = null;
                }
                TypeDescriptor typeDescriptor5 = (TypeDescriptor) m13470constructorimpl5;
                if (typeDescriptor5 == null) {
                    typeDescriptor5 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                }
                anyType5 = new AnyType(typeDescriptor5, converters3);
                r16 = 0;
            }
            anyTypeArr3[r16] = anyType5;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("cancelScheduledNotificationAsync", anyTypeArr3, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    NotificationScheduler.this.cancelScheduledNotificationAsync((String) objArr[0], promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder4.getAsyncFunctions().put("cancelScheduledNotificationAsync", asyncFunctionWithPromiseComponent3);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("cancelAllScheduledNotificationsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        NotificationScheduler.this.cancelAllScheduledNotificationsAsync(promise);
                    }
                });
            } else {
                TypeConverterProvider converters4 = moduleDefinitionBuilder5.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType6 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType6 == null) {
                    try {
                        Result.Companion companion11 = Result.INSTANCE;
                        m13470constructorimpl6 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$5
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th6) {
                        Result.Companion companion12 = Result.INSTANCE;
                        m13470constructorimpl6 = Result.m13470constructorimpl(ResultKt.createFailure(th6));
                    }
                    Throwable m13473exceptionOrNullimpl6 = Result.m13473exceptionOrNullimpl(m13470constructorimpl6);
                    if (m13473exceptionOrNullimpl6 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl6);
                    }
                    if (Result.m13476isFailureimpl(m13470constructorimpl6)) {
                        m13470constructorimpl6 = null;
                    }
                    TypeDescriptor typeDescriptor6 = (TypeDescriptor) m13470constructorimpl6;
                    if (typeDescriptor6 == null) {
                        typeDescriptor6 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType6 = new AnyType(typeDescriptor6, converters4);
                }
                anyTypeArr4[0] = anyType6;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        NotificationScheduler.this.cancelAllScheduledNotificationsAsync((Promise) objArr[0]);
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent2 = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr4, function12) : new UntypedAsyncFunctionComponent("cancelAllScheduledNotificationsAsync", anyTypeArr4, function12);
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("cancelAllScheduledNotificationsAsync", intAsyncFunctionComponent2);
            ModuleDefinitionBuilder moduleDefinitionBuilder6 = moduleDefinitionBuilder;
            TypeConverterProvider converters5 = moduleDefinitionBuilder6.getConverters();
            AnyType[] anyTypeArr5 = new AnyType[1];
            AnyType anyType7 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArguments.class), true));
            if (anyType7 == null) {
                try {
                    Result.Companion companion13 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.core.arguments.ReadableArguments", Reflection.getOrCreateKotlinClass(ReadableArguments.class), true)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$7
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(ReadableArguments.class);
                        }
                    }));
                } catch (Throwable th7) {
                    Result.Companion companion14 = Result.INSTANCE;
                    m13470constructorimpl7 = Result.m13470constructorimpl(ResultKt.createFailure(th7));
                }
                Throwable m13473exceptionOrNullimpl7 = Result.m13473exceptionOrNullimpl(m13470constructorimpl7);
                if (m13473exceptionOrNullimpl7 != null) {
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadableArguments.class.getName(), m13473exceptionOrNullimpl7);
                }
                TypeDescriptor typeDescriptor7 = (TypeDescriptor) (Result.m13476isFailureimpl(m13470constructorimpl7) ? null : m13470constructorimpl7);
                if (typeDescriptor7 == null) {
                    typeDescriptor7 = TypeDescriptorKt.toTypeDescriptor(Reflection.nullableTypeOf(ReadableArguments.class));
                }
                anyType7 = new AnyType(typeDescriptor7, converters5);
            }
            anyTypeArr5[0] = anyType7;
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent5 = new AsyncFunctionWithPromiseComponent("getNextTriggerDateAsync", anyTypeArr5, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$definition$lambda$4$$inlined$AsyncFunctionWithPromise$8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    try {
                        NotificationTrigger triggerFromParams = NotificationScheduler.this.triggerFromParams((ReadableArguments) objArr[0]);
                        if (triggerFromParams instanceof SchedulableNotificationTrigger) {
                            if (((SchedulableNotificationTrigger) triggerFromParams).nextTriggerDate() == null) {
                                promise.resolve((Object) null);
                                return;
                            } else {
                                promise.resolve(r5.getTime());
                                return;
                            }
                        }
                        String name = triggerFromParams == null ? AbstractJsonLexerKt.NULL : triggerFromParams.getClass().getName();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("It is not possible to get next trigger date for triggers other than calendar-based. Provided trigger resulted in %s trigger.", Arrays.copyOf(new Object[]{name}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        promise.reject("ERR_NOTIFICATIONS_INVALID_CALENDAR_TRIGGER", format, null);
                    } catch (InvalidArgumentException e) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_GET_NEXT_TRIGGER_DATE", "Failed to get next trigger date for the trigger. " + e.getMessage(), e);
                    } catch (NullPointerException e2) {
                        promise.reject("ERR_NOTIFICATIONS_FAILED_TO_GET_NEXT_TRIGGER_DATE", "Failed to get next trigger date for the trigger. Encountered unexpected null value. " + e2.getMessage(), e2);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder6.getAsyncFunctions().put("getNextTriggerDateAsync", asyncFunctionWithPromiseComponent5);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent6 = asyncFunctionWithPromiseComponent5;
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    public void cancelScheduledNotificationAsync(String identifier, final Promise promise) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.removeScheduledNotification(getSchedulingContext(), identifier, createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit cancelScheduledNotificationAsync$lambda$5;
                cancelScheduledNotificationAsync$lambda$5 = NotificationScheduler.cancelScheduledNotificationAsync$lambda$5(Promise.this, ((Integer) obj).intValue(), (Bundle) obj2);
                return cancelScheduledNotificationAsync$lambda$5;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelScheduledNotificationAsync$lambda$5(Promise promise, int i, Bundle bundle) {
        if (i == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            promise.reject("ERR_NOTIFICATIONS_FAILED_TO_CANCEL", "Failed to cancel notification.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return Unit.INSTANCE;
    }

    public void cancelAllScheduledNotificationsAsync(final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.removeAllScheduledNotifications(getSchedulingContext(), createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.scheduling.NotificationScheduler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit cancelAllScheduledNotificationsAsync$lambda$6;
                cancelAllScheduledNotificationsAsync$lambda$6 = NotificationScheduler.cancelAllScheduledNotificationsAsync$lambda$6(Promise.this, ((Integer) obj).intValue(), (Bundle) obj2);
                return cancelAllScheduledNotificationsAsync$lambda$6;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelAllScheduledNotificationsAsync$lambda$6(Promise promise, int i, Bundle bundle) {
        if (i == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            promise.reject("ERR_NOTIFICATIONS_FAILED_TO_CANCEL", "Failed to cancel all notifications.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final NotificationTrigger triggerFromParams(ReadableArguments params) throws InvalidArgumentException {
        Number number;
        if (params == null) {
            return null;
        }
        String string = params.getString("channelId", null);
        String string2 = params.getString("type");
        if (string2 != null) {
            switch (string2.hashCode()) {
                case -791707519:
                    if (string2.equals("weekly")) {
                        Object obj = params.get("weekday");
                        Number number2 = obj instanceof Number ? (Number) obj : null;
                        Object obj2 = params.get(MetricsUnit.Duration.HOUR);
                        Number number3 = obj2 instanceof Number ? (Number) obj2 : null;
                        Object obj3 = params.get(MetricsUnit.Duration.MINUTE);
                        number = obj3 instanceof Number ? (Number) obj3 : null;
                        if (number2 == null || number3 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for weekly trigger.");
                        }
                        return new WeeklyTrigger(string, number2.intValue(), number3.intValue(), number.intValue());
                    }
                    break;
                case -734561654:
                    if (string2.equals("yearly")) {
                        Object obj4 = params.get(MetricsUnit.Duration.DAY);
                        Number number4 = obj4 instanceof Number ? (Number) obj4 : null;
                        Object obj5 = params.get("month");
                        Number number5 = obj5 instanceof Number ? (Number) obj5 : null;
                        Object obj6 = params.get(MetricsUnit.Duration.HOUR);
                        Number number6 = obj6 instanceof Number ? (Number) obj6 : null;
                        Object obj7 = params.get(MetricsUnit.Duration.MINUTE);
                        number = obj7 instanceof Number ? (Number) obj7 : null;
                        if (number4 == null || number5 == null || number6 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for yearly trigger.");
                        }
                        return new YearlyTrigger(string, number4.intValue(), number5.intValue(), number6.intValue(), number.intValue());
                    }
                    break;
                case 3076014:
                    if (string2.equals("date")) {
                        Object obj8 = params.get("timestamp");
                        number = obj8 instanceof Number ? (Number) obj8 : null;
                        if (number != null) {
                            return new DateTrigger(string, number.longValue());
                        }
                        throw new InvalidArgumentException("Invalid value provided as date of trigger.");
                    }
                    break;
                case 95346201:
                    if (string2.equals("daily")) {
                        Object obj9 = params.get(MetricsUnit.Duration.HOUR);
                        Number number7 = obj9 instanceof Number ? (Number) obj9 : null;
                        Object obj10 = params.get(MetricsUnit.Duration.MINUTE);
                        number = obj10 instanceof Number ? (Number) obj10 : null;
                        if (number7 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for daily trigger.");
                        }
                        return new DailyTrigger(string, number7.intValue(), number.intValue());
                    }
                    break;
                case 738950403:
                    if (string2.equals(AppsFlyerProperties.CHANNEL)) {
                        return new ChannelAwareTrigger(string);
                    }
                    break;
                case 913014450:
                    if (string2.equals("timeInterval")) {
                        Object obj11 = params.get("seconds");
                        number = obj11 instanceof Number ? (Number) obj11 : null;
                        if (number != null) {
                            return new TimeIntervalTrigger(string, number.longValue(), params.getBoolean("repeats"), null, 8, null);
                        }
                        throw new InvalidArgumentException("Invalid value provided as interval of trigger.");
                    }
                    break;
                case 1236635661:
                    if (string2.equals("monthly")) {
                        Object obj12 = params.get(MetricsUnit.Duration.DAY);
                        Number number8 = obj12 instanceof Number ? (Number) obj12 : null;
                        Object obj13 = params.get(MetricsUnit.Duration.HOUR);
                        Number number9 = obj13 instanceof Number ? (Number) obj13 : null;
                        Object obj14 = params.get(MetricsUnit.Duration.MINUTE);
                        number = obj14 instanceof Number ? (Number) obj14 : null;
                        if (number8 == null || number9 == null || number == null) {
                            throw new InvalidArgumentException("Invalid value(s) provided for yearly trigger.");
                        }
                        return new MonthlyTrigger(string, number8.intValue(), number9.intValue(), number.intValue());
                    }
                    break;
            }
        }
        throw new InvalidArgumentException("Trigger of type: " + string2 + " is not supported on Android.");
    }

    protected NotificationRequest createNotificationRequest(String identifier, NotificationContent content, NotificationTrigger notificationTrigger) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(content, "content");
        return new NotificationRequest(identifier, content, notificationTrigger);
    }

    protected List<Bundle> serializeScheduledNotificationRequests(Collection<? extends NotificationRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Collection<? extends NotificationRequest> collection = requests;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(NotificationSerializer.toBundle((NotificationRequest) it.next()));
        }
        return arrayList;
    }
}
