package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipFeatures.kt */
/* loaded from: classes11.dex */
public final class VoipFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipFeatures[] $VALUES;
    public static final VoipFeatures ADAPTIVE_OPUS;
    public static final VoipFeatures AI_OPUS_BWE_CONFIG;
    public static final VoipFeatures AUDIOMANAGER_CONSEQUENT_SWITCHES;
    public static final VoipFeatures BAD_NETWORK_INDICATOR;
    public static final VoipFeatures DISABLE_CAMERA2_API;
    public static final VoipFeatures DISABLE_INBOUND_MEDIA_STAT_FIX;
    public static final VoipFeatures DISABLE_NATIVE_LIB_LOADER_REFACTOR;
    public static final VoipFeatures ENABLE_FULL_AUDIO_DUMP_RECORD;
    public static final VoipFeatures ENABLE_NS_DF_TINY;
    public static final VoipFeatures ENABLE_VMOJI_BACKEND_RENDER;
    public static final VoipFeatures FEATURE_VOIP_DEBUG_MENU;
    public static final VoipFeatures H265_PRIORITIZED;
    public static final VoipFeatures ICE_CANDIDATE_POOL_SIZE;
    public static final VoipFeatures INCOMING_CALL_PUSH_BANNER;
    public static final VoipFeatures LINEAR_OPUS_BWE_ENABLED;
    public static final VoipFeatures LL_AUDIO;
    public static final VoipFeatures NEW_SUMMARY_STATISTICS;
    public static final VoipFeatures NO_DEPRECATED_WEBRTC_STAT;
    public static final VoipFeatures REPORT_CALL_IN_CALL_HISTORY;
    public static final VoipFeatures SIMULCAST;
    public static final VoipFeatures SIMULCAST_SW_VP8;
    public static final VoipFeatures SNI_ENABLED;
    public static final VoipFeatures VOIP_FRIENDS_NAVIGATE_TO_CHAT;
    public static final VoipFeatures VOIP_IGNORE_AUDIO_FOCUS;
    public static final VoipFeatures VOIP_MAX_ENTRY_POINTS;
    public static final VoipFeatures VOIP_READ_CHAT_HISTORY;
    private final String key;

    static {
        VoipFeatures voipFeatures = new VoipFeatures("FEATURE_VOIP_DEBUG_MENU", 0, "voip_debug_menu");
        FEATURE_VOIP_DEBUG_MENU = voipFeatures;
        VoipFeatures voipFeatures2 = new VoipFeatures("BAD_NETWORK_INDICATOR", 1, "voip_bad_net_indicator");
        BAD_NETWORK_INDICATOR = voipFeatures2;
        VoipFeatures voipFeatures3 = new VoipFeatures("VOIP_READ_CHAT_HISTORY", 2, "voip_read_chat_history");
        VOIP_READ_CHAT_HISTORY = voipFeatures3;
        VoipFeatures voipFeatures4 = new VoipFeatures("ENABLE_NS_DF_TINY", 3, "voip_enable_ns_df_tiny");
        ENABLE_NS_DF_TINY = voipFeatures4;
        VoipFeatures voipFeatures5 = new VoipFeatures("ENABLE_FULL_AUDIO_DUMP_RECORD", 4, "voip_full_audio_dump");
        ENABLE_FULL_AUDIO_DUMP_RECORD = voipFeatures5;
        VoipFeatures voipFeatures6 = new VoipFeatures("VOIP_IGNORE_AUDIO_FOCUS", 5, "voip_ignore_audio_focus");
        VOIP_IGNORE_AUDIO_FOCUS = voipFeatures6;
        VoipFeatures voipFeatures7 = new VoipFeatures("DISABLE_CAMERA2_API", 6, "voip_disable_camera2_api");
        DISABLE_CAMERA2_API = voipFeatures7;
        VoipFeatures voipFeatures8 = new VoipFeatures("ENABLE_VMOJI_BACKEND_RENDER", 7, "voip_backend_vmoji");
        ENABLE_VMOJI_BACKEND_RENDER = voipFeatures8;
        VoipFeatures voipFeatures9 = new VoipFeatures("VOIP_MAX_ENTRY_POINTS", 8, "voip_max_entry_points");
        VOIP_MAX_ENTRY_POINTS = voipFeatures9;
        VoipFeatures voipFeatures10 = new VoipFeatures("DISABLE_NATIVE_LIB_LOADER_REFACTOR", 9, "voip_new_so_loader_disable");
        DISABLE_NATIVE_LIB_LOADER_REFACTOR = voipFeatures10;
        VoipFeatures voipFeatures11 = new VoipFeatures("VOIP_FRIENDS_NAVIGATE_TO_CHAT", 10, "voip_friends_navigate_to_chat");
        VOIP_FRIENDS_NAVIGATE_TO_CHAT = voipFeatures11;
        VoipFeatures voipFeatures12 = new VoipFeatures("REPORT_CALL_IN_CALL_HISTORY", 11, "voip_report_in_call_history");
        REPORT_CALL_IN_CALL_HISTORY = voipFeatures12;
        VoipFeatures voipFeatures13 = new VoipFeatures("AUDIOMANAGER_CONSEQUENT_SWITCHES", 12, "voip_audiomanager_csc_s");
        AUDIOMANAGER_CONSEQUENT_SWITCHES = voipFeatures13;
        VoipFeatures voipFeatures14 = new VoipFeatures("NEW_SUMMARY_STATISTICS", 13, "voip_new_summary_statistics");
        NEW_SUMMARY_STATISTICS = voipFeatures14;
        VoipFeatures voipFeatures15 = new VoipFeatures("AI_OPUS_BWE_CONFIG", 14, "voip_ai_opus_bwe");
        AI_OPUS_BWE_CONFIG = voipFeatures15;
        VoipFeatures voipFeatures16 = new VoipFeatures("LINEAR_OPUS_BWE_ENABLED", 15, "voip_linear_opus_bwe");
        LINEAR_OPUS_BWE_ENABLED = voipFeatures16;
        VoipFeatures voipFeatures17 = new VoipFeatures("INCOMING_CALL_PUSH_BANNER", 16, "voip_incoming_call_push_banner");
        INCOMING_CALL_PUSH_BANNER = voipFeatures17;
        VoipFeatures voipFeatures18 = new VoipFeatures("ADAPTIVE_OPUS", 17, "voip_adaptive_opus");
        ADAPTIVE_OPUS = voipFeatures18;
        VoipFeatures voipFeatures19 = new VoipFeatures("H265_PRIORITIZED", 18, "voip_h265_prioritized");
        H265_PRIORITIZED = voipFeatures19;
        VoipFeatures voipFeatures20 = new VoipFeatures("ICE_CANDIDATE_POOL_SIZE", 19, "voip_use_icps");
        ICE_CANDIDATE_POOL_SIZE = voipFeatures20;
        VoipFeatures voipFeatures21 = new VoipFeatures("LL_AUDIO", 20, "voip_ll_audio");
        LL_AUDIO = voipFeatures21;
        VoipFeatures voipFeatures22 = new VoipFeatures("SIMULCAST_SW_VP8", 21, "voip_simulcast_sw_vp8");
        SIMULCAST_SW_VP8 = voipFeatures22;
        VoipFeatures voipFeatures23 = new VoipFeatures("SIMULCAST", 22, "voip_simulcast");
        SIMULCAST = voipFeatures23;
        VoipFeatures voipFeatures24 = new VoipFeatures("NO_DEPRECATED_WEBRTC_STAT", 23, "voip_webrtc_ds_off");
        NO_DEPRECATED_WEBRTC_STAT = voipFeatures24;
        VoipFeatures voipFeatures25 = new VoipFeatures("DISABLE_INBOUND_MEDIA_STAT_FIX", 24, "voip_disable_imsf");
        DISABLE_INBOUND_MEDIA_STAT_FIX = voipFeatures25;
        VoipFeatures voipFeatures26 = new VoipFeatures("SNI_ENABLED", 25, "voip_sni");
        SNI_ENABLED = voipFeatures26;
        VoipFeatures[] voipFeaturesArr = {voipFeatures, voipFeatures2, voipFeatures3, voipFeatures4, voipFeatures5, voipFeatures6, voipFeatures7, voipFeatures8, voipFeatures9, voipFeatures10, voipFeatures11, voipFeatures12, voipFeatures13, voipFeatures14, voipFeatures15, voipFeatures16, voipFeatures17, voipFeatures18, voipFeatures19, voipFeatures20, voipFeatures21, voipFeatures22, voipFeatures23, voipFeatures24, voipFeatures25, voipFeatures26};
        $VALUES = voipFeaturesArr;
        $ENTRIES = new asp(voipFeaturesArr);
    }

    public VoipFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<VoipFeatures> i() {
        return $ENTRIES;
    }

    public static VoipFeatures valueOf(String str) {
        return (VoipFeatures) Enum.valueOf(VoipFeatures.class, str);
    }

    public static VoipFeatures[] values() {
        return (VoipFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
