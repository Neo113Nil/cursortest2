package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.a;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.e;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.a7f0;
import xsna.e1;
import xsna.hg1;
import xsna.jnb;
import xsna.ly30;
import xsna.nob;
import xsna.pz30;
import xsna.q1w;
import xsna.wk50;
import xsna.wr0;

/* compiled from: ChatClipsReplyFeature.kt */
/* loaded from: classes2.dex */
public final class c extends wk50<h, e, a, f> {
    public final long f;
    public final int g;
    public final nob h;

    public c(long j, int i, nob nobVar) {
        super(a.C1097a.b, new g(e.a.b));
        this.f = j;
        this.g = i;
        this.h = nobVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(e eVar, a aVar) {
        a aVar2 = aVar;
        if (aVar2.equals(a.C1097a.b)) {
            a1w a1wVar = q1w.a;
            a7f0.a.e(this, new i0((a1wVar != null ? a1wVar : null).l.a(), new hg1.b0()).U(new hg1.a0()), null, new e1(this, 19), new jnb(L.a, 1), null, 9);
            return;
        }
        if (!(aVar2 instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar2;
        nob nobVar = this.h;
        long j = this.f;
        String str = bVar.b;
        MsgTextFormat msgTextFormat = bVar.c;
        List<Attach> list = bVar.d;
        Integer valueOf = Integer.valueOf(this.g);
        ly30 ly30Var = bVar.e;
        if ((192 & 2) != 0) {
            str = "";
        }
        if ((192 & 4) != 0) {
            msgTextFormat = new MsgTextFormat(0, EmptyList.b, 1, null);
        }
        MsgTextFormat msgTextFormat2 = msgTextFormat;
        Integer num = (192 & 16) != 0 ? null : valueOf;
        if ((192 & 32) != 0) {
            ly30Var = new ly30(null, null, null, 15);
        }
        ly30 ly30Var2 = ly30Var;
        String str2 = (192 & 128) == 0 ? "quick_chat_recom_button" : null;
        nobVar.getClass();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a7f0.a.f(this, nobVar.c.b(nobVar, new pz30(Peer.a.b(j), str, msgTextFormat2, null, null, "", str2 == null ? "" : str2, "clips_fullscreen", list, null, num, null, ly30Var2, 10776)), new b(this), new wr0(6), 1);
    }
}
