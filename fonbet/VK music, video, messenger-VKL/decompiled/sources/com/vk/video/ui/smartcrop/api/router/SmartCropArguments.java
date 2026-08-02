package com.vk.video.ui.smartcrop.api.router;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.libvideo.models.videofile.VideoFilePlaybackDo;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: SmartCropArguments.kt */
/* loaded from: classes7.dex */
public final class SmartCropArguments implements Parcelable {
    public static final Parcelable.Creator<SmartCropArguments> CREATOR = new a();
    public final VideoFilePlaybackDo b;
    public final EntryPoint c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SmartCropArguments.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint VIDEO_BOTTOM_SHEET;
        public static final EntryPoint VIDEO_EDIT;

        static {
            EntryPoint entryPoint = new EntryPoint("VIDEO_BOTTOM_SHEET", 0);
            VIDEO_BOTTOM_SHEET = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("VIDEO_EDIT", 1);
            VIDEO_EDIT = entryPoint2;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        public EntryPoint() {
            throw null;
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: SmartCropArguments.kt */
    public static final class a implements Parcelable.Creator<SmartCropArguments> {
        @Override // android.os.Parcelable.Creator
        public final SmartCropArguments createFromParcel(Parcel parcel) {
            return new SmartCropArguments((VideoFilePlaybackDo) parcel.readParcelable(SmartCropArguments.class.getClassLoader()), EntryPoint.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SmartCropArguments[] newArray(int i) {
            return new SmartCropArguments[i];
        }
    }

    public SmartCropArguments(VideoFilePlaybackDo videoFilePlaybackDo, EntryPoint entryPoint) {
        this.b = videoFilePlaybackDo;
        this.c = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartCropArguments)) {
            return false;
        }
        SmartCropArguments smartCropArguments = (SmartCropArguments) obj;
        return epx.f(this.b, smartCropArguments.b) && this.c == smartCropArguments.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SmartCropArguments(videoFile=" + this.b + ", entryPoint=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }
}
