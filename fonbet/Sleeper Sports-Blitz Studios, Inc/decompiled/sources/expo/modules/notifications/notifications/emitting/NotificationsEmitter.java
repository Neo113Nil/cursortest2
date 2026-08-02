package expo.modules.notifications.notifications.emitting;

import android.os.Bundle;
import androidx.tracing.Trace;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.notifications.notifications.NotificationManager;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.notifications.debug.DebugLogging;
import expo.modules.notifications.notifications.interfaces.NotificationListener;
import expo.modules.notifications.notifications.model.Notification;
import expo.modules.notifications.notifications.model.NotificationResponse;
import expo.modules.notifications.service.NotificationsService;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: NotificationsEmitter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lexpo/modules/notifications/notifications/emitting/NotificationsEmitter;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/interfaces/NotificationListener;", "<init>", "()V", "lastNotificationResponseBundle", "Landroid/os/Bundle;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "onNotificationReceived", "", NotificationsService.NOTIFICATION_KEY, "Lexpo/modules/notifications/notifications/model/Notification;", "onNotificationResponseReceived", "", Response.TYPE, "Lexpo/modules/notifications/notifications/model/NotificationResponse;", "onNotificationResponseIntentReceived", "extras", "onNotificationsDropped", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class NotificationsEmitter extends Module implements NotificationListener {
    private Bundle lastNotificationResponseBundle;

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        NotificationsEmitter notificationsEmitter = this;
        Trace.beginSection("[ExpoModulesCore] " + (notificationsEmitter.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(notificationsEmitter);
            moduleDefinitionBuilder.Name("ExpoNotificationsEmitter");
            moduleDefinitionBuilder.Events("onDidReceiveNotification", "onNotificationsDeleted", "onDidReceiveNotificationResponse");
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_CREATE, new BasicEventListener(EventName.MODULE_CREATE, new Function0<Unit>() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$OnCreate$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NotificationManager.INSTANCE.addListener(NotificationsEmitter.this);
                }
            }));
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NotificationManager.INSTANCE.removeListener(NotificationsEmitter.this);
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Bundle.class));
            if (returnType == null) {
                returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Bundle.class));
                returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Bundle.class), returnType);
            }
            moduleDefinitionBuilder2.getSyncFunctions().put("getLastNotificationResponse", new SyncFunctionComponent("getLastNotificationResponse", anyTypeArr, returnType, new Function1<Object[], Object>() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$Function$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Bundle bundle;
                    Intrinsics.checkNotNullParameter(it, "it");
                    bundle = NotificationsEmitter.this.lastNotificationResponseBundle;
                    return bundle;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Object.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(Object.class));
                returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Object.class), returnType2);
            }
            moduleDefinitionBuilder3.getSyncFunctions().put("clearLastNotificationResponse", new SyncFunctionComponent("clearLastNotificationResponse", anyTypeArr2, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.notifications.notifications.emitting.NotificationsEmitter$definition$lambda$4$$inlined$FunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NotificationsEmitter.this.lastNotificationResponseBundle = null;
                    return null;
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationReceived(Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Bundle bundle = NotificationSerializer.toBundle(notification);
        Intrinsics.checkNotNull(bundle);
        DebugLogging.logBundle("NotificationsEmitter.onNotificationReceived", bundle);
        sendEvent("onDidReceiveNotification", bundle);
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public boolean onNotificationResponseReceived(NotificationResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Bundle bundle = NotificationSerializer.toBundle(response);
        Intrinsics.checkNotNull(bundle);
        DebugLogging.logBundle("NotificationsEmitter.onNotificationResponseReceived", bundle);
        this.lastNotificationResponseBundle = bundle;
        sendEvent("onDidReceiveNotificationResponse", bundle);
        return true;
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationResponseIntentReceived(Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        Bundle responseBundleFromExtras = NotificationSerializer.toResponseBundleFromExtras(extras);
        Intrinsics.checkNotNullExpressionValue(responseBundleFromExtras, "toResponseBundleFromExtras(...)");
        DebugLogging.logBundle("NotificationsEmitter.onNotificationResponseIntentReceived", responseBundleFromExtras);
        this.lastNotificationResponseBundle = responseBundleFromExtras;
        sendEvent("onDidReceiveNotificationResponse", responseBundleFromExtras);
    }

    @Override // expo.modules.notifications.notifications.interfaces.NotificationListener
    public void onNotificationsDropped() {
        sendEvent("onNotificationsDeleted", Bundle.EMPTY);
    }
}
