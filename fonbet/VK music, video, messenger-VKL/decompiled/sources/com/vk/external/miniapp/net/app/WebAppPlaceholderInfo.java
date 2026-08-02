package com.vk.external.miniapp.net.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: WebAppPlaceholderInfo.kt */
/* loaded from: classes18.dex */
public final class WebAppPlaceholderInfo implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final String c;
    public final Reason d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebAppPlaceholderInfo.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason BLOCKED;
        public static final a Companion;
        public static final Reason NOT_AVAILABLE;
        public static final Reason UNKNOWN;
        private final int code;

        /* compiled from: WebAppPlaceholderInfo.kt */
        public static final class a {
            public static Reason a(int i) {
                Reason reason;
                Reason[] values = Reason.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        reason = null;
                        break;
                    }
                    reason = values[i2];
                    if (reason.h() == i) {
                        break;
                    }
                    i2++;
                }
                return reason == null ? Reason.UNKNOWN : reason;
            }
        }

        static {
            Reason reason = new Reason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = reason;
            Reason reason2 = new Reason("NOT_AVAILABLE", 1, 1);
            NOT_AVAILABLE = reason2;
            Reason reason3 = new Reason("BLOCKED", 2, 2);
            BLOCKED = reason3;
            Reason[] reasonArr = {reason, reason2, reason3};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
            Companion = new a();
        }

        public Reason(String str, int i, int i2) {
            this.code = i2;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    /* compiled from: WebAppPlaceholderInfo.kt */
    public static final class a implements Parcelable.Creator<WebAppPlaceholderInfo> {
        @Override // android.os.Parcelable.Creator
        public final WebAppPlaceholderInfo createFromParcel(Parcel parcel) {
            return new WebAppPlaceholderInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebAppPlaceholderInfo[] newArray(int i) {
            return new WebAppPlaceholderInfo[i];
        }
    }

    public WebAppPlaceholderInfo(String str, String str2, Reason reason) {
        this.b = str;
        this.c = str2;
        this.d = reason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebAppPlaceholderInfo)) {
            return false;
        }
        WebAppPlaceholderInfo webAppPlaceholderInfo = (WebAppPlaceholderInfo) obj;
        return epx.f(this.b, webAppPlaceholderInfo.b) && epx.f(this.c, webAppPlaceholderInfo.c) && this.d == webAppPlaceholderInfo.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "WebAppPlaceholderInfo(title=" + this.b + ", subtitle=" + this.c + ", reason=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebAppPlaceholderInfo(Parcel parcel) {
        this(r0, r1, Reason.a.a(r4));
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        Reason.Companion.getClass();
    }
}
