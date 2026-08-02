package com.vk.auth.utils;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPassportHelper.kt */
/* loaded from: classes15.dex */
public final class VkPassportPage implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkPassportPage[] $VALUES;
    public static final Parcelable.Creator<VkPassportPage> CREATOR;
    public static final VkPassportPage PAGE_PERSONAL;
    public static final VkPassportPage PAGE_SECURITY;
    public static final VkPassportPage PAGE_SERVICES;
    public static final VkPassportPage PAGE_SUBSCRIPTION;
    public static final VkPassportPage PAGE_VK_PAY;
    private String page;

    /* compiled from: VkPassportHelper.kt */
    public static final class a implements Parcelable.Creator<VkPassportPage> {
        @Override // android.os.Parcelable.Creator
        public final VkPassportPage createFromParcel(Parcel parcel) {
            return VkPassportPage.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkPassportPage[] newArray(int i) {
            return new VkPassportPage[i];
        }
    }

    static {
        VkPassportPage vkPassportPage = new VkPassportPage("PAGE_SECURITY", 0, "security");
        PAGE_SECURITY = vkPassportPage;
        VkPassportPage vkPassportPage2 = new VkPassportPage("PAGE_PERSONAL", 1, "personal");
        PAGE_PERSONAL = vkPassportPage2;
        VkPassportPage vkPassportPage3 = new VkPassportPage("PAGE_VK_PAY", 2, "vkpay");
        PAGE_VK_PAY = vkPassportPage3;
        VkPassportPage vkPassportPage4 = new VkPassportPage("PAGE_SUBSCRIPTION", 3, "subs");
        PAGE_SUBSCRIPTION = vkPassportPage4;
        VkPassportPage vkPassportPage5 = new VkPassportPage("PAGE_SERVICES", 4, "services");
        PAGE_SERVICES = vkPassportPage5;
        VkPassportPage[] vkPassportPageArr = {vkPassportPage, vkPassportPage2, vkPassportPage3, vkPassportPage4, vkPassportPage5};
        $VALUES = vkPassportPageArr;
        $ENTRIES = new asp(vkPassportPageArr);
        CREATOR = new a();
    }

    public VkPassportPage(String str, int i, String str2) {
        this.page = str2;
    }

    public static VkPassportPage valueOf(String str) {
        return (VkPassportPage) Enum.valueOf(VkPassportPage.class, str);
    }

    public static VkPassportPage[] values() {
        return (VkPassportPage[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.page;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
