package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f16269a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f16270b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f16271c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f16272d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f16273e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f16274f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f16275g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f16276h;

    /* renamed from: i, reason: collision with root package name */
    public MediaDescription f16277i;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f16278a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f16279b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f16280c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f16281d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap f16282e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f16283f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f16284g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f16285h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f16278a, this.f16279b, this.f16280c, this.f16281d, this.f16282e, this.f16283f, this.f16284g, this.f16285h);
        }

        public d b(CharSequence charSequence) {
            this.f16281d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f16284g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f16282e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f16283f = uri;
            return this;
        }

        public d f(String str) {
            this.f16278a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f16285h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f16280c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f16279b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16269a = str;
        this.f16270b = charSequence;
        this.f16271c = charSequence2;
        this.f16272d = charSequence3;
        this.f16273e = bitmap;
        this.f16274f = uri;
        this.f16275g = bundle;
        this.f16276h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle d10 = b.d(mediaDescription);
        if (d10 != null) {
            d10 = MediaSessionCompat.b(d10);
        }
        Uri uri = d10 != null ? (Uri) d10.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (!d10.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || d10.size() != 2) {
                d10.remove("android.support.v4.media.description.MEDIA_URI");
                d10.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            dVar.c(bundle);
            if (uri == null) {
                dVar.g(uri);
            } else {
                dVar.g(c.a(mediaDescription));
            }
            MediaDescriptionCompat a10 = dVar.a();
            a10.f16277i = mediaDescription;
            return a10;
        }
        bundle = d10;
        dVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a102 = dVar.a();
        a102.f16277i = mediaDescription;
        return a102;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f16277i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder b10 = b.b();
        b.n(b10, this.f16269a);
        b.p(b10, this.f16270b);
        b.o(b10, this.f16271c);
        b.j(b10, this.f16272d);
        b.l(b10, this.f16273e);
        b.m(b10, this.f16274f);
        b.k(b10, this.f16275g);
        c.b(b10, this.f16276h);
        MediaDescription a10 = b.a(b10);
        this.f16277i = a10;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f16270b) + ", " + ((Object) this.f16271c) + ", " + ((Object) this.f16272d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
