package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.mqi;
import defpackage.ypa;
import java.util.Arrays;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class g1 {
    public static final mqi a = ypa.b(new com.moloco.sdk.service_locator.h(18));
    public static final Regex b = new Regex("\\[ERRORCODE]");
    public static final Regex c = new Regex("\\[CONTENTPLAYHEAD]");
    public static final Regex d = new Regex("\\[CACHEBUSTING]");
    public static final Regex e = new Regex("\\[ASSETURI]");
    public static final Regex f = new Regex("\\[[^]]*]");
    public static final Regex g = new Regex("\\[MEDIAPLAYHEAD]");
    public static final Regex h = new Regex("\\[ADPLAYHEAD]");

    public static final String a(int i) {
        long j = i;
        return String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(j / 3600000), Long.valueOf((j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) % 60), Long.valueOf((j / 1000) % 60), Long.valueOf(j % 1000)}, 4));
    }

    public static final f1 b() {
        return (f1) a.getValue();
    }
}
