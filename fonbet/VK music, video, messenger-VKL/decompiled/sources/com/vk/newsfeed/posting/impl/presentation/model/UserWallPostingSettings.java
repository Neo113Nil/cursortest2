package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class UserWallPostingSettings implements Serializer.StreamParcelable {
    public static final Serializer.c<UserWallPostingSettings> CREATOR = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UserWallPostingSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UserWallPostingSettings a(Serializer serializer) {
            return new UserWallPostingSettings(serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserWallPostingSettings[i];
        }
    }

    public UserWallPostingSettings(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserWallPostingSettings)) {
            return false;
        }
        UserWallPostingSettings userWallPostingSettings = (UserWallPostingSettings) obj;
        return this.b == userWallPostingSettings.b && this.c == userWallPostingSettings.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserWallPostingSettings(isClosed=");
        sb.append(this.b);
        sb.append(", isCommentChangeAvailable=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
