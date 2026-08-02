package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5282a;

    public /* synthetic */ v0(int i5) {
        this.f5282a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5282a) {
            case 0:
                int F0 = f3.x.F0(parcel);
                Bundle bundle = null;
                String str = null;
                boolean z5 = false;
                long j = 0;
                long j6 = 0;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        j = f3.x.x0(parcel, readInt);
                    } else if (c2 == 2) {
                        j6 = f3.x.x0(parcel, readInt);
                    } else if (c2 == 3) {
                        z5 = f3.x.r0(parcel, readInt);
                    } else if (c2 == 7) {
                        bundle = f3.x.M(parcel, readInt);
                    } else if (c2 != '\b') {
                        f3.x.B0(parcel, readInt);
                    } else {
                        str = f3.x.S(parcel, readInt);
                    }
                }
                f3.x.b0(parcel, F0);
                return new zzdd(j, j6, z5, bundle, str);
            default:
                int F02 = f3.x.F0(parcel);
                String str2 = null;
                int i5 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    char c8 = (char) readInt2;
                    if (c8 == 1) {
                        i5 = f3.x.v0(parcel, readInt2);
                    } else if (c8 == 2) {
                        str2 = f3.x.S(parcel, readInt2);
                    } else if (c8 != 3) {
                        f3.x.B0(parcel, readInt2);
                    } else {
                        intent = (Intent) f3.x.P(parcel, readInt2, Intent.CREATOR);
                    }
                }
                f3.x.b0(parcel, F02);
                return new zzdf(i5, intent, str2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f5282a) {
            case 0:
                return new zzdd[i5];
            default:
                return new zzdf[i5];
        }
    }
}
