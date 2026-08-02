package com.vk.im.ui.components.msg_list;

import com.vk.core.serialize.Serializer;

/* compiled from: MsgListOpenMode.kt */
/* loaded from: classes2.dex */
public final class MsgListOpenAtUnreadMode extends MsgListOpenMode {
    public static final MsgListOpenAtUnreadMode b = new MsgListOpenAtUnreadMode(null);
    public static final Serializer.c<MsgListOpenAtUnreadMode> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgListOpenAtUnreadMode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgListOpenAtUnreadMode a(Serializer serializer) {
            return MsgListOpenAtUnreadMode.b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgListOpenAtUnreadMode[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
