package com.vk.im.engine.internal.merge.channels;

import com.vk.channels.api.ChannelFilter;
import java.util.List;
import xsna.b920;
import xsna.eeb;
import xsna.ng3;
import xsna.vcb;
import xsna.w2w;

/* compiled from: ChannelsHistoryMergeTask.kt */
/* loaded from: classes2.dex */
public final class a extends b920 {
    public final List<eeb> c;
    public final ChannelFilter d;
    public final vcb e;
    public final vcb f;
    public final boolean g;
    public final boolean h;

    public a(List<eeb> list, ChannelFilter channelFilter, vcb vcbVar, vcb vcbVar2, boolean z, boolean z2) {
        this.c = list;
        this.d = channelFilter;
        this.e = vcbVar;
        this.f = vcbVar2;
        this.g = z;
        this.h = z2;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        return (List) w2wVar.I0().u(new ng3(4, this, w2wVar));
    }
}
