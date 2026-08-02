package com.vk.clips.viewer.edit.presentation.feature.state.videoattach;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClipEditVideoAttachState.kt */
/* loaded from: classes17.dex */
public interface ClipEditVideoAttachState extends Parcelable {

    /* compiled from: ClipEditVideoAttachState.kt */
    public static final class Disabled implements ClipEditVideoAttachState {
        public static final Disabled b = new Disabled();
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        /* compiled from: ClipEditVideoAttachState.kt */
        public static final class a implements Parcelable.Creator<Disabled> {
            @Override // android.os.Parcelable.Creator
            public final Disabled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Disabled.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Disabled[] newArray(int i) {
                return new Disabled[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ClipEditVideoAttachState.kt */
    public static final class Empty implements ClipEditVideoAttachState {
        public static final Empty b = new Empty();
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        /* compiled from: ClipEditVideoAttachState.kt */
        public static final class a implements Parcelable.Creator<Empty> {
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Empty.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i) {
                return new Empty[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ClipEditVideoAttachState.kt */
    public static final class Loading implements ClipEditVideoAttachState {
        public static final Parcelable.Creator<Loading> CREATOR = new a();
        public final String b;

        /* compiled from: ClipEditVideoAttachState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                return new Loading(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(String str) {
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
            return (obj instanceof Loading) && epx.f(this.b, ((Loading) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Loading(id="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: ClipEditVideoAttachState.kt */
    public static final class Selected implements ClipEditVideoAttachState {
        public static final Parcelable.Creator<Selected> CREATOR = new a();
        public final String b;
        public final String c;
        public final UserId d;
        public final String e;
        public final Integer f;
        public final SdkActionLink g;

        /* compiled from: ClipEditVideoAttachState.kt */
        public static final class a implements Parcelable.Creator<Selected> {
            @Override // android.os.Parcelable.Creator
            public final Selected createFromParcel(Parcel parcel) {
                return new Selected(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(Selected.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (SdkActionLink) parcel.readParcelable(Selected.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Selected[] newArray(int i) {
                return new Selected[i];
            }
        }

        public Selected(String str, String str2, UserId userId, String str3, Integer num, SdkActionLink sdkActionLink) {
            this.b = str;
            this.c = str2;
            this.d = userId;
            this.e = str3;
            this.f = num;
            this.g = sdkActionLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Selected)) {
                return false;
            }
            Selected selected = (Selected) obj;
            return epx.f(this.b, selected.b) && epx.f(this.c, selected.c) && epx.f(this.d, selected.d) && epx.f(this.e, selected.e) && epx.f(this.f, selected.f) && epx.f(this.g, selected.g);
        }

        public final int hashCode() {
            int a2 = urd0.a(bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31, this.e);
            Integer num = this.f;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            SdkActionLink sdkActionLink = this.g;
            return hashCode + (sdkActionLink != null ? sdkActionLink.hashCode() : 0);
        }

        public final String toString() {
            return "Selected(title=" + this.b + ", cover=" + this.c + ", videoOwnerId=" + this.d + ", videoId=" + this.e + ", albumId=" + this.f + ", rawActionButton=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
            parcel.writeString(this.e);
            Integer num = this.f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.g, i);
        }

        public /* synthetic */ Selected(String str, String str2, UserId userId, String str3, Integer num, SdkActionLink sdkActionLink, int i, zcl zclVar) {
            this(str, str2, userId, str3, num, (i & 32) != 0 ? null : sdkActionLink);
        }
    }
}
