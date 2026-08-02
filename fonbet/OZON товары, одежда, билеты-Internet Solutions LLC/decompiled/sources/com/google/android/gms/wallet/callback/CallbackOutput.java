package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CallbackOutputCreator")
/* loaded from: classes9.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackOutput> CREATOR = new zzh();

    @SafeParcelable.Field(id = 1)
    int zzex;

    @SafeParcelable.Field(id = 2)
    int zzfa;

    @SafeParcelable.Field(id = 3)
    byte[] zzfb;

    @SafeParcelable.Field(id = 4)
    String zzfc;

    public final class zza {
        private zza() {
        }

        public final zza zza(byte[] bArr) {
            CallbackOutput.this.zzfb = bArr;
            return this;
        }

        public final zza zzb(int i11) {
            CallbackOutput.this.zzex = i11;
            return this;
        }

        public final zza zzc(int i11) {
            CallbackOutput.this.zzfa = i11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    CallbackOutput(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) String str) {
        this.zzex = i11;
        this.zzfa = i12;
        this.zzfb = bArr;
        this.zzfc = str;
    }

    public static zza zze() {
        return new zza();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzex);
        SafeParcelWriter.writeInt(parcel, 2, this.zzfa);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzfb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzfc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CallbackOutput() {
    }
}
