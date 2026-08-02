package com.vk.music.bottomsheets.audiobook;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.DownloadingState;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AudioBookChapterBottomSheetLaunchPoint.kt */
/* loaded from: classes3.dex */
public interface AudioBookChapterBottomSheetLaunchPoint extends Parcelable {

    /* compiled from: AudioBookChapterBottomSheetLaunchPoint.kt */
    public static final class RemoveDownload implements AudioBookChapterBottomSheetLaunchPoint {
        public static final Parcelable.Creator<RemoveDownload> CREATOR = new a();
        public final int b;
        public final String c;
        public final Type d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AudioBookChapterBottomSheetLaunchPoint.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type CANCEL_DOWNLOAD;
            public static final Type DELETE_FILE;

            static {
                Type type = new Type("CANCEL_DOWNLOAD", 0);
                CANCEL_DOWNLOAD = type;
                Type type2 = new Type("DELETE_FILE", 1);
                DELETE_FILE = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        /* compiled from: AudioBookChapterBottomSheetLaunchPoint.kt */
        public static final class a implements Parcelable.Creator<RemoveDownload> {
            @Override // android.os.Parcelable.Creator
            public final RemoveDownload createFromParcel(Parcel parcel) {
                return new RemoveDownload(parcel.readInt(), parcel.readString(), Type.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final RemoveDownload[] newArray(int i) {
                return new RemoveDownload[i];
            }
        }

        public RemoveDownload(int i, String str, Type type) {
            this.b = i;
            this.c = str;
            this.d = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveDownload)) {
                return false;
            }
            RemoveDownload removeDownload = (RemoveDownload) obj;
            return this.b == removeDownload.b && epx.f(this.c, removeDownload.c) && this.d == removeDownload.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            return "RemoveDownload(audioBookId=" + this.b + ", chapterId=" + this.c + ", type=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d.name());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoveDownload(int i, String str, DownloadingState downloadingState) {
            this(i, str, r4);
            Type type;
            if (!(downloadingState instanceof DownloadingState.Downloading) && !downloadingState.equals(DownloadingState.PendingDownload.b)) {
                type = Type.DELETE_FILE;
            } else {
                type = Type.CANCEL_DOWNLOAD;
            }
        }
    }
}
