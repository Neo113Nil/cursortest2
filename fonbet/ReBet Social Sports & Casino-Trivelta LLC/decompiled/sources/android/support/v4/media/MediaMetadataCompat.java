package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import z.C6900a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    private static final String[] PREFERRED_BITMAP_ORDER;
    private static final String[] PREFERRED_DESCRIPTION_ORDER;
    private static final String[] PREFERRED_URI_ORDER;

    /* renamed from: b, reason: collision with root package name */
    public static final C6900a f16286b;

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f16287a;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C6900a c6900a = new C6900a();
        f16286b = c6900a;
        c6900a.put("android.media.metadata.TITLE", 1);
        c6900a.put("android.media.metadata.ARTIST", 1);
        c6900a.put("android.media.metadata.DURATION", 0);
        c6900a.put("android.media.metadata.ALBUM", 1);
        c6900a.put("android.media.metadata.AUTHOR", 1);
        c6900a.put("android.media.metadata.WRITER", 1);
        c6900a.put("android.media.metadata.COMPOSER", 1);
        c6900a.put("android.media.metadata.COMPILATION", 1);
        c6900a.put("android.media.metadata.DATE", 1);
        c6900a.put("android.media.metadata.YEAR", 0);
        c6900a.put("android.media.metadata.GENRE", 1);
        c6900a.put("android.media.metadata.TRACK_NUMBER", 0);
        c6900a.put("android.media.metadata.NUM_TRACKS", 0);
        c6900a.put("android.media.metadata.DISC_NUMBER", 0);
        c6900a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c6900a.put("android.media.metadata.ART", 2);
        c6900a.put("android.media.metadata.ART_URI", 1);
        c6900a.put("android.media.metadata.ALBUM_ART", 2);
        c6900a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c6900a.put("android.media.metadata.USER_RATING", 3);
        c6900a.put("android.media.metadata.RATING", 3);
        c6900a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c6900a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c6900a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c6900a.put("android.media.metadata.DISPLAY_ICON", 2);
        c6900a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c6900a.put("android.media.metadata.MEDIA_ID", 1);
        c6900a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c6900a.put("android.media.metadata.MEDIA_URI", 1);
        c6900a.put("android.media.metadata.ADVERTISEMENT", 0);
        c6900a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        PREFERRED_DESCRIPTION_ORDER = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        PREFERRED_BITMAP_ORDER = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        PREFERRED_URI_ORDER = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f16287a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f16287a);
    }
}
