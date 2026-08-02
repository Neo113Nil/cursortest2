package com.vk.dto.group.primaryblock;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: GroupsPrimaryBlockSettings.kt */
/* loaded from: classes18.dex */
public final class GroupsPrimaryBlockViewSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupsPrimaryBlockViewSettings> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupsPrimaryBlockViewSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupsPrimaryBlockViewSettings a(Serializer serializer) {
            return new GroupsPrimaryBlockViewSettings(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupsPrimaryBlockViewSettings[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsPrimaryBlockViewSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsPrimaryBlockViewSettings)) {
            return false;
        }
        GroupsPrimaryBlockViewSettings groupsPrimaryBlockViewSettings = (GroupsPrimaryBlockViewSettings) obj;
        return epx.f(this.b, groupsPrimaryBlockViewSettings.b) && epx.f(this.c, groupsPrimaryBlockViewSettings.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsPrimaryBlockViewSettings(title=");
        sb.append(this.b);
        sb.append(", marketSectionSettingsLink=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ GroupsPrimaryBlockViewSettings(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public GroupsPrimaryBlockViewSettings(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public GroupsPrimaryBlockViewSettings(Serializer serializer) {
        this(serializer.I(), serializer.I());
    }
}
