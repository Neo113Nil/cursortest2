package com.vk.im.engine.models.groups;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupDeactivation.kt */
/* loaded from: classes2.dex */
public final class GroupDeactivation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupDeactivation> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupDeactivation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupDeactivation a(Serializer serializer) {
            return new GroupDeactivation(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupDeactivation[i];
        }
    }

    public GroupDeactivation() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupDeactivation)) {
            return false;
        }
        GroupDeactivation groupDeactivation = (GroupDeactivation) obj;
        return epx.f(this.b, groupDeactivation.b) && epx.f(this.c, groupDeactivation.c) && epx.f(this.d, groupDeactivation.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupDeactivation(deactivated=");
        sb.append(this.b);
        sb.append(", deactivatedMessage=");
        sb.append(this.c);
        sb.append(", deactivatedType=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ GroupDeactivation(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public GroupDeactivation(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public GroupDeactivation(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H());
    }
}
