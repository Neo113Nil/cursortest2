package com.vk.donut.video.model.domain.action;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: DonutVideoAction.kt */
/* loaded from: classes18.dex */
public interface DonutVideoAction extends Parcelable {

    /* compiled from: DonutVideoAction.kt */
    public static final class OpenPopUp implements DonutVideoAction {
        public static final Parcelable.Creator<OpenPopUp> CREATOR = new a();
        public final int b;
        public final String c;
        public final String d;
        public final ActionButton e;

        /* compiled from: DonutVideoAction.kt */
        public static final class ActionButton implements Parcelable {
            public static final Parcelable.Creator<ActionButton> CREATOR = new a();
            public final String b;
            public final DonutVideoAction c;

            /* compiled from: DonutVideoAction.kt */
            public static final class a implements Parcelable.Creator<ActionButton> {
                @Override // android.os.Parcelable.Creator
                public final ActionButton createFromParcel(Parcel parcel) {
                    return new ActionButton(parcel.readString(), (DonutVideoAction) parcel.readParcelable(ActionButton.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ActionButton[] newArray(int i) {
                    return new ActionButton[i];
                }
            }

            public ActionButton(String str, DonutVideoAction donutVideoAction) {
                this.b = str;
                this.c = donutVideoAction;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj;
                return epx.f(this.b, actionButton.b) && epx.f(this.c, actionButton.c);
            }

            public final String getTitle() {
                return this.b;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                DonutVideoAction donutVideoAction = this.c;
                return hashCode + (donutVideoAction == null ? 0 : donutVideoAction.hashCode());
            }

            public final String toString() {
                return "ActionButton(title=" + this.b + ", action=" + this.c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeParcelable(this.c, i);
            }
        }

        /* compiled from: DonutVideoAction.kt */
        public static final class a implements Parcelable.Creator<OpenPopUp> {
            @Override // android.os.Parcelable.Creator
            public final OpenPopUp createFromParcel(Parcel parcel) {
                return new OpenPopUp(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenPopUp[] newArray(int i) {
                return new OpenPopUp[i];
            }
        }

        public OpenPopUp(int i, String str, String str2, ActionButton actionButton) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = actionButton;
        }

        public final ActionButton d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenPopUp)) {
                return false;
            }
            OpenPopUp openPopUp = (OpenPopUp) obj;
            return this.b == openPopUp.b && epx.f(this.c, openPopUp.c) && epx.f(this.d, openPopUp.d) && epx.f(this.e, openPopUp.e);
        }

        public final String f() {
            return this.d;
        }

        public final String getTitle() {
            return this.c;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
            ActionButton actionButton = this.e;
            return a2 + (actionButton == null ? 0 : actionButton.hashCode());
        }

        public final String toString() {
            return "OpenPopUp(imageResId=" + this.b + ", title=" + this.c + ", text=" + this.d + ", button=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            ActionButton actionButton = this.e;
            if (actionButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                actionButton.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: DonutVideoAction.kt */
    public static final class OpenUrl implements DonutVideoAction {
        public static final Parcelable.Creator<OpenUrl> CREATOR = new a();
        public final String b;

        /* compiled from: DonutVideoAction.kt */
        public static final class a implements Parcelable.Creator<OpenUrl> {
            @Override // android.os.Parcelable.Creator
            public final OpenUrl createFromParcel(Parcel parcel) {
                return new OpenUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenUrl[] newArray(int i) {
                return new OpenUrl[i];
            }
        }

        public OpenUrl(String str) {
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
            return (obj instanceof OpenUrl) && epx.f(this.b, ((OpenUrl) obj).b);
        }

        public final String getUrl() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenUrl(url="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: DonutVideoAction.kt */
    public static final class OpenVideoEditScreen implements DonutVideoAction {
        public static final Parcelable.Creator<OpenVideoEditScreen> CREATOR = new a();
        public final String b;

        /* compiled from: DonutVideoAction.kt */
        public static final class a implements Parcelable.Creator<OpenVideoEditScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenVideoEditScreen createFromParcel(Parcel parcel) {
                return new OpenVideoEditScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenVideoEditScreen[] newArray(int i) {
                return new OpenVideoEditScreen[i];
            }
        }

        public OpenVideoEditScreen(String str) {
            this.b = str;
        }

        public final String a1() {
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
            return (obj instanceof OpenVideoEditScreen) && epx.f(this.b, ((OpenVideoEditScreen) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenVideoEditScreen(videoId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
