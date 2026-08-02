package com.vk.voip.ui.call_list.scheduled.feature.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: ScheduledWatchTogetherOption.kt */
/* loaded from: classes7.dex */
public final class ScheduledWatchTogetherOption implements Parcelable {
    public static final Parcelable.Creator<ScheduledWatchTogetherOption> CREATOR = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: ScheduledWatchTogetherOption.kt */
    public static final class a implements Parcelable.Creator<ScheduledWatchTogetherOption> {
        @Override // android.os.Parcelable.Creator
        public final ScheduledWatchTogetherOption createFromParcel(Parcel parcel) {
            return new ScheduledWatchTogetherOption(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduledWatchTogetherOption[] newArray(int i) {
            return new ScheduledWatchTogetherOption[i];
        }
    }

    public ScheduledWatchTogetherOption(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public static ScheduledWatchTogetherOption a(ScheduledWatchTogetherOption scheduledWatchTogetherOption, boolean z) {
        boolean z2 = scheduledWatchTogetherOption.b;
        scheduledWatchTogetherOption.getClass();
        return new ScheduledWatchTogetherOption(z2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduledWatchTogetherOption)) {
            return false;
        }
        ScheduledWatchTogetherOption scheduledWatchTogetherOption = (ScheduledWatchTogetherOption) obj;
        return this.b == scheduledWatchTogetherOption.b && this.c == scheduledWatchTogetherOption.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledWatchTogetherOption(isActive=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
