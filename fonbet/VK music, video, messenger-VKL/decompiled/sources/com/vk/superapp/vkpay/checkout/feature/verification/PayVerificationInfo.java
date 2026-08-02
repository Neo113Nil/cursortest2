package com.vk.superapp.vkpay.checkout.feature.verification;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: PayVerificationInfo.kt */
/* loaded from: classes6.dex */
public final class PayVerificationInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<PayVerificationInfo> CREATOR = new a();
    public boolean b;
    public Integer c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PayVerificationInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PayVerificationInfo a(Serializer serializer) {
            return new PayVerificationInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayVerificationInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PayVerificationInfo() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        Integer num = this.c;
        if (num != null) {
            serializer.S(num.intValue());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayVerificationInfo)) {
            return false;
        }
        PayVerificationInfo payVerificationInfo = (PayVerificationInfo) obj;
        return this.b == payVerificationInfo.b && epx.f(this.c, payVerificationInfo.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayVerificationInfo(isWrongPinState=");
        sb.append(this.b);
        sb.append(", attemptsLeft=");
        return uqi.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public PayVerificationInfo(boolean z, Integer num) {
        this.b = z;
        this.c = num;
    }

    public /* synthetic */ PayVerificationInfo(boolean z, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num);
    }

    public PayVerificationInfo(Serializer serializer) {
        this(serializer.m(), serializer.v());
    }
}
