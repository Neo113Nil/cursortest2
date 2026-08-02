package expo.modules.notifications.notifications.presentation;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.tracing.Trace;
import com.facebook.react.bridge.BaseJavaModule;
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
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.service.NotificationsService;
import io.github.lukmccall.pika.TypeInfo;
import java.io.Serializable;
import java.util.ArrayList;
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
import kotlin.reflect.KType;

/* compiled from: ExpoNotificationPresentationModule.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\b\u001a\u00020\t2<\u0010\n\u001a8\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bj\u0002`\u0013H\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Lexpo/modules/notifications/notifications/presentation/ExpoNotificationPresentationModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "createResultReceiver", "Landroid/os/ResultReceiver;", "body", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "resultCode", "Landroid/os/Bundle;", "resultData", "", "Lexpo/modules/notifications/ResultReceiverBody;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "dismissNotificationAsync", "identifier", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/kotlin/Promise;", "dismissAllNotificationsAsync", "serializeNotifications", "", NotificationsService.NOTIFICATIONS_KEY, "", "Lexpo/modules/notifications/notifications/model/Notification;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ExpoNotificationPresentationModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    protected final ResultReceiver createResultReceiver(Function2<? super Integer, ? super Bundle, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return UtilsKt.createDefaultResultReceiver(null, body);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent2;
        ExpoNotificationPresentationModule expoNotificationPresentationModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (expoNotificationPresentationModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(expoNotificationPresentationModule);
            moduleDefinitionBuilder.Name("ExpoNotificationPresenter");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            Object obj = null;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getPresentedNotificationsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$1
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
                        NotificationsService.Companion companion = NotificationsService.INSTANCE;
                        context = ExpoNotificationPresentationModule.this.getContext();
                        companion.getAllPresented(context, ExpoNotificationPresentationModule.this.createResultReceiver(new ExpoNotificationPresentationModule$definition$1$1$1(promise, ExpoNotificationPresentationModule.this)));
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$2
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
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Context context;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        NotificationsService.Companion companion3 = NotificationsService.INSTANCE;
                        context = ExpoNotificationPresentationModule.this.getContext();
                        companion3.getAllPresented(context, ExpoNotificationPresentationModule.this.createResultReceiver(new ExpoNotificationPresentationModule$definition$1$1$1(promise, ExpoNotificationPresentationModule.this)));
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("getPresentedNotificationsAsync", anyTypeArr, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getPresentedNotificationsAsync", asyncFunctionWithPromiseComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[1];
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$1
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
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("dismissNotificationAsync", anyTypeArr2, new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunctionWithPromise$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Intrinsics.checkNotNullParameter(promise, "promise");
                    ExpoNotificationPresentationModule.this.dismissNotificationAsync((String) objArr[0], promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder3.getAsyncFunctions().put("dismissNotificationAsync", asyncFunctionWithPromiseComponent3);
            AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent4 = asyncFunctionWithPromiseComponent3;
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("dismissAllNotificationsAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        ExpoNotificationPresentationModule.this.dismissAllNotificationsAsync(promise);
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
                AnyType[] anyTypeArr3 = new AnyType[1];
                AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Promise.class), false));
                if (anyType3 == null) {
                    try {
                        Result.Companion companion5 = Result.INSTANCE;
                        m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.kotlin.Promise", Reflection.getOrCreateKotlinClass(Promise.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$5
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(Promise.class);
                            }
                        }));
                    } catch (Throwable th3) {
                        Result.Companion companion6 = Result.INSTANCE;
                        m13470constructorimpl3 = Result.m13470constructorimpl(ResultKt.createFailure(th3));
                    }
                    Throwable m13473exceptionOrNullimpl3 = Result.m13473exceptionOrNullimpl(m13470constructorimpl3);
                    if (m13473exceptionOrNullimpl3 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + Promise.class.getName(), m13473exceptionOrNullimpl3);
                    }
                    if (!Result.m13476isFailureimpl(m13470constructorimpl3)) {
                        obj = m13470constructorimpl3;
                    }
                    TypeDescriptor typeDescriptor3 = (TypeDescriptor) obj;
                    if (typeDescriptor3 == null) {
                        typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(Promise.class));
                    }
                    anyType3 = new AnyType(typeDescriptor3, converters3);
                }
                anyTypeArr3[0] = anyType3;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$definition$lambda$2$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        ExpoNotificationPresentationModule.this.dismissAllNotificationsAsync((Promise) objArr[0]);
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent2 = new StringAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr3, function12);
                                } else {
                                    untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr3, function12);
                                }
                            } else {
                                untypedAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr3, function12);
                            }
                        } else {
                            untypedAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr3, function12);
                        }
                    } else {
                        untypedAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr3, function12);
                    }
                } else {
                    untypedAsyncFunctionComponent2 = new IntAsyncFunctionComponent("dismissAllNotificationsAsync", anyTypeArr3, function12);
                }
                asyncFunctionWithPromiseComponent2 = untypedAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("dismissAllNotificationsAsync", asyncFunctionWithPromiseComponent2);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    protected void dismissNotificationAsync(String identifier, final Promise promise) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.dismiss(getContext(), new String[]{identifier}, createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit dismissNotificationAsync$lambda$3;
                dismissNotificationAsync$lambda$3 = ExpoNotificationPresentationModule.dismissNotificationAsync$lambda$3(Promise.this, ((Integer) obj).intValue(), (Bundle) obj2);
                return dismissNotificationAsync$lambda$3;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissNotificationAsync$lambda$3(Promise promise, int i, Bundle bundle) {
        if (i == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            promise.reject("ERR_NOTIFICATION_DISMISSAL_FAILED", "Notification could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return Unit.INSTANCE;
    }

    protected void dismissAllNotificationsAsync(final Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        NotificationsService.INSTANCE.dismissAll(getContext(), createResultReceiver(new Function2() { // from class: expo.modules.notifications.notifications.presentation.ExpoNotificationPresentationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit dismissAllNotificationsAsync$lambda$4;
                dismissAllNotificationsAsync$lambda$4 = ExpoNotificationPresentationModule.dismissAllNotificationsAsync$lambda$4(Promise.this, ((Integer) obj).intValue(), (Bundle) obj2);
                return dismissAllNotificationsAsync$lambda$4;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismissAllNotificationsAsync$lambda$4(Promise promise, int i, Bundle bundle) {
        if (i == 0) {
            promise.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            promise.reject("ERR_NOTIFICATIONS_DISMISSAL_FAILED", "Notifications could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return Unit.INSTANCE;
    }

    protected List<Bundle> serializeNotifications(Collection<? extends Notification> notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Collection<? extends Notification> collection = notifications;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(NotificationSerializer.toBundle((Notification) it.next()));
        }
        return arrayList;
    }
}
