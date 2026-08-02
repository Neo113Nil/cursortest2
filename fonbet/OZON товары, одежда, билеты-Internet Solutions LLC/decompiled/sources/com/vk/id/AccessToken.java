package com.vk.id;

import Pk0.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/vk/id/AccessToken;", "Landroid/os/Parcelable;", "", "token", "idToken", "", "userID", "expireTime", "Lcom/vk/id/VKIDUser;", "userData", "", "scopes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLcom/vk/id/VKIDUser;Ljava/util/Set;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getIdToken", "J", "getUserID", "()J", "getExpireTime", "Lcom/vk/id/VKIDUser;", "getUserData", "()Lcom/vk/id/VKIDUser;", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AccessToken implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR = new Creator();
    private final long expireTime;
    private final String idToken;
    private final Set<String> scopes;

    @NotNull
    private final String token;

    @NotNull
    private final VKIDUser userData;
    private final long userID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccessToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessToken createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            VKIDUser createFromParcel = VKIDUser.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashSet2.add(parcel.readString());
                }
                linkedHashSet = linkedHashSet2;
            }
            return new AccessToken(readString, readString2, readLong, readLong2, createFromParcel, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessToken[] newArray(int i11) {
            return new AccessToken[i11];
        }
    }

    public AccessToken(@NotNull String token, String str, long j11, long j12, @NotNull VKIDUser userData, Set<String> set) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.token = token;
        this.idToken = str;
        this.userID = j11;
        this.expireTime = j12;
        this.userData = userData;
        this.scopes = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AccessToken.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type com.vk.id.AccessToken");
        AccessToken accessToken = (AccessToken) other;
        return Intrinsics.d(this.token, accessToken.token) && this.userID == accessToken.userID && this.expireTime == accessToken.expireTime && Intrinsics.d(this.userData, accessToken.userData);
    }

    public final String getIdToken() {
        return this.idToken;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final long getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userData.hashCode() + c.a(c.a(this.token.hashCode() * 31, 31, this.userID), 31, this.expireTime);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.idToken);
        dest.writeLong(this.userID);
        dest.writeLong(this.expireTime);
        this.userData.writeToParcel(dest, flags);
        Set<String> set = this.scopes;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
    }
}
