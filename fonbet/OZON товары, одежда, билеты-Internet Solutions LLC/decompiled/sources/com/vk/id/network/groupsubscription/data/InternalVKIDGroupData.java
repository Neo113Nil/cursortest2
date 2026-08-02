package com.vk.id.network.groupsubscription.data;

import B0.C2454a;
import Ek.a;
import G.g;
import I1.w;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\f\u0010!¨\u0006\""}, d2 = {"Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;", "", "", "imageUrl", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "", "userImageUrls", "", "subscriberCount", "friendsCount", "", "isVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getName", "getDescription", "Ljava/util/List;", "getUserImageUrls", "()Ljava/util/List;", "I", "getSubscriberCount", "getFriendsCount", "Z", "()Z", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternalVKIDGroupData {

    @NotNull
    private final String description;
    private final int friendsCount;

    @NotNull
    private final String imageUrl;
    private final boolean isVerified;

    @NotNull
    private final String name;
    private final int subscriberCount;

    @NotNull
    private final List<String> userImageUrls;

    public InternalVKIDGroupData(@NotNull String imageUrl, @NotNull String name, @NotNull String description, @NotNull List<String> userImageUrls, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userImageUrls, "userImageUrls");
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
        this.userImageUrls = userImageUrls;
        this.subscriberCount = i11;
        this.friendsCount = i12;
        this.isVerified = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDGroupData)) {
            return false;
        }
        InternalVKIDGroupData internalVKIDGroupData = (InternalVKIDGroupData) other;
        return Intrinsics.d(this.imageUrl, internalVKIDGroupData.imageUrl) && Intrinsics.d(this.name, internalVKIDGroupData.name) && Intrinsics.d(this.description, internalVKIDGroupData.description) && Intrinsics.d(this.userImageUrls, internalVKIDGroupData.userImageUrls) && this.subscriberCount == internalVKIDGroupData.subscriberCount && this.friendsCount == internalVKIDGroupData.friendsCount && this.isVerified == internalVKIDGroupData.isVerified;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getFriendsCount() {
        return this.friendsCount;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSubscriberCount() {
        return this.subscriberCount;
    }

    @NotNull
    public final List<String> getUserImageUrls() {
        return this.userImageUrls;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVerified) + C2454a.a(this.friendsCount, C2454a.a(this.subscriberCount, g.b(g.a(g.a(this.imageUrl.hashCode() * 31, 31, this.name), 31, this.description), 31, this.userImageUrls), 31), 31);
    }

    /* renamed from: isVerified, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.name;
        String str3 = this.description;
        List<String> list = this.userImageUrls;
        int i11 = this.subscriberCount;
        int i12 = this.friendsCount;
        boolean z11 = this.isVerified;
        StringBuilder d11 = C3660k.d("InternalVKIDGroupData(imageUrl=", str, ", name=", str2, ", description=");
        w.d(str3, ", userImageUrls=", ", subscriberCount=", d11, list);
        a.f(i11, i12, ", friendsCount=", ", isVerified=", d11);
        return Pk0.a.a(")", d11, z11);
    }
}
