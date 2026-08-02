package com.vk.clips.upload.vk.ui.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.io.File;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;

/* compiled from: ClipsUploadUiVkNavigator.kt */
/* loaded from: classes17.dex */
public interface ClipsUploadUiVkNavigator {

    /* compiled from: ClipsUploadUiVkNavigator.kt */
    public static final class ClipUploadDataCompact implements Parcelable {
        public static final Parcelable.Creator<ClipUploadDataCompact> CREATOR = new a();
        public final String b;
        public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint c;
        public final File d;
        public final UserId e;
        public final VideoToClipInfo f;
        public final ClipUploadScreenRuntimeConfig g;

        /* compiled from: ClipsUploadUiVkNavigator.kt */
        public static final class a implements Parcelable.Creator<ClipUploadDataCompact> {
            @Override // android.os.Parcelable.Creator
            public final ClipUploadDataCompact createFromParcel(Parcel parcel) {
                return new ClipUploadDataCompact(parcel.readString(), MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.valueOf(parcel.readString()), (File) parcel.readSerializable(), (UserId) parcel.readParcelable(ClipUploadDataCompact.class.getClassLoader()), (VideoToClipInfo) parcel.readParcelable(ClipUploadDataCompact.class.getClassLoader()), ClipUploadScreenRuntimeConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ClipUploadDataCompact[] newArray(int i) {
                return new ClipUploadDataCompact[i];
            }
        }

        public ClipUploadDataCompact(String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, File file, UserId userId, VideoToClipInfo videoToClipInfo, ClipUploadScreenRuntimeConfig clipUploadScreenRuntimeConfig) {
            this.b = str;
            this.c = creationEntryPoint;
            this.d = file;
            this.e = userId;
            this.f = videoToClipInfo;
            this.g = clipUploadScreenRuntimeConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClipUploadDataCompact)) {
                return false;
            }
            ClipUploadDataCompact clipUploadDataCompact = (ClipUploadDataCompact) obj;
            return epx.f(this.b, clipUploadDataCompact.b) && this.c == clipUploadDataCompact.c && epx.f(this.d, clipUploadDataCompact.d) && epx.f(this.e, clipUploadDataCompact.e) && epx.f(this.f, clipUploadDataCompact.f) && epx.f(this.g, clipUploadDataCompact.g);
        }

        public final int hashCode() {
            String str = this.b;
            int a2 = bh10.a((this.d.hashCode() + ((this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31, this.e.b);
            VideoToClipInfo videoToClipInfo = this.f;
            return this.g.hashCode() + ((a2 + (videoToClipInfo != null ? videoToClipInfo.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ClipUploadDataCompact(description=" + this.b + ", entryPoint=" + this.c + ", videoFile=" + this.d + ", authorId=" + this.e + ", videoToClipInfo=" + this.f + ", runtimeConfig=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeSerializable(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            this.g.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ClipsUploadUiVkNavigator.kt */
    public static final class ClipUploadDataFull implements Parcelable {
        public static final Parcelable.Creator<ClipUploadDataFull> CREATOR = new a();
        public final ClipUploadData b;
        public final boolean c;
        public final ClipUploadScreenRuntimeConfig d;

        /* compiled from: ClipsUploadUiVkNavigator.kt */
        public static final class a implements Parcelable.Creator<ClipUploadDataFull> {
            @Override // android.os.Parcelable.Creator
            public final ClipUploadDataFull createFromParcel(Parcel parcel) {
                return new ClipUploadDataFull(ClipUploadData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, ClipUploadScreenRuntimeConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ClipUploadDataFull[] newArray(int i) {
                return new ClipUploadDataFull[i];
            }
        }

        public ClipUploadDataFull(ClipUploadData clipUploadData, boolean z, ClipUploadScreenRuntimeConfig clipUploadScreenRuntimeConfig) {
            this.b = clipUploadData;
            this.c = z;
            this.d = clipUploadScreenRuntimeConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClipUploadDataFull)) {
                return false;
            }
            ClipUploadDataFull clipUploadDataFull = (ClipUploadDataFull) obj;
            return epx.f(this.b, clipUploadDataFull.b) && this.c == clipUploadDataFull.c && epx.f(this.d, clipUploadDataFull.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "ClipUploadDataFull(uploadData=" + this.b + ", fromTemplatesEditor=" + this.c + ", runtimeConfig=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            this.d.writeToParcel(parcel, i);
        }
    }

    void a(Context context, Integer num, ClipUploadDataFull clipUploadDataFull);

    void b(Context context, Integer num, ClipUploadDataCompact clipUploadDataCompact);

    /* compiled from: ClipsUploadUiVkNavigator.kt */
    public static final class a {
        private static final ClipsUploadUiVkNavigator STUB = new C0700a();

        public static ClipsUploadUiVkNavigator a() {
            return STUB;
        }

        /* compiled from: ClipsUploadUiVkNavigator.kt */
        /* renamed from: com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator$a$a, reason: collision with other inner class name */
        public static final class C0700a implements ClipsUploadUiVkNavigator {
            @Override // com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator
            public final void a(Context context, Integer num, ClipUploadDataFull clipUploadDataFull) {
            }

            @Override // com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator
            public final void b(Context context, Integer num, ClipUploadDataCompact clipUploadDataCompact) {
            }
        }
    }
}
