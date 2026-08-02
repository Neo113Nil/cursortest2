package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d1c;
import defpackage.hcc;
import defpackage.o4c;
import defpackage.p4c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new d1c(2);
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;
    public final Bundle g;
    public final Uri h;
    public MediaDescription i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.g = bundle;
        this.h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String g = o4c.g(mediaDescription);
        CharSequence i = o4c.i(mediaDescription);
        CharSequence h = o4c.h(mediaDescription);
        CharSequence c = o4c.c(mediaDescription);
        Bitmap e = o4c.e(mediaDescription);
        Uri f = o4c.f(mediaDescription);
        Bundle d = o4c.d(mediaDescription);
        if (d != null) {
            hcc.O(d);
            try {
                d.isEmpty();
            } catch (BadParcelableException unused) {
                d = null;
            }
        }
        Uri uri = d != null ? (Uri) d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && d.size() == 2) {
                bundle = null;
                if (uri == null) {
                    uri = p4c.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(g, i, h, c, e, f, bundle, uri);
                mediaDescriptionCompat.i = mediaDescription;
                return mediaDescriptionCompat;
            }
            d.remove("android.support.v4.media.description.MEDIA_URI");
            d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = d;
        if (uri == null) {
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(g, i, h, c, e, f, bundle, uri);
        mediaDescriptionCompat2.i = mediaDescription;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescription = this.i;
        if (mediaDescription == null) {
            MediaDescription.Builder b = o4c.b();
            o4c.n(b, this.a);
            o4c.p(b, this.b);
            o4c.o(b, this.c);
            o4c.j(b, this.d);
            o4c.l(b, this.e);
            o4c.m(b, this.f);
            o4c.k(b, this.g);
            p4c.b(b, this.h);
            mediaDescription = o4c.a(b);
            this.i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
