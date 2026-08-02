package com.vk.channels.api;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: ChannelHistoryOpenMode.kt */
/* loaded from: classes16.dex */
public abstract class ChannelHistoryOpenMode extends Serializer.StreamParcelableAdapter {

    /* compiled from: ChannelHistoryOpenMode.kt */
    public static final class OpenAtMsgByCnvId extends ChannelHistoryOpenMode {
        public static final Serializer.c<OpenAtMsgByCnvId> CREATOR = new a();
        public final int b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OpenAtMsgByCnvId> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OpenAtMsgByCnvId a(Serializer serializer) {
                return new OpenAtMsgByCnvId(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenAtMsgByCnvId[i];
            }
        }

        public OpenAtMsgByCnvId(int i) {
            super(null);
            this.b = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
        }

        public OpenAtMsgByCnvId(Serializer serializer, zcl zclVar) {
            this(serializer.u());
        }
    }

    /* compiled from: ChannelHistoryOpenMode.kt */
    public static final class OpenAtMsgByLocalId extends ChannelHistoryOpenMode {
        public static final Serializer.c<OpenAtMsgByLocalId> CREATOR = new a();
        public final int b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OpenAtMsgByLocalId> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OpenAtMsgByLocalId a(Serializer serializer) {
                return new OpenAtMsgByLocalId(serializer, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenAtMsgByLocalId[i];
            }
        }

        public OpenAtMsgByLocalId(int i) {
            super(null);
            this.b = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
        }

        public OpenAtMsgByLocalId(Serializer serializer, zcl zclVar) {
            this(serializer.u());
        }
    }

    public /* synthetic */ ChannelHistoryOpenMode(zcl zclVar) {
        this();
    }

    public ChannelHistoryOpenMode() {
    }

    /* compiled from: ChannelHistoryOpenMode.kt */
    public static final class OpenAtLatest extends ChannelHistoryOpenMode {
        public static final OpenAtLatest b = new OpenAtLatest(null);
        public static final Serializer.c<OpenAtLatest> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OpenAtLatest> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OpenAtLatest a(Serializer serializer) {
                return OpenAtLatest.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenAtLatest[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }

    /* compiled from: ChannelHistoryOpenMode.kt */
    public static final class OpenAtUnread extends ChannelHistoryOpenMode {
        public static final OpenAtUnread b = new OpenAtUnread(null);
        public static final Serializer.c<OpenAtUnread> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OpenAtUnread> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OpenAtUnread a(Serializer serializer) {
                return OpenAtUnread.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenAtUnread[i];
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
        }
    }
}
