package expo.modules.notifications.notifications.channels;

import android.app.NotificationChannelGroup;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0;
import androidx.tracing.Trace;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.kotlin.ModuleRegistry;
import expo.modules.kotlin.Promise;
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
import expo.modules.notifications.notifications.channels.NotificationsChannelProviderAccessor;
import expo.modules.notifications.notifications.channels.managers.NotificationsChannelGroupManager;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelGroupSerializer;
import io.github.lukmccall.pika.TypeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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

/* compiled from: NotificationChannelGroupManagerModule.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lexpo/modules/notifications/notifications/channels/NotificationChannelGroupManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/channels/NotificationsChannelProviderAccessor;", "<init>", "()V", "groupManager", "Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;", "getGroupManager", "()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelGroupManager;", "groupManager$delegate", "Lkotlin/Lazy;", "groupSerializer", "Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelGroupSerializer;", "getGroupSerializer", "()Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelGroupSerializer;", "groupSerializer$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getNameFromOptions", "", "groupOptions", "Lexpo/modules/core/arguments/ReadableArguments;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class NotificationChannelGroupManagerModule extends Module implements NotificationsChannelProviderAccessor {

    /* renamed from: groupManager$delegate, reason: from kotlin metadata */
    private final Lazy groupManager = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            NotificationsChannelGroupManager groupManager_delegate$lambda$0;
            groupManager_delegate$lambda$0 = NotificationChannelGroupManagerModule.groupManager_delegate$lambda$0(NotificationChannelGroupManagerModule.this);
            return groupManager_delegate$lambda$0;
        }
    });

    /* renamed from: groupSerializer$delegate, reason: from kotlin metadata */
    private final Lazy groupSerializer = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            NotificationsChannelGroupSerializer groupSerializer_delegate$lambda$1;
            groupSerializer_delegate$lambda$1 = NotificationChannelGroupManagerModule.groupSerializer_delegate$lambda$1(NotificationChannelGroupManagerModule.this);
            return groupSerializer_delegate$lambda$1;
        }
    });

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelProviderAccessor
    public NotificationsChannelsProvider getChannelProvider(ModuleRegistry moduleRegistry) {
        return NotificationsChannelProviderAccessor.DefaultImpls.getChannelProvider(this, moduleRegistry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelGroupManager getGroupManager() {
        return (NotificationsChannelGroupManager) this.groupManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelGroupManager groupManager_delegate$lambda$0(NotificationChannelGroupManagerModule notificationChannelGroupManagerModule) {
        return notificationChannelGroupManagerModule.getChannelProvider(notificationChannelGroupManagerModule.getAppContext().getRegistry()).getGroupManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelGroupSerializer getGroupSerializer() {
        return (NotificationsChannelGroupSerializer) this.groupSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelGroupSerializer groupSerializer_delegate$lambda$1(NotificationChannelGroupManagerModule notificationChannelGroupManagerModule) {
        return notificationChannelGroupManagerModule.getChannelProvider(notificationChannelGroupManagerModule.getAppContext().getRegistry()).getGroupSerializer();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        AsyncFunctionWithPromiseComponent intAsyncFunctionComponent;
        NotificationChannelGroupManagerModule notificationChannelGroupManagerModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (notificationChannelGroupManagerModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(notificationChannelGroupManagerModule);
            moduleDefinitionBuilder.Name("ExpoNotificationChannelGroupManager");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            Object obj = null;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getNotificationChannelGroupAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        NotificationsChannelGroupManager groupManager;
                        NotificationsChannelGroupSerializer groupSerializer;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT >= 26) {
                            groupManager = NotificationChannelGroupManagerModule.this.getGroupManager();
                            NotificationChannelGroup notificationChannelGroup = groupManager.getNotificationChannelGroup(str);
                            if (notificationChannelGroup != null) {
                                groupSerializer = NotificationChannelGroupManagerModule.this.getGroupSerializer();
                                groupSerializer.toBundle(notificationChannelGroup);
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder2.getConverters();
                AnyType[] anyTypeArr = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$2
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
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getNotificationChannelGroupAsync", anyTypeArr, new Function1<Object[], Bundle>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Bundle invoke(Object[] objArr) {
                        NotificationsChannelGroupManager groupManager;
                        NotificationsChannelGroupSerializer groupSerializer;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT >= 26) {
                            groupManager = NotificationChannelGroupManagerModule.this.getGroupManager();
                            NotificationChannelGroup notificationChannelGroup = groupManager.getNotificationChannelGroup(str);
                            if (notificationChannelGroup != null) {
                                groupSerializer = NotificationChannelGroupManagerModule.this.getGroupSerializer();
                                return groupSerializer.toBundle(notificationChannelGroup);
                            }
                        }
                        return null;
                    }
                });
            }
            moduleDefinitionBuilder2.getAsyncFunctions().put("getNotificationChannelGroupAsync", untypedAsyncFunctionComponent);
            moduleDefinitionBuilder.getAsyncFunctions().put("getNotificationChannelGroupsAsync", new UntypedAsyncFunctionComponent("getNotificationChannelGroupsAsync", new AnyType[0], new Function1<Object[], List<? extends Bundle>>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$4
                @Override // kotlin.jvm.functions.Function1
                public final List<? extends Bundle> invoke(Object[] it) {
                    NotificationsChannelGroupManager groupManager;
                    NotificationsChannelGroupSerializer groupSerializer;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (Build.VERSION.SDK_INT < 26) {
                        return null;
                    }
                    groupManager = NotificationChannelGroupManagerModule.this.getGroupManager();
                    List<NotificationChannelGroup> notificationChannelGroups = groupManager.getNotificationChannelGroups();
                    Intrinsics.checkNotNullExpressionValue(notificationChannelGroups, "getNotificationChannelGroups(...)");
                    List<NotificationChannelGroup> list = notificationChannelGroups;
                    groupSerializer = NotificationChannelGroupManagerModule.this.getGroupSerializer();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(groupSerializer.toBundle(ColorKt$$ExternalSyntheticApiModelOutline0.m9068m(it2.next())));
                    }
                    return arrayList;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[2];
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$5
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
            if (anyType3 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.core.arguments.ReadableArguments", Reflection.getOrCreateKotlinClass(ReadableArguments.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$6
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
                    Log.e("ExpoModulesCore", "Failed to get type info for " + ReadableArguments.class.getName(), m13473exceptionOrNullimpl3);
                }
                if (Result.m13476isFailureimpl(m13470constructorimpl3)) {
                    m13470constructorimpl3 = null;
                }
                TypeDescriptor typeDescriptor3 = (TypeDescriptor) m13470constructorimpl3;
                if (typeDescriptor3 == null) {
                    typeDescriptor3 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(ReadableArguments.class));
                }
                anyType3 = new AnyType(typeDescriptor3, converters2);
            }
            anyTypeArr2[1] = anyType3;
            moduleDefinitionBuilder3.getAsyncFunctions().put("setNotificationChannelGroupAsync", new UntypedAsyncFunctionComponent("setNotificationChannelGroupAsync", anyTypeArr2, new Function1<Object[], Bundle>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$7
                @Override // kotlin.jvm.functions.Function1
                public final Bundle invoke(Object[] objArr) {
                    NotificationsChannelGroupManager groupManager;
                    String nameFromOptions;
                    NotificationsChannelGroupSerializer groupSerializer;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj2 = objArr[0];
                    ReadableArguments readableArguments = (ReadableArguments) objArr[1];
                    String str = (String) obj2;
                    if (Build.VERSION.SDK_INT < 26) {
                        return null;
                    }
                    groupManager = NotificationChannelGroupManagerModule.this.getGroupManager();
                    nameFromOptions = NotificationChannelGroupManagerModule.this.getNameFromOptions(readableArguments);
                    NotificationChannelGroup createNotificationChannelGroup = groupManager.createNotificationChannelGroup(str, nameFromOptions, readableArguments);
                    groupSerializer = NotificationChannelGroupManagerModule.this.getGroupSerializer();
                    Intrinsics.checkNotNull(createNotificationChannelGroup);
                    return groupSerializer.toBundle(createNotificationChannelGroup);
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("deleteNotificationChannelGroupAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        NotificationsChannelGroupManager groupManager;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT >= 26) {
                            groupManager = NotificationChannelGroupManagerModule.this.getGroupManager();
                            groupManager.deleteNotificationChannelGroup(str);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder4.getConverters();
                AnyType[] anyTypeArr3 = new AnyType[1];
                AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType4 == null) {
                    try {
                        Result.Companion companion7 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$9
                            @Override // kotlin.jvm.functions.Function0
                            public final KType invoke() {
                                return Reflection.typeOf(String.class);
                            }
                        }));
                    } catch (Throwable th4) {
                        Result.Companion companion8 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(ResultKt.createFailure(th4));
                    }
                    Throwable m13473exceptionOrNullimpl4 = Result.m13473exceptionOrNullimpl(m13470constructorimpl4);
                    if (m13473exceptionOrNullimpl4 != null) {
                        Log.e("ExpoModulesCore", "Failed to get type info for " + String.class.getName(), m13473exceptionOrNullimpl4);
                    }
                    if (!Result.m13476isFailureimpl(m13470constructorimpl4)) {
                        obj = m13470constructorimpl4;
                    }
                    TypeDescriptor typeDescriptor4 = (TypeDescriptor) obj;
                    if (typeDescriptor4 == null) {
                        typeDescriptor4 = TypeDescriptorKt.toTypeDescriptor(Reflection.typeOf(String.class));
                    }
                    anyType4 = new AnyType(typeDescriptor4, converters3);
                }
                anyTypeArr3[0] = anyType4;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelGroupManagerModule$definition$lambda$7$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        NotificationsChannelGroupManager groupManager;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT >= 26) {
                            groupManager = NotificationChannelGroupManagerModule.this.getGroupManager();
                            groupManager.deleteNotificationChannelGroup(str);
                        }
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr3, function1) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr3, function1) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr3, function1) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr3, function1) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr3, function1) : new UntypedAsyncFunctionComponent("deleteNotificationChannelGroupAsync", anyTypeArr3, function1);
            }
            moduleDefinitionBuilder4.getAsyncFunctions().put("deleteNotificationChannelGroupAsync", intAsyncFunctionComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getNameFromOptions(ReadableArguments groupOptions) {
        String string = groupOptions.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
