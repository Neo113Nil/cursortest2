package com.vk.video.ui.upload.impl.publish.presentation.author.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: AuthorArguments.kt */
/* loaded from: classes7.dex */
public final class AuthorItem implements Parcelable {
    public static final Parcelable.Creator<AuthorItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final UserId d;

    /* compiled from: AuthorArguments.kt */
    public static final class a implements Parcelable.Creator<AuthorItem> {
        @Override // android.os.Parcelable.Creator
        public final AuthorItem createFromParcel(Parcel parcel) {
            return new AuthorItem(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(AuthorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorItem[] newArray(int i) {
            return new AuthorItem[i];
        }
    }

    public AuthorItem(String str, String str2, UserId userId) {
        this.b = str;
        this.c = str2;
        this.d = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorItem)) {
            return false;
        }
        AuthorItem authorItem = (AuthorItem) obj;
        return epx.f(this.b, authorItem.b) && epx.f(this.c, authorItem.c) && epx.f(this.d, authorItem.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return Long.hashCode(this.d.b) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorItem(avatarUrl=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", userId=");
        return gp.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
