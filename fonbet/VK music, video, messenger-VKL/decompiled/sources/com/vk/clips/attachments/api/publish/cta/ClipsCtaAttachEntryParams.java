package com.vk.clips.attachments.api.publish.cta;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ClipsCtaAttachEntryParams.kt */
/* loaded from: classes16.dex */
public final class ClipsCtaAttachEntryParams implements Parcelable {
    public static final Parcelable.Creator<ClipsCtaAttachEntryParams> CREATOR = new a();
    public final UserId b;
    public final ClipInvolvementActionButton<?> c;
    public final ClipsInvolvementAttachesState d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    /* compiled from: ClipsCtaAttachEntryParams.kt */
    public static final class a implements Parcelable.Creator<ClipsCtaAttachEntryParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsCtaAttachEntryParams createFromParcel(Parcel parcel) {
            return new ClipsCtaAttachEntryParams((UserId) parcel.readParcelable(ClipsCtaAttachEntryParams.class.getClassLoader()), (ClipInvolvementActionButton) parcel.readParcelable(ClipsCtaAttachEntryParams.class.getClassLoader()), ClipsInvolvementAttachesState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsCtaAttachEntryParams[] newArray(int i) {
            return new ClipsCtaAttachEntryParams[i];
        }
    }

    public ClipsCtaAttachEntryParams(UserId userId, ClipInvolvementActionButton<?> clipInvolvementActionButton, ClipsInvolvementAttachesState clipsInvolvementAttachesState, boolean z, String str, String str2, String str3, int i) {
        this.b = userId;
        this.c = clipInvolvementActionButton;
        this.d = clipsInvolvementAttachesState;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsCtaAttachEntryParams)) {
            return false;
        }
        ClipsCtaAttachEntryParams clipsCtaAttachEntryParams = (ClipsCtaAttachEntryParams) obj;
        return epx.f(this.b, clipsCtaAttachEntryParams.b) && epx.f(this.c, clipsCtaAttachEntryParams.c) && epx.f(this.d, clipsCtaAttachEntryParams.d) && this.e == clipsCtaAttachEntryParams.e && epx.f(this.f, clipsCtaAttachEntryParams.f) && epx.f(this.g, clipsCtaAttachEntryParams.g) && epx.f(this.h, clipsCtaAttachEntryParams.h) && this.i == clipsCtaAttachEntryParams.i;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        ClipInvolvementActionButton<?> clipInvolvementActionButton = this.c;
        return Integer.hashCode(this.i) + urd0.a(urd0.a(urd0.a(qoy.b((this.d.hashCode() + ((hashCode + (clipInvolvementActionButton == null ? 0 : clipInvolvementActionButton.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsCtaAttachEntryParams(groupId=");
        sb.append(this.b);
        sb.append(", currentSelection=");
        sb.append(this.c);
        sb.append(", attachesAvailabilityState=");
        sb.append(this.d);
        sb.append(", isOpenModalChannelOnboardingAvailable=");
        sb.append(this.e);
        sb.append(", fragmentResultBundleKey=");
        sb.append(this.f);
        sb.append(", fragmentResultRequestKey=");
        sb.append(this.g);
        sb.append(", entryPoint=");
        sb.append(this.h);
        sb.append(", sessionId=");
        return vu5.b(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
    }
}
