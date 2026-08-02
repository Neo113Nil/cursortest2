package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class GroupWallPostingSettings implements Serializer.StreamParcelable {
    public static final Serializer.c<GroupWallPostingSettings> CREATOR = new a();
    public final boolean b;
    public final GroupPrivacyType c;
    public final GroupWallStatus d;
    public final GroupAdminLevel e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupWallPostingSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupWallPostingSettings a(Serializer serializer) {
            return new GroupWallPostingSettings(serializer.m(), (GroupPrivacyType) serializer.C(), (GroupWallStatus) serializer.C(), (GroupAdminLevel) serializer.C(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupWallPostingSettings[i];
        }
    }

    public GroupWallPostingSettings(boolean z, GroupPrivacyType groupPrivacyType, GroupWallStatus groupWallStatus, GroupAdminLevel groupAdminLevel, boolean z2) {
        this.b = z;
        this.c = groupPrivacyType;
        this.d = groupWallStatus;
        this.e = groupAdminLevel;
        this.f = z2;
    }

    public static GroupWallPostingSettings a(GroupWallPostingSettings groupWallPostingSettings, GroupPrivacyType groupPrivacyType, boolean z, int i) {
        boolean z2 = groupWallPostingSettings.b;
        if ((i & 2) != 0) {
            groupPrivacyType = groupWallPostingSettings.c;
        }
        GroupPrivacyType groupPrivacyType2 = groupPrivacyType;
        GroupWallStatus groupWallStatus = groupWallPostingSettings.d;
        GroupAdminLevel groupAdminLevel = groupWallPostingSettings.e;
        if ((i & 16) != 0) {
            z = groupWallPostingSettings.f;
        }
        groupWallPostingSettings.getClass();
        return new GroupWallPostingSettings(z2, groupPrivacyType2, groupWallStatus, groupAdminLevel, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.g0(this.c);
        serializer.g0(this.d);
        serializer.g0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupWallPostingSettings)) {
            return false;
        }
        GroupWallPostingSettings groupWallPostingSettings = (GroupWallPostingSettings) obj;
        return this.b == groupWallPostingSettings.b && this.c == groupWallPostingSettings.c && this.d == groupWallPostingSettings.d && this.e == groupWallPostingSettings.e && this.f == groupWallPostingSettings.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        GroupAdminLevel groupAdminLevel = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (groupAdminLevel == null ? 0 : groupAdminLevel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupWallPostingSettings(isAdmin=");
        sb.append(this.b);
        sb.append(", privacyType=");
        sb.append(this.c);
        sb.append(", wallStatus=");
        sb.append(this.d);
        sb.append(", adminLevel=");
        sb.append(this.e);
        sb.append(", commentsAreClosed=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
