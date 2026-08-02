package com.vk.dto.group;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: GroupVkTicketDto.kt */
/* loaded from: classes18.dex */
public final class GroupVkTicketDto implements Serializer.StreamParcelable {
    public static final Serializer.c<GroupVkTicketDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("is_onboarding_enabled")
    private final boolean isOnboardingEnabled;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupVkTicketDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupVkTicketDto a(Serializer serializer) {
            return new GroupVkTicketDto(serializer.H(), serializer.H(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupVkTicketDto[i];
        }
    }

    public GroupVkTicketDto(String str, String str2, String str3, boolean z) {
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.isOnboardingEnabled = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.title);
        serializer.j0(this.description);
        serializer.j0(this.url);
        serializer.L(this.isOnboardingEnabled ? (byte) 1 : (byte) 0);
    }

    public final boolean d() {
        return this.isOnboardingEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupVkTicketDto)) {
            return false;
        }
        GroupVkTicketDto groupVkTicketDto = (GroupVkTicketDto) obj;
        return epx.f(this.title, groupVkTicketDto.title) && epx.f(this.description, groupVkTicketDto.description) && epx.f(this.url, groupVkTicketDto.url) && this.isOnboardingEnabled == groupVkTicketDto.isOnboardingEnabled;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return Boolean.hashCode(this.isOnboardingEnabled) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupVkTicketDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isOnboardingEnabled=");
        return q0.a(sb, this.isOnboardingEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
