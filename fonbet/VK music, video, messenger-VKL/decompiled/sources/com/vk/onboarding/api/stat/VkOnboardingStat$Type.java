package com.vk.onboarding.api.stat;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboardingStat.kt */
/* loaded from: classes4.dex */
public final class VkOnboardingStat$Type implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOnboardingStat$Type[] $VALUES;
    public static final VkOnboardingStat$Type Animation;
    public static final VkOnboardingStat$Type Banner;
    public static final Parcelable.Creator<VkOnboardingStat$Type> CREATOR;
    public static final VkOnboardingStat$Type Fullscreen;
    public static final VkOnboardingStat$Type Highlighter;
    public static final VkOnboardingStat$Type Toast;
    public static final VkOnboardingStat$Type Tooltip;

    /* compiled from: VkOnboardingStat.kt */
    public static final class a implements Parcelable.Creator<VkOnboardingStat$Type> {
        @Override // android.os.Parcelable.Creator
        public final VkOnboardingStat$Type createFromParcel(Parcel parcel) {
            return VkOnboardingStat$Type.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkOnboardingStat$Type[] newArray(int i) {
            return new VkOnboardingStat$Type[i];
        }
    }

    static {
        VkOnboardingStat$Type vkOnboardingStat$Type = new VkOnboardingStat$Type("Banner", 0);
        Banner = vkOnboardingStat$Type;
        VkOnboardingStat$Type vkOnboardingStat$Type2 = new VkOnboardingStat$Type("Tooltip", 1);
        Tooltip = vkOnboardingStat$Type2;
        VkOnboardingStat$Type vkOnboardingStat$Type3 = new VkOnboardingStat$Type("Fullscreen", 2);
        Fullscreen = vkOnboardingStat$Type3;
        VkOnboardingStat$Type vkOnboardingStat$Type4 = new VkOnboardingStat$Type("Toast", 3);
        Toast = vkOnboardingStat$Type4;
        VkOnboardingStat$Type vkOnboardingStat$Type5 = new VkOnboardingStat$Type("Highlighter", 4);
        Highlighter = vkOnboardingStat$Type5;
        VkOnboardingStat$Type vkOnboardingStat$Type6 = new VkOnboardingStat$Type("Animation", 5);
        Animation = vkOnboardingStat$Type6;
        VkOnboardingStat$Type[] vkOnboardingStat$TypeArr = {vkOnboardingStat$Type, vkOnboardingStat$Type2, vkOnboardingStat$Type3, vkOnboardingStat$Type4, vkOnboardingStat$Type5, vkOnboardingStat$Type6};
        $VALUES = vkOnboardingStat$TypeArr;
        $ENTRIES = new asp(vkOnboardingStat$TypeArr);
        CREATOR = new a();
    }

    public VkOnboardingStat$Type() {
        throw null;
    }

    public static VkOnboardingStat$Type valueOf(String str) {
        return (VkOnboardingStat$Type) Enum.valueOf(VkOnboardingStat$Type.class, str);
    }

    public static VkOnboardingStat$Type[] values() {
        return (VkOnboardingStat$Type[]) $VALUES.clone();
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
