package com.vk.im.chat.clips.decoration.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import xsna.epx;
import xsna.eq;
import xsna.zcl;

/* compiled from: ImClipsDecorationKey.kt */
/* loaded from: classes2.dex */
public final class ImClipsDecorationKey implements ClipsDecorationKey {
    public static final Parcelable.Creator<ImClipsDecorationKey> CREATOR = new a();
    public final Peer b;

    /* compiled from: ImClipsDecorationKey.kt */
    public static final class a implements Parcelable.Creator<ImClipsDecorationKey> {
        @Override // android.os.Parcelable.Creator
        public final ImClipsDecorationKey createFromParcel(Parcel parcel) {
            return new ImClipsDecorationKey((Peer) parcel.readParcelable(ImClipsDecorationKey.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImClipsDecorationKey[] newArray(int i) {
            return new ImClipsDecorationKey[i];
        }
    }

    public ImClipsDecorationKey() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImClipsDecorationKey) && epx.f(this.b, ((ImClipsDecorationKey) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("ImClipsDecorationKey(peer="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }

    public ImClipsDecorationKey(Peer peer) {
        this.b = peer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImClipsDecorationKey(Peer peer, int i, zcl zclVar) {
        this(peer);
        if ((i & 1) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
    }
}
