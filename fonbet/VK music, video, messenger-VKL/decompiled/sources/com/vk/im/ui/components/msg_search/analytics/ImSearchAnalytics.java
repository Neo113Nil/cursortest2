package com.vk.im.ui.components.msg_search.analytics;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.stat.scheme.CommonSearchStat$TypeSearchClickActionItem;
import com.vk.stat.scheme.CommonSearchStat$TypeSearchLocalBlockItem;
import com.vk.stat.scheme.CommonSearchStat$TypeSearchLocalClickItem;
import com.vk.stat.scheme.CommonSearchStat$TypeSearchLocalServiceItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bjc;
import xsna.uzp0;
import xsna.zrp;

/* compiled from: ImSearchAnalytics.kt */
/* loaded from: classes2.dex */
public final class ImSearchAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImSearchAnalytics.kt */
    public static final class ClickAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickAction[] $VALUES;
        public static final ClickAction CALL_OUT;
        public static final ClickAction COPY_MESSAGE_OUT;
        public static final ClickAction DELETE_MESSAGE_OUT;
        public static final ClickAction DOWNLOAD_OUT;
        public static final ClickAction EDIT_MESSAGE_OUT;
        public static final ClickAction INVITE_OUT;
        public static final ClickAction OPEN_CHAT_PROFILE_OUT;
        public static final ClickAction OPEN_MSG_SEARCH_OUT;
        public static final ClickAction REMOVE_RECENT;
        public static final ClickAction REPLY_OUT;
        public static final ClickAction SEND_MESSAGE_OUT;
        public static final ClickAction SET_REACTION_OUT;
        public static final ClickAction SHARE_OUT;
        public static final ClickAction TAP;

        static {
            ClickAction clickAction = new ClickAction("TAP", 0);
            TAP = clickAction;
            ClickAction clickAction2 = new ClickAction("REMOVE_RECENT", 1);
            REMOVE_RECENT = clickAction2;
            ClickAction clickAction3 = new ClickAction("SEND_MESSAGE_OUT", 2);
            SEND_MESSAGE_OUT = clickAction3;
            ClickAction clickAction4 = new ClickAction("INVITE_OUT", 3);
            INVITE_OUT = clickAction4;
            ClickAction clickAction5 = new ClickAction("OPEN_CHAT_PROFILE_OUT", 4);
            OPEN_CHAT_PROFILE_OUT = clickAction5;
            ClickAction clickAction6 = new ClickAction("CALL_OUT", 5);
            CALL_OUT = clickAction6;
            ClickAction clickAction7 = new ClickAction("OPEN_MSG_SEARCH_OUT", 6);
            OPEN_MSG_SEARCH_OUT = clickAction7;
            ClickAction clickAction8 = new ClickAction("DELETE_MESSAGE_OUT", 7);
            DELETE_MESSAGE_OUT = clickAction8;
            ClickAction clickAction9 = new ClickAction("SHARE_OUT", 8);
            SHARE_OUT = clickAction9;
            ClickAction clickAction10 = new ClickAction("REPLY_OUT", 9);
            REPLY_OUT = clickAction10;
            ClickAction clickAction11 = new ClickAction("COPY_MESSAGE_OUT", 10);
            COPY_MESSAGE_OUT = clickAction11;
            ClickAction clickAction12 = new ClickAction("EDIT_MESSAGE_OUT", 11);
            EDIT_MESSAGE_OUT = clickAction12;
            ClickAction clickAction13 = new ClickAction("DOWNLOAD_OUT", 12);
            DOWNLOAD_OUT = clickAction13;
            ClickAction clickAction14 = new ClickAction("SET_REACTION_OUT", 13);
            SET_REACTION_OUT = clickAction14;
            ClickAction[] clickActionArr = {clickAction, clickAction2, clickAction3, clickAction4, clickAction5, clickAction6, clickAction7, clickAction8, clickAction9, clickAction10, clickAction11, clickAction12, clickAction13, clickAction14};
            $VALUES = clickActionArr;
            $ENTRIES = new asp(clickActionArr);
        }

        public ClickAction() {
            throw null;
        }

        public static ClickAction valueOf(String str) {
            return (ClickAction) Enum.valueOf(ClickAction.class, str);
        }

        public static ClickAction[] values() {
            return (ClickAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImSearchAnalytics.kt */
    public static final class SyncContactsResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SyncContactsResult[] $VALUES;
        public static final SyncContactsResult ACCEPT;
        public static final SyncContactsResult DECLINED;
        public static final SyncContactsResult SUCCESS;

        static {
            SyncContactsResult syncContactsResult = new SyncContactsResult("ACCEPT", 0);
            ACCEPT = syncContactsResult;
            SyncContactsResult syncContactsResult2 = new SyncContactsResult("DECLINED", 1);
            DECLINED = syncContactsResult2;
            SyncContactsResult syncContactsResult3 = new SyncContactsResult("SUCCESS", 2);
            SUCCESS = syncContactsResult3;
            SyncContactsResult[] syncContactsResultArr = {syncContactsResult, syncContactsResult2, syncContactsResult3};
            $VALUES = syncContactsResultArr;
            $ENTRIES = new asp(syncContactsResultArr);
        }

        public SyncContactsResult() {
            throw null;
        }

        public static SyncContactsResult valueOf(String str) {
            return (SyncContactsResult) Enum.valueOf(SyncContactsResult.class, str);
        }

        public static SyncContactsResult[] values() {
            return (SyncContactsResult[]) $VALUES.clone();
        }
    }

    /* compiled from: ImSearchAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[SyncContactsResult.values().length];
            try {
                iArr[SyncContactsResult.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncContactsResult.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncContactsResult.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClickAction.values().length];
            try {
                iArr2[ClickAction.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClickAction.REMOVE_RECENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClickAction.SEND_MESSAGE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ClickAction.INVITE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ClickAction.OPEN_CHAT_PROFILE_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ClickAction.CALL_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ClickAction.OPEN_MSG_SEARCH_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ClickAction.DELETE_MESSAGE_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ClickAction.SHARE_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ClickAction.REPLY_OUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ClickAction.COPY_MESSAGE_OUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ClickAction.EDIT_MESSAGE_OUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ClickAction.DOWNLOAD_OUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ClickAction.SET_REACTION_OUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ImSearchItemLoggingInfo.ClickDocType.values().length];
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.CLICK_ITEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.CHAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.EMAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.GROUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[ImSearchItemLoggingInfo.ClickDocType.CHANNEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ImSearchLocalRequestLoggingInfo.SearchBlock.values().length];
            try {
                iArr4[ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_IMPORTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[ImSearchLocalRequestLoggingInfo.SearchBlock.CACHE_RECOMMENDATIONS_RECENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[ImSearchLocalRequestLoggingInfo.SearchBlock.LOCAL_DIALOGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[ImSearchLocalRequestLoggingInfo.SearchBlock.LOCAL_CONTACTS_NO_VK.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[ImSearchLocalRequestLoggingInfo.SearchBlock.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[SearchEntrypoint.values().length];
            try {
                iArr5[SearchEntrypoint.IM_SEARCH_CHATS.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_CHATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_DIALOGS_COMPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_INVITE_DONS_TO_CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_INVITE_TO_CHAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_DIALOG_TO_SHARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_MSGS_IN_DIALOG.ordinal()] = 7;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_ARCHIVED_CHATS.ordinal()] = 8;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_FILTER_UNREAD_DIALOGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_FILTER_REQUESTS_DIALOGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_FILTER_BUSINESS_DIALOGS.ordinal()] = 11;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_FILTER_ALL_DIALOGS.ordinal()] = 12;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[SearchEntrypoint.SEARCH_FILTER_ARCHIVE_DIALOGS.ordinal()] = 13;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[SearchEntrypoint.CALLS.ordinal()] = 14;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[SearchEntrypoint.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static CommonSearchStat$TypeSearchLocalBlockItem a(ImSearchLocalRequestLoggingInfo.SearchBlock searchBlock) {
        int i = a.$EnumSwitchMapping$3[searchBlock.ordinal()];
        if (i == 1) {
            return CommonSearchStat$TypeSearchLocalBlockItem.SEARCH_CACHE_RECOMMENDATIONS_IMPORTANT;
        }
        if (i == 2) {
            return CommonSearchStat$TypeSearchLocalBlockItem.SEARCH_CACHE_RECOMMENDATIONS_RECENT;
        }
        if (i == 3) {
            return CommonSearchStat$TypeSearchLocalBlockItem.SEARCH_LOCAL_DIALOGS;
        }
        if (i == 4) {
            return CommonSearchStat$TypeSearchLocalBlockItem.SEARCH_LOCAL_CONTACTS_NO_VK;
        }
        if (i == 5) {
            return CommonSearchStat$TypeSearchLocalBlockItem.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static SchemeStat$EventItem.Type b(ImSearchItemLoggingInfo.ClickDocType clickDocType) {
        switch (a.$EnumSwitchMapping$2[clickDocType.ordinal()]) {
            case 1:
                return SchemeStat$EventItem.Type.CONVERSATION;
            case 2:
                return SchemeStat$EventItem.Type.CONTACT;
            case 3:
                return SchemeStat$EventItem.Type.USER;
            case 4:
                return SchemeStat$EventItem.Type.CLICK_ITEM;
            case 5:
                return SchemeStat$EventItem.Type.GROUP_CHAT;
            case 6:
                return SchemeStat$EventItem.Type.BANNER;
            case 7:
                return SchemeStat$EventItem.Type.GROUP;
            case 8:
                return SchemeStat$EventItem.Type.CHANNEL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static CommonSearchStat$TypeSearchLocalServiceItem c(SearchEntrypoint searchEntrypoint) {
        switch (a.$EnumSwitchMapping$4[searchEntrypoint.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_DIALOGS;
            case 4:
            case 5:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_INVITE_TO_CHAT;
            case 6:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_DIALOG_TO_SHARE;
            case 7:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_MSGS_IN_DIALOG;
            case 8:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_ARCHIVED_DIALOGS;
            case 9:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_FILTER_UNREAD_DIALOGS;
            case 10:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_FILTER_REQUESTS_DIALOGS;
            case 11:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_FILTER_BUSINESS_DIALOGS;
            case 12:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_FILTER_ALL_DIALOGS;
            case 13:
                return CommonSearchStat$TypeSearchLocalServiceItem.SEARCH_FILTER_ARCHIVE_DIALOGS;
            case 14:
                return CommonSearchStat$TypeSearchLocalServiceItem.UNKNOWN;
            case 15:
                return CommonSearchStat$TypeSearchLocalServiceItem.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void d(ClickAction clickAction, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        if (imSearchItemLoggingInfo instanceof ImSearchNetworkItemLoggingInfo) {
            ImSearchNetworkItemLoggingInfo imSearchNetworkItemLoggingInfo = (ImSearchNetworkItemLoggingInfo) imSearchItemLoggingInfo;
            switch (a.$EnumSwitchMapping$1[clickAction.ordinal()]) {
                case 1:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
                    break;
                case 2:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REMOVE_RECENT;
                    break;
                case 3:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE_OUT;
                    break;
                case 4:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.INVITE_OUT;
                    break;
                case 5:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_CHAT_PROFILE_OUT;
                    break;
                case 6:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL_OUT;
                    break;
                case 7:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_MESSAGE_SEARCH_OUT;
                    break;
                case 8:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DELETE_MESSAGE_OUT;
                    break;
                case 9:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT;
                    break;
                case 10:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REPLY_OUT;
                    break;
                case 11:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_MESSAGE_OUT;
                    break;
                case 12:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.EDIT_MESSAGE_OUT;
                    break;
                case 13:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.DOWNLOAD_OUT;
                    break;
                case 14:
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SET_REACTION_OUT;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(b(imSearchNetworkItemLoggingInfo.b), null, null, null, imSearchNetworkItemLoggingInfo.c, null, 46, null), imSearchNetworkItemLoggingInfo.d, new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null));
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, a2, uzp0Var.a).q();
            return;
        }
        if (!(imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo = (ImSearchLocalItemLoggingInfo) imSearchItemLoggingInfo;
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = imSearchLocalItemLoggingInfo.b;
        String str = imSearchLocalRequestLoggingInfo.c;
        switch (a.$EnumSwitchMapping$1[clickAction.ordinal()]) {
            case 1:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.TAP;
                break;
            case 2:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.REMOVE_RECENT;
                break;
            case 3:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.SEND_MESSAGE_OUT;
                break;
            case 4:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.INVITE_OUT;
                break;
            case 5:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.OPEN_CHAT_PROFILE_OUT;
                break;
            case 6:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.CALL_OUT;
                break;
            case 7:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.OPEN_MESSAGE_SEARCH_OUT;
                break;
            case 8:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.DELETE_MESSAGE_OUT;
                break;
            case 9:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.SHARE_OUT;
                break;
            case 10:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.REPLY_OUT;
                break;
            case 11:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.COPY_MESSAGE_OUT;
                break;
            case 12:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.EDIT_MESSAGE_OUT;
                break;
            case 13:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.DOWNLOAD_OUT;
                break;
            case 14:
                commonSearchStat$TypeSearchClickActionItem = CommonSearchStat$TypeSearchClickActionItem.SET_REACTION_OUT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        SchemeStat$TypeClick a3 = SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(b(imSearchLocalItemLoggingInfo.e), Long.valueOf(imSearchLocalItemLoggingInfo.d.b), null, null, null, null, 60, null), Integer.valueOf(imSearchLocalItemLoggingInfo.c), new CommonSearchStat$TypeSearchLocalClickItem(str, commonSearchStat$TypeSearchClickActionItem, c(imSearchLocalRequestLoggingInfo.f), a(imSearchLocalRequestLoggingInfo.g), imSearchLocalRequestLoggingInfo.h));
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, a3, uzp0Var2.a).q();
    }
}
