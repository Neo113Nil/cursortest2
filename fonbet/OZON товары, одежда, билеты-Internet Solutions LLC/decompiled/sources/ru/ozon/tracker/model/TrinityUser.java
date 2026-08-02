package ru.ozon.tracker.model;

import B4.V;
import C.o0;
import N3.C3660k;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0006J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lru/ozon/tracker/model/TrinityUser;", "Landroid/os/Parcelable;", "googleId", "", "firebaseInstallId", "appBuildNumber", "", "appsflyerId", "longCookie", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getGoogleId", "()Ljava/lang/String;", "getFirebaseInstallId", "getAppBuildNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppsflyerId", "getLongCookie", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/TrinityUser;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrinityUser implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrinityUser> CREATOR = new Creator();
    private final Integer appBuildNumber;
    private final String appsflyerId;
    private final String firebaseInstallId;

    @NotNull
    private final String googleId;
    private final String longCookie;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrinityUser> {
        @Override // android.os.Parcelable.Creator
        public final TrinityUser createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrinityUser(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrinityUser[] newArray(int i11) {
            return new TrinityUser[i11];
        }
    }

    public TrinityUser(@NotNull String googleId, String str, Integer num, String str2, String str3) {
        Intrinsics.checkNotNullParameter(googleId, "googleId");
        this.googleId = googleId;
        this.firebaseInstallId = str;
        this.appBuildNumber = num;
        this.appsflyerId = str2;
        this.longCookie = str3;
    }

    public static /* synthetic */ TrinityUser copy$default(TrinityUser trinityUser, String str, String str2, Integer num, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trinityUser.googleId;
        }
        if ((i11 & 2) != 0) {
            str2 = trinityUser.firebaseInstallId;
        }
        if ((i11 & 4) != 0) {
            num = trinityUser.appBuildNumber;
        }
        if ((i11 & 8) != 0) {
            str3 = trinityUser.appsflyerId;
        }
        if ((i11 & 16) != 0) {
            str4 = trinityUser.longCookie;
        }
        String str5 = str4;
        Integer num2 = num;
        return trinityUser.copy(str, str2, num2, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGoogleId() {
        return this.googleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFirebaseInstallId() {
        return this.firebaseInstallId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getAppBuildNumber() {
        return this.appBuildNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppsflyerId() {
        return this.appsflyerId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLongCookie() {
        return this.longCookie;
    }

    @NotNull
    public final TrinityUser copy(@NotNull String googleId, String firebaseInstallId, Integer appBuildNumber, String appsflyerId, String longCookie) {
        Intrinsics.checkNotNullParameter(googleId, "googleId");
        return new TrinityUser(googleId, firebaseInstallId, appBuildNumber, appsflyerId, longCookie);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrinityUser)) {
            return false;
        }
        TrinityUser trinityUser = (TrinityUser) other;
        return Intrinsics.d(this.googleId, trinityUser.googleId) && Intrinsics.d(this.firebaseInstallId, trinityUser.firebaseInstallId) && Intrinsics.d(this.appBuildNumber, trinityUser.appBuildNumber) && Intrinsics.d(this.appsflyerId, trinityUser.appsflyerId) && Intrinsics.d(this.longCookie, trinityUser.longCookie);
    }

    public final Integer getAppBuildNumber() {
        return this.appBuildNumber;
    }

    public final String getAppsflyerId() {
        return this.appsflyerId;
    }

    public final String getFirebaseInstallId() {
        return this.firebaseInstallId;
    }

    @NotNull
    public final String getGoogleId() {
        return this.googleId;
    }

    public final String getLongCookie() {
        return this.longCookie;
    }

    public int hashCode() {
        int hashCode = this.googleId.hashCode() * 31;
        String str = this.firebaseInstallId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.appBuildNumber;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.appsflyerId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longCookie;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.googleId;
        String str2 = this.firebaseInstallId;
        Integer num = this.appBuildNumber;
        String str3 = this.appsflyerId;
        String str4 = this.longCookie;
        StringBuilder d11 = C3660k.d("TrinityUser(googleId=", str, ", firebaseInstallId=", str2, ", appBuildNumber=");
        V.f(num, ", appsflyerId=", str3, ", longCookie=", d11);
        return o0.c(d11, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.googleId);
        dest.writeString(this.firebaseInstallId);
        Integer num = this.appBuildNumber;
        if (num == null) {
            dest.writeInt(0);
        } else {
            a.f(dest, 1, num);
        }
        dest.writeString(this.appsflyerId);
        dest.writeString(this.longCookie);
    }
}
