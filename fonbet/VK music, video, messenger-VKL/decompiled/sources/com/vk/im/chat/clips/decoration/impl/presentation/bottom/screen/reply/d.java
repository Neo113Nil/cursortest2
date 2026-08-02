package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.dto.attaches.Attach;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.a;
import com.vk.movika.sdk.base.ui.i;
import java.util.List;
import xsna.e4g0;
import xsna.ly30;
import xsna.s3q0;
import xsna.tob;
import xsna.xn50;

/* compiled from: ChatClipsReplyFragment.kt */
/* loaded from: classes2.dex */
public final class d extends tob {
    public final /* synthetic */ ChatClipsReplyFragment c;

    public d(ChatClipsReplyFragment chatClipsReplyFragment) {
        this.c = chatClipsReplyFragment;
    }

    @Override // xsna.tob, xsna.vey
    public final void e(float f) {
        i iVar = this.c.S;
        if (iVar != null) {
            iVar.invoke();
        }
    }

    @Override // xsna.tob
    public final void f(String str, MsgTextFormat msgTextFormat, List<? extends Attach> list, ly30 ly30Var) {
        int i = ChatClipsReplyFragment.T;
        ChatClipsReplyFragment chatClipsReplyFragment = this.c;
        chatClipsReplyFragment.io();
        e4g0.a.onNext(s3q0.a);
        if (ly30Var == null) {
            ly30Var = ly30.f;
        }
        xn50.a.c(chatClipsReplyFragment, new a.b(str, msgTextFormat, list, ly30Var));
    }
}
