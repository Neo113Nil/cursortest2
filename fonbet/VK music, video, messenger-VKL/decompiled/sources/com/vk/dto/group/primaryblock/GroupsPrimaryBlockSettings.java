package com.vk.dto.group.primaryblock;

import com.vk.core.serialize.Serializer;
import com.vk.dto.group.GroupContentTabSetting;
import xsna.epx;

/* compiled from: GroupsPrimaryBlockSettings.kt */
/* loaded from: classes18.dex */
public final class GroupsPrimaryBlockSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupsPrimaryBlockSettings> CREATOR = new b();
    public final GroupContentTabSetting b;
    public final GroupsPrimaryBlockViewSettings c;

    /* compiled from: GroupsPrimaryBlockSettings.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupsPrimaryBlockSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupsPrimaryBlockSettings a(Serializer serializer) {
            return new GroupsPrimaryBlockSettings(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupsPrimaryBlockSettings[i];
        }
    }

    public GroupsPrimaryBlockSettings(GroupContentTabSetting groupContentTabSetting, GroupsPrimaryBlockViewSettings groupsPrimaryBlockViewSettings) {
        this.b = groupContentTabSetting;
        this.c = groupsPrimaryBlockViewSettings;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsPrimaryBlockSettings)) {
            return false;
        }
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings = (GroupsPrimaryBlockSettings) obj;
        return epx.f(this.b, groupsPrimaryBlockSettings.b) && epx.f(this.c, groupsPrimaryBlockSettings.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        GroupsPrimaryBlockViewSettings groupsPrimaryBlockViewSettings = this.c;
        return hashCode + (groupsPrimaryBlockViewSettings == null ? 0 : groupsPrimaryBlockViewSettings.hashCode());
    }

    public final String toString() {
        return "GroupsPrimaryBlockSettings(tab=" + this.b + ", viewSettings=" + this.c + ')';
    }

    public GroupsPrimaryBlockSettings(Serializer serializer) {
        this((GroupContentTabSetting) serializer.A(GroupContentTabSetting.class.getClassLoader()), (GroupsPrimaryBlockViewSettings) serializer.A(GroupsPrimaryBlockViewSettings.class.getClassLoader()));
    }
}
