package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zt20;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipCallItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("background_id")
    private final Integer backgroundId;

    @pmi0("call_event_type")
    private final CallEventType callEventType;

    @pmi0("custom_feedback")
    private final String customFeedback;

    @pmi0("error")
    private final Integer error;

    @pmi0("error_type")
    private final String errorType;

    @pmi0("event_client_microsec")
    private final String eventClientMicrosec;

    @pmi0("event_param")
    private final Integer eventParam;

    @pmi0("feedback")
    private final List<String> feedback;

    @pmi0("reason")
    private final FilteredString filteredReason;

    @pmi0("group_call_users_count")
    private final Integer groupCallUsersCount;

    @pmi0("group_id")
    private final Long groupId;

    @pmi0("hall_count")
    private final Integer hallCount;

    @pmi0("hall_id")
    private final Integer hallId;

    @pmi0("has_network")
    private final Boolean hasNetwork;

    @pmi0("intensity")
    private final Integer intensity;

    @pmi0("is_autoupdate")
    private final Boolean isAutoupdate;

    @pmi0("is_contact")
    private final Boolean isContact;

    @pmi0("is_group_call")
    private final boolean isGroupCall;

    @pmi0("is_room")
    private final Boolean isRoom;

    @pmi0("is_user_anon")
    private final Boolean isUserAnon;

    @pmi0("lib_version")
    private final String libVersion;

    @pmi0("mask_duration")
    private final Integer maskDuration;

    @pmi0("mask_id")
    private final Long maskId;

    @pmi0("mask_owner_id")
    private final Long maskOwnerId;

    @pmi0("mini_app_id")
    private final Integer miniAppId;

    @pmi0("mute_permanent")
    private final Integer mutePermanent;

    @pmi0("notification_id")
    private final Long notificationId;

    @pmi0("notification_try_id")
    private final Integer notificationTryId;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("peer_id")
    private final String peerId;

    @pmi0("reaction_type")
    private final String reactionType;

    @pmi0("relay_ip")
    private final String relayIp;

    @pmi0("screen")
    private final String screen;

    @pmi0("session_id")
    private final String sessionId;

    @pmi0("sharing_channel")
    private final SharingChannel sharingChannel;

    @pmi0("source")
    private final Source source;

    @pmi0("stereo_room_speakers_count")
    private final Integer stereoRoomSpeakersCount;

    @pmi0("upcoming")
    private final Integer upcoming;

    @pmi0("user_response")
    private final Integer userResponse;

    @pmi0("user_time_sec")
    private final Integer userTimeSec;

    @pmi0("vid")
    private final Integer vid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    /* loaded from: classes5.dex */
    public static final class CallEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CallEventType[] $VALUES;

        @pmi0("admin_pin")
        public static final CallEventType ADMIN_PIN;

        @pmi0("admin_unpin")
        public static final CallEventType ADMIN_UNPIN;

        @pmi0("all_hands_lowered")
        public static final CallEventType ALL_HANDS_LOWERED;

        @pmi0("all_mics_and_video_disabled")
        public static final CallEventType ALL_MICS_AND_VIDEO_DISABLED;

        @pmi0("all_mics_disabled")
        public static final CallEventType ALL_MICS_DISABLED;

        @pmi0("all_screen_sharing_disabled")
        public static final CallEventType ALL_SCREEN_SHARING_DISABLED;

        @pmi0("all_video_disabled")
        public static final CallEventType ALL_VIDEO_DISABLED;

        @pmi0("all_watch_together_disabled")
        public static final CallEventType ALL_WATCH_TOGETHER_DISABLED;

        @pmi0("app_update_approved")
        public static final CallEventType APP_UPDATE_APPROVED;

        @pmi0("app_update_available_notification")
        public static final CallEventType APP_UPDATE_AVAILABLE_NOTIFICATION;

        @pmi0("app_update_cancelled")
        public static final CallEventType APP_UPDATE_CANCELLED;

        @pmi0("app_update_deferred")
        public static final CallEventType APP_UPDATE_DEFERRED;

        @pmi0("app_update_download_failed")
        public static final CallEventType APP_UPDATE_DOWNLOAD_FAILED;

        @pmi0("app_update_download_found_in_cache")
        public static final CallEventType APP_UPDATE_DOWNLOAD_FOUND_IN_CACHE;

        @pmi0("app_update_download_successful")
        public static final CallEventType APP_UPDATE_DOWNLOAD_SUCCESSFUL;

        @pmi0("app_update_failed")
        public static final CallEventType APP_UPDATE_FAILED;

        @pmi0("app_update_forced")
        public static final CallEventType APP_UPDATE_FORCED;

        @pmi0("app_update_process_dropped")
        public static final CallEventType APP_UPDATE_PROCESS_DROPPED;

        @pmi0("app_update_ready_to_install_notification")
        public static final CallEventType APP_UPDATE_READY_TO_INSTALL_NOTIFICATION;

        @pmi0("app_update_requested")
        public static final CallEventType APP_UPDATE_REQUESTED;

        @pmi0("app_update_successful")
        public static final CallEventType APP_UPDATE_SUCCESSFUL;

        @pmi0("ask_all_to_unmute")
        public static final CallEventType ASK_ALL_TO_UNMUTE;

        @pmi0("ask_all_to_unmute_audio")
        public static final CallEventType ASK_ALL_TO_UNMUTE_AUDIO;

        @pmi0("ask_all_to_unmute_video")
        public static final CallEventType ASK_ALL_TO_UNMUTE_VIDEO;

        @pmi0("ask_user_to_unmute")
        public static final CallEventType ASK_USER_TO_UNMUTE;

        @pmi0("ask_user_to_unmute_audio")
        public static final CallEventType ASK_USER_TO_UNMUTE_AUDIO;

        @pmi0("ask_user_to_unmute_video")
        public static final CallEventType ASK_USER_TO_UNMUTE_VIDEO;

        @pmi0("assign_admin")
        public static final CallEventType ASSIGN_ADMIN;

        @pmi0("audio_sharing_started")
        public static final CallEventType AUDIO_SHARING_STARTED;

        @pmi0("audio_sharing_stopped")
        public static final CallEventType AUDIO_SHARING_STOPPED;

        @pmi0("beauty_disabled")
        public static final CallEventType BEAUTY_DISABLED;

        @pmi0("beauty_enabled")
        public static final CallEventType BEAUTY_ENABLED;

        @pmi0("call_chat_history_toggled")
        public static final CallEventType CALL_CHAT_HISTORY_TOGGLED;

        @pmi0("call_collapsed")
        public static final CallEventType CALL_COLLAPSED;

        @pmi0("call_connected")
        public static final CallEventType CALL_CONNECTED;

        @pmi0("call_created")
        public static final CallEventType CALL_CREATED;

        @pmi0("call_declined_or_hanged_locally")
        public static final CallEventType CALL_DECLINED_OR_HANGED_LOCALLY;

        @pmi0("call_declined_or_hanged_remotely")
        public static final CallEventType CALL_DECLINED_OR_HANGED_REMOTELY;

        @pmi0("call_disconnected")
        public static final CallEventType CALL_DISCONNECTED;

        @pmi0("call_history_delete_all")
        public static final CallEventType CALL_HISTORY_DELETE_ALL;

        @pmi0("call_history_delete_selected")
        public static final CallEventType CALL_HISTORY_DELETE_SELECTED;

        @pmi0("call_history_delete_single")
        public static final CallEventType CALL_HISTORY_DELETE_SINGLE;

        @pmi0("call_history_show_edit_screen")
        public static final CallEventType CALL_HISTORY_SHOW_EDIT_SCREEN;

        @pmi0("call_link_qr_code_click")
        public static final CallEventType CALL_LINK_QR_CODE_CLICK;

        @pmi0("call_link_qr_code_shared")
        public static final CallEventType CALL_LINK_QR_CODE_SHARED;

        @pmi0("call_notification_received")
        public static final CallEventType CALL_NOTIFICATION_RECEIVED;

        @pmi0("call_notification_show_failed")
        public static final CallEventType CALL_NOTIFICATION_SHOW_FAILED;

        @pmi0("call_preview_background_disabled")
        public static final CallEventType CALL_PREVIEW_BACKGROUND_DISABLED;

        @pmi0("call_preview_background_enabled")
        public static final CallEventType CALL_PREVIEW_BACKGROUND_ENABLED;

        @pmi0("call_preview_camera_disabled")
        public static final CallEventType CALL_PREVIEW_CAMERA_DISABLED;

        @pmi0("call_preview_camera_enabled")
        public static final CallEventType CALL_PREVIEW_CAMERA_ENABLED;

        @pmi0("call_preview_joined")
        public static final CallEventType CALL_PREVIEW_JOINED;

        @pmi0("call_preview_link_shared")
        public static final CallEventType CALL_PREVIEW_LINK_SHARED;

        @pmi0("call_preview_mask_disabled")
        public static final CallEventType CALL_PREVIEW_MASK_DISABLED;

        @pmi0("call_preview_mask_enabled")
        public static final CallEventType CALL_PREVIEW_MASK_ENABLED;

        @pmi0("call_preview_mic_disabled")
        public static final CallEventType CALL_PREVIEW_MIC_DISABLED;

        @pmi0("call_preview_mic_enabled")
        public static final CallEventType CALL_PREVIEW_MIC_ENABLED;

        @pmi0("call_preview_qr_pressed")
        public static final CallEventType CALL_PREVIEW_QR_PRESSED;

        @pmi0("call_preview_vmoji_created")
        public static final CallEventType CALL_PREVIEW_VMOJI_CREATED;

        @pmi0("call_preview_vmoji_disabled")
        public static final CallEventType CALL_PREVIEW_VMOJI_DISABLED;

        @pmi0("call_preview_vmoji_enabled")
        public static final CallEventType CALL_PREVIEW_VMOJI_ENABLED;

        @pmi0("call_recording_click")
        public static final CallEventType CALL_RECORDING_CLICK;

        @pmi0("call_recording_started")
        public static final CallEventType CALL_RECORDING_STARTED;

        @pmi0("call_recording_start_failed")
        public static final CallEventType CALL_RECORDING_START_FAILED;

        @pmi0("call_recording_stopped")
        public static final CallEventType CALL_RECORDING_STOPPED;

        @pmi0("call_scheduled")
        public static final CallEventType CALL_SCHEDULED;

        @pmi0("call_short_link_shared")
        public static final CallEventType CALL_SHORT_LINK_SHARED;

        @pmi0("call_streaming_click")
        public static final CallEventType CALL_STREAMING_CLICK;

        @pmi0("call_streaming_started")
        public static final CallEventType CALL_STREAMING_STARTED;

        @pmi0("call_streaming_start_failed")
        public static final CallEventType CALL_STREAMING_START_FAILED;

        @pmi0("call_streaming_stopped")
        public static final CallEventType CALL_STREAMING_STOPPED;

        @pmi0("call_vmoji_click")
        public static final CallEventType CALL_VMOJI_CLICK;

        @pmi0("call_vmoji_started")
        public static final CallEventType CALL_VMOJI_STARTED;

        @pmi0("call_vmoji_start_failed")
        public static final CallEventType CALL_VMOJI_START_FAILED;

        @pmi0("call_vmoji_stopped")
        public static final CallEventType CALL_VMOJI_STOPPED;

        @pmi0("call_watch_together_click")
        public static final CallEventType CALL_WATCH_TOGETHER_CLICK;

        @pmi0("call_watch_together_started")
        public static final CallEventType CALL_WATCH_TOGETHER_STARTED;

        @pmi0("call_watch_together_stopped")
        public static final CallEventType CALL_WATCH_TOGETHER_STOPPED;

        @pmi0("complain_about_stereo_room")
        public static final CallEventType COMPLAIN_ABOUT_STEREO_ROOM;

        @pmi0("contact_deanonimized")
        public static final CallEventType CONTACT_DEANONIMIZED;

        @pmi0("contact_invited")
        public static final CallEventType CONTACT_INVITED;

        @pmi0("contact_joined")
        public static final CallEventType CONTACT_JOINED;

        @pmi0("current_user_bad_connection_alert")
        public static final CallEventType CURRENT_USER_BAD_CONNECTION_ALERT;

        @pmi0("custom_virtual_background_added")
        public static final CallEventType CUSTOM_VIRTUAL_BACKGROUND_ADDED;

        @pmi0("custom_virtual_background_deleted")
        public static final CallEventType CUSTOM_VIRTUAL_BACKGROUND_DELETED;

        @pmi0("custom_virtual_background_selected")
        public static final CallEventType CUSTOM_VIRTUAL_BACKGROUND_SELECTED;

        @pmi0("gesture_reaction_sent")
        public static final CallEventType GESTURE_REACTION_SENT;

        @pmi0("group_call_joined")
        public static final CallEventType GROUP_CALL_JOINED;

        @pmi0("group_call_join_failed")
        public static final CallEventType GROUP_CALL_JOIN_FAILED;

        @pmi0("group_call_join_forbidden_anonym")
        public static final CallEventType GROUP_CALL_JOIN_FORBIDDEN_ANONYM;

        @pmi0("hand_lowered")
        public static final CallEventType HAND_LOWERED;

        @pmi0("hand_raised")
        public static final CallEventType HAND_RAISED;

        @pmi0("incoming_call_accepted")
        public static final CallEventType INCOMING_CALL_ACCEPTED;

        @pmi0("incoming_call_failed")
        public static final CallEventType INCOMING_CALL_FAILED;

        @pmi0("incoming_call_received")
        public static final CallEventType INCOMING_CALL_RECEIVED;

        @pmi0("mask_off")
        public static final CallEventType MASK_OFF;

        @pmi0("mask_on")
        public static final CallEventType MASK_ON;

        @pmi0("mic_disabled")
        public static final CallEventType MIC_DISABLED;

        @pmi0("mic_enabled")
        public static final CallEventType MIC_ENABLED;

        @pmi0("mic_off_while_talking_alert")
        public static final CallEventType MIC_OFF_WHILE_TALKING_ALERT;

        @pmi0("mic_off_while_talking_enable_click")
        public static final CallEventType MIC_OFF_WHILE_TALKING_ENABLE_CLICK;

        @pmi0("name_changed_by_admin")
        public static final CallEventType NAME_CHANGED_BY_ADMIN;

        @pmi0("name_changed_by_anonym")
        public static final CallEventType NAME_CHANGED_BY_ANONYM;

        @pmi0("name_changed_by_community")
        public static final CallEventType NAME_CHANGED_BY_COMMUNITY;

        @pmi0("name_changed_by_user")
        public static final CallEventType NAME_CHANGED_BY_USER;

        @pmi0("online_transcription_started")
        public static final CallEventType ONLINE_TRANSCRIPTION_STARTED;

        @pmi0("online_transcription_stopped")
        public static final CallEventType ONLINE_TRANSCRIPTION_STOPPED;

        @pmi0("open_chat")
        public static final CallEventType OPEN_CHAT;

        @pmi0("outgoing_call_accepted_remotely")
        public static final CallEventType OUTGOING_CALL_ACCEPTED_REMOTELY;

        @pmi0("outgoing_call_add_participants_sent")
        public static final CallEventType OUTGOING_CALL_ADD_PARTICIPANTS_SENT;

        @pmi0("outgoing_call_completed")
        public static final CallEventType OUTGOING_CALL_COMPLETED;

        @pmi0("outgoing_call_failed")
        public static final CallEventType OUTGOING_CALL_FAILED;

        @pmi0("outgoing_call_remote_ringing")
        public static final CallEventType OUTGOING_CALL_REMOTE_RINGING;

        @pmi0("outgoing_call_started_audio")
        public static final CallEventType OUTGOING_CALL_STARTED_AUDIO;

        @pmi0("outgoing_call_started_video")
        public static final CallEventType OUTGOING_CALL_STARTED_VIDEO;

        @pmi0("promote_participant_w_r")
        public static final CallEventType PROMOTE_PARTICIPANT_W_R;

        @pmi0("reaction_disabled")
        public static final CallEventType REACTION_DISABLED;

        @pmi0("reaction_enabled")
        public static final CallEventType REACTION_ENABLED;

        @pmi0("reaction_sent")
        public static final CallEventType REACTION_SENT;

        @pmi0("reject_participant_w_r")
        public static final CallEventType REJECT_PARTICIPANT_W_R;

        @pmi0("relay_connection_established")
        public static final CallEventType RELAY_CONNECTION_ESTABLISHED;

        @pmi0("request_interaction")
        public static final CallEventType REQUEST_INTERACTION;

        @pmi0("request_interaction_accepted_remotely")
        public static final CallEventType REQUEST_INTERACTION_ACCEPTED_REMOTELY;

        @pmi0("retrieve_admin")
        public static final CallEventType RETRIEVE_ADMIN;

        @pmi0("scheduled_call_edited")
        public static final CallEventType SCHEDULED_CALL_EDITED;

        @pmi0("screen_sharing_started")
        public static final CallEventType SCREEN_SHARING_STARTED;

        @pmi0("screen_sharing_stopped")
        public static final CallEventType SCREEN_SHARING_STOPPED;

        @pmi0("session_rooms_ask_for_help")
        public static final CallEventType SESSION_ROOMS_ASK_FOR_HELP;

        @pmi0("session_rooms_auto_allocation")
        public static final CallEventType SESSION_ROOMS_AUTO_ALLOCATION;

        @pmi0("session_rooms_closed")
        public static final CallEventType SESSION_ROOMS_CLOSED;

        @pmi0("session_rooms_closed_using_timer")
        public static final CallEventType SESSION_ROOMS_CLOSED_USING_TIMER;

        @pmi0("session_rooms_manual_allocation")
        public static final CallEventType SESSION_ROOMS_MANUAL_ALLOCATION;

        @pmi0("session_rooms_message_sent")
        public static final CallEventType SESSION_ROOMS_MESSAGE_SENT;

        @pmi0("session_rooms_opened")
        public static final CallEventType SESSION_ROOMS_OPENED;

        @pmi0("session_rooms_timer_enabled")
        public static final CallEventType SESSION_ROOMS_TIMER_ENABLED;

        @pmi0("session_rooms_user_left")
        public static final CallEventType SESSION_ROOMS_USER_LEFT;

        @pmi0("session_rooms_user_moved")
        public static final CallEventType SESSION_ROOMS_USER_MOVED;

        @pmi0("speaker_mode_changed")
        public static final CallEventType SPEAKER_MODE_CHANGED;

        @pmi0("stereo_room_assign_speaker")
        public static final CallEventType STEREO_ROOM_ASSIGN_SPEAKER;

        @pmi0("stereo_room_closed")
        public static final CallEventType STEREO_ROOM_CLOSED;

        @pmi0("stereo_room_created")
        public static final CallEventType STEREO_ROOM_CREATED;

        @pmi0("stereo_room_edited")
        public static final CallEventType STEREO_ROOM_EDITED;

        @pmi0("stereo_room_joined")
        public static final CallEventType STEREO_ROOM_JOINED;

        @pmi0("stereo_room_live_joined")
        public static final CallEventType STEREO_ROOM_LIVE_JOINED;

        @pmi0("stereo_room_posted_in_public")
        public static final CallEventType STEREO_ROOM_POSTED_IN_PUBLIC;

        @pmi0("stereo_room_retrieve_speaker")
        public static final CallEventType STEREO_ROOM_RETRIEVE_SPEAKER;

        @pmi0("system_stat")
        public static final CallEventType SYSTEM_STAT;

        @pmi0("transcription_started")
        public static final CallEventType TRANSCRIPTION_STARTED;

        @pmi0("transcription_stopped")
        public static final CallEventType TRANSCRIPTION_STOPPED;

        @pmi0("user_feedback_received")
        public static final CallEventType USER_FEEDBACK_RECEIVED;

        @pmi0("user_hand_lowered")
        public static final CallEventType USER_HAND_LOWERED;

        @pmi0("user_mics_and_video_disabled")
        public static final CallEventType USER_MICS_AND_VIDEO_DISABLED;

        @pmi0("user_mics_disabled")
        public static final CallEventType USER_MICS_DISABLED;

        @pmi0("user_promo_closed")
        public static final CallEventType USER_PROMO_CLOSED;

        @pmi0("user_screen_sharing_disabled")
        public static final CallEventType USER_SCREEN_SHARING_DISABLED;

        @pmi0("user_video_disabled")
        public static final CallEventType USER_VIDEO_DISABLED;

        @pmi0("user_watch_together_disabled")
        public static final CallEventType USER_WATCH_TOGETHER_DISABLED;

        @pmi0("video_disabled")
        public static final CallEventType VIDEO_DISABLED;

        @pmi0("video_disabled_due_to_bad_connection_alert")
        public static final CallEventType VIDEO_DISABLED_DUE_TO_BAD_CONNECTION_ALERT;

        @pmi0("video_enabled")
        public static final CallEventType VIDEO_ENABLED;

        @pmi0("virtual_background_disabled")
        public static final CallEventType VIRTUAL_BACKGROUND_DISABLED;

        @pmi0("virtual_background_selected")
        public static final CallEventType VIRTUAL_BACKGROUND_SELECTED;

        @pmi0("waiting_room_disabled")
        public static final CallEventType WAITING_ROOM_DISABLED;

        @pmi0("waiting_room_enabled")
        public static final CallEventType WAITING_ROOM_ENABLED;

        @pmi0("white_board_started")
        public static final CallEventType WHITE_BOARD_STARTED;

        @pmi0("white_board_started_remotely")
        public static final CallEventType WHITE_BOARD_STARTED_REMOTELY;

        @pmi0("white_board_view_click")
        public static final CallEventType WHITE_BOARD_VIEW_CLICK;

        static {
            CallEventType callEventType = new CallEventType("OUTGOING_CALL_STARTED_VIDEO", 0);
            OUTGOING_CALL_STARTED_VIDEO = callEventType;
            CallEventType callEventType2 = new CallEventType("OUTGOING_CALL_STARTED_AUDIO", 1);
            OUTGOING_CALL_STARTED_AUDIO = callEventType2;
            CallEventType callEventType3 = new CallEventType("OUTGOING_CALL_ADD_PARTICIPANTS_SENT", 2);
            OUTGOING_CALL_ADD_PARTICIPANTS_SENT = callEventType3;
            CallEventType callEventType4 = new CallEventType("OUTGOING_CALL_REMOTE_RINGING", 3);
            OUTGOING_CALL_REMOTE_RINGING = callEventType4;
            CallEventType callEventType5 = new CallEventType("OUTGOING_CALL_ACCEPTED_REMOTELY", 4);
            OUTGOING_CALL_ACCEPTED_REMOTELY = callEventType5;
            CallEventType callEventType6 = new CallEventType("OUTGOING_CALL_FAILED", 5);
            OUTGOING_CALL_FAILED = callEventType6;
            CallEventType callEventType7 = new CallEventType("OUTGOING_CALL_COMPLETED", 6);
            OUTGOING_CALL_COMPLETED = callEventType7;
            CallEventType callEventType8 = new CallEventType("INCOMING_CALL_RECEIVED", 7);
            INCOMING_CALL_RECEIVED = callEventType8;
            CallEventType callEventType9 = new CallEventType("INCOMING_CALL_ACCEPTED", 8);
            INCOMING_CALL_ACCEPTED = callEventType9;
            CallEventType callEventType10 = new CallEventType("INCOMING_CALL_FAILED", 9);
            INCOMING_CALL_FAILED = callEventType10;
            CallEventType callEventType11 = new CallEventType("CALL_DECLINED_OR_HANGED_LOCALLY", 10);
            CALL_DECLINED_OR_HANGED_LOCALLY = callEventType11;
            CallEventType callEventType12 = new CallEventType("CALL_DECLINED_OR_HANGED_REMOTELY", 11);
            CALL_DECLINED_OR_HANGED_REMOTELY = callEventType12;
            CallEventType callEventType13 = new CallEventType("CALL_CONNECTED", 12);
            CALL_CONNECTED = callEventType13;
            CallEventType callEventType14 = new CallEventType("CALL_DISCONNECTED", 13);
            CALL_DISCONNECTED = callEventType14;
            CallEventType callEventType15 = new CallEventType("CALL_COLLAPSED", 14);
            CALL_COLLAPSED = callEventType15;
            CallEventType callEventType16 = new CallEventType("VIDEO_ENABLED", 15);
            VIDEO_ENABLED = callEventType16;
            CallEventType callEventType17 = new CallEventType("VIDEO_DISABLED", 16);
            VIDEO_DISABLED = callEventType17;
            CallEventType callEventType18 = new CallEventType("RELAY_CONNECTION_ESTABLISHED", 17);
            RELAY_CONNECTION_ESTABLISHED = callEventType18;
            CallEventType callEventType19 = new CallEventType("USER_FEEDBACK_RECEIVED", 18);
            USER_FEEDBACK_RECEIVED = callEventType19;
            CallEventType callEventType20 = new CallEventType("SYSTEM_STAT", 19);
            SYSTEM_STAT = callEventType20;
            CallEventType callEventType21 = new CallEventType("GROUP_CALL_JOINED", 20);
            GROUP_CALL_JOINED = callEventType21;
            CallEventType callEventType22 = new CallEventType("MIC_OFF_WHILE_TALKING_ALERT", 21);
            MIC_OFF_WHILE_TALKING_ALERT = callEventType22;
            CallEventType callEventType23 = new CallEventType("MIC_OFF_WHILE_TALKING_ENABLE_CLICK", 22);
            MIC_OFF_WHILE_TALKING_ENABLE_CLICK = callEventType23;
            CallEventType callEventType24 = new CallEventType("VIDEO_DISABLED_DUE_TO_BAD_CONNECTION_ALERT", 23);
            VIDEO_DISABLED_DUE_TO_BAD_CONNECTION_ALERT = callEventType24;
            CallEventType callEventType25 = new CallEventType("CURRENT_USER_BAD_CONNECTION_ALERT", 24);
            CURRENT_USER_BAD_CONNECTION_ALERT = callEventType25;
            CallEventType callEventType26 = new CallEventType("HAND_RAISED", 25);
            HAND_RAISED = callEventType26;
            CallEventType callEventType27 = new CallEventType("HAND_LOWERED", 26);
            HAND_LOWERED = callEventType27;
            CallEventType callEventType28 = new CallEventType("ALL_HANDS_LOWERED", 27);
            ALL_HANDS_LOWERED = callEventType28;
            CallEventType callEventType29 = new CallEventType("USER_HAND_LOWERED", 28);
            USER_HAND_LOWERED = callEventType29;
            CallEventType callEventType30 = new CallEventType("SCREEN_SHARING_STARTED", 29);
            SCREEN_SHARING_STARTED = callEventType30;
            CallEventType callEventType31 = new CallEventType("SCREEN_SHARING_STOPPED", 30);
            SCREEN_SHARING_STOPPED = callEventType31;
            CallEventType callEventType32 = new CallEventType("AUDIO_SHARING_STARTED", 31);
            AUDIO_SHARING_STARTED = callEventType32;
            CallEventType callEventType33 = new CallEventType("AUDIO_SHARING_STOPPED", 32);
            AUDIO_SHARING_STOPPED = callEventType33;
            CallEventType callEventType34 = new CallEventType("SPEAKER_MODE_CHANGED", 33);
            SPEAKER_MODE_CHANGED = callEventType34;
            CallEventType callEventType35 = new CallEventType("USER_PROMO_CLOSED", 34);
            USER_PROMO_CLOSED = callEventType35;
            CallEventType callEventType36 = new CallEventType("VIRTUAL_BACKGROUND_SELECTED", 35);
            VIRTUAL_BACKGROUND_SELECTED = callEventType36;
            CallEventType callEventType37 = new CallEventType("VIRTUAL_BACKGROUND_DISABLED", 36);
            VIRTUAL_BACKGROUND_DISABLED = callEventType37;
            CallEventType callEventType38 = new CallEventType("CALL_STREAMING_CLICK", 37);
            CALL_STREAMING_CLICK = callEventType38;
            CallEventType callEventType39 = new CallEventType("CALL_RECORDING_CLICK", 38);
            CALL_RECORDING_CLICK = callEventType39;
            CallEventType callEventType40 = new CallEventType("CALL_STREAMING_STARTED", 39);
            CALL_STREAMING_STARTED = callEventType40;
            CallEventType callEventType41 = new CallEventType("CALL_STREAMING_STOPPED", 40);
            CALL_STREAMING_STOPPED = callEventType41;
            CallEventType callEventType42 = new CallEventType("CALL_RECORDING_STARTED", 41);
            CALL_RECORDING_STARTED = callEventType42;
            CallEventType callEventType43 = new CallEventType("CALL_RECORDING_STOPPED", 42);
            CALL_RECORDING_STOPPED = callEventType43;
            CallEventType callEventType44 = new CallEventType("CALL_STREAMING_START_FAILED", 43);
            CALL_STREAMING_START_FAILED = callEventType44;
            CallEventType callEventType45 = new CallEventType("CALL_RECORDING_START_FAILED", 44);
            CALL_RECORDING_START_FAILED = callEventType45;
            CallEventType callEventType46 = new CallEventType("ALL_MICS_DISABLED", 45);
            ALL_MICS_DISABLED = callEventType46;
            CallEventType callEventType47 = new CallEventType("ALL_VIDEO_DISABLED", 46);
            ALL_VIDEO_DISABLED = callEventType47;
            CallEventType callEventType48 = new CallEventType("ALL_MICS_AND_VIDEO_DISABLED", 47);
            ALL_MICS_AND_VIDEO_DISABLED = callEventType48;
            CallEventType callEventType49 = new CallEventType("USER_MICS_DISABLED", 48);
            USER_MICS_DISABLED = callEventType49;
            CallEventType callEventType50 = new CallEventType("USER_VIDEO_DISABLED", 49);
            USER_VIDEO_DISABLED = callEventType50;
            CallEventType callEventType51 = new CallEventType("USER_MICS_AND_VIDEO_DISABLED", 50);
            USER_MICS_AND_VIDEO_DISABLED = callEventType51;
            CallEventType callEventType52 = new CallEventType("ASK_ALL_TO_UNMUTE", 51);
            ASK_ALL_TO_UNMUTE = callEventType52;
            CallEventType callEventType53 = new CallEventType("ASK_ALL_TO_UNMUTE_AUDIO", 52);
            ASK_ALL_TO_UNMUTE_AUDIO = callEventType53;
            CallEventType callEventType54 = new CallEventType("ASK_ALL_TO_UNMUTE_VIDEO", 53);
            ASK_ALL_TO_UNMUTE_VIDEO = callEventType54;
            CallEventType callEventType55 = new CallEventType("ASK_USER_TO_UNMUTE", 54);
            ASK_USER_TO_UNMUTE = callEventType55;
            CallEventType callEventType56 = new CallEventType("ASK_USER_TO_UNMUTE_AUDIO", 55);
            ASK_USER_TO_UNMUTE_AUDIO = callEventType56;
            CallEventType callEventType57 = new CallEventType("ASK_USER_TO_UNMUTE_VIDEO", 56);
            ASK_USER_TO_UNMUTE_VIDEO = callEventType57;
            CallEventType callEventType58 = new CallEventType("ASSIGN_ADMIN", 57);
            ASSIGN_ADMIN = callEventType58;
            CallEventType callEventType59 = new CallEventType("RETRIEVE_ADMIN", 58);
            RETRIEVE_ADMIN = callEventType59;
            CallEventType callEventType60 = new CallEventType("ADMIN_PIN", 59);
            ADMIN_PIN = callEventType60;
            CallEventType callEventType61 = new CallEventType("ADMIN_UNPIN", 60);
            ADMIN_UNPIN = callEventType61;
            CallEventType callEventType62 = new CallEventType("BEAUTY_ENABLED", 61);
            BEAUTY_ENABLED = callEventType62;
            CallEventType callEventType63 = new CallEventType("BEAUTY_DISABLED", 62);
            BEAUTY_DISABLED = callEventType63;
            CallEventType callEventType64 = new CallEventType("REQUEST_INTERACTION", 63);
            REQUEST_INTERACTION = callEventType64;
            CallEventType callEventType65 = new CallEventType("REQUEST_INTERACTION_ACCEPTED_REMOTELY", 64);
            REQUEST_INTERACTION_ACCEPTED_REMOTELY = callEventType65;
            CallEventType callEventType66 = new CallEventType("CUSTOM_VIRTUAL_BACKGROUND_SELECTED", 65);
            CUSTOM_VIRTUAL_BACKGROUND_SELECTED = callEventType66;
            CallEventType callEventType67 = new CallEventType("CUSTOM_VIRTUAL_BACKGROUND_ADDED", 66);
            CUSTOM_VIRTUAL_BACKGROUND_ADDED = callEventType67;
            CallEventType callEventType68 = new CallEventType("CUSTOM_VIRTUAL_BACKGROUND_DELETED", 67);
            CUSTOM_VIRTUAL_BACKGROUND_DELETED = callEventType68;
            CallEventType callEventType69 = new CallEventType("GROUP_CALL_JOIN_FORBIDDEN_ANONYM", 68);
            GROUP_CALL_JOIN_FORBIDDEN_ANONYM = callEventType69;
            CallEventType callEventType70 = new CallEventType("GROUP_CALL_JOIN_FAILED", 69);
            GROUP_CALL_JOIN_FAILED = callEventType70;
            CallEventType callEventType71 = new CallEventType("WAITING_ROOM_ENABLED", 70);
            WAITING_ROOM_ENABLED = callEventType71;
            CallEventType callEventType72 = new CallEventType("WAITING_ROOM_DISABLED", 71);
            WAITING_ROOM_DISABLED = callEventType72;
            CallEventType callEventType73 = new CallEventType("PROMOTE_PARTICIPANT_W_R", 72);
            PROMOTE_PARTICIPANT_W_R = callEventType73;
            CallEventType callEventType74 = new CallEventType("REJECT_PARTICIPANT_W_R", 73);
            REJECT_PARTICIPANT_W_R = callEventType74;
            CallEventType callEventType75 = new CallEventType("MASK_ON", 74);
            MASK_ON = callEventType75;
            CallEventType callEventType76 = new CallEventType("MASK_OFF", 75);
            MASK_OFF = callEventType76;
            CallEventType callEventType77 = new CallEventType("CALL_SCHEDULED", 76);
            CALL_SCHEDULED = callEventType77;
            CallEventType callEventType78 = new CallEventType("SCHEDULED_CALL_EDITED", 77);
            SCHEDULED_CALL_EDITED = callEventType78;
            CallEventType callEventType79 = new CallEventType("MIC_ENABLED", 78);
            MIC_ENABLED = callEventType79;
            CallEventType callEventType80 = new CallEventType("MIC_DISABLED", 79);
            MIC_DISABLED = callEventType80;
            CallEventType callEventType81 = new CallEventType("OPEN_CHAT", 80);
            OPEN_CHAT = callEventType81;
            CallEventType callEventType82 = new CallEventType("REACTION_ENABLED", 81);
            REACTION_ENABLED = callEventType82;
            CallEventType callEventType83 = new CallEventType("REACTION_DISABLED", 82);
            REACTION_DISABLED = callEventType83;
            CallEventType callEventType84 = new CallEventType("REACTION_SENT", 83);
            REACTION_SENT = callEventType84;
            CallEventType callEventType85 = new CallEventType("CALL_WATCH_TOGETHER_CLICK", 84);
            CALL_WATCH_TOGETHER_CLICK = callEventType85;
            CallEventType callEventType86 = new CallEventType("CALL_WATCH_TOGETHER_STARTED", 85);
            CALL_WATCH_TOGETHER_STARTED = callEventType86;
            CallEventType callEventType87 = new CallEventType("CALL_WATCH_TOGETHER_STOPPED", 86);
            CALL_WATCH_TOGETHER_STOPPED = callEventType87;
            CallEventType callEventType88 = new CallEventType("CALL_VMOJI_CLICK", 87);
            CALL_VMOJI_CLICK = callEventType88;
            CallEventType callEventType89 = new CallEventType("CALL_VMOJI_STARTED", 88);
            CALL_VMOJI_STARTED = callEventType89;
            CallEventType callEventType90 = new CallEventType("CALL_VMOJI_STOPPED", 89);
            CALL_VMOJI_STOPPED = callEventType90;
            CallEventType callEventType91 = new CallEventType("CALL_VMOJI_START_FAILED", 90);
            CALL_VMOJI_START_FAILED = callEventType91;
            CallEventType callEventType92 = new CallEventType("SESSION_ROOMS_ASK_FOR_HELP", 91);
            SESSION_ROOMS_ASK_FOR_HELP = callEventType92;
            CallEventType callEventType93 = new CallEventType("SESSION_ROOMS_USER_MOVED", 92);
            SESSION_ROOMS_USER_MOVED = callEventType93;
            CallEventType callEventType94 = new CallEventType("SESSION_ROOMS_USER_LEFT", 93);
            SESSION_ROOMS_USER_LEFT = callEventType94;
            CallEventType callEventType95 = new CallEventType("SESSION_ROOMS_AUTO_ALLOCATION", 94);
            SESSION_ROOMS_AUTO_ALLOCATION = callEventType95;
            CallEventType callEventType96 = new CallEventType("SESSION_ROOMS_MANUAL_ALLOCATION", 95);
            SESSION_ROOMS_MANUAL_ALLOCATION = callEventType96;
            CallEventType callEventType97 = new CallEventType("SESSION_ROOMS_OPENED", 96);
            SESSION_ROOMS_OPENED = callEventType97;
            CallEventType callEventType98 = new CallEventType("SESSION_ROOMS_CLOSED", 97);
            SESSION_ROOMS_CLOSED = callEventType98;
            CallEventType callEventType99 = new CallEventType("SESSION_ROOMS_MESSAGE_SENT", 98);
            SESSION_ROOMS_MESSAGE_SENT = callEventType99;
            CallEventType callEventType100 = new CallEventType("SESSION_ROOMS_TIMER_ENABLED", 99);
            SESSION_ROOMS_TIMER_ENABLED = callEventType100;
            CallEventType callEventType101 = new CallEventType("SESSION_ROOMS_CLOSED_USING_TIMER", 100);
            SESSION_ROOMS_CLOSED_USING_TIMER = callEventType101;
            CallEventType callEventType102 = new CallEventType("CALL_PREVIEW_LINK_SHARED", 101);
            CALL_PREVIEW_LINK_SHARED = callEventType102;
            CallEventType callEventType103 = new CallEventType("CALL_PREVIEW_JOINED", 102);
            CALL_PREVIEW_JOINED = callEventType103;
            CallEventType callEventType104 = new CallEventType("CALL_PREVIEW_CAMERA_ENABLED", 103);
            CALL_PREVIEW_CAMERA_ENABLED = callEventType104;
            CallEventType callEventType105 = new CallEventType("CALL_PREVIEW_CAMERA_DISABLED", 104);
            CALL_PREVIEW_CAMERA_DISABLED = callEventType105;
            CallEventType callEventType106 = new CallEventType("CALL_PREVIEW_MIC_ENABLED", 105);
            CALL_PREVIEW_MIC_ENABLED = callEventType106;
            CallEventType callEventType107 = new CallEventType("CALL_PREVIEW_MIC_DISABLED", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            CALL_PREVIEW_MIC_DISABLED = callEventType107;
            CallEventType callEventType108 = new CallEventType("CALL_PREVIEW_QR_PRESSED", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            CALL_PREVIEW_QR_PRESSED = callEventType108;
            CallEventType callEventType109 = new CallEventType("CALL_PREVIEW_BACKGROUND_ENABLED", 108);
            CALL_PREVIEW_BACKGROUND_ENABLED = callEventType109;
            CallEventType callEventType110 = new CallEventType("CALL_PREVIEW_BACKGROUND_DISABLED", 109);
            CALL_PREVIEW_BACKGROUND_DISABLED = callEventType110;
            CallEventType callEventType111 = new CallEventType("CALL_PREVIEW_MASK_ENABLED", 110);
            CALL_PREVIEW_MASK_ENABLED = callEventType111;
            CallEventType callEventType112 = new CallEventType("CALL_PREVIEW_MASK_DISABLED", 111);
            CALL_PREVIEW_MASK_DISABLED = callEventType112;
            CallEventType callEventType113 = new CallEventType("CALL_PREVIEW_VMOJI_ENABLED", 112);
            CALL_PREVIEW_VMOJI_ENABLED = callEventType113;
            CallEventType callEventType114 = new CallEventType("CALL_PREVIEW_VMOJI_DISABLED", 113);
            CALL_PREVIEW_VMOJI_DISABLED = callEventType114;
            CallEventType callEventType115 = new CallEventType("CALL_PREVIEW_VMOJI_CREATED", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            CALL_PREVIEW_VMOJI_CREATED = callEventType115;
            CallEventType callEventType116 = new CallEventType("NAME_CHANGED_BY_USER", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            NAME_CHANGED_BY_USER = callEventType116;
            CallEventType callEventType117 = new CallEventType("NAME_CHANGED_BY_ANONYM", 116);
            NAME_CHANGED_BY_ANONYM = callEventType117;
            CallEventType callEventType118 = new CallEventType("NAME_CHANGED_BY_ADMIN", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            NAME_CHANGED_BY_ADMIN = callEventType118;
            CallEventType callEventType119 = new CallEventType("NAME_CHANGED_BY_COMMUNITY", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            NAME_CHANGED_BY_COMMUNITY = callEventType119;
            CallEventType callEventType120 = new CallEventType("TRANSCRIPTION_STARTED", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            TRANSCRIPTION_STARTED = callEventType120;
            CallEventType callEventType121 = new CallEventType("TRANSCRIPTION_STOPPED", 120);
            TRANSCRIPTION_STOPPED = callEventType121;
            CallEventType callEventType122 = new CallEventType("ONLINE_TRANSCRIPTION_STARTED", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            ONLINE_TRANSCRIPTION_STARTED = callEventType122;
            CallEventType callEventType123 = new CallEventType("ONLINE_TRANSCRIPTION_STOPPED", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            ONLINE_TRANSCRIPTION_STOPPED = callEventType123;
            CallEventType callEventType124 = new CallEventType("GESTURE_REACTION_SENT", 123);
            GESTURE_REACTION_SENT = callEventType124;
            CallEventType callEventType125 = new CallEventType("STEREO_ROOM_CREATED", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            STEREO_ROOM_CREATED = callEventType125;
            CallEventType callEventType126 = new CallEventType("STEREO_ROOM_EDITED", 125);
            STEREO_ROOM_EDITED = callEventType126;
            CallEventType callEventType127 = new CallEventType("STEREO_ROOM_CLOSED", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            STEREO_ROOM_CLOSED = callEventType127;
            CallEventType callEventType128 = new CallEventType("STEREO_ROOM_JOINED", 127);
            STEREO_ROOM_JOINED = callEventType128;
            CallEventType callEventType129 = new CallEventType("STEREO_ROOM_LIVE_JOINED", 128);
            STEREO_ROOM_LIVE_JOINED = callEventType129;
            CallEventType callEventType130 = new CallEventType("STEREO_ROOM_POSTED_IN_PUBLIC", 129);
            STEREO_ROOM_POSTED_IN_PUBLIC = callEventType130;
            CallEventType callEventType131 = new CallEventType("COMPLAIN_ABOUT_STEREO_ROOM", 130);
            COMPLAIN_ABOUT_STEREO_ROOM = callEventType131;
            CallEventType callEventType132 = new CallEventType("STEREO_ROOM_ASSIGN_SPEAKER", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            STEREO_ROOM_ASSIGN_SPEAKER = callEventType132;
            CallEventType callEventType133 = new CallEventType("STEREO_ROOM_RETRIEVE_SPEAKER", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            STEREO_ROOM_RETRIEVE_SPEAKER = callEventType133;
            CallEventType callEventType134 = new CallEventType("CONTACT_INVITED", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            CONTACT_INVITED = callEventType134;
            CallEventType callEventType135 = new CallEventType("CONTACT_JOINED", 134);
            CONTACT_JOINED = callEventType135;
            CallEventType callEventType136 = new CallEventType("CONTACT_DEANONIMIZED", 135);
            CONTACT_DEANONIMIZED = callEventType136;
            CallEventType callEventType137 = new CallEventType("WHITE_BOARD_STARTED", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            WHITE_BOARD_STARTED = callEventType137;
            CallEventType callEventType138 = new CallEventType("WHITE_BOARD_STARTED_REMOTELY", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            WHITE_BOARD_STARTED_REMOTELY = callEventType138;
            CallEventType callEventType139 = new CallEventType("WHITE_BOARD_VIEW_CLICK", 138);
            WHITE_BOARD_VIEW_CLICK = callEventType139;
            CallEventType callEventType140 = new CallEventType("CALL_CREATED", 139);
            CALL_CREATED = callEventType140;
            CallEventType callEventType141 = new CallEventType("APP_UPDATE_SUCCESSFUL", VersionConstants.PRODUCT_MAJOR_VERSION);
            APP_UPDATE_SUCCESSFUL = callEventType141;
            CallEventType callEventType142 = new CallEventType("APP_UPDATE_FAILED", 141);
            APP_UPDATE_FAILED = callEventType142;
            CallEventType callEventType143 = new CallEventType("APP_UPDATE_CANCELLED", 142);
            APP_UPDATE_CANCELLED = callEventType143;
            CallEventType callEventType144 = new CallEventType("APP_UPDATE_AVAILABLE_NOTIFICATION", 143);
            APP_UPDATE_AVAILABLE_NOTIFICATION = callEventType144;
            CallEventType callEventType145 = new CallEventType("APP_UPDATE_REQUESTED", 144);
            APP_UPDATE_REQUESTED = callEventType145;
            CallEventType callEventType146 = new CallEventType("APP_UPDATE_APPROVED", 145);
            APP_UPDATE_APPROVED = callEventType146;
            CallEventType callEventType147 = new CallEventType("APP_UPDATE_DOWNLOAD_SUCCESSFUL", 146);
            APP_UPDATE_DOWNLOAD_SUCCESSFUL = callEventType147;
            CallEventType callEventType148 = new CallEventType("APP_UPDATE_DOWNLOAD_FAILED", 147);
            APP_UPDATE_DOWNLOAD_FAILED = callEventType148;
            CallEventType callEventType149 = new CallEventType("APP_UPDATE_DOWNLOAD_FOUND_IN_CACHE", 148);
            APP_UPDATE_DOWNLOAD_FOUND_IN_CACHE = callEventType149;
            CallEventType callEventType150 = new CallEventType("APP_UPDATE_PROCESS_DROPPED", 149);
            APP_UPDATE_PROCESS_DROPPED = callEventType150;
            CallEventType callEventType151 = new CallEventType("APP_UPDATE_READY_TO_INSTALL_NOTIFICATION", 150);
            APP_UPDATE_READY_TO_INSTALL_NOTIFICATION = callEventType151;
            CallEventType callEventType152 = new CallEventType("APP_UPDATE_FORCED", 151);
            APP_UPDATE_FORCED = callEventType152;
            CallEventType callEventType153 = new CallEventType("APP_UPDATE_DEFERRED", 152);
            APP_UPDATE_DEFERRED = callEventType153;
            CallEventType callEventType154 = new CallEventType("CALL_NOTIFICATION_RECEIVED", 153);
            CALL_NOTIFICATION_RECEIVED = callEventType154;
            CallEventType callEventType155 = new CallEventType("CALL_LINK_QR_CODE_CLICK", 154);
            CALL_LINK_QR_CODE_CLICK = callEventType155;
            CallEventType callEventType156 = new CallEventType("CALL_LINK_QR_CODE_SHARED", 155);
            CALL_LINK_QR_CODE_SHARED = callEventType156;
            CallEventType callEventType157 = new CallEventType("CALL_SHORT_LINK_SHARED", 156);
            CALL_SHORT_LINK_SHARED = callEventType157;
            CallEventType callEventType158 = new CallEventType("ALL_WATCH_TOGETHER_DISABLED", 157);
            ALL_WATCH_TOGETHER_DISABLED = callEventType158;
            CallEventType callEventType159 = new CallEventType("USER_WATCH_TOGETHER_DISABLED", 158);
            USER_WATCH_TOGETHER_DISABLED = callEventType159;
            CallEventType callEventType160 = new CallEventType("ALL_SCREEN_SHARING_DISABLED", 159);
            ALL_SCREEN_SHARING_DISABLED = callEventType160;
            CallEventType callEventType161 = new CallEventType("USER_SCREEN_SHARING_DISABLED", 160);
            USER_SCREEN_SHARING_DISABLED = callEventType161;
            CallEventType callEventType162 = new CallEventType("CALL_HISTORY_DELETE_ALL", 161);
            CALL_HISTORY_DELETE_ALL = callEventType162;
            CallEventType callEventType163 = new CallEventType("CALL_HISTORY_DELETE_SINGLE", 162);
            CALL_HISTORY_DELETE_SINGLE = callEventType163;
            CallEventType callEventType164 = new CallEventType("CALL_HISTORY_SHOW_EDIT_SCREEN", 163);
            CALL_HISTORY_SHOW_EDIT_SCREEN = callEventType164;
            CallEventType callEventType165 = new CallEventType("CALL_HISTORY_DELETE_SELECTED", 164);
            CALL_HISTORY_DELETE_SELECTED = callEventType165;
            CallEventType callEventType166 = new CallEventType("CALL_CHAT_HISTORY_TOGGLED", 165);
            CALL_CHAT_HISTORY_TOGGLED = callEventType166;
            CallEventType callEventType167 = new CallEventType("CALL_NOTIFICATION_SHOW_FAILED", 166);
            CALL_NOTIFICATION_SHOW_FAILED = callEventType167;
            CallEventType[] callEventTypeArr = {callEventType, callEventType2, callEventType3, callEventType4, callEventType5, callEventType6, callEventType7, callEventType8, callEventType9, callEventType10, callEventType11, callEventType12, callEventType13, callEventType14, callEventType15, callEventType16, callEventType17, callEventType18, callEventType19, callEventType20, callEventType21, callEventType22, callEventType23, callEventType24, callEventType25, callEventType26, callEventType27, callEventType28, callEventType29, callEventType30, callEventType31, callEventType32, callEventType33, callEventType34, callEventType35, callEventType36, callEventType37, callEventType38, callEventType39, callEventType40, callEventType41, callEventType42, callEventType43, callEventType44, callEventType45, callEventType46, callEventType47, callEventType48, callEventType49, callEventType50, callEventType51, callEventType52, callEventType53, callEventType54, callEventType55, callEventType56, callEventType57, callEventType58, callEventType59, callEventType60, callEventType61, callEventType62, callEventType63, callEventType64, callEventType65, callEventType66, callEventType67, callEventType68, callEventType69, callEventType70, callEventType71, callEventType72, callEventType73, callEventType74, callEventType75, callEventType76, callEventType77, callEventType78, callEventType79, callEventType80, callEventType81, callEventType82, callEventType83, callEventType84, callEventType85, callEventType86, callEventType87, callEventType88, callEventType89, callEventType90, callEventType91, callEventType92, callEventType93, callEventType94, callEventType95, callEventType96, callEventType97, callEventType98, callEventType99, callEventType100, callEventType101, callEventType102, callEventType103, callEventType104, callEventType105, callEventType106, callEventType107, callEventType108, callEventType109, callEventType110, callEventType111, callEventType112, callEventType113, callEventType114, callEventType115, callEventType116, callEventType117, callEventType118, callEventType119, callEventType120, callEventType121, callEventType122, callEventType123, callEventType124, callEventType125, callEventType126, callEventType127, callEventType128, callEventType129, callEventType130, callEventType131, callEventType132, callEventType133, callEventType134, callEventType135, callEventType136, callEventType137, callEventType138, callEventType139, callEventType140, callEventType141, callEventType142, callEventType143, callEventType144, callEventType145, callEventType146, callEventType147, callEventType148, callEventType149, callEventType150, callEventType151, callEventType152, callEventType153, callEventType154, callEventType155, callEventType156, callEventType157, callEventType158, callEventType159, callEventType160, callEventType161, callEventType162, callEventType163, callEventType164, callEventType165, callEventType166, callEventType167};
            $VALUES = callEventTypeArr;
            $ENTRIES = new asp(callEventTypeArr);
        }

        private CallEventType(String str, int i) {
        }

        public static CallEventType valueOf(String str) {
            return (CallEventType) Enum.valueOf(CallEventType.class, str);
        }

        public static CallEventType[] values() {
            return (CallEventType[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsCallsStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsCallsStat$TypeVoipCallItem>, a9y<MobileOfficialAppsCallsStat$TypeVoipCallItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            CallEventType callEventType = (CallEventType) dq.f(x9yVar, "call_event_type", tru.a(), CallEventType.class);
            String s = fai.s(x9yVar, "event_client_microsec");
            String s2 = fai.s(x9yVar, "session_id");
            String s3 = fai.s(x9yVar, "peer_id");
            String s4 = fai.s(x9yVar, "lib_version");
            boolean m = fai.m(x9yVar, "is_group_call");
            Gson a = tru.a();
            b9y q = x9yVar.q("source");
            Source source = (Source) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Source.class));
            Integer A = fai.A(x9yVar, "group_call_users_count");
            Integer A2 = fai.A(x9yVar, "user_response");
            String C = fai.C(x9yVar, "reason");
            Integer A3 = fai.A(x9yVar, "error");
            Integer A4 = fai.A(x9yVar, "event_param");
            String C2 = fai.C(x9yVar, "relay_ip");
            Integer A5 = fai.A(x9yVar, "background_id");
            Integer A6 = fai.A(x9yVar, "vid");
            Long B = fai.B(x9yVar, "owner_id");
            Integer A7 = fai.A(x9yVar, "upcoming");
            Integer A8 = fai.A(x9yVar, "mute_permanent");
            String C3 = fai.C(x9yVar, "reaction_type");
            Boolean y = fai.y(x9yVar, "has_network");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("feedback");
            List list = (List) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(x9yVar.q("feedback").k(), new zt20().getType()));
            String C4 = fai.C(x9yVar, "custom_feedback");
            Long B2 = fai.B(x9yVar, "group_id");
            Integer A9 = fai.A(x9yVar, "intensity");
            Long B3 = fai.B(x9yVar, "mask_id");
            Long B4 = fai.B(x9yVar, "mask_owner_id");
            Integer A10 = fai.A(x9yVar, "mask_duration");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("sharing_channel");
            return new MobileOfficialAppsCallsStat$TypeVoipCallItem(callEventType, s, s2, s3, s4, m, source, A, A2, C, A3, A4, C2, A5, A6, B, A7, A8, C3, y, list, C4, B2, A9, B3, B4, A10, (SharingChannel) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), SharingChannel.class)), fai.A(x9yVar, "hall_id"), fai.A(x9yVar, "hall_count"), fai.A(x9yVar, "mini_app_id"), fai.y(x9yVar, "is_user_anon"), fai.y(x9yVar, "is_contact"), fai.y(x9yVar, "is_room"), fai.A(x9yVar, "stereo_room_speakers_count"), fai.C(x9yVar, "error_type"), fai.A(x9yVar, "user_time_sec"), fai.y(x9yVar, "is_autoupdate"), fai.B(x9yVar, "notification_id"), fai.A(x9yVar, "notification_try_id"), fai.C(x9yVar, "screen"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem = (MobileOfficialAppsCallsStat$TypeVoipCallItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("call_event_type", tru.a().toJson(mobileOfficialAppsCallsStat$TypeVoipCallItem.b()));
            x9yVar.o("event_client_microsec", mobileOfficialAppsCallsStat$TypeVoipCallItem.f());
            x9yVar.o("session_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.B());
            x9yVar.o("peer_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.x());
            x9yVar.o("lib_version", mobileOfficialAppsCallsStat$TypeVoipCallItem.o());
            x9yVar.m(Boolean.valueOf(mobileOfficialAppsCallsStat$TypeVoipCallItem.L()), "is_group_call");
            x9yVar.o("source", tru.a().toJson(mobileOfficialAppsCallsStat$TypeVoipCallItem.D()));
            x9yVar.n("group_call_users_count", mobileOfficialAppsCallsStat$TypeVoipCallItem.i());
            x9yVar.n("user_response", mobileOfficialAppsCallsStat$TypeVoipCallItem.G());
            x9yVar.o("reason", mobileOfficialAppsCallsStat$TypeVoipCallItem.a);
            x9yVar.n("error", mobileOfficialAppsCallsStat$TypeVoipCallItem.d());
            x9yVar.n("event_param", mobileOfficialAppsCallsStat$TypeVoipCallItem.g());
            x9yVar.o("relay_ip", mobileOfficialAppsCallsStat$TypeVoipCallItem.z());
            x9yVar.n("background_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.a());
            x9yVar.n("vid", mobileOfficialAppsCallsStat$TypeVoipCallItem.I());
            x9yVar.n("owner_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.w());
            x9yVar.n("upcoming", mobileOfficialAppsCallsStat$TypeVoipCallItem.F());
            x9yVar.n("mute_permanent", mobileOfficialAppsCallsStat$TypeVoipCallItem.t());
            x9yVar.o("reaction_type", mobileOfficialAppsCallsStat$TypeVoipCallItem.y());
            x9yVar.m(mobileOfficialAppsCallsStat$TypeVoipCallItem.m(), "has_network");
            x9yVar.o("feedback", tru.a().toJson(mobileOfficialAppsCallsStat$TypeVoipCallItem.h()));
            x9yVar.o("custom_feedback", mobileOfficialAppsCallsStat$TypeVoipCallItem.c());
            x9yVar.n("group_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.j());
            x9yVar.n("intensity", mobileOfficialAppsCallsStat$TypeVoipCallItem.n());
            x9yVar.n("mask_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.q());
            x9yVar.n("mask_owner_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.r());
            x9yVar.n("mask_duration", mobileOfficialAppsCallsStat$TypeVoipCallItem.p());
            x9yVar.o("sharing_channel", tru.a().toJson(mobileOfficialAppsCallsStat$TypeVoipCallItem.C()));
            x9yVar.n("hall_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.l());
            x9yVar.n("hall_count", mobileOfficialAppsCallsStat$TypeVoipCallItem.k());
            x9yVar.n("mini_app_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.s());
            x9yVar.m(mobileOfficialAppsCallsStat$TypeVoipCallItem.N(), "is_user_anon");
            x9yVar.m(mobileOfficialAppsCallsStat$TypeVoipCallItem.K(), "is_contact");
            x9yVar.m(mobileOfficialAppsCallsStat$TypeVoipCallItem.M(), "is_room");
            x9yVar.n("stereo_room_speakers_count", mobileOfficialAppsCallsStat$TypeVoipCallItem.E());
            x9yVar.o("error_type", mobileOfficialAppsCallsStat$TypeVoipCallItem.e());
            x9yVar.n("user_time_sec", mobileOfficialAppsCallsStat$TypeVoipCallItem.H());
            x9yVar.m(mobileOfficialAppsCallsStat$TypeVoipCallItem.J(), "is_autoupdate");
            x9yVar.n("notification_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.u());
            x9yVar.n("notification_try_id", mobileOfficialAppsCallsStat$TypeVoipCallItem.v());
            x9yVar.o("screen", mobileOfficialAppsCallsStat$TypeVoipCallItem.A());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    /* loaded from: classes5.dex */
    public static final class SharingChannel {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SharingChannel[] $VALUES;

        @pmi0("calendar")
        public static final SharingChannel CALENDAR;

        @pmi0("email")
        public static final SharingChannel EMAIL;

        @pmi0("other")
        public static final SharingChannel OTHER;

        static {
            SharingChannel sharingChannel = new SharingChannel("CALENDAR", 0);
            CALENDAR = sharingChannel;
            SharingChannel sharingChannel2 = new SharingChannel(CommonConstant.RETKEY.EMAIL, 1);
            EMAIL = sharingChannel2;
            SharingChannel sharingChannel3 = new SharingChannel(NativeAdContent.ViewTag.OTHER, 2);
            OTHER = sharingChannel3;
            SharingChannel[] sharingChannelArr = {sharingChannel, sharingChannel2, sharingChannel3};
            $VALUES = sharingChannelArr;
            $ENTRIES = new asp(sharingChannelArr);
        }

        private SharingChannel(String str, int i) {
        }

        public static SharingChannel valueOf(String str) {
            return (SharingChannel) Enum.valueOf(SharingChannel.class, str);
        }

        public static SharingChannel[] values() {
            return (SharingChannel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCallsStat.kt */
    /* loaded from: classes5.dex */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("app_recents")
        public static final Source APP_RECENTS;

        @pmi0("by_link")
        public static final Source BY_LINK;

        @pmi0("calls_contacts")
        public static final Source CALLS_CONTACTS;

        @pmi0("calls_services")
        public static final Source CALLS_SERVICES;

        @pmi0("calls_services_empty_search")
        public static final Source CALLS_SERVICES_EMPTY_SEARCH;

        @pmi0("community_button")
        public static final Source COMMUNITY_BUTTON;

        @pmi0("deeplink")
        public static final Source DEEPLINK;

        @pmi0("friends_list")
        public static final Source FRIENDS_LIST;

        @pmi0("friends_list_search")
        public static final Source FRIENDS_LIST_SEARCH;

        @pmi0("from_busy_state")
        public static final Source FROM_BUSY_STATE;

        @pmi0("history")
        public static final Source HISTORY;

        @pmi0("history_create")
        public static final Source HISTORY_CREATE;

        @pmi0("history_create_me_button")
        public static final Source HISTORY_CREATE_ME_BUTTON;

        @pmi0("history_create_me_tab")
        public static final Source HISTORY_CREATE_ME_TAB;

        @pmi0("history_create_services")
        public static final Source HISTORY_CREATE_SERVICES;

        @pmi0("history_create_url")
        public static final Source HISTORY_CREATE_URL;

        @pmi0("history_friends_list")
        public static final Source HISTORY_FRIENDS_LIST;

        @pmi0("history_friends_list_me_button")
        public static final Source HISTORY_FRIENDS_LIST_ME_BUTTON;

        @pmi0("history_friends_list_me_tab")
        public static final Source HISTORY_FRIENDS_LIST_ME_TAB;

        @pmi0("history_friends_list_services")
        public static final Source HISTORY_FRIENDS_LIST_SERVICES;

        @pmi0("history_friends_list_url")
        public static final Source HISTORY_FRIENDS_LIST_URL;

        @pmi0("history_me_button")
        public static final Source HISTORY_ME_BUTTON;

        @pmi0("history_me_tab")
        public static final Source HISTORY_ME_TAB;

        @pmi0("history_services")
        public static final Source HISTORY_SERVICES;

        @pmi0("history_url")
        public static final Source HISTORY_URL;

        @pmi0("im_create")
        public static final Source IM_CREATE;

        @pmi0("im_header")
        public static final Source IM_HEADER;

        @pmi0("im_join_header")
        public static final Source IM_JOIN_HEADER;

        @pmi0("im_join_message")
        public static final Source IM_JOIN_MESSAGE;

        @pmi0("im_message")
        public static final Source IM_MESSAGE;

        @pmi0("im_messages_user_profile")
        public static final Source IM_MESSAGES_USER_PROFILE;

        @pmi0("join_deeplink")
        public static final Source JOIN_DEEPLINK;

        @pmi0("longpoll")
        public static final Source LONGPOLL;

        @pmi0("marusia")
        public static final Source MARUSIA;

        @pmi0("mini_app")
        public static final Source MINI_APP;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final Source PROFILE;

        @pmi0("push")
        public static final Source PUSH;

        @pmi0("queue")
        public static final Source QUEUE;

        @pmi0("story_invite_birthday")
        public static final Source STORY_INVITE_BIRTHDAY;

        @pmi0("system_profile")
        public static final Source SYSTEM_PROFILE;

        @pmi0("system_recents")
        public static final Source SYSTEM_RECENTS;

        @pmi0("user_promo")
        public static final Source USER_PROMO;

        static {
            Source source = new Source("IM_HEADER", 0);
            IM_HEADER = source;
            Source source2 = new Source("IM_MESSAGE", 1);
            IM_MESSAGE = source2;
            Source source3 = new Source("SYSTEM_PROFILE", 2);
            SYSTEM_PROFILE = source3;
            Source source4 = new Source("COMMUNITY_BUTTON", 3);
            COMMUNITY_BUTTON = source4;
            Source source5 = new Source("PROFILE", 4);
            PROFILE = source5;
            Source source6 = new Source("FROM_BUSY_STATE", 5);
            FROM_BUSY_STATE = source6;
            Source source7 = new Source("IM_JOIN_MESSAGE", 6);
            IM_JOIN_MESSAGE = source7;
            Source source8 = new Source("IM_JOIN_HEADER", 7);
            IM_JOIN_HEADER = source8;
            Source source9 = new Source("IM_CREATE", 8);
            IM_CREATE = source9;
            Source source10 = new Source("SYSTEM_RECENTS", 9);
            SYSTEM_RECENTS = source10;
            Source source11 = new Source("DEEPLINK", 10);
            DEEPLINK = source11;
            Source source12 = new Source("PUSH", 11);
            PUSH = source12;
            Source source13 = new Source("QUEUE", 12);
            QUEUE = source13;
            Source source14 = new Source("LONGPOLL", 13);
            LONGPOLL = source14;
            Source source15 = new Source("IM_MESSAGES_USER_PROFILE", 14);
            IM_MESSAGES_USER_PROFILE = source15;
            Source source16 = new Source("JOIN_DEEPLINK", 15);
            JOIN_DEEPLINK = source16;
            Source source17 = new Source("APP_RECENTS", 16);
            APP_RECENTS = source17;
            Source source18 = new Source("USER_PROMO", 17);
            USER_PROMO = source18;
            Source source19 = new Source("STORY_INVITE_BIRTHDAY", 18);
            STORY_INVITE_BIRTHDAY = source19;
            Source source20 = new Source("FRIENDS_LIST", 19);
            FRIENDS_LIST = source20;
            Source source21 = new Source("FRIENDS_LIST_SEARCH", 20);
            FRIENDS_LIST_SEARCH = source21;
            Source source22 = new Source("MARUSIA", 21);
            MARUSIA = source22;
            Source source23 = new Source("HISTORY", 22);
            HISTORY = source23;
            Source source24 = new Source("HISTORY_FRIENDS_LIST", 23);
            HISTORY_FRIENDS_LIST = source24;
            Source source25 = new Source("HISTORY_CREATE", 24);
            HISTORY_CREATE = source25;
            Source source26 = new Source("HISTORY_URL", 25);
            HISTORY_URL = source26;
            Source source27 = new Source("HISTORY_FRIENDS_LIST_URL", 26);
            HISTORY_FRIENDS_LIST_URL = source27;
            Source source28 = new Source("HISTORY_CREATE_URL", 27);
            HISTORY_CREATE_URL = source28;
            Source source29 = new Source("HISTORY_ME_BUTTON", 28);
            HISTORY_ME_BUTTON = source29;
            Source source30 = new Source("HISTORY_FRIENDS_LIST_ME_BUTTON", 29);
            HISTORY_FRIENDS_LIST_ME_BUTTON = source30;
            Source source31 = new Source("HISTORY_CREATE_ME_BUTTON", 30);
            HISTORY_CREATE_ME_BUTTON = source31;
            Source source32 = new Source("HISTORY_ME_TAB", 31);
            HISTORY_ME_TAB = source32;
            Source source33 = new Source("HISTORY_FRIENDS_LIST_ME_TAB", 32);
            HISTORY_FRIENDS_LIST_ME_TAB = source33;
            Source source34 = new Source("HISTORY_CREATE_ME_TAB", 33);
            HISTORY_CREATE_ME_TAB = source34;
            Source source35 = new Source("HISTORY_SERVICES", 34);
            HISTORY_SERVICES = source35;
            Source source36 = new Source("HISTORY_FRIENDS_LIST_SERVICES", 35);
            HISTORY_FRIENDS_LIST_SERVICES = source36;
            Source source37 = new Source("HISTORY_CREATE_SERVICES", 36);
            HISTORY_CREATE_SERVICES = source37;
            Source source38 = new Source("CALLS_CONTACTS", 37);
            CALLS_CONTACTS = source38;
            Source source39 = new Source("MINI_APP", 38);
            MINI_APP = source39;
            Source source40 = new Source("BY_LINK", 39);
            BY_LINK = source40;
            Source source41 = new Source("CALLS_SERVICES", 40);
            CALLS_SERVICES = source41;
            Source source42 = new Source("CALLS_SERVICES_EMPTY_SEARCH", 41);
            CALLS_SERVICES_EMPTY_SEARCH = source42;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9, source10, source11, source12, source13, source14, source15, source16, source17, source18, source19, source20, source21, source22, source23, source24, source25, source26, source27, source28, source29, source30, source31, source32, source33, source34, source35, source36, source37, source38, source39, source40, source41, source42};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCallsStat$TypeVoipCallItem(CallEventType callEventType, String str, String str2, String str3, String str4, boolean z, Source source, Integer num, Integer num2, String str5, Integer num3, Integer num4, String str6, Integer num5, Integer num6, Long l, Integer num7, Integer num8, String str7, Boolean bool, List<String> list, String str8, Long l2, Integer num9, Long l3, Long l4, Integer num10, SharingChannel sharingChannel, Integer num11, Integer num12, Integer num13, Boolean bool2, Boolean bool3, Boolean bool4, Integer num14, String str9, Integer num15, Boolean bool5, Long l5, Integer num16, String str10) {
        this.callEventType = callEventType;
        this.eventClientMicrosec = str;
        this.sessionId = str2;
        this.peerId = str3;
        this.libVersion = str4;
        this.isGroupCall = z;
        this.source = source;
        this.groupCallUsersCount = num;
        this.userResponse = num2;
        this.a = str5;
        this.error = num3;
        this.eventParam = num4;
        this.relayIp = str6;
        this.backgroundId = num5;
        this.vid = num6;
        this.ownerId = l;
        this.upcoming = num7;
        this.mutePermanent = num8;
        this.reactionType = str7;
        this.hasNetwork = bool;
        this.feedback = list;
        this.customFeedback = str8;
        this.groupId = l2;
        this.intensity = num9;
        this.maskId = l3;
        this.maskOwnerId = l4;
        this.maskDuration = num10;
        this.sharingChannel = sharingChannel;
        this.hallId = num11;
        this.hallCount = num12;
        this.miniAppId = num13;
        this.isUserAnon = bool2;
        this.isContact = bool3;
        this.isRoom = bool4;
        this.stereoRoomSpeakersCount = num14;
        this.errorType = str9;
        this.userTimeSec = num15;
        this.isAutoupdate = bool5;
        this.notificationId = l5;
        this.notificationTryId = num16;
        this.screen = str10;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredReason = filteredString;
        filteredString.a(str5);
    }

    public final String A() {
        return this.screen;
    }

    public final String B() {
        return this.sessionId;
    }

    public final SharingChannel C() {
        return this.sharingChannel;
    }

    public final Source D() {
        return this.source;
    }

    public final Integer E() {
        return this.stereoRoomSpeakersCount;
    }

    public final Integer F() {
        return this.upcoming;
    }

    public final Integer G() {
        return this.userResponse;
    }

    public final Integer H() {
        return this.userTimeSec;
    }

    public final Integer I() {
        return this.vid;
    }

    public final Boolean J() {
        return this.isAutoupdate;
    }

    public final Boolean K() {
        return this.isContact;
    }

    public final boolean L() {
        return this.isGroupCall;
    }

    public final Boolean M() {
        return this.isRoom;
    }

    public final Boolean N() {
        return this.isUserAnon;
    }

    public final Integer a() {
        return this.backgroundId;
    }

    public final CallEventType b() {
        return this.callEventType;
    }

    public final String c() {
        return this.customFeedback;
    }

    public final Integer d() {
        return this.error;
    }

    public final String e() {
        return this.errorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipCallItem)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipCallItem mobileOfficialAppsCallsStat$TypeVoipCallItem = (MobileOfficialAppsCallsStat$TypeVoipCallItem) obj;
        return this.callEventType == mobileOfficialAppsCallsStat$TypeVoipCallItem.callEventType && epx.f(this.eventClientMicrosec, mobileOfficialAppsCallsStat$TypeVoipCallItem.eventClientMicrosec) && epx.f(this.sessionId, mobileOfficialAppsCallsStat$TypeVoipCallItem.sessionId) && epx.f(this.peerId, mobileOfficialAppsCallsStat$TypeVoipCallItem.peerId) && epx.f(this.libVersion, mobileOfficialAppsCallsStat$TypeVoipCallItem.libVersion) && this.isGroupCall == mobileOfficialAppsCallsStat$TypeVoipCallItem.isGroupCall && this.source == mobileOfficialAppsCallsStat$TypeVoipCallItem.source && epx.f(this.groupCallUsersCount, mobileOfficialAppsCallsStat$TypeVoipCallItem.groupCallUsersCount) && epx.f(this.userResponse, mobileOfficialAppsCallsStat$TypeVoipCallItem.userResponse) && epx.f(this.a, mobileOfficialAppsCallsStat$TypeVoipCallItem.a) && epx.f(this.error, mobileOfficialAppsCallsStat$TypeVoipCallItem.error) && epx.f(this.eventParam, mobileOfficialAppsCallsStat$TypeVoipCallItem.eventParam) && epx.f(this.relayIp, mobileOfficialAppsCallsStat$TypeVoipCallItem.relayIp) && epx.f(this.backgroundId, mobileOfficialAppsCallsStat$TypeVoipCallItem.backgroundId) && epx.f(this.vid, mobileOfficialAppsCallsStat$TypeVoipCallItem.vid) && epx.f(this.ownerId, mobileOfficialAppsCallsStat$TypeVoipCallItem.ownerId) && epx.f(this.upcoming, mobileOfficialAppsCallsStat$TypeVoipCallItem.upcoming) && epx.f(this.mutePermanent, mobileOfficialAppsCallsStat$TypeVoipCallItem.mutePermanent) && epx.f(this.reactionType, mobileOfficialAppsCallsStat$TypeVoipCallItem.reactionType) && epx.f(this.hasNetwork, mobileOfficialAppsCallsStat$TypeVoipCallItem.hasNetwork) && epx.f(this.feedback, mobileOfficialAppsCallsStat$TypeVoipCallItem.feedback) && epx.f(this.customFeedback, mobileOfficialAppsCallsStat$TypeVoipCallItem.customFeedback) && epx.f(this.groupId, mobileOfficialAppsCallsStat$TypeVoipCallItem.groupId) && epx.f(this.intensity, mobileOfficialAppsCallsStat$TypeVoipCallItem.intensity) && epx.f(this.maskId, mobileOfficialAppsCallsStat$TypeVoipCallItem.maskId) && epx.f(this.maskOwnerId, mobileOfficialAppsCallsStat$TypeVoipCallItem.maskOwnerId) && epx.f(this.maskDuration, mobileOfficialAppsCallsStat$TypeVoipCallItem.maskDuration) && this.sharingChannel == mobileOfficialAppsCallsStat$TypeVoipCallItem.sharingChannel && epx.f(this.hallId, mobileOfficialAppsCallsStat$TypeVoipCallItem.hallId) && epx.f(this.hallCount, mobileOfficialAppsCallsStat$TypeVoipCallItem.hallCount) && epx.f(this.miniAppId, mobileOfficialAppsCallsStat$TypeVoipCallItem.miniAppId) && epx.f(this.isUserAnon, mobileOfficialAppsCallsStat$TypeVoipCallItem.isUserAnon) && epx.f(this.isContact, mobileOfficialAppsCallsStat$TypeVoipCallItem.isContact) && epx.f(this.isRoom, mobileOfficialAppsCallsStat$TypeVoipCallItem.isRoom) && epx.f(this.stereoRoomSpeakersCount, mobileOfficialAppsCallsStat$TypeVoipCallItem.stereoRoomSpeakersCount) && epx.f(this.errorType, mobileOfficialAppsCallsStat$TypeVoipCallItem.errorType) && epx.f(this.userTimeSec, mobileOfficialAppsCallsStat$TypeVoipCallItem.userTimeSec) && epx.f(this.isAutoupdate, mobileOfficialAppsCallsStat$TypeVoipCallItem.isAutoupdate) && epx.f(this.notificationId, mobileOfficialAppsCallsStat$TypeVoipCallItem.notificationId) && epx.f(this.notificationTryId, mobileOfficialAppsCallsStat$TypeVoipCallItem.notificationTryId) && epx.f(this.screen, mobileOfficialAppsCallsStat$TypeVoipCallItem.screen);
    }

    public final String f() {
        return this.eventClientMicrosec;
    }

    public final Integer g() {
        return this.eventParam;
    }

    public final List<String> h() {
        return this.feedback;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(this.callEventType.hashCode() * 31, 31, this.eventClientMicrosec), 31, this.sessionId), 31, this.peerId), 31, this.libVersion), 31, this.isGroupCall);
        Source source = this.source;
        int hashCode = (b + (source == null ? 0 : source.hashCode())) * 31;
        Integer num = this.groupCallUsersCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.userResponse;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.a;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.error;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.eventParam;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.relayIp;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.backgroundId;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.vid;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num7 = this.upcoming;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.mutePermanent;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str3 = this.reactionType;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hasNetwork;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.feedback;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.customFeedback;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.groupId;
        int hashCode17 = (hashCode16 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num9 = this.intensity;
        int hashCode18 = (hashCode17 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Long l3 = this.maskId;
        int hashCode19 = (hashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.maskOwnerId;
        int hashCode20 = (hashCode19 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num10 = this.maskDuration;
        int hashCode21 = (hashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        SharingChannel sharingChannel = this.sharingChannel;
        int hashCode22 = (hashCode21 + (sharingChannel == null ? 0 : sharingChannel.hashCode())) * 31;
        Integer num11 = this.hallId;
        int hashCode23 = (hashCode22 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.hallCount;
        int hashCode24 = (hashCode23 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.miniAppId;
        int hashCode25 = (hashCode24 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Boolean bool2 = this.isUserAnon;
        int hashCode26 = (hashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isContact;
        int hashCode27 = (hashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isRoom;
        int hashCode28 = (hashCode27 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num14 = this.stereoRoomSpeakersCount;
        int hashCode29 = (hashCode28 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str5 = this.errorType;
        int hashCode30 = (hashCode29 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num15 = this.userTimeSec;
        int hashCode31 = (hashCode30 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Boolean bool5 = this.isAutoupdate;
        int hashCode32 = (hashCode31 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l5 = this.notificationId;
        int hashCode33 = (hashCode32 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num16 = this.notificationTryId;
        int hashCode34 = (hashCode33 + (num16 == null ? 0 : num16.hashCode())) * 31;
        String str6 = this.screen;
        return hashCode34 + (str6 != null ? str6.hashCode() : 0);
    }

    public final Integer i() {
        return this.groupCallUsersCount;
    }

    public final Long j() {
        return this.groupId;
    }

    public final Integer k() {
        return this.hallCount;
    }

    public final Integer l() {
        return this.hallId;
    }

    public final Boolean m() {
        return this.hasNetwork;
    }

    public final Integer n() {
        return this.intensity;
    }

    public final String o() {
        return this.libVersion;
    }

    public final Integer p() {
        return this.maskDuration;
    }

    public final Long q() {
        return this.maskId;
    }

    public final Long r() {
        return this.maskOwnerId;
    }

    public final Integer s() {
        return this.miniAppId;
    }

    public final Integer t() {
        return this.mutePermanent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVoipCallItem(callEventType=");
        sb.append(this.callEventType);
        sb.append(", eventClientMicrosec=");
        sb.append(this.eventClientMicrosec);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", libVersion=");
        sb.append(this.libVersion);
        sb.append(", isGroupCall=");
        sb.append(this.isGroupCall);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", groupCallUsersCount=");
        sb.append(this.groupCallUsersCount);
        sb.append(", userResponse=");
        sb.append(this.userResponse);
        sb.append(", reason=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", eventParam=");
        sb.append(this.eventParam);
        sb.append(", relayIp=");
        sb.append(this.relayIp);
        sb.append(", backgroundId=");
        sb.append(this.backgroundId);
        sb.append(", vid=");
        sb.append(this.vid);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", upcoming=");
        sb.append(this.upcoming);
        sb.append(", mutePermanent=");
        sb.append(this.mutePermanent);
        sb.append(", reactionType=");
        sb.append(this.reactionType);
        sb.append(", hasNetwork=");
        sb.append(this.hasNetwork);
        sb.append(", feedback=");
        sb.append(this.feedback);
        sb.append(", customFeedback=");
        sb.append(this.customFeedback);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", intensity=");
        sb.append(this.intensity);
        sb.append(", maskId=");
        sb.append(this.maskId);
        sb.append(", maskOwnerId=");
        sb.append(this.maskOwnerId);
        sb.append(", maskDuration=");
        sb.append(this.maskDuration);
        sb.append(", sharingChannel=");
        sb.append(this.sharingChannel);
        sb.append(", hallId=");
        sb.append(this.hallId);
        sb.append(", hallCount=");
        sb.append(this.hallCount);
        sb.append(", miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", isUserAnon=");
        sb.append(this.isUserAnon);
        sb.append(", isContact=");
        sb.append(this.isContact);
        sb.append(", isRoom=");
        sb.append(this.isRoom);
        sb.append(", stereoRoomSpeakersCount=");
        sb.append(this.stereoRoomSpeakersCount);
        sb.append(", errorType=");
        sb.append(this.errorType);
        sb.append(", userTimeSec=");
        sb.append(this.userTimeSec);
        sb.append(", isAutoupdate=");
        sb.append(this.isAutoupdate);
        sb.append(", notificationId=");
        sb.append(this.notificationId);
        sb.append(", notificationTryId=");
        sb.append(this.notificationTryId);
        sb.append(", screen=");
        return ho8.a(sb, this.screen, ')');
    }

    public final Long u() {
        return this.notificationId;
    }

    public final Integer v() {
        return this.notificationTryId;
    }

    public final Long w() {
        return this.ownerId;
    }

    public final String x() {
        return this.peerId;
    }

    public final String y() {
        return this.reactionType;
    }

    public final String z() {
        return this.relayIp;
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeVoipCallItem(CallEventType callEventType, String str, String str2, String str3, String str4, boolean z, Source source, Integer num, Integer num2, String str5, Integer num3, Integer num4, String str6, Integer num5, Integer num6, Long l, Integer num7, Integer num8, String str7, Boolean bool, List list, String str8, Long l2, Integer num9, Long l3, Long l4, Integer num10, SharingChannel sharingChannel, Integer num11, Integer num12, Integer num13, Boolean bool2, Boolean bool3, Boolean bool4, Integer num14, String str9, Integer num15, Boolean bool5, Long l5, Integer num16, String str10, int i, int i2, zcl zclVar) {
        this(callEventType, str, str2, str3, str4, z, (i & 64) != 0 ? null : source, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : num5, (i & 16384) != 0 ? null : num6, (32768 & i) != 0 ? null : l, (65536 & i) != 0 ? null : num7, (131072 & i) != 0 ? null : num8, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : bool, (1048576 & i) != 0 ? null : list, (2097152 & i) != 0 ? null : str8, (4194304 & i) != 0 ? null : l2, (8388608 & i) != 0 ? null : num9, (16777216 & i) != 0 ? null : l3, (33554432 & i) != 0 ? null : l4, (67108864 & i) != 0 ? null : num10, (134217728 & i) != 0 ? null : sharingChannel, (268435456 & i) != 0 ? null : num11, (536870912 & i) != 0 ? null : num12, (1073741824 & i) != 0 ? null : num13, (i & Integer.MIN_VALUE) != 0 ? null : bool2, (i2 & 1) != 0 ? null : bool3, (i2 & 2) != 0 ? null : bool4, (i2 & 4) != 0 ? null : num14, (i2 & 8) != 0 ? null : str9, (i2 & 16) != 0 ? null : num15, (i2 & 32) != 0 ? null : bool5, (i2 & 64) != 0 ? null : l5, (i2 & 128) != 0 ? null : num16, (i2 & 256) != 0 ? null : str10);
    }
}
