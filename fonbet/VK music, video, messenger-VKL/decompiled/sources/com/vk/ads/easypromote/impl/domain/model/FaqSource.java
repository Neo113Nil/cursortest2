package com.vk.ads.easypromote.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EasyPromoteAction.kt */
/* loaded from: classes14.dex */
public final class FaqSource implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaqSource[] $VALUES;
    public static final FaqSource BUDGET;
    public static final Parcelable.Creator<FaqSource> CREATOR;
    public static final FaqSource DURATION;

    /* compiled from: EasyPromoteAction.kt */
    public static final class a implements Parcelable.Creator<FaqSource> {
        @Override // android.os.Parcelable.Creator
        public final FaqSource createFromParcel(Parcel parcel) {
            return FaqSource.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaqSource[] newArray(int i) {
            return new FaqSource[i];
        }
    }

    static {
        FaqSource faqSource = new FaqSource("BUDGET", 0);
        BUDGET = faqSource;
        FaqSource faqSource2 = new FaqSource("DURATION", 1);
        DURATION = faqSource2;
        FaqSource[] faqSourceArr = {faqSource, faqSource2};
        $VALUES = faqSourceArr;
        $ENTRIES = new asp(faqSourceArr);
        CREATOR = new a();
    }

    public FaqSource() {
        throw null;
    }

    public static FaqSource valueOf(String str) {
        return (FaqSource) Enum.valueOf(FaqSource.class, str);
    }

    public static FaqSource[] values() {
        return (FaqSource[]) $VALUES.clone();
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
