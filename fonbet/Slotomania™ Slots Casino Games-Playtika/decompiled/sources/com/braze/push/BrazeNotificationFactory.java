package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.ironsource.C2608q2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeNotificationFactory.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0012"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory;", "Lcom/braze/IBrazeNotificationFactory;", "()V", "createNotification", "Landroid/app/Notification;", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "context", "Landroid/content/Context;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "populateNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "configurationProvider", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BrazeNotificationFactory implements IBrazeNotificationFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    public static final BrazeNotificationFactory getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final NotificationCompat.Builder populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        return INSTANCE.populateNotificationBuilder(brazeNotificationPayload);
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        NotificationCompat.Builder populateNotificationBuilder = INSTANCE.populateNotificationBuilder(payload);
        if (populateNotificationBuilder != null) {
            return populateNotificationBuilder.build();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$createNotification$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification could not be built. Returning null as created notification";
            }
        }, 2, (Object) null);
        return null;
    }

    public final Notification createNotification(BrazeConfigurationProvider appConfigurationProvider, Context context, Bundle notificationExtras, Bundle brazeExtras) {
        return createNotification(new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider));
    }

    public final NotificationCompat.Builder populateNotificationBuilder(BrazeConfigurationProvider configurationProvider, Context context, Bundle notificationExtras, Bundle brazeExtras) {
        return INSTANCE.populateNotificationBuilder(new BrazeNotificationPayload(notificationExtras, brazeExtras, context, configurationProvider));
    }

    /* compiled from: BrazeNotificationFactory.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory$Companion;", "", "()V", C2608q2.p, "Lcom/braze/push/BrazeNotificationFactory;", "getInstance$annotations", Constants.GET_INSTANCE, "()Lcom/braze/push/BrazeNotificationFactory;", "internalInstance", "populateNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        @JvmStatic
        public final NotificationCompat.Builder populateNotificationBuilder(final BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Using BrazeNotificationPayload: ", BrazeNotificationPayload.this);
                }
            }, 2, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "BrazeNotificationPayload has null context. Not creating notification";
                    }
                }, 3, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
                    }
                }, 3, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload)).setAutoCancel(true);
            Intrinsics.checkNotNullExpressionValue(autoCancel, "Builder(context, notific…     .setAutoCancel(true)");
            BrazeNotificationUtils.setTitleIfPresent(autoCancel, payload);
            BrazeNotificationUtils.setContentIfPresent(autoCancel, payload);
            BrazeNotificationUtils.setTickerIfPresent(autoCancel, payload);
            BrazeNotificationUtils.setSetShowWhen(autoCancel, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, autoCancel, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, autoCancel, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, autoCancel);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationStyleFactory.INSTANCE.setStyleIfSupported(autoCancel, payload);
            BrazeNotificationActionUtils.addNotificationActions(autoCancel, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(autoCancel, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(autoCancel, payload);
            return autoCancel;
        }
    }
}
