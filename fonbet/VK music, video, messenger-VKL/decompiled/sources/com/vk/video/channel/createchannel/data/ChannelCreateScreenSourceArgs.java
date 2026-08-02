package com.vk.video.channel.createchannel.data;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelCreateScreenSourceArgs.kt */
/* loaded from: classes5.dex */
public final class ChannelCreateScreenSourceArgs implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelCreateScreenSourceArgs[] $VALUES;
    public static final ChannelCreateScreenSourceArgs CLIPS_EDIT_SCREEN;
    public static final ChannelCreateScreenSourceArgs CLIPS_UPLOAD_SCREEN;
    public static final Parcelable.Creator<ChannelCreateScreenSourceArgs> CREATOR;

    /* compiled from: ChannelCreateScreenSourceArgs.kt */
    public static final class a implements Parcelable.Creator<ChannelCreateScreenSourceArgs> {
        @Override // android.os.Parcelable.Creator
        public final ChannelCreateScreenSourceArgs createFromParcel(Parcel parcel) {
            return ChannelCreateScreenSourceArgs.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelCreateScreenSourceArgs[] newArray(int i) {
            return new ChannelCreateScreenSourceArgs[i];
        }
    }

    static {
        ChannelCreateScreenSourceArgs channelCreateScreenSourceArgs = new ChannelCreateScreenSourceArgs("CLIPS_EDIT_SCREEN", 0);
        CLIPS_EDIT_SCREEN = channelCreateScreenSourceArgs;
        ChannelCreateScreenSourceArgs channelCreateScreenSourceArgs2 = new ChannelCreateScreenSourceArgs("CLIPS_UPLOAD_SCREEN", 1);
        CLIPS_UPLOAD_SCREEN = channelCreateScreenSourceArgs2;
        ChannelCreateScreenSourceArgs[] channelCreateScreenSourceArgsArr = {channelCreateScreenSourceArgs, channelCreateScreenSourceArgs2};
        $VALUES = channelCreateScreenSourceArgsArr;
        $ENTRIES = new asp(channelCreateScreenSourceArgsArr);
        CREATOR = new a();
    }

    public ChannelCreateScreenSourceArgs() {
        throw null;
    }

    public static ChannelCreateScreenSourceArgs valueOf(String str) {
        return (ChannelCreateScreenSourceArgs) Enum.valueOf(ChannelCreateScreenSourceArgs.class, str);
    }

    public static ChannelCreateScreenSourceArgs[] values() {
        return (ChannelCreateScreenSourceArgs[]) $VALUES.clone();
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
