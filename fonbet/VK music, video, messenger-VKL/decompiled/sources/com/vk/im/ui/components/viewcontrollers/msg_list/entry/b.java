package com.vk.im.ui.components.viewcontrollers.msg_list.entry;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;

/* compiled from: MsgUtils.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final boolean a(Msg msg, Peer peer) {
        return !msg.Jb(peer);
    }

    public static final boolean b(Msg msg) {
        if (!(msg instanceof MsgFromUser)) {
            return false;
        }
        MsgFromUser msgFromUser = (MsgFromUser) msg;
        return msgFromUser.i && !msgFromUser.k8() && !msgFromUser.p3() && msgFromUser.H.size() == 1;
    }
}
