package expo.modules.notifications.notifications.channels;

import android.app.NotificationChannel;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0;
import androidx.tracing.Trace;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.logging.Logger;
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
import expo.modules.notifications.notifications.channels.managers.NotificationsChannelManager;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.notifications.enums.NotificationImportance;
import io.github.lukmccall.pika.TypeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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

/* compiled from: NotificationChannelManagerModule.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0003R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lexpo/modules/notifications/notifications/channels/NotificationChannelManagerModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/channels/NotificationsChannelProviderAccessor;", "<init>", "()V", "channelManager", "Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;", "getChannelManager", "()Lexpo/modules/notifications/notifications/channels/managers/NotificationsChannelManager;", "channelManager$delegate", "Lkotlin/Lazy;", "channelSerializer", "Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;", "getChannelSerializer", "()Lexpo/modules/notifications/notifications/channels/serializers/NotificationsChannelSerializer;", "channelSerializer$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getNameFromOptions", "", "channelOptions", "Lexpo/modules/core/arguments/ReadableArguments;", "getImportanceFromOptions", "", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class NotificationChannelManagerModule extends Module implements NotificationsChannelProviderAccessor {

    /* renamed from: channelManager$delegate, reason: from kotlin metadata */
    private final Lazy channelManager = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            NotificationsChannelManager channelManager_delegate$lambda$0;
            channelManager_delegate$lambda$0 = NotificationChannelManagerModule.channelManager_delegate$lambda$0(NotificationChannelManagerModule.this);
            return channelManager_delegate$lambda$0;
        }
    });

    /* renamed from: channelSerializer$delegate, reason: from kotlin metadata */
    private final Lazy channelSerializer = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            NotificationsChannelSerializer channelSerializer_delegate$lambda$1;
            channelSerializer_delegate$lambda$1 = NotificationChannelManagerModule.channelSerializer_delegate$lambda$1(NotificationChannelManagerModule.this);
            return channelSerializer_delegate$lambda$1;
        }
    });

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelProviderAccessor
    public NotificationsChannelsProvider getChannelProvider(ModuleRegistry moduleRegistry) {
        return NotificationsChannelProviderAccessor.DefaultImpls.getChannelProvider(this, moduleRegistry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelManager getChannelManager() {
        return (NotificationsChannelManager) this.channelManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelManager channelManager_delegate$lambda$0(NotificationChannelManagerModule notificationChannelManagerModule) {
        return notificationChannelManagerModule.getChannelProvider(notificationChannelManagerModule.getAppContext().getRegistry()).getChannelManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsChannelSerializer getChannelSerializer() {
        return (NotificationsChannelSerializer) this.channelSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationsChannelSerializer channelSerializer_delegate$lambda$1(NotificationChannelManagerModule notificationChannelManagerModule) {
        return notificationChannelManagerModule.getChannelProvider(notificationChannelManagerModule.getAppContext().getRegistry()).getChannelSerializer();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Object m13470constructorimpl;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        Object m13470constructorimpl2;
        Object m13470constructorimpl3;
        Object m13470constructorimpl4;
        UntypedAsyncFunctionComponent intAsyncFunctionComponent;
        NotificationChannelManagerModule notificationChannelManagerModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (notificationChannelManagerModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(notificationChannelManagerModule);
            moduleDefinitionBuilder.Name("ExpoNotificationChannelManager");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr = new AnyType[0];
            Function1<Object[], List<? extends Bundle>> function1 = new Function1<Object[], List<? extends Bundle>>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$1
                @Override // kotlin.jvm.functions.Function1
                public final List<? extends Bundle> invoke(Object[] it) {
                    NotificationsChannelManager channelManager;
                    NotificationsChannelSerializer channelSerializer;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (Build.VERSION.SDK_INT >= 26) {
                        channelManager = NotificationChannelManagerModule.this.getChannelManager();
                        List<NotificationChannel> notificationChannels = channelManager.getNotificationChannels();
                        Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
                        List<NotificationChannel> list = notificationChannels;
                        channelSerializer = NotificationChannelManagerModule.this.getChannelSerializer();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(channelSerializer.toBundle(ColorKt$$ExternalSyntheticApiModelOutline0.m(it2.next())));
                        }
                        return arrayList;
                    }
                    return CollectionsKt.emptyList();
                }
            };
            moduleDefinitionBuilder2.getAsyncFunctions().put("getNotificationChannelsAsync", Intrinsics.areEqual(List.class, Integer.TYPE) ? new IntAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : Intrinsics.areEqual(List.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : Intrinsics.areEqual(List.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : Intrinsics.areEqual(List.class, Float.TYPE) ? new FloatAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : Intrinsics.areEqual(List.class, String.class) ? new StringAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("getNotificationChannelsAsync", anyTypeArr, function1));
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            Object obj = null;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("getNotificationChannelAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        NotificationsChannelManager channelManager;
                        NotificationsChannelSerializer channelSerializer;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT >= 26) {
                            channelManager = NotificationChannelManagerModule.this.getChannelManager();
                            NotificationChannel notificationChannel = channelManager.getNotificationChannel(str);
                            if (notificationChannel != null) {
                                channelSerializer = NotificationChannelManagerModule.this.getChannelSerializer();
                                channelSerializer.toBundle(notificationChannel);
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
                TypeConverterProvider converters = moduleDefinitionBuilder3.getConverters();
                AnyType[] anyTypeArr2 = new AnyType[1];
                AnyType anyType = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType == null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m13470constructorimpl = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$3
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
                anyTypeArr2[0] = anyType;
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("getNotificationChannelAsync", anyTypeArr2, new Function1<Object[], Bundle>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$4
                    @Override // kotlin.jvm.functions.Function1
                    public final Bundle invoke(Object[] objArr) {
                        NotificationsChannelManager channelManager;
                        NotificationsChannelSerializer channelSerializer;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT >= 26) {
                            channelManager = NotificationChannelManagerModule.this.getChannelManager();
                            NotificationChannel notificationChannel = channelManager.getNotificationChannel(str);
                            if (notificationChannel != null) {
                                channelSerializer = NotificationChannelManagerModule.this.getChannelSerializer();
                                return channelSerializer.toBundle(notificationChannel);
                            }
                        }
                        return null;
                    }
                });
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("getNotificationChannelAsync", untypedAsyncFunctionComponent);
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            TypeConverterProvider converters2 = moduleDefinitionBuilder4.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[2];
            AnyType anyType2 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    m13470constructorimpl2 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$5
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
            anyTypeArr3[0] = anyType2;
            AnyType anyType3 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReadableArguments.class), false));
            if (anyType3 == null) {
                try {
                    Result.Companion companion5 = Result.INSTANCE;
                    m13470constructorimpl3 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("expo.modules.core.arguments.ReadableArguments", Reflection.getOrCreateKotlinClass(ReadableArguments.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$6
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
            anyTypeArr3[1] = anyType3;
            moduleDefinitionBuilder4.getAsyncFunctions().put("setNotificationChannelAsync", new UntypedAsyncFunctionComponent("setNotificationChannelAsync", anyTypeArr3, new Function1<Object[], Bundle>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$7
                @Override // kotlin.jvm.functions.Function1
                public final Bundle invoke(Object[] objArr) {
                    NotificationsChannelManager channelManager;
                    NotificationsChannelManager channelManager2;
                    CharSequence nameFromOptions;
                    int importanceFromOptions;
                    NotificationsChannelSerializer channelSerializer;
                    Logger jsLogger;
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    Object obj2 = objArr[0];
                    ReadableArguments readableArguments = (ReadableArguments) objArr[1];
                    String str = (String) obj2;
                    if (Build.VERSION.SDK_INT < 26) {
                        return null;
                    }
                    channelManager = NotificationChannelManagerModule.this.getChannelManager();
                    if (!channelManager.customSoundExists(readableArguments) && (jsLogger = NotificationChannelManagerModule.this.getAppContext().getJsLogger()) != null) {
                        Logger.error$default(jsLogger, "expo-notifications: Custom sound '" + readableArguments.getString("sound", null) + "' not found in native app. Make sure the sound file (e.g. 'custom_sound.wav') is included in the expo-notifications config plugin sounds array in app config.", null, 2, null);
                    }
                    channelManager2 = NotificationChannelManagerModule.this.getChannelManager();
                    nameFromOptions = NotificationChannelManagerModule.this.getNameFromOptions(readableArguments);
                    importanceFromOptions = NotificationChannelManagerModule.this.getImportanceFromOptions(readableArguments);
                    NotificationChannel createNotificationChannel = channelManager2.createNotificationChannel(str, nameFromOptions, importanceFromOptions, readableArguments);
                    channelSerializer = NotificationChannelManagerModule.this.getChannelSerializer();
                    Intrinsics.checkNotNull(createNotificationChannel);
                    return channelSerializer.toBundle(createNotificationChannel);
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(String.class, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("deleteNotificationChannelAsync", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        NotificationsChannelManager channelManager;
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                        String str = (String) promise;
                        if (Build.VERSION.SDK_INT >= 26) {
                            channelManager = NotificationChannelManagerModule.this.getChannelManager();
                            channelManager.deleteNotificationChannel(str);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder5.getConverters();
                AnyType[] anyTypeArr4 = new AnyType[1];
                AnyType anyType4 = AnyTypeCache.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
                if (anyType4 == null) {
                    try {
                        Result.Companion companion7 = Result.INSTANCE;
                        m13470constructorimpl4 = Result.m13470constructorimpl(new TypeDescriptor(TypeDescriptorOfKt.toRawTypeDescriptor(new TypeInfo.Simple("kotlin.String", Reflection.getOrCreateKotlinClass(String.class), false)), new Function0<KType>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$9
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
                anyTypeArr4[0] = anyType4;
                Function1<Object[], Unit> function12 = new Function1<Object[], Unit>() { // from class: expo.modules.notifications.notifications.channels.NotificationChannelManagerModule$definition$lambda$7$$inlined$AsyncFunction$10
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        NotificationsChannelManager channelManager;
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        String str = (String) objArr[0];
                        if (Build.VERSION.SDK_INT >= 26) {
                            channelManager = NotificationChannelManagerModule.this.getChannelManager();
                            channelManager.deleteNotificationChannel(str);
                        }
                        return Unit.INSTANCE;
                    }
                };
                intAsyncFunctionComponent = Intrinsics.areEqual(Unit.class, Integer.TYPE) ? new IntAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, Float.TYPE) ? new FloatAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr4, function12) : Intrinsics.areEqual(Unit.class, String.class) ? new StringAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr4, function12) : new UntypedAsyncFunctionComponent("deleteNotificationChannelAsync", anyTypeArr4, function12);
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("deleteNotificationChannelAsync", intAsyncFunctionComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence getNameFromOptions(ReadableArguments channelOptions) {
        String string = channelOptions.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImportanceFromOptions(ReadableArguments channelOptions) {
        return ((NotificationImportance) Objects.requireNonNull(NotificationImportance.fromEnumValue(channelOptions.getInt("importance", NotificationImportance.DEFAULT.getEnumValue())))).getNativeValue();
    }
}
