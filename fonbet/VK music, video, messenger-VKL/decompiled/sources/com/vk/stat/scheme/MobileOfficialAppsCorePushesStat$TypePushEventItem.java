package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePushesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCorePushesStat$TypePushEventItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("action")
    private final Action action;

    @pmi0("action_button")
    private final ActionButton actionButton;

    @pmi0("push_message_id")
    private final FilteredString filteredPushMessageId;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("remote_data")
    private final String remoteData;

    @pmi0("type")
    private final String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    /* loaded from: classes5.dex */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @pmi0("action_button")
        public static final Action ACTION_BUTTON;

        @pmi0("clear")
        public static final Action CLEAR;

        @pmi0("mute")
        public static final Action MUTE;

        @pmi0("open")
        public static final Action OPEN;

        @pmi0("open_settings")
        public static final Action OPEN_SETTINGS;

        @pmi0("play")
        public static final Action PLAY;

        @pmi0("receive")
        public static final Action RECEIVE;

        @pmi0("shuffle")
        public static final Action SHUFFLE;

        static {
            Action action = new Action("OPEN", 0);
            OPEN = action;
            Action action2 = new Action("CLEAR", 1);
            CLEAR = action2;
            Action action3 = new Action("RECEIVE", 2);
            RECEIVE = action3;
            Action action4 = new Action("PLAY", 3);
            PLAY = action4;
            Action action5 = new Action("SHUFFLE", 4);
            SHUFFLE = action5;
            Action action6 = new Action("OPEN_SETTINGS", 5);
            OPEN_SETTINGS = action6;
            Action action7 = new Action(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 6);
            MUTE = action7;
            Action action8 = new Action("ACTION_BUTTON", 7);
            ACTION_BUTTON = action8;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        private Action(String str, int i) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    /* loaded from: classes5.dex */
    public static final class ActionButton {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionButton[] $VALUES;

        @pmi0("live_not_interested")
        public static final ActionButton LIVE_NOT_INTERESTED;

        @pmi0("live_watch_later")
        public static final ActionButton LIVE_WATCH_LATER;

        @pmi0("video_download")
        public static final ActionButton VIDEO_DOWNLOAD;

        @pmi0("video_not_interested")
        public static final ActionButton VIDEO_NOT_INTERESTED;

        @pmi0("video_watch_later")
        public static final ActionButton VIDEO_WATCH_LATER;

        @pmi0("video_watch_tv")
        public static final ActionButton VIDEO_WATCH_TV;

        static {
            ActionButton actionButton = new ActionButton("VIDEO_NOT_INTERESTED", 0);
            VIDEO_NOT_INTERESTED = actionButton;
            ActionButton actionButton2 = new ActionButton("VIDEO_WATCH_LATER", 1);
            VIDEO_WATCH_LATER = actionButton2;
            ActionButton actionButton3 = new ActionButton("VIDEO_DOWNLOAD", 2);
            VIDEO_DOWNLOAD = actionButton3;
            ActionButton actionButton4 = new ActionButton("VIDEO_WATCH_TV", 3);
            VIDEO_WATCH_TV = actionButton4;
            ActionButton actionButton5 = new ActionButton("LIVE_NOT_INTERESTED", 4);
            LIVE_NOT_INTERESTED = actionButton5;
            ActionButton actionButton6 = new ActionButton("LIVE_WATCH_LATER", 5);
            LIVE_WATCH_LATER = actionButton6;
            ActionButton[] actionButtonArr = {actionButton, actionButton2, actionButton3, actionButton4, actionButton5, actionButton6};
            $VALUES = actionButtonArr;
            $ENTRIES = new asp(actionButtonArr);
        }

        private ActionButton(String str, int i) {
        }

        public static ActionButton valueOf(String str) {
            return (ActionButton) Enum.valueOf(ActionButton.class, str);
        }

        public static ActionButton[] values() {
            return (ActionButton[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsCorePushesStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsCorePushesStat$TypePushEventItem>, a9y<MobileOfficialAppsCorePushesStat$TypePushEventItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Action action = (Action) dq.f(x9yVar, "action", tru.a(), Action.class);
            String s = fai.s(x9yVar, "type");
            String s2 = fai.s(x9yVar, "remote_data");
            MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = (MobileOfficialAppsCoreDeviceStat$NetworkInfo) dq.f(x9yVar, "network_info", tru.a(), MobileOfficialAppsCoreDeviceStat$NetworkInfo.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("action_button");
            return new MobileOfficialAppsCorePushesStat$TypePushEventItem(action, s, s2, mobileOfficialAppsCoreDeviceStat$NetworkInfo, (ActionButton) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), ActionButton.class)), fai.C(x9yVar, "push_message_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsCorePushesStat$TypePushEventItem mobileOfficialAppsCorePushesStat$TypePushEventItem = (MobileOfficialAppsCorePushesStat$TypePushEventItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("action", tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushEventItem.a()));
            x9yVar.o("type", mobileOfficialAppsCorePushesStat$TypePushEventItem.e());
            x9yVar.o("remote_data", mobileOfficialAppsCorePushesStat$TypePushEventItem.d());
            x9yVar.o("network_info", tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushEventItem.c()));
            x9yVar.o("action_button", tru.a().toJson(mobileOfficialAppsCorePushesStat$TypePushEventItem.b()));
            x9yVar.o("push_message_id", mobileOfficialAppsCorePushesStat$TypePushEventItem.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsCorePushesStat$TypePushEventItem(Action action, String str, String str2, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, ActionButton actionButton, String str3) {
        this.action = action;
        this.type = str;
        this.remoteData = str2;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
        this.actionButton = actionButton;
        this.a = str3;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredPushMessageId = filteredString;
        filteredString.a(str3);
    }

    public final Action a() {
        return this.action;
    }

    public final ActionButton b() {
        return this.actionButton;
    }

    public final MobileOfficialAppsCoreDeviceStat$NetworkInfo c() {
        return this.networkInfo;
    }

    public final String d() {
        return this.remoteData;
    }

    public final String e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePushesStat$TypePushEventItem)) {
            return false;
        }
        MobileOfficialAppsCorePushesStat$TypePushEventItem mobileOfficialAppsCorePushesStat$TypePushEventItem = (MobileOfficialAppsCorePushesStat$TypePushEventItem) obj;
        return this.action == mobileOfficialAppsCorePushesStat$TypePushEventItem.action && epx.f(this.type, mobileOfficialAppsCorePushesStat$TypePushEventItem.type) && epx.f(this.remoteData, mobileOfficialAppsCorePushesStat$TypePushEventItem.remoteData) && epx.f(this.networkInfo, mobileOfficialAppsCorePushesStat$TypePushEventItem.networkInfo) && this.actionButton == mobileOfficialAppsCorePushesStat$TypePushEventItem.actionButton && epx.f(this.a, mobileOfficialAppsCorePushesStat$TypePushEventItem.a);
    }

    public final int hashCode() {
        int hashCode = (this.networkInfo.hashCode() + urd0.a(urd0.a(this.action.hashCode() * 31, 31, this.type), 31, this.remoteData)) * 31;
        ActionButton actionButton = this.actionButton;
        int hashCode2 = (hashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        String str = this.a;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypePushEventItem(action=");
        sb.append(this.action);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", remoteData=");
        sb.append(this.remoteData);
        sb.append(", networkInfo=");
        sb.append(this.networkInfo);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", pushMessageId=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsCorePushesStat$TypePushEventItem(Action action, String str, String str2, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, ActionButton actionButton, String str3, int i, zcl zclVar) {
        this(action, str, str2, mobileOfficialAppsCoreDeviceStat$NetworkInfo, (i & 16) != 0 ? null : actionButton, (i & 32) != 0 ? null : str3);
    }
}
