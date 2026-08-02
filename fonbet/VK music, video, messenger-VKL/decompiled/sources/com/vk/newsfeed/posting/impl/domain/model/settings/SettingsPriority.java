package com.vk.newsfeed.posting.impl.domain.model.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SettingsPriority.kt */
/* loaded from: classes4.dex */
public final class SettingsPriority implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SettingsPriority[] $VALUES;
    public static final Parcelable.Creator<SettingsPriority> CREATOR;
    public static final SettingsPriority Cache;
    public static final SettingsPriority Default;
    public static final SettingsPriority Network;
    private final int level;

    /* compiled from: SettingsPriority.kt */
    public static final class a implements Parcelable.Creator<SettingsPriority> {
        @Override // android.os.Parcelable.Creator
        public final SettingsPriority createFromParcel(Parcel parcel) {
            return SettingsPriority.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsPriority[] newArray(int i) {
            return new SettingsPriority[i];
        }
    }

    static {
        SettingsPriority settingsPriority = new SettingsPriority("Default", 0, 0);
        Default = settingsPriority;
        SettingsPriority settingsPriority2 = new SettingsPriority("Cache", 1, 1);
        Cache = settingsPriority2;
        SettingsPriority settingsPriority3 = new SettingsPriority(AndroidInitializeBoldSDK.MSG_NETWORK, 2, 2);
        Network = settingsPriority3;
        SettingsPriority[] settingsPriorityArr = {settingsPriority, settingsPriority2, settingsPriority3};
        $VALUES = settingsPriorityArr;
        $ENTRIES = new asp(settingsPriorityArr);
        CREATOR = new a();
    }

    public SettingsPriority(String str, int i, int i2) {
        this.level = i2;
    }

    public static SettingsPriority valueOf(String str) {
        return (SettingsPriority) Enum.valueOf(SettingsPriority.class, str);
    }

    public static SettingsPriority[] values() {
        return (SettingsPriority[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.level;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
