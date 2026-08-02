package com.vk.clips.attachments.impl.publish.links.edit.helper;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: EditLinkHideReason.kt */
/* loaded from: classes16.dex */
public interface EditLinkHideReason extends Parcelable {

    /* compiled from: EditLinkHideReason.kt */
    public static final class ClickOutside implements EditLinkHideReason {
        public static final ClickOutside b = new ClickOutside();
        public static final Parcelable.Creator<ClickOutside> CREATOR = new a();

        /* compiled from: EditLinkHideReason.kt */
        public static final class a implements Parcelable.Creator<ClickOutside> {
            @Override // android.os.Parcelable.Creator
            public final ClickOutside createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ClickOutside.b;
            }

            @Override // android.os.Parcelable.Creator
            public final ClickOutside[] newArray(int i) {
                return new ClickOutside[i];
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

    /* compiled from: EditLinkHideReason.kt */
    public static final class RulesClick implements EditLinkHideReason {
        public static final Parcelable.Creator<RulesClick> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: EditLinkHideReason.kt */
        public static final class a implements Parcelable.Creator<RulesClick> {
            @Override // android.os.Parcelable.Creator
            public final RulesClick createFromParcel(Parcel parcel) {
                return new RulesClick(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RulesClick[] newArray(int i) {
                return new RulesClick[i];
            }
        }

        public RulesClick(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: EditLinkHideReason.kt */
    public static final class SaveClick implements EditLinkHideReason {
        public static final Parcelable.Creator<SaveClick> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: EditLinkHideReason.kt */
        public static final class a implements Parcelable.Creator<SaveClick> {
            @Override // android.os.Parcelable.Creator
            public final SaveClick createFromParcel(Parcel parcel) {
                return new SaveClick(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SaveClick[] newArray(int i) {
                return new SaveClick[i];
            }
        }

        public SaveClick(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }
}
