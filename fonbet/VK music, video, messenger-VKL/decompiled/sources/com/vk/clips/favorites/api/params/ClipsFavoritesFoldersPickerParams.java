package com.vk.clips.favorites.api.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.lq;
import xsna.ms9;

/* compiled from: ClipsFavoritesFoldersPickerParams.kt */
/* loaded from: classes16.dex */
public interface ClipsFavoritesFoldersPickerParams extends Parcelable {

    /* compiled from: ClipsFavoritesFoldersPickerParams.kt */
    public static final class PickFolderToAddVideo implements ClipsFavoritesFoldersPickerParams {
        public static final Parcelable.Creator<PickFolderToAddVideo> CREATOR = new a();
        public final boolean b;
        public final UserId c;
        public final VideoFile d;

        /* compiled from: ClipsFavoritesFoldersPickerParams.kt */
        public static final class a implements Parcelable.Creator<PickFolderToAddVideo> {
            @Override // android.os.Parcelable.Creator
            public final PickFolderToAddVideo createFromParcel(Parcel parcel) {
                return new PickFolderToAddVideo(parcel.readInt() != 0, (UserId) parcel.readParcelable(PickFolderToAddVideo.class.getClassLoader()), (VideoFile) parcel.readParcelable(PickFolderToAddVideo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PickFolderToAddVideo[] newArray(int i) {
                return new PickFolderToAddVideo[i];
            }
        }

        public PickFolderToAddVideo(boolean z, UserId userId, VideoFile videoFile) {
            this.b = z;
            this.c = userId;
            this.d = videoFile;
        }

        @Override // com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams
        public final boolean J0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickFolderToAddVideo)) {
                return false;
            }
            PickFolderToAddVideo pickFolderToAddVideo = (PickFolderToAddVideo) obj;
            return this.b == pickFolderToAddVideo.b && epx.f(this.c, pickFolderToAddVideo.c) && epx.f(this.d, pickFolderToAddVideo.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b);
        }

        @Override // com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams
        public final UserId q() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PickFolderToAddVideo(forceDarkTheme=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", videoFile=");
            return lq.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerParams.kt */
    public static final class PickFolderToMoveVideos implements ClipsFavoritesFoldersPickerParams {
        public static final Parcelable.Creator<PickFolderToMoveVideos> CREATOR = new a();
        public final boolean b;
        public final UserId c;
        public final FavoriteFolderId d;
        public final List<VideoFile> e;

        /* compiled from: ClipsFavoritesFoldersPickerParams.kt */
        public static final class a implements Parcelable.Creator<PickFolderToMoveVideos> {
            @Override // android.os.Parcelable.Creator
            public final PickFolderToMoveVideos createFromParcel(Parcel parcel) {
                int i = 0;
                boolean z = parcel.readInt() != 0;
                UserId userId = (UserId) parcel.readParcelable(PickFolderToMoveVideos.class.getClassLoader());
                FavoriteFolderId favoriteFolderId = (FavoriteFolderId) parcel.readParcelable(PickFolderToMoveVideos.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(PickFolderToMoveVideos.class, parcel, arrayList, i, 1);
                }
                return new PickFolderToMoveVideos(z, userId, favoriteFolderId, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final PickFolderToMoveVideos[] newArray(int i) {
                return new PickFolderToMoveVideos[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PickFolderToMoveVideos(boolean z, UserId userId, FavoriteFolderId favoriteFolderId, List<? extends VideoFile> list) {
            this.b = z;
            this.c = userId;
            this.d = favoriteFolderId;
            this.e = list;
        }

        @Override // com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams
        public final boolean J0() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickFolderToMoveVideos)) {
                return false;
            }
            PickFolderToMoveVideos pickFolderToMoveVideos = (PickFolderToMoveVideos) obj;
            return this.b == pickFolderToMoveVideos.b && epx.f(this.c, pickFolderToMoveVideos.c) && epx.f(this.d, pickFolderToMoveVideos.d) && epx.f(this.e, pickFolderToMoveVideos.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + bh10.a(Boolean.hashCode(this.b) * 31, 31, this.c.b)) * 31);
        }

        @Override // com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams
        public final UserId q() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PickFolderToMoveVideos(forceDarkTheme=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", sourceFolderId=");
            sb.append(this.d);
            sb.append(", videos=");
            return ms9.a(')', sb, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            Iterator a2 = ao.a(parcel, this.e);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    boolean J0();

    UserId q();
}
