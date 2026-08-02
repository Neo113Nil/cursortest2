package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d1c;
import defpackage.mok;
import defpackage.om9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new d1c(5);
    public final Object b;
    public om9 c;
    public final Object a = new Object();
    public mok d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, d dVar) {
        this.b = parcelable;
        this.c = dVar;
    }

    public final om9 a() {
        om9 om9Var;
        synchronized (this.a) {
            om9Var = this.c;
        }
        return om9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).b;
        Object obj3 = this.b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b, i);
    }
}
