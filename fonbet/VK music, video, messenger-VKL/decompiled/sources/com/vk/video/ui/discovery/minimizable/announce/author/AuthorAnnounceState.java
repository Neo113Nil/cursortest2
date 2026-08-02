package com.vk.video.ui.discovery.minimizable.announce.author;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AuthorAnnounceState.kt */
/* loaded from: classes7.dex */
public final class AuthorAnnounceState implements Parcelable {
    public static final Parcelable.Creator<AuthorAnnounceState> CREATOR = new a();
    public final AuthorAnnounceMode b;
    public final AuthorFullscreenSession c;
    public final Boolean d;

    /* compiled from: AuthorAnnounceState.kt */
    public static final class a implements Parcelable.Creator<AuthorAnnounceState> {
        @Override // android.os.Parcelable.Creator
        public final AuthorAnnounceState createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AuthorAnnounceMode valueOf2 = AuthorAnnounceMode.valueOf(parcel.readString());
            AuthorFullscreenSession createFromParcel = AuthorFullscreenSession.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthorAnnounceState(valueOf2, createFromParcel, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorAnnounceState[] newArray(int i) {
            return new AuthorAnnounceState[i];
        }
    }

    public AuthorAnnounceState() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorAnnounceState)) {
            return false;
        }
        AuthorAnnounceState authorAnnounceState = (AuthorAnnounceState) obj;
        return this.b == authorAnnounceState.b && epx.f(this.c, authorAnnounceState.c) && epx.f(this.d, authorAnnounceState.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Boolean bool = this.d;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorAnnounceState(authorMode=");
        sb.append(this.b);
        sb.append(", authorFullscreenSession=");
        sb.append(this.c);
        sb.append(", localSubscribedOverride=");
        return tn.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        this.c.writeToParcel(parcel, i);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AuthorAnnounceState(AuthorAnnounceMode authorAnnounceMode, AuthorFullscreenSession authorFullscreenSession, Boolean bool) {
        this.b = authorAnnounceMode;
        this.c = authorFullscreenSession;
        this.d = bool;
    }

    public /* synthetic */ AuthorAnnounceState(AuthorAnnounceMode authorAnnounceMode, AuthorFullscreenSession authorFullscreenSession, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? AuthorAnnounceMode.Hidden : authorAnnounceMode, (i & 2) != 0 ? new AuthorFullscreenSession(false, false, false, 7, null) : authorFullscreenSession, (i & 4) != 0 ? null : bool);
    }
}
