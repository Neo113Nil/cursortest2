package com.vk.superapp.api.dto.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: WebGameLeaderboard.kt */
/* loaded from: classes6.dex */
public final class WebGameLeaderboard implements Parcelable {
    public static final Parcelable.Creator<WebGameLeaderboard> CREATOR = new a();
    public final WebUserShortInfo b;
    public final UserId c;
    public final int d;
    public final int e;
    public final boolean f;

    /* compiled from: WebGameLeaderboard.kt */
    public static final class a implements Parcelable.Creator<WebGameLeaderboard> {
        @Override // android.os.Parcelable.Creator
        public final WebGameLeaderboard createFromParcel(Parcel parcel) {
            return new WebGameLeaderboard((WebUserShortInfo) parcel.readParcelable(WebGameLeaderboard.class.getClassLoader()), (UserId) parcel.readParcelable(WebGameLeaderboard.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WebGameLeaderboard[] newArray(int i) {
            return new WebGameLeaderboard[i];
        }
    }

    public WebGameLeaderboard(WebUserShortInfo webUserShortInfo, UserId userId, int i, int i2, boolean z) {
        this.b = webUserShortInfo;
        this.c = userId;
        this.d = i;
        this.e = i2;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebGameLeaderboard)) {
            return false;
        }
        WebGameLeaderboard webGameLeaderboard = (WebGameLeaderboard) obj;
        return epx.f(this.b, webGameLeaderboard.b) && epx.f(this.c, webGameLeaderboard.c) && this.d == webGameLeaderboard.d && this.e == webGameLeaderboard.e && this.f == webGameLeaderboard.f;
    }

    public final int hashCode() {
        WebUserShortInfo webUserShortInfo = this.b;
        return Boolean.hashCode(this.f) + shy.a(this.e, shy.a(this.d, bh10.a((webUserShortInfo == null ? 0 : webUserShortInfo.hashCode()) * 31, 31, this.c.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebGameLeaderboard(userProfile=");
        sb.append(this.b);
        sb.append(", userId=");
        sb.append(this.c);
        sb.append(", intValue=");
        sb.append(this.d);
        sb.append(", place=");
        sb.append(this.e);
        sb.append(", isPoints=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ WebGameLeaderboard(WebUserShortInfo webUserShortInfo, UserId userId, int i, int i2, boolean z, int i3, zcl zclVar) {
        this(webUserShortInfo, userId, i, (i3 & 8) != 0 ? 0 : i2, z);
    }
}
