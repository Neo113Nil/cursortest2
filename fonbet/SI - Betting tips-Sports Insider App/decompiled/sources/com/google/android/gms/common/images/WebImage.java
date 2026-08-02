package com.google.android.gms.common.images;

import a3.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new a(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f4490a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4493d;

    public WebImage(int i5, Uri uri, int i10, int i11) {
        this.f4490a = i5;
        this.f4491b = uri;
        this.f4492c = i10;
        this.f4493d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (v.k(this.f4491b, webImage.f4491b) && this.f4492c == webImage.f4492c && this.f4493d == webImage.f4493d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4491b, Integer.valueOf(this.f4492c), Integer.valueOf(this.f4493d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.f4492c + "x" + this.f4493d + " " + this.f4491b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4490a);
        b.N(parcel, 2, this.f4491b, i5, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4492c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4493d);
        b.W(parcel, V);
    }
}
