package expo.modules.notifications.notifications.channels;

import androidx.tracing.Trace;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.notifications.notifications.channels.managers.AndroidXNotificationsChannelGroupManager;
import expo.modules.notifications.notifications.channels.managers.AndroidXNotificationsChannelManager;
import expo.modules.notifications.notifications.channels.serializers.ExpoNotificationsChannelGroupSerializer;
import expo.modules.notifications.notifications.channels.serializers.ExpoNotificationsChannelSerializer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: AndroidXNotificationsChannelsProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lexpo/modules/notifications/notifications/channels/AndroidXNotificationsChannelsProvider;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/notifications/notifications/channels/NotificationsChannelsProvider;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "groupManager", "Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;", "getGroupManager", "()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelGroupManager;", "groupManager$delegate", "Lkotlin/Lazy;", "channelManager", "Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;", "getChannelManager", "()Lexpo/modules/notifications/notifications/channels/managers/AndroidXNotificationsChannelManager;", "channelManager$delegate", "channelSerializer", "Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;", "getChannelSerializer", "()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelSerializer;", "channelSerializer$delegate", "groupSerializer", "Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;", "getGroupSerializer", "()Lexpo/modules/notifications/notifications/channels/serializers/ExpoNotificationsChannelGroupSerializer;", "groupSerializer$delegate", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidXNotificationsChannelsProvider extends Module implements NotificationsChannelsProvider {

    /* renamed from: groupManager$delegate, reason: from kotlin metadata */
    private final Lazy groupManager = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AndroidXNotificationsChannelGroupManager groupManager_delegate$lambda$1;
            groupManager_delegate$lambda$1 = AndroidXNotificationsChannelsProvider.groupManager_delegate$lambda$1(AndroidXNotificationsChannelsProvider.this);
            return groupManager_delegate$lambda$1;
        }
    });

    /* renamed from: channelManager$delegate, reason: from kotlin metadata */
    private final Lazy channelManager = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AndroidXNotificationsChannelManager channelManager_delegate$lambda$2;
            channelManager_delegate$lambda$2 = AndroidXNotificationsChannelsProvider.channelManager_delegate$lambda$2(AndroidXNotificationsChannelsProvider.this);
            return channelManager_delegate$lambda$2;
        }
    });

    /* renamed from: channelSerializer$delegate, reason: from kotlin metadata */
    private final Lazy channelSerializer = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ExpoNotificationsChannelSerializer channelSerializer_delegate$lambda$3;
            channelSerializer_delegate$lambda$3 = AndroidXNotificationsChannelsProvider.channelSerializer_delegate$lambda$3();
            return channelSerializer_delegate$lambda$3;
        }
    });

    /* renamed from: groupSerializer$delegate, reason: from kotlin metadata */
    private final Lazy groupSerializer = LazyKt.lazy(new Function0() { // from class: expo.modules.notifications.notifications.channels.AndroidXNotificationsChannelsProvider$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ExpoNotificationsChannelGroupSerializer groupSerializer_delegate$lambda$4;
            groupSerializer_delegate$lambda$4 = AndroidXNotificationsChannelsProvider.groupSerializer_delegate$lambda$4(AndroidXNotificationsChannelsProvider.this);
            return groupSerializer_delegate$lambda$4;
        }
    });

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AndroidXNotificationsChannelsProvider androidXNotificationsChannelsProvider = this;
        Trace.beginSection("[ExpoModulesCore] " + (androidXNotificationsChannelsProvider.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(androidXNotificationsChannelsProvider);
            moduleDefinitionBuilder.Name(AndroidXNotificationsChannelsProviderKt.NotificationsChannelsProviderName);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelsProvider
    public AndroidXNotificationsChannelGroupManager getGroupManager() {
        return (AndroidXNotificationsChannelGroupManager) this.groupManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidXNotificationsChannelGroupManager groupManager_delegate$lambda$1(AndroidXNotificationsChannelsProvider androidXNotificationsChannelsProvider) {
        return new AndroidXNotificationsChannelGroupManager(androidXNotificationsChannelsProvider.getAppContext().getReactContext());
    }

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelsProvider
    public AndroidXNotificationsChannelManager getChannelManager() {
        return (AndroidXNotificationsChannelManager) this.channelManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidXNotificationsChannelManager channelManager_delegate$lambda$2(AndroidXNotificationsChannelsProvider androidXNotificationsChannelsProvider) {
        return new AndroidXNotificationsChannelManager(androidXNotificationsChannelsProvider.getAppContext().getReactContext(), androidXNotificationsChannelsProvider.getGroupManager());
    }

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelsProvider
    public ExpoNotificationsChannelSerializer getChannelSerializer() {
        return (ExpoNotificationsChannelSerializer) this.channelSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExpoNotificationsChannelSerializer channelSerializer_delegate$lambda$3() {
        return new ExpoNotificationsChannelSerializer();
    }

    @Override // expo.modules.notifications.notifications.channels.NotificationsChannelsProvider
    public ExpoNotificationsChannelGroupSerializer getGroupSerializer() {
        return (ExpoNotificationsChannelGroupSerializer) this.groupSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExpoNotificationsChannelGroupSerializer groupSerializer_delegate$lambda$4(AndroidXNotificationsChannelsProvider androidXNotificationsChannelsProvider) {
        return new ExpoNotificationsChannelGroupSerializer(androidXNotificationsChannelsProvider.getChannelSerializer());
    }
}
