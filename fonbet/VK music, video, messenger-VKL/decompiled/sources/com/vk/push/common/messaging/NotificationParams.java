package com.vk.push.common.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: NotificationParams.kt */
/* loaded from: classes5.dex */
public final class NotificationParams implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: NotificationParams.kt */
    public static final class Builder {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public final NotificationParams build() {
            return new NotificationParams(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }

        public final Builder setBody(String str) {
            this.b = str;
            return this;
        }

        public final Builder setChannelId(String str) {
            this.f = str;
            return this;
        }

        public final Builder setClickAction(String str) {
            this.g = str;
            return this;
        }

        public final Builder setColor(String str) {
            this.e = str;
            return this;
        }

        public final Builder setIcon(String str) {
            this.d = str;
            return this;
        }

        public final Builder setImageUrl(String str) {
            this.c = str;
            return this;
        }

        public final Builder setTitle(String str) {
            this.a = str;
            return this;
        }
    }

    /* compiled from: NotificationParams.kt */
    public static final class CREATOR implements Parcelable.Creator<NotificationParams> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationParams createFromParcel(Parcel parcel) {
            return new NotificationParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationParams[] newArray(int i) {
            return new NotificationParams[i];
        }
    }

    public /* synthetic */ NotificationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, zcl zclVar) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getBody() {
        return this.c;
    }

    public final String getChannelId() {
        return this.g;
    }

    public final String getClickAction() {
        return this.h;
    }

    public final String getColor() {
        return this.f;
    }

    public final String getIcon() {
        return this.e;
    }

    public final String getImageUrl() {
        return this.d;
    }

    public final String getTitle() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public NotificationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public NotificationParams(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
