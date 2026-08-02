package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.lmn;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public class ErrorResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();
    public final ErrorCode a;
    public final String b;

    public ErrorResponseData(int i, String str) {
        ErrorCode errorCode;
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
            errorCode = values[i2];
            if (i == errorCode.a) {
                break;
            } else {
                i2++;
            }
        }
        this.a = errorCode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return Objects.a(this.a, errorResponseData.a) && Objects.a(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        zzbi a = zzbj.a(this);
        String valueOf = String.valueOf(this.a.a);
        lmn lmnVar = new lmn(24, false);
        a.c.d = lmnVar;
        a.c = lmnVar;
        lmnVar.b = valueOf;
        lmnVar.c = IronSourceConstants.EVENTS_ERROR_CODE;
        String str = this.b;
        if (str != null) {
            a.a(str, "errorMessage");
        }
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        int i2 = this.a.a;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }
}
