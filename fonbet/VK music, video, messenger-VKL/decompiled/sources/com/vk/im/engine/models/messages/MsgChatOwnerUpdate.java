package com.vk.im.engine.models.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.asp;
import xsna.epx;
import xsna.eq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MsgChatOwnerUpdate.kt */
/* loaded from: classes2.dex */
public final class MsgChatOwnerUpdate extends Msg {
    public static final Serializer.c<MsgChatOwnerUpdate> CREATOR = new a();
    public Type E;
    public Peer F;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgChatOwnerUpdate.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ADMIN;
        public static final Type ANY_ADMIN;
        public static final Type ANY_USER;
        public static final Type CHANGED;
        public static final a Companion;
        private final String id;

        /* compiled from: MsgChatOwnerUpdate.kt */
        public static final class a {
            public static Type a(String str) {
                for (Type type : Type.values()) {
                    if (epx.f(type.getId(), str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        static {
            Type type = new Type("CHANGED", 0, "chat_owner_changed");
            CHANGED = type;
            Type type2 = new Type("ANY_USER", 1, "chat_without_owner_all");
            ANY_USER = type2;
            Type type3 = new Type("ADMIN", 2, "chat_without_owner_admin");
            ADMIN = type3;
            Type type4 = new Type("ANY_ADMIN", 3, "chat_without_owner_admins");
            ANY_ADMIN = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.id = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgChatOwnerUpdate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgChatOwnerUpdate a(Serializer serializer) {
            return new MsgChatOwnerUpdate(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgChatOwnerUpdate[i];
        }
    }

    public MsgChatOwnerUpdate(Type type, Peer peer) {
        this.E = type;
        this.F = peer;
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Rb(Serializer serializer) {
        Type.a aVar = Type.Companion;
        String H = serializer.H();
        aVar.getClass();
        this.E = Type.a.a(H);
        this.F = (Peer) serializer.G(Peer.class.getClassLoader());
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final void Sb(Serializer serializer) {
        serializer.j0(this.E.getId());
        serializer.i0(this.F);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgChatOwnerUpdate)) {
            return false;
        }
        MsgChatOwnerUpdate msgChatOwnerUpdate = (MsgChatOwnerUpdate) obj;
        return this.E == msgChatOwnerUpdate.E && epx.f(this.F, msgChatOwnerUpdate.F);
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final int hashCode() {
        int hashCode = this.E.hashCode() * 31;
        Peer peer = this.F;
        return hashCode + (peer == null ? 0 : Long.hashCode(peer.b));
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgChatOwnerUpdate(type=");
        sb.append(this.E);
        sb.append(", member=");
        return eq.a(sb, this.F, ')');
    }

    @Override // com.vk.im.engine.models.messages.Msg
    public final Msg zb() {
        return new MsgChatOwnerUpdate(this.E, this.F);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MsgChatOwnerUpdate(Serializer serializer, zcl zclVar) {
        this(Type.a.a(r0), (Peer) serializer.G(Peer.class.getClassLoader()));
        Type.a aVar = Type.Companion;
        String H = serializer.H();
        aVar.getClass();
    }
}
