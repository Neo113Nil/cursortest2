package com.vk.clips.attachments.api.publish.cta;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsInvolvementType.kt */
/* loaded from: classes16.dex */
public final class ClipsInvolvementType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsInvolvementType[] $VALUES;
    public static final Parcelable.Creator<ClipsInvolvementType> CREATOR;
    public static final ClipsInvolvementType DONUT_LEVEL;
    public static final ClipsInvolvementType MESSAGE_TO_BC;
    public static final ClipsInvolvementType ONLINE_BOOKING;
    public static final ClipsInvolvementType OPEN_CHANNEL;
    public static final ClipsInvolvementType VK_TICKET;
    private final String type;

    /* compiled from: ClipsInvolvementType.kt */
    public static final class a implements Parcelable.Creator<ClipsInvolvementType> {
        @Override // android.os.Parcelable.Creator
        public final ClipsInvolvementType createFromParcel(Parcel parcel) {
            return ClipsInvolvementType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsInvolvementType[] newArray(int i) {
            return new ClipsInvolvementType[i];
        }
    }

    static {
        ClipsInvolvementType clipsInvolvementType = new ClipsInvolvementType("MESSAGE_TO_BC", 0, "message_to_bc");
        MESSAGE_TO_BC = clipsInvolvementType;
        ClipsInvolvementType clipsInvolvementType2 = new ClipsInvolvementType("ONLINE_BOOKING", 1, "online_booking");
        ONLINE_BOOKING = clipsInvolvementType2;
        ClipsInvolvementType clipsInvolvementType3 = new ClipsInvolvementType("OPEN_CHANNEL", 2, "open_channel");
        OPEN_CHANNEL = clipsInvolvementType3;
        ClipsInvolvementType clipsInvolvementType4 = new ClipsInvolvementType("DONUT_LEVEL", 3, "donut_level_id");
        DONUT_LEVEL = clipsInvolvementType4;
        ClipsInvolvementType clipsInvolvementType5 = new ClipsInvolvementType("VK_TICKET", 4, "vk_ticket");
        VK_TICKET = clipsInvolvementType5;
        ClipsInvolvementType[] clipsInvolvementTypeArr = {clipsInvolvementType, clipsInvolvementType2, clipsInvolvementType3, clipsInvolvementType4, clipsInvolvementType5};
        $VALUES = clipsInvolvementTypeArr;
        $ENTRIES = new asp(clipsInvolvementTypeArr);
        CREATOR = new a();
    }

    public ClipsInvolvementType(String str, int i, String str2) {
        this.type = str2;
    }

    public static zrp<ClipsInvolvementType> i() {
        return $ENTRIES;
    }

    public static ClipsInvolvementType valueOf(String str) {
        return (ClipsInvolvementType) Enum.valueOf(ClipsInvolvementType.class, str);
    }

    public static ClipsInvolvementType[] values() {
        return (ClipsInvolvementType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
