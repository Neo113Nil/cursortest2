package com.vk.auth.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PasskeyAlternative.kt */
/* loaded from: classes15.dex */
public final class PasskeyAlternative implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PasskeyAlternative[] $VALUES;
    public static final Parcelable.Creator<PasskeyAlternative> CREATOR;
    public static final a Companion;
    public static final PasskeyAlternative METHOD_SELECTOR;
    public static final PasskeyAlternative PASSWORD;
    public static final PasskeyAlternative PASSWORD_ONLY;
    public static final PasskeyAlternative PHONE;
    public static final PasskeyAlternative RESTORE;

    /* compiled from: PasskeyAlternative.kt */
    public static final class a {
        public static PasskeyAlternative a(boolean z) {
            return z ? PasskeyAlternative.RESTORE : PasskeyAlternative.PHONE;
        }
    }

    /* compiled from: PasskeyAlternative.kt */
    public static final class b implements Parcelable.Creator<PasskeyAlternative> {
        @Override // android.os.Parcelable.Creator
        public final PasskeyAlternative createFromParcel(Parcel parcel) {
            return PasskeyAlternative.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PasskeyAlternative[] newArray(int i) {
            return new PasskeyAlternative[i];
        }
    }

    static {
        PasskeyAlternative passkeyAlternative = new PasskeyAlternative("PHONE", 0);
        PHONE = passkeyAlternative;
        PasskeyAlternative passkeyAlternative2 = new PasskeyAlternative("RESTORE", 1);
        RESTORE = passkeyAlternative2;
        PasskeyAlternative passkeyAlternative3 = new PasskeyAlternative("PASSWORD", 2);
        PASSWORD = passkeyAlternative3;
        PasskeyAlternative passkeyAlternative4 = new PasskeyAlternative("PASSWORD_ONLY", 3);
        PASSWORD_ONLY = passkeyAlternative4;
        PasskeyAlternative passkeyAlternative5 = new PasskeyAlternative("METHOD_SELECTOR", 4);
        METHOD_SELECTOR = passkeyAlternative5;
        PasskeyAlternative[] passkeyAlternativeArr = {passkeyAlternative, passkeyAlternative2, passkeyAlternative3, passkeyAlternative4, passkeyAlternative5};
        $VALUES = passkeyAlternativeArr;
        $ENTRIES = new asp(passkeyAlternativeArr);
        Companion = new a();
        CREATOR = new b();
    }

    public PasskeyAlternative() {
        throw null;
    }

    public static PasskeyAlternative valueOf(String str) {
        return (PasskeyAlternative) Enum.valueOf(PasskeyAlternative.class, str);
    }

    public static PasskeyAlternative[] values() {
        return (PasskeyAlternative[]) $VALUES.clone();
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
