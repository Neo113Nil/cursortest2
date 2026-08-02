package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface ContentMetadata {
    public static final String INTERNAL_METADATA_NAME_PREFIX = "exo_";

    boolean contains(String str);

    long get(String str, long j);

    String get(String str, String str2);

    byte[] get(String str, byte[] bArr);
}
