package com.vk.im.ui.utils;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import xsna.asp;
import xsna.iid0;
import xsna.zrp;

/* compiled from: CreateChannelFlowTracker.kt */
/* loaded from: classes2.dex */
public final class CreateChannelFlowTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateChannelFlowTracker.kt */
    public static final class CreateChannelFlowTrackEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CreateChannelFlowTrackEvent[] $VALUES;
        public static final CreateChannelFlowTrackEvent BUTTON_CREATE_CHANNEL;
        public static final CreateChannelFlowTrackEvent BUTTON_START_WRITING;
        public static final CreateChannelFlowTrackEvent CHOOSE_AVATAR_PERSONAL_CHANNEL;
        public static final CreateChannelFlowTrackEvent CLICK_MAKE_CHANNEL_FROM_GROUP;
        public static final CreateChannelFlowTrackEvent CLICK_MAKE_PERSONAL_CHANNEL;
        public static final CreateChannelFlowTrackEvent INVITES_SENT_PERSONAL_CHANNEL;
        public static final CreateChannelFlowTrackEvent WRITE_TITLE_PERSONAL_CHANNEL;
        private final SchemeStat$TypeMessagingActionItem.ActionType action;

        static {
            SchemeStat$TypeMessagingActionItem.ActionType actionType = SchemeStat$TypeMessagingActionItem.ActionType.CLICK_ON_MAKE_CHANNEL_FROM;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent = new CreateChannelFlowTrackEvent("CLICK_MAKE_PERSONAL_CHANNEL", 0, actionType);
            CLICK_MAKE_PERSONAL_CHANNEL = createChannelFlowTrackEvent;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent2 = new CreateChannelFlowTrackEvent("CLICK_MAKE_CHANNEL_FROM_GROUP", 1, actionType);
            CLICK_MAKE_CHANNEL_FROM_GROUP = createChannelFlowTrackEvent2;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent3 = new CreateChannelFlowTrackEvent("BUTTON_CREATE_CHANNEL", 2, SchemeStat$TypeMessagingActionItem.ActionType.BUTTON_CREATE_CHANNEL);
            BUTTON_CREATE_CHANNEL = createChannelFlowTrackEvent3;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent4 = new CreateChannelFlowTrackEvent("BUTTON_START_WRITING", 3, SchemeStat$TypeMessagingActionItem.ActionType.BUTTON_START_WRITING);
            BUTTON_START_WRITING = createChannelFlowTrackEvent4;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent5 = new CreateChannelFlowTrackEvent("CHOOSE_AVATAR_PERSONAL_CHANNEL", 4, SchemeStat$TypeMessagingActionItem.ActionType.CHOOSE_AVATAR_PERSONAL_CHANNEL);
            CHOOSE_AVATAR_PERSONAL_CHANNEL = createChannelFlowTrackEvent5;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent6 = new CreateChannelFlowTrackEvent("WRITE_TITLE_PERSONAL_CHANNEL", 5, SchemeStat$TypeMessagingActionItem.ActionType.WRITE_TITLE_PERSONAL_CHANNEL);
            WRITE_TITLE_PERSONAL_CHANNEL = createChannelFlowTrackEvent6;
            CreateChannelFlowTrackEvent createChannelFlowTrackEvent7 = new CreateChannelFlowTrackEvent("INVITES_SENT_PERSONAL_CHANNEL", 6, SchemeStat$TypeMessagingActionItem.ActionType.INVITES_SENT_PERSONAL_CHANNEL);
            INVITES_SENT_PERSONAL_CHANNEL = createChannelFlowTrackEvent7;
            CreateChannelFlowTrackEvent[] createChannelFlowTrackEventArr = {createChannelFlowTrackEvent, createChannelFlowTrackEvent2, createChannelFlowTrackEvent3, createChannelFlowTrackEvent4, createChannelFlowTrackEvent5, createChannelFlowTrackEvent6, createChannelFlowTrackEvent7};
            $VALUES = createChannelFlowTrackEventArr;
            $ENTRIES = new asp(createChannelFlowTrackEventArr);
        }

        public CreateChannelFlowTrackEvent(String str, int i, SchemeStat$TypeMessagingActionItem.ActionType actionType) {
            this.action = actionType;
        }

        public static CreateChannelFlowTrackEvent valueOf(String str) {
            return (CreateChannelFlowTrackEvent) Enum.valueOf(CreateChannelFlowTrackEvent.class, str);
        }

        public static CreateChannelFlowTrackEvent[] values() {
            return (CreateChannelFlowTrackEvent[]) $VALUES.clone();
        }

        public final SchemeStat$TypeMessagingActionItem.ActionType h() {
            return this.action;
        }
    }

    /* compiled from: CreateChannelFlowTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateChannelFlowTrackEvent.values().length];
            try {
                iArr[CreateChannelFlowTrackEvent.CLICK_MAKE_PERSONAL_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateChannelFlowTrackEvent.CLICK_MAKE_CHANNEL_FROM_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(CreateChannelFlowTrackEvent createChannelFlowTrackEvent) {
        String str;
        String str2;
        int i = a.$EnumSwitchMapping$0[createChannelFlowTrackEvent.ordinal()];
        if (i == 1) {
            str = "personal_channel";
        } else {
            if (i != 2) {
                str2 = null;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(createChannelFlowTrackEvent.h(), null, null, null, null, null, null, str2, null, null, null, null, 3966, null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
            }
            str = "community";
        }
        str2 = str;
        iid0 iid0Var2 = new iid0();
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(createChannelFlowTrackEvent.h(), null, null, null, null, null, null, str2, null, null, null, null, 3966, null), 3);
        iid0Var2.f = c2;
        iid0Var2.g = b2;
        iid0Var2.q();
    }
}
