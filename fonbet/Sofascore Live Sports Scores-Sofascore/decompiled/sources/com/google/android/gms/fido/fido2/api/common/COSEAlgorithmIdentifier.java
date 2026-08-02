package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import defpackage.lnb;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new f();
    public final Algorithm a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    public COSEAlgorithmIdentifier(Algorithm algorithm) {
        this.a = algorithm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i) {
        RSAAlgorithm rSAAlgorithm;
        if (i == -262) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                        if (eC2Algorithm.a == i) {
                            rSAAlgorithm = eC2Algorithm;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(lnb.k(i, "Algorithm with COSE value ", " not supported"));
                }
                RSAAlgorithm rSAAlgorithm2 = values[i2];
                if (rSAAlgorithm2.a == i) {
                    rSAAlgorithm = rSAAlgorithm2;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.d() == ((COSEAlgorithmIdentifier) obj).a.d();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return lnb.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.d());
    }
}
