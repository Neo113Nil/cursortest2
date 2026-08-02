package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.o;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationFactory;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory;", "Lcom/braze/IBrazeNotificationFactory;", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "Landroid/app/Notification;", "createNotification", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroid/app/Notification;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazeNotificationFactory implements IBrazeNotificationFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory$Companion;", "", "<init>", "()V", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "Landroidx/core/app/o$e;", "populateNotificationBuilder", "(Lcom/braze/models/push/BrazeNotificationPayload;)Landroidx/core/app/o$e;", "Lcom/braze/push/BrazeNotificationFactory;", "getInstance", "()Lcom/braze/push/BrazeNotificationFactory;", "getInstance$annotations", "instance", "internalInstance", "Lcom/braze/push/BrazeNotificationFactory;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
            return "Using BrazeNotificationPayload: " + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$1() {
            return "BrazeNotificationPayload has null context. Not creating notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$2() {
            return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
        }

        @NotNull
        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        @JvmStatic
        @Nullable
        public final o.e populateNotificationBuilder(@NotNull final BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String populateNotificationBuilder$lambda$0;
                    populateNotificationBuilder$lambda$0 = BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$0(BrazeNotificationPayload.this);
                    return populateNotificationBuilder$lambda$0;
                }
            }, 6, (Object) null);
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populateNotificationBuilder$lambda$1;
                        populateNotificationBuilder$lambda$1 = BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$1();
                        return populateNotificationBuilder$lambda$1;
                    }
                }, 7, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String populateNotificationBuilder$lambda$2;
                        populateNotificationBuilder$lambda$2 = BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$2();
                        return populateNotificationBuilder$lambda$2;
                    }
                }, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(payload);
            o.e g10 = new o.e(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(payload)).g(true);
            Intrinsics.checkNotNullExpressionValue(g10, "setAutoCancel(...)");
            BrazeNotificationUtils.setTitleIfPresent(g10, payload);
            BrazeNotificationUtils.setContentIfPresent(g10, payload);
            BrazeNotificationUtils.setTickerIfPresent(g10, payload);
            BrazeNotificationUtils.setSetShowWhen(g10, payload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, g10, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, g10, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, g10);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(g10, payload);
            BrazeNotificationStyleFactory.INSTANCE.setStyleIfSupported(g10, payload);
            BrazeNotificationActionUtils.addNotificationActions(g10, payload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(g10, payload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(g10, payload);
            return g10;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createNotification$lambda$0() {
        return "Notification could not be built. Returning null as created notification";
    }

    @Override // com.braze.IBrazeNotificationFactory
    @Nullable
    public Notification createNotification(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        o.e populateNotificationBuilder = INSTANCE.populateNotificationBuilder(payload);
        if (populateNotificationBuilder != null) {
            return populateNotificationBuilder.d();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createNotification$lambda$0;
                createNotification$lambda$0 = BrazeNotificationFactory.createNotification$lambda$0();
                return createNotification$lambda$0;
            }
        }, 6, (Object) null);
        return null;
    }
}
