package com.braze.push;

import T3.AbstractC1585a0;
import T3.AbstractC1588b0;
import W9.d;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.app.o;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001jB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\n*\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ5\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b)\u0010(J)\u0010,\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b5\u00103J)\u00106\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b6\u00107J)\u00108\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b8\u00107J\u001f\u0010:\u001a\u00020\"2\u0006\u00109\u001a\u00020*2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b<\u00103J\u001f\u0010=\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b?\u00103J\u001f\u0010@\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b@\u00103J\u001f\u0010A\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bB\u00103J\u001f\u0010C\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bC\u00103J\u001f\u0010D\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bE\u00103J\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020\"H\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bI\u0010\u0013J\u001f\u0010J\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bN\u00103J\u001f\u0010O\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bO\u0010\u0013J\u0017\u0010P\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bP\u0010/J\u001f\u0010Q\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bQ\u0010\u0013J#\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010S\u001a\u00020R2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ5\u0010]\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020[2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b]\u0010^J)\u0010]\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b]\u0010`R\u0014\u0010a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020c8G¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0015\u0010i\u001a\u0006\u0012\u0002\b\u00030 8G¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "", "deepLink", "", "useWebView", "", "routeUserWithNotificationOpenedIntent$android_sdk_ui_release", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Z)V", "routeUserWithNotificationOpenedIntent", "Landroid/content/Intent;", "intent", "handleNotificationOpened", "(Landroid/content/Context;Landroid/content/Intent;)V", "handleNotificationDeleted", "isBrazePushMessage", "(Landroid/content/Intent;)Z", "isNotificationMessage", "notificationExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", EventKeys.PAYLOAD, "sendPushMessageReceivedBroadcast", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "refreshFeatureFlagsIfAppropriate", "(Lcom/braze/models/push/BrazeNotificationPayload;)Z", "refreshBannersIfAppropriate", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "setNotificationDurationAlarm", "(Landroid/content/Context;Ljava/lang/Class;II)V", "getNotificationId", "(Lcom/braze/models/push/BrazeNotificationPayload;)I", "getNotificationPriority", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "wakeScreenIfAppropriate", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/os/Bundle;)Z", "prefetchBitmapsIfNewlyReceivedStoryPush", "(Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/o$e;", "notificationBuilder", "setTitleIfPresent", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "setContentIfPresent", "setTickerIfPresent", "setContentIntentIfPresent", "(Landroid/content/Context;Landroidx/core/app/o$e;Landroid/os/Bundle;)V", "setDeleteIntent", "appConfigurationProvider", "setSmallIcon", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroidx/core/app/o$e;)I", "setSetShowWhen", "setLargeIconIfPresentAndSupported", "(Landroidx/core/app/o$e;Lcom/braze/models/push/BrazeNotificationPayload;)Z", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setPriorityIfPresentAndSupported", "setAccentColorIfPresentAndSupported", "setCategoryIfPresentAndSupported", "setVisibilityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", "visibility", "isValidNotificationVisibility", "(I)Z", "handleCancelNotificationAction", "cancelNotification", "(Landroid/content/Context;I)V", "getOrCreateNotificationChannelId", "(Lcom/braze/models/push/BrazeNotificationPayload;)Ljava/lang/String;", "setNotificationBadgeNumberIfPresent", "handlePushStoryPageClicked", "handleContentCardsSerializedCardIfPresent", "sendNotificationOpenedBroadcast", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "getValidNotificationChannel", "(Landroid/app/NotificationManager;Landroid/os/Bundle;)Landroid/app/NotificationChannel;", "action", "Landroid/app/PendingIntent;", "getPushActionPendingIntent", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "broadcastType", "sendPushActionIntent", "(Landroid/content/Context;Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "pushIntent", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "activeNotificationFactory", "getNotificationReceiverClass", "()Ljava/lang/Class;", "notificationReceiverClass", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeNotificationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeNotificationUtils.kt\ncom/braze/push/BrazeNotificationUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1110:1\n1#2:1111\n1#2:1122\n1617#3,9:1112\n1869#3:1121\n1870#3:1123\n1626#3:1124\n1869#3,2:1125\n29#4:1127\n*S KotlinDebug\n*F\n+ 1 BrazeNotificationUtils.kt\ncom/braze/push/BrazeNotificationUtils\n*L\n445#1:1122\n445#1:1112,9\n445#1:1121\n445#1:1123\n445#1:1124\n446#1:1125,2\n616#1:1127\n*E\n"})
/* loaded from: classes.dex */
public final class BrazeNotificationUtils {

    @NotNull
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();

    @NotNull
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "<init>", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BrazeNotificationBroadcastType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BrazeNotificationBroadcastType[] $VALUES;

        @NotNull
        private final BrazePushEventType brazePushEventType;
        public static final BrazeNotificationBroadcastType OPENED = new BrazeNotificationBroadcastType("OPENED", 0, BrazePushEventType.NOTIFICATION_OPENED);
        public static final BrazeNotificationBroadcastType RECEIVED = new BrazeNotificationBroadcastType("RECEIVED", 1, BrazePushEventType.NOTIFICATION_RECEIVED);
        public static final BrazeNotificationBroadcastType DELETED = new BrazeNotificationBroadcastType("DELETED", 2, BrazePushEventType.NOTIFICATION_DELETED);

        private static final /* synthetic */ BrazeNotificationBroadcastType[] $values() {
            return new BrazeNotificationBroadcastType[]{OPENED, RECEIVED, DELETED};
        }

        static {
            BrazeNotificationBroadcastType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BrazeNotificationBroadcastType(String str, int i10, BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public static BrazeNotificationBroadcastType valueOf(String str) {
            return (BrazeNotificationBroadcastType) Enum.valueOf(BrazeNotificationBroadcastType.class, str);
        }

        public static BrazeNotificationBroadcastType[] values() {
            return (BrazeNotificationBroadcastType[]) $VALUES.clone();
        }

        @NotNull
        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BrazeNotificationUtils() {
    }

    @JvmStatic
    public static final void cancelNotification(@NotNull Context context, final int notificationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cancelNotification$lambda$0;
                    cancelNotification$lambda$0 = BrazeNotificationUtils.cancelNotification$lambda$0(notificationId);
                    return cancelNotification$lambda$0;
                }
            }, 7, (Object) null);
            Intent intent = new Intent("com.braze.action.CANCEL_NOTIFICATION").setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            intent.setPackage(context.getPackageName());
            intent.putExtra("nid", notificationId);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String cancelNotification$lambda$1;
                    cancelNotification$lambda$1 = BrazeNotificationUtils.cancelNotification$lambda$1();
                    return cancelNotification$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$0(int i10) {
        return "Cancelling notification action with id: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$1() {
        return "Exception occurred attempting to cancel notification.";
    }

    @JvmStatic
    @NotNull
    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.INSTANCE.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.INSTANCE.getInstance() : customBrazeNotificationFactory;
    }

    @JvmStatic
    public static final int getNotificationId(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String notificationId$lambda$0;
                    notificationId$lambda$0 = BrazeNotificationUtils.getNotificationId$lambda$0(customNotificationId);
                    return notificationId$lambda$0;
                }
            }, 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        String str = "";
        if (titleText != null) {
            str = ((Object) "") + titleText;
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            str = ((Object) str) + contentText;
        }
        final int hashCode = str != null ? str.hashCode() : 0;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String notificationId$lambda$3;
                notificationId$lambda$3 = BrazeNotificationUtils.getNotificationId$lambda$3(hashCode);
                return notificationId$lambda$3;
            }
        }, 7, (Object) null);
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$0(Integer num) {
        return "Using notification id provided in the message's extras bundle: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$3(int i10) {
        return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + i10;
    }

    @JvmStatic
    public static final int getNotificationPriority(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int intValue = notificationPriorityInt2.intValue();
        if (-2 <= intValue && intValue < 3) {
            return intValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.J0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String notificationPriority$lambda$0$0;
                notificationPriority$lambda$0$0 = BrazeNotificationUtils.getNotificationPriority$lambda$0$0(notificationPriorityInt);
                return notificationPriority$lambda$0$0;
            }
        }, 6, (Object) null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationPriority$lambda$0$0(Integer num) {
        return "Received invalid notification priority " + num;
    }

    @JvmStatic
    @NotNull
    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    @JvmStatic
    @NotNull
    public static final String getOrCreateNotificationChannelId(@NotNull BrazeNotificationPayload payload) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        final String notificationChannelId = payload.getNotificationChannelId();
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = payload.getContext();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            Object systemService = context != null ? context.getSystemService("notification") : null;
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationChannelId != null) {
                notificationChannel2 = notificationManager.getNotificationChannel(notificationChannelId);
                if (notificationChannel2 != null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.o1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String orCreateNotificationChannelId$lambda$0;
                            orCreateNotificationChannelId$lambda$0 = BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$0(notificationChannelId);
                            return orCreateNotificationChannelId$lambda$0;
                        }
                    }, 7, (Object) null);
                    return notificationChannelId;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String orCreateNotificationChannelId$lambda$1;
                        orCreateNotificationChannelId$lambda$1 = BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$1(notificationChannelId);
                        return orCreateNotificationChannelId$lambda$1;
                    }
                }, 7, (Object) null);
            }
            notificationChannel = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
            if (notificationChannel == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.q1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String orCreateNotificationChannelId$lambda$2;
                        orCreateNotificationChannelId$lambda$2 = BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$2();
                        return orCreateNotificationChannelId$lambda$2;
                    }
                }, 7, (Object) null);
                AbstractC1588b0.a();
                NotificationChannel a10 = AbstractC1585a0.a("com_appboy_default_notification_channel", configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
                a10.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
                notificationManager.createNotificationChannel(a10);
            }
        } else if (notificationChannelId != null) {
            return notificationChannelId;
        }
        return "com_appboy_default_notification_channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$0(String str) {
        return "Found notification channel in extras with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$1(String str) {
        return "Notification channel from extras is invalid. No channel found with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$2() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String action, Bundle notificationExtras) {
        Intent intent = new Intent(action).setClass(context, NotificationTrampolineActivity.class);
        Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
        if (notificationExtras != null) {
            intent.putExtras(notificationExtras);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @JvmStatic
    @TargetApi(26)
    @Nullable
    public static final NotificationChannel getValidNotificationChannel(@NotNull NotificationManager notificationManager, @Nullable Bundle notificationExtras) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        if (notificationExtras == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.F0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String validNotificationChannel$lambda$0;
                    validNotificationChannel$lambda$0 = BrazeNotificationUtils.getValidNotificationChannel$lambda$0();
                    return validNotificationChannel$lambda$0;
                }
            }, 7, (Object) null);
            return null;
        }
        final String string = notificationExtras.getString("ab_nc", null);
        if (string != null && !StringsKt.isBlank(string)) {
            notificationChannel2 = notificationManager.getNotificationChannel(string);
            if (notificationChannel2 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.G0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String validNotificationChannel$lambda$1;
                        validNotificationChannel$lambda$1 = BrazeNotificationUtils.getValidNotificationChannel$lambda$1(string);
                        return validNotificationChannel$lambda$1;
                    }
                }, 7, (Object) null);
                return notificationChannel2;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.H0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String validNotificationChannel$lambda$2;
                    validNotificationChannel$lambda$2 = BrazeNotificationUtils.getValidNotificationChannel$lambda$2(string);
                    return validNotificationChannel$lambda$2;
                }
            }, 7, (Object) null);
        }
        notificationChannel = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel != null) {
            return notificationChannel;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String validNotificationChannel$lambda$3;
                validNotificationChannel$lambda$3 = BrazeNotificationUtils.getValidNotificationChannel$lambda$3();
                return validNotificationChannel$lambda$3;
            }
        }, 7, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$0() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$1(String str) {
        return "Found notification channel in extras with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$2(String str) {
        return "Notification channel from extras is invalid, no channel found with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$3() {
        return "Braze default notification channel does not exist on device.";
    }

    @JvmStatic
    public static final void handleCancelNotificationAction(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            if (intent.hasExtra("nid")) {
                final int intExtra = intent.getIntExtra("nid", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleCancelNotificationAction$lambda$0;
                        handleCancelNotificationAction$lambda$0 = BrazeNotificationUtils.handleCancelNotificationAction$lambda$0(intExtra);
                        return handleCancelNotificationAction$lambda$0;
                    }
                }, 7, (Object) null);
                Object systemService = context.getSystemService("notification");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleCancelNotificationAction$lambda$1;
                    handleCancelNotificationAction$lambda$1 = BrazeNotificationUtils.handleCancelNotificationAction$lambda$1();
                    return handleCancelNotificationAction$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$0(int i10) {
        return "Cancelling notification action with id: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$1() {
        return "Exception occurred handling cancel notification intent.";
    }

    @JvmStatic
    public static final void handleContentCardsSerializedCardIfPresent(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        final String contentCardSyncData = payload.getContentCardSyncData();
        final String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleContentCardsSerializedCardIfPresent$lambda$0;
                handleContentCardsSerializedCardIfPresent$lambda$0 = BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent$lambda$0(contentCardSyncUserId, contentCardSyncData);
                return handleContentCardsSerializedCardIfPresent$lambda$0;
            }
        }, 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleContentCardsSerializedCardIfPresent$lambda$0(String str, String str2) {
        return "Push contains associated Content Cards card. User id: " + str + " Card data: " + str2;
    }

    @JvmStatic
    public static final void handleNotificationDeleted(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.s1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationDeleted$lambda$0;
                    handleNotificationDeleted$lambda$0 = BrazeNotificationUtils.handleNotificationDeleted$lambda$0();
                    return handleNotificationDeleted$lambda$0;
                }
            }, 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            } else {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationDeleted$lambda$1;
                    handleNotificationDeleted$lambda$1 = BrazeNotificationUtils.handleNotificationDeleted$lambda$1();
                    return handleNotificationDeleted$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$0() {
        return "Sending notification deleted broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$1() {
        return "Exception occurred attempting to handle notification delete intent.";
    }

    @JvmStatic
    public static final void handleNotificationOpened(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String handleNotificationOpened$lambda$0;
                        handleNotificationOpened$lambda$0 = BrazeNotificationUtils.handleNotificationOpened$lambda$0();
                        return handleNotificationOpened$lambda$0;
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleNotificationOpened$lambda$1;
                    handleNotificationOpened$lambda$1 = BrazeNotificationUtils.handleNotificationOpened$lambda$1();
                    return handleNotificationOpened$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$0() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$1() {
        return "Exception occurred attempting to handle notification opened intent.";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:3:0x000c, B:6:0x0036, B:7:0x0039, B:10:0x0041, B:13:0x0048, B:15:0x0057, B:18:0x005e, B:19:0x0067, B:21:0x0070, B:24:0x0074, B:26:0x0064), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: Exception -> 0x0088, TRY_LEAVE, TryCatch #0 {Exception -> 0x0088, blocks: (B:3:0x000c, B:6:0x0036, B:7:0x0039, B:10:0x0041, B:13:0x0048, B:15:0x0057, B:18:0x005e, B:19:0x0067, B:21:0x0070, B:24:0x0074, B:26:0x0064), top: B:2:0x000c }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void handlePushStoryPageClicked(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushStoryPageClicked(intent.getStringExtra("braze_campaign_id"), intent.getStringExtra("braze_story_page_id"));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra("nid", 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            final String stringExtra = intent.getStringExtra("braze_action_uri");
            if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
                intent.putExtra("uri", intent.getStringExtra("braze_action_uri"));
                String stringExtra2 = intent.getStringExtra("braze_action_use_webview");
                if (stringExtra2 != null && !StringsKt.isBlank(stringExtra2)) {
                    intent.putExtra("ab_use_webview", stringExtra2);
                }
                sendNotificationOpenedBroadcast(context, intent);
                if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: T3.n1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String handlePushStoryPageClicked$lambda$0;
                            handlePushStoryPageClicked$lambda$0 = BrazeNotificationUtils.handlePushStoryPageClicked$lambda$0(stringExtra);
                            return handlePushStoryPageClicked$lambda$0;
                        }
                    }, 6, (Object) null);
                    return;
                } else {
                    routeUserWithNotificationOpenedIntent(context, intent);
                    return;
                }
            }
            intent.removeExtra("uri");
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.r1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handlePushStoryPageClicked$lambda$1;
                    handlePushStoryPageClicked$lambda$1 = BrazeNotificationUtils.handlePushStoryPageClicked$lambda$1();
                    return handlePushStoryPageClicked$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$0(String str) {
        return "Not handling deep links automatically, skipping deep link handling for '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$1() {
        return "Caught exception while handling story click.";
    }

    @JvmStatic
    public static final boolean isBrazePushMessage(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return StringsKt.equals("true", extras.getString("_ab"), true);
    }

    @JvmStatic
    public static final boolean isNotificationMessage(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    @JvmStatic
    public static final boolean isValidNotificationVisibility(int visibility) {
        return visibility == -1 || visibility == 0 || visibility == 1;
    }

    @JvmStatic
    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.getIsPushStory() && payload.getIsNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (final String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.V0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0;
                        prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0 = BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0(str);
                        return prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0;
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0(String str) {
        return "Pre-fetching bitmap at URL: " + str;
    }

    @JvmStatic
    public static final boolean refreshBannersIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshBanners() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshBannersIfAppropriate$lambda$1;
                    refreshBannersIfAppropriate$lambda$1 = BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$1();
                    return refreshBannersIfAppropriate$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshBannersIfAppropriate$lambda$0;
                refreshBannersIfAppropriate$lambda$0 = BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$0();
                return refreshBannersIfAppropriate$lambda$0;
            }
        }, 7, (Object) null);
        BrazeInternal.refreshBanners(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$0() {
        return "Banners refresh key was true. Refreshing Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$1() {
        return "Banners refresh key not included in push payload or false. Not refreshing banners.";
    }

    @JvmStatic
    public static final boolean refreshFeatureFlagsIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String refreshFeatureFlagsIfAppropriate$lambda$1;
                    refreshFeatureFlagsIfAppropriate$lambda$1 = BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$1();
                    return refreshFeatureFlagsIfAppropriate$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String refreshFeatureFlagsIfAppropriate$lambda$0;
                refreshFeatureFlagsIfAppropriate$lambda$0 = BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$0();
                return refreshFeatureFlagsIfAppropriate$lambda$0;
            }
        }, 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$0() {
        return "Feature flag refresh key was true. Refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$1() {
        return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
    }

    @JvmStatic
    public static final void routeUserWithNotificationOpenedIntent(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.A0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String routeUserWithNotificationOpenedIntent$lambda$0;
                routeUserWithNotificationOpenedIntent$lambda$0 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$0();
                return routeUserWithNotificationOpenedIntent$lambda$0;
            }
        }, 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString("source", "Appboy");
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, bundleExtra, intent.getStringExtra("uri"), StringsKt.equals("true", intent.getStringExtra("ab_use_webview"), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$0() {
        return "routeUserWithNotificationOpenedIntent called with Intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$2(String str) {
        return "Delayed initialization is enabled. Deep link:" + str + " will not be handled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$3(Intent intent) {
        return "Push notification had no deep link. Opening main activity:" + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$4(String str, boolean z10) {
        return "Found a deep link:" + str + ". Use webview set to:" + z10;
    }

    @JvmStatic
    public static final void sendNotificationOpenedBroadcast(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendNotificationOpenedBroadcast$lambda$0;
                sendNotificationOpenedBroadcast$lambda$0 = BrazeNotificationUtils.sendNotificationOpenedBroadcast$lambda$0();
                return sendNotificationOpenedBroadcast$lambda$0;
            }
        }, 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        } else {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendNotificationOpenedBroadcast$lambda$0() {
        return "Sending notification opened broadcast";
    }

    private final void sendPushActionIntent(Context context, final BrazeNotificationBroadcastType broadcastType, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intent intent;
        int i10 = WhenMappings.$EnumSwitchMapping$0[broadcastType.ordinal()];
        if (i10 == 1) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_OPENED").setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intent);
        } else if (i10 == 2) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_RECEIVED").setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intent);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent("com.braze.push.intent.NOTIFICATION_DELETED").setPackage(context.getPackageName());
            Intrinsics.checkNotNull(intent);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: com.braze.push.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendPushActionIntent$lambda$0;
                sendPushActionIntent$lambda$0 = BrazeNotificationUtils.sendPushActionIntent$lambda$0(BrazeNotificationUtils.BrazeNotificationBroadcastType.this);
                return sendPushActionIntent$lambda$0;
            }
        }, 6, (Object) null);
        sendPushActionIntent(context, intent, notificationExtras);
        if (payload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, broadcastType.getBrazePushEventType(), payload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$0(BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$1(Intent intent) {
        return "Sending push action intent: " + intent;
    }

    @JvmStatic
    public static final void sendPushMessageReceivedBroadcast(@NotNull Context context, @NotNull Bundle notificationExtras, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendPushMessageReceivedBroadcast$lambda$0;
                sendPushMessageReceivedBroadcast$lambda$0 = BrazeNotificationUtils.sendPushMessageReceivedBroadcast$lambda$0();
                return sendPushMessageReceivedBroadcast$lambda$0;
            }
        }, 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushMessageReceivedBroadcast$lambda$0() {
        return "Sending push message received broadcast";
    }

    @JvmStatic
    public static final void setAccentColorIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.d1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String accentColorIfPresentAndSupported$lambda$0;
                    accentColorIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$0();
                    return accentColorIfPresentAndSupported$lambda$0;
                }
            }, 7, (Object) null);
            notificationBuilder.j(accentColor.intValue());
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.e1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String accentColorIfPresentAndSupported$lambda$1$0;
                    accentColorIfPresentAndSupported$lambda$1$0 = BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$1$0();
                    return accentColorIfPresentAndSupported$lambda$1$0;
                }
            }, 7, (Object) null);
            notificationBuilder.j(configurationProvider.getDefaultNotificationAccentColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$0() {
        return "Using accent color for notification from extras bundle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$1$0() {
        return "Using default accent color for notification";
    }

    @JvmStatic
    public static final void setCategoryIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.X0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String categoryIfPresentAndSupported$lambda$1;
                    categoryIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$1();
                    return categoryIfPresentAndSupported$lambda$1;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.W0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String categoryIfPresentAndSupported$lambda$0;
                    categoryIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$0();
                    return categoryIfPresentAndSupported$lambda$0;
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNull(notificationBuilder.h(notificationCategory));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$0() {
        return "Setting category for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$1() {
        return "Category not present in notification extras. Not setting category for notification.";
    }

    @JvmStatic
    public static final void setContentIfPresent(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.M0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String contentIfPresent$lambda$0;
                contentIfPresent$lambda$0 = BrazeNotificationUtils.setContentIfPresent$lambda$0();
                return contentIfPresent$lambda$0;
            }
        }, 7, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.l(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIfPresent$lambda$0() {
        return "Setting content for notification";
    }

    @JvmStatic
    public static final void setContentIntentIfPresent(@NotNull Context context, @NotNull o.e notificationBuilder, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            Intrinsics.checkNotNull(notificationBuilder.k(INSTANCE.getPushActionPendingIntent(context, "com.braze.action.BRAZE_PUSH_CLICKED", notificationExtras)));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.f1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String contentIntentIfPresent$lambda$0;
                    contentIntentIfPresent$lambda$0 = BrazeNotificationUtils.setContentIntentIfPresent$lambda$0();
                    return contentIntentIfPresent$lambda$0;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIntentIfPresent$lambda$0() {
        return "Error setting content intent.";
    }

    @JvmStatic
    public static final void setDeleteIntent(@NotNull Context context, @NotNull o.e notificationBuilder, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent("com.braze.action.BRAZE_PUSH_DELETED").setClass(context, getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "setClass(...)");
            if (notificationExtras != null) {
                intent.putExtras(notificationExtras);
            }
            Intrinsics.checkNotNull(notificationBuilder.q(PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824)));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.L0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteIntent$lambda$0;
                    deleteIntent$lambda$0 = BrazeNotificationUtils.setDeleteIntent$lambda$0();
                    return deleteIntent$lambda$0;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDeleteIntent$lambda$0() {
        return "Error setting delete intent.";
    }

    @JvmStatic
    public static final boolean setLargeIconIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeLogger brazeLogger;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largeIconIfPresentAndSupported$lambda$0;
                    largeIconIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$0();
                    return largeIconIfPresentAndSupported$lambda$0;
                }
            }, 7, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largeIconIfPresentAndSupported$lambda$1;
                    largeIconIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$1();
                    return largeIconIfPresentAndSupported$lambda$1;
                }
            }, 7, (Object) null);
            largeIcon = payload.getLargeIcon();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.l1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String largeIconIfPresentAndSupported$lambda$5;
                    largeIconIfPresentAndSupported$lambda$5 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$5();
                    return largeIconIfPresentAndSupported$lambda$5;
                }
            }, 4, (Object) null);
        }
        if (largeIcon != null) {
            notificationBuilder.u(Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String largeIconIfPresentAndSupported$lambda$3;
                largeIconIfPresentAndSupported$lambda$3 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$3();
                return largeIconIfPresentAndSupported$lambda$3;
            }
        }, 7, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId != 0) {
            notificationBuilder.u(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String largeIconIfPresentAndSupported$lambda$4;
                largeIconIfPresentAndSupported$lambda$4 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$4();
                return largeIconIfPresentAndSupported$lambda$4;
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String largeIconIfPresentAndSupported$lambda$6;
                largeIconIfPresentAndSupported$lambda$6 = BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$6();
                return largeIconIfPresentAndSupported$lambda$6;
            }
        }, 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$0() {
        return "Large icon not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$1() {
        return "Setting large icon for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$3() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$4() {
        return "Large icon resource id not present for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$5() {
        return "Error setting large notification icon";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$6() {
        return "Large icon not set for notification";
    }

    @JvmStatic
    public static final void setNotificationBadgeNumberIfPresent(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Build.VERSION.SDK_INT < 26) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.S0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String notificationBadgeNumberIfPresent$lambda$0;
                    notificationBadgeNumberIfPresent$lambda$0 = BrazeNotificationUtils.setNotificationBadgeNumberIfPresent$lambda$0();
                    return notificationBadgeNumberIfPresent$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.x(notificationBadgeNumber.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationBadgeNumberIfPresent$lambda$0() {
        return "Notification badge number not supported on this android version. Not setting badge number for notification.";
    }

    @JvmStatic
    public static final void setNotificationDurationAlarm(@NotNull Context context, @Nullable Class<?> thisClass, int notificationId, final int durationInMillis) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, thisClass);
        intent.setAction("com.braze.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (durationInMillis >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String notificationDurationAlarm$lambda$0;
                    notificationDurationAlarm$lambda$0 = BrazeNotificationUtils.setNotificationDurationAlarm$lambda$0(durationInMillis);
                    return notificationDurationAlarm$lambda$0;
                }
            }, 7, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + durationInMillis, broadcast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationDurationAlarm$lambda$0(int i10) {
        return "Setting Notification duration alarm for " + i10 + " ms";
    }

    @JvmStatic
    public static final void setPriorityIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.U0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String priorityIfPresentAndSupported$lambda$0;
                priorityIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setPriorityIfPresentAndSupported$lambda$0();
                return priorityIfPresentAndSupported$lambda$0;
            }
        }, 7, (Object) null);
        notificationBuilder.A(getNotificationPriority(payload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPriorityIfPresentAndSupported$lambda$0() {
        return "Setting priority for notification";
    }

    @JvmStatic
    public static final void setPublicVersionIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle parseJsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (parseJsonObjectIntoBundle.isEmpty()) {
            return;
        }
        final BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(parseJsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        o.e eVar = new o.e(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.T0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String publicVersionIfPresentAndSupported$lambda$0;
                publicVersionIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setPublicVersionIfPresentAndSupported$lambda$0(BrazeNotificationPayload.this);
                return publicVersionIfPresentAndSupported$lambda$0;
            }
        }, 7, (Object) null);
        setContentIfPresent(eVar, brazeNotificationPayload);
        setTitleIfPresent(eVar, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(eVar, brazeNotificationPayload);
        setSmallIcon(configurationProvider, eVar);
        setAccentColorIfPresentAndSupported(eVar, brazeNotificationPayload);
        notificationBuilder.B(eVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPublicVersionIfPresentAndSupported$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
        return "Setting public version of notification with payload: " + brazeNotificationPayload;
    }

    @JvmStatic
    public static final void setSetShowWhen(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.P0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String setShowWhen$lambda$0;
                    setShowWhen$lambda$0 = BrazeNotificationUtils.setSetShowWhen$lambda$0();
                    return setShowWhen$lambda$0;
                }
            }, 7, (Object) null);
            notificationBuilder.D(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSetShowWhen$lambda$0() {
        return "Set show when not supported in story push.";
    }

    @JvmStatic
    public static final int setSmallIcon(@NotNull BrazeConfigurationProvider appConfigurationProvider, @NotNull o.e notificationBuilder) {
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.N0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String smallIcon$lambda$0;
                    smallIcon$lambda$0 = BrazeNotificationUtils.setSmallIcon$lambda$0();
                    return smallIcon$lambda$0;
                }
            }, 7, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.O0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String smallIcon$lambda$1;
                    smallIcon$lambda$1 = BrazeNotificationUtils.setSmallIcon$lambda$1();
                    return smallIcon$lambda$1;
                }
            }, 7, (Object) null);
        }
        notificationBuilder.E(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$0() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$1() {
        return "Setting small icon for notification via resource id";
    }

    @JvmStatic
    public static final void setSoundIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (Intrinsics.areEqual(notificationSound, d.f13160a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.Q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String soundIfPresentAndSupported$lambda$0;
                    soundIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$0();
                    return soundIfPresentAndSupported$lambda$0;
                }
            }, 7, (Object) null);
            notificationBuilder.p(1);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.R0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String soundIfPresentAndSupported$lambda$1;
                    soundIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$1();
                    return soundIfPresentAndSupported$lambda$1;
                }
            }, 7, (Object) null);
            notificationBuilder.F(Uri.parse(notificationSound));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$0() {
        return "Setting default sound for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$1() {
        return "Setting sound for notification via uri.";
    }

    @JvmStatic
    public static final void setSummaryTextIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String summaryTextIfPresentAndSupported$lambda$1;
                    summaryTextIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$1();
                    return summaryTextIfPresentAndSupported$lambda$1;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String summaryTextIfPresentAndSupported$lambda$0;
                    summaryTextIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$0();
                    return summaryTextIfPresentAndSupported$lambda$0;
                }
            }, 7, (Object) null);
            Intrinsics.checkNotNull(notificationBuilder.H(summaryText));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$0() {
        return "Setting summary text for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$1() {
        return "Summary text not present. Not setting summary text for notification.";
    }

    @JvmStatic
    public static final void setTickerIfPresent(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String tickerIfPresent$lambda$0;
                tickerIfPresent$lambda$0 = BrazeNotificationUtils.setTickerIfPresent$lambda$0();
                return tickerIfPresent$lambda$0;
            }
        }, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.I(titleText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTickerIfPresent$lambda$0() {
        return "Setting ticker for notification";
    }

    @JvmStatic
    public static final void setTitleIfPresent(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String titleIfPresent$lambda$0;
                titleIfPresent$lambda$0 = BrazeNotificationUtils.setTitleIfPresent$lambda$0();
                return titleIfPresent$lambda$0;
            }
        }, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.m(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTitleIfPresent$lambda$0() {
        return "Setting title for notification";
    }

    @JvmStatic
    public static final void setVisibilityIfPresentAndSupported(@NotNull o.e notificationBuilder, @NotNull BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        final Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: T3.Z0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String visibilityIfPresentAndSupported$lambda$1;
                        visibilityIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$1(notificationVisibility);
                        return visibilityIfPresentAndSupported$lambda$1;
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.Y0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String visibilityIfPresentAndSupported$lambda$0;
                        visibilityIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$0();
                        return visibilityIfPresentAndSupported$lambda$0;
                    }
                }, 7, (Object) null);
                Intrinsics.checkNotNull(notificationBuilder.M(notificationVisibility.intValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$0() {
        return "Setting visibility for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$1(Integer num) {
        return "Received invalid notification visibility " + num;
    }

    @JvmStatic
    public static final boolean wakeScreenIfAppropriate(@NotNull Context context, @NotNull BrazeConfigurationProvider configurationProvider, @Nullable Bundle notificationExtras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(notificationExtras, null, context, configurationProvider, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$0() {
        return "Not waking this TV UI mode device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$1() {
        return "Failed to check for TV status during screen wake. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$2() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$3(NotificationChannel notificationChannel) {
        int importance;
        importance = notificationChannel.getImportance();
        return "Not acquiring wake-lock for Android O+ notification with importance: " + importance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$4() {
        return "Waking screen for notification";
    }

    public final void routeUserWithNotificationOpenedIntent$android_sdk_ui_release(@NotNull Context context, @NotNull Bundle extras, @Nullable final String deepLink, final boolean useWebView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Braze.Companion companion = Braze.INSTANCE;
        if (companion.isDelayedInitializationEnabled() || deepLink == null || StringsKt.isBlank(deepLink)) {
            final Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
            context.startActivity(mainActivityIntent);
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.C0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String routeUserWithNotificationOpenedIntent$lambda$2;
                        routeUserWithNotificationOpenedIntent$lambda$2 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$2(deepLink);
                        return routeUserWithNotificationOpenedIntent$lambda$2;
                    }
                }, 7, (Object) null);
                return;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.D0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String routeUserWithNotificationOpenedIntent$lambda$3;
                        routeUserWithNotificationOpenedIntent$lambda$3 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$3(mainActivityIntent);
                        return routeUserWithNotificationOpenedIntent$lambda$3;
                    }
                }, 7, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String routeUserWithNotificationOpenedIntent$lambda$4;
                routeUserWithNotificationOpenedIntent$lambda$4 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$4(deepLink, useWebView);
                return routeUserWithNotificationOpenedIntent$lambda$4;
            }
        }, 7, (Object) null);
        extras.putString("uri", deepLink);
        extras.putBoolean("ab_use_webview", useWebView);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(deepLink, extras, useWebView, Channel.PUSH);
        if (createUriActionFromUrlString != null) {
            companion2.getInstance().gotoUri(context, createUriActionFromUrlString);
        }
    }

    @JvmStatic
    @SuppressLint({"WakelockTimeout"})
    public static final boolean wakeScreenIfAppropriate(@NotNull BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        int importance;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = payload.getNotificationExtras();
        if (!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("uimode");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wakeScreenIfAppropriate$lambda$0;
                        wakeScreenIfAppropriate$lambda$0 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$0();
                        return wakeScreenIfAppropriate$lambda$0;
                    }
                }, 7, (Object) null);
                return false;
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: T3.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String wakeScreenIfAppropriate$lambda$1;
                    wakeScreenIfAppropriate$lambda$1 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$1();
                    return wakeScreenIfAppropriate$lambda$1;
                }
            }, 4, (Object) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService2 = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            final NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
            if (validNotificationChannel != null) {
                importance = validNotificationChannel.getImportance();
                if (importance == 1) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.n0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String wakeScreenIfAppropriate$lambda$3;
                            wakeScreenIfAppropriate$lambda$3 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$3(validNotificationChannel);
                            return wakeScreenIfAppropriate$lambda$3;
                        }
                    }, 7, (Object) null);
                    return false;
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.m0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String wakeScreenIfAppropriate$lambda$2;
                        wakeScreenIfAppropriate$lambda$2 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$2();
                        return wakeScreenIfAppropriate$lambda$2;
                    }
                }, 7, (Object) null);
                return false;
            }
        } else if (getNotificationPriority(payload) == -2) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: T3.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String wakeScreenIfAppropriate$lambda$4;
                wakeScreenIfAppropriate$lambda$4 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$4();
                return wakeScreenIfAppropriate$lambda$4;
            }
        }, 7, (Object) null);
        Object systemService3 = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
        newWakeLock.acquire();
        newWakeLock.release();
        return true;
    }

    private final void sendPushActionIntent(Context context, final Intent pushIntent, Bundle notificationExtras) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: T3.K0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String sendPushActionIntent$lambda$1;
                sendPushActionIntent$lambda$1 = BrazeNotificationUtils.sendPushActionIntent$lambda$1(pushIntent);
                return sendPushActionIntent$lambda$1;
            }
        }, 6, (Object) null);
        if (notificationExtras != null) {
            pushIntent.putExtras(notificationExtras);
        }
        IntentUtils.addComponentAndSendBroadcast(context, pushIntent);
    }
}
