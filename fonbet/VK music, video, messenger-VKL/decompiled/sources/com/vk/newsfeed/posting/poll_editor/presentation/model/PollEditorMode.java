package com.vk.newsfeed.posting.poll_editor.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: PollUiState.kt */
/* loaded from: classes4.dex */
public abstract class PollEditorMode implements Parcelable {

    /* compiled from: PollUiState.kt */
    public static final class Create extends PollEditorMode {
        public static final Create b = new Create(null);
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* compiled from: PollUiState.kt */
        public static final class a implements Parcelable.Creator<Create> {
            @Override // android.os.Parcelable.Creator
            public final Create createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Create.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Create[] newArray(int i) {
                return new Create[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Create);
        }

        public final int hashCode() {
            return 1701111136;
        }

        public final String toString() {
            return "Create";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PollUiState.kt */
    public static final class Edit extends PollEditorMode {
        public static final Edit b = new Edit(null);
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* compiled from: PollUiState.kt */
        public static final class a implements Parcelable.Creator<Edit> {
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Edit.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i) {
                return new Edit[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Edit);
        }

        public final int hashCode() {
            return -985891986;
        }

        public final String toString() {
            return "Edit";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ PollEditorMode(zcl zclVar) {
        this();
    }

    public PollEditorMode() {
    }
}
