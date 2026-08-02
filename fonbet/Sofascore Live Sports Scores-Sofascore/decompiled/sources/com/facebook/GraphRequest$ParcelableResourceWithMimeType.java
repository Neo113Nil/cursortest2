package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType", "Landroid/os/Parcelable;", "RESOURCE", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphRequest$ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GraphRequest$ParcelableResourceWithMimeType<?>> CREATOR = new a(5);
    public final String a;
    public final Parcelable b;

    public GraphRequest$ParcelableResourceWithMimeType(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readParcelable(w.a().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcelable parcelable) {
        this.a = "image/png";
        this.b = parcelable;
    }
}
