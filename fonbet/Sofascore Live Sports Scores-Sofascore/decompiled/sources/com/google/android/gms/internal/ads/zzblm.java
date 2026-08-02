package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzblm {
    public static final zzbkq a = zzbkq.a("gads:delegating_web_view_client_recursion_detection:enabled", false);
    public static final zzbkq b = zzbkq.a("gads:paw_app_signals:document_start_js:enabled", false);
    public static final zzbkq c = zzbkq.a("gads:paw_app_signals:enabled", false);
    public static final zzbkq d = zzbkq.a("gads:paw_delegate_web_view_client:enabled", false);
    public static final zzbkq e = zzbkq.a("gads:paw_cache:enabled", false);
    public static final zzbkq f = zzbkq.b(30, "gads:paw_cache:refresh_interval_seconds");
    public static final zzbkq g = zzbkq.b(10, "gads:paw_cache:retry_delay_seconds");
    public static final zzbkq h = zzbkq.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, "gads:paw_cache:ttl_ms");
}
