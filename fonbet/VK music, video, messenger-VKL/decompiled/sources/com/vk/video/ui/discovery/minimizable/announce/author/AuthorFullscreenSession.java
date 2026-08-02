package com.vk.video.ui.discovery.minimizable.announce.author;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AuthorAnnounceState.kt */
/* loaded from: classes7.dex */
public final class AuthorFullscreenSession implements Parcelable {
    public static final Parcelable.Creator<AuthorFullscreenSession> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* compiled from: AuthorAnnounceState.kt */
    public static final class a implements Parcelable.Creator<AuthorFullscreenSession> {
        @Override // android.os.Parcelable.Creator
        public final AuthorFullscreenSession createFromParcel(Parcel parcel) {
            return new AuthorFullscreenSession(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorFullscreenSession[] newArray(int i) {
            return new AuthorFullscreenSession[i];
        }
    }

    public AuthorFullscreenSession() {
        this(false, false, false, 7, null);
    }

    public static AuthorFullscreenSession a(AuthorFullscreenSession authorFullscreenSession) {
        boolean z = authorFullscreenSession.b;
        boolean z2 = authorFullscreenSession.c;
        authorFullscreenSession.getClass();
        return new AuthorFullscreenSession(z, z2, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorFullscreenSession)) {
            return false;
        }
        AuthorFullscreenSession authorFullscreenSession = (AuthorFullscreenSession) obj;
        return this.b == authorFullscreenSession.b && this.c == authorFullscreenSession.c && this.d == authorFullscreenSession.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorFullscreenSession(isInFullscreen=");
        sb.append(this.b);
        sb.append(", wasSubscribedOnEnter=");
        sb.append(this.c);
        sb.append(", hasInteractedInSession=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public AuthorFullscreenSession(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public /* synthetic */ AuthorFullscreenSession(boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
