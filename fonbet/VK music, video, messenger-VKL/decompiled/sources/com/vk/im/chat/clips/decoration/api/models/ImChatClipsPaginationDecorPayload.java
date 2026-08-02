package com.vk.im.chat.clips.decoration.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ImChatClipsPaginationDecorPayload.kt */
/* loaded from: classes2.dex */
public final class ImChatClipsPaginationDecorPayload implements ClipsFeedDecorationPayload {
    public static final Parcelable.Creator<ImChatClipsPaginationDecorPayload> CREATOR = new a();
    public final Msg b;
    public final int c;
    public final boolean d;
    public final String e;

    /* compiled from: ImChatClipsPaginationDecorPayload.kt */
    public static final class a implements Parcelable.Creator<ImChatClipsPaginationDecorPayload> {
        @Override // android.os.Parcelable.Creator
        public final ImChatClipsPaginationDecorPayload createFromParcel(Parcel parcel) {
            return new ImChatClipsPaginationDecorPayload((Msg) parcel.readParcelable(Msg.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 1, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImChatClipsPaginationDecorPayload[] newArray(int i) {
            return new ImChatClipsPaginationDecorPayload[i];
        }
    }

    public ImChatClipsPaginationDecorPayload(Msg msg, int i, boolean z, String str) {
        this.b = msg;
        this.c = i;
        this.d = z;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }
}
