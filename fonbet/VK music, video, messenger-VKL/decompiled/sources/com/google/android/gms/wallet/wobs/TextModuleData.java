package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.yg01;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextModuleData> CREATOR = new yg01();
    public final String b;
    public final String c;

    public TextModuleData(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.x(w, parcel);
    }
}
