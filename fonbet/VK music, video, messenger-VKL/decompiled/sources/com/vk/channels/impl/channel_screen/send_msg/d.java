package com.vk.channels.impl.channel_screen.send_msg;

import android.view.View;
import com.vk.channels.impl.channel_screen.send_msg.a;
import com.vk.writebar.WriteBar;
import xsna.bwt0;
import xsna.d1y0;
import xsna.zbb;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class d implements d1y0 {
    public final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // xsna.d1y0
    public final void h() {
        a aVar = this.a;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setEmojiAllowed(false);
        zbb.b bVar = aVar.E;
        if (bVar == null) {
            bVar = null;
        }
        zbb zbbVar = zbb.this;
        zbbVar.m.P4();
        View view = zbbVar.r;
        if (view == null) {
            view = null;
        }
        bwt0.c0(-1, view);
        View view2 = zbbVar.s;
        bwt0.c0(-1, view2 != null ? view2 : null);
    }

    @Override // xsna.d1y0
    public final void j() {
        a aVar = this.a;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setEmojiAllowed(aVar.u == a.b.NORMAL);
        zbb.b bVar = aVar.E;
        if (bVar == null) {
            bVar = null;
        }
        zbb zbbVar = zbb.this;
        zbbVar.m.P2();
        View view = zbbVar.r;
        if (view == null) {
            view = null;
        }
        bwt0.c0(-2, view);
        View view2 = zbbVar.s;
        bwt0.c0(-2, view2 != null ? view2 : null);
    }
}
