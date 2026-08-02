package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.v0;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.c;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class ErrorResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new n(10);

    /* renamed from: a, reason: collision with root package name */
    public final ErrorCode f4794a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4795b;

    public ErrorResponseData(int i5, String str) {
        ErrorCode errorCode;
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
            errorCode = values[i10];
            if (i5 == errorCode.f4793a) {
                break;
            } else {
                i10++;
            }
        }
        this.f4794a = errorCode;
        this.f4795b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return v.k(this.f4794a, errorResponseData.f4794a) && v.k(this.f4795b, errorResponseData.f4795b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4794a, this.f4795b});
    }

    public final String toString() {
        v0 c2 = k7.a.c(this);
        String valueOf = String.valueOf(this.f4794a.f4793a);
        c cVar = new c(26, false);
        ((v0) c2.f366d).f366d = cVar;
        c2.f366d = cVar;
        cVar.f365c = valueOf;
        cVar.f364b = "errorCode";
        String str = this.f4795b;
        if (str != null) {
            c2.a0(str, "errorMessage");
        }
        return c2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        int i10 = this.f4794a.f4793a;
        b.U(parcel, 2, 4);
        parcel.writeInt(i10);
        b.O(parcel, 3, this.f4795b, false);
        b.W(parcel, V);
    }
}
