package io.intercom.android.sdk.m5.notification;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatFullNotification.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ChatFullNotificationKt {
    public static final ComposableSingletons$ChatFullNotificationKt INSTANCE = new ComposableSingletons$ChatFullNotificationKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f300lambda1 = ComposableLambdaKt.composableLambdaInstance(424986995, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            AppConfig appConfig;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Conversation conversation = new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There! This is a longer message that should wrap to multiple lines in the chat full notification. We want to make sure it displays correctly.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null);
                appConfig = ChatFullNotificationKt.previewAppConfig;
                ChatFullNotificationKt.ChatFullNotification(conversation, appConfig, null, composer, 72, 4);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f301lambda2 = ComposableLambdaKt.composableLambdaInstance(-2029839298, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            AppConfig appConfig;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Conversation conversation = new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Alex").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Quick question about your recent order.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null);
                appConfig = ChatFullNotificationKt.previewAppConfig;
                ChatFullNotificationKt.ChatFullNotification(conversation, appConfig, null, composer, 72, 4);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f302lambda3 = ComposableLambdaKt.composableLambdaInstance(-1139271226, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            AppConfig appConfig;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Conversation conversation = new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Support Bot").withIsBot(true).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("I'm here to help! Let me know what you need assistance with today.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null);
                appConfig = ChatFullNotificationKt.previewAppConfig;
                ChatFullNotificationKt.ChatFullNotification(conversation, appConfig, null, composer, 72, 4);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f303lambda4 = ComposableLambdaKt.composableLambdaInstance(-1302298593, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            AppConfig appConfig;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Conversation conversation = new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There! This is a ticket-related message.")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 1044467, null);
                appConfig = ChatFullNotificationKt.previewAppConfig;
                ChatFullNotificationKt.ChatFullNotification(conversation, appConfig, null, composer, 72, 4);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f304lambda5 = ComposableLambdaKt.composableLambdaInstance(19293965, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            AppConfig appConfig;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                List listOf = CollectionsKt.listOf(new Participant.Builder().withName("Maria").withIsBot(false).withType(Participant.ADMIN_TYPE));
                List listOf2 = CollectionsKt.listOf(new Part.Builder().withSummary("I've looked into your request and we'll be implementing this feature in our next release."));
                Ticket.Status status = new Ticket.Status("In Progress", "in_progress", null, false, 0L, 28, null);
                Participant.Builder withName = new Participant.Builder().withName("Maria Johnson");
                Intrinsics.checkNotNullExpressionValue(withName, "withName(...)");
                Conversation conversation = new Conversation(null, false, listOf, listOf2, null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, status, null, null, 0, withName, null, null, null, 0L, 31675, null), null, null, null, null, null, null, null, 1044467, null);
                appConfig = ChatFullNotificationKt.previewAppConfig;
                ChatFullNotificationKt.ChatFullNotification(conversation, appConfig, null, composer, 72, 4);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12592getLambda1$intercom_sdk_base_release() {
        return f300lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12593getLambda2$intercom_sdk_base_release() {
        return f301lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12594getLambda3$intercom_sdk_base_release() {
        return f302lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12595getLambda4$intercom_sdk_base_release() {
        return f303lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12596getLambda5$intercom_sdk_base_release() {
        return f304lambda5;
    }
}
