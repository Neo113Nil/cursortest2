package com.vk.im.engine.internal.storage.delegates.channel_messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.internal.storage.delegates.messages.MsgDbType;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.PaidReaction;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import xsna.a60;
import xsna.dli0;
import xsna.e0w;
import xsna.ig;
import xsna.j14;
import xsna.qjg;
import xsna.rdi;
import xsna.rl3;
import xsna.rli0;
import xsna.uki0;
import xsna.vt1;

/* compiled from: ChannelMessageWriter.kt */
/* loaded from: classes2.dex */
public final class b {
    public final e0w a;
    public final String b;

    public b(e0w e0wVar, String str) {
        this.a = e0wVar;
        this.b = str;
    }

    public final void a(Collection<? extends Msg> collection) {
        ChannelMessageColumn[] channelMessageColumnArr;
        ChannelMessageColumn[] channelMessageColumnArr2;
        ChannelMessageAttachesColumn[] channelMessageAttachesColumnArr;
        ChannelMessageAttachesColumn[] channelMessageAttachesColumnArr2;
        ChannelMessageColumn.Companion.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("REPLACE INTO " + this.b + " (");
        channelMessageColumnArr = ChannelMessageColumn.allColumns;
        sb.append(rl3.Z(channelMessageColumnArr, null, null, null, new a60(11), 31));
        sb.append(") VALUES (");
        uki0 f = dli0.f(new ig(3));
        channelMessageColumnArr2 = ChannelMessageColumn.allColumns;
        sb.append(rli0.r(rli0.y(f, channelMessageColumnArr2.length), null, null, 63));
        sb.append(')');
        String sb2 = sb.toString();
        e0w e0wVar = this.a;
        SQLiteStatement compileStatement = e0wVar.compileStatement(sb2);
        ChannelMessageAttachesColumn.Companion.getClass();
        StringBuilder sb3 = new StringBuilder("REPLACE INTO channel_message_attaches (");
        channelMessageAttachesColumnArr = ChannelMessageAttachesColumn.allColumns;
        sb3.append(rl3.Z(channelMessageAttachesColumnArr, null, null, null, new vt1(6), 31));
        sb3.append(") VALUES (");
        uki0 f2 = dli0.f(new ig(3));
        channelMessageAttachesColumnArr2 = ChannelMessageAttachesColumn.allColumns;
        sb3.append(rli0.r(rli0.y(f2, channelMessageAttachesColumnArr2.length), null, null, 63));
        sb3.append(')');
        SQLiteStatement compileStatement2 = e0wVar.compileStatement(sb3.toString());
        for (Msg msg : collection) {
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel == null) {
                throw new IllegalArgumentException("message type = " + qjg.a(msg) + " not supported in channels");
            }
            compileStatement.clearBindings();
            compileStatement.bindLong(ChannelMessageColumn.LOCAL_ID.i(), msgFromChannel.b);
            compileStatement.bindLong(ChannelMessageColumn.CHANNEL_ID.i(), msgFromChannel.c);
            compileStatement.bindLong(ChannelMessageColumn.CNV_MSG_ID.i(), msgFromChannel.d);
            compileStatement.bindLong(ChannelMessageColumn.TIME.i(), msgFromChannel.g);
            compileStatement.bindLong(ChannelMessageColumn.WEIGHT.i(), msgFromChannel.p.b);
            compileStatement.bindLong(ChannelMessageColumn.FROM_MEMBER_TYPE.i(), msgFromChannel.h.c.h());
            compileStatement.bindLong(ChannelMessageColumn.FROM_MEMBER_ID.i(), msgFromChannel.h.d);
            rdi.l(compileStatement, ChannelMessageColumn.UPDATE_TIME.i(), msgFromChannel.N);
            rdi.i(compileStatement, ChannelMessageColumn.HAS_SPACE_BEFORE.i(), msgFromChannel.q);
            rdi.i(compileStatement, ChannelMessageColumn.HAS_SPACE_AFTER.i(), msgFromChannel.r);
            compileStatement.bindLong(ChannelMessageColumn.WEIGHT_BEFORE.i(), msgFromChannel.s.b);
            compileStatement.bindLong(ChannelMessageColumn.WEIGHT_AFTER.i(), msgFromChannel.t.b);
            compileStatement.bindLong(ChannelMessageColumn.TYPE.i(), MsgDbType.FROM_CHANNEL.i());
            int i = ChannelMessageColumn.ATTACH.i();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            compileStatement.bindBlob(i, Serializer.b.f(msgFromChannel.E));
            compileStatement.bindLong(ChannelMessageColumn.PHASE_ID.i(), msgFromChannel.u);
            rdi.k(compileStatement, ChannelMessageColumn.LOCAL_REACTION.i(), msgFromChannel.J);
            compileStatement.bindLong(ChannelMessageColumn.SOURCE.i(), msgFromChannel.A.h());
            compileStatement.bindString(ChannelMessageColumn.POST_TEXT.i(), msgFromChannel.I.a);
            compileStatement.bindString(ChannelMessageColumn.ACCESS_KEY.i(), msgFromChannel.I.b);
            compileStatement.bindLong(ChannelMessageColumn.OWNER_ID.i(), msgFromChannel.I.c.b);
            compileStatement.bindLong(ChannelMessageColumn.POST_ID.i(), msgFromChannel.I.d);
            compileStatement.bindLong(ChannelMessageColumn.FROM_ID.i(), msgFromChannel.I.e.b);
            compileStatement.bindString(ChannelMessageColumn.POST_TYPE.i(), msgFromChannel.I.f);
            int i2 = ChannelMessageColumn.DONUT.i();
            PostDonut postDonut = msgFromChannel.I.g;
            rdi.h(compileStatement, i2, postDonut != null ? Serializer.b.e(postDonut) : null);
            int i3 = ChannelMessageColumn.AUTHOR_AD_INFO_URL.i();
            AuthorAd authorAd = msgFromChannel.I.h;
            rdi.m(compileStatement, i3, authorAd != null ? authorAd.b : null);
            int i4 = ChannelMessageColumn.AUTHOR_AD_MARKER.i();
            AuthorAd authorAd2 = msgFromChannel.I.h;
            rdi.m(compileStatement, i4, authorAd2 != null ? authorAd2.c : null);
            compileStatement.bindString(ChannelMessageColumn.TRACK_CODE.i(), msgFromChannel.I.i);
            compileStatement.bindString(ChannelMessageColumn.DELETED_REASON.i(), msgFromChannel.I.j);
            compileStatement.bindString(ChannelMessageColumn.DELETED_DETAILS.i(), msgFromChannel.I.k);
            int i5 = ChannelMessageColumn.COMMENTS_COUNT.i();
            AttachComments attachComments = msgFromChannel.I.l;
            rdi.k(compileStatement, i5, attachComments != null ? Integer.valueOf(attachComments.b) : null);
            int i6 = ChannelMessageColumn.COMMENTS_CAN_VIEW.i();
            AttachComments attachComments2 = msgFromChannel.I.l;
            rdi.j(compileStatement, i6, attachComments2 != null ? Boolean.valueOf(attachComments2.c) : null);
            int i7 = ChannelMessageColumn.COMMENTS_CAN_POST.i();
            AttachComments attachComments3 = msgFromChannel.I.l;
            rdi.j(compileStatement, i7, attachComments3 != null ? Boolean.valueOf(attachComments3.d) : null);
            int i8 = ChannelMessageColumn.COMMENTS_CAN_CLOSE.i();
            AttachComments attachComments4 = msgFromChannel.I.l;
            rdi.j(compileStatement, i8, attachComments4 != null ? Boolean.valueOf(attachComments4.f) : null);
            int i9 = ChannelMessageColumn.COMMENTS_CAN_OPEN.i();
            AttachComments attachComments5 = msgFromChannel.I.l;
            rdi.j(compileStatement, i9, attachComments5 != null ? Boolean.valueOf(attachComments5.e) : null);
            compileStatement.bindLong(ChannelMessageColumn.SIGNER_ID.i(), msgFromChannel.I.m.b);
            rdi.i(compileStatement, ChannelMessageColumn.IS_ADVERTISEMENT.i(), msgFromChannel.I.n);
            int i10 = ChannelMessageColumn.ITEM_REACTIONS.i();
            ItemReactions itemReactions = msgFromChannel.I.p;
            rdi.h(compileStatement, i10, itemReactions != null ? Serializer.b.e(itemReactions) : null);
            compileStatement.bindLong(ChannelMessageColumn.REPOSTS_COUNT.i(), msgFromChannel.I.q);
            compileStatement.bindLong(ChannelMessageColumn.VIEWS_COUNT.i(), msgFromChannel.I.r);
            compileStatement.bindLong(ChannelMessageColumn.PUBLISH_DATE.i(), msgFromChannel.I.s);
            int i11 = ChannelMessageColumn.TEXT_LIVE_TITLE.i();
            AttachWall.TextLive textLive = msgFromChannel.I.t;
            rdi.m(compileStatement, i11, textLive != null ? textLive.b : null);
            int i12 = ChannelMessageColumn.TEXT_LIVE_URL.i();
            AttachWall.TextLive textLive2 = msgFromChannel.I.t;
            rdi.m(compileStatement, i12, textLive2 != null ? textLive2.c : null);
            compileStatement.bindLong(ChannelMessageColumn.SOURCE_TYPE.i(), msgFromChannel.I.u.j());
            compileStatement.bindLong(ChannelMessageColumn.SOURCE_ID.i(), msgFromChannel.I.v);
            rdi.i(compileStatement, ChannelMessageColumn.IS_VIEWED.i(), msgFromChannel.I.w);
            rdi.i(compileStatement, ChannelMessageColumn.IS_VERIFIED.i(), msgFromChannel.I.x);
            rdi.i(compileStatement, ChannelMessageColumn.IS_FAKE_NEWS.i(), msgFromChannel.I.y);
            rdi.i(compileStatement, ChannelMessageColumn.IS_DONUT_PHOTOS.i(), msgFromChannel.I.z);
            int i13 = ChannelMessageColumn.PAID_REACTION.i();
            PaidReaction paidReaction = msgFromChannel.I.o;
            rdi.h(compileStatement, i13, paidReaction != null ? Serializer.b.e(paidReaction) : null);
            compileStatement.bindLong(ChannelMessageColumn.PARENT_ID.i(), msgFromChannel.O.b);
            compileStatement.bindBlob(ChannelMessageColumn.EXTERNAL_VIEW_TRACKING.i(), Serializer.b.e(msgFromChannel.U));
            rdi.i(compileStatement, ChannelMessageColumn.IS_MUTE_NOTIFICATION.i(), msgFromChannel.R);
            rdi.i(compileStatement, ChannelMessageColumn.IS_MSG_PINNED.i(), msgFromChannel.M);
            compileStatement.bindLong(ChannelMessageColumn.SYNC_STATE.i(), msgFromChannel.o.j());
            rdi.m(compileStatement, ChannelMessageColumn.SYNC_CONFIG.i(), msgFromChannel.Q);
            rdi.m(compileStatement, ChannelMessageColumn.GUID.i(), msgFromChannel.P);
            rdi.m(compileStatement, ChannelMessageColumn.BODY_FORMAT.i(), msgFromChannel.T.zb());
            compileStatement.executeInsert();
            Iterator it = msgFromChannel.Zb().iterator();
            while (it.hasNext()) {
                Attach attach = (Attach) it.next();
                int i14 = msgFromChannel.b;
                compileStatement2.clearBindings();
                compileStatement2.bindLong(ChannelMessageAttachesColumn.MSG_LOCAL_ID.i(), i14);
                compileStatement2.bindLong(ChannelMessageAttachesColumn.ATTACH_LOCAL_ID.i(), attach.xb());
                int i15 = ChannelMessageAttachesColumn.CONTENT_TYPE.i();
                Object obj = j14.a;
                compileStatement2.bindLong(i15, j14.b(attach.getClass()));
                compileStatement2.bindLong(ChannelMessageAttachesColumn.CONTENT_ID.i(), j14.a(attach));
                compileStatement2.bindLong(ChannelMessageAttachesColumn.CONTENT_OWNER_ID.i(), attach.q().b);
                int i16 = ChannelMessageAttachesColumn.CHANNEL_ID.i();
                boolean z = attach instanceof AttachForMediaViewer;
                AttachForMediaViewer attachForMediaViewer = z ? (AttachForMediaViewer) attach : null;
                rdi.l(compileStatement2, i16, attachForMediaViewer != null ? Long.valueOf(attachForMediaViewer.y()) : null);
                int i17 = ChannelMessageAttachesColumn.MV_CNV_MSG_ID.i();
                AttachForMediaViewer attachForMediaViewer2 = z ? (AttachForMediaViewer) attach : null;
                rdi.k(compileStatement2, i17, attachForMediaViewer2 != null ? Integer.valueOf(attachForMediaViewer2.sa()) : null);
                compileStatement2.executeInsert();
            }
        }
        compileStatement.close();
    }
}
