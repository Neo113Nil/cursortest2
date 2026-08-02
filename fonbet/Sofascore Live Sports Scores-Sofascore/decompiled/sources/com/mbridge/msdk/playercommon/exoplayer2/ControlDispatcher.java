package com.mbridge.msdk.playercommon.exoplayer2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i, long j);

    boolean dispatchSetPlayWhenReady(Player player, boolean z);

    boolean dispatchSetRepeatMode(Player player, int i);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z);

    boolean dispatchStop(Player player, boolean z);
}
