package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WebActionVkInternal.kt */
/* loaded from: classes6.dex */
public final class WebActionVkInternal extends WebAction {
    public static final a CREATOR = new a();
    public final Payload c;
    public final WebAction d;
    public final String e;
    public final String f;

    /* compiled from: WebActionVkInternal.kt */
    public static abstract class Payload implements Parcelable {

        /* compiled from: WebActionVkInternal.kt */
        public static final class ShareMe extends Payload {
            public static final Parcelable.Creator<ShareMe> CREATOR = new a();
            public final String b;

            /* compiled from: WebActionVkInternal.kt */
            public static final class a implements Parcelable.Creator<ShareMe> {
                @Override // android.os.Parcelable.Creator
                public final ShareMe createFromParcel(Parcel parcel) {
                    return new ShareMe(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final ShareMe[] newArray(int i) {
                    return new ShareMe[i];
                }
            }

            public ShareMe(String str) {
                super(null);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShareMe) && epx.f(this.b, ((ShareMe) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ShareMe(widgetPayload="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }

            public ShareMe(Parcel parcel) {
                this(parcel.readString());
            }
        }

        public /* synthetic */ Payload(zcl zclVar) {
            this();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Payload() {
        }

        /* compiled from: WebActionVkInternal.kt */
        public static final class Music extends Payload {
            public static final Parcelable.Creator<Music> CREATOR = new a();
            public final Extra b;
            public final String c;
            public final int d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: WebActionVkInternal.kt */
            public static final class Extra {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Extra[] $VALUES;
                public static final Extra PLAY;
                public static final Extra SHUFFLE;

                static {
                    Extra extra = new Extra("PLAY", 0);
                    PLAY = extra;
                    Extra extra2 = new Extra("SHUFFLE", 1);
                    SHUFFLE = extra2;
                    Extra[] extraArr = {extra, extra2};
                    $VALUES = extraArr;
                    $ENTRIES = new asp(extraArr);
                }

                public Extra() {
                    throw null;
                }

                public static Extra valueOf(String str) {
                    return (Extra) Enum.valueOf(Extra.class, str);
                }

                public static Extra[] values() {
                    return (Extra[]) $VALUES.clone();
                }
            }

            /* compiled from: WebActionVkInternal.kt */
            public static final class a implements Parcelable.Creator<Music> {
                @Override // android.os.Parcelable.Creator
                public final Music createFromParcel(Parcel parcel) {
                    return new Music(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final Music[] newArray(int i) {
                    return new Music[i];
                }
            }

            public Music(Extra extra, String str, int i) {
                super(null);
                this.b = extra;
                this.c = str;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Music)) {
                    return false;
                }
                Music music = (Music) obj;
                return this.b == music.b && epx.f(this.c, music.c) && this.d == music.d;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                return Integer.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Music(extra=");
                sb.append(this.b);
                sb.append(", blockId=");
                sb.append(this.c);
                sb.append(", itemId=");
                return vu5.b(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
                parcel.writeString(this.c);
                parcel.writeInt(this.d);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Music(Parcel parcel) {
                this((Extra) r1, parcel.readString(), parcel.readInt());
                Object obj;
                String readString = parcel.readString();
                Object obj2 = Extra.PLAY;
                if (readString != null) {
                    try {
                        obj = Enum.valueOf(Extra.class, readString.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                }
            }
        }
    }

    /* compiled from: WebActionVkInternal.kt */
    public static final class a implements Parcelable.Creator<WebActionVkInternal> {
        @Override // android.os.Parcelable.Creator
        public final WebActionVkInternal createFromParcel(Parcel parcel) {
            return new WebActionVkInternal(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionVkInternal[] newArray(int i) {
            return new WebActionVkInternal[i];
        }
    }

    public WebActionVkInternal(Payload payload, WebAction webAction, String str, String str2) {
        this.c = payload;
        this.d = webAction;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionVkInternal)) {
            return false;
        }
        WebActionVkInternal webActionVkInternal = (WebActionVkInternal) obj;
        return epx.f(this.c, webActionVkInternal.c) && epx.f(this.d, webActionVkInternal.d) && epx.f(this.e, webActionVkInternal.e) && epx.f(this.f, webActionVkInternal.f);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.e;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        WebAction webAction = this.d;
        int hashCode2 = (hashCode + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionVkInternal(payload=");
        sb.append(this.c);
        sb.append(", fallbackAction=");
        sb.append(this.d);
        sb.append(", accessibilityLabel=");
        sb.append(this.e);
        sb.append(", type=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public WebActionVkInternal(Parcel parcel) {
        this((Payload) parcel.readParcelable(Payload.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}
