package com.vk.clips.coauthors.list.pendings.mvi.entity.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipCoauthorsDecisionLaunchType.kt */
/* loaded from: classes16.dex */
public interface ClipCoauthorsDecisionLaunchType extends Parcelable {

    /* compiled from: ClipCoauthorsDecisionLaunchType.kt */
    public static final class AcceptRequest implements ClipCoauthorsDecisionLaunchType {
        public static final AcceptRequest b = new AcceptRequest();
        public static final Parcelable.Creator<AcceptRequest> CREATOR = new a();

        /* compiled from: ClipCoauthorsDecisionLaunchType.kt */
        public static final class a implements Parcelable.Creator<AcceptRequest> {
            @Override // android.os.Parcelable.Creator
            public final AcceptRequest createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AcceptRequest.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AcceptRequest[] newArray(int i) {
                return new AcceptRequest[i];
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

    /* compiled from: ClipCoauthorsDecisionLaunchType.kt */
    public static final class DeclineRequest implements ClipCoauthorsDecisionLaunchType {
        public static final DeclineRequest b = new DeclineRequest();
        public static final Parcelable.Creator<DeclineRequest> CREATOR = new a();

        /* compiled from: ClipCoauthorsDecisionLaunchType.kt */
        public static final class a implements Parcelable.Creator<DeclineRequest> {
            @Override // android.os.Parcelable.Creator
            public final DeclineRequest createFromParcel(Parcel parcel) {
                parcel.readInt();
                return DeclineRequest.b;
            }

            @Override // android.os.Parcelable.Creator
            public final DeclineRequest[] newArray(int i) {
                return new DeclineRequest[i];
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

    /* compiled from: ClipCoauthorsDecisionLaunchType.kt */
    public static final class DeleteClip implements ClipCoauthorsDecisionLaunchType {
        public static final Parcelable.Creator<DeleteClip> CREATOR = new a();
        public final UserId b;

        /* compiled from: ClipCoauthorsDecisionLaunchType.kt */
        public static final class a implements Parcelable.Creator<DeleteClip> {
            @Override // android.os.Parcelable.Creator
            public final DeleteClip createFromParcel(Parcel parcel) {
                return new DeleteClip((UserId) parcel.readParcelable(DeleteClip.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeleteClip[] newArray(int i) {
                return new DeleteClip[i];
            }
        }

        public DeleteClip(UserId userId) {
            this.b = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }
}
