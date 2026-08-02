package com.vk.im.engine.internal.merge.messages;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.merge.messages.MessagesMergerInput;
import com.vk.im.engine.models.messages.Msg;
import com.vk.movika.sdk.base.observable.o;
import com.vk.movika.sdk.base.observable.p;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b1y;
import xsna.b920;
import xsna.dva;
import xsna.e43;
import xsna.exf;
import xsna.eyf;
import xsna.iyf;
import xsna.r3b;
import xsna.sp;
import xsna.vhb;
import xsna.w2w;
import xsna.w4b;
import xsna.wwf0;
import xsna.xgl0;
import xsna.zrp;

/* compiled from: ChannelMsgHistoryFromServerMergeTask.kt */
/* loaded from: classes2.dex */
public final class ChannelMsgHistoryFromServerMergeTask extends b920 {
    public static final a k = new a();
    public static final w4b l = new w4b(0);
    public final Peer c;
    public final int d;
    public final List<Msg> e;
    public final HistorySource f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelMsgHistoryFromServerMergeTask.kt */
    public static final class HistorySource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HistorySource[] $VALUES;
        public static final HistorySource API;
        public static final HistorySource TEST;
        public static final HistorySource WEBSOCKET;

        /* compiled from: ChannelMsgHistoryFromServerMergeTask.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HistorySource.values().length];
                try {
                    iArr[HistorySource.WEBSOCKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistorySource.API.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HistorySource.TEST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            HistorySource historySource = new HistorySource("WEBSOCKET", 0);
            WEBSOCKET = historySource;
            HistorySource historySource2 = new HistorySource("API", 1);
            API = historySource2;
            HistorySource historySource3 = new HistorySource("TEST", 2);
            TEST = historySource3;
            HistorySource[] historySourceArr = {historySource, historySource2, historySource3};
            $VALUES = historySourceArr;
            $ENTRIES = new asp(historySourceArr);
        }

        public HistorySource() {
            throw null;
        }

        public static HistorySource valueOf(String str) {
            return (HistorySource) Enum.valueOf(HistorySource.class, str);
        }

        public static HistorySource[] values() {
            return (HistorySource[]) $VALUES.clone();
        }
    }

    /* compiled from: ChannelMsgHistoryFromServerMergeTask.kt */
    public static final class a {

        /* compiled from: ChannelMsgHistoryFromServerMergeTask.kt */
        /* renamed from: com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1118a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessagesMergerInput.MsgSource.values().length];
                try {
                    iArr[MessagesMergerInput.MsgSource.WEBSOCKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessagesMergerInput.MsgSource.API.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public ChannelMsgHistoryFromServerMergeTask(Peer peer, int i, List list, HistorySource historySource, boolean z, boolean z2, boolean z3, Boolean bool) {
        this.c = peer;
        this.d = i;
        this.e = list;
        this.f = historySource;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = bool;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        MessagesMergerInput.MsgSource msgSource;
        HistorySource historySource = this.f;
        historySource.getClass();
        int i = HistorySource.a.$EnumSwitchMapping$0[historySource.ordinal()];
        if (i == 1) {
            msgSource = MessagesMergerInput.MsgSource.WEBSOCKET;
        } else if (i == 2) {
            msgSource = MessagesMergerInput.MsgSource.API;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            msgSource = null;
        }
        MessagesMergerInput.MsgSource msgSource2 = msgSource;
        Peer peer = this.c;
        MessagesMergerInput messagesMergerInput = new MessagesMergerInput(peer, this.d, this.e, this.h, this.i, null, this.j, msgSource2);
        long j = peer.b;
        xgl0 I0 = w2wVar.I0();
        boolean z = this.g;
        r3b e = z ? I0.e() : I0.y();
        return new iyf(w2wVar.I0(), new vhb(j, w2wVar.I0()), e, new dva(e, new exf(w2wVar.I0(), e, new vhb(j, w2wVar.I0())), z ? new sp(21) : new eyf(), w2wVar), new b1y(w2wVar, 2), new wwf0(), new o(w2wVar, 14), new p(w2wVar, 18), w2wVar.getExperiments().q() ? new com.vk.im.engine.internal.merge.messages.a(2, k, a.class, "detectStaleUpdates", "detectStaleUpdates(Lcom/vk/im/engine/storage/StorageManager;Lcom/vk/im/engine/internal/merge/messages/MessagesMergerInput;)Z", 0) : l).a(messagesMergerInput);
    }

    public /* synthetic */ ChannelMsgHistoryFromServerMergeTask(Peer peer, int i, List list, HistorySource historySource, boolean z, boolean z2, boolean z3, int i2) {
        this(peer, i, list, historySource, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 256) != 0 ? null : Boolean.FALSE);
    }

    public ChannelMsgHistoryFromServerMergeTask(Peer peer, Msg msg, HistorySource historySource, boolean z, boolean z2) {
        this(peer, msg != null ? msg.d : Integer.MAX_VALUE, e43.m(msg), historySource, false, z, z2, (Boolean) null);
    }
}
