package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new AccessToken(parcel);
            case 1:
                parcel.getClass();
                return new AuthenticationToken(parcel);
            case 2:
                parcel.getClass();
                return new AuthenticationTokenClaims(parcel);
            case 3:
                parcel.getClass();
                return new AuthenticationTokenHeader(parcel);
            case 4:
                parcel.getClass();
                return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            case 5:
                parcel.getClass();
                return new GraphRequest$ParcelableResourceWithMimeType(parcel);
            default:
                parcel.getClass();
                return new Profile(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AccessToken[i];
            case 1:
                return new AuthenticationToken[i];
            case 2:
                return new AuthenticationTokenClaims[i];
            case 3:
                return new AuthenticationTokenHeader[i];
            case 4:
                return new FacebookRequestError[i];
            case 5:
                return new GraphRequest$ParcelableResourceWithMimeType[i];
            default:
                return new Profile[i];
        }
    }
}
