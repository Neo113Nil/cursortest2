package com.vk.video.ui.share.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoShareArguments.kt */
/* loaded from: classes7.dex */
public final class ShareSource implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShareSource[] $VALUES;
    public static final ShareSource ACTION_MENU;
    public static final ShareSource BUTTON;
    public static final Parcelable.Creator<ShareSource> CREATOR;

    /* compiled from: VideoShareArguments.kt */
    public static final class a implements Parcelable.Creator<ShareSource> {
        @Override // android.os.Parcelable.Creator
        public final ShareSource createFromParcel(Parcel parcel) {
            return ShareSource.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareSource[] newArray(int i) {
            return new ShareSource[i];
        }
    }

    static {
        ShareSource shareSource = new ShareSource("ACTION_MENU", 0);
        ACTION_MENU = shareSource;
        ShareSource shareSource2 = new ShareSource("BUTTON", 1);
        BUTTON = shareSource2;
        ShareSource[] shareSourceArr = {shareSource, shareSource2};
        $VALUES = shareSourceArr;
        $ENTRIES = new asp(shareSourceArr);
        CREATOR = new a();
    }

    public ShareSource() {
        throw null;
    }

    public static ShareSource valueOf(String str) {
        return (ShareSource) Enum.valueOf(ShareSource.class, str);
    }

    public static ShareSource[] values() {
        return (ShareSource[]) $VALUES.clone();
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
