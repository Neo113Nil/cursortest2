package com.vk.voip.stereo.api.notifications.di.interactor;

import xsna.asp;
import xsna.zrp;

/* compiled from: VoipStereoSpeakerNotifications.kt */
/* loaded from: classes7.dex */
public interface VoipStereoSpeakerNotifications {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipStereoSpeakerNotifications.kt */
    public static final class NotificationAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NotificationAction[] $VALUES;
        public static final NotificationAction ACCEPT;
        public static final NotificationAction CHANGE_DECISION_AND_ACCEPT;
        public static final NotificationAction CHANGE_DECISION_AND_DECLINE;
        public static final NotificationAction DECLINE;

        static {
            NotificationAction notificationAction = new NotificationAction("ACCEPT", 0);
            ACCEPT = notificationAction;
            NotificationAction notificationAction2 = new NotificationAction("DECLINE", 1);
            DECLINE = notificationAction2;
            NotificationAction notificationAction3 = new NotificationAction("CHANGE_DECISION_AND_ACCEPT", 2);
            CHANGE_DECISION_AND_ACCEPT = notificationAction3;
            NotificationAction notificationAction4 = new NotificationAction("CHANGE_DECISION_AND_DECLINE", 3);
            CHANGE_DECISION_AND_DECLINE = notificationAction4;
            NotificationAction[] notificationActionArr = {notificationAction, notificationAction2, notificationAction3, notificationAction4};
            $VALUES = notificationActionArr;
            $ENTRIES = new asp(notificationActionArr);
        }

        public NotificationAction() {
            throw null;
        }

        public static NotificationAction valueOf(String str) {
            return (NotificationAction) Enum.valueOf(NotificationAction.class, str);
        }

        public static NotificationAction[] values() {
            return (NotificationAction[]) $VALUES.clone();
        }
    }
}
