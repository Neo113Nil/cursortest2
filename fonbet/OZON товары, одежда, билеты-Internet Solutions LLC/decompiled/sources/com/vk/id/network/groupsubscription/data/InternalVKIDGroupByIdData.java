package com.vk.id.network.groupsubscription.data;

import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "", "", "groupId", AppMeasurementSdk.ConditionalUserProperty.NAME, "imageUrl", "description", "", "isVerified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGroupId", "getName", "getImageUrl", "getDescription", "Z", "()Z", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternalVKIDGroupByIdData {

    @NotNull
    private final String description;

    @NotNull
    private final String groupId;

    @NotNull
    private final String imageUrl;
    private final boolean isVerified;

    @NotNull
    private final String name;

    public InternalVKIDGroupByIdData(@NotNull String groupId, @NotNull String name, @NotNull String imageUrl, @NotNull String description, boolean z11) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        this.groupId = groupId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.isVerified = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDGroupByIdData)) {
            return false;
        }
        InternalVKIDGroupByIdData internalVKIDGroupByIdData = (InternalVKIDGroupByIdData) other;
        return Intrinsics.d(this.groupId, internalVKIDGroupByIdData.groupId) && Intrinsics.d(this.name, internalVKIDGroupByIdData.name) && Intrinsics.d(this.imageUrl, internalVKIDGroupByIdData.imageUrl) && Intrinsics.d(this.description, internalVKIDGroupByIdData.description) && this.isVerified == internalVKIDGroupByIdData.isVerified;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVerified) + g.a(g.a(g.a(this.groupId.hashCode() * 31, 31, this.name), 31, this.imageUrl), 31, this.description);
    }

    /* renamed from: isVerified, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    @NotNull
    public String toString() {
        String str = this.groupId;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.description;
        boolean z11 = this.isVerified;
        StringBuilder d11 = C3660k.d("InternalVKIDGroupByIdData(groupId=", str, ", name=", str2, ", imageUrl=");
        a.h(d11, str3, ", description=", str4, ", isVerified=");
        return Pk0.a.a(")", d11, z11);
    }
}
