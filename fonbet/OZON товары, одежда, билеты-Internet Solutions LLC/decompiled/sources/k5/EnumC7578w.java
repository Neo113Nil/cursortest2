package k5;

import androidx.annotation.NonNull;

/* renamed from: k5.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC7578w {
    READ_PHONE_STATE("android.permission.READ_PHONE_STATE"),
    READ_PHONE_NUMBERS("android.permission.READ_PHONE_NUMBERS"),
    ACCESS_FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
    ACCESS_COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
    QUERY_ALL_PACKAGES("android.permission.QUERY_ALL_PACKAGES"),
    DETECT_SCREEN_CAPTURE("android.permission.DETECT_SCREEN_CAPTURE"),
    READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
    READ_CONTACTS("android.permission.READ_CONTACTS"),
    GET_ACCOUNTS("android.permission.GET_ACCOUNTS");


    /* renamed from: transient, reason: not valid java name */
    @NonNull
    private final String f55transient;

    EnumC7578w(String str) {
        this.f55transient = str;
    }

    @NonNull
    public final String a() {
        return this.f55transient;
    }
}
