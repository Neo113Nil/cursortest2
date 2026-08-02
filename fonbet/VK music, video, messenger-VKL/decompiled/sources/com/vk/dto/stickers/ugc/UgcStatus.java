package com.vk.dto.stickers.ugc;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UgcStatus.kt */
/* loaded from: classes18.dex */
public final class UgcStatus implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UgcStatus[] $VALUES;
    public static final UgcStatus AGE_RESTRICTED;
    public static final UgcStatus BANNED;
    public static final UgcStatus CLAIMED;
    public static final Parcelable.Creator<UgcStatus> CREATOR;
    public static final a Companion;
    public static final UgcStatus DELETED;
    public static final UgcStatus OK;
    private final String typeName;

    /* compiled from: UgcStatus.kt */
    public static final class a {
    }

    /* compiled from: UgcStatus.kt */
    public static final class b implements Parcelable.Creator<UgcStatus> {
        @Override // android.os.Parcelable.Creator
        public final UgcStatus createFromParcel(Parcel parcel) {
            return UgcStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UgcStatus[] newArray(int i) {
            return new UgcStatus[i];
        }
    }

    static {
        UgcStatus ugcStatus = new UgcStatus("CLAIMED", 0, "claimed");
        CLAIMED = ugcStatus;
        UgcStatus ugcStatus2 = new UgcStatus("BANNED", 1, "banned");
        BANNED = ugcStatus2;
        UgcStatus ugcStatus3 = new UgcStatus("DELETED", 2, "deleted");
        DELETED = ugcStatus3;
        UgcStatus ugcStatus4 = new UgcStatus("AGE_RESTRICTED", 3, "age_restricted");
        AGE_RESTRICTED = ugcStatus4;
        UgcStatus ugcStatus5 = new UgcStatus("OK", 4, ApiUris.SCHEME_OK);
        OK = ugcStatus5;
        UgcStatus[] ugcStatusArr = {ugcStatus, ugcStatus2, ugcStatus3, ugcStatus4, ugcStatus5};
        $VALUES = ugcStatusArr;
        $ENTRIES = new asp(ugcStatusArr);
        Companion = new a();
        CREATOR = new b();
    }

    public UgcStatus(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static zrp<UgcStatus> i() {
        return $ENTRIES;
    }

    public static UgcStatus valueOf(String str) {
        return (UgcStatus) Enum.valueOf(UgcStatus.class, str);
    }

    public static UgcStatus[] values() {
        return (UgcStatus[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.typeName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
