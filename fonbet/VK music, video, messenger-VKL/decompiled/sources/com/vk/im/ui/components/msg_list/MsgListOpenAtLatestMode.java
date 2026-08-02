package com.vk.im.ui.components.msg_list;

import com.vk.core.serialize.Serializer;

/* compiled from: MsgListOpenMode.kt */
/* loaded from: classes2.dex */
public final class MsgListOpenAtLatestMode extends MsgListOpenMode {
    public static final MsgListOpenAtLatestMode b = new MsgListOpenAtLatestMode(null);
    public static final Serializer.c<MsgListOpenAtLatestMode> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgListOpenAtLatestMode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgListOpenAtLatestMode a(Serializer serializer) {
            return MsgListOpenAtLatestMode.b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgListOpenAtLatestMode[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
