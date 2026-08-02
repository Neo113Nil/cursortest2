package com.vk.im.engine.internal.merge.messages;

import android.database.Cursor;
import android.os.Trace;
import android.util.SparseArray;
import com.vk.im.engine.internal.longpoll.polling_tasks.socket.ChannelMasterServiceReporter;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.internal.merge.messages.MessagesMergerInput;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.cr;
import xsna.d5;
import xsna.g2b;
import xsna.i5s;
import xsna.j5g;
import xsna.ndp0;
import xsna.on00;
import xsna.r3b;
import xsna.wzs;
import xsna.xgl0;
import xsna.zik0;

/* compiled from: ChannelMsgHistoryFromServerMergeTask.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<xgl0, MessagesMergerInput, Boolean> {
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:3: B:31:0x0128->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(xgl0 xgl0Var, MessagesMergerInput messagesMergerInput) {
        boolean z;
        MessagesMergerInput.MsgSource msgSource;
        int i;
        ChannelMasterServiceReporter.ErrorSource errorSource;
        xgl0 xgl0Var2 = xgl0Var;
        MessagesMergerInput messagesMergerInput2 = messagesMergerInput;
        ((ChannelMsgHistoryFromServerMergeTask.a) this.receiver).getClass();
        List<Msg> list = messagesMergerInput2.c;
        boolean z2 = false;
        if (!list.isEmpty()) {
            r3b y = xgl0Var2.y();
            long j = ((Msg) j5g.Y(list)).c;
            List<Msg> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).d));
            }
            g2b g2bVar = y.b;
            g2bVar.getClass();
            StringBuilder sb = new StringBuilder("SELECT ");
            cr.a(ChannelMessageColumn.LOCAL_ID, sb, " FROM ");
            sb.append(g2bVar.b.a);
            sb.append(" WHERE ");
            sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
            sb.append(" = ");
            sb.append(j);
            sb.append(" AND ");
            cr.a(ChannelMessageColumn.CNV_MSG_ID, sb, " IN(");
            Cursor d = g2bVar.d.b().d(i5s.a(sb, j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62), ") "), null);
            ArrayList arrayList2 = new ArrayList(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                try {
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            arrayList2.add(Integer.valueOf(d.getInt(0)));
                            d.moveToNext();
                        }
                    }
                    Trace.endSection();
                    SparseArray<Msg> T = y.T(arrayList2);
                    if (!zik0.c(T)) {
                        int e = on00.e(c5g.u(list2, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                        for (Object obj : list2) {
                            linkedHashMap.put(Integer.valueOf(((Msg) obj).d), obj);
                        }
                        ArrayList g = zik0.g(T);
                        if (!g.isEmpty()) {
                            Iterator it2 = g.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Msg msg = (Msg) it2.next();
                                if ((msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null) != null) {
                                    Object obj2 = linkedHashMap.get(Integer.valueOf(msg.d));
                                    MsgFromChannel msgFromChannel = obj2 instanceof MsgFromChannel ? (MsgFromChannel) obj2 : null;
                                    if (msgFromChannel != null) {
                                        MsgFromChannel msgFromChannel2 = (MsgFromChannel) msg;
                                        ChannelMsgHistoryFromServerMergeTask.k.getClass();
                                        Long l = msgFromChannel2.N;
                                        if (l != null) {
                                            long longValue = l.longValue();
                                            Long l2 = msgFromChannel.N;
                                            if (l2 == null || l2.longValue() < longValue) {
                                                z = true;
                                                if (z && (msgSource = messagesMergerInput2.h) != null) {
                                                    i = ChannelMsgHistoryFromServerMergeTask.a.C1118a.$EnumSwitchMapping$0[msgSource.ordinal()];
                                                    if (i != 1) {
                                                        errorSource = ChannelMasterServiceReporter.ErrorSource.WEBSOCKET;
                                                    } else {
                                                        if (i != 2) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        errorSource = ChannelMasterServiceReporter.ErrorSource.API;
                                                    }
                                                    ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.MSGS_UPDATE_OUTDATED, errorSource);
                                                    L.d(new d5(2, msgFromChannel, msgFromChannel2));
                                                }
                                                if (z) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                            i = ChannelMsgHistoryFromServerMergeTask.a.C1118a.$EnumSwitchMapping$0[msgSource.ordinal()];
                                            if (i != 1) {
                                            }
                                            ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.MSGS_UPDATE_OUTDATED, errorSource);
                                            L.d(new d5(2, msgFromChannel, msgFromChannel2));
                                        }
                                        if (z) {
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                }
                            }
                        }
                    }
                } finally {
                    d.close();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        return Boolean.valueOf(z2);
    }
}
