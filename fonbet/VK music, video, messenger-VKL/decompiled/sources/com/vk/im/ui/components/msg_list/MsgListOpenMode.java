package com.vk.im.ui.components.msg_list;

import com.vk.core.serialize.Serializer;
import com.vk.dto.messages.MsgIdType;
import xsna.zcl;

/* compiled from: MsgListOpenMode.kt */
/* loaded from: classes2.dex */
public abstract class MsgListOpenMode extends Serializer.StreamParcelableAdapter {

    /* compiled from: MsgListOpenMode.kt */
    public static final class a {
        public static MsgListOpenMode a(long j) {
            int i = (int) ((j >> 32) & 65535);
            int i2 = (int) (j & 4294967295L);
            return i != 1 ? i != 2 ? i != 10 ? i != 12 ? MsgListOpenAtUnreadMode.b : new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, i2) : new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, i2) : MsgListOpenAtLatestMode.b : MsgListOpenAtUnreadMode.b;
        }
    }

    /* compiled from: MsgListOpenMode.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            try {
                iArr[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MsgListOpenMode(zcl zclVar) {
    }
}
