package com.vk.im.ui.components.chat_invite;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Peer;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: InviteEntity.kt */
/* loaded from: classes2.dex */
public abstract class InviteEntity implements Parcelable {

    /* compiled from: InviteEntity.kt */
    public static final class Channel extends InviteEntity {
        public static final Parcelable.Creator<Channel> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: InviteEntity.kt */
        public static final class a implements Parcelable.Creator<Channel> {
            @Override // android.os.Parcelable.Creator
            public final Channel createFromParcel(Parcel parcel) {
                return new Channel(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Channel[] newArray(int i) {
                return new Channel[i];
            }
        }

        public Channel(String str, String str2) {
            super(null);
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Channel)) {
                return false;
            }
            Channel channel = (Channel) obj;
            return epx.f(this.b, channel.b) && epx.f(this.c, channel.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Channel(title=");
            sb.append(this.b);
            sb.append(", link=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: InviteEntity.kt */
    public static final class Chat extends InviteEntity {
        public static final Parcelable.Creator<Chat> CREATOR = new a();
        public final long b;
        public final Peer c;
        public final boolean d;

        /* compiled from: InviteEntity.kt */
        public static final class a implements Parcelable.Creator<Chat> {
            @Override // android.os.Parcelable.Creator
            public final Chat createFromParcel(Parcel parcel) {
                return new Chat(parcel.readLong(), (Peer) parcel.readParcelable(Chat.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Chat[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(long j, Peer peer, boolean z) {
            super(null);
            this.b = j;
            this.c = peer;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chat)) {
                return false;
            }
            Chat chat = (Chat) obj;
            return this.b == chat.b && epx.f(this.c, chat.c) && this.d == chat.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Chat(dialogId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", channel=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public /* synthetic */ InviteEntity(zcl zclVar) {
        this();
    }

    public InviteEntity() {
    }
}
