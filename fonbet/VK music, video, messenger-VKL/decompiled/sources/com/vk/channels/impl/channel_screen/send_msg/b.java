package com.vk.channels.impl.channel_screen.send_msg;

import android.os.Parcelable;
import com.vk.channels.impl.channel_screen.send_msg.a;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.pending.PendingAudioMessageAttachment;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingStoryAttachment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xsna.ca3;
import xsna.oz30;
import xsna.s0y0;
import xsna.x74;
import xsna.zbb;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class b implements s0y0 {
    public final /* synthetic */ a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // xsna.s0y0
    public final void c(List list, List list2) {
        boolean z;
        List<Parcelable> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (Parcelable parcelable : list3) {
                if ((parcelable instanceof x74) && ((x74) parcelable).o1()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List<Parcelable> list4 = list2;
        boolean z2 = list4 instanceof Collection;
        a aVar = this.b;
        if (!z2 || !list4.isEmpty()) {
            for (Parcelable parcelable2 : list4) {
                if ((parcelable2 instanceof x74) && ((x74) parcelable2).o1()) {
                    Integer i = aVar.p.i();
                    aVar.p = ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, Integer.valueOf(i != null ? i.intValue() : -1), null, null, null, false, false, false, true, null, 24543);
                    WriteBar writeBar = aVar.x;
                    (writeBar != null ? writeBar : null).setDonutPhotos(true);
                    return;
                }
            }
        }
        if (z) {
            aVar.p = ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 24543);
            WriteBar writeBar2 = aVar.x;
            (writeBar2 != null ? writeBar2 : null).setDonutPhotos(false);
        }
    }

    @Override // xsna.s0y0
    public final void e() {
        a aVar = this.b;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        if (writeBar.getAttachments().isEmpty()) {
            Integer i = aVar.p.i();
            aVar.p = ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, (i == null || (aVar.u == a.b.NORMAL && aVar.p.B())) ? null : i, null, null, null, false, false, false, false, null, 24543);
            WriteBar writeBar2 = aVar.x;
            (writeBar2 != null ? writeBar2 : null).setDonutPhotos(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s0y0
    public final boolean i(Attachment attachment) {
        x74 x74Var = attachment instanceof x74 ? (x74) attachment : null;
        a aVar = this.b;
        if (x74Var != null && x74Var.o1() && !aVar.p.B()) {
            Integer i = aVar.p.i();
            aVar.p = ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, Integer.valueOf(i != null ? i.intValue() : -1), null, null, null, false, false, false, true, null, 24543);
            WriteBar writeBar = aVar.x;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.setDonutPhotos(true);
        }
        ChannelMsgSendConfig channelMsgSendConfig = aVar.p;
        if (attachment instanceof StickerAttachment) {
            Attach b = ca3.b(attachment);
            if (b != null) {
                WriteBar writeBar2 = aVar.x;
                if (writeBar2 == null) {
                    writeBar2 = null;
                }
                MsgFromUser replyMessage = writeBar2.getReplyMessage();
                Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
                zbb.b bVar = aVar.E;
                oz30.c(bVar == null ? null : bVar, 0, null, null, null, Collections.singletonList(b), valueOf, null, null, aVar.E(), 207);
                WriteBar writeBar3 = aVar.x;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                writeBar3.L();
            }
            WriteBar writeBar4 = aVar.x;
            (writeBar4 != null ? writeBar4 : null).K();
            return true;
        }
        if (!(attachment instanceof PendingGraffitiAttachment) && !(attachment instanceof PendingStoryAttachment) && !(attachment instanceof GraffitiAttachment) && !(attachment instanceof PendingAudioMessageAttachment)) {
            if (attachment instanceof PendingPhotoAttachment) {
                PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment;
                if (pendingPhotoAttachment.l == null && !pendingPhotoAttachment.m) {
                    pendingPhotoAttachment.m = channelMsgSendConfig.B();
                    pendingPhotoAttachment.l = channelMsgSendConfig.B() ? "" : null;
                }
            }
            return false;
        }
        Attach b2 = ca3.b(attachment);
        if (b2 != null) {
            WriteBar writeBar5 = aVar.x;
            if (writeBar5 == null) {
                writeBar5 = null;
            }
            MsgFromUser replyMessage2 = writeBar5.getReplyMessage();
            Integer valueOf2 = replyMessage2 != null ? Integer.valueOf(replyMessage2.d) : null;
            zbb.b bVar2 = aVar.E;
            oz30.c(bVar2 == null ? null : bVar2, 0, null, null, null, Collections.singletonList(b2), valueOf2, null, null, channelMsgSendConfig, 207);
            WriteBar writeBar6 = aVar.x;
            if (writeBar6 == null) {
                writeBar6 = null;
            }
            writeBar6.L();
        }
        WriteBar writeBar7 = aVar.x;
        (writeBar7 != null ? writeBar7 : null).K();
        return true;
    }

    @Override // xsna.s0y0
    public final void f() {
    }

    @Override // xsna.s0y0
    public final void g() {
    }
}
