package com.vk.video.ui.upload.impl.coverchoose.presentation.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.nr;

/* compiled from: CoverChooseArguments.kt */
/* loaded from: classes7.dex */
public interface CoverChooseArguments extends Parcelable {

    /* compiled from: CoverChooseArguments.kt */
    public static final class AlbumCoverChooseArguments implements CoverChooseArguments {
        public static final Parcelable.Creator<AlbumCoverChooseArguments> CREATOR = new a();
        public final String b;

        /* compiled from: CoverChooseArguments.kt */
        public static final class a implements Parcelable.Creator<AlbumCoverChooseArguments> {
            @Override // android.os.Parcelable.Creator
            public final AlbumCoverChooseArguments createFromParcel(Parcel parcel) {
                return new AlbumCoverChooseArguments(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AlbumCoverChooseArguments[] newArray(int i) {
                return new AlbumCoverChooseArguments[i];
            }
        }

        public AlbumCoverChooseArguments(String str) {
            this.b = str;
        }

        @Override // com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments
        public final String U2() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AlbumCoverChooseArguments) && epx.f(this.b, ((AlbumCoverChooseArguments) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AlbumCoverChooseArguments(coverPath="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: CoverChooseArguments.kt */
    public static final class VideoCoverChooseArguments implements CoverChooseArguments {
        public static final Parcelable.Creator<VideoCoverChooseArguments> CREATOR = new a();
        public final String b;
        public final Integer c;
        public final UserId d;
        public final boolean e;

        /* compiled from: CoverChooseArguments.kt */
        public static final class a implements Parcelable.Creator<VideoCoverChooseArguments> {
            @Override // android.os.Parcelable.Creator
            public final VideoCoverChooseArguments createFromParcel(Parcel parcel) {
                return new VideoCoverChooseArguments(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(VideoCoverChooseArguments.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoCoverChooseArguments[] newArray(int i) {
                return new VideoCoverChooseArguments[i];
            }
        }

        public VideoCoverChooseArguments(String str, Integer num, UserId userId, boolean z) {
            this.b = str;
            this.c = num;
            this.d = userId;
            this.e = z;
        }

        @Override // com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseArguments
        public final String U2() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoCoverChooseArguments)) {
                return false;
            }
            VideoCoverChooseArguments videoCoverChooseArguments = (VideoCoverChooseArguments) obj;
            return epx.f(this.b, videoCoverChooseArguments.b) && epx.f(this.c, videoCoverChooseArguments.c) && epx.f(this.d, videoCoverChooseArguments.d) && this.e == videoCoverChooseArguments.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            return Boolean.hashCode(this.e) + bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoCoverChooseArguments(coverPath=");
            sb.append(this.b);
            sb.append(", videoId=");
            sb.append(this.c);
            sb.append(", videoOwnerId=");
            sb.append(this.d);
            sb.append(", isVideoVertical=");
            return q0.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            Integer num = this.c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.e ? 1 : 0);
        }
    }

    String U2();
}
