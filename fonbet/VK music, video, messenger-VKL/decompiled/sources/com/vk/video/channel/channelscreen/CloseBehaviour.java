package com.vk.video.channel.channelscreen;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelScreenArgs.kt */
/* loaded from: classes5.dex */
public final class CloseBehaviour implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CloseBehaviour[] $VALUES;
    public static final CloseBehaviour BACK;
    public static final Parcelable.Creator<CloseBehaviour> CREATOR;
    public static final CloseBehaviour FINISH;

    /* compiled from: ChannelScreenArgs.kt */
    public static final class a implements Parcelable.Creator<CloseBehaviour> {
        @Override // android.os.Parcelable.Creator
        public final CloseBehaviour createFromParcel(Parcel parcel) {
            return CloseBehaviour.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CloseBehaviour[] newArray(int i) {
            return new CloseBehaviour[i];
        }
    }

    static {
        CloseBehaviour closeBehaviour = new CloseBehaviour("FINISH", 0);
        FINISH = closeBehaviour;
        CloseBehaviour closeBehaviour2 = new CloseBehaviour("BACK", 1);
        BACK = closeBehaviour2;
        CloseBehaviour[] closeBehaviourArr = {closeBehaviour, closeBehaviour2};
        $VALUES = closeBehaviourArr;
        $ENTRIES = new asp(closeBehaviourArr);
        CREATOR = new a();
    }

    public CloseBehaviour() {
        throw null;
    }

    public static CloseBehaviour valueOf(String str) {
        return (CloseBehaviour) Enum.valueOf(CloseBehaviour.class, str);
    }

    public static CloseBehaviour[] values() {
        return (CloseBehaviour[]) $VALUES.clone();
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
