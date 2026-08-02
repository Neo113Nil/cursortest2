package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarDetails.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/models/AvatarDetails;", "", "avatarType", "Lio/intercom/android/sdk/models/AvatarType;", "avatars", "", "Lio/intercom/android/sdk/models/Avatar$Builder;", "<init>", "(Lio/intercom/android/sdk/models/AvatarType;Ljava/util/List;)V", "getAvatarType", "()Lio/intercom/android/sdk/models/AvatarType;", "getAvatars", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AvatarDetails {
    public static final int $stable = 8;

    @SerializedName("avatar_type")
    private final AvatarType avatarType;

    @SerializedName("avatars")
    private final List<Avatar.Builder> avatars;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarDetails copy$default(AvatarDetails avatarDetails, AvatarType avatarType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarType = avatarDetails.avatarType;
        }
        if ((i & 2) != 0) {
            list = avatarDetails.avatars;
        }
        return avatarDetails.copy(avatarType, list);
    }

    /* renamed from: component1, reason: from getter */
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<Avatar.Builder> component2() {
        return this.avatars;
    }

    public final AvatarDetails copy(AvatarType avatarType, List<Avatar.Builder> avatars) {
        Intrinsics.checkNotNullParameter(avatarType, "avatarType");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        return new AvatarDetails(avatarType, avatars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarDetails)) {
            return false;
        }
        AvatarDetails avatarDetails = (AvatarDetails) other;
        return this.avatarType == avatarDetails.avatarType && Intrinsics.areEqual(this.avatars, avatarDetails.avatars);
    }

    public int hashCode() {
        return (this.avatarType.hashCode() * 31) + this.avatars.hashCode();
    }

    public String toString() {
        return "AvatarDetails(avatarType=" + this.avatarType + ", avatars=" + this.avatars + ')';
    }

    public AvatarDetails(AvatarType avatarType, List<Avatar.Builder> avatars) {
        Intrinsics.checkNotNullParameter(avatarType, "avatarType");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        this.avatarType = avatarType;
        this.avatars = avatars;
    }

    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<Avatar.Builder> getAvatars() {
        return this.avatars;
    }
}
