package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingState.kt */
/* loaded from: classes4.dex */
public final class LoadingState implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadingState[] $VALUES;
    public static final Parcelable.Creator<LoadingState> CREATOR;
    public static final LoadingState ERROR;
    public static final LoadingState FINISHED;
    public static final LoadingState LOADING;
    public static final LoadingState NONE;

    /* compiled from: PostingState.kt */
    public static final class a implements Parcelable.Creator<LoadingState> {
        @Override // android.os.Parcelable.Creator
        public final LoadingState createFromParcel(Parcel parcel) {
            return LoadingState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LoadingState[] newArray(int i) {
            return new LoadingState[i];
        }
    }

    static {
        LoadingState loadingState = new LoadingState("ERROR", 0);
        ERROR = loadingState;
        LoadingState loadingState2 = new LoadingState("LOADING", 1);
        LOADING = loadingState2;
        LoadingState loadingState3 = new LoadingState("FINISHED", 2);
        FINISHED = loadingState3;
        LoadingState loadingState4 = new LoadingState("NONE", 3);
        NONE = loadingState4;
        LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
        $VALUES = loadingStateArr;
        $ENTRIES = new asp(loadingStateArr);
        CREATOR = new a();
    }

    public LoadingState() {
        throw null;
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) $VALUES.clone();
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
