package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbkw {
    public static final zzbkq a = zzbkq.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, "gads:app_permissions_caching_expiry_ms:expiry");
    public static final zzbkq b = zzbkq.b(5000, "gads:audio_caching_expiry_ms:expiry");
    public static final zzbkq c = zzbkq.b(Ua.s, "gads:battery_caching_expiry_ms:expiry");
    public static final zzbkq d = zzbkq.b(300000, "gads:device_info_caching_expiry_ms:expiry");
    public static final zzbkq e = zzbkq.b(TTAdConstant.AD_MAX_EVENT_TIME, "gads:hsdp_caching_expiry_ms:expiry");
    public static final zzbkq f = zzbkq.b(5000, "gads:memory_caching_expiry_ms:expiry");
    public static final zzbkq g = zzbkq.b(TTAdConstant.AD_MAX_EVENT_TIME, "gads:sdk_environment_caching_expiry_ms:expiry");
    public static final zzbkq h = zzbkq.b(5000, "gads:telephony_caching_expiry_ms:expiry");
}
