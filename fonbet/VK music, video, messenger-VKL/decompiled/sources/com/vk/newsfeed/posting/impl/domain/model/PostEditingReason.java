package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: PostingState.kt */
/* loaded from: classes4.dex */
public interface PostEditingReason extends Parcelable {

    /* compiled from: PostingState.kt */
    public static final class EditExistingPost implements PostEditingReason {
        public static final Parcelable.Creator<EditExistingPost> CREATOR = new a();
        public final boolean b;

        /* compiled from: PostingState.kt */
        public static final class a implements Parcelable.Creator<EditExistingPost> {
            @Override // android.os.Parcelable.Creator
            public final EditExistingPost createFromParcel(Parcel parcel) {
                return new EditExistingPost(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final EditExistingPost[] newArray(int i) {
                return new EditExistingPost[i];
            }
        }

        public EditExistingPost(boolean z) {
            this.b = z;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostEditingReason
        public final boolean Ja() {
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
            return (obj instanceof EditExistingPost) && this.b == ((EditExistingPost) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("EditExistingPost(isSuggest="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: PostingState.kt */
    public static final class EditLocalDraft implements PostEditingReason {
        public static final Parcelable.Creator<EditLocalDraft> CREATOR = new a();
        public final boolean b;

        /* compiled from: PostingState.kt */
        public static final class a implements Parcelable.Creator<EditLocalDraft> {
            @Override // android.os.Parcelable.Creator
            public final EditLocalDraft createFromParcel(Parcel parcel) {
                return new EditLocalDraft(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final EditLocalDraft[] newArray(int i) {
                return new EditLocalDraft[i];
            }
        }

        public EditLocalDraft(boolean z) {
            this.b = z;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostEditingReason
        public final boolean Ja() {
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
            return (obj instanceof EditLocalDraft) && this.b == ((EditLocalDraft) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("EditLocalDraft(isSuggest="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: PostingState.kt */
    public static final class EditRemoteDraft implements PostEditingReason {
        public static final Parcelable.Creator<EditRemoteDraft> CREATOR = new a();
        public final boolean b;

        /* compiled from: PostingState.kt */
        public static final class a implements Parcelable.Creator<EditRemoteDraft> {
            @Override // android.os.Parcelable.Creator
            public final EditRemoteDraft createFromParcel(Parcel parcel) {
                return new EditRemoteDraft(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final EditRemoteDraft[] newArray(int i) {
                return new EditRemoteDraft[i];
            }
        }

        public EditRemoteDraft(boolean z) {
            this.b = z;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostEditingReason
        public final boolean Ja() {
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
            return (obj instanceof EditRemoteDraft) && this.b == ((EditRemoteDraft) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("EditRemoteDraft(isSuggest="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: PostingState.kt */
    public static final class NewPost implements PostEditingReason {
        public static final Parcelable.Creator<NewPost> CREATOR = new a();
        public final boolean b;

        /* compiled from: PostingState.kt */
        public static final class a implements Parcelable.Creator<NewPost> {
            @Override // android.os.Parcelable.Creator
            public final NewPost createFromParcel(Parcel parcel) {
                return new NewPost(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final NewPost[] newArray(int i) {
                return new NewPost[i];
            }
        }

        public NewPost(boolean z) {
            this.b = z;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostEditingReason
        public final boolean Ja() {
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
            return (obj instanceof NewPost) && this.b == ((NewPost) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("NewPost(isSuggest="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    boolean Ja();
}
