package spay.seamlessAuth.core.data.model.entity;

import E0.C2942q;
import J8.b;
import Pk0.c;
import Ve.J2;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lspay/seamlessAuth/core/data/model/entity/AppTokenEntity;", "Landroid/os/Parcelable;", "", "token", "", "expiresTime", "LVe/J2;", "typeAuth", "<init>", "(Ljava/lang/String;JLVe/J2;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()LVe/J2;", "copy", "(Ljava/lang/String;JLVe/J2;)Lspay/seamlessAuth/core/data/model/entity/AppTokenEntity;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getToken", "J", "getExpiresTime", "LVe/J2;", "getTypeAuth", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppTokenEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppTokenEntity> CREATOR = new Creator();

    @b("expiresTime")
    private final long expiresTime;

    @b("token")
    @NotNull
    private final String token;

    @b("typeAuth")
    private final J2 typeAuth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AppTokenEntity> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AppTokenEntity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppTokenEntity(parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : J2.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AppTokenEntity[] newArray(int i11) {
            return new AppTokenEntity[i11];
        }
    }

    public AppTokenEntity(@NotNull String token, long j11, J2 j22) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.expiresTime = j11;
        this.typeAuth = j22;
    }

    public static /* synthetic */ AppTokenEntity copy$default(AppTokenEntity appTokenEntity, String str, long j11, J2 j22, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appTokenEntity.token;
        }
        if ((i11 & 2) != 0) {
            j11 = appTokenEntity.expiresTime;
        }
        if ((i11 & 4) != 0) {
            j22 = appTokenEntity.typeAuth;
        }
        return appTokenEntity.copy(str, j11, j22);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpiresTime() {
        return this.expiresTime;
    }

    /* renamed from: component3, reason: from getter */
    public final J2 getTypeAuth() {
        return this.typeAuth;
    }

    @NotNull
    public final AppTokenEntity copy(@NotNull String token, long expiresTime, J2 typeAuth) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new AppTokenEntity(token, expiresTime, typeAuth);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTokenEntity)) {
            return false;
        }
        AppTokenEntity appTokenEntity = (AppTokenEntity) other;
        return Intrinsics.d(this.token, appTokenEntity.token) && this.expiresTime == appTokenEntity.expiresTime && this.typeAuth == appTokenEntity.typeAuth;
    }

    public final long getExpiresTime() {
        return this.expiresTime;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final J2 getTypeAuth() {
        return this.typeAuth;
    }

    public int hashCode() {
        int a11 = c.a(this.token.hashCode() * 31, 31, this.expiresTime);
        J2 j22 = this.typeAuth;
        return a11 + (j22 == null ? 0 : j22.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.token;
        long j11 = this.expiresTime;
        J2 j22 = this.typeAuth;
        StringBuilder d11 = C2942q.d(j11, "AppTokenEntity(token=", str, ", expiresTime=");
        d11.append(", typeAuth=");
        d11.append(j22);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.token);
        parcel.writeLong(this.expiresTime);
        J2 j22 = this.typeAuth;
        if (j22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j22.name());
        }
    }
}
