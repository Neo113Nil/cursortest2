package com.vk.music.player;

import com.vk.core.serialize.Serializer;
import com.vk.music.player.PlaySourceMeta;
import xsna.zcl;

/* compiled from: StartPlayRequest.kt */
/* loaded from: classes3.dex */
public abstract class StartPlaySource extends Serializer.StreamParcelableAdapter {
    public final PlaySourceMeta b;

    public /* synthetic */ StartPlaySource(PlaySourceMeta playSourceMeta, int i, zcl zclVar) {
        this((i & 1) != 0 ? PlaySourceMeta.Default.b : playSourceMeta, null);
    }

    public PlaySourceMeta zb() {
        return this.b;
    }

    public StartPlaySource(PlaySourceMeta playSourceMeta, zcl zclVar) {
        this.b = playSourceMeta;
    }
}
