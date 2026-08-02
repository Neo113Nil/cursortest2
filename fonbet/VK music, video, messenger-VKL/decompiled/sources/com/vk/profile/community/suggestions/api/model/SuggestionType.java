package com.vk.profile.community.suggestions.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestionType.kt */
/* loaded from: classes5.dex */
public final class SuggestionType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuggestionType[] $VALUES;
    public static final Parcelable.Creator<SuggestionType> CREATOR;
    public static final SuggestionType SIMILAR;

    /* compiled from: SuggestionType.kt */
    public static final class a implements Parcelable.Creator<SuggestionType> {
        @Override // android.os.Parcelable.Creator
        public final SuggestionType createFromParcel(Parcel parcel) {
            return SuggestionType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestionType[] newArray(int i) {
            return new SuggestionType[i];
        }
    }

    static {
        SuggestionType suggestionType = new SuggestionType("SIMILAR", 0);
        SIMILAR = suggestionType;
        SuggestionType[] suggestionTypeArr = {suggestionType};
        $VALUES = suggestionTypeArr;
        $ENTRIES = new asp(suggestionTypeArr);
        CREATOR = new a();
    }

    public SuggestionType() {
        throw null;
    }

    public static SuggestionType valueOf(String str) {
        return (SuggestionType) Enum.valueOf(SuggestionType.class, str);
    }

    public static SuggestionType[] values() {
        return (SuggestionType[]) $VALUES.clone();
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
