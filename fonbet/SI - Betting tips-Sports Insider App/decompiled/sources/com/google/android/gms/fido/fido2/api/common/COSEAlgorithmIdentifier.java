package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import java.util.Arrays;
import y6.d;
import y6.e;
import y6.i;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new l(26);

    /* renamed from: a, reason: collision with root package name */
    public final Enum f4684a;

    /* JADX WARN: Multi-variable type inference failed */
    public COSEAlgorithmIdentifier(y6.a aVar) {
        this.f4684a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i5) {
        i iVar;
        if (i5 == -262) {
            iVar = i.RS1;
        } else {
            i[] values = i.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    for (e eVar : e.values()) {
                        if (eVar.f25673a == i5) {
                            iVar = eVar;
                        }
                    }
                    throw new d(d9.e.f(i5, "Algorithm with COSE value ", " not supported"));
                }
                i iVar2 = values[i10];
                if (iVar2.f25685a == i5) {
                    iVar = iVar2;
                    break;
                }
                i10++;
            }
        }
        return new COSEAlgorithmIdentifier(iVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, y6.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, y6.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f4684a.a() == ((COSEAlgorithmIdentifier) obj).f4684a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4684a});
    }

    public final String toString() {
        return c1.n("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f4684a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, y6.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f4684a.a());
    }
}
