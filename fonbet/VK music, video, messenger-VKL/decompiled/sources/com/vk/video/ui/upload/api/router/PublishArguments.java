package com.vk.video.ui.upload.api.router;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PublishArguments.kt */
/* loaded from: classes7.dex */
public interface PublishArguments extends Parcelable {

    /* compiled from: PublishArguments.kt */
    public static final class Edit implements PublishArguments {
        public static final Parcelable.Creator<Edit> CREATOR = new a();
        public final String b;
        public final PreOpenedMenu c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PublishArguments.kt */
        public static final class PreOpenedMenu {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PreOpenedMenu[] $VALUES;
            public static final PreOpenedMenu PRIVACY_WATCH;

            static {
                PreOpenedMenu preOpenedMenu = new PreOpenedMenu("PRIVACY_WATCH", 0);
                PRIVACY_WATCH = preOpenedMenu;
                PreOpenedMenu[] preOpenedMenuArr = {preOpenedMenu};
                $VALUES = preOpenedMenuArr;
                $ENTRIES = new asp(preOpenedMenuArr);
            }

            public PreOpenedMenu() {
                throw null;
            }

            public static PreOpenedMenu valueOf(String str) {
                return (PreOpenedMenu) Enum.valueOf(PreOpenedMenu.class, str);
            }

            public static PreOpenedMenu[] values() {
                return (PreOpenedMenu[]) $VALUES.clone();
            }
        }

        /* compiled from: PublishArguments.kt */
        public static final class a implements Parcelable.Creator<Edit> {
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                return new Edit(parcel.readString(), parcel.readInt() == 0 ? null : PreOpenedMenu.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(String str, PreOpenedMenu preOpenedMenu) {
            this.b = str;
            this.c = preOpenedMenu;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj;
            return epx.f(this.b, edit.b) && this.c == edit.c;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            PreOpenedMenu preOpenedMenu = this.c;
            return hashCode + (preOpenedMenu == null ? 0 : preOpenedMenu.hashCode());
        }

        public final String toString() {
            return "Edit(videoId=" + this.b + ", menuToOpen=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            PreOpenedMenu preOpenedMenu = this.c;
            if (preOpenedMenu == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(preOpenedMenu.name());
            }
        }

        public /* synthetic */ Edit(String str, PreOpenedMenu preOpenedMenu, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : preOpenedMenu);
        }
    }

    /* compiled from: PublishArguments.kt */
    public static final class Upload implements PublishArguments {
        public static final Parcelable.Creator<Upload> CREATOR = new a();
        public final Uri b;
        public final VideoPublicationContext c;
        public final VideoAlbum d;

        /* compiled from: PublishArguments.kt */
        public static final class a implements Parcelable.Creator<Upload> {
            @Override // android.os.Parcelable.Creator
            public final Upload createFromParcel(Parcel parcel) {
                return new Upload((Uri) parcel.readParcelable(Upload.class.getClassLoader()), (VideoPublicationContext) parcel.readParcelable(Upload.class.getClassLoader()), (VideoAlbum) parcel.readParcelable(Upload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Upload[] newArray(int i) {
                return new Upload[i];
            }
        }

        public Upload(Uri uri, VideoPublicationContext videoPublicationContext, VideoAlbum videoAlbum) {
            this.b = uri;
            this.c = videoPublicationContext;
            this.d = videoAlbum;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Upload)) {
                return false;
            }
            Upload upload = (Upload) obj;
            return epx.f(this.b, upload.b) && epx.f(this.c, upload.c) && epx.f(this.d, upload.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            VideoAlbum videoAlbum = this.d;
            return hashCode + (videoAlbum == null ? 0 : videoAlbum.hashCode());
        }

        public final String toString() {
            return "Upload(videoPath=" + this.b + ", publicationContext=" + this.c + ", videoAlbum=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Upload(Uri uri, VideoPublicationContext videoPublicationContext, VideoAlbum videoAlbum, int i, zcl zclVar) {
            this(uri, (i & 2) != 0 ? new VideoPublicationContext(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : videoPublicationContext, (i & 4) != 0 ? null : videoAlbum);
        }
    }
}
