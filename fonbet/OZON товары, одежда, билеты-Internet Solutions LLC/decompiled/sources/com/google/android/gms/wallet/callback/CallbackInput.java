package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "CallbackInputCreator")
/* loaded from: classes9.dex */
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackInput> CREATOR = new zzf();

    @SafeParcelable.Field(id = 1)
    int zzex;

    @SafeParcelable.Field(id = 2)
    byte[] zzey;

    public final class Builder {
        private Builder() {
        }

        public final CallbackInput build() {
            return CallbackInput.this;
        }

        public final Builder setCallbackType(int i11) {
            CallbackInput.this.zzex = i11;
            return this;
        }

        public final Builder setRequestBytes(byte[] bArr) {
            CallbackInput.this.zzey = bArr;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CallbackInput(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zzex = i11;
        this.zzey = bArr;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T extends AbstractSafeParcelable> T deserializeRequest(Parcelable.Creator<T> creator) {
        byte[] bArr = this.zzey;
        if (bArr == null) {
            return null;
        }
        return (T) SafeParcelableSerializer.deserializeFromBytes(bArr, creator);
    }

    public int getCallbackType() {
        return this.zzex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzex);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzey, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CallbackInput() {
    }
}
