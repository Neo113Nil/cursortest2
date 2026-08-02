package com.vk.clips.attachments.api.publish.cta;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: ClipsInvolvementAttachesState.kt */
/* loaded from: classes16.dex */
public final class ClipsInvolvementAttachesState implements Parcelable {
    public static final Parcelable.Creator<ClipsInvolvementAttachesState> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final VkTicketActionState f;

    /* compiled from: ClipsInvolvementAttachesState.kt */
    public static final class VkTicketActionState implements Parcelable {
        public static final Parcelable.Creator<VkTicketActionState> CREATOR = new a();
        public final String b;

        /* compiled from: ClipsInvolvementAttachesState.kt */
        public static final class a implements Parcelable.Creator<VkTicketActionState> {
            @Override // android.os.Parcelable.Creator
            public final VkTicketActionState createFromParcel(Parcel parcel) {
                return new VkTicketActionState(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkTicketActionState[] newArray(int i) {
                return new VkTicketActionState[i];
            }
        }

        public VkTicketActionState(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VkTicketActionState) && epx.f(this.b, ((VkTicketActionState) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VkTicketActionState(vkTicketAppUrl="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: ClipsInvolvementAttachesState.kt */
    public static final class a implements Parcelable.Creator<ClipsInvolvementAttachesState> {
        @Override // android.os.Parcelable.Creator
        public final ClipsInvolvementAttachesState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new ClipsInvolvementAttachesState(z5, z3, z4, z, parcel.readInt() == 0 ? null : VkTicketActionState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsInvolvementAttachesState[] newArray(int i) {
            return new ClipsInvolvementAttachesState[i];
        }
    }

    public ClipsInvolvementAttachesState(boolean z, boolean z2, boolean z3, boolean z4, VkTicketActionState vkTicketActionState) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = vkTicketActionState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        VkTicketActionState vkTicketActionState = this.f;
        if (vkTicketActionState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkTicketActionState.writeToParcel(parcel, i);
        }
    }
}
