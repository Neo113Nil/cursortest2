package com.vk.video.polls.entrypoint.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UxPollProject.kt */
/* loaded from: classes6.dex */
public final class UxPollProject implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UxPollProject[] $VALUES;
    public static final Parcelable.Creator<UxPollProject> CREATOR;
    public static final UxPollProject VkVideo;
    private final String id = "vk_video_qoe";

    /* compiled from: UxPollProject.kt */
    public static final class a implements Parcelable.Creator<UxPollProject> {
        @Override // android.os.Parcelable.Creator
        public final UxPollProject createFromParcel(Parcel parcel) {
            return UxPollProject.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollProject[] newArray(int i) {
            return new UxPollProject[i];
        }
    }

    static {
        UxPollProject uxPollProject = new UxPollProject();
        VkVideo = uxPollProject;
        UxPollProject[] uxPollProjectArr = {uxPollProject};
        $VALUES = uxPollProjectArr;
        $ENTRIES = new asp(uxPollProjectArr);
        CREATOR = new a();
    }

    public static UxPollProject valueOf(String str) {
        return (UxPollProject) Enum.valueOf(UxPollProject.class, str);
    }

    public static UxPollProject[] values() {
        return (UxPollProject[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
