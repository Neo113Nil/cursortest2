package com.vk.superapp.api.dto.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.hihealth.data.DeviceInfo;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.qjg;
import xsna.zrp;

/* compiled from: InvalidWidgetInfo.kt */
/* loaded from: classes6.dex */
public final class InvalidWidgetInfo implements Parcelable {
    public static final Parcelable.Creator<InvalidWidgetInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final Source d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvalidWidgetInfo.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final a Companion;
        public static final Source SINGLE_QUEUE;
        public static final Source SUPER_APP_GET;
        public static final Source UNKNOWN;

        /* compiled from: InvalidWidgetInfo.kt */
        public static final class a {
        }

        static {
            Source source = new Source(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = source;
            Source source2 = new Source("SUPER_APP_GET", 1);
            SUPER_APP_GET = source2;
            Source source3 = new Source("SINGLE_QUEUE", 2);
            SINGLE_QUEUE = source3;
            Source[] sourceArr = {source, source2, source3};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
            Companion = new a();
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: InvalidWidgetInfo.kt */
    public static final class a implements Parcelable.Creator<InvalidWidgetInfo> {
        @Override // android.os.Parcelable.Creator
        public final InvalidWidgetInfo createFromParcel(Parcel parcel) {
            return new InvalidWidgetInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InvalidWidgetInfo[] newArray(int i) {
            return new InvalidWidgetInfo[i];
        }
    }

    public InvalidWidgetInfo(String str, String str2, Source source) {
        this.b = str;
        this.c = str2;
        this.d = source;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvalidWidgetInfo)) {
            return false;
        }
        InvalidWidgetInfo invalidWidgetInfo = (InvalidWidgetInfo) obj;
        return epx.f(this.b, invalidWidgetInfo.b) && epx.f(this.c, invalidWidgetInfo.c) && this.d == invalidWidgetInfo.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "InvalidWidgetInfo(uid=" + this.b + ", error=" + this.c + ", source=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r5 == null) goto L12;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidWidgetInfo(Parcel parcel) {
        this(r0, r1, r5);
        Source source;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (readString3 != null) {
            Source.Companion.getClass();
            Source[] values = Source.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    source = null;
                    break;
                }
                source = values[i];
                String name = source.name();
                Locale locale = Locale.ROOT;
                if (name.toLowerCase(locale).equals(readString3.toLowerCase(locale))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        source = Source.UNKNOWN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidWidgetInfo(String str, Throwable th, Source source) {
        this(str, r4, source);
        String str2;
        if (th != null) {
            str2 = qjg.a(th) + ": " + th.getMessage();
        } else {
            str2 = DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }
}
