package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class CurrentUser implements Serializer.StreamParcelable {
    public static final Serializer.c<CurrentUser> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CurrentUser> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CurrentUser a(Serializer serializer) {
            return new CurrentUser(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrentUser[i];
        }
    }

    public CurrentUser(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentUser)) {
            return false;
        }
        CurrentUser currentUser = (CurrentUser) obj;
        return epx.f(this.b, currentUser.b) && epx.f(this.c, currentUser.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentUser(firstNameGen=");
        sb.append(this.b);
        sb.append(", lastNameGen=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
