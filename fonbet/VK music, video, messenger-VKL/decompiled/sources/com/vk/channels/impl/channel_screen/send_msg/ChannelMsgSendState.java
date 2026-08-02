package com.vk.channels.impl.channel_screen.send_msg;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.im.engine.models.channels.ChannelType;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ChannelMsgSendState.kt */
/* loaded from: classes16.dex */
public final class ChannelMsgSendState implements Parcelable {
    public static final Parcelable.Creator<ChannelMsgSendState> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ChannelType i;

    /* compiled from: ChannelMsgSendState.kt */
    public static final class a implements Parcelable.Creator<ChannelMsgSendState> {
        @Override // android.os.Parcelable.Creator
        public final ChannelMsgSendState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6 = false;
            boolean z7 = true;
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z7 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            if (parcel.readInt() != 0) {
                z5 = z3;
                z3 = z4;
            } else {
                z5 = z3;
            }
            if (parcel.readInt() == 0) {
                z4 = z5;
            }
            return new ChannelMsgSendState(z8, z6, z7, z, z2, z3, z4, parcel.readInt() == 0 ? null : ChannelType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelMsgSendState[] newArray(int i) {
            return new ChannelMsgSendState[i];
        }
    }

    public ChannelMsgSendState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ChannelType channelType) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = channelType;
    }

    public static ChannelMsgSendState a(ChannelMsgSendState channelMsgSendState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ChannelType channelType, int i) {
        boolean z7 = z;
        boolean z8 = channelMsgSendState.b;
        if ((i & 2) != 0) {
            z7 = channelMsgSendState.c;
        }
        if ((i & 4) != 0) {
            z2 = channelMsgSendState.d;
        }
        if ((i & 16) != 0) {
            z4 = channelMsgSendState.f;
        }
        if ((i & 32) != 0) {
            z5 = channelMsgSendState.g;
        }
        if ((i & 64) != 0) {
            z6 = channelMsgSendState.h;
        }
        if ((i & 128) != 0) {
            channelType = channelMsgSendState.i;
        }
        ChannelType channelType2 = channelType;
        channelMsgSendState.getClass();
        boolean z9 = z6;
        boolean z10 = z2;
        return new ChannelMsgSendState(z8, z7, z10, z3, z4, z5, z9, channelType2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelMsgSendState)) {
            return false;
        }
        ChannelMsgSendState channelMsgSendState = (ChannelMsgSendState) obj;
        return this.b == channelMsgSendState.b && this.c == channelMsgSendState.c && this.d == channelMsgSendState.d && this.e == channelMsgSendState.e && this.f == channelMsgSendState.f && this.g == channelMsgSendState.g && this.h == channelMsgSendState.h && this.i == channelMsgSendState.i;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        ChannelType channelType = this.i;
        return b + (channelType == null ? 0 : channelType.hashCode());
    }

    public final String toString() {
        return "ChannelMsgSendState(isPostponedMode=" + this.b + ", isEditMode=" + this.c + ", isBlurPhotoPostEnabled=" + this.d + ", canPostDonut=" + this.e + ", isMonetizationAvailable=" + this.f + ", isCommentsAvailableForChannel=" + this.g + ", canPublishPost=" + this.h + ", channelType=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        ChannelType channelType = this.i;
        if (channelType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(channelType.name());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChannelMsgSendState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ChannelType channelType, int i, zcl zclVar) {
        this(z, z2, z3, z4, z5, z6, r9, r10);
        ChannelType channelType2;
        boolean z8;
        z2 = (i & 2) != 0 ? false : z2;
        if ((i & 64) != 0) {
            channelType2 = channelType;
            z8 = false;
        } else {
            channelType2 = channelType;
            z8 = z7;
        }
    }
}
