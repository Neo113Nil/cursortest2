package com.vk.dto.stories.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyTargetAdData.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdFormat implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MyTargetAdFormat[] $VALUES;
    public static final Parcelable.Creator<MyTargetAdFormat> CREATOR;
    public static final MyTargetAdFormat HTML5;
    public static final MyTargetAdFormat POST;
    public static final MyTargetAdFormat STATIC;
    public static final MyTargetAdFormat VIDEO;

    /* compiled from: MyTargetAdData.kt */
    public static final class a implements Parcelable.Creator<MyTargetAdFormat> {
        @Override // android.os.Parcelable.Creator
        public final MyTargetAdFormat createFromParcel(Parcel parcel) {
            return MyTargetAdFormat.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MyTargetAdFormat[] newArray(int i) {
            return new MyTargetAdFormat[i];
        }
    }

    static {
        MyTargetAdFormat myTargetAdFormat = new MyTargetAdFormat("STATIC", 0);
        STATIC = myTargetAdFormat;
        MyTargetAdFormat myTargetAdFormat2 = new MyTargetAdFormat(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = myTargetAdFormat2;
        MyTargetAdFormat myTargetAdFormat3 = new MyTargetAdFormat("POST", 2);
        POST = myTargetAdFormat3;
        MyTargetAdFormat myTargetAdFormat4 = new MyTargetAdFormat("HTML5", 3);
        HTML5 = myTargetAdFormat4;
        MyTargetAdFormat[] myTargetAdFormatArr = {myTargetAdFormat, myTargetAdFormat2, myTargetAdFormat3, myTargetAdFormat4};
        $VALUES = myTargetAdFormatArr;
        $ENTRIES = new asp(myTargetAdFormatArr);
        CREATOR = new a();
    }

    public MyTargetAdFormat() {
        throw null;
    }

    public static MyTargetAdFormat valueOf(String str) {
        return (MyTargetAdFormat) Enum.valueOf(MyTargetAdFormat.class, str);
    }

    public static MyTargetAdFormat[] values() {
        return (MyTargetAdFormat[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
