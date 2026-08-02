package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class H3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<H3> CREATOR;
    public static final H3 HTTP_ERROR;
    public static final H3 INITIALIZATION_ERROR;
    public static final H3 NETWORK_ERROR;
    public static final H3 SESSION_EXPIRED;
    public static final H3 UNKNOWN_ERROR;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ H3[] f39268a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f39269b;

    static {
        H3 h32 = new H3("NETWORK_ERROR", 0);
        NETWORK_ERROR = h32;
        H3 h33 = new H3("SESSION_EXPIRED", 1);
        SESSION_EXPIRED = h33;
        H3 h34 = new H3("INITIALIZATION_ERROR", 2);
        INITIALIZATION_ERROR = h34;
        H3 h35 = new H3("HTTP_ERROR", 3);
        HTTP_ERROR = h35;
        H3 h36 = new H3("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = h36;
        H3[] h3Arr = {h32, h33, h34, h35, h36};
        f39268a = h3Arr;
        f39269b = EnumEntriesKt.enumEntries(h3Arr);
        CREATOR = new Parcelable.Creator<H3>() { // from class: com.plaid.internal.H3.a
            @Override // android.os.Parcelable.Creator
            public final H3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return H3.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final H3[] newArray(int i10) {
                return new H3[i10];
            }
        };
    }

    public H3(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<H3> getEntries() {
        return f39269b;
    }

    public static H3 valueOf(String str) {
        return (H3) Enum.valueOf(H3.class, str);
    }

    public static H3[] values() {
        return (H3[]) f39268a.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
